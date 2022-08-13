package lab5_T;

import java.util.ArrayList;

public class Table<K, V> {
    class HashNode<K, V> {
        K key;
        V value;
        final int hashCode;
        HashNode<K, V> next;

        public HashNode(K key, V value, int hashCode)
        {
            this.key = key;
            this.value = value;
            this.hashCode = hashCode;
        }
    }

    ////////////////////////////////////////////////////////////
        private ArrayList<HashNode<K, V>> hashtable;
        private int num;
        private int size;
        private Hashfunction<K> hashfunction;

        public Table(int maxsize, Hashfunction<K> hash)
        {
            hashtable = new ArrayList<>();
            num = maxsize;
            size = 0;
            hashfunction = hash;

            for (int i = 0; i < num; i++)
                hashtable.add(null);
        }

        public int size() { return size; }
        public boolean isEmpty() { return size() == 0; }


        private int getIndex(K key)
        {
            int hashCode = hashfunction.hash(key);
            int index = hashCode % num;
            // key.hashCode() could be negative.
            index = index < 0 ? index * -1 : index;
            return index;
        }

        public V remove(K key)
        {
            int Index = getIndex(key);
            int hashCode = hashfunction.hash(key);
            HashNode<K, V> head = hashtable.get(Index);
            HashNode<K, V> prev = null;
            while (head != null) {
                if (head.key.equals(key) && hashCode == head.hashCode)
                    break;

                prev = head;
                head = head.next;
            }

            if (head == null)
                return null;
            size--;

            if (prev != null)
                prev.next = head.next;
            else
                hashtable.set(Index, head.next);

            return head.value;
        }

        public V get(K key)
        {
            int Index = getIndex(key);
            int hashCode = hashfunction.hash(key);

            HashNode<K, V> head = hashtable.get(Index);

            while (head != null) {
                if (head.key.equals(key) && head.hashCode == hashCode)
                    return head.value;
                head = head.next;
            }
            return null;
        }

        public void add(K key, V value)
        {
            int Index = getIndex(key);
            int hashCode = hashfunction.hash(key);
            HashNode<K, V> head = hashtable.get(Index);

            while (head != null) {
                if (head.key.equals(key) && head.hashCode == hashCode) {
                    head.value = value;
                    return;
                }
                head = head.next;
            }

            size++;
            head = hashtable.get(Index);
            HashNode<K, V> newNode = new HashNode<>(key, value, hashCode);
            newNode.next = head;
            hashtable.set(Index, newNode);
        }
    }
    ///////////////////////////////////////////////////////////
    abstract class Hashfunction<K> {
        public Hashfunction() {}

        abstract int hash(K s);
    }
    /////////////////////////////////////////////////////////////
    class PersonHF extends Hashfunction<String> {
        public PersonHF() {
        }

        @Override
        int hash(String s) {
            int counter = 0;
            char[] strInChars = s.toCharArray();

            for(int i = 0; i < s.length(); ++i) {
                counter += strInChars[i] * i;
            }
            return counter;
        }
    }

/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a7ebc
 */

pitem * pqueue_iterator(pqueue pq)

{
  return *(pitem **)pq;
}


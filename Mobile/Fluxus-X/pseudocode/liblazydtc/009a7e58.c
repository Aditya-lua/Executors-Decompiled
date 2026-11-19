/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a7e58
 */

pitem * pqueue_peek(pqueue pq)

{
  return *(pitem **)pq;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a7e60
 */

pitem * pqueue_pop(pqueue pq)

{
  pitem *ppVar1;
  
  ppVar1 = *(pitem **)pq;
  if (ppVar1 != (pitem *)0x0) {
    *(_pitem **)pq = ppVar1->next;
  }
  return ppVar1;
}


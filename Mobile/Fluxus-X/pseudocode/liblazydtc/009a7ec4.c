/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a7ec4
 */

pitem * pqueue_next(piterator *iter)

{
  pitem *ppVar1;
  
  ppVar1 = (pitem *)0x0;
  if ((iter != (piterator *)0x0) && (ppVar1 = *iter, ppVar1 != (piterator)0x0)) {
    *iter = ppVar1->next;
  }
  return ppVar1;
}


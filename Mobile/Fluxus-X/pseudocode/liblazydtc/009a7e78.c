/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a7e78
 */

pitem * pqueue_find(pqueue pq,uchar *prio64be)

{
  pitem *ppVar1;
  pitem *ppVar2;
  
  ppVar2 = *(pitem **)pq;
  if (*(pitem **)pq == (pitem *)0x0) {
    return (pitem *)0x0;
  }
  do {
    ppVar1 = ppVar2;
    ppVar2 = ppVar1->next;
    if (ppVar2 == (pitem *)0x0) goto LAB_009a7ea0;
  } while (*(long *)ppVar1->priority != *(long *)prio64be);
  ppVar2 = ppVar1;
LAB_009a7ea0:
  if (*(long *)ppVar1->priority != *(long *)prio64be) {
    ppVar1 = ppVar2;
  }
  return ppVar1;
}


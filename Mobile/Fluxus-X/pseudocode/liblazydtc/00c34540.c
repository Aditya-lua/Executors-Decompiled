/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c34540
 */

pitem * pqueue_insert(pqueue pq,pitem *item)

{
  pitem *ppVar1;
  
  ppVar1 = pqueue_insert(pq,item);
  return ppVar1;
}


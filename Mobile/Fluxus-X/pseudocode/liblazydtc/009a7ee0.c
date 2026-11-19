/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a7ee0
 */

int pqueue_size(pqueue pq)

{
  int iVar1;
  long lVar2;
  
  lVar2 = *(long *)pq;
  if (lVar2 == 0) {
    return 0;
  }
  iVar1 = 0;
  do {
    lVar2 = *(long *)(lVar2 + 0x10);
    iVar1 = iVar1 + 1;
  } while (lVar2 != 0);
  return iVar1;
}


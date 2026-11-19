/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ca8a0
 */

long ssl3_pending(long param_1)

{
  pitem *ppVar1;
  ulong uVar2;
  long *plVar3;
  long lVar4;
  pitem *local_28;
  
  lVar4 = 0;
  if (*(int *)(param_1 + 0xc64) != 0xf1) {
    lVar4 = 0;
    if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) != 0) {
      local_28 = pqueue_iterator(*(pqueue *)(*(long *)(param_1 + 0x1d10) + 0x50));
      ppVar1 = pqueue_next(&local_28);
      lVar4 = 0;
      while (ppVar1 != (pitem *)0x0) {
        lVar4 = *(long *)((long)ppVar1->data + 0x48) + lVar4;
        ppVar1 = pqueue_next(&local_28);
      }
    }
    if (*(ulong *)(param_1 + 0xc68) != 0) {
      uVar2 = 0;
      plVar3 = (long *)(param_1 + 0x12b0);
      do {
        if (*(int *)((long)plVar3 + -4) != 0x17) {
          return lVar4;
        }
        uVar2 = uVar2 + 1;
        lVar4 = *plVar3 + lVar4;
        plVar3 = plVar3 + 10;
      } while (uVar2 < *(ulong *)(param_1 + 0xc68));
    }
  }
  return lVar4;
}


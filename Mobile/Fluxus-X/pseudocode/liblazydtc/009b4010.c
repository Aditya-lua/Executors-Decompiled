/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b4010
 */

undefined8 SSL_has_pending(long param_1)

{
  int iVar1;
  pitem *ppVar2;
  undefined8 uVar3;
  pitem *local_18;
  
  if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) == 0) {
LAB_009b405c:
    iVar1 = RECORD_LAYER_processed_read_pending(param_1 + 0xc58);
    if (iVar1 == 0) {
      uVar3 = RECORD_LAYER_read_pending(param_1 + 0xc58);
      return uVar3;
    }
  }
  else {
    local_18 = pqueue_iterator(*(pqueue *)(*(long *)(param_1 + 0x1d10) + 0x50));
    do {
      ppVar2 = pqueue_next(&local_18);
      if (ppVar2 == (pitem *)0x0) goto LAB_009b405c;
    } while (*(long *)((long)ppVar2->data + 0x48) == 0);
  }
  return 1;
}


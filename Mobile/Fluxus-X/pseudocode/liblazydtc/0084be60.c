/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084be60
 */

void FUN_0084be60(long param_1)

{
  long lVar1;
  long lVar2;
  void *pvVar3;
  ulong uVar4;
  long lVar5;
  
  uVar4 = (*(long *)(param_1 + 0x28) + *(long *)(param_1 + 0x20)) - 1;
  lVar5 = *(long *)(*(long *)(param_1 + 8) + (uVar4 / 0x2a) * 8) + (uVar4 % 0x2a) * 0x60;
  pvVar3 = *(void **)(lVar5 + 0x38);
  if (pvVar3 != (void *)0x0) {
    *(void **)(lVar5 + 0x40) = pvVar3;
    operator_delete(pvVar3,*(long *)(lVar5 + 0x48) - (long)pvVar3);
  }
  pvVar3 = *(void **)(lVar5 + 0x20);
  if (pvVar3 != (void *)0x0) {
    *(void **)(lVar5 + 0x28) = pvVar3;
    operator_delete(pvVar3,*(long *)(lVar5 + 0x30) - (long)pvVar3);
  }
  lVar1 = *(long *)(param_1 + 0x10);
  lVar2 = *(long *)(param_1 + 0x28);
  lVar5 = 0;
  if (lVar1 != *(long *)(param_1 + 8)) {
    lVar5 = (lVar1 - *(long *)(param_1 + 8) >> 3) * 0x2a + -1;
  }
  *(long *)(param_1 + 0x28) = lVar2 + -1;
  if (0x53 < (lVar5 - (lVar2 + *(long *)(param_1 + 0x20))) + 1U) {
    operator_delete(*(void **)(lVar1 + -8),0xfc0);
    *(long *)(param_1 + 0x10) = *(long *)(param_1 + 0x10) + -8;
  }
  return;
}


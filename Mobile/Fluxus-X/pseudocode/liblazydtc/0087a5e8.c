/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087a5e8
 */

void FUN_0087a5e8(undefined8 *param_1)

{
  long lVar1;
  long lVar2;
  long lVar3;
  void *pvVar4;
  
  lVar1 = param_1[1];
  lVar3 = param_1[2];
  while (lVar2 = lVar3, lVar1 != lVar2) {
    param_1[2] = lVar2 + -0x20;
    lVar3 = lVar2 + -0x20;
    if ((*(byte *)(lVar2 + -0x18) & 1) != 0) {
      operator_delete(*(void **)(lVar2 + -8),*(ulong *)(lVar2 + -0x18) & 0xfffffffffffffffe);
      lVar3 = param_1[2];
    }
  }
  pvVar4 = (void *)*param_1;
  if (pvVar4 == (void *)0x0) {
    return;
  }
  operator_delete(pvVar4,param_1[3] - (long)pvVar4);
  return;
}


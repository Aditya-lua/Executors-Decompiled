/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00844ac8
 */

void FUN_00844ac8(undefined8 *param_1)

{
  long lVar1;
  void *pvVar2;
  long lVar3;
  
  lVar1 = param_1[1];
  lVar3 = param_1[2];
  while (lVar1 != lVar3) {
    pvVar2 = *(void **)(lVar3 + -0x28);
    param_1[2] = lVar3 + -0x60;
    if (pvVar2 != (void *)0x0) {
      *(void **)(lVar3 + -0x20) = pvVar2;
      operator_delete(pvVar2,*(long *)(lVar3 + -0x18) - (long)pvVar2);
    }
    pvVar2 = *(void **)(lVar3 + -0x40);
    if (pvVar2 != (void *)0x0) {
      *(void **)(lVar3 + -0x38) = pvVar2;
      operator_delete(pvVar2,*(long *)(lVar3 + -0x30) - (long)pvVar2);
    }
    lVar3 = param_1[2];
  }
  pvVar2 = (void *)*param_1;
  if (pvVar2 == (void *)0x0) {
    return;
  }
  operator_delete(pvVar2,param_1[3] - (long)pvVar2);
  return;
}


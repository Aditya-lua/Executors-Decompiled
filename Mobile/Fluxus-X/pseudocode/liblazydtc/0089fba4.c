/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089fba4
 */

void FUN_0089fba4(undefined8 *param_1)

{
  long lVar1;
  void *pvVar2;
  long lVar3;
  
  lVar1 = param_1[1];
  lVar3 = param_1[2];
  while (lVar1 != lVar3) {
    pvVar2 = *(void **)(lVar3 + -0x38);
    param_1[2] = (undefined8 *)(lVar3 + -0x38);
    if (pvVar2 != (void *)0x0) {
      operator_delete(pvVar2);
      *(undefined8 *)(lVar3 + -0x38) = 0;
      operator_delete(*(void **)(lVar3 + -0x20));
      *(undefined8 *)(lVar3 + -0x30) = 0;
      *(undefined8 *)(lVar3 + -0x28) = 0;
      *(undefined8 *)(lVar3 + -0x20) = 0;
      operator_delete((void *)0x0);
      *(undefined8 *)(lVar3 + -0x18) = 0;
      *(undefined1 *)(lVar3 + -8) = 0x40;
    }
    operator_delete(*(void **)(lVar3 + -0x20));
    lVar3 = param_1[2];
  }
  pvVar2 = (void *)*param_1;
  if (pvVar2 == (void *)0x0) {
    return;
  }
  operator_delete(pvVar2,param_1[3] - (long)pvVar2);
  return;
}


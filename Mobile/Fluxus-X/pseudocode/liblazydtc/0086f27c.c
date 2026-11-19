/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086f27c
 */

void FUN_0086f27c(undefined8 *param_1)

{
  long lVar1;
  long lVar2;
  void *pvVar3;
  undefined8 *puVar4;
  
  lVar1 = param_1[1];
  lVar2 = param_1[2];
  while (lVar1 != lVar2) {
    puVar4 = *(undefined8 **)(lVar2 + -0x30);
    param_1[2] = (undefined8 *)(lVar2 + -0x30);
    (*(code *)*puVar4)();
    lVar2 = param_1[2];
  }
  pvVar3 = (void *)*param_1;
  if (pvVar3 == (void *)0x0) {
    return;
  }
  operator_delete(pvVar3,param_1[3] - (long)pvVar3);
  return;
}


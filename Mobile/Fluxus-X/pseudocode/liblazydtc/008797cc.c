/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008797cc
 */

void FUN_008797cc(undefined8 *param_1)

{
  long lVar1;
  void *pvVar2;
  long lVar3;
  
  lVar1 = param_1[1];
  lVar3 = param_1[2];
  while (lVar1 != lVar3) {
    param_1[2] = lVar3 + -0x88;
    FUN_00873e90();
    lVar3 = param_1[2];
  }
  pvVar2 = (void *)*param_1;
  if (pvVar2 == (void *)0x0) {
    return;
  }
  operator_delete(pvVar2,param_1[3] - (long)pvVar2);
  return;
}


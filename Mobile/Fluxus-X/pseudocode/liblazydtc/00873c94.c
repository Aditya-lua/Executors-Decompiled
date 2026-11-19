/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00873c94
 */

void FUN_00873c94(undefined8 *param_1)

{
  void *pvVar1;
  void *pvVar2;
  void *pvVar3;
  
  pvVar3 = (void *)*param_1;
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar2 = (void *)param_1[1];
  pvVar1 = pvVar3;
  if (pvVar3 != pvVar2) {
    do {
      pvVar2 = (void *)((long)pvVar2 + -0x88);
      FUN_00873e90(pvVar2);
    } while (pvVar2 != pvVar3);
    pvVar1 = (void *)*param_1;
  }
  param_1[1] = pvVar3;
  operator_delete(pvVar1,param_1[2] - (long)pvVar1);
  return;
}


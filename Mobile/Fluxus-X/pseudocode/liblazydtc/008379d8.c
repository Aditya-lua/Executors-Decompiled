/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008379d8
 */

void FUN_008379d8(undefined8 *param_1)

{
  void *pvVar1;
  
  FUN_0083f3e8(param_1,param_1[2]);
  pvVar1 = (void *)*param_1;
  *param_1 = 0;
  if (pvVar1 == (void *)0x0) {
    return;
  }
  operator_delete(pvVar1,param_1[1] << 3);
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007ff3d4
 */

void FUN_007ff3d4(undefined8 *param_1)

{
  long lVar1;
  void *pvVar2;
  
  lVar1 = param_1[1] - param_1[2];
  if (lVar1 != 0) {
    param_1[2] = param_1[2] + (lVar1 + 7U & 0xfffffffffffffff8);
  }
  pvVar2 = (void *)*param_1;
  if (pvVar2 == (void *)0x0) {
    return;
  }
  operator_delete(pvVar2,param_1[3] - (long)pvVar2);
  return;
}


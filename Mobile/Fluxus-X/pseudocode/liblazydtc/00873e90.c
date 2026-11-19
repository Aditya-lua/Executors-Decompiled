/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00873e90
 */

void FUN_00873e90(ulong *param_1)

{
  byte bVar1;
  void *pvVar2;
  
  if ((param_1[0xe] & 1) != 0) {
    operator_delete((void *)param_1[0x10],param_1[0xe] & 0xfffffffffffffffe);
  }
  pvVar2 = (void *)param_1[0xb];
  if (pvVar2 != (void *)0x0) {
    param_1[0xc] = (ulong)pvVar2;
    operator_delete(pvVar2,param_1[0xd] - (long)pvVar2);
  }
  if ((param_1[8] & 1) == 0) {
    bVar1 = (byte)param_1[5];
  }
  else {
    operator_delete((void *)param_1[10],param_1[8] & 0xfffffffffffffffe);
    bVar1 = (byte)param_1[5];
  }
  if ((bVar1 & 1) == 0) {
    bVar1 = (byte)*param_1;
  }
  else {
    operator_delete((void *)param_1[7],param_1[5] & 0xfffffffffffffffe);
    bVar1 = (byte)*param_1;
  }
  if ((bVar1 & 1) == 0) {
    return;
  }
  operator_delete((void *)param_1[2],*param_1 & 0xfffffffffffffffe);
  return;
}


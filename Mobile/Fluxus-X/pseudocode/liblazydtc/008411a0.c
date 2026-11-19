/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008411a0
 */

void FUN_008411a0(ulong *param_1)

{
  byte bVar1;
  
  if ((param_1[0xd] & 1) == 0) {
    bVar1 = (byte)param_1[9];
  }
  else {
    operator_delete((void *)param_1[0xf],param_1[0xd] & 0xfffffffffffffffe);
    bVar1 = (byte)param_1[9];
  }
  if ((bVar1 & 1) == 0) {
    bVar1 = (byte)param_1[6];
  }
  else {
    operator_delete((void *)param_1[0xb],param_1[9] & 0xfffffffffffffffe);
    bVar1 = (byte)param_1[6];
  }
  if ((bVar1 & 1) == 0) {
    bVar1 = (byte)param_1[3];
  }
  else {
    operator_delete((void *)param_1[8],param_1[6] & 0xfffffffffffffffe);
    bVar1 = (byte)param_1[3];
  }
  if ((bVar1 & 1) == 0) {
    bVar1 = (byte)*param_1;
  }
  else {
    operator_delete((void *)param_1[5],param_1[3] & 0xfffffffffffffffe);
    bVar1 = (byte)*param_1;
  }
  if ((bVar1 & 1) == 0) {
    return;
  }
  operator_delete((void *)param_1[2],*param_1 & 0xfffffffffffffffe);
  return;
}


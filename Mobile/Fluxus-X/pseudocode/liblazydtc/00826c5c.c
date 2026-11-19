/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00826c5c
 */

void FUN_00826c5c(ulong *param_1)

{
  byte bVar1;
  
                    /* try { // try from 00826c6c to 00826c7b has its CatchHandler @ 00826e28 */
  cpr::util::secureStringClear((basic_string_conflict *)(param_1 + 9));
  cpr::util::secureStringClear((basic_string_conflict *)(param_1 + 0xf));
  if ((param_1[0x26] & 1) == 0) {
    bVar1 = (byte)param_1[0x23];
  }
  else {
    operator_delete((void *)param_1[0x28],param_1[0x26] & 0xfffffffffffffffe);
    bVar1 = (byte)param_1[0x23];
  }
  if ((bVar1 & 1) == 0) {
    bVar1 = (byte)param_1[0x20];
  }
  else {
    operator_delete((void *)param_1[0x25],param_1[0x23] & 0xfffffffffffffffe);
    bVar1 = (byte)param_1[0x20];
  }
  if ((bVar1 & 1) == 0) {
    bVar1 = (byte)param_1[0x1d];
  }
  else {
    operator_delete((void *)param_1[0x22],param_1[0x20] & 0xfffffffffffffffe);
    bVar1 = (byte)param_1[0x1d];
  }
  if ((bVar1 & 1) == 0) {
    bVar1 = (byte)param_1[0x1a];
  }
  else {
    operator_delete((void *)param_1[0x1f],param_1[0x1d] & 0xfffffffffffffffe);
    bVar1 = (byte)param_1[0x1a];
  }
  if ((bVar1 & 1) == 0) {
    bVar1 = (byte)param_1[0x17];
  }
  else {
    operator_delete((void *)param_1[0x1c],param_1[0x1a] & 0xfffffffffffffffe);
    bVar1 = (byte)param_1[0x17];
  }
  if ((bVar1 & 1) == 0) {
    bVar1 = (byte)param_1[0x12];
  }
  else {
    operator_delete((void *)param_1[0x19],param_1[0x17] & 0xfffffffffffffffe);
    bVar1 = (byte)param_1[0x12];
  }
  if ((bVar1 & 1) == 0) {
    bVar1 = (byte)param_1[0xf];
  }
  else {
    operator_delete((void *)param_1[0x14],param_1[0x12] & 0xfffffffffffffffe);
    bVar1 = (byte)param_1[0xf];
  }
  if ((bVar1 & 1) == 0) {
    bVar1 = (byte)param_1[0xc];
  }
  else {
    operator_delete((void *)param_1[0x11],param_1[0xf] & 0xfffffffffffffffe);
    bVar1 = (byte)param_1[0xc];
  }
  if ((bVar1 & 1) == 0) {
    bVar1 = (byte)param_1[9];
  }
  else {
    operator_delete((void *)param_1[0xe],param_1[0xc] & 0xfffffffffffffffe);
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


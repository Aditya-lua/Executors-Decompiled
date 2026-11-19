/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00879ac0
 */

void FUN_00879ac0(ulong *param_1,ulong *param_2)

{
  byte bVar1;
  void *__dest;
  undefined8 uVar2;
  void *pvVar3;
  ulong uVar4;
  ulong uVar5;
  
  if ((*param_2 & 1) == 0) {
    uVar5 = param_2[1];
    uVar4 = *param_2;
    param_1[2] = param_2[2];
    param_1[1] = uVar5;
    *param_1 = uVar4;
  }
  else {
    FUN_007ff40c(param_1,param_2[2],param_2[1]);
  }
  uVar4 = param_2[3];
  *(int *)(param_1 + 4) = (int)param_2[4];
  param_1[3] = uVar4;
  if ((param_2[5] & 1) == 0) {
    uVar5 = param_2[6];
    uVar4 = param_2[5];
    param_1[7] = param_2[7];
    param_1[6] = uVar5;
    param_1[5] = uVar4;
  }
  else {
                    /* try { // try from 00879b38 to 00879b3f has its CatchHandler @ 00879c04 */
    FUN_007ff40c(param_1 + 5,param_2[7],param_2[6]);
  }
  if ((param_2[8] & 1) == 0) {
    uVar5 = param_2[9];
    uVar4 = param_2[8];
    param_1[10] = param_2[10];
    param_1[9] = uVar5;
    param_1[8] = uVar4;
  }
  else {
                    /* try { // try from 00879b64 to 00879b6b has its CatchHandler @ 00879bf4 */
    FUN_007ff40c(param_1 + 8,param_2[10],param_2[9]);
  }
  param_1[0xb] = 0;
  param_1[0xc] = 0;
  param_1[0xd] = 0;
  pvVar3 = (void *)param_2[0xb];
  uVar4 = param_2[0xc] - (long)pvVar3;
  if (uVar4 != 0) {
    if ((long)uVar4 < 0) {
                    /* try { // try from 00879bec to 00879bef has its CatchHandler @ 00879c14 */
      uVar2 = FUN_00879790();
                    /* catch() { ... } // from try @ 00879bd0 with catch @ 00879bf0 */
                    /* catch() { ... } // from try @ 00879b88 with catch @ 00879c14
                       catch() { ... } // from try @ 00879bec with catch @ 00879c14 */
      pvVar3 = (void *)param_1[0xb];
      if (pvVar3 == (void *)0x0) {
        bVar1 = (byte)param_1[8];
      }
      else {
        param_1[0xc] = (ulong)pvVar3;
        operator_delete(pvVar3,param_1[0xd] - (long)pvVar3);
        bVar1 = (byte)param_1[8];
      }
      if ((bVar1 & 1) == 0) {
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
                    /* WARNING: Subroutine does not return */
        FUN_00c2c090(uVar2);
      }
      operator_delete((void *)param_1[2],*param_1 & 0xfffffffffffffffe);
                    /* WARNING: Subroutine does not return */
      FUN_00c2c090(uVar2);
    }
                    /* try { // try from 00879b88 to 00879b8f has its CatchHandler @ 00879c14 */
    __dest = operator_new(uVar4);
    param_1[0xb] = (ulong)__dest;
    param_1[0xc] = (ulong)__dest;
    param_1[0xd] = (long)__dest + uVar4;
    memcpy(__dest,pvVar3,uVar4);
    param_1[0xc] = (long)__dest + uVar4;
  }
  if ((param_2[0xe] & 1) == 0) {
    uVar5 = param_2[0xf];
    uVar4 = param_2[0xe];
    param_1[0x10] = param_2[0x10];
    param_1[0xf] = uVar5;
    param_1[0xe] = uVar4;
  }
  else {
                    /* try { // try from 00879bd0 to 00879bd7 has its CatchHandler @ 00879bf0 */
    FUN_007ff40c(param_1 + 0xe,param_2[0x10],param_2[0xf]);
  }
  return;
}


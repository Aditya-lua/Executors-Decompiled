/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00844534
 */

void FUN_00844534(undefined8 *param_1,undefined8 *param_2)

{
  ulong uVar1;
  void *pvVar2;
  void *pvVar3;
  undefined8 uVar4;
  undefined8 *unaff_x24;
  size_t __n;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  
  uVar7 = param_2[1];
  uVar6 = *param_2;
  uVar5 = param_2[3];
  uVar4 = param_2[2];
  param_1[4] = 0;
  param_1[5] = 0;
  param_1[6] = 0;
  param_1[1] = uVar7;
  *param_1 = uVar6;
  param_1[3] = uVar5;
  param_1[2] = uVar4;
  pvVar3 = (void *)param_2[4];
  uVar1 = param_2[5] - (long)pvVar3;
  if (uVar1 != 0) {
    if (0xaaaaaaaaaaaaaaa < (ulong)(((long)uVar1 >> 3) * -0x5555555555555555)) {
                    /* try { // try from 00844658 to 0084465b has its CatchHandler @ 0084468c */
      FUN_00844480();
      goto LAB_0084465c;
    }
                    /* try { // try from 00844598 to 0084459f has its CatchHandler @ 0084468c */
    pvVar2 = operator_new(uVar1);
    param_1[4] = pvVar2;
    param_1[5] = pvVar2;
    __n = ((uVar1 - 0x18) / 0x18) * 0x18 + 0x18;
    param_1[6] = (long)pvVar2 + uVar1;
    memcpy(pvVar2,pvVar3,__n);
    param_1[5] = (long)pvVar2 + __n;
  }
  unaff_x24 = param_1 + 7;
  *unaff_x24 = 0;
  param_1[8] = 0;
  param_1[9] = 0;
  pvVar3 = (void *)param_2[7];
  uVar1 = param_2[8] - (long)pvVar3;
  if (uVar1 != 0) {
    if ((long)uVar1 < 0) {
LAB_0084465c:
                    /* try { // try from 0084465c to 0084465f has its CatchHandler @ 00844660 */
      uVar4 = FUN_00844e28();
                    /* catch() { ... } // from try @ 00844600 with catch @ 00844660
                       catch() { ... } // from try @ 0084465c with catch @ 00844660 */
      pvVar3 = (void *)*unaff_x24;
      if (pvVar3 != (void *)0x0) {
        param_1[8] = pvVar3;
        operator_delete(pvVar3,param_1[9] - (long)pvVar3);
      }
      pvVar3 = (void *)param_1[4];
      if (pvVar3 != (void *)0x0) {
        param_1[5] = pvVar3;
        operator_delete(pvVar3,param_1[6] - (long)pvVar3);
      }
                    /* WARNING: Subroutine does not return */
      FUN_00c2c090(uVar4);
    }
                    /* try { // try from 00844600 to 00844607 has its CatchHandler @ 00844660 */
    pvVar2 = operator_new(uVar1);
    param_1[7] = pvVar2;
    param_1[8] = pvVar2;
    param_1[9] = (long)pvVar2 + uVar1;
    memcpy(pvVar2,pvVar3,uVar1 & 0x7ffffffffffffff0);
    param_1[8] = (long)pvVar2 + (uVar1 & 0x7ffffffffffffff0);
  }
  uVar4 = param_2[10];
  *(undefined8 *)((long)param_1 + 0x55) = *(undefined8 *)((long)param_2 + 0x55);
  param_1[10] = uVar4;
  return;
}


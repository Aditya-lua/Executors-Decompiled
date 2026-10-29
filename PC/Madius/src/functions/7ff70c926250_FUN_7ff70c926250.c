/* 7ff70c926250 FUN_7ff70c926250 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

float * FUN_7ff70c926250(float *param_1,float *param_2)

{
  ulonglong uVar1;
  ulonglong uVar2;
  ulonglong uVar3;
  undefined8 extraout_XMM0_Qb;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  
  if (param_1 != param_2) {
    *param_1 = *param_2;
    auVar5._0_8_ = FUN_7ff70c932d00(param_1 + 2,**(undefined8 **)(param_2 + 2));
    auVar5._8_8_ = extraout_XMM0_Qb;
    uVar1 = *(ulonglong *)(param_1 + 0xe);
    auVar4._4_12_ = auVar5._4_12_;
    auVar4._0_4_ = (float)*(ulonglong *)(param_1 + 4) / *param_1;
    auVar5 = roundss(auVar4,auVar4,10);
    uVar2 = (ulonglong)auVar5._0_4_;
    uVar2 = (longlong)(auVar5._0_4_ - _DAT_7ff70cb14c58) & (longlong)uVar2 >> 0x3f | uVar2;
    uVar3 = 8;
    if (8 < uVar2) {
      uVar3 = uVar2;
    }
    uVar2 = uVar1;
    if (uVar1 < uVar3) {
      uVar2 = uVar1 * 8;
      if (uVar2 < uVar3 || uVar2 - uVar3 == 0) {
        uVar2 = uVar3;
      }
      if (0x1ff < uVar1) {
        uVar2 = uVar3;
      }
    }
    FUN_7ff70c926ac0(param_1,uVar2);
  }
  return param_1;
}



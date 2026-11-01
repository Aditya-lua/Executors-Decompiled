
/* WARNING: Removing unreachable block (ram,0x007a5cf8) */
/* WARNING: Removing unreachable block (ram,0x007a5d04) */

void FUN_005356f8(void)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  undefined *puVar4;
  undefined8 *puVar5;
  ulong *puVar6;
  undefined8 uVar7;
  ulong uVar8;
  undefined8 *unaff_x19;
  undefined1 auVar9 [16];
  undefined8 uStack_c0;
  undefined *puStack_b8;
  undefined1 **ppuStack_b0;
  undefined *puStack_a8;
  undefined *puStack_98;
  undefined8 uStack_90;
  undefined1 *puStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined1 auStack_68 [8];
  undefined1 *puStack_60;
  undefined *puStack_58;
  int aiStack_50 [2];
  ulong uStack_48;
  ulong uStack_40;
  ulong uStack_38;
  ulong uStack_30;
  ulong uStack_28;
  undefined1 auStack_6 [6];
  
  unaff_x19[1] = 0;
  func_0x00430048(*unaff_x19);
  __Unwind_Resume();
  auVar9 = func_0x007a2668();
  uVar2 = auVar9._8_8_;
  auVar9._0_8_ = auVar9._0_8_;
  uVar3 = auVar9._0_8_[2];
  if (uVar2 <= *auVar9._0_8_ - uVar3) {
    return;
  }
  puVar6 = (ulong *)((long)&MACH_HEADER.magic + 1);
  uVar7 = 1;
  if (CARRY8(uVar3,uVar2)) {
code_r0x007a5d94:
    func_0x007a1f00(0,uVar3,&UNK_009ebcc8);
  }
  else {
    uVar8 = *auVar9._0_8_;
    uVar1 = uVar2 + uVar3;
    if (uVar2 + uVar3 <= uVar8 * 2) {
      uVar1 = uVar8 * 2;
    }
    if (uVar1 < 9) {
      uVar1 = 8;
    }
    auVar9._8_8_ = 0;
    auVar9._0_8_ = uVar1;
    if (SUB168(ZEXT816(1) * auVar9,8) != 0) goto code_r0x007a5d94;
    uVar2 = 0;
    if (0x7fffffffffffffff < uVar1) goto code_r0x007a5da4;
    if (uVar8 != 0) {
      uStack_38 = auVar9._0_8_[1];
      uStack_28 = uVar8;
    }
    uStack_30 = (ulong)(uVar8 != 0);
    puVar6 = &uStack_38;
    func_0x0079a108(aiStack_50,1,uVar1,puVar6);
    if (aiStack_50[0] != 1) {
      *auVar9._0_8_ = uVar1;
      auVar9._0_8_[1] = uStack_48;
      return;
    }
  }
  uVar2 = uStack_48;
  uVar3 = uStack_40;
code_r0x007a5da4:
  puVar4 = &UNK_009ebcc8;
  func_0x007a1f00(uVar2,uVar3);
  puStack_58 = &
               __ZN77__LT_anstyle_parse__AsciiParser_u20_as_u20_anstyle_parse__CharAccumulator_GT_3add17hdb9f9dbf77b7bb06E
  ;
  puStack_98 = &UNK_009ebd10;
  uStack_90 = 1;
  puStack_88 = auStack_68;
  uStack_80 = 0;
  uStack_78 = 0;
  puStack_60 = auStack_6 + -10;
  auVar9 = func_0x007a2420(&puStack_98,&UNK_009ebd20);
  uStack_c0 = auVar9._8_8_;
  puStack_a8 = &__ZN4core9panicking13assert_failed17hf474143206f1ec1cE;
  puVar5 = (undefined8 *)&UNK_009ebd38;
  puStack_b8 = puVar4;
  ppuStack_b0 = &puStack_60;
  auVar9 = func_0x007a272c(auVar9._0_8_,&uStack_c0,&UNK_009ebd38,&puStack_b8,&UNK_009ebd38,puVar6,
                           uVar7);
  uVar3 = auVar9._8_8_;
  auVar9._0_8_ = auVar9._0_8_;
  if ((puVar5[1] == 0) || (puVar5[2] == 0)) {
    if (uVar3 == 0) {
      uVar2 = 8;
    }
    else {
      uVar2 = func_0x00187bd0(uVar3,8);
    }
  }
  else {
    uVar2 = func_0x00187bd8(*puVar5,puVar5[2],8,uVar3);
  }
  uVar1 = 8;
  if (uVar2 != 0) {
    uVar1 = uVar2;
  }
  auVar9._0_8_[1] = uVar1;
  auVar9._0_8_[2] = uVar3;
  *auVar9._0_8_ = (ulong)(uVar2 == 0);
  return;
}


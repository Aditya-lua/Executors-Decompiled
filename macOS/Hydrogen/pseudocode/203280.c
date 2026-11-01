
void FUN_00203280(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  ulong uVar1;
  long lVar2;
  undefined1 auVar3 [16];
  undefined8 uVar4;
  ulong uVar5;
  long lVar6;
  undefined8 *extraout_x8;
  ulong uVar7;
  ulong uVar8;
  undefined *puVar9;
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  
  func_0x0020282c();
  uVar4 = __Unwind_Resume(param_1);
  func_0x0020282c();
  auVar10 = __Unwind_Resume(uVar4);
  uVar5 = auVar10._0_8_;
  if (uVar5 == 0) {
    auVar11 = ZEXT816(0);
    puVar9 = &UNK_00827270;
    goto LAB_002033e4;
  }
  if (uVar5 < 8) {
    uVar7 = 4;
    if (3 < uVar5) {
      uVar7 = 8;
    }
LAB_00203340:
    auVar3._8_8_ = 0;
    auVar3._0_8_ = uVar7;
    if (SUB168(auVar3 * ZEXT816(0xd8),8) != 0) goto LAB_00203370;
    uVar8 = uVar7 * 0xd8;
    uVar5 = uVar7 + 8;
    if ((CARRY8(uVar8,uVar5)) || (uVar1 = uVar8 + uVar5, 0x7ffffffffffffff8 < uVar1))
    goto LAB_00203370;
    lVar6 = func_0x00187bd0(uVar1,8);
    if (lVar6 != 0) {
      lVar2 = uVar7 - 1;
      if (8 < uVar7) {
        lVar2 = (uVar7 >> 3) * 7;
      }
      auVar11._8_8_ = lVar2;
      auVar11._0_8_ = uVar7 - 1;
      puVar9 = (undefined *)(lVar6 + uVar8);
      _memset(puVar9,0xff,uVar5);
      goto LAB_002033e4;
    }
    auVar11 = func_0x004584ec(1,8,uVar1);
  }
  else {
    if (uVar5 >> 0x3d == 0) {
      uVar7 = (0xffffffffffffffffU >> (LZCOUNT((uVar5 * 8) / 7 - 1) & 0x3fU)) + 1;
      goto LAB_00203340;
    }
LAB_00203370:
    auVar11 = func_0x004584a8(1);
  }
  puVar9 = (undefined *)0x0;
LAB_002033e4:
  extraout_x8[4] = auVar10._8_8_;
  extraout_x8[5] = param_3;
  *extraout_x8 = puVar9;
  *(undefined1 (*) [16])(extraout_x8 + 1) = auVar11;
  extraout_x8[3] = 0;
  return;
}


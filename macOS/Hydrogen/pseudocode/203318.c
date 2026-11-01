
void FUN_00203318(ulong param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  ulong uVar7;
  ulong in_x9;
  long lVar8;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  ulong uVar9;
  undefined1 auVar10 [16];
  
  auVar4._8_8_ = 0;
  auVar4._0_8_ = param_1;
  auVar6._8_8_ = 0;
  auVar6._0_8_ = in_x9 & 0xffffffffffff | 0x2492000000000000;
  lVar8 = SUB168(auVar4 * auVar6,8);
  uVar7 = 0xffffffffffffffff >> (LZCOUNT((lVar8 + (param_1 - lVar8 >> 1) >> 2) - 1) & 0x3fU);
  uVar1 = uVar7 + 1;
  auVar5._8_8_ = 0;
  auVar5._0_8_ = uVar1;
  if (SUB168(auVar5 * ZEXT816(0xd8),8) == 0) {
    uVar9 = uVar1 * 0xd8;
    uVar2 = uVar7 + 9;
    if (CARRY8(uVar9,uVar2)) goto LAB_00203370;
    uVar3 = uVar9 + uVar2;
    if (0x7ffffffffffffff8 < uVar3) goto LAB_00203370;
    lVar8 = func_0x00187bd0(uVar3,8);
    if (lVar8 != 0) {
      uVar3 = uVar7;
      if (8 < uVar1) {
        uVar3 = (uVar1 >> 3) * 7;
      }
      auVar10._8_8_ = uVar3;
      auVar10._0_8_ = uVar7;
      lVar8 = lVar8 + uVar9;
      _memset(lVar8,0xff,uVar2);
      goto LAB_002033e4;
    }
    auVar10 = func_0x004584ec(1,8,uVar3);
  }
  else {
LAB_00203370:
    auVar10 = func_0x004584a8(1);
  }
  lVar8 = 0;
LAB_002033e4:
  unaff_x19[4] = unaff_x21;
  unaff_x19[5] = unaff_x20;
  *unaff_x19 = lVar8;
  *(undefined1 (*) [16])(unaff_x19 + 1) = auVar10;
  unaff_x19[3] = 0;
  return;
}


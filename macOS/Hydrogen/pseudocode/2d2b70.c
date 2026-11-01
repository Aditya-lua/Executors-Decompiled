
undefined8
FUN_002d2b70(ulong param_1,undefined8 param_2,undefined8 param_3,char *param_4,ulong param_5)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  uint uVar4;
  bool in_ZR;
  bool in_CY;
  long *plVar5;
  undefined8 uVar6;
  uint uVar7;
  int in_w9;
  ulong uVar8;
  ulong uVar9;
  ulong in_x10;
  long lVar10;
  long lVar11;
  uint in_w11;
  uint uVar12;
  ulong uVar13;
  int in_w12;
  ulong uVar14;
  int in_w13;
  undefined8 unaff_x19;
  undefined1 *unaff_x20;
  long unaff_x29;
  undefined1 auVar15 [16];
  undefined1 auStack_c0 [72];
  undefined1 auStack_78 [72];
  
  uVar8 = in_x10 >> 4;
  if (in_x10 < 0x10) {
    uVar8 = in_x10;
  }
  uVar9 = uVar8 >> 2;
  if (uVar8 < 4) {
    uVar9 = uVar8;
  }
  uVar7 = in_w11 | in_w9 << 6 | in_w12 << 5 | in_w13 << 4 | (uint)(in_CY && !in_ZR) << 3 |
          (uint)(0xf < in_x10) << 2 | (uint)(3 < uVar8) << 1;
  if (1 < uVar9) {
    uVar7 = uVar7 + 1;
  }
  if (param_1 == uVar7 + 7 >> 3) {
    *unaff_x20 = 4;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
      return unaff_x19;
    }
  }
  else {
    func_0x0079ea14();
  }
  auVar15 = ___stack_chk_fail();
  plVar5 = auVar15._0_8_;
  uVar4 = *(uint *)(plVar5 + 0x29);
  uVar8 = (ulong)uVar4;
  uVar7 = uVar4 & (int)uVar4 >> 0x1f;
  lVar10 = uVar8 * 8;
  do {
    lVar10 = lVar10 + -8;
    uVar12 = (uint)uVar8;
    uVar8 = (ulong)(uVar12 - 1);
    if ((int)uVar12 < 1) {
      if (-1 < (int)uVar4) {
        uVar8 = 0;
        if (param_5 != 1) goto LAB_002d2d8c;
        goto LAB_002d2d14;
      }
      lVar11 = plVar5[0x28];
      goto LAB_002d2c7c;
    }
    lVar11 = plVar5[0x28];
  } while (*(long *)(lVar11 + lVar10) == 0);
  uVar7 = uVar12;
LAB_002d2c7c:
  uVar9 = *(ulong *)(lVar11 + (long)(int)(uVar7 - 1) * 8);
  uVar13 = uVar9 >> 0x20;
  uVar8 = uVar13;
  if (uVar13 == 0) {
    uVar8 = uVar9;
  }
  uVar14 = uVar8 >> 0x10;
  uVar1 = uVar14;
  if (uVar14 == 0) {
    uVar1 = uVar8;
  }
  uVar8 = uVar1 >> 8;
  if (uVar1 < 0x100) {
    uVar8 = uVar1;
  }
  uVar2 = uVar8 >> 4;
  if (uVar8 < 0x10) {
    uVar2 = uVar8;
  }
  uVar3 = uVar2 >> 2;
  if (uVar2 < 4) {
    uVar3 = uVar2;
  }
  uVar7 = (uint)(uVar9 != 0) | (uVar7 - 1) * 0x40 | (uint)(uVar13 != 0) << 5 |
          (uint)(uVar14 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar8) << 2 |
          (uint)(3 < uVar2) << 1;
  if (1 < uVar3) {
    uVar7 = uVar7 + 1;
  }
  uVar8 = (ulong)(uVar7 + 7 >> 3);
  if ((uVar8 << 1 | 1) == param_5) {
LAB_002d2d14:
    if (*param_4 == '\x04') {
      uVar6 = (**(code **)(*plVar5 + 0x70))(plVar5,auStack_78,param_4 + 1,uVar8);
      if (((int)uVar6 != 0) &&
         (uVar6 = (**(code **)(*plVar5 + 0x70))(plVar5,auStack_c0,param_4 + 1 + uVar8,uVar8),
         (int)uVar6 != 0)) {
        uVar6 = func_0x002c8858(plVar5,auVar15._8_8_,auStack_78,auStack_c0);
      }
      return uVar6;
    }
  }
LAB_002d2d8c:
  func_0x0028f83c(0xf,0,0x6d,"/aws-lc/crypto/fipsmodule/ec/oct.c",0x8a);
  return 0;
}


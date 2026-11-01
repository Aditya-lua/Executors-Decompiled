
undefined8
FUN_002cc318(ulong param_1,undefined1 param_2 [16],undefined1 param_3 [16],undefined1 param_4 [16],
            undefined1 param_5 [16],undefined1 param_6 [16],ulong *param_7,undefined8 param_8,
            byte *param_9)

{
  int iVar1;
  ulong *puVar2;
  undefined8 *in_x9;
  ulong uVar3;
  long in_x10;
  long in_x11;
  undefined1 (*in_x12) [16];
  long in_x13;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  
  lVar13 = param_6._8_8_;
  lVar12 = param_6._0_8_;
  lVar11 = param_5._8_8_;
  lVar10 = param_5._0_8_;
  lVar9 = param_4._8_8_;
  lVar8 = param_4._0_8_;
  lVar7 = param_3._8_8_;
  lVar6 = param_3._0_8_;
  lVar5 = param_2._8_8_;
  lVar4 = param_2._0_8_;
  while( true ) {
    lVar12 = lVar12 + lVar8;
    lVar13 = lVar13 + lVar9;
    in_x13 = in_x13 + -8;
    if (in_x13 == 0) break;
    auVar15 = in_x12[-4];
    auVar14 = NEON_ext(in_x12[-3],in_x12[-3],8,1);
    auVar16 = NEON_ext(auVar15,auVar15,8,1);
    auVar17 = NEON_ext(in_x12[-5],in_x12[-5],8,1);
    auVar18 = NEON_ext(in_x12[-6],in_x12[-6],8,1);
    auVar15 = NEON_rev64(auVar14,1);
    auVar14 = NEON_rev64(auVar16,1);
    auVar16 = NEON_rev64(auVar17,1);
    auVar17 = NEON_rev64(auVar18,1);
    in_x9[-3] = auVar15._8_8_;
    in_x9[-4] = auVar15._0_8_;
    in_x9[-1] = auVar14._8_8_;
    in_x9[-2] = auVar14._0_8_;
    in_x9[1] = auVar16._8_8_;
    *in_x9 = auVar16._0_8_;
    in_x9[3] = auVar17._8_8_;
    in_x9[2] = auVar17._0_8_;
    lVar6 = lVar6 + lVar8;
    lVar7 = lVar7 + lVar9;
    lVar4 = lVar4 + lVar8;
    lVar5 = lVar5 + lVar9;
    lVar10 = lVar10 + lVar8;
    lVar11 = lVar11 + lVar9;
    in_x9 = in_x9 + 8;
    in_x12 = in_x12 + -4;
  }
  lVar4 = lVar11 + lVar10 + lVar7 + lVar6 + lVar13 + lVar12 + lVar5 + lVar4;
  if (in_x10 != in_x11) {
    puVar2 = param_7;
    uVar3 = param_1;
    do {
      param_1 = uVar3 - 8;
      uVar3 = (*(ulong *)(param_9 + (uVar3 - 8)) & 0xff00ff00ff00ff00) >> 8 |
              (*(ulong *)(param_9 + (uVar3 - 8)) & 0xff00ff00ff00ff) << 8;
      uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
      param_7 = puVar2 + 1;
      *puVar2 = uVar3 >> 0x20 | uVar3 << 0x20;
      lVar4 = lVar4 + -1;
      puVar2 = param_7;
      uVar3 = param_1;
    } while (7 < param_1);
  }
  puVar2 = param_7;
  if (param_1 != 0) {
    uVar3 = 0;
    do {
      uVar3 = (ulong)*param_9 | uVar3 << 8;
      param_1 = param_1 - 1;
      param_9 = param_9 + 1;
    } while (param_1 != 0);
    puVar2 = param_7 + 1;
    *param_7 = uVar3;
    lVar4 = lVar4 + -1;
  }
  if (lVar4 << 3 != 0) {
    _bzero(puVar2,lVar4 << 3);
  }
  iVar1 = func_0x0029d99c();
  if (iVar1 < 0) {
    return 1;
  }
  func_0x0028f83c(0xf,0,0x80,"/aws-lc/crypto/fipsmodule/ec/simple.c",0x14b);
  return 0;
}


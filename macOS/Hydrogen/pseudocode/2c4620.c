
undefined8 FUN_002c4620(long param_1,undefined8 param_2,long param_3,byte *param_4,long param_5)

{
  int iVar1;
  ulong *puVar2;
  ulong *puVar3;
  ulong uVar4;
  undefined8 *puVar5;
  ulong uVar6;
  undefined1 (*pauVar7) [16];
  ulong uVar8;
  long unaff_x19;
  long lVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  long lVar14;
  long lVar15;
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  
  uVar6 = param_1 + 1U & 0x3ffffffffffffff8;
  uVar4 = param_5 + uVar6 * -8;
  puVar2 = (ulong *)(unaff_x19 + uVar6 * 8);
  pauVar7 = (undefined1 (*) [16])(param_4 + param_5 + -0x20);
  lVar9 = 0;
  lVar10 = 0;
  lVar11 = 0;
  lVar12 = 0;
  lVar13 = 0;
  lVar14 = 0;
  lVar15 = 0;
  puVar5 = (undefined8 *)(unaff_x19 + 0x20);
  uVar8 = uVar6;
  do {
    auVar16 = NEON_ext(pauVar7[1],pauVar7[1],8,1);
    auVar17 = NEON_ext(*pauVar7,*pauVar7,8,1);
    auVar18 = NEON_ext(pauVar7[-1],pauVar7[-1],8,1);
    auVar19 = NEON_ext(pauVar7[-2],pauVar7[-2],8,1);
    auVar16 = NEON_rev64(auVar16,1);
    auVar17 = NEON_rev64(auVar17,1);
    auVar18 = NEON_rev64(auVar18,1);
    auVar19 = NEON_rev64(auVar19,1);
    puVar5[-3] = auVar16._8_8_;
    puVar5[-4] = auVar16._0_8_;
    puVar5[-1] = auVar17._8_8_;
    puVar5[-2] = auVar17._0_8_;
    puVar5[1] = auVar18._8_8_;
    *puVar5 = auVar18._0_8_;
    puVar5[3] = auVar19._8_8_;
    puVar5[2] = auVar19._0_8_;
    lVar9 = lVar9 + -1;
    lVar10 = lVar10 + -1;
    lVar12 = lVar12 + -1;
    lVar13 = lVar13 + -1;
    lVar11 = lVar11 + -1;
    param_3 = param_3 + -1;
    lVar14 = lVar14 + -1;
    lVar15 = lVar15 + -1;
    pauVar7 = pauVar7 + -4;
    uVar8 = uVar8 - 8;
    puVar5 = puVar5 + 8;
  } while (uVar8 != 0);
  lVar9 = lVar11 + lVar10 + lVar9 + param_3 + lVar14 + lVar13 + lVar12 + lVar15;
  if (param_1 + 1U != uVar6) {
    puVar3 = puVar2;
    uVar8 = uVar4;
    do {
      uVar4 = uVar8 - 8;
      uVar8 = (*(ulong *)(param_4 + (uVar8 - 8)) & 0xff00ff00ff00ff00) >> 8 |
              (*(ulong *)(param_4 + (uVar8 - 8)) & 0xff00ff00ff00ff) << 8;
      uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
      puVar2 = puVar3 + 1;
      *puVar3 = uVar8 >> 0x20 | uVar8 << 0x20;
      lVar9 = lVar9 + -1;
      puVar3 = puVar2;
      uVar8 = uVar4;
    } while (7 < uVar4);
  }
  puVar3 = puVar2;
  if (uVar4 != 0) {
    uVar8 = 0;
    do {
      uVar8 = (ulong)*param_4 | uVar8 << 8;
      uVar4 = uVar4 - 1;
      param_4 = param_4 + 1;
    } while (uVar4 != 0);
    puVar3 = puVar2 + 1;
    *puVar2 = uVar8;
    lVar9 = lVar9 + -1;
  }
  if (lVar9 << 3 != 0) {
    _bzero(puVar3,lVar9 << 3);
  }
  iVar1 = func_0x0029d99c();
  if (iVar1 < 0) {
    return 1;
  }
  func_0x0028f83c(0xf,0,0x85,"/aws-lc/crypto/fipsmodule/ec/scalar.c",0x47);
  return 0;
}


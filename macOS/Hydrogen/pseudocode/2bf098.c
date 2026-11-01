
undefined8
FUN_002bf098(long param_1,undefined1 param_2 [16],undefined1 param_3 [16],undefined1 param_4 [16],
            undefined1 param_5 [16],long param_6,long param_7)

{
  undefined1 auVar1 [16];
  int iVar2;
  ulong *puVar3;
  ulong uVar4;
  byte bVar5;
  byte bVar6;
  byte bVar7;
  byte bVar8;
  byte bVar9;
  byte bVar10;
  byte bVar11;
  byte bVar12;
  byte bVar13;
  byte bVar14;
  byte bVar15;
  byte bVar16;
  byte bVar17;
  byte bVar18;
  byte bVar19;
  byte bVar20;
  undefined1 auVar21 [16];
  
  bVar5 = param_5[0] | param_4[0] | param_2[0];
  bVar6 = param_5[1] | param_4[1] | param_2[1];
  bVar7 = param_5[2] | param_4[2] | param_2[2];
  bVar8 = param_5[3] | param_4[3] | param_2[3];
  bVar9 = param_5[4] | param_4[4] | param_2[4];
  bVar10 = param_5[5] | param_4[5] | param_2[5];
  bVar11 = param_5[6] | param_4[6] | param_2[6];
  bVar12 = param_5[7] | param_4[7] | param_2[7];
  bVar13 = param_5[8] | param_4[8] | param_2[8];
  bVar14 = param_5[9] | param_4[9] | param_2[9];
  bVar15 = param_5[10] | param_4[10] | param_2[10];
  bVar16 = param_5[0xb] | param_4[0xb] | param_2[0xb];
  bVar17 = param_5[0xc] | param_4[0xc] | param_2[0xc];
  bVar18 = param_5[0xd] | param_4[0xd] | param_2[0xd];
  bVar19 = param_5[0xe] | param_4[0xe] | param_2[0xe];
  bVar20 = param_5[0xf] | param_4[0xf] | param_2[0xf];
  auVar21[1] = bVar6;
  auVar21[0] = bVar5;
  auVar21[2] = bVar7;
  auVar21[3] = bVar8;
  auVar21[4] = bVar9;
  auVar21[5] = bVar10;
  auVar21[6] = bVar11;
  auVar21[7] = bVar12;
  auVar21[8] = bVar13;
  auVar21[9] = bVar14;
  auVar21[10] = bVar15;
  auVar21[0xb] = bVar16;
  auVar21[0xc] = bVar17;
  auVar21[0xd] = bVar18;
  auVar21[0xe] = bVar19;
  auVar21[0xf] = bVar20;
  auVar1[1] = bVar6;
  auVar1[0] = bVar5;
  auVar1[2] = bVar7;
  auVar1[3] = bVar8;
  auVar1[4] = bVar9;
  auVar1[5] = bVar10;
  auVar1[6] = bVar11;
  auVar1[7] = bVar12;
  auVar1[8] = bVar13;
  auVar1[9] = bVar14;
  auVar1[10] = bVar15;
  auVar1[0xb] = bVar16;
  auVar1[0xc] = bVar17;
  auVar1[0xd] = bVar18;
  auVar1[0xe] = bVar19;
  auVar1[0xf] = bVar20;
  auVar21 = NEON_ext(auVar21,auVar1,8,1);
  uVar4 = CONCAT17(bVar12 | auVar21[7],
                   CONCAT16(bVar11 | auVar21[6],
                            CONCAT15(bVar10 | auVar21[5],
                                     CONCAT14(bVar9 | auVar21[4],
                                              CONCAT13(bVar8 | auVar21[3],
                                                       CONCAT12(bVar7 | auVar21[2],
                                                                CONCAT11(bVar6 | auVar21[1],
                                                                         bVar5 | auVar21[0])))))));
  if (param_1 != param_7) {
    param_7 = param_7 - param_1;
    puVar3 = (ulong *)(param_6 + param_1 * 8);
    do {
      uVar4 = *puVar3 | uVar4;
      param_7 = param_7 + -1;
      puVar3 = puVar3 + 1;
    } while (param_7 != 0);
  }
  if ((uVar4 == 0) || (iVar2 = func_0x0029d99c(), -1 < iVar2)) {
    func_0x0028f83c(5,0,0x6b,"/aws-lc/crypto/fipsmodule/dh/check.c",0x51);
    return 0;
  }
  return 1;
}



byte FUN_002d50a0(long param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined1 param_5 [16])

{
  undefined1 auVar1 [16];
  long in_x9;
  long in_x10;
  ulong *puVar2;
  ulong uVar3;
  long unaff_x19;
  byte unaff_w24;
  byte bVar4;
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
  undefined1 auVar20 [16];
  
  bVar4 = param_5[0] | param_2[0];
  bVar5 = param_5[1] | param_2[1];
  bVar6 = param_5[2] | param_2[2];
  bVar7 = param_5[3] | param_2[3];
  bVar8 = param_5[4] | param_2[4];
  bVar9 = param_5[5] | param_2[5];
  bVar10 = param_5[6] | param_2[6];
  bVar11 = param_5[7] | param_2[7];
  bVar12 = param_5[8] | param_2[8];
  bVar13 = param_5[9] | param_2[9];
  bVar14 = param_5[10] | param_2[10];
  bVar15 = param_5[0xb] | param_2[0xb];
  bVar16 = param_5[0xc] | param_2[0xc];
  bVar17 = param_5[0xd] | param_2[0xd];
  bVar18 = param_5[0xe] | param_2[0xe];
  bVar19 = param_5[0xf] | param_2[0xf];
  auVar20[1] = bVar5;
  auVar20[0] = bVar4;
  auVar20[2] = bVar6;
  auVar20[3] = bVar7;
  auVar20[4] = bVar8;
  auVar20[5] = bVar9;
  auVar20[6] = bVar10;
  auVar20[7] = bVar11;
  auVar20[8] = bVar12;
  auVar20[9] = bVar13;
  auVar20[10] = bVar14;
  auVar20[0xb] = bVar15;
  auVar20[0xc] = bVar16;
  auVar20[0xd] = bVar17;
  auVar20[0xe] = bVar18;
  auVar20[0xf] = bVar19;
  auVar1[1] = bVar5;
  auVar1[0] = bVar4;
  auVar1[2] = bVar6;
  auVar1[3] = bVar7;
  auVar1[4] = bVar8;
  auVar1[5] = bVar9;
  auVar1[6] = bVar10;
  auVar1[7] = bVar11;
  auVar1[8] = bVar12;
  auVar1[9] = bVar13;
  auVar1[10] = bVar14;
  auVar1[0xb] = bVar15;
  auVar1[0xc] = bVar16;
  auVar1[0xd] = bVar17;
  auVar1[0xe] = bVar18;
  auVar1[0xf] = bVar19;
  auVar20 = NEON_ext(auVar20,auVar1,8,1);
  uVar3 = CONCAT17(bVar11 | auVar20[7],
                   CONCAT16(bVar10 | auVar20[6],
                            CONCAT15(bVar9 | auVar20[5],
                                     CONCAT14(bVar8 | auVar20[4],
                                              CONCAT13(bVar7 | auVar20[3],
                                                       CONCAT12(bVar6 | auVar20[2],
                                                                CONCAT11(bVar5 | auVar20[1],
                                                                         bVar4 | auVar20[0])))))));
  if (in_x10 != param_1) {
    param_1 = param_1 - in_x10;
    puVar2 = (ulong *)(unaff_x19 + in_x10 * 8 + 0x90);
    do {
      uVar3 = *puVar2 | uVar3;
      param_1 = param_1 + -1;
      puVar2 = puVar2 + 1;
    } while (param_1 != 0);
  }
  if (in_x9 != 0) {
    unaff_w24 = 0xff;
  }
  return uVar3 != 0 & (unaff_w24 ^ 0xff);
}


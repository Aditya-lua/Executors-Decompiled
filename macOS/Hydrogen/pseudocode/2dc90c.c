
ulong FUN_002dc90c(ulong param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                  undefined1 param_4 [16],undefined1 param_5 [16])

{
  uint uVar1;
  undefined1 auVar2 [16];
  ulong in_x9;
  ulong uVar3;
  byte *pbVar4;
  ulong uVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  byte *pbVar8;
  long lVar9;
  long unaff_x21;
  long unaff_x22;
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
  byte bVar21;
  byte bVar22;
  byte bVar23;
  byte bVar24;
  byte bVar25;
  undefined8 uVar26;
  undefined1 auVar27 [16];
  undefined8 uVar28;
  
  bVar10 = param_5[0] | param_4[0] | param_3[0] | param_2[0];
  bVar11 = param_5[1] | param_4[1] | param_3[1] | param_2[1];
  bVar12 = param_5[2] | param_4[2] | param_3[2] | param_2[2];
  bVar13 = param_5[3] | param_4[3] | param_3[3] | param_2[3];
  bVar14 = param_5[4] | param_4[4] | param_3[4] | param_2[4];
  bVar15 = param_5[5] | param_4[5] | param_3[5] | param_2[5];
  bVar16 = param_5[6] | param_4[6] | param_3[6] | param_2[6];
  bVar17 = param_5[7] | param_4[7] | param_3[7] | param_2[7];
  bVar18 = param_5[8] | param_4[8] | param_3[8] | param_2[8];
  bVar19 = param_5[9] | param_4[9] | param_3[9] | param_2[9];
  bVar20 = param_5[10] | param_4[10] | param_3[10] | param_2[10];
  bVar21 = param_5[0xb] | param_4[0xb] | param_3[0xb] | param_2[0xb];
  bVar22 = param_5[0xc] | param_4[0xc] | param_3[0xc] | param_2[0xc];
  bVar23 = param_5[0xd] | param_4[0xd] | param_3[0xd] | param_2[0xd];
  bVar24 = param_5[0xe] | param_4[0xe] | param_3[0xe] | param_2[0xe];
  bVar25 = param_5[0xf] | param_4[0xf] | param_3[0xf] | param_2[0xf];
  auVar27[1] = bVar11;
  auVar27[0] = bVar10;
  auVar27[2] = bVar12;
  auVar27[3] = bVar13;
  auVar27[4] = bVar14;
  auVar27[5] = bVar15;
  auVar27[6] = bVar16;
  auVar27[7] = bVar17;
  auVar27[8] = bVar18;
  auVar27[9] = bVar19;
  auVar27[10] = bVar20;
  auVar27[0xb] = bVar21;
  auVar27[0xc] = bVar22;
  auVar27[0xd] = bVar23;
  auVar27[0xe] = bVar24;
  auVar27[0xf] = bVar25;
  auVar2[1] = bVar11;
  auVar2[0] = bVar10;
  auVar2[2] = bVar12;
  auVar2[3] = bVar13;
  auVar2[4] = bVar14;
  auVar2[5] = bVar15;
  auVar2[6] = bVar16;
  auVar2[7] = bVar17;
  auVar2[8] = bVar18;
  auVar2[9] = bVar19;
  auVar2[10] = bVar20;
  auVar2[0xb] = bVar21;
  auVar2[0xc] = bVar22;
  auVar2[0xd] = bVar23;
  auVar2[0xe] = bVar24;
  auVar2[0xf] = bVar25;
  auVar27 = NEON_ext(auVar27,auVar2,8,1);
  uVar5 = CONCAT17(bVar17 | auVar27[7],
                   CONCAT16(bVar16 | auVar27[6],
                            CONCAT15(bVar15 | auVar27[5],
                                     CONCAT14(bVar14 | auVar27[4],
                                              CONCAT13(bVar13 | auVar27[3],
                                                       CONCAT12(bVar12 | auVar27[2],
                                                                CONCAT11(bVar11 | auVar27[1],
                                                                         bVar10 | auVar27[0])))))));
  uVar5 = uVar5 | uVar5 >> 0x20;
  uVar5 = uVar5 | uVar5 >> 0x10;
  uVar1 = (uint)uVar5 | (uint)(uVar5 >> 8);
  uVar5 = (ulong)uVar1;
  if (param_1 != in_x9) {
    uVar3 = in_x9;
    if ((param_1 & 0x38) != 0) {
      uVar3 = param_1 & 0xfffffffffffffff8;
      bVar11 = 0;
      bVar12 = 0;
      bVar13 = 0;
      bVar14 = 0;
      bVar15 = 0;
      bVar16 = 0;
      bVar17 = 0;
      bVar10 = (byte)uVar1;
      lVar9 = in_x9 - uVar3;
      puVar6 = (undefined8 *)(unaff_x21 + in_x9);
      puVar7 = (undefined8 *)(unaff_x22 + in_x9);
      do {
        uVar26 = *puVar6;
        uVar28 = *puVar7;
        bVar10 = (byte)uVar28 ^ (byte)uVar26 | bVar10;
        bVar11 = (byte)((ulong)uVar28 >> 8) ^ (byte)((ulong)uVar26 >> 8) | bVar11;
        bVar12 = (byte)((ulong)uVar28 >> 0x10) ^ (byte)((ulong)uVar26 >> 0x10) | bVar12;
        bVar13 = (byte)((ulong)uVar28 >> 0x18) ^ (byte)((ulong)uVar26 >> 0x18) | bVar13;
        bVar14 = (byte)((ulong)uVar28 >> 0x20) ^ (byte)((ulong)uVar26 >> 0x20) | bVar14;
        bVar15 = (byte)((ulong)uVar28 >> 0x28) ^ (byte)((ulong)uVar26 >> 0x28) | bVar15;
        bVar16 = (byte)((ulong)uVar28 >> 0x30) ^ (byte)((ulong)uVar26 >> 0x30) | bVar16;
        bVar17 = (byte)((ulong)uVar28 >> 0x38) ^ (byte)((ulong)uVar26 >> 0x38) | bVar17;
        lVar9 = lVar9 + 8;
        puVar6 = puVar6 + 1;
        puVar7 = puVar7 + 1;
      } while (lVar9 != 0);
      uVar5 = CONCAT17(bVar17,CONCAT16(bVar16,CONCAT15(bVar15,CONCAT14(bVar14,CONCAT13(bVar13,
                                                  CONCAT12(bVar12,CONCAT11(bVar11,bVar10)))))));
      uVar5 = uVar5 | uVar5 >> 0x20;
      uVar5 = uVar5 | uVar5 >> 0x10;
      uVar5 = (ulong)((uint)uVar5 | (uint)(uVar5 >> 8));
      if (param_1 == uVar3) goto LAB_002dc9b8;
    }
    lVar9 = param_1 - uVar3;
    pbVar4 = (byte *)(unaff_x21 + uVar3);
    pbVar8 = (byte *)(unaff_x22 + uVar3);
    do {
      uVar5 = (ulong)((uint)(*pbVar8 ^ *pbVar4) | (uint)uVar5);
      lVar9 = lVar9 + -1;
      pbVar4 = pbVar4 + 1;
      pbVar8 = pbVar8 + 1;
    } while (lVar9 != 0);
  }
LAB_002dc9b8:
  func_0x0036e3d8();
  func_0x0036e3d8();
  func_0x0036e3d8();
  func_0x002d8d08();
  return (uVar5 & 0xff) - 1 >> 0x3f;
}



bool FUN_001ad9e8(ulong param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],long param_5,undefined8 *param_6)

{
  undefined4 uVar1;
  ulong in_x9;
  uint uVar2;
  ulong uVar3;
  undefined4 *puVar4;
  undefined4 *puVar5;
  byte *pbVar6;
  long lVar7;
  byte *pbVar8;
  uint7 uVar9;
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined4 uVar12;
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
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
  byte bVar26;
  byte bVar27;
  byte bVar28;
  byte bVar29;
  byte bVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  
  uVar32 = param_6[1];
  uVar31 = *param_6;
  uVar34 = param_6[3];
  uVar33 = param_6[2];
  auVar13[0] = (byte)uVar31 ^ param_3[0];
  auVar13[1] = (byte)((ulong)uVar31 >> 8) ^ param_3[1];
  auVar13[2] = (byte)((ulong)uVar31 >> 0x10) ^ param_3[2];
  auVar13[3] = (byte)((ulong)uVar31 >> 0x18) ^ param_3[3];
  auVar13[4] = (byte)((ulong)uVar31 >> 0x20) ^ param_3[4];
  auVar13[5] = (byte)((ulong)uVar31 >> 0x28) ^ param_3[5];
  auVar13[6] = (byte)((ulong)uVar31 >> 0x30) ^ param_3[6];
  auVar13[7] = (byte)((ulong)uVar31 >> 0x38) ^ param_3[7];
  auVar13[8] = (byte)uVar32 ^ param_3[8];
  auVar13[9] = (byte)((ulong)uVar32 >> 8) ^ param_3[9];
  auVar13[10] = (byte)((ulong)uVar32 >> 0x10) ^ param_3[10];
  auVar13[0xb] = (byte)((ulong)uVar32 >> 0x18) ^ param_3[0xb];
  auVar13[0xc] = (byte)((ulong)uVar32 >> 0x20) ^ param_3[0xc];
  auVar13[0xd] = (byte)((ulong)uVar32 >> 0x28) ^ param_3[0xd];
  auVar13[0xe] = (byte)((ulong)uVar32 >> 0x30) ^ param_3[0xe];
  auVar13[0xf] = (byte)((ulong)uVar32 >> 0x38) ^ param_3[0xf];
  bVar15 = (byte)uVar33 ^ param_4[0] | auVar13[0];
  bVar16 = (byte)((ulong)uVar33 >> 8) ^ param_4[1] | auVar13[1];
  bVar17 = (byte)((ulong)uVar33 >> 0x10) ^ param_4[2] | auVar13[2];
  bVar18 = (byte)((ulong)uVar33 >> 0x18) ^ param_4[3] | auVar13[3];
  bVar19 = (byte)((ulong)uVar33 >> 0x20) ^ param_4[4] | auVar13[4];
  bVar20 = (byte)((ulong)uVar33 >> 0x28) ^ param_4[5] | auVar13[5];
  bVar21 = (byte)((ulong)uVar33 >> 0x30) ^ param_4[6] | auVar13[6];
  bVar22 = (byte)((ulong)uVar33 >> 0x38) ^ param_4[7] | auVar13[7];
  bVar23 = (byte)uVar34 ^ param_4[8] | auVar13[8];
  bVar24 = (byte)((ulong)uVar34 >> 8) ^ param_4[9] | auVar13[9];
  bVar25 = (byte)((ulong)uVar34 >> 0x10) ^ param_4[10] | auVar13[10];
  bVar26 = (byte)((ulong)uVar34 >> 0x18) ^ param_4[0xb] | auVar13[0xb];
  bVar27 = (byte)((ulong)uVar34 >> 0x20) ^ param_4[0xc] | auVar13[0xc];
  bVar28 = (byte)((ulong)uVar34 >> 0x28) ^ param_4[0xd] | auVar13[0xd];
  bVar29 = (byte)((ulong)uVar34 >> 0x30) ^ param_4[0xe] | auVar13[0xe];
  bVar30 = (byte)((ulong)uVar34 >> 0x38) ^ param_4[0xf] | auVar13[0xf];
  auVar14[1] = bVar16;
  auVar14[0] = bVar15;
  auVar14[2] = bVar17;
  auVar14[3] = bVar18;
  auVar14[4] = bVar19;
  auVar14[5] = bVar20;
  auVar14[6] = bVar21;
  auVar14[7] = bVar22;
  auVar14[8] = bVar23;
  auVar14[9] = bVar24;
  auVar14[10] = bVar25;
  auVar14[0xb] = bVar26;
  auVar14[0xc] = bVar27;
  auVar14[0xd] = bVar28;
  auVar14[0xe] = bVar29;
  auVar14[0xf] = bVar30;
  auVar10[1] = bVar16;
  auVar10[0] = bVar15;
  auVar10[2] = bVar17;
  auVar10[3] = bVar18;
  auVar10[4] = bVar19;
  auVar10[5] = bVar20;
  auVar10[6] = bVar21;
  auVar10[7] = bVar22;
  auVar10[8] = bVar23;
  auVar10[9] = bVar24;
  auVar10[10] = bVar25;
  auVar10[0xb] = bVar26;
  auVar10[0xc] = bVar27;
  auVar10[0xd] = bVar28;
  auVar10[0xe] = bVar29;
  auVar10[0xf] = bVar30;
  auVar10 = auVar10 ^ (auVar14 ^ auVar13) & param_2;
  auVar14 = NEON_ext(auVar10,auVar10,8,1);
  uVar3 = CONCAT17(auVar10[7] | auVar14[7],
                   CONCAT16(auVar10[6] | auVar14[6],
                            CONCAT15(auVar10[5] | auVar14[5],
                                     CONCAT14(auVar10[4] | auVar14[4],
                                              CONCAT13(auVar10[3] | auVar14[3],
                                                       CONCAT12(auVar10[2] | auVar14[2],
                                                                CONCAT11(auVar10[1] | auVar14[1],
                                                                         auVar10[0] | auVar14[0]))))
                                    )));
  uVar3 = uVar3 | uVar3 >> 0x20;
  uVar3 = uVar3 | uVar3 >> 0x10;
  uVar2 = (uint)uVar3 | (uint)(uVar3 >> 8);
  if (param_1 != in_x9) {
    uVar3 = in_x9;
    if ((param_1 & 0xc) != 0) {
      uVar3 = param_1 & 0x3c;
      auVar11._2_14_ = SUB1614(ZEXT816(0),2);
      auVar11._0_2_ = (short)uVar2;
      lVar7 = in_x9 - uVar3;
      puVar4 = (undefined4 *)(param_5 + in_x9);
      puVar5 = (undefined4 *)((long)param_6 + in_x9);
      do {
        uVar12 = *puVar4;
        uVar1 = *puVar5;
        uVar9 = CONCAT16((byte)((uint)uVar1 >> 0x18) ^ (byte)((uint)uVar12 >> 0x18) | auVar11[6],
                         (uint6)CONCAT14((byte)((uint)uVar1 >> 0x10) ^ (byte)((uint)uVar12 >> 0x10)
                                         | auVar11[4],
                                         (uint)CONCAT12((byte)((uint)uVar1 >> 8) ^
                                                        (byte)((uint)uVar12 >> 8) | auVar11[2],
                                                        (ushort)(byte)((byte)uVar1 ^ (byte)uVar12 |
                                                                      auVar11[0]))));
        auVar11 = ZEXT716(uVar9);
        lVar7 = lVar7 + 4;
        puVar4 = puVar4 + 1;
        puVar5 = puVar5 + 1;
      } while (lVar7 != 0);
      uVar9 = uVar9 | uVar9 >> 0x20;
      uVar2 = (uint)uVar9 | (uint)(uVar9 >> 0x10);
      if (param_1 == uVar3) goto LAB_001adaa0;
    }
    lVar7 = param_1 - uVar3;
    pbVar6 = (byte *)((long)param_6 + uVar3);
    pbVar8 = (byte *)(param_5 + uVar3);
    do {
      uVar2 = *pbVar6 ^ *pbVar8 | uVar2;
      lVar7 = lVar7 + -1;
      pbVar6 = pbVar6 + 1;
      pbVar8 = pbVar8 + 1;
    } while (lVar7 != 0);
  }
LAB_001adaa0:
  return (uVar2 & 0xff) == 0;
}


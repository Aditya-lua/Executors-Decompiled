/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa8550
 */

undefined8
CRYPTO_ccm128_decrypt_ccm64(byte *param_1,byte *param_2,byte *param_3,ulong param_4,code *param_5)

{
  byte *pbVar1;
  uint uVar2;
  code *pcVar3;
  byte bVar4;
  byte *pbVar5;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  uint uVar9;
  ulong uVar10;
  byte *pbVar11;
  byte *pbVar12;
  byte *pbVar13;
  byte *pbVar14;
  byte bVar15;
  byte bVar17;
  byte bVar18;
  byte bVar19;
  byte bVar20;
  byte bVar21;
  byte bVar22;
  undefined8 uVar16;
  byte bVar23;
  byte bVar24;
  byte bVar26;
  byte bVar27;
  byte bVar28;
  byte bVar29;
  byte bVar30;
  byte bVar31;
  undefined8 uVar25;
  byte bVar32;
  byte bVar33;
  byte bVar36;
  byte bVar37;
  byte bVar38;
  byte bVar39;
  byte bVar40;
  byte bVar41;
  undefined8 uVar34;
  byte bVar42;
  undefined8 uVar35;
  byte bVar43;
  byte bVar45;
  byte bVar46;
  byte bVar47;
  byte bVar48;
  byte bVar49;
  byte bVar50;
  undefined8 uVar44;
  byte bVar51;
  undefined8 uVar52;
  undefined8 uVar53;
  undefined8 uVar54;
  undefined8 uVar55;
  byte local_70 [8];
  undefined8 uStack_68;
  
  bVar4 = *param_1;
  pcVar3 = *(code **)(param_1 + 0x28);
  uVar35 = *(undefined8 *)(param_1 + 0x30);
  if ((bVar4 >> 6 & 1) == 0) {
    (*pcVar3)(param_1,param_1 + 0x10,uVar35);
  }
  *param_1 = (byte)(bVar4 & 7);
  uVar2 = bVar4 & 7 ^ 0xf;
  uVar6 = 0;
  if ((bVar4 & 7) != 0) {
    uVar7 = (ulong)uVar2;
    do {
      bVar15 = param_1[uVar7];
      param_1[uVar7] = 0;
      uVar7 = uVar7 + 1;
      uVar6 = (uVar6 | bVar15) << 8;
    } while (uVar7 < 0xf);
  }
  bVar15 = param_1[0xf];
  param_1[0xf] = 1;
  if ((uVar6 | bVar15) != param_4) {
    return 0xffffffff;
  }
  uVar6 = param_4 >> 4;
  if (uVar6 != 0) {
    (*param_5)(param_2,param_3,uVar6,uVar35,param_1,param_1 + 0x10);
    uVar7 = param_4 & 0xfffffffffffffff0;
    param_4 = param_4 - uVar7;
    if (param_4 == 0) goto LAB_00aa87b0;
    uVar10 = 0;
    param_2 = param_2 + uVar7;
    param_3 = param_3 + uVar7;
    lVar8 = 0xf;
    do {
      uVar7 = uVar10 + (uVar6 & 0xff) + (ulong)param_1[lVar8];
      param_1[lVar8] = (byte)uVar7;
      if (lVar8 == 8) break;
      uVar10 = uVar7 >> 8;
      uVar7 = uVar7 | uVar6;
      uVar6 = uVar6 >> 8;
      lVar8 = lVar8 + -1;
    } while (uVar7 >> 8 != 0);
  }
  if (param_4 == 0) goto LAB_00aa87b0;
  (*pcVar3)(param_1,local_70,uVar35);
  pbVar1 = param_1 + 0x10;
  if ((param_4 < 0x20) || ((int)(param_4 - 1) == -1)) {
LAB_00aa876c:
    uVar6 = 0;
    uVar9 = 0;
LAB_00aa8778:
    do {
      uVar9 = uVar9 + 1;
      bVar15 = local_70[uVar6];
      bVar17 = param_2[uVar6];
      param_3[uVar6] = bVar17 ^ bVar15;
      pbVar1[uVar6] = pbVar1[uVar6] ^ bVar17 ^ bVar15;
      uVar6 = (ulong)uVar9;
    } while (uVar6 < param_4);
  }
  else {
    uVar6 = 0;
    uVar9 = 0;
    if (param_4 - 1 >> 0x20 != 0) goto LAB_00aa8778;
    pbVar11 = param_1 + 0x10;
    if ((param_3 < pbVar11 + param_4 && pbVar11 < param_3 + param_4) ||
       (param_3 < param_2 + param_4 && param_2 < param_3 + param_4)) goto LAB_00aa876c;
    uVar6 = 0;
    uVar9 = 0;
    if (pbVar11 < param_2 + param_4 && param_2 < pbVar11 + param_4) goto LAB_00aa8778;
    uVar6 = param_4 & 0xffffffffffffffe0;
    pbVar11 = param_2 + 0x10;
    uVar9 = (uint)param_4 & 0xffffffe0;
    pbVar13 = local_70 + 0x10;
    pbVar14 = param_3 + 0x10;
    uVar7 = uVar6;
    pbVar5 = param_1;
    do {
      pbVar12 = pbVar5 + 0x20;
      uVar25 = *(undefined8 *)(pbVar13 + -8);
      uVar16 = *(undefined8 *)(pbVar13 + -0x10);
      uVar44 = *(undefined8 *)(pbVar13 + 8);
      uVar34 = *(undefined8 *)pbVar13;
      uVar53 = *(undefined8 *)(pbVar11 + -8);
      uVar52 = *(undefined8 *)(pbVar11 + -0x10);
      uVar55 = *(undefined8 *)(pbVar11 + 8);
      uVar54 = *(undefined8 *)pbVar11;
      pbVar13 = pbVar13 + 0x20;
      uVar7 = uVar7 - 0x20;
      pbVar11 = pbVar11 + 0x20;
      bVar15 = (byte)uVar52 ^ (byte)uVar16;
      bVar17 = (byte)((ulong)uVar52 >> 8) ^ (byte)((ulong)uVar16 >> 8);
      bVar18 = (byte)((ulong)uVar52 >> 0x10) ^ (byte)((ulong)uVar16 >> 0x10);
      bVar19 = (byte)((ulong)uVar52 >> 0x18) ^ (byte)((ulong)uVar16 >> 0x18);
      bVar20 = (byte)((ulong)uVar52 >> 0x20) ^ (byte)((ulong)uVar16 >> 0x20);
      bVar21 = (byte)((ulong)uVar52 >> 0x28) ^ (byte)((ulong)uVar16 >> 0x28);
      bVar22 = (byte)((ulong)uVar52 >> 0x30) ^ (byte)((ulong)uVar16 >> 0x30);
      bVar23 = (byte)((ulong)uVar52 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38);
      bVar24 = (byte)uVar53 ^ (byte)uVar25;
      bVar26 = (byte)((ulong)uVar53 >> 8) ^ (byte)((ulong)uVar25 >> 8);
      bVar27 = (byte)((ulong)uVar53 >> 0x10) ^ (byte)((ulong)uVar25 >> 0x10);
      bVar28 = (byte)((ulong)uVar53 >> 0x18) ^ (byte)((ulong)uVar25 >> 0x18);
      bVar29 = (byte)((ulong)uVar53 >> 0x20) ^ (byte)((ulong)uVar25 >> 0x20);
      bVar30 = (byte)((ulong)uVar53 >> 0x28) ^ (byte)((ulong)uVar25 >> 0x28);
      bVar31 = (byte)((ulong)uVar53 >> 0x30) ^ (byte)((ulong)uVar25 >> 0x30);
      bVar32 = (byte)((ulong)uVar53 >> 0x38) ^ (byte)((ulong)uVar25 >> 0x38);
      bVar33 = (byte)uVar54 ^ (byte)uVar34;
      bVar36 = (byte)((ulong)uVar54 >> 8) ^ (byte)((ulong)uVar34 >> 8);
      bVar37 = (byte)((ulong)uVar54 >> 0x10) ^ (byte)((ulong)uVar34 >> 0x10);
      bVar38 = (byte)((ulong)uVar54 >> 0x18) ^ (byte)((ulong)uVar34 >> 0x18);
      bVar39 = (byte)((ulong)uVar54 >> 0x20) ^ (byte)((ulong)uVar34 >> 0x20);
      bVar40 = (byte)((ulong)uVar54 >> 0x28) ^ (byte)((ulong)uVar34 >> 0x28);
      bVar41 = (byte)((ulong)uVar54 >> 0x30) ^ (byte)((ulong)uVar34 >> 0x30);
      bVar42 = (byte)((ulong)uVar54 >> 0x38) ^ (byte)((ulong)uVar34 >> 0x38);
      bVar43 = (byte)uVar55 ^ (byte)uVar44;
      bVar45 = (byte)((ulong)uVar55 >> 8) ^ (byte)((ulong)uVar44 >> 8);
      bVar46 = (byte)((ulong)uVar55 >> 0x10) ^ (byte)((ulong)uVar44 >> 0x10);
      bVar47 = (byte)((ulong)uVar55 >> 0x18) ^ (byte)((ulong)uVar44 >> 0x18);
      bVar48 = (byte)((ulong)uVar55 >> 0x20) ^ (byte)((ulong)uVar44 >> 0x20);
      bVar49 = (byte)((ulong)uVar55 >> 0x28) ^ (byte)((ulong)uVar44 >> 0x28);
      bVar50 = (byte)((ulong)uVar55 >> 0x30) ^ (byte)((ulong)uVar44 >> 0x30);
      bVar51 = (byte)((ulong)uVar55 >> 0x38) ^ (byte)((ulong)uVar44 >> 0x38);
      *(ulong *)(pbVar14 + -8) =
           CONCAT17(bVar32,CONCAT16(bVar31,CONCAT15(bVar30,CONCAT14(bVar29,CONCAT13(bVar28,CONCAT12(
                                                  bVar27,CONCAT11(bVar26,bVar24)))))));
      *(ulong *)(pbVar14 + -0x10) =
           CONCAT17(bVar23,CONCAT16(bVar22,CONCAT15(bVar21,CONCAT14(bVar20,CONCAT13(bVar19,CONCAT12(
                                                  bVar18,CONCAT11(bVar17,bVar15)))))));
      *(ulong *)(pbVar14 + 8) =
           CONCAT17(bVar51,CONCAT16(bVar50,CONCAT15(bVar49,CONCAT14(bVar48,CONCAT13(bVar47,CONCAT12(
                                                  bVar46,CONCAT11(bVar45,bVar43)))))));
      *(ulong *)pbVar14 =
           CONCAT17(bVar42,CONCAT16(bVar41,CONCAT15(bVar40,CONCAT14(bVar39,CONCAT13(bVar38,CONCAT12(
                                                  bVar37,CONCAT11(bVar36,bVar33)))))));
      uVar25 = *(undefined8 *)(pbVar5 + 0x18);
      uVar16 = *(undefined8 *)(pbVar5 + 0x10);
      uVar44 = *(undefined8 *)(pbVar5 + 0x28);
      uVar34 = *(undefined8 *)pbVar12;
      pbVar14 = pbVar14 + 0x20;
      *(ulong *)(pbVar5 + 0x18) =
           CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ bVar32,
                    CONCAT16((byte)((ulong)uVar25 >> 0x30) ^ bVar31,
                             CONCAT15((byte)((ulong)uVar25 >> 0x28) ^ bVar30,
                                      CONCAT14((byte)((ulong)uVar25 >> 0x20) ^ bVar29,
                                               CONCAT13((byte)((ulong)uVar25 >> 0x18) ^ bVar28,
                                                        CONCAT12((byte)((ulong)uVar25 >> 0x10) ^
                                                                 bVar27,CONCAT11((byte)((ulong)
                                                  uVar25 >> 8) ^ bVar26,(byte)uVar25 ^ bVar24)))))))
      ;
      *(ulong *)(pbVar5 + 0x10) =
           CONCAT17((byte)((ulong)uVar16 >> 0x38) ^ bVar23,
                    CONCAT16((byte)((ulong)uVar16 >> 0x30) ^ bVar22,
                             CONCAT15((byte)((ulong)uVar16 >> 0x28) ^ bVar21,
                                      CONCAT14((byte)((ulong)uVar16 >> 0x20) ^ bVar20,
                                               CONCAT13((byte)((ulong)uVar16 >> 0x18) ^ bVar19,
                                                        CONCAT12((byte)((ulong)uVar16 >> 0x10) ^
                                                                 bVar18,CONCAT11((byte)((ulong)
                                                  uVar16 >> 8) ^ bVar17,(byte)uVar16 ^ bVar15)))))))
      ;
      *(ulong *)(pbVar5 + 0x28) =
           CONCAT17((byte)((ulong)uVar44 >> 0x38) ^ bVar51,
                    CONCAT16((byte)((ulong)uVar44 >> 0x30) ^ bVar50,
                             CONCAT15((byte)((ulong)uVar44 >> 0x28) ^ bVar49,
                                      CONCAT14((byte)((ulong)uVar44 >> 0x20) ^ bVar48,
                                               CONCAT13((byte)((ulong)uVar44 >> 0x18) ^ bVar47,
                                                        CONCAT12((byte)((ulong)uVar44 >> 0x10) ^
                                                                 bVar46,CONCAT11((byte)((ulong)
                                                  uVar44 >> 8) ^ bVar45,(byte)uVar44 ^ bVar43)))))))
      ;
      *(ulong *)pbVar12 =
           CONCAT17((byte)((ulong)uVar34 >> 0x38) ^ bVar42,
                    CONCAT16((byte)((ulong)uVar34 >> 0x30) ^ bVar41,
                             CONCAT15((byte)((ulong)uVar34 >> 0x28) ^ bVar40,
                                      CONCAT14((byte)((ulong)uVar34 >> 0x20) ^ bVar39,
                                               CONCAT13((byte)((ulong)uVar34 >> 0x18) ^ bVar38,
                                                        CONCAT12((byte)((ulong)uVar34 >> 0x10) ^
                                                                 bVar37,CONCAT11((byte)((ulong)
                                                  uVar34 >> 8) ^ bVar36,(byte)uVar34 ^ bVar33)))))))
      ;
      pbVar5 = pbVar12;
    } while (uVar7 != 0);
    if (param_4 != uVar6) goto LAB_00aa8778;
  }
  (*pcVar3)(pbVar1,pbVar1,uVar35);
LAB_00aa87b0:
  memset(param_1 + uVar2,0,(ulong)(0x10 - uVar2));
  (*pcVar3)(param_1,local_70,uVar35);
  uVar16 = *(undefined8 *)(param_1 + 0x18);
  uVar35 = *(undefined8 *)(param_1 + 0x10);
  *param_1 = bVar4;
  *(ulong *)(param_1 + 0x18) =
       CONCAT17((byte)((ulong)uVar16 >> 0x38) ^ (byte)((ulong)uStack_68 >> 0x38),
                CONCAT16((byte)((ulong)uVar16 >> 0x30) ^ (byte)((ulong)uStack_68 >> 0x30),
                         CONCAT15((byte)((ulong)uVar16 >> 0x28) ^ (byte)((ulong)uStack_68 >> 0x28),
                                  CONCAT14((byte)((ulong)uVar16 >> 0x20) ^
                                           (byte)((ulong)uStack_68 >> 0x20),
                                           CONCAT13((byte)((ulong)uVar16 >> 0x18) ^
                                                    (byte)((ulong)uStack_68 >> 0x18),
                                                    CONCAT12((byte)((ulong)uVar16 >> 0x10) ^
                                                             (byte)((ulong)uStack_68 >> 0x10),
                                                             CONCAT11((byte)((ulong)uVar16 >> 8) ^
                                                                      (byte)((ulong)uStack_68 >> 8),
                                                                      (byte)uVar16 ^ (byte)uStack_68
                                                                     )))))));
  *(ulong *)(param_1 + 0x10) =
       CONCAT17((byte)((ulong)uVar35 >> 0x38) ^ local_70[7],
                CONCAT16((byte)((ulong)uVar35 >> 0x30) ^ local_70[6],
                         CONCAT15((byte)((ulong)uVar35 >> 0x28) ^ local_70[5],
                                  CONCAT14((byte)((ulong)uVar35 >> 0x20) ^ local_70[4],
                                           CONCAT13((byte)((ulong)uVar35 >> 0x18) ^ local_70[3],
                                                    CONCAT12((byte)((ulong)uVar35 >> 0x10) ^
                                                             local_70[2],
                                                             CONCAT11((byte)((ulong)uVar35 >> 8) ^
                                                                      local_70[1],
                                                                      (byte)uVar35 ^ local_70[0]))))
                                 )));
  return 0;
}


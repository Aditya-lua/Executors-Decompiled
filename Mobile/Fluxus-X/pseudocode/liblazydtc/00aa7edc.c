/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa7edc
 */

undefined8 CRYPTO_ccm128_decrypt(byte *param_1,ulong *param_2,ulong *param_3,ulong param_4)

{
  long lVar1;
  byte *pbVar2;
  uint uVar3;
  code *pcVar4;
  byte bVar5;
  byte *pbVar6;
  ulong uVar7;
  ulong uVar8;
  long lVar9;
  uint uVar10;
  ulong uVar11;
  ulong *puVar12;
  byte *pbVar13;
  ulong *puVar14;
  ulong *puVar15;
  byte bVar16;
  byte bVar17;
  byte bVar18;
  byte bVar19;
  byte bVar20;
  byte bVar21;
  byte bVar22;
  byte bVar23;
  byte bVar24;
  byte bVar26;
  byte bVar27;
  byte bVar28;
  byte bVar29;
  byte bVar30;
  byte bVar31;
  ulong uVar25;
  byte bVar32;
  byte bVar33;
  byte bVar36;
  byte bVar37;
  byte bVar38;
  byte bVar39;
  byte bVar40;
  byte bVar41;
  ulong uVar34;
  byte bVar42;
  undefined8 uVar35;
  byte bVar43;
  byte bVar46;
  byte bVar47;
  byte bVar48;
  byte bVar49;
  byte bVar50;
  byte bVar51;
  ulong uVar44;
  byte bVar52;
  undefined8 uVar45;
  ulong uVar53;
  ulong uVar54;
  undefined8 uVar55;
  ulong uVar56;
  undefined8 uVar57;
  ulong uVar58;
  undefined8 uVar59;
  ulong local_70 [2];
  
  bVar5 = *param_1;
  pcVar4 = *(code **)(param_1 + 0x28);
  uVar35 = *(undefined8 *)(param_1 + 0x30);
  if ((bVar5 >> 6 & 1) == 0) {
    (*pcVar4)(param_1,param_1 + 0x10,uVar35);
  }
  *param_1 = (byte)(bVar5 & 7);
  uVar3 = bVar5 & 7 ^ 0xf;
  uVar7 = 0;
  if ((bVar5 & 7) != 0) {
    uVar8 = (ulong)uVar3;
    do {
      bVar16 = param_1[uVar8];
      param_1[uVar8] = 0;
      uVar8 = uVar8 + 1;
      uVar7 = (uVar7 | bVar16) << 8;
    } while (uVar8 < 0xf);
  }
  bVar16 = param_1[0xf];
  param_1[0xf] = 1;
  if ((uVar7 | bVar16) != param_4) {
    return 0xffffffff;
  }
  uVar7 = param_4 - 0x10;
  if (0xf < param_4) {
    uVar8 = uVar7 & 0xfffffffffffffff0;
    lVar1 = uVar8 + 0x10;
    puVar14 = (ulong *)((long)param_3 + lVar1);
    puVar12 = param_2;
    do {
      (*pcVar4)(param_1,local_70,uVar35);
      lVar9 = 0xf;
      do {
        bVar16 = param_1[lVar9];
        param_1[lVar9] = bVar16 + 1;
        if (lVar9 == 8) break;
        lVar9 = lVar9 + -1;
      } while ((byte)(bVar16 + 1) == 0);
      uVar11 = *puVar12;
      *param_3 = uVar11 ^ local_70[0];
      *(ulong *)(param_1 + 0x10) = *(ulong *)(param_1 + 0x10) ^ uVar11 ^ local_70[0];
      uVar11 = puVar12[1];
      param_3[1] = uVar11 ^ local_70[1];
      *(ulong *)(param_1 + 0x18) = *(ulong *)(param_1 + 0x18) ^ uVar11 ^ local_70[1];
      (*pcVar4)(param_1 + 0x10,param_1 + 0x10,uVar35);
      param_4 = param_4 - 0x10;
      puVar12 = puVar12 + 2;
      param_3 = param_3 + 2;
    } while (0xf < param_4);
    param_2 = (ulong *)((long)param_2 + lVar1);
    param_4 = uVar7 - uVar8;
    param_3 = puVar14;
  }
  if (param_4 == 0) goto LAB_00aa81a4;
  (*pcVar4)(param_1,local_70,uVar35);
  pbVar2 = param_1 + 0x10;
  if ((param_4 < 0x20) || ((int)(param_4 - 1) == -1)) {
LAB_00aa8160:
    uVar7 = 0;
    uVar10 = 0;
LAB_00aa816c:
    do {
      uVar10 = uVar10 + 1;
      bVar16 = *(byte *)((long)param_2 + uVar7) ^ *(byte *)((long)local_70 + uVar7);
      *(byte *)((long)param_3 + uVar7) = bVar16;
      pbVar2[uVar7] = pbVar2[uVar7] ^ bVar16;
      uVar7 = (ulong)uVar10;
    } while (uVar7 < param_4);
  }
  else {
    uVar7 = 0;
    uVar10 = 0;
    if (param_4 - 1 >> 0x20 != 0) goto LAB_00aa816c;
    puVar12 = (ulong *)(param_1 + 0x10);
    if ((param_3 < (ulong *)((long)puVar12 + param_4) &&
         puVar12 < (ulong *)((long)param_3 + param_4)) ||
       (param_3 < (ulong *)((long)param_2 + param_4) && param_2 < (ulong *)((long)param_3 + param_4)
       )) goto LAB_00aa8160;
    uVar7 = 0;
    uVar10 = 0;
    if (puVar12 < (ulong *)((long)param_2 + param_4) && param_2 < (ulong *)((long)puVar12 + param_4)
       ) goto LAB_00aa816c;
    uVar7 = param_4 & 0xffffffffffffffe0;
    puVar12 = param_2 + 2;
    uVar10 = (uint)param_4 & 0xffffffe0;
    puVar14 = local_70 + 2;
    puVar15 = param_3 + 2;
    uVar8 = uVar7;
    pbVar6 = param_1;
    do {
      pbVar13 = pbVar6 + 0x20;
      uVar25 = puVar14[-1];
      uVar11 = puVar14[-2];
      uVar44 = puVar14[1];
      uVar34 = *puVar14;
      uVar54 = puVar12[-1];
      uVar53 = puVar12[-2];
      uVar58 = puVar12[1];
      uVar56 = *puVar12;
      puVar14 = puVar14 + 4;
      uVar8 = uVar8 - 0x20;
      puVar12 = puVar12 + 4;
      bVar16 = (byte)uVar53 ^ (byte)uVar11;
      bVar17 = (byte)(uVar53 >> 8) ^ (byte)(uVar11 >> 8);
      bVar18 = (byte)(uVar53 >> 0x10) ^ (byte)(uVar11 >> 0x10);
      bVar19 = (byte)(uVar53 >> 0x18) ^ (byte)(uVar11 >> 0x18);
      bVar20 = (byte)(uVar53 >> 0x20) ^ (byte)(uVar11 >> 0x20);
      bVar21 = (byte)(uVar53 >> 0x28) ^ (byte)(uVar11 >> 0x28);
      bVar22 = (byte)(uVar53 >> 0x30) ^ (byte)(uVar11 >> 0x30);
      bVar23 = (byte)(uVar53 >> 0x38) ^ (byte)(uVar11 >> 0x38);
      bVar24 = (byte)uVar54 ^ (byte)uVar25;
      bVar26 = (byte)(uVar54 >> 8) ^ (byte)(uVar25 >> 8);
      bVar27 = (byte)(uVar54 >> 0x10) ^ (byte)(uVar25 >> 0x10);
      bVar28 = (byte)(uVar54 >> 0x18) ^ (byte)(uVar25 >> 0x18);
      bVar29 = (byte)(uVar54 >> 0x20) ^ (byte)(uVar25 >> 0x20);
      bVar30 = (byte)(uVar54 >> 0x28) ^ (byte)(uVar25 >> 0x28);
      bVar31 = (byte)(uVar54 >> 0x30) ^ (byte)(uVar25 >> 0x30);
      bVar32 = (byte)(uVar54 >> 0x38) ^ (byte)(uVar25 >> 0x38);
      bVar33 = (byte)uVar56 ^ (byte)uVar34;
      bVar36 = (byte)(uVar56 >> 8) ^ (byte)(uVar34 >> 8);
      bVar37 = (byte)(uVar56 >> 0x10) ^ (byte)(uVar34 >> 0x10);
      bVar38 = (byte)(uVar56 >> 0x18) ^ (byte)(uVar34 >> 0x18);
      bVar39 = (byte)(uVar56 >> 0x20) ^ (byte)(uVar34 >> 0x20);
      bVar40 = (byte)(uVar56 >> 0x28) ^ (byte)(uVar34 >> 0x28);
      bVar41 = (byte)(uVar56 >> 0x30) ^ (byte)(uVar34 >> 0x30);
      bVar42 = (byte)(uVar56 >> 0x38) ^ (byte)(uVar34 >> 0x38);
      bVar43 = (byte)uVar58 ^ (byte)uVar44;
      bVar46 = (byte)(uVar58 >> 8) ^ (byte)(uVar44 >> 8);
      bVar47 = (byte)(uVar58 >> 0x10) ^ (byte)(uVar44 >> 0x10);
      bVar48 = (byte)(uVar58 >> 0x18) ^ (byte)(uVar44 >> 0x18);
      bVar49 = (byte)(uVar58 >> 0x20) ^ (byte)(uVar44 >> 0x20);
      bVar50 = (byte)(uVar58 >> 0x28) ^ (byte)(uVar44 >> 0x28);
      bVar51 = (byte)(uVar58 >> 0x30) ^ (byte)(uVar44 >> 0x30);
      bVar52 = (byte)(uVar58 >> 0x38) ^ (byte)(uVar44 >> 0x38);
      puVar15[-1] = CONCAT17(bVar32,CONCAT16(bVar31,CONCAT15(bVar30,CONCAT14(bVar29,CONCAT13(bVar28,
                                                  CONCAT12(bVar27,CONCAT11(bVar26,bVar24)))))));
      puVar15[-2] = CONCAT17(bVar23,CONCAT16(bVar22,CONCAT15(bVar21,CONCAT14(bVar20,CONCAT13(bVar19,
                                                  CONCAT12(bVar18,CONCAT11(bVar17,bVar16)))))));
      puVar15[1] = CONCAT17(bVar52,CONCAT16(bVar51,CONCAT15(bVar50,CONCAT14(bVar49,CONCAT13(bVar48,
                                                  CONCAT12(bVar47,CONCAT11(bVar46,bVar43)))))));
      *puVar15 = CONCAT17(bVar42,CONCAT16(bVar41,CONCAT15(bVar40,CONCAT14(bVar39,CONCAT13(bVar38,
                                                  CONCAT12(bVar37,CONCAT11(bVar36,bVar33)))))));
      uVar55 = *(undefined8 *)(pbVar6 + 0x18);
      uVar45 = *(undefined8 *)(pbVar6 + 0x10);
      uVar59 = *(undefined8 *)(pbVar6 + 0x28);
      uVar57 = *(undefined8 *)pbVar13;
      puVar15 = puVar15 + 4;
      *(ulong *)(pbVar6 + 0x18) =
           CONCAT17((byte)((ulong)uVar55 >> 0x38) ^ bVar32,
                    CONCAT16((byte)((ulong)uVar55 >> 0x30) ^ bVar31,
                             CONCAT15((byte)((ulong)uVar55 >> 0x28) ^ bVar30,
                                      CONCAT14((byte)((ulong)uVar55 >> 0x20) ^ bVar29,
                                               CONCAT13((byte)((ulong)uVar55 >> 0x18) ^ bVar28,
                                                        CONCAT12((byte)((ulong)uVar55 >> 0x10) ^
                                                                 bVar27,CONCAT11((byte)((ulong)
                                                  uVar55 >> 8) ^ bVar26,(byte)uVar55 ^ bVar24)))))))
      ;
      *(ulong *)(pbVar6 + 0x10) =
           CONCAT17((byte)((ulong)uVar45 >> 0x38) ^ bVar23,
                    CONCAT16((byte)((ulong)uVar45 >> 0x30) ^ bVar22,
                             CONCAT15((byte)((ulong)uVar45 >> 0x28) ^ bVar21,
                                      CONCAT14((byte)((ulong)uVar45 >> 0x20) ^ bVar20,
                                               CONCAT13((byte)((ulong)uVar45 >> 0x18) ^ bVar19,
                                                        CONCAT12((byte)((ulong)uVar45 >> 0x10) ^
                                                                 bVar18,CONCAT11((byte)((ulong)
                                                  uVar45 >> 8) ^ bVar17,(byte)uVar45 ^ bVar16)))))))
      ;
      *(ulong *)(pbVar6 + 0x28) =
           CONCAT17((byte)((ulong)uVar59 >> 0x38) ^ bVar52,
                    CONCAT16((byte)((ulong)uVar59 >> 0x30) ^ bVar51,
                             CONCAT15((byte)((ulong)uVar59 >> 0x28) ^ bVar50,
                                      CONCAT14((byte)((ulong)uVar59 >> 0x20) ^ bVar49,
                                               CONCAT13((byte)((ulong)uVar59 >> 0x18) ^ bVar48,
                                                        CONCAT12((byte)((ulong)uVar59 >> 0x10) ^
                                                                 bVar47,CONCAT11((byte)((ulong)
                                                  uVar59 >> 8) ^ bVar46,(byte)uVar59 ^ bVar43)))))))
      ;
      *(ulong *)pbVar13 =
           CONCAT17((byte)((ulong)uVar57 >> 0x38) ^ bVar42,
                    CONCAT16((byte)((ulong)uVar57 >> 0x30) ^ bVar41,
                             CONCAT15((byte)((ulong)uVar57 >> 0x28) ^ bVar40,
                                      CONCAT14((byte)((ulong)uVar57 >> 0x20) ^ bVar39,
                                               CONCAT13((byte)((ulong)uVar57 >> 0x18) ^ bVar38,
                                                        CONCAT12((byte)((ulong)uVar57 >> 0x10) ^
                                                                 bVar37,CONCAT11((byte)((ulong)
                                                  uVar57 >> 8) ^ bVar36,(byte)uVar57 ^ bVar33)))))))
      ;
      pbVar6 = pbVar13;
    } while (uVar8 != 0);
    if (param_4 != uVar7) goto LAB_00aa816c;
  }
  (*pcVar4)(pbVar2,pbVar2,uVar35);
LAB_00aa81a4:
  memset(param_1 + uVar3,0,(ulong)(0x10 - uVar3));
  (*pcVar4)(param_1,local_70,uVar35);
  uVar45 = *(undefined8 *)(param_1 + 0x18);
  uVar35 = *(undefined8 *)(param_1 + 0x10);
  *param_1 = bVar5;
  *(ulong *)(param_1 + 0x18) =
       CONCAT17((byte)((ulong)uVar45 >> 0x38) ^ (byte)(local_70[1] >> 0x38),
                CONCAT16((byte)((ulong)uVar45 >> 0x30) ^ (byte)(local_70[1] >> 0x30),
                         CONCAT15((byte)((ulong)uVar45 >> 0x28) ^ (byte)(local_70[1] >> 0x28),
                                  CONCAT14((byte)((ulong)uVar45 >> 0x20) ^
                                           (byte)(local_70[1] >> 0x20),
                                           CONCAT13((byte)((ulong)uVar45 >> 0x18) ^
                                                    (byte)(local_70[1] >> 0x18),
                                                    CONCAT12((byte)((ulong)uVar45 >> 0x10) ^
                                                             (byte)(local_70[1] >> 0x10),
                                                             CONCAT11((byte)((ulong)uVar45 >> 8) ^
                                                                      (byte)(local_70[1] >> 8),
                                                                      (byte)uVar45 ^
                                                                      (byte)local_70[1])))))));
  *(ulong *)(param_1 + 0x10) =
       CONCAT17((byte)((ulong)uVar35 >> 0x38) ^ (byte)(local_70[0] >> 0x38),
                CONCAT16((byte)((ulong)uVar35 >> 0x30) ^ (byte)(local_70[0] >> 0x30),
                         CONCAT15((byte)((ulong)uVar35 >> 0x28) ^ (byte)(local_70[0] >> 0x28),
                                  CONCAT14((byte)((ulong)uVar35 >> 0x20) ^
                                           (byte)(local_70[0] >> 0x20),
                                           CONCAT13((byte)((ulong)uVar35 >> 0x18) ^
                                                    (byte)(local_70[0] >> 0x18),
                                                    CONCAT12((byte)((ulong)uVar35 >> 0x10) ^
                                                             (byte)(local_70[0] >> 0x10),
                                                             CONCAT11((byte)((ulong)uVar35 >> 8) ^
                                                                      (byte)(local_70[0] >> 8),
                                                                      (byte)uVar35 ^
                                                                      (byte)local_70[0])))))));
  return 0;
}


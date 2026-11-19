/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a02ad4
 */

void BN_consttime_swap(ulong param_1,ulong *param_2,ulong *param_3,uint param_4)

{
  uint uVar1;
  uint uVar2;
  ulong uVar3;
  undefined8 *puVar4;
  ulong *puVar5;
  undefined8 *puVar6;
  ulong *puVar7;
  ulong uVar8;
  long lVar9;
  ulong uVar10;
  ulong uVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  byte bVar15;
  byte bVar16;
  byte bVar17;
  byte bVar18;
  byte bVar19;
  byte bVar20;
  undefined8 uVar14;
  byte bVar21;
  byte bVar23;
  byte bVar24;
  byte bVar25;
  byte bVar26;
  byte bVar27;
  byte bVar28;
  undefined8 uVar22;
  byte bVar29;
  byte bVar30;
  byte bVar32;
  byte bVar33;
  byte bVar34;
  byte bVar35;
  byte bVar36;
  byte bVar37;
  undefined8 uVar31;
  byte bVar38;
  byte bVar39;
  byte bVar41;
  byte bVar42;
  byte bVar43;
  byte bVar44;
  byte bVar45;
  byte bVar46;
  undefined8 uVar40;
  byte bVar47;
  
  if (param_2 != param_3) {
    uVar3 = 0xffffffffffffffff - ((long)(param_1 - 1 & (param_1 ^ 0xffffffffffffffff)) >> 0x3f);
    uVar2 = (uint)uVar3;
    uVar1 = ((uint)param_3[1] ^ (uint)param_2[1]) & uVar2;
    *(uint *)(param_2 + 1) = uVar1 ^ (uint)param_2[1];
    *(uint *)(param_3 + 1) = (uint)param_3[1] ^ uVar1;
    uVar1 = ((uint)param_3[2] ^ (uint)param_2[2]) & uVar2;
    *(uint *)(param_2 + 2) = uVar1 ^ (uint)param_2[2];
    *(uint *)(param_3 + 2) = (uint)param_3[2] ^ uVar1;
    uVar1 = uVar2 & (*(uint *)((long)param_3 + 0x14) ^ *(uint *)((long)param_2 + 0x14)) & 4;
    *(uint *)((long)param_2 + 0x14) = uVar1 ^ *(uint *)((long)param_2 + 0x14);
    *(uint *)((long)param_3 + 0x14) = uVar1 ^ *(uint *)((long)param_3 + 0x14);
    if (0 < (int)param_4) {
      puVar4 = (undefined8 *)*param_2;
      puVar6 = (undefined8 *)*param_3;
      uVar10 = 0;
      uVar8 = (ulong)param_4;
      if ((param_4 != 1) && ((puVar6 + uVar8 <= puVar4 || (uVar10 = 0, puVar4 + uVar8 <= puVar6))))
      {
        uVar10 = uVar8 & 0xfffffffe;
        uVar11 = uVar10;
        puVar12 = puVar6;
        puVar13 = puVar4;
        do {
          uVar22 = puVar13[1];
          uVar14 = *puVar13;
          uVar40 = puVar12[1];
          uVar31 = *puVar12;
          uVar11 = uVar11 - 2;
          bVar15 = (byte)((ulong)uVar14 >> 8);
          bVar16 = (byte)((ulong)uVar14 >> 0x10);
          bVar17 = (byte)((ulong)uVar14 >> 0x18);
          bVar18 = (byte)((ulong)uVar14 >> 0x20);
          bVar19 = (byte)((ulong)uVar14 >> 0x28);
          bVar20 = (byte)((ulong)uVar14 >> 0x30);
          bVar21 = (byte)((ulong)uVar14 >> 0x38);
          bVar23 = (byte)((ulong)uVar22 >> 8);
          bVar24 = (byte)((ulong)uVar22 >> 0x10);
          bVar25 = (byte)((ulong)uVar22 >> 0x18);
          bVar26 = (byte)((ulong)uVar22 >> 0x20);
          bVar27 = (byte)((ulong)uVar22 >> 0x28);
          bVar28 = (byte)((ulong)uVar22 >> 0x30);
          bVar29 = (byte)((ulong)uVar22 >> 0x38);
          bVar30 = ((byte)uVar31 ^ (byte)uVar14) & (byte)uVar3;
          bVar41 = (byte)(uVar3 >> 8);
          bVar32 = ((byte)((ulong)uVar31 >> 8) ^ bVar15) & bVar41;
          bVar42 = (byte)(uVar3 >> 0x10);
          bVar33 = ((byte)((ulong)uVar31 >> 0x10) ^ bVar16) & bVar42;
          bVar43 = (byte)(uVar3 >> 0x18);
          bVar34 = ((byte)((ulong)uVar31 >> 0x18) ^ bVar17) & bVar43;
          bVar44 = (byte)(uVar3 >> 0x20);
          bVar35 = ((byte)((ulong)uVar31 >> 0x20) ^ bVar18) & bVar44;
          bVar45 = (byte)(uVar3 >> 0x28);
          bVar36 = ((byte)((ulong)uVar31 >> 0x28) ^ bVar19) & bVar45;
          bVar46 = (byte)(uVar3 >> 0x30);
          bVar37 = ((byte)((ulong)uVar31 >> 0x30) ^ bVar20) & bVar46;
          bVar47 = (byte)(uVar3 >> 0x38);
          bVar38 = ((byte)((ulong)uVar31 >> 0x38) ^ bVar21) & bVar47;
          bVar39 = ((byte)uVar40 ^ (byte)uVar22) & (byte)uVar3;
          bVar41 = ((byte)((ulong)uVar40 >> 8) ^ bVar23) & bVar41;
          bVar42 = ((byte)((ulong)uVar40 >> 0x10) ^ bVar24) & bVar42;
          bVar43 = ((byte)((ulong)uVar40 >> 0x18) ^ bVar25) & bVar43;
          bVar44 = ((byte)((ulong)uVar40 >> 0x20) ^ bVar26) & bVar44;
          bVar45 = ((byte)((ulong)uVar40 >> 0x28) ^ bVar27) & bVar45;
          bVar46 = ((byte)((ulong)uVar40 >> 0x30) ^ bVar28) & bVar46;
          bVar47 = ((byte)((ulong)uVar40 >> 0x38) ^ bVar29) & bVar47;
          puVar13[1] = CONCAT17(bVar47 ^ bVar29,
                                CONCAT16(bVar46 ^ bVar28,
                                         CONCAT15(bVar45 ^ bVar27,
                                                  CONCAT14(bVar44 ^ bVar26,
                                                           CONCAT13(bVar43 ^ bVar25,
                                                                    CONCAT12(bVar42 ^ bVar24,
                                                                             CONCAT11(bVar41 ^ 
                                                  bVar23,bVar39 ^ (byte)uVar22)))))));
          *puVar13 = CONCAT17(bVar38 ^ bVar21,
                              CONCAT16(bVar37 ^ bVar20,
                                       CONCAT15(bVar36 ^ bVar19,
                                                CONCAT14(bVar35 ^ bVar18,
                                                         CONCAT13(bVar34 ^ bVar17,
                                                                  CONCAT12(bVar33 ^ bVar16,
                                                                           CONCAT11(bVar32 ^ bVar15,
                                                                                    bVar30 ^ (byte)
                                                  uVar14)))))));
          uVar22 = puVar12[1];
          uVar14 = *puVar12;
          puVar12[1] = CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ bVar47,
                                CONCAT16((byte)((ulong)uVar22 >> 0x30) ^ bVar46,
                                         CONCAT15((byte)((ulong)uVar22 >> 0x28) ^ bVar45,
                                                  CONCAT14((byte)((ulong)uVar22 >> 0x20) ^ bVar44,
                                                           CONCAT13((byte)((ulong)uVar22 >> 0x18) ^
                                                                    bVar43,CONCAT12((byte)((ulong)
                                                  uVar22 >> 0x10) ^ bVar42,
                                                  CONCAT11((byte)((ulong)uVar22 >> 8) ^ bVar41,
                                                           (byte)uVar22 ^ bVar39)))))));
          *puVar12 = CONCAT17((byte)((ulong)uVar14 >> 0x38) ^ bVar38,
                              CONCAT16((byte)((ulong)uVar14 >> 0x30) ^ bVar37,
                                       CONCAT15((byte)((ulong)uVar14 >> 0x28) ^ bVar36,
                                                CONCAT14((byte)((ulong)uVar14 >> 0x20) ^ bVar35,
                                                         CONCAT13((byte)((ulong)uVar14 >> 0x18) ^
                                                                  bVar34,CONCAT12((byte)((ulong)
                                                  uVar14 >> 0x10) ^ bVar33,
                                                  CONCAT11((byte)((ulong)uVar14 >> 8) ^ bVar32,
                                                           (byte)uVar14 ^ bVar30)))))));
          puVar12 = puVar12 + 2;
          puVar13 = puVar13 + 2;
        } while (uVar11 != 0);
        if (uVar10 == uVar8) {
          return;
        }
      }
      lVar9 = uVar8 - uVar10;
      puVar5 = puVar4 + uVar10;
      puVar7 = puVar6 + uVar10;
      do {
        lVar9 = lVar9 + -1;
        uVar8 = (*puVar7 ^ *puVar5) & uVar3;
        *puVar5 = uVar8 ^ *puVar5;
        *puVar7 = *puVar7 ^ uVar8;
        puVar5 = puVar5 + 1;
        puVar7 = puVar7 + 1;
      } while (lVar9 != 0);
    }
  }
  return;
}


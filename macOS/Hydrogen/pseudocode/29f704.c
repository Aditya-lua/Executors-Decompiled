
void FUN_0029f704(ulong param_1,undefined1 param_2 [16],undefined1 param_3 [16])

{
  ulong in_x9;
  ulong *puVar1;
  long in_x10;
  long lVar2;
  undefined8 *in_x11;
  ulong *puVar3;
  undefined8 *in_x12;
  long in_x13;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
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
  byte bVar31;
  byte bVar32;
  byte bVar33;
  byte bVar34;
  byte bVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  undefined8 uVar38;
  undefined8 uVar39;
  undefined8 uVar40;
  undefined8 uVar41;
  undefined8 uVar42;
  undefined8 uVar43;
  undefined8 uVar44;
  undefined8 uVar45;
  undefined8 uVar46;
  undefined8 uVar47;
  undefined8 uVar48;
  undefined8 uVar49;
  undefined8 uVar50;
  undefined8 uVar51;
  
  bVar35 = param_3[0xf];
  bVar34 = param_3[0xe];
  bVar33 = param_3[0xd];
  bVar32 = param_3[0xc];
  bVar31 = param_3[0xb];
  bVar30 = param_3[10];
  bVar29 = param_3[9];
  bVar28 = param_3[8];
  bVar27 = param_3[7];
  bVar26 = param_3[6];
  bVar25 = param_3[5];
  bVar24 = param_3[4];
  bVar23 = param_3[3];
  bVar22 = param_3[2];
  bVar21 = param_3[1];
  bVar20 = param_3[0];
  bVar19 = param_2[0xf];
  bVar18 = param_2[0xe];
  bVar17 = param_2[0xd];
  bVar16 = param_2[0xc];
  bVar15 = param_2[0xb];
  bVar14 = param_2[10];
  bVar13 = param_2[9];
  bVar12 = param_2[8];
  bVar11 = param_2[7];
  bVar10 = param_2[6];
  bVar9 = param_2[5];
  bVar8 = param_2[4];
  bVar7 = param_2[3];
  bVar6 = param_2[2];
  bVar5 = param_2[1];
  bVar4 = param_2[0];
  do {
    uVar37 = in_x11[-3];
    uVar36 = in_x11[-4];
    uVar39 = in_x11[-1];
    uVar38 = in_x11[-2];
    uVar41 = in_x11[1];
    uVar40 = *in_x11;
    uVar43 = in_x11[3];
    uVar42 = in_x11[2];
    uVar45 = in_x12[-3];
    uVar44 = in_x12[-4];
    uVar47 = in_x12[-1];
    uVar46 = in_x12[-2];
    uVar49 = in_x12[1];
    uVar48 = *in_x12;
    uVar51 = in_x12[3];
    uVar50 = in_x12[2];
    in_x11[-3] = CONCAT17((byte)((ulong)uVar45 >> 0x38) & bVar35 |
                          (byte)((ulong)uVar37 >> 0x38) & bVar19,
                          CONCAT16((byte)((ulong)uVar45 >> 0x30) & bVar34 |
                                   (byte)((ulong)uVar37 >> 0x30) & bVar18,
                                   CONCAT15((byte)((ulong)uVar45 >> 0x28) & bVar33 |
                                            (byte)((ulong)uVar37 >> 0x28) & bVar17,
                                            CONCAT14((byte)((ulong)uVar45 >> 0x20) & bVar32 |
                                                     (byte)((ulong)uVar37 >> 0x20) & bVar16,
                                                     CONCAT13((byte)((ulong)uVar45 >> 0x18) & bVar31
                                                              | (byte)((ulong)uVar37 >> 0x18) &
                                                                bVar15,CONCAT12((byte)((ulong)uVar45
                                                                                      >> 0x10) &
                                                                                bVar30 | (byte)((
                                                  ulong)uVar37 >> 0x10) & bVar14,
                                                  CONCAT11((byte)((ulong)uVar45 >> 8) & bVar29 |
                                                           (byte)((ulong)uVar37 >> 8) & bVar13,
                                                           (byte)uVar45 & bVar28 |
                                                           (byte)uVar37 & bVar12)))))));
    in_x11[-4] = CONCAT17((byte)((ulong)uVar44 >> 0x38) & bVar27 |
                          (byte)((ulong)uVar36 >> 0x38) & bVar11,
                          CONCAT16((byte)((ulong)uVar44 >> 0x30) & bVar26 |
                                   (byte)((ulong)uVar36 >> 0x30) & bVar10,
                                   CONCAT15((byte)((ulong)uVar44 >> 0x28) & bVar25 |
                                            (byte)((ulong)uVar36 >> 0x28) & bVar9,
                                            CONCAT14((byte)((ulong)uVar44 >> 0x20) & bVar24 |
                                                     (byte)((ulong)uVar36 >> 0x20) & bVar8,
                                                     CONCAT13((byte)((ulong)uVar44 >> 0x18) & bVar23
                                                              | (byte)((ulong)uVar36 >> 0x18) &
                                                                bVar7,CONCAT12((byte)((ulong)uVar44
                                                                                     >> 0x10) &
                                                                               bVar22 | (byte)((
                                                  ulong)uVar36 >> 0x10) & bVar6,
                                                  CONCAT11((byte)((ulong)uVar44 >> 8) & bVar21 |
                                                           (byte)((ulong)uVar36 >> 8) & bVar5,
                                                           (byte)uVar44 & bVar20 |
                                                           (byte)uVar36 & bVar4)))))));
    in_x11[-1] = CONCAT17((byte)((ulong)uVar47 >> 0x38) & bVar35 |
                          (byte)((ulong)uVar39 >> 0x38) & bVar19,
                          CONCAT16((byte)((ulong)uVar47 >> 0x30) & bVar34 |
                                   (byte)((ulong)uVar39 >> 0x30) & bVar18,
                                   CONCAT15((byte)((ulong)uVar47 >> 0x28) & bVar33 |
                                            (byte)((ulong)uVar39 >> 0x28) & bVar17,
                                            CONCAT14((byte)((ulong)uVar47 >> 0x20) & bVar32 |
                                                     (byte)((ulong)uVar39 >> 0x20) & bVar16,
                                                     CONCAT13((byte)((ulong)uVar47 >> 0x18) & bVar31
                                                              | (byte)((ulong)uVar39 >> 0x18) &
                                                                bVar15,CONCAT12((byte)((ulong)uVar47
                                                                                      >> 0x10) &
                                                                                bVar30 | (byte)((
                                                  ulong)uVar39 >> 0x10) & bVar14,
                                                  CONCAT11((byte)((ulong)uVar47 >> 8) & bVar29 |
                                                           (byte)((ulong)uVar39 >> 8) & bVar13,
                                                           (byte)uVar47 & bVar28 |
                                                           (byte)uVar39 & bVar12)))))));
    in_x11[-2] = CONCAT17((byte)((ulong)uVar46 >> 0x38) & bVar27 |
                          (byte)((ulong)uVar38 >> 0x38) & bVar11,
                          CONCAT16((byte)((ulong)uVar46 >> 0x30) & bVar26 |
                                   (byte)((ulong)uVar38 >> 0x30) & bVar10,
                                   CONCAT15((byte)((ulong)uVar46 >> 0x28) & bVar25 |
                                            (byte)((ulong)uVar38 >> 0x28) & bVar9,
                                            CONCAT14((byte)((ulong)uVar46 >> 0x20) & bVar24 |
                                                     (byte)((ulong)uVar38 >> 0x20) & bVar8,
                                                     CONCAT13((byte)((ulong)uVar46 >> 0x18) & bVar23
                                                              | (byte)((ulong)uVar38 >> 0x18) &
                                                                bVar7,CONCAT12((byte)((ulong)uVar46
                                                                                     >> 0x10) &
                                                                               bVar22 | (byte)((
                                                  ulong)uVar38 >> 0x10) & bVar6,
                                                  CONCAT11((byte)((ulong)uVar46 >> 8) & bVar21 |
                                                           (byte)((ulong)uVar38 >> 8) & bVar5,
                                                           (byte)uVar46 & bVar20 |
                                                           (byte)uVar38 & bVar4)))))));
    in_x11[1] = CONCAT17((byte)((ulong)uVar49 >> 0x38) & bVar35 |
                         (byte)((ulong)uVar41 >> 0x38) & bVar19,
                         CONCAT16((byte)((ulong)uVar49 >> 0x30) & bVar34 |
                                  (byte)((ulong)uVar41 >> 0x30) & bVar18,
                                  CONCAT15((byte)((ulong)uVar49 >> 0x28) & bVar33 |
                                           (byte)((ulong)uVar41 >> 0x28) & bVar17,
                                           CONCAT14((byte)((ulong)uVar49 >> 0x20) & bVar32 |
                                                    (byte)((ulong)uVar41 >> 0x20) & bVar16,
                                                    CONCAT13((byte)((ulong)uVar49 >> 0x18) & bVar31
                                                             | (byte)((ulong)uVar41 >> 0x18) &
                                                               bVar15,CONCAT12((byte)((ulong)uVar49
                                                                                     >> 0x10) &
                                                                               bVar30 | (byte)((
                                                  ulong)uVar41 >> 0x10) & bVar14,
                                                  CONCAT11((byte)((ulong)uVar49 >> 8) & bVar29 |
                                                           (byte)((ulong)uVar41 >> 8) & bVar13,
                                                           (byte)uVar49 & bVar28 |
                                                           (byte)uVar41 & bVar12)))))));
    *in_x11 = CONCAT17((byte)((ulong)uVar48 >> 0x38) & bVar27 |
                       (byte)((ulong)uVar40 >> 0x38) & bVar11,
                       CONCAT16((byte)((ulong)uVar48 >> 0x30) & bVar26 |
                                (byte)((ulong)uVar40 >> 0x30) & bVar10,
                                CONCAT15((byte)((ulong)uVar48 >> 0x28) & bVar25 |
                                         (byte)((ulong)uVar40 >> 0x28) & bVar9,
                                         CONCAT14((byte)((ulong)uVar48 >> 0x20) & bVar24 |
                                                  (byte)((ulong)uVar40 >> 0x20) & bVar8,
                                                  CONCAT13((byte)((ulong)uVar48 >> 0x18) & bVar23 |
                                                           (byte)((ulong)uVar40 >> 0x18) & bVar7,
                                                           CONCAT12((byte)((ulong)uVar48 >> 0x10) &
                                                                    bVar22 | (byte)((ulong)uVar40 >>
                                                                                   0x10) & bVar6,
                                                                    CONCAT11((byte)((ulong)uVar48 >>
                                                                                   8) & bVar21 |
                                                                             (byte)((ulong)uVar40 >>
                                                                                   8) & bVar5,
                                                                             (byte)uVar48 & bVar20 |
                                                                             (byte)uVar40 & bVar4)))
                                                 ))));
    in_x11[3] = CONCAT17((byte)((ulong)uVar51 >> 0x38) & bVar35 |
                         (byte)((ulong)uVar43 >> 0x38) & bVar19,
                         CONCAT16((byte)((ulong)uVar51 >> 0x30) & bVar34 |
                                  (byte)((ulong)uVar43 >> 0x30) & bVar18,
                                  CONCAT15((byte)((ulong)uVar51 >> 0x28) & bVar33 |
                                           (byte)((ulong)uVar43 >> 0x28) & bVar17,
                                           CONCAT14((byte)((ulong)uVar51 >> 0x20) & bVar32 |
                                                    (byte)((ulong)uVar43 >> 0x20) & bVar16,
                                                    CONCAT13((byte)((ulong)uVar51 >> 0x18) & bVar31
                                                             | (byte)((ulong)uVar43 >> 0x18) &
                                                               bVar15,CONCAT12((byte)((ulong)uVar51
                                                                                     >> 0x10) &
                                                                               bVar30 | (byte)((
                                                  ulong)uVar43 >> 0x10) & bVar14,
                                                  CONCAT11((byte)((ulong)uVar51 >> 8) & bVar29 |
                                                           (byte)((ulong)uVar43 >> 8) & bVar13,
                                                           (byte)uVar51 & bVar28 |
                                                           (byte)uVar43 & bVar12)))))));
    in_x11[2] = CONCAT17((byte)((ulong)uVar50 >> 0x38) & bVar27 |
                         (byte)((ulong)uVar42 >> 0x38) & bVar11,
                         CONCAT16((byte)((ulong)uVar50 >> 0x30) & bVar26 |
                                  (byte)((ulong)uVar42 >> 0x30) & bVar10,
                                  CONCAT15((byte)((ulong)uVar50 >> 0x28) & bVar25 |
                                           (byte)((ulong)uVar42 >> 0x28) & bVar9,
                                           CONCAT14((byte)((ulong)uVar50 >> 0x20) & bVar24 |
                                                    (byte)((ulong)uVar42 >> 0x20) & bVar8,
                                                    CONCAT13((byte)((ulong)uVar50 >> 0x18) & bVar23
                                                             | (byte)((ulong)uVar42 >> 0x18) & bVar7
                                                             ,CONCAT12((byte)((ulong)uVar50 >> 0x10)
                                                                       & bVar22 |
                                                                       (byte)((ulong)uVar42 >> 0x10)
                                                                       & bVar6,CONCAT11((byte)((
                                                  ulong)uVar50 >> 8) & bVar21 |
                                                  (byte)((ulong)uVar42 >> 8) & bVar5,
                                                  (byte)uVar50 & bVar20 | (byte)uVar42 & bVar4))))))
                        );
    in_x13 = in_x13 + -8;
    in_x11 = in_x11 + 8;
    in_x12 = in_x12 + 8;
  } while (in_x13 != 0);
  if (in_x10 != unaff_x21) {
    lVar2 = unaff_x21 - in_x10;
    puVar1 = (ulong *)(unaff_x19 + in_x10 * 8);
    puVar3 = (ulong *)(unaff_x20 + in_x10 * 8);
    do {
      *puVar3 = *puVar1 & in_x9 | *puVar3 & param_1;
      lVar2 = lVar2 + -1;
      puVar1 = puVar1 + 1;
      puVar3 = puVar3 + 1;
    } while (lVar2 != 0);
  }
  return;
}


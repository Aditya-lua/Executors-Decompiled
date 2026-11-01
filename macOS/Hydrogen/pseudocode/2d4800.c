
void FUN_002d4800(undefined8 param_1,undefined8 param_2,ulong param_3,long param_4,long param_5)

{
  uint uVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  ulong *puVar7;
  undefined8 *puVar8;
  ulong *puVar9;
  undefined8 *puVar10;
  long lVar11;
  ulong *puVar12;
  undefined8 *puVar13;
  ulong uVar14;
  long unaff_x29;
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
  undefined8 uVar35;
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
  undefined1 auVar47 [16];
  
  func_0x0036e464(param_1,0x48);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return;
  }
  auVar47 = ___stack_chk_fail();
  lVar2 = auVar47._8_8_;
  uVar1 = *(uint *)(auVar47._0_8_ + 0x108);
  uVar4 = (ulong)(int)uVar1;
  if (uVar1 != 0) {
    uVar3 = ~param_3;
    if (uVar1 < 8) {
      uVar6 = 0;
    }
    else {
      uVar6 = 0;
      if ((0x3f < (ulong)(lVar2 - param_4)) && (0x3f < (ulong)(lVar2 - param_5))) {
        uVar6 = uVar4 & 0xfffffffffffffff8;
        puVar8 = (undefined8 *)(lVar2 + 0x20);
        puVar10 = (undefined8 *)(param_4 + 0x20);
        puVar13 = (undefined8 *)(param_5 + 0x20);
        uVar14 = uVar6;
        do {
          uVar32 = puVar10[-3];
          uVar31 = puVar10[-4];
          uVar34 = puVar10[-1];
          uVar33 = puVar10[-2];
          uVar36 = puVar10[1];
          uVar35 = *puVar10;
          uVar38 = puVar10[3];
          uVar37 = puVar10[2];
          uVar40 = puVar13[-3];
          uVar39 = puVar13[-4];
          uVar42 = puVar13[-1];
          uVar41 = puVar13[-2];
          uVar44 = puVar13[1];
          uVar43 = *puVar13;
          uVar46 = puVar13[3];
          uVar45 = puVar13[2];
          bVar15 = (byte)param_3;
          bVar16 = (byte)(param_3 >> 8);
          bVar17 = (byte)(param_3 >> 0x10);
          bVar18 = (byte)(param_3 >> 0x18);
          bVar19 = (byte)(param_3 >> 0x20);
          bVar20 = (byte)(param_3 >> 0x28);
          bVar21 = (byte)(param_3 >> 0x30);
          bVar22 = (byte)(param_3 >> 0x38);
          bVar23 = (byte)uVar3;
          bVar24 = (byte)(uVar3 >> 8);
          bVar25 = (byte)(uVar3 >> 0x10);
          bVar26 = (byte)(uVar3 >> 0x18);
          bVar27 = (byte)(uVar3 >> 0x20);
          bVar28 = (byte)(uVar3 >> 0x28);
          bVar29 = (byte)(uVar3 >> 0x30);
          bVar30 = (byte)(uVar3 >> 0x38);
          puVar8[-3] = CONCAT17((byte)((ulong)uVar40 >> 0x38) & bVar30 |
                                (byte)((ulong)uVar32 >> 0x38) & bVar22,
                                CONCAT16((byte)((ulong)uVar40 >> 0x30) & bVar29 |
                                         (byte)((ulong)uVar32 >> 0x30) & bVar21,
                                         CONCAT15((byte)((ulong)uVar40 >> 0x28) & bVar28 |
                                                  (byte)((ulong)uVar32 >> 0x28) & bVar20,
                                                  CONCAT14((byte)((ulong)uVar40 >> 0x20) & bVar27 |
                                                           (byte)((ulong)uVar32 >> 0x20) & bVar19,
                                                           CONCAT13((byte)((ulong)uVar40 >> 0x18) &
                                                                    bVar26 | (byte)((ulong)uVar32 >>
                                                                                   0x18) & bVar18,
                                                                    CONCAT12((byte)((ulong)uVar40 >>
                                                                                   0x10) & bVar25 |
                                                                             (byte)((ulong)uVar32 >>
                                                                                   0x10) & bVar17,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar40 >> 8) & bVar24 |
                                                  (byte)((ulong)uVar32 >> 8) & bVar16,
                                                  (byte)uVar40 & bVar23 | (byte)uVar32 & bVar15)))))
                                        ));
          puVar8[-4] = CONCAT17((byte)((ulong)uVar39 >> 0x38) & bVar30 |
                                (byte)((ulong)uVar31 >> 0x38) & bVar22,
                                CONCAT16((byte)((ulong)uVar39 >> 0x30) & bVar29 |
                                         (byte)((ulong)uVar31 >> 0x30) & bVar21,
                                         CONCAT15((byte)((ulong)uVar39 >> 0x28) & bVar28 |
                                                  (byte)((ulong)uVar31 >> 0x28) & bVar20,
                                                  CONCAT14((byte)((ulong)uVar39 >> 0x20) & bVar27 |
                                                           (byte)((ulong)uVar31 >> 0x20) & bVar19,
                                                           CONCAT13((byte)((ulong)uVar39 >> 0x18) &
                                                                    bVar26 | (byte)((ulong)uVar31 >>
                                                                                   0x18) & bVar18,
                                                                    CONCAT12((byte)((ulong)uVar39 >>
                                                                                   0x10) & bVar25 |
                                                                             (byte)((ulong)uVar31 >>
                                                                                   0x10) & bVar17,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar39 >> 8) & bVar24 |
                                                  (byte)((ulong)uVar31 >> 8) & bVar16,
                                                  (byte)uVar39 & bVar23 | (byte)uVar31 & bVar15)))))
                                        ));
          puVar8[-1] = CONCAT17((byte)((ulong)uVar42 >> 0x38) & bVar30 |
                                (byte)((ulong)uVar34 >> 0x38) & bVar22,
                                CONCAT16((byte)((ulong)uVar42 >> 0x30) & bVar29 |
                                         (byte)((ulong)uVar34 >> 0x30) & bVar21,
                                         CONCAT15((byte)((ulong)uVar42 >> 0x28) & bVar28 |
                                                  (byte)((ulong)uVar34 >> 0x28) & bVar20,
                                                  CONCAT14((byte)((ulong)uVar42 >> 0x20) & bVar27 |
                                                           (byte)((ulong)uVar34 >> 0x20) & bVar19,
                                                           CONCAT13((byte)((ulong)uVar42 >> 0x18) &
                                                                    bVar26 | (byte)((ulong)uVar34 >>
                                                                                   0x18) & bVar18,
                                                                    CONCAT12((byte)((ulong)uVar42 >>
                                                                                   0x10) & bVar25 |
                                                                             (byte)((ulong)uVar34 >>
                                                                                   0x10) & bVar17,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar42 >> 8) & bVar24 |
                                                  (byte)((ulong)uVar34 >> 8) & bVar16,
                                                  (byte)uVar42 & bVar23 | (byte)uVar34 & bVar15)))))
                                        ));
          puVar8[-2] = CONCAT17((byte)((ulong)uVar41 >> 0x38) & bVar30 |
                                (byte)((ulong)uVar33 >> 0x38) & bVar22,
                                CONCAT16((byte)((ulong)uVar41 >> 0x30) & bVar29 |
                                         (byte)((ulong)uVar33 >> 0x30) & bVar21,
                                         CONCAT15((byte)((ulong)uVar41 >> 0x28) & bVar28 |
                                                  (byte)((ulong)uVar33 >> 0x28) & bVar20,
                                                  CONCAT14((byte)((ulong)uVar41 >> 0x20) & bVar27 |
                                                           (byte)((ulong)uVar33 >> 0x20) & bVar19,
                                                           CONCAT13((byte)((ulong)uVar41 >> 0x18) &
                                                                    bVar26 | (byte)((ulong)uVar33 >>
                                                                                   0x18) & bVar18,
                                                                    CONCAT12((byte)((ulong)uVar41 >>
                                                                                   0x10) & bVar25 |
                                                                             (byte)((ulong)uVar33 >>
                                                                                   0x10) & bVar17,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar41 >> 8) & bVar24 |
                                                  (byte)((ulong)uVar33 >> 8) & bVar16,
                                                  (byte)uVar41 & bVar23 | (byte)uVar33 & bVar15)))))
                                        ));
          puVar8[1] = CONCAT17((byte)((ulong)uVar44 >> 0x38) & bVar30 |
                               (byte)((ulong)uVar36 >> 0x38) & bVar22,
                               CONCAT16((byte)((ulong)uVar44 >> 0x30) & bVar29 |
                                        (byte)((ulong)uVar36 >> 0x30) & bVar21,
                                        CONCAT15((byte)((ulong)uVar44 >> 0x28) & bVar28 |
                                                 (byte)((ulong)uVar36 >> 0x28) & bVar20,
                                                 CONCAT14((byte)((ulong)uVar44 >> 0x20) & bVar27 |
                                                          (byte)((ulong)uVar36 >> 0x20) & bVar19,
                                                          CONCAT13((byte)((ulong)uVar44 >> 0x18) &
                                                                   bVar26 | (byte)((ulong)uVar36 >>
                                                                                  0x18) & bVar18,
                                                                   CONCAT12((byte)((ulong)uVar44 >>
                                                                                  0x10) & bVar25 |
                                                                            (byte)((ulong)uVar36 >>
                                                                                  0x10) & bVar17,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar44 >> 8) & bVar24 |
                                                  (byte)((ulong)uVar36 >> 8) & bVar16,
                                                  (byte)uVar44 & bVar23 | (byte)uVar36 & bVar15)))))
                                       ));
          *puVar8 = CONCAT17((byte)((ulong)uVar43 >> 0x38) & bVar30 |
                             (byte)((ulong)uVar35 >> 0x38) & bVar22,
                             CONCAT16((byte)((ulong)uVar43 >> 0x30) & bVar29 |
                                      (byte)((ulong)uVar35 >> 0x30) & bVar21,
                                      CONCAT15((byte)((ulong)uVar43 >> 0x28) & bVar28 |
                                               (byte)((ulong)uVar35 >> 0x28) & bVar20,
                                               CONCAT14((byte)((ulong)uVar43 >> 0x20) & bVar27 |
                                                        (byte)((ulong)uVar35 >> 0x20) & bVar19,
                                                        CONCAT13((byte)((ulong)uVar43 >> 0x18) &
                                                                 bVar26 | (byte)((ulong)uVar35 >>
                                                                                0x18) & bVar18,
                                                                 CONCAT12((byte)((ulong)uVar43 >>
                                                                                0x10) & bVar25 |
                                                                          (byte)((ulong)uVar35 >>
                                                                                0x10) & bVar17,
                                                                          CONCAT11((byte)((ulong)
                                                  uVar43 >> 8) & bVar24 |
                                                  (byte)((ulong)uVar35 >> 8) & bVar16,
                                                  (byte)uVar43 & bVar23 | (byte)uVar35 & bVar15)))))
                                     ));
          puVar8[3] = CONCAT17((byte)((ulong)uVar46 >> 0x38) & bVar30 |
                               (byte)((ulong)uVar38 >> 0x38) & bVar22,
                               CONCAT16((byte)((ulong)uVar46 >> 0x30) & bVar29 |
                                        (byte)((ulong)uVar38 >> 0x30) & bVar21,
                                        CONCAT15((byte)((ulong)uVar46 >> 0x28) & bVar28 |
                                                 (byte)((ulong)uVar38 >> 0x28) & bVar20,
                                                 CONCAT14((byte)((ulong)uVar46 >> 0x20) & bVar27 |
                                                          (byte)((ulong)uVar38 >> 0x20) & bVar19,
                                                          CONCAT13((byte)((ulong)uVar46 >> 0x18) &
                                                                   bVar26 | (byte)((ulong)uVar38 >>
                                                                                  0x18) & bVar18,
                                                                   CONCAT12((byte)((ulong)uVar46 >>
                                                                                  0x10) & bVar25 |
                                                                            (byte)((ulong)uVar38 >>
                                                                                  0x10) & bVar17,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar46 >> 8) & bVar24 |
                                                  (byte)((ulong)uVar38 >> 8) & bVar16,
                                                  (byte)uVar46 & bVar23 | (byte)uVar38 & bVar15)))))
                                       ));
          puVar8[2] = CONCAT17((byte)((ulong)uVar45 >> 0x38) & bVar30 |
                               (byte)((ulong)uVar37 >> 0x38) & bVar22,
                               CONCAT16((byte)((ulong)uVar45 >> 0x30) & bVar29 |
                                        (byte)((ulong)uVar37 >> 0x30) & bVar21,
                                        CONCAT15((byte)((ulong)uVar45 >> 0x28) & bVar28 |
                                                 (byte)((ulong)uVar37 >> 0x28) & bVar20,
                                                 CONCAT14((byte)((ulong)uVar45 >> 0x20) & bVar27 |
                                                          (byte)((ulong)uVar37 >> 0x20) & bVar19,
                                                          CONCAT13((byte)((ulong)uVar45 >> 0x18) &
                                                                   bVar26 | (byte)((ulong)uVar37 >>
                                                                                  0x18) & bVar18,
                                                                   CONCAT12((byte)((ulong)uVar45 >>
                                                                                  0x10) & bVar25 |
                                                                            (byte)((ulong)uVar37 >>
                                                                                  0x10) & bVar17,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar45 >> 8) & bVar24 |
                                                  (byte)((ulong)uVar37 >> 8) & bVar16,
                                                  (byte)uVar45 & bVar23 | (byte)uVar37 & bVar15)))))
                                       ));
          uVar14 = uVar14 - 8;
          puVar8 = puVar8 + 8;
          puVar10 = puVar10 + 8;
          puVar13 = puVar13 + 8;
        } while (uVar14 != 0);
        if (uVar6 == uVar4) {
          return;
        }
      }
    }
    lVar5 = uVar4 - uVar6;
    lVar11 = uVar6 * 8;
    puVar7 = (ulong *)(lVar2 + lVar11);
    puVar9 = (ulong *)(param_5 + lVar11);
    puVar12 = (ulong *)(param_4 + lVar11);
    do {
      *puVar7 = *puVar9 & uVar3 | *puVar12 & param_3;
      lVar5 = lVar5 + -1;
      puVar7 = puVar7 + 1;
      puVar9 = puVar9 + 1;
      puVar12 = puVar12 + 1;
    } while (lVar5 != 0);
  }
  return;
}


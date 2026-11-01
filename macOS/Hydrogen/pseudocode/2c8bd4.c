
long FUN_002c8bd4(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  uint uVar1;
  ulong uVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong *puVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  ulong *puVar14;
  ulong uVar15;
  ulong uVar16;
  long lVar17;
  byte bVar18;
  byte bVar19;
  byte bVar20;
  byte bVar21;
  byte bVar22;
  byte bVar23;
  byte bVar24;
  byte bVar25;
  byte bVar26;
  byte bVar28;
  byte bVar29;
  byte bVar30;
  byte bVar31;
  byte bVar32;
  byte bVar33;
  byte bVar34;
  undefined8 uVar27;
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
  undefined8 uVar47;
  undefined1 auVar48 [16];
  undefined8 uStack_1e0;
  undefined8 uStack_1d8;
  undefined8 uStack_1d0;
  undefined8 uStack_1c8;
  undefined8 uStack_1c0;
  undefined8 uStack_1b8;
  undefined8 uStack_1b0;
  undefined8 uStack_1a8;
  undefined8 uStack_1a0;
  undefined8 uStack_198;
  undefined8 uStack_190;
  undefined8 uStack_188;
  undefined8 uStack_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined1 auStack_150 [72];
  undefined1 auStack_108 [72];
  ulong auStack_78 [4];
  undefined8 auStack_58 [5];
  
  func_0x0079dbb8();
  auVar48 = func_0x0079dbb8();
  lVar6 = auVar48._8_8_;
  lVar17 = *(long *)(auVar48._0_8_ + 0x140);
  uVar1 = *(uint *)(auVar48._0_8_ + 0x148);
  uVar16 = (ulong)(int)uVar1;
  lVar4 = func_0x00382c70(lVar6,param_3,param_4,uVar16);
  uVar9 = uVar16;
  lVar5 = func_0x00382cc0(auStack_78,lVar6);
  uVar2 = lVar4 - lVar5;
  if (uVar2 != 0 && uVar2 != 0xffffffffffffffff) {
    auVar48 = func_0x0079dbb8();
    puVar12 = auVar48._8_8_;
    lVar4 = auVar48._0_8_;
    iVar3 = func_0x002c2908(lVar4,*puVar12);
    if (iVar3 == 0) {
      if ((lVar17 != 0) && (uVar9 != 0)) {
        iVar3 = func_0x002c8e70(lVar4,auStack_108,lVar17);
        if ((iVar3 == 0) ||
           ((iVar3 = func_0x002c8e70(lVar4,auStack_150,uVar9), iVar3 == 0 ||
            (iVar3 = func_0x002c8858(lVar4,&uStack_1e0,auStack_108,auStack_150), iVar3 == 0)))) {
          func_0x002c939c(lVar4,puVar12 + 1);
          return 0;
        }
        puVar12[4] = uStack_1c8;
        puVar12[3] = uStack_1d0;
        puVar12[6] = uStack_1b8;
        puVar12[5] = uStack_1c0;
        puVar12[8] = uStack_1a8;
        puVar12[7] = uStack_1b0;
        puVar12[9] = uStack_1a0;
        puVar12[2] = uStack_1d8;
        puVar12[1] = uStack_1e0;
        puVar12[0x12] = uStack_158;
        puVar12[0xf] = uStack_170;
        puVar12[0xe] = uStack_178;
        puVar12[0x11] = uStack_160;
        puVar12[0x10] = uStack_168;
        puVar12[0xb] = uStack_190;
        puVar12[10] = uStack_198;
        puVar12[0xd] = uStack_180;
        puVar12[0xc] = uStack_188;
        uVar7 = *(undefined8 *)(lVar4 + 0xa0);
        puVar12[0x14] = *(undefined8 *)(lVar4 + 0xa8);
        puVar12[0x13] = uVar7;
        uVar8 = *(undefined8 *)(lVar4 + 0xb8);
        uVar7 = *(undefined8 *)(lVar4 + 0xb0);
        uVar35 = *(undefined8 *)(lVar4 + 200);
        uVar27 = *(undefined8 *)(lVar4 + 0xc0);
        uVar37 = *(undefined8 *)(lVar4 + 0xd8);
        uVar36 = *(undefined8 *)(lVar4 + 0xd0);
        puVar12[0x1b] = *(undefined8 *)(lVar4 + 0xe0);
        puVar12[0x1a] = uVar37;
        puVar12[0x19] = uVar36;
        puVar12[0x18] = uVar35;
        puVar12[0x17] = uVar27;
        puVar12[0x16] = uVar8;
        puVar12[0x15] = uVar7;
        return 1;
      }
      uVar7 = 0x43;
      uVar8 = 0x2fd;
    }
    else {
      uVar7 = 0x6a;
      uVar8 = 0x2f8;
    }
    func_0x0028f83c(0xf,0,uVar7,"/aws-lc/crypto/fipsmodule/ec/ec.c",uVar8);
    return 0;
  }
  if (uVar1 != 0) {
    uVar9 = ~uVar2;
    if (uVar1 < 8) {
      uVar10 = 0;
    }
    else {
      uVar10 = uVar16 & 0xfffffffffffffff8;
      puVar12 = auStack_58;
      puVar13 = (undefined8 *)(lVar6 + 0x20);
      uVar15 = uVar10;
      do {
        uVar8 = puVar13[-3];
        uVar7 = puVar13[-4];
        uVar35 = puVar13[-1];
        uVar27 = puVar13[-2];
        uVar37 = puVar13[1];
        uVar36 = *puVar13;
        uVar39 = puVar13[3];
        uVar38 = puVar13[2];
        uVar41 = puVar12[-3];
        uVar40 = puVar12[-4];
        uVar43 = puVar12[-1];
        uVar42 = puVar12[-2];
        uVar45 = puVar12[1];
        uVar44 = *puVar12;
        uVar47 = puVar12[3];
        uVar46 = puVar12[2];
        bVar18 = (byte)uVar2;
        bVar19 = (byte)(uVar2 >> 8);
        bVar20 = (byte)(uVar2 >> 0x10);
        bVar21 = (byte)(uVar2 >> 0x18);
        bVar22 = (byte)(uVar2 >> 0x20);
        bVar23 = (byte)(uVar2 >> 0x28);
        bVar24 = (byte)(uVar2 >> 0x30);
        bVar25 = (byte)(uVar2 >> 0x38);
        bVar26 = (byte)uVar9;
        bVar28 = (byte)(uVar9 >> 8);
        bVar29 = (byte)(uVar9 >> 0x10);
        bVar30 = (byte)(uVar9 >> 0x18);
        bVar31 = (byte)(uVar9 >> 0x20);
        bVar32 = (byte)(uVar9 >> 0x28);
        bVar33 = (byte)(uVar9 >> 0x30);
        bVar34 = (byte)(uVar9 >> 0x38);
        puVar13[-3] = CONCAT17((byte)((ulong)uVar41 >> 0x38) & bVar34 |
                               (byte)((ulong)uVar8 >> 0x38) & bVar25,
                               CONCAT16((byte)((ulong)uVar41 >> 0x30) & bVar33 |
                                        (byte)((ulong)uVar8 >> 0x30) & bVar24,
                                        CONCAT15((byte)((ulong)uVar41 >> 0x28) & bVar32 |
                                                 (byte)((ulong)uVar8 >> 0x28) & bVar23,
                                                 CONCAT14((byte)((ulong)uVar41 >> 0x20) & bVar31 |
                                                          (byte)((ulong)uVar8 >> 0x20) & bVar22,
                                                          CONCAT13((byte)((ulong)uVar41 >> 0x18) &
                                                                   bVar30 | (byte)((ulong)uVar8 >>
                                                                                  0x18) & bVar21,
                                                                   CONCAT12((byte)((ulong)uVar41 >>
                                                                                  0x10) & bVar29 |
                                                                            (byte)((ulong)uVar8 >>
                                                                                  0x10) & bVar20,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar41 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar8 >> 8) & bVar19,
                                                  (byte)uVar41 & bVar26 | (byte)uVar8 & bVar18))))))
                              );
        puVar13[-4] = CONCAT17((byte)((ulong)uVar40 >> 0x38) & bVar34 |
                               (byte)((ulong)uVar7 >> 0x38) & bVar25,
                               CONCAT16((byte)((ulong)uVar40 >> 0x30) & bVar33 |
                                        (byte)((ulong)uVar7 >> 0x30) & bVar24,
                                        CONCAT15((byte)((ulong)uVar40 >> 0x28) & bVar32 |
                                                 (byte)((ulong)uVar7 >> 0x28) & bVar23,
                                                 CONCAT14((byte)((ulong)uVar40 >> 0x20) & bVar31 |
                                                          (byte)((ulong)uVar7 >> 0x20) & bVar22,
                                                          CONCAT13((byte)((ulong)uVar40 >> 0x18) &
                                                                   bVar30 | (byte)((ulong)uVar7 >>
                                                                                  0x18) & bVar21,
                                                                   CONCAT12((byte)((ulong)uVar40 >>
                                                                                  0x10) & bVar29 |
                                                                            (byte)((ulong)uVar7 >>
                                                                                  0x10) & bVar20,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar40 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar7 >> 8) & bVar19,
                                                  (byte)uVar40 & bVar26 | (byte)uVar7 & bVar18))))))
                              );
        puVar13[-1] = CONCAT17((byte)((ulong)uVar43 >> 0x38) & bVar34 |
                               (byte)((ulong)uVar35 >> 0x38) & bVar25,
                               CONCAT16((byte)((ulong)uVar43 >> 0x30) & bVar33 |
                                        (byte)((ulong)uVar35 >> 0x30) & bVar24,
                                        CONCAT15((byte)((ulong)uVar43 >> 0x28) & bVar32 |
                                                 (byte)((ulong)uVar35 >> 0x28) & bVar23,
                                                 CONCAT14((byte)((ulong)uVar43 >> 0x20) & bVar31 |
                                                          (byte)((ulong)uVar35 >> 0x20) & bVar22,
                                                          CONCAT13((byte)((ulong)uVar43 >> 0x18) &
                                                                   bVar30 | (byte)((ulong)uVar35 >>
                                                                                  0x18) & bVar21,
                                                                   CONCAT12((byte)((ulong)uVar43 >>
                                                                                  0x10) & bVar29 |
                                                                            (byte)((ulong)uVar35 >>
                                                                                  0x10) & bVar20,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar43 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar35 >> 8) & bVar19,
                                                  (byte)uVar43 & bVar26 | (byte)uVar35 & bVar18)))))
                                       ));
        puVar13[-2] = CONCAT17((byte)((ulong)uVar42 >> 0x38) & bVar34 |
                               (byte)((ulong)uVar27 >> 0x38) & bVar25,
                               CONCAT16((byte)((ulong)uVar42 >> 0x30) & bVar33 |
                                        (byte)((ulong)uVar27 >> 0x30) & bVar24,
                                        CONCAT15((byte)((ulong)uVar42 >> 0x28) & bVar32 |
                                                 (byte)((ulong)uVar27 >> 0x28) & bVar23,
                                                 CONCAT14((byte)((ulong)uVar42 >> 0x20) & bVar31 |
                                                          (byte)((ulong)uVar27 >> 0x20) & bVar22,
                                                          CONCAT13((byte)((ulong)uVar42 >> 0x18) &
                                                                   bVar30 | (byte)((ulong)uVar27 >>
                                                                                  0x18) & bVar21,
                                                                   CONCAT12((byte)((ulong)uVar42 >>
                                                                                  0x10) & bVar29 |
                                                                            (byte)((ulong)uVar27 >>
                                                                                  0x10) & bVar20,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar42 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar27 >> 8) & bVar19,
                                                  (byte)uVar42 & bVar26 | (byte)uVar27 & bVar18)))))
                                       ));
        puVar13[1] = CONCAT17((byte)((ulong)uVar45 >> 0x38) & bVar34 |
                              (byte)((ulong)uVar37 >> 0x38) & bVar25,
                              CONCAT16((byte)((ulong)uVar45 >> 0x30) & bVar33 |
                                       (byte)((ulong)uVar37 >> 0x30) & bVar24,
                                       CONCAT15((byte)((ulong)uVar45 >> 0x28) & bVar32 |
                                                (byte)((ulong)uVar37 >> 0x28) & bVar23,
                                                CONCAT14((byte)((ulong)uVar45 >> 0x20) & bVar31 |
                                                         (byte)((ulong)uVar37 >> 0x20) & bVar22,
                                                         CONCAT13((byte)((ulong)uVar45 >> 0x18) &
                                                                  bVar30 | (byte)((ulong)uVar37 >>
                                                                                 0x18) & bVar21,
                                                                  CONCAT12((byte)((ulong)uVar45 >>
                                                                                 0x10) & bVar29 |
                                                                           (byte)((ulong)uVar37 >>
                                                                                 0x10) & bVar20,
                                                                           CONCAT11((byte)((ulong)
                                                  uVar45 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar37 >> 8) & bVar19,
                                                  (byte)uVar45 & bVar26 | (byte)uVar37 & bVar18)))))
                                      ));
        *puVar13 = CONCAT17((byte)((ulong)uVar44 >> 0x38) & bVar34 |
                            (byte)((ulong)uVar36 >> 0x38) & bVar25,
                            CONCAT16((byte)((ulong)uVar44 >> 0x30) & bVar33 |
                                     (byte)((ulong)uVar36 >> 0x30) & bVar24,
                                     CONCAT15((byte)((ulong)uVar44 >> 0x28) & bVar32 |
                                              (byte)((ulong)uVar36 >> 0x28) & bVar23,
                                              CONCAT14((byte)((ulong)uVar44 >> 0x20) & bVar31 |
                                                       (byte)((ulong)uVar36 >> 0x20) & bVar22,
                                                       CONCAT13((byte)((ulong)uVar44 >> 0x18) &
                                                                bVar30 | (byte)((ulong)uVar36 >>
                                                                               0x18) & bVar21,
                                                                CONCAT12((byte)((ulong)uVar44 >>
                                                                               0x10) & bVar29 |
                                                                         (byte)((ulong)uVar36 >>
                                                                               0x10) & bVar20,
                                                                         CONCAT11((byte)((ulong)
                                                  uVar44 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar36 >> 8) & bVar19,
                                                  (byte)uVar44 & bVar26 | (byte)uVar36 & bVar18)))))
                                    ));
        puVar13[3] = CONCAT17((byte)((ulong)uVar47 >> 0x38) & bVar34 |
                              (byte)((ulong)uVar39 >> 0x38) & bVar25,
                              CONCAT16((byte)((ulong)uVar47 >> 0x30) & bVar33 |
                                       (byte)((ulong)uVar39 >> 0x30) & bVar24,
                                       CONCAT15((byte)((ulong)uVar47 >> 0x28) & bVar32 |
                                                (byte)((ulong)uVar39 >> 0x28) & bVar23,
                                                CONCAT14((byte)((ulong)uVar47 >> 0x20) & bVar31 |
                                                         (byte)((ulong)uVar39 >> 0x20) & bVar22,
                                                         CONCAT13((byte)((ulong)uVar47 >> 0x18) &
                                                                  bVar30 | (byte)((ulong)uVar39 >>
                                                                                 0x18) & bVar21,
                                                                  CONCAT12((byte)((ulong)uVar47 >>
                                                                                 0x10) & bVar29 |
                                                                           (byte)((ulong)uVar39 >>
                                                                                 0x10) & bVar20,
                                                                           CONCAT11((byte)((ulong)
                                                  uVar47 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar39 >> 8) & bVar19,
                                                  (byte)uVar47 & bVar26 | (byte)uVar39 & bVar18)))))
                                      ));
        puVar13[2] = CONCAT17((byte)((ulong)uVar46 >> 0x38) & bVar34 |
                              (byte)((ulong)uVar38 >> 0x38) & bVar25,
                              CONCAT16((byte)((ulong)uVar46 >> 0x30) & bVar33 |
                                       (byte)((ulong)uVar38 >> 0x30) & bVar24,
                                       CONCAT15((byte)((ulong)uVar46 >> 0x28) & bVar32 |
                                                (byte)((ulong)uVar38 >> 0x28) & bVar23,
                                                CONCAT14((byte)((ulong)uVar46 >> 0x20) & bVar31 |
                                                         (byte)((ulong)uVar38 >> 0x20) & bVar22,
                                                         CONCAT13((byte)((ulong)uVar46 >> 0x18) &
                                                                  bVar30 | (byte)((ulong)uVar38 >>
                                                                                 0x18) & bVar21,
                                                                  CONCAT12((byte)((ulong)uVar46 >>
                                                                                 0x10) & bVar29 |
                                                                           (byte)((ulong)uVar38 >>
                                                                                 0x10) & bVar20,
                                                                           CONCAT11((byte)((ulong)
                                                  uVar46 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar38 >> 8) & bVar19,
                                                  (byte)uVar46 & bVar26 | (byte)uVar38 & bVar18)))))
                                      ));
        uVar15 = uVar15 - 8;
        puVar12 = puVar12 + 8;
        puVar13 = puVar13 + 8;
      } while (uVar15 != 0);
      if (uVar10 == uVar16) {
        return lVar5;
      }
    }
    lVar4 = uVar16 - uVar10;
    puVar11 = auStack_78 + uVar10;
    puVar14 = (ulong *)(lVar6 + uVar10 * 8);
    do {
      *puVar14 = *puVar11 & uVar9 | *puVar14 & uVar2;
      lVar4 = lVar4 + -1;
      puVar11 = puVar11 + 1;
      puVar14 = puVar14 + 1;
    } while (lVar4 != 0);
  }
  return lVar5;
}


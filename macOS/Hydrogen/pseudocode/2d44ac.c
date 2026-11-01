
void FUN_002d44ac(ulong param_1,undefined1 param_2 [16],undefined1 param_3 [16],undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7,long param_8)

{
  uint uVar1;
  ulong uVar2;
  ulong in_x9;
  ulong uVar3;
  ulong uVar4;
  long in_x10;
  ulong uVar5;
  ulong uVar6;
  ulong *puVar7;
  long lVar8;
  undefined8 *in_x11;
  long lVar9;
  long lVar10;
  undefined8 *puVar11;
  undefined8 *in_x12;
  undefined8 *puVar12;
  ulong *puVar13;
  ulong uVar14;
  ulong *puVar15;
  undefined8 *puVar16;
  long unaff_x19;
  long unaff_x20;
  ulong uVar17;
  undefined8 uVar18;
  long unaff_x29;
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
  byte bVar36;
  byte bVar37;
  byte bVar38;
  byte bVar39;
  byte bVar40;
  byte bVar41;
  byte bVar42;
  byte bVar43;
  byte bVar44;
  byte bVar45;
  byte bVar46;
  byte bVar47;
  byte bVar48;
  byte bVar49;
  byte bVar50;
  undefined8 uVar51;
  undefined8 uVar52;
  undefined8 uVar53;
  undefined8 uVar54;
  undefined8 uVar55;
  undefined8 uVar56;
  undefined8 uVar57;
  undefined8 uVar58;
  undefined8 uVar59;
  undefined8 uVar60;
  undefined8 uVar61;
  undefined8 uVar62;
  undefined8 uVar63;
  undefined8 uVar64;
  undefined8 uVar65;
  undefined8 uVar66;
  undefined1 auVar67 [16];
  undefined1 uStack0000000000000000;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  ulong auStack_100 [4];
  undefined8 auStack_e0 [5];
  long lStack_b8;
  undefined8 uStack_b0;
  long lStack_a8;
  ulong uStack_a0;
  long lStack_98;
  undefined1 *puStack_90;
  undefined8 uStack_88;
  ulong auStack_80 [4];
  undefined8 auStack_60 [5];
  long lStack_38;
  undefined1 auStack_6 [6];
  
  lVar9 = in_x10;
  do {
    uVar51 = in_x12[-3];
    uVar18 = in_x12[-4];
    uVar53 = in_x12[-1];
    uVar52 = in_x12[-2];
    uVar55 = in_x12[1];
    uVar54 = *in_x12;
    uVar57 = in_x12[3];
    uVar56 = in_x12[2];
    uVar59 = in_x11[-3];
    uVar58 = in_x11[-4];
    uVar61 = in_x11[-1];
    uVar60 = in_x11[-2];
    uVar63 = in_x11[1];
    uVar62 = *in_x11;
    uVar65 = in_x11[3];
    uVar64 = in_x11[2];
    bVar19 = param_2[0];
    bVar20 = param_2[1];
    bVar21 = param_2[2];
    bVar22 = param_2[3];
    bVar23 = param_2[4];
    bVar24 = param_2[5];
    bVar25 = param_2[6];
    bVar26 = param_2[7];
    bVar27 = param_2[8];
    bVar28 = param_2[9];
    bVar29 = param_2[10];
    bVar30 = param_2[0xb];
    bVar31 = param_2[0xc];
    bVar32 = param_2[0xd];
    bVar33 = param_2[0xe];
    bVar34 = param_2[0xf];
    bVar35 = param_3[0];
    bVar36 = param_3[1];
    bVar37 = param_3[2];
    bVar38 = param_3[3];
    bVar39 = param_3[4];
    bVar40 = param_3[5];
    bVar41 = param_3[6];
    bVar42 = param_3[7];
    bVar43 = param_3[8];
    bVar44 = param_3[9];
    bVar45 = param_3[10];
    bVar46 = param_3[0xb];
    bVar47 = param_3[0xc];
    bVar48 = param_3[0xd];
    bVar49 = param_3[0xe];
    bVar50 = param_3[0xf];
    in_x12[-3] = CONCAT17((byte)((ulong)uVar59 >> 0x38) & bVar50 |
                          (byte)((ulong)uVar51 >> 0x38) & bVar34,
                          CONCAT16((byte)((ulong)uVar59 >> 0x30) & bVar49 |
                                   (byte)((ulong)uVar51 >> 0x30) & bVar33,
                                   CONCAT15((byte)((ulong)uVar59 >> 0x28) & bVar48 |
                                            (byte)((ulong)uVar51 >> 0x28) & bVar32,
                                            CONCAT14((byte)((ulong)uVar59 >> 0x20) & bVar47 |
                                                     (byte)((ulong)uVar51 >> 0x20) & bVar31,
                                                     CONCAT13((byte)((ulong)uVar59 >> 0x18) & bVar46
                                                              | (byte)((ulong)uVar51 >> 0x18) &
                                                                bVar30,CONCAT12((byte)((ulong)uVar59
                                                                                      >> 0x10) &
                                                                                bVar45 | (byte)((
                                                  ulong)uVar51 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar59 >> 8) & bVar44 |
                                                           (byte)((ulong)uVar51 >> 8) & bVar28,
                                                           (byte)uVar59 & bVar43 |
                                                           (byte)uVar51 & bVar27)))))));
    in_x12[-4] = CONCAT17((byte)((ulong)uVar58 >> 0x38) & bVar42 |
                          (byte)((ulong)uVar18 >> 0x38) & bVar26,
                          CONCAT16((byte)((ulong)uVar58 >> 0x30) & bVar41 |
                                   (byte)((ulong)uVar18 >> 0x30) & bVar25,
                                   CONCAT15((byte)((ulong)uVar58 >> 0x28) & bVar40 |
                                            (byte)((ulong)uVar18 >> 0x28) & bVar24,
                                            CONCAT14((byte)((ulong)uVar58 >> 0x20) & bVar39 |
                                                     (byte)((ulong)uVar18 >> 0x20) & bVar23,
                                                     CONCAT13((byte)((ulong)uVar58 >> 0x18) & bVar38
                                                              | (byte)((ulong)uVar18 >> 0x18) &
                                                                bVar22,CONCAT12((byte)((ulong)uVar58
                                                                                      >> 0x10) &
                                                                                bVar37 | (byte)((
                                                  ulong)uVar18 >> 0x10) & bVar21,
                                                  CONCAT11((byte)((ulong)uVar58 >> 8) & bVar36 |
                                                           (byte)((ulong)uVar18 >> 8) & bVar20,
                                                           (byte)uVar58 & bVar35 |
                                                           (byte)uVar18 & bVar19)))))));
    in_x12[-1] = CONCAT17((byte)((ulong)uVar61 >> 0x38) & bVar50 |
                          (byte)((ulong)uVar53 >> 0x38) & bVar34,
                          CONCAT16((byte)((ulong)uVar61 >> 0x30) & bVar49 |
                                   (byte)((ulong)uVar53 >> 0x30) & bVar33,
                                   CONCAT15((byte)((ulong)uVar61 >> 0x28) & bVar48 |
                                            (byte)((ulong)uVar53 >> 0x28) & bVar32,
                                            CONCAT14((byte)((ulong)uVar61 >> 0x20) & bVar47 |
                                                     (byte)((ulong)uVar53 >> 0x20) & bVar31,
                                                     CONCAT13((byte)((ulong)uVar61 >> 0x18) & bVar46
                                                              | (byte)((ulong)uVar53 >> 0x18) &
                                                                bVar30,CONCAT12((byte)((ulong)uVar61
                                                                                      >> 0x10) &
                                                                                bVar45 | (byte)((
                                                  ulong)uVar53 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar61 >> 8) & bVar44 |
                                                           (byte)((ulong)uVar53 >> 8) & bVar28,
                                                           (byte)uVar61 & bVar43 |
                                                           (byte)uVar53 & bVar27)))))));
    in_x12[-2] = CONCAT17((byte)((ulong)uVar60 >> 0x38) & bVar42 |
                          (byte)((ulong)uVar52 >> 0x38) & bVar26,
                          CONCAT16((byte)((ulong)uVar60 >> 0x30) & bVar41 |
                                   (byte)((ulong)uVar52 >> 0x30) & bVar25,
                                   CONCAT15((byte)((ulong)uVar60 >> 0x28) & bVar40 |
                                            (byte)((ulong)uVar52 >> 0x28) & bVar24,
                                            CONCAT14((byte)((ulong)uVar60 >> 0x20) & bVar39 |
                                                     (byte)((ulong)uVar52 >> 0x20) & bVar23,
                                                     CONCAT13((byte)((ulong)uVar60 >> 0x18) & bVar38
                                                              | (byte)((ulong)uVar52 >> 0x18) &
                                                                bVar22,CONCAT12((byte)((ulong)uVar60
                                                                                      >> 0x10) &
                                                                                bVar37 | (byte)((
                                                  ulong)uVar52 >> 0x10) & bVar21,
                                                  CONCAT11((byte)((ulong)uVar60 >> 8) & bVar36 |
                                                           (byte)((ulong)uVar52 >> 8) & bVar20,
                                                           (byte)uVar60 & bVar35 |
                                                           (byte)uVar52 & bVar19)))))));
    in_x12[1] = CONCAT17((byte)((ulong)uVar63 >> 0x38) & bVar50 |
                         (byte)((ulong)uVar55 >> 0x38) & bVar34,
                         CONCAT16((byte)((ulong)uVar63 >> 0x30) & bVar49 |
                                  (byte)((ulong)uVar55 >> 0x30) & bVar33,
                                  CONCAT15((byte)((ulong)uVar63 >> 0x28) & bVar48 |
                                           (byte)((ulong)uVar55 >> 0x28) & bVar32,
                                           CONCAT14((byte)((ulong)uVar63 >> 0x20) & bVar47 |
                                                    (byte)((ulong)uVar55 >> 0x20) & bVar31,
                                                    CONCAT13((byte)((ulong)uVar63 >> 0x18) & bVar46
                                                             | (byte)((ulong)uVar55 >> 0x18) &
                                                               bVar30,CONCAT12((byte)((ulong)uVar63
                                                                                     >> 0x10) &
                                                                               bVar45 | (byte)((
                                                  ulong)uVar55 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar63 >> 8) & bVar44 |
                                                           (byte)((ulong)uVar55 >> 8) & bVar28,
                                                           (byte)uVar63 & bVar43 |
                                                           (byte)uVar55 & bVar27)))))));
    *in_x12 = CONCAT17((byte)((ulong)uVar62 >> 0x38) & bVar42 |
                       (byte)((ulong)uVar54 >> 0x38) & bVar26,
                       CONCAT16((byte)((ulong)uVar62 >> 0x30) & bVar41 |
                                (byte)((ulong)uVar54 >> 0x30) & bVar25,
                                CONCAT15((byte)((ulong)uVar62 >> 0x28) & bVar40 |
                                         (byte)((ulong)uVar54 >> 0x28) & bVar24,
                                         CONCAT14((byte)((ulong)uVar62 >> 0x20) & bVar39 |
                                                  (byte)((ulong)uVar54 >> 0x20) & bVar23,
                                                  CONCAT13((byte)((ulong)uVar62 >> 0x18) & bVar38 |
                                                           (byte)((ulong)uVar54 >> 0x18) & bVar22,
                                                           CONCAT12((byte)((ulong)uVar62 >> 0x10) &
                                                                    bVar37 | (byte)((ulong)uVar54 >>
                                                                                   0x10) & bVar21,
                                                                    CONCAT11((byte)((ulong)uVar62 >>
                                                                                   8) & bVar36 |
                                                                             (byte)((ulong)uVar54 >>
                                                                                   8) & bVar20,
                                                                             (byte)uVar62 & bVar35 |
                                                                             (byte)uVar54 & bVar19))
                                                          )))));
    in_x12[3] = CONCAT17((byte)((ulong)uVar65 >> 0x38) & bVar50 |
                         (byte)((ulong)uVar57 >> 0x38) & bVar34,
                         CONCAT16((byte)((ulong)uVar65 >> 0x30) & bVar49 |
                                  (byte)((ulong)uVar57 >> 0x30) & bVar33,
                                  CONCAT15((byte)((ulong)uVar65 >> 0x28) & bVar48 |
                                           (byte)((ulong)uVar57 >> 0x28) & bVar32,
                                           CONCAT14((byte)((ulong)uVar65 >> 0x20) & bVar47 |
                                                    (byte)((ulong)uVar57 >> 0x20) & bVar31,
                                                    CONCAT13((byte)((ulong)uVar65 >> 0x18) & bVar46
                                                             | (byte)((ulong)uVar57 >> 0x18) &
                                                               bVar30,CONCAT12((byte)((ulong)uVar65
                                                                                     >> 0x10) &
                                                                               bVar45 | (byte)((
                                                  ulong)uVar57 >> 0x10) & bVar29,
                                                  CONCAT11((byte)((ulong)uVar65 >> 8) & bVar44 |
                                                           (byte)((ulong)uVar57 >> 8) & bVar28,
                                                           (byte)uVar65 & bVar43 |
                                                           (byte)uVar57 & bVar27)))))));
    in_x12[2] = CONCAT17((byte)((ulong)uVar64 >> 0x38) & bVar42 |
                         (byte)((ulong)uVar56 >> 0x38) & bVar26,
                         CONCAT16((byte)((ulong)uVar64 >> 0x30) & bVar41 |
                                  (byte)((ulong)uVar56 >> 0x30) & bVar25,
                                  CONCAT15((byte)((ulong)uVar64 >> 0x28) & bVar40 |
                                           (byte)((ulong)uVar56 >> 0x28) & bVar24,
                                           CONCAT14((byte)((ulong)uVar64 >> 0x20) & bVar39 |
                                                    (byte)((ulong)uVar56 >> 0x20) & bVar23,
                                                    CONCAT13((byte)((ulong)uVar64 >> 0x18) & bVar38
                                                             | (byte)((ulong)uVar56 >> 0x18) &
                                                               bVar22,CONCAT12((byte)((ulong)uVar64
                                                                                     >> 0x10) &
                                                                               bVar37 | (byte)((
                                                  ulong)uVar56 >> 0x10) & bVar21,
                                                  CONCAT11((byte)((ulong)uVar64 >> 8) & bVar36 |
                                                           (byte)((ulong)uVar56 >> 8) & bVar20,
                                                           (byte)uVar64 & bVar35 |
                                                           (byte)uVar56 & bVar19)))))));
    lVar9 = lVar9 + -8;
    in_x11 = in_x11 + 8;
    in_x12 = in_x12 + 8;
  } while (lVar9 != 0);
  if (in_x10 != unaff_x20) {
    lVar9 = unaff_x20 - in_x10;
    puVar7 = (ulong *)(&uStack0000000000000000 + in_x10 * 8);
    puVar13 = (ulong *)(unaff_x19 + in_x10 * 8);
    do {
      *puVar13 = *puVar7 & in_x9 | *puVar13 & param_1;
      lVar9 = lVar9 + -1;
      puVar7 = puVar7 + 1;
      puVar13 = puVar13 + 1;
    } while (lVar9 != 0);
  }
  func_0x0036e464();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return;
  }
  auVar67 = ___stack_chk_fail();
  lVar8 = auVar67._8_8_;
  lStack_38 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar18 = *(undefined8 *)(auVar67._0_8_ + 0x100);
  uVar1 = *(uint *)(auVar67._0_8_ + 0x108);
  uVar17 = (ulong)(int)uVar1;
  lVar9 = func_0x00382cc0(lVar8,param_6,param_7,uVar17);
  func_0x00382c70(auStack_80,lVar8,uVar18,uVar17);
  if (uVar1 != 0) {
    uVar5 = 0;
    uVar2 = -lVar9;
    uVar3 = lVar9 - 1;
    if (7 < uVar1) {
      uVar5 = uVar17 & 0xfffffffffffffff8;
      puVar11 = (undefined8 *)(lVar8 + 0x20);
      puVar12 = auStack_60;
      uVar4 = uVar5;
      do {
        uVar52 = puVar12[-3];
        uVar51 = puVar12[-4];
        uVar54 = puVar12[-1];
        uVar53 = puVar12[-2];
        uVar56 = puVar12[1];
        uVar55 = *puVar12;
        uVar58 = puVar12[3];
        uVar57 = puVar12[2];
        uVar60 = puVar11[-3];
        uVar59 = puVar11[-4];
        uVar62 = puVar11[-1];
        uVar61 = puVar11[-2];
        uVar64 = puVar11[1];
        uVar63 = *puVar11;
        uVar66 = puVar11[3];
        uVar65 = puVar11[2];
        bVar19 = (byte)uVar2;
        bVar20 = (byte)(uVar2 >> 8);
        bVar21 = (byte)(uVar2 >> 0x10);
        bVar22 = (byte)(uVar2 >> 0x18);
        bVar23 = (byte)(uVar2 >> 0x20);
        bVar24 = (byte)(uVar2 >> 0x28);
        bVar25 = (byte)(uVar2 >> 0x30);
        bVar26 = (byte)(uVar2 >> 0x38);
        bVar27 = (byte)uVar3;
        bVar28 = (byte)(uVar3 >> 8);
        bVar29 = (byte)(uVar3 >> 0x10);
        bVar30 = (byte)(uVar3 >> 0x18);
        bVar31 = (byte)(uVar3 >> 0x20);
        bVar32 = (byte)(uVar3 >> 0x28);
        bVar33 = (byte)(uVar3 >> 0x30);
        bVar34 = (byte)(uVar3 >> 0x38);
        puVar11[-3] = CONCAT17((byte)((ulong)uVar60 >> 0x38) & bVar34 |
                               (byte)((ulong)uVar52 >> 0x38) & bVar26,
                               CONCAT16((byte)((ulong)uVar60 >> 0x30) & bVar33 |
                                        (byte)((ulong)uVar52 >> 0x30) & bVar25,
                                        CONCAT15((byte)((ulong)uVar60 >> 0x28) & bVar32 |
                                                 (byte)((ulong)uVar52 >> 0x28) & bVar24,
                                                 CONCAT14((byte)((ulong)uVar60 >> 0x20) & bVar31 |
                                                          (byte)((ulong)uVar52 >> 0x20) & bVar23,
                                                          CONCAT13((byte)((ulong)uVar60 >> 0x18) &
                                                                   bVar30 | (byte)((ulong)uVar52 >>
                                                                                  0x18) & bVar22,
                                                                   CONCAT12((byte)((ulong)uVar60 >>
                                                                                  0x10) & bVar29 |
                                                                            (byte)((ulong)uVar52 >>
                                                                                  0x10) & bVar21,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar60 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar52 >> 8) & bVar20,
                                                  (byte)uVar60 & bVar27 | (byte)uVar52 & bVar19)))))
                                       ));
        puVar11[-4] = CONCAT17((byte)((ulong)uVar59 >> 0x38) & bVar34 |
                               (byte)((ulong)uVar51 >> 0x38) & bVar26,
                               CONCAT16((byte)((ulong)uVar59 >> 0x30) & bVar33 |
                                        (byte)((ulong)uVar51 >> 0x30) & bVar25,
                                        CONCAT15((byte)((ulong)uVar59 >> 0x28) & bVar32 |
                                                 (byte)((ulong)uVar51 >> 0x28) & bVar24,
                                                 CONCAT14((byte)((ulong)uVar59 >> 0x20) & bVar31 |
                                                          (byte)((ulong)uVar51 >> 0x20) & bVar23,
                                                          CONCAT13((byte)((ulong)uVar59 >> 0x18) &
                                                                   bVar30 | (byte)((ulong)uVar51 >>
                                                                                  0x18) & bVar22,
                                                                   CONCAT12((byte)((ulong)uVar59 >>
                                                                                  0x10) & bVar29 |
                                                                            (byte)((ulong)uVar51 >>
                                                                                  0x10) & bVar21,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar59 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar51 >> 8) & bVar20,
                                                  (byte)uVar59 & bVar27 | (byte)uVar51 & bVar19)))))
                                       ));
        puVar11[-1] = CONCAT17((byte)((ulong)uVar62 >> 0x38) & bVar34 |
                               (byte)((ulong)uVar54 >> 0x38) & bVar26,
                               CONCAT16((byte)((ulong)uVar62 >> 0x30) & bVar33 |
                                        (byte)((ulong)uVar54 >> 0x30) & bVar25,
                                        CONCAT15((byte)((ulong)uVar62 >> 0x28) & bVar32 |
                                                 (byte)((ulong)uVar54 >> 0x28) & bVar24,
                                                 CONCAT14((byte)((ulong)uVar62 >> 0x20) & bVar31 |
                                                          (byte)((ulong)uVar54 >> 0x20) & bVar23,
                                                          CONCAT13((byte)((ulong)uVar62 >> 0x18) &
                                                                   bVar30 | (byte)((ulong)uVar54 >>
                                                                                  0x18) & bVar22,
                                                                   CONCAT12((byte)((ulong)uVar62 >>
                                                                                  0x10) & bVar29 |
                                                                            (byte)((ulong)uVar54 >>
                                                                                  0x10) & bVar21,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar62 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar54 >> 8) & bVar20,
                                                  (byte)uVar62 & bVar27 | (byte)uVar54 & bVar19)))))
                                       ));
        puVar11[-2] = CONCAT17((byte)((ulong)uVar61 >> 0x38) & bVar34 |
                               (byte)((ulong)uVar53 >> 0x38) & bVar26,
                               CONCAT16((byte)((ulong)uVar61 >> 0x30) & bVar33 |
                                        (byte)((ulong)uVar53 >> 0x30) & bVar25,
                                        CONCAT15((byte)((ulong)uVar61 >> 0x28) & bVar32 |
                                                 (byte)((ulong)uVar53 >> 0x28) & bVar24,
                                                 CONCAT14((byte)((ulong)uVar61 >> 0x20) & bVar31 |
                                                          (byte)((ulong)uVar53 >> 0x20) & bVar23,
                                                          CONCAT13((byte)((ulong)uVar61 >> 0x18) &
                                                                   bVar30 | (byte)((ulong)uVar53 >>
                                                                                  0x18) & bVar22,
                                                                   CONCAT12((byte)((ulong)uVar61 >>
                                                                                  0x10) & bVar29 |
                                                                            (byte)((ulong)uVar53 >>
                                                                                  0x10) & bVar21,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar61 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar53 >> 8) & bVar20,
                                                  (byte)uVar61 & bVar27 | (byte)uVar53 & bVar19)))))
                                       ));
        puVar11[1] = CONCAT17((byte)((ulong)uVar64 >> 0x38) & bVar34 |
                              (byte)((ulong)uVar56 >> 0x38) & bVar26,
                              CONCAT16((byte)((ulong)uVar64 >> 0x30) & bVar33 |
                                       (byte)((ulong)uVar56 >> 0x30) & bVar25,
                                       CONCAT15((byte)((ulong)uVar64 >> 0x28) & bVar32 |
                                                (byte)((ulong)uVar56 >> 0x28) & bVar24,
                                                CONCAT14((byte)((ulong)uVar64 >> 0x20) & bVar31 |
                                                         (byte)((ulong)uVar56 >> 0x20) & bVar23,
                                                         CONCAT13((byte)((ulong)uVar64 >> 0x18) &
                                                                  bVar30 | (byte)((ulong)uVar56 >>
                                                                                 0x18) & bVar22,
                                                                  CONCAT12((byte)((ulong)uVar64 >>
                                                                                 0x10) & bVar29 |
                                                                           (byte)((ulong)uVar56 >>
                                                                                 0x10) & bVar21,
                                                                           CONCAT11((byte)((ulong)
                                                  uVar64 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar56 >> 8) & bVar20,
                                                  (byte)uVar64 & bVar27 | (byte)uVar56 & bVar19)))))
                                      ));
        *puVar11 = CONCAT17((byte)((ulong)uVar63 >> 0x38) & bVar34 |
                            (byte)((ulong)uVar55 >> 0x38) & bVar26,
                            CONCAT16((byte)((ulong)uVar63 >> 0x30) & bVar33 |
                                     (byte)((ulong)uVar55 >> 0x30) & bVar25,
                                     CONCAT15((byte)((ulong)uVar63 >> 0x28) & bVar32 |
                                              (byte)((ulong)uVar55 >> 0x28) & bVar24,
                                              CONCAT14((byte)((ulong)uVar63 >> 0x20) & bVar31 |
                                                       (byte)((ulong)uVar55 >> 0x20) & bVar23,
                                                       CONCAT13((byte)((ulong)uVar63 >> 0x18) &
                                                                bVar30 | (byte)((ulong)uVar55 >>
                                                                               0x18) & bVar22,
                                                                CONCAT12((byte)((ulong)uVar63 >>
                                                                               0x10) & bVar29 |
                                                                         (byte)((ulong)uVar55 >>
                                                                               0x10) & bVar21,
                                                                         CONCAT11((byte)((ulong)
                                                  uVar63 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar55 >> 8) & bVar20,
                                                  (byte)uVar63 & bVar27 | (byte)uVar55 & bVar19)))))
                                    ));
        puVar11[3] = CONCAT17((byte)((ulong)uVar66 >> 0x38) & bVar34 |
                              (byte)((ulong)uVar58 >> 0x38) & bVar26,
                              CONCAT16((byte)((ulong)uVar66 >> 0x30) & bVar33 |
                                       (byte)((ulong)uVar58 >> 0x30) & bVar25,
                                       CONCAT15((byte)((ulong)uVar66 >> 0x28) & bVar32 |
                                                (byte)((ulong)uVar58 >> 0x28) & bVar24,
                                                CONCAT14((byte)((ulong)uVar66 >> 0x20) & bVar31 |
                                                         (byte)((ulong)uVar58 >> 0x20) & bVar23,
                                                         CONCAT13((byte)((ulong)uVar66 >> 0x18) &
                                                                  bVar30 | (byte)((ulong)uVar58 >>
                                                                                 0x18) & bVar22,
                                                                  CONCAT12((byte)((ulong)uVar66 >>
                                                                                 0x10) & bVar29 |
                                                                           (byte)((ulong)uVar58 >>
                                                                                 0x10) & bVar21,
                                                                           CONCAT11((byte)((ulong)
                                                  uVar66 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar58 >> 8) & bVar20,
                                                  (byte)uVar66 & bVar27 | (byte)uVar58 & bVar19)))))
                                      ));
        puVar11[2] = CONCAT17((byte)((ulong)uVar65 >> 0x38) & bVar34 |
                              (byte)((ulong)uVar57 >> 0x38) & bVar26,
                              CONCAT16((byte)((ulong)uVar65 >> 0x30) & bVar33 |
                                       (byte)((ulong)uVar57 >> 0x30) & bVar25,
                                       CONCAT15((byte)((ulong)uVar65 >> 0x28) & bVar32 |
                                                (byte)((ulong)uVar57 >> 0x28) & bVar24,
                                                CONCAT14((byte)((ulong)uVar65 >> 0x20) & bVar31 |
                                                         (byte)((ulong)uVar57 >> 0x20) & bVar23,
                                                         CONCAT13((byte)((ulong)uVar65 >> 0x18) &
                                                                  bVar30 | (byte)((ulong)uVar57 >>
                                                                                 0x18) & bVar22,
                                                                  CONCAT12((byte)((ulong)uVar65 >>
                                                                                 0x10) & bVar29 |
                                                                           (byte)((ulong)uVar57 >>
                                                                                 0x10) & bVar21,
                                                                           CONCAT11((byte)((ulong)
                                                  uVar65 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar57 >> 8) & bVar20,
                                                  (byte)uVar65 & bVar27 | (byte)uVar57 & bVar19)))))
                                      ));
        uVar4 = uVar4 - 8;
        puVar11 = puVar11 + 8;
        puVar12 = puVar12 + 8;
      } while (uVar4 != 0);
      if (uVar5 == uVar17) goto LAB_002d4698;
    }
    lVar10 = uVar17 - uVar5;
    puVar7 = (ulong *)(lVar8 + uVar5 * 8);
    puVar13 = auStack_80 + uVar5;
    do {
      *puVar7 = *puVar7 & uVar3 | *puVar13 & uVar2;
      lVar10 = lVar10 + -1;
      puVar7 = puVar7 + 1;
      puVar13 = puVar13 + 1;
    } while (lVar10 != 0);
  }
LAB_002d4698:
  func_0x0036e464(auStack_80,0x48);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
    return;
  }
  auVar67 = ___stack_chk_fail();
  lVar10 = auVar67._8_8_;
  uStack_88 = 0x2d46d4;
  lStack_b8 = *(long *)PTR____stack_chk_guard_009b01e8;
  uStack_110 = 0;
  uStack_128 = 0;
  uStack_130 = 0;
  uStack_118 = 0;
  uStack_120 = 0;
  uStack_148 = 0;
  uStack_150 = 0;
  uStack_138 = 0;
  uStack_140 = 0;
  uVar2 = *(ulong *)(auVar67._0_8_ + 0x100);
  uVar1 = *(uint *)(auVar67._0_8_ + 0x108);
  uVar3 = (ulong)(int)uVar1;
  uStack_b0 = uVar18;
  lStack_a8 = lVar9;
  uStack_a0 = uVar17;
  lStack_98 = lVar8;
  puStack_90 = auStack_6 + -10;
  lVar9 = func_0x00382cc0(lVar10,&uStack_150);
  uVar17 = uVar3;
  func_0x00382c70(auStack_100,lVar10);
  if (uVar1 != 0) {
    uVar6 = 0;
    uVar5 = -lVar9;
    uVar4 = lVar9 - 1;
    if (7 < uVar1) {
      uVar6 = uVar3 & 0xfffffffffffffff8;
      puVar11 = (undefined8 *)(lVar10 + 0x20);
      puVar12 = auStack_e0;
      uVar14 = uVar6;
      do {
        uVar51 = puVar12[-3];
        uVar18 = puVar12[-4];
        uVar53 = puVar12[-1];
        uVar52 = puVar12[-2];
        uVar55 = puVar12[1];
        uVar54 = *puVar12;
        uVar57 = puVar12[3];
        uVar56 = puVar12[2];
        uVar59 = puVar11[-3];
        uVar58 = puVar11[-4];
        uVar61 = puVar11[-1];
        uVar60 = puVar11[-2];
        uVar63 = puVar11[1];
        uVar62 = *puVar11;
        uVar65 = puVar11[3];
        uVar64 = puVar11[2];
        bVar19 = (byte)uVar5;
        bVar20 = (byte)(uVar5 >> 8);
        bVar21 = (byte)(uVar5 >> 0x10);
        bVar22 = (byte)(uVar5 >> 0x18);
        bVar23 = (byte)(uVar5 >> 0x20);
        bVar24 = (byte)(uVar5 >> 0x28);
        bVar25 = (byte)(uVar5 >> 0x30);
        bVar26 = (byte)(uVar5 >> 0x38);
        bVar27 = (byte)uVar4;
        bVar28 = (byte)(uVar4 >> 8);
        bVar29 = (byte)(uVar4 >> 0x10);
        bVar30 = (byte)(uVar4 >> 0x18);
        bVar31 = (byte)(uVar4 >> 0x20);
        bVar32 = (byte)(uVar4 >> 0x28);
        bVar33 = (byte)(uVar4 >> 0x30);
        bVar34 = (byte)(uVar4 >> 0x38);
        puVar11[-3] = CONCAT17((byte)((ulong)uVar59 >> 0x38) & bVar34 |
                               (byte)((ulong)uVar51 >> 0x38) & bVar26,
                               CONCAT16((byte)((ulong)uVar59 >> 0x30) & bVar33 |
                                        (byte)((ulong)uVar51 >> 0x30) & bVar25,
                                        CONCAT15((byte)((ulong)uVar59 >> 0x28) & bVar32 |
                                                 (byte)((ulong)uVar51 >> 0x28) & bVar24,
                                                 CONCAT14((byte)((ulong)uVar59 >> 0x20) & bVar31 |
                                                          (byte)((ulong)uVar51 >> 0x20) & bVar23,
                                                          CONCAT13((byte)((ulong)uVar59 >> 0x18) &
                                                                   bVar30 | (byte)((ulong)uVar51 >>
                                                                                  0x18) & bVar22,
                                                                   CONCAT12((byte)((ulong)uVar59 >>
                                                                                  0x10) & bVar29 |
                                                                            (byte)((ulong)uVar51 >>
                                                                                  0x10) & bVar21,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar59 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar51 >> 8) & bVar20,
                                                  (byte)uVar59 & bVar27 | (byte)uVar51 & bVar19)))))
                                       ));
        puVar11[-4] = CONCAT17((byte)((ulong)uVar58 >> 0x38) & bVar34 |
                               (byte)((ulong)uVar18 >> 0x38) & bVar26,
                               CONCAT16((byte)((ulong)uVar58 >> 0x30) & bVar33 |
                                        (byte)((ulong)uVar18 >> 0x30) & bVar25,
                                        CONCAT15((byte)((ulong)uVar58 >> 0x28) & bVar32 |
                                                 (byte)((ulong)uVar18 >> 0x28) & bVar24,
                                                 CONCAT14((byte)((ulong)uVar58 >> 0x20) & bVar31 |
                                                          (byte)((ulong)uVar18 >> 0x20) & bVar23,
                                                          CONCAT13((byte)((ulong)uVar58 >> 0x18) &
                                                                   bVar30 | (byte)((ulong)uVar18 >>
                                                                                  0x18) & bVar22,
                                                                   CONCAT12((byte)((ulong)uVar58 >>
                                                                                  0x10) & bVar29 |
                                                                            (byte)((ulong)uVar18 >>
                                                                                  0x10) & bVar21,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar58 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar18 >> 8) & bVar20,
                                                  (byte)uVar58 & bVar27 | (byte)uVar18 & bVar19)))))
                                       ));
        puVar11[-1] = CONCAT17((byte)((ulong)uVar61 >> 0x38) & bVar34 |
                               (byte)((ulong)uVar53 >> 0x38) & bVar26,
                               CONCAT16((byte)((ulong)uVar61 >> 0x30) & bVar33 |
                                        (byte)((ulong)uVar53 >> 0x30) & bVar25,
                                        CONCAT15((byte)((ulong)uVar61 >> 0x28) & bVar32 |
                                                 (byte)((ulong)uVar53 >> 0x28) & bVar24,
                                                 CONCAT14((byte)((ulong)uVar61 >> 0x20) & bVar31 |
                                                          (byte)((ulong)uVar53 >> 0x20) & bVar23,
                                                          CONCAT13((byte)((ulong)uVar61 >> 0x18) &
                                                                   bVar30 | (byte)((ulong)uVar53 >>
                                                                                  0x18) & bVar22,
                                                                   CONCAT12((byte)((ulong)uVar61 >>
                                                                                  0x10) & bVar29 |
                                                                            (byte)((ulong)uVar53 >>
                                                                                  0x10) & bVar21,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar61 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar53 >> 8) & bVar20,
                                                  (byte)uVar61 & bVar27 | (byte)uVar53 & bVar19)))))
                                       ));
        puVar11[-2] = CONCAT17((byte)((ulong)uVar60 >> 0x38) & bVar34 |
                               (byte)((ulong)uVar52 >> 0x38) & bVar26,
                               CONCAT16((byte)((ulong)uVar60 >> 0x30) & bVar33 |
                                        (byte)((ulong)uVar52 >> 0x30) & bVar25,
                                        CONCAT15((byte)((ulong)uVar60 >> 0x28) & bVar32 |
                                                 (byte)((ulong)uVar52 >> 0x28) & bVar24,
                                                 CONCAT14((byte)((ulong)uVar60 >> 0x20) & bVar31 |
                                                          (byte)((ulong)uVar52 >> 0x20) & bVar23,
                                                          CONCAT13((byte)((ulong)uVar60 >> 0x18) &
                                                                   bVar30 | (byte)((ulong)uVar52 >>
                                                                                  0x18) & bVar22,
                                                                   CONCAT12((byte)((ulong)uVar60 >>
                                                                                  0x10) & bVar29 |
                                                                            (byte)((ulong)uVar52 >>
                                                                                  0x10) & bVar21,
                                                                            CONCAT11((byte)((ulong)
                                                  uVar60 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar52 >> 8) & bVar20,
                                                  (byte)uVar60 & bVar27 | (byte)uVar52 & bVar19)))))
                                       ));
        puVar11[1] = CONCAT17((byte)((ulong)uVar63 >> 0x38) & bVar34 |
                              (byte)((ulong)uVar55 >> 0x38) & bVar26,
                              CONCAT16((byte)((ulong)uVar63 >> 0x30) & bVar33 |
                                       (byte)((ulong)uVar55 >> 0x30) & bVar25,
                                       CONCAT15((byte)((ulong)uVar63 >> 0x28) & bVar32 |
                                                (byte)((ulong)uVar55 >> 0x28) & bVar24,
                                                CONCAT14((byte)((ulong)uVar63 >> 0x20) & bVar31 |
                                                         (byte)((ulong)uVar55 >> 0x20) & bVar23,
                                                         CONCAT13((byte)((ulong)uVar63 >> 0x18) &
                                                                  bVar30 | (byte)((ulong)uVar55 >>
                                                                                 0x18) & bVar22,
                                                                  CONCAT12((byte)((ulong)uVar63 >>
                                                                                 0x10) & bVar29 |
                                                                           (byte)((ulong)uVar55 >>
                                                                                 0x10) & bVar21,
                                                                           CONCAT11((byte)((ulong)
                                                  uVar63 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar55 >> 8) & bVar20,
                                                  (byte)uVar63 & bVar27 | (byte)uVar55 & bVar19)))))
                                      ));
        *puVar11 = CONCAT17((byte)((ulong)uVar62 >> 0x38) & bVar34 |
                            (byte)((ulong)uVar54 >> 0x38) & bVar26,
                            CONCAT16((byte)((ulong)uVar62 >> 0x30) & bVar33 |
                                     (byte)((ulong)uVar54 >> 0x30) & bVar25,
                                     CONCAT15((byte)((ulong)uVar62 >> 0x28) & bVar32 |
                                              (byte)((ulong)uVar54 >> 0x28) & bVar24,
                                              CONCAT14((byte)((ulong)uVar62 >> 0x20) & bVar31 |
                                                       (byte)((ulong)uVar54 >> 0x20) & bVar23,
                                                       CONCAT13((byte)((ulong)uVar62 >> 0x18) &
                                                                bVar30 | (byte)((ulong)uVar54 >>
                                                                               0x18) & bVar22,
                                                                CONCAT12((byte)((ulong)uVar62 >>
                                                                               0x10) & bVar29 |
                                                                         (byte)((ulong)uVar54 >>
                                                                               0x10) & bVar21,
                                                                         CONCAT11((byte)((ulong)
                                                  uVar62 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar54 >> 8) & bVar20,
                                                  (byte)uVar62 & bVar27 | (byte)uVar54 & bVar19)))))
                                    ));
        puVar11[3] = CONCAT17((byte)((ulong)uVar65 >> 0x38) & bVar34 |
                              (byte)((ulong)uVar57 >> 0x38) & bVar26,
                              CONCAT16((byte)((ulong)uVar65 >> 0x30) & bVar33 |
                                       (byte)((ulong)uVar57 >> 0x30) & bVar25,
                                       CONCAT15((byte)((ulong)uVar65 >> 0x28) & bVar32 |
                                                (byte)((ulong)uVar57 >> 0x28) & bVar24,
                                                CONCAT14((byte)((ulong)uVar65 >> 0x20) & bVar31 |
                                                         (byte)((ulong)uVar57 >> 0x20) & bVar23,
                                                         CONCAT13((byte)((ulong)uVar65 >> 0x18) &
                                                                  bVar30 | (byte)((ulong)uVar57 >>
                                                                                 0x18) & bVar22,
                                                                  CONCAT12((byte)((ulong)uVar65 >>
                                                                                 0x10) & bVar29 |
                                                                           (byte)((ulong)uVar57 >>
                                                                                 0x10) & bVar21,
                                                                           CONCAT11((byte)((ulong)
                                                  uVar65 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar57 >> 8) & bVar20,
                                                  (byte)uVar65 & bVar27 | (byte)uVar57 & bVar19)))))
                                      ));
        puVar11[2] = CONCAT17((byte)((ulong)uVar64 >> 0x38) & bVar34 |
                              (byte)((ulong)uVar56 >> 0x38) & bVar26,
                              CONCAT16((byte)((ulong)uVar64 >> 0x30) & bVar33 |
                                       (byte)((ulong)uVar56 >> 0x30) & bVar25,
                                       CONCAT15((byte)((ulong)uVar64 >> 0x28) & bVar32 |
                                                (byte)((ulong)uVar56 >> 0x28) & bVar24,
                                                CONCAT14((byte)((ulong)uVar64 >> 0x20) & bVar31 |
                                                         (byte)((ulong)uVar56 >> 0x20) & bVar23,
                                                         CONCAT13((byte)((ulong)uVar64 >> 0x18) &
                                                                  bVar30 | (byte)((ulong)uVar56 >>
                                                                                 0x18) & bVar22,
                                                                  CONCAT12((byte)((ulong)uVar64 >>
                                                                                 0x10) & bVar29 |
                                                                           (byte)((ulong)uVar56 >>
                                                                                 0x10) & bVar21,
                                                                           CONCAT11((byte)((ulong)
                                                  uVar64 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar56 >> 8) & bVar20,
                                                  (byte)uVar64 & bVar27 | (byte)uVar56 & bVar19)))))
                                      ));
        uVar14 = uVar14 - 8;
        puVar11 = puVar11 + 8;
        puVar12 = puVar12 + 8;
      } while (uVar14 != 0);
      if (uVar6 == uVar3) goto LAB_002d47fc;
    }
    lVar9 = uVar3 - uVar6;
    puVar7 = (ulong *)(lVar10 + uVar6 * 8);
    puVar13 = auStack_100 + uVar6;
    do {
      *puVar7 = *puVar7 & uVar4 | *puVar13 & uVar5;
      lVar9 = lVar9 + -1;
      puVar7 = puVar7 + 1;
      puVar13 = puVar13 + 1;
    } while (lVar9 != 0);
  }
LAB_002d47fc:
  func_0x0036e464(auStack_100,0x48);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_b8) {
    return;
  }
  auVar67 = ___stack_chk_fail();
  lVar9 = auVar67._8_8_;
  uVar1 = *(uint *)(auVar67._0_8_ + 0x108);
  uVar3 = (ulong)(int)uVar1;
  if (uVar1 != 0) {
    uVar5 = ~uVar2;
    if (uVar1 < 8) {
      uVar4 = 0;
    }
    else {
      uVar4 = 0;
      if ((0x3f < lVar9 - uVar17) && (0x3f < (ulong)(lVar9 - param_8))) {
        uVar4 = uVar3 & 0xfffffffffffffff8;
        puVar11 = (undefined8 *)(lVar9 + 0x20);
        puVar12 = (undefined8 *)(uVar17 + 0x20);
        puVar16 = (undefined8 *)(param_8 + 0x20);
        uVar6 = uVar4;
        do {
          uVar51 = puVar12[-3];
          uVar18 = puVar12[-4];
          uVar53 = puVar12[-1];
          uVar52 = puVar12[-2];
          uVar55 = puVar12[1];
          uVar54 = *puVar12;
          uVar57 = puVar12[3];
          uVar56 = puVar12[2];
          uVar59 = puVar16[-3];
          uVar58 = puVar16[-4];
          uVar61 = puVar16[-1];
          uVar60 = puVar16[-2];
          uVar63 = puVar16[1];
          uVar62 = *puVar16;
          uVar65 = puVar16[3];
          uVar64 = puVar16[2];
          bVar19 = (byte)uVar2;
          bVar20 = (byte)(uVar2 >> 8);
          bVar21 = (byte)(uVar2 >> 0x10);
          bVar22 = (byte)(uVar2 >> 0x18);
          bVar23 = (byte)(uVar2 >> 0x20);
          bVar24 = (byte)(uVar2 >> 0x28);
          bVar25 = (byte)(uVar2 >> 0x30);
          bVar26 = (byte)(uVar2 >> 0x38);
          bVar27 = (byte)uVar5;
          bVar28 = (byte)(uVar5 >> 8);
          bVar29 = (byte)(uVar5 >> 0x10);
          bVar30 = (byte)(uVar5 >> 0x18);
          bVar31 = (byte)(uVar5 >> 0x20);
          bVar32 = (byte)(uVar5 >> 0x28);
          bVar33 = (byte)(uVar5 >> 0x30);
          bVar34 = (byte)(uVar5 >> 0x38);
          puVar11[-3] = CONCAT17((byte)((ulong)uVar59 >> 0x38) & bVar34 |
                                 (byte)((ulong)uVar51 >> 0x38) & bVar26,
                                 CONCAT16((byte)((ulong)uVar59 >> 0x30) & bVar33 |
                                          (byte)((ulong)uVar51 >> 0x30) & bVar25,
                                          CONCAT15((byte)((ulong)uVar59 >> 0x28) & bVar32 |
                                                   (byte)((ulong)uVar51 >> 0x28) & bVar24,
                                                   CONCAT14((byte)((ulong)uVar59 >> 0x20) & bVar31 |
                                                            (byte)((ulong)uVar51 >> 0x20) & bVar23,
                                                            CONCAT13((byte)((ulong)uVar59 >> 0x18) &
                                                                     bVar30 | (byte)((ulong)uVar51
                                                                                    >> 0x18) &
                                                                              bVar22,
                                                                     CONCAT12((byte)((ulong)uVar59
                                                                                    >> 0x10) &
                                                                              bVar29 | (byte)((ulong
                                                  )uVar51 >> 0x10) & bVar21,
                                                  CONCAT11((byte)((ulong)uVar59 >> 8) & bVar28 |
                                                           (byte)((ulong)uVar51 >> 8) & bVar20,
                                                           (byte)uVar59 & bVar27 |
                                                           (byte)uVar51 & bVar19)))))));
          puVar11[-4] = CONCAT17((byte)((ulong)uVar58 >> 0x38) & bVar34 |
                                 (byte)((ulong)uVar18 >> 0x38) & bVar26,
                                 CONCAT16((byte)((ulong)uVar58 >> 0x30) & bVar33 |
                                          (byte)((ulong)uVar18 >> 0x30) & bVar25,
                                          CONCAT15((byte)((ulong)uVar58 >> 0x28) & bVar32 |
                                                   (byte)((ulong)uVar18 >> 0x28) & bVar24,
                                                   CONCAT14((byte)((ulong)uVar58 >> 0x20) & bVar31 |
                                                            (byte)((ulong)uVar18 >> 0x20) & bVar23,
                                                            CONCAT13((byte)((ulong)uVar58 >> 0x18) &
                                                                     bVar30 | (byte)((ulong)uVar18
                                                                                    >> 0x18) &
                                                                              bVar22,
                                                                     CONCAT12((byte)((ulong)uVar58
                                                                                    >> 0x10) &
                                                                              bVar29 | (byte)((ulong
                                                  )uVar18 >> 0x10) & bVar21,
                                                  CONCAT11((byte)((ulong)uVar58 >> 8) & bVar28 |
                                                           (byte)((ulong)uVar18 >> 8) & bVar20,
                                                           (byte)uVar58 & bVar27 |
                                                           (byte)uVar18 & bVar19)))))));
          puVar11[-1] = CONCAT17((byte)((ulong)uVar61 >> 0x38) & bVar34 |
                                 (byte)((ulong)uVar53 >> 0x38) & bVar26,
                                 CONCAT16((byte)((ulong)uVar61 >> 0x30) & bVar33 |
                                          (byte)((ulong)uVar53 >> 0x30) & bVar25,
                                          CONCAT15((byte)((ulong)uVar61 >> 0x28) & bVar32 |
                                                   (byte)((ulong)uVar53 >> 0x28) & bVar24,
                                                   CONCAT14((byte)((ulong)uVar61 >> 0x20) & bVar31 |
                                                            (byte)((ulong)uVar53 >> 0x20) & bVar23,
                                                            CONCAT13((byte)((ulong)uVar61 >> 0x18) &
                                                                     bVar30 | (byte)((ulong)uVar53
                                                                                    >> 0x18) &
                                                                              bVar22,
                                                                     CONCAT12((byte)((ulong)uVar61
                                                                                    >> 0x10) &
                                                                              bVar29 | (byte)((ulong
                                                  )uVar53 >> 0x10) & bVar21,
                                                  CONCAT11((byte)((ulong)uVar61 >> 8) & bVar28 |
                                                           (byte)((ulong)uVar53 >> 8) & bVar20,
                                                           (byte)uVar61 & bVar27 |
                                                           (byte)uVar53 & bVar19)))))));
          puVar11[-2] = CONCAT17((byte)((ulong)uVar60 >> 0x38) & bVar34 |
                                 (byte)((ulong)uVar52 >> 0x38) & bVar26,
                                 CONCAT16((byte)((ulong)uVar60 >> 0x30) & bVar33 |
                                          (byte)((ulong)uVar52 >> 0x30) & bVar25,
                                          CONCAT15((byte)((ulong)uVar60 >> 0x28) & bVar32 |
                                                   (byte)((ulong)uVar52 >> 0x28) & bVar24,
                                                   CONCAT14((byte)((ulong)uVar60 >> 0x20) & bVar31 |
                                                            (byte)((ulong)uVar52 >> 0x20) & bVar23,
                                                            CONCAT13((byte)((ulong)uVar60 >> 0x18) &
                                                                     bVar30 | (byte)((ulong)uVar52
                                                                                    >> 0x18) &
                                                                              bVar22,
                                                                     CONCAT12((byte)((ulong)uVar60
                                                                                    >> 0x10) &
                                                                              bVar29 | (byte)((ulong
                                                  )uVar52 >> 0x10) & bVar21,
                                                  CONCAT11((byte)((ulong)uVar60 >> 8) & bVar28 |
                                                           (byte)((ulong)uVar52 >> 8) & bVar20,
                                                           (byte)uVar60 & bVar27 |
                                                           (byte)uVar52 & bVar19)))))));
          puVar11[1] = CONCAT17((byte)((ulong)uVar63 >> 0x38) & bVar34 |
                                (byte)((ulong)uVar55 >> 0x38) & bVar26,
                                CONCAT16((byte)((ulong)uVar63 >> 0x30) & bVar33 |
                                         (byte)((ulong)uVar55 >> 0x30) & bVar25,
                                         CONCAT15((byte)((ulong)uVar63 >> 0x28) & bVar32 |
                                                  (byte)((ulong)uVar55 >> 0x28) & bVar24,
                                                  CONCAT14((byte)((ulong)uVar63 >> 0x20) & bVar31 |
                                                           (byte)((ulong)uVar55 >> 0x20) & bVar23,
                                                           CONCAT13((byte)((ulong)uVar63 >> 0x18) &
                                                                    bVar30 | (byte)((ulong)uVar55 >>
                                                                                   0x18) & bVar22,
                                                                    CONCAT12((byte)((ulong)uVar63 >>
                                                                                   0x10) & bVar29 |
                                                                             (byte)((ulong)uVar55 >>
                                                                                   0x10) & bVar21,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar63 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar55 >> 8) & bVar20,
                                                  (byte)uVar63 & bVar27 | (byte)uVar55 & bVar19)))))
                                        ));
          *puVar11 = CONCAT17((byte)((ulong)uVar62 >> 0x38) & bVar34 |
                              (byte)((ulong)uVar54 >> 0x38) & bVar26,
                              CONCAT16((byte)((ulong)uVar62 >> 0x30) & bVar33 |
                                       (byte)((ulong)uVar54 >> 0x30) & bVar25,
                                       CONCAT15((byte)((ulong)uVar62 >> 0x28) & bVar32 |
                                                (byte)((ulong)uVar54 >> 0x28) & bVar24,
                                                CONCAT14((byte)((ulong)uVar62 >> 0x20) & bVar31 |
                                                         (byte)((ulong)uVar54 >> 0x20) & bVar23,
                                                         CONCAT13((byte)((ulong)uVar62 >> 0x18) &
                                                                  bVar30 | (byte)((ulong)uVar54 >>
                                                                                 0x18) & bVar22,
                                                                  CONCAT12((byte)((ulong)uVar62 >>
                                                                                 0x10) & bVar29 |
                                                                           (byte)((ulong)uVar54 >>
                                                                                 0x10) & bVar21,
                                                                           CONCAT11((byte)((ulong)
                                                  uVar62 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar54 >> 8) & bVar20,
                                                  (byte)uVar62 & bVar27 | (byte)uVar54 & bVar19)))))
                                      ));
          puVar11[3] = CONCAT17((byte)((ulong)uVar65 >> 0x38) & bVar34 |
                                (byte)((ulong)uVar57 >> 0x38) & bVar26,
                                CONCAT16((byte)((ulong)uVar65 >> 0x30) & bVar33 |
                                         (byte)((ulong)uVar57 >> 0x30) & bVar25,
                                         CONCAT15((byte)((ulong)uVar65 >> 0x28) & bVar32 |
                                                  (byte)((ulong)uVar57 >> 0x28) & bVar24,
                                                  CONCAT14((byte)((ulong)uVar65 >> 0x20) & bVar31 |
                                                           (byte)((ulong)uVar57 >> 0x20) & bVar23,
                                                           CONCAT13((byte)((ulong)uVar65 >> 0x18) &
                                                                    bVar30 | (byte)((ulong)uVar57 >>
                                                                                   0x18) & bVar22,
                                                                    CONCAT12((byte)((ulong)uVar65 >>
                                                                                   0x10) & bVar29 |
                                                                             (byte)((ulong)uVar57 >>
                                                                                   0x10) & bVar21,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar65 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar57 >> 8) & bVar20,
                                                  (byte)uVar65 & bVar27 | (byte)uVar57 & bVar19)))))
                                        ));
          puVar11[2] = CONCAT17((byte)((ulong)uVar64 >> 0x38) & bVar34 |
                                (byte)((ulong)uVar56 >> 0x38) & bVar26,
                                CONCAT16((byte)((ulong)uVar64 >> 0x30) & bVar33 |
                                         (byte)((ulong)uVar56 >> 0x30) & bVar25,
                                         CONCAT15((byte)((ulong)uVar64 >> 0x28) & bVar32 |
                                                  (byte)((ulong)uVar56 >> 0x28) & bVar24,
                                                  CONCAT14((byte)((ulong)uVar64 >> 0x20) & bVar31 |
                                                           (byte)((ulong)uVar56 >> 0x20) & bVar23,
                                                           CONCAT13((byte)((ulong)uVar64 >> 0x18) &
                                                                    bVar30 | (byte)((ulong)uVar56 >>
                                                                                   0x18) & bVar22,
                                                                    CONCAT12((byte)((ulong)uVar64 >>
                                                                                   0x10) & bVar29 |
                                                                             (byte)((ulong)uVar56 >>
                                                                                   0x10) & bVar21,
                                                                             CONCAT11((byte)((ulong)
                                                  uVar64 >> 8) & bVar28 |
                                                  (byte)((ulong)uVar56 >> 8) & bVar20,
                                                  (byte)uVar64 & bVar27 | (byte)uVar56 & bVar19)))))
                                        ));
          uVar6 = uVar6 - 8;
          puVar11 = puVar11 + 8;
          puVar12 = puVar12 + 8;
          puVar16 = puVar16 + 8;
        } while (uVar6 != 0);
        if (uVar4 == uVar3) {
          return;
        }
      }
    }
    lVar8 = uVar3 - uVar4;
    lVar10 = uVar4 * 8;
    puVar7 = (ulong *)(lVar9 + lVar10);
    puVar13 = (ulong *)(param_8 + lVar10);
    puVar15 = (ulong *)(uVar17 + lVar10);
    do {
      *puVar7 = *puVar13 & uVar5 | *puVar15 & uVar2;
      lVar8 = lVar8 + -1;
      puVar7 = puVar7 + 1;
      puVar13 = puVar13 + 1;
      puVar15 = puVar15 + 1;
    } while (lVar8 != 0);
  }
  return;
}


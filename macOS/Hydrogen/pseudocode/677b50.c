
void FUN_00677b50(ulong param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined1 param_5 [16],undefined1 param_6 [16],
                 undefined1 param_7 [16])

{
  ulong *puVar1;
  ulong in_x9;
  long lVar2;
  ulong in_x10;
  ulong *puVar3;
  ulong in_x11;
  undefined8 *in_x12;
  undefined8 *puVar4;
  undefined8 *in_x13;
  ulong in_x14;
  long unaff_x20;
  long unaff_x21;
  ulong uVar5;
  ulong unaff_x22;
  ulong *unaff_x24;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  
  uVar17 = param_7._8_8_;
  uVar16 = param_7._0_8_;
  uVar15 = param_6._8_8_;
  uVar14 = param_6._0_8_;
  uVar13 = param_5._8_8_;
  uVar12 = param_5._0_8_;
  uVar11 = param_4._8_8_;
  uVar10 = param_4._0_8_;
  uVar9 = param_3._8_8_;
  uVar8 = param_3._0_8_;
  uVar7 = param_2._8_8_;
  uVar6 = param_2._0_8_;
  do {
    uVar19 = in_x13[1];
    uVar18 = *in_x13;
    uVar21 = in_x13[3];
    uVar20 = in_x13[2];
    in_x13[-3] = CONCAT17((byte)((ulong)uVar15 >> 0x38) ^ (byte)((ulong)uVar7 >> 0x38),
                          CONCAT16((byte)((ulong)uVar15 >> 0x30) ^ (byte)((ulong)uVar7 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar15 >> 0x28) ^
                                            (byte)((ulong)uVar7 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar15 >> 0x20) ^
                                                     (byte)((ulong)uVar7 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar15 >> 0x18) ^
                                                              (byte)((ulong)uVar7 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar15 >> 0x10)
                                                                       ^ (byte)((ulong)uVar7 >> 0x10
                                                                               ),
                                                                       CONCAT11((byte)((ulong)uVar15
                                                                                      >> 8) ^
                                                                                (byte)((ulong)uVar7
                                                                                      >> 8),
                                                                                (byte)uVar15 ^
                                                                                (byte)uVar7)))))));
    in_x13[-4] = CONCAT17((byte)((ulong)uVar14 >> 0x38) ^ (byte)((ulong)uVar6 >> 0x38),
                          CONCAT16((byte)((ulong)uVar14 >> 0x30) ^ (byte)((ulong)uVar6 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar14 >> 0x28) ^
                                            (byte)((ulong)uVar6 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar14 >> 0x20) ^
                                                     (byte)((ulong)uVar6 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar14 >> 0x18) ^
                                                              (byte)((ulong)uVar6 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar14 >> 0x10)
                                                                       ^ (byte)((ulong)uVar6 >> 0x10
                                                                               ),
                                                                       CONCAT11((byte)((ulong)uVar14
                                                                                      >> 8) ^
                                                                                (byte)((ulong)uVar6
                                                                                      >> 8),
                                                                                (byte)uVar14 ^
                                                                                (byte)uVar6)))))));
    in_x13[-1] = CONCAT17((byte)((ulong)uVar17 >> 0x38) ^ (byte)((ulong)uVar9 >> 0x38),
                          CONCAT16((byte)((ulong)uVar17 >> 0x30) ^ (byte)((ulong)uVar9 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar17 >> 0x28) ^
                                            (byte)((ulong)uVar9 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar17 >> 0x20) ^
                                                     (byte)((ulong)uVar9 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar17 >> 0x18) ^
                                                              (byte)((ulong)uVar9 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar17 >> 0x10)
                                                                       ^ (byte)((ulong)uVar9 >> 0x10
                                                                               ),
                                                                       CONCAT11((byte)((ulong)uVar17
                                                                                      >> 8) ^
                                                                                (byte)((ulong)uVar9
                                                                                      >> 8),
                                                                                (byte)uVar17 ^
                                                                                (byte)uVar9)))))));
    in_x13[-2] = CONCAT17((byte)((ulong)uVar16 >> 0x38) ^ (byte)((ulong)uVar8 >> 0x38),
                          CONCAT16((byte)((ulong)uVar16 >> 0x30) ^ (byte)((ulong)uVar8 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar16 >> 0x28) ^
                                            (byte)((ulong)uVar8 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar16 >> 0x20) ^
                                                     (byte)((ulong)uVar8 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar16 >> 0x18) ^
                                                              (byte)((ulong)uVar8 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar16 >> 0x10)
                                                                       ^ (byte)((ulong)uVar8 >> 0x10
                                                                               ),
                                                                       CONCAT11((byte)((ulong)uVar16
                                                                                      >> 8) ^
                                                                                (byte)((ulong)uVar8
                                                                                      >> 8),
                                                                                (byte)uVar16 ^
                                                                                (byte)uVar8)))))));
    puVar4 = in_x13 + 8;
    in_x13[1] = CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar11 >> 0x38),
                         CONCAT16((byte)((ulong)uVar19 >> 0x30) ^ (byte)((ulong)uVar11 >> 0x30),
                                  CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                           (byte)((ulong)uVar11 >> 0x28),
                                           CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                    (byte)((ulong)uVar11 >> 0x20),
                                                    CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                             (byte)((ulong)uVar11 >> 0x18),
                                                             CONCAT12((byte)((ulong)uVar19 >> 0x10)
                                                                      ^ (byte)((ulong)uVar11 >> 0x10
                                                                              ),
                                                                      CONCAT11((byte)((ulong)uVar19
                                                                                     >> 8) ^
                                                                               (byte)((ulong)uVar11
                                                                                     >> 8),
                                                                               (byte)uVar19 ^
                                                                               (byte)uVar11)))))));
    *in_x13 = CONCAT17((byte)((ulong)uVar18 >> 0x38) ^ (byte)((ulong)uVar10 >> 0x38),
                       CONCAT16((byte)((ulong)uVar18 >> 0x30) ^ (byte)((ulong)uVar10 >> 0x30),
                                CONCAT15((byte)((ulong)uVar18 >> 0x28) ^
                                         (byte)((ulong)uVar10 >> 0x28),
                                         CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                                  (byte)((ulong)uVar10 >> 0x20),
                                                  CONCAT13((byte)((ulong)uVar18 >> 0x18) ^
                                                           (byte)((ulong)uVar10 >> 0x18),
                                                           CONCAT12((byte)((ulong)uVar18 >> 0x10) ^
                                                                    (byte)((ulong)uVar10 >> 0x10),
                                                                    CONCAT11((byte)((ulong)uVar18 >>
                                                                                   8) ^
                                                                             (byte)((ulong)uVar10 >>
                                                                                   8),(byte)uVar18 ^
                                                                                      (byte)uVar10))
                                                          )))));
    in_x13[3] = CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar13 >> 0x38),
                         CONCAT16((byte)((ulong)uVar21 >> 0x30) ^ (byte)((ulong)uVar13 >> 0x30),
                                  CONCAT15((byte)((ulong)uVar21 >> 0x28) ^
                                           (byte)((ulong)uVar13 >> 0x28),
                                           CONCAT14((byte)((ulong)uVar21 >> 0x20) ^
                                                    (byte)((ulong)uVar13 >> 0x20),
                                                    CONCAT13((byte)((ulong)uVar21 >> 0x18) ^
                                                             (byte)((ulong)uVar13 >> 0x18),
                                                             CONCAT12((byte)((ulong)uVar21 >> 0x10)
                                                                      ^ (byte)((ulong)uVar13 >> 0x10
                                                                              ),
                                                                      CONCAT11((byte)((ulong)uVar21
                                                                                     >> 8) ^
                                                                               (byte)((ulong)uVar13
                                                                                     >> 8),
                                                                               (byte)uVar21 ^
                                                                               (byte)uVar13)))))));
    in_x13[2] = CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar12 >> 0x38),
                         CONCAT16((byte)((ulong)uVar20 >> 0x30) ^ (byte)((ulong)uVar12 >> 0x30),
                                  CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                           (byte)((ulong)uVar12 >> 0x28),
                                           CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                    (byte)((ulong)uVar12 >> 0x20),
                                                    CONCAT13((byte)((ulong)uVar20 >> 0x18) ^
                                                             (byte)((ulong)uVar12 >> 0x18),
                                                             CONCAT12((byte)((ulong)uVar20 >> 0x10)
                                                                      ^ (byte)((ulong)uVar12 >> 0x10
                                                                              ),
                                                                      CONCAT11((byte)((ulong)uVar20
                                                                                     >> 8) ^
                                                                               (byte)((ulong)uVar12
                                                                                     >> 8),
                                                                               (byte)uVar20 ^
                                                                               (byte)uVar12)))))));
    in_x14 = in_x14 - 8;
    if (in_x14 == 0) {
      uVar5 = unaff_x22;
      if (in_x9 == in_x11) goto LAB_00677ac8;
      while( true ) {
        lVar2 = in_x9 - in_x11;
        puVar1 = (ulong *)(param_1 + in_x11 * 8);
        puVar3 = (ulong *)(in_x10 + in_x11 * 8);
        do {
          *puVar3 = *puVar3 ^ *puVar1;
          lVar2 = lVar2 + -1;
          puVar1 = puVar1 + 1;
          puVar3 = puVar3 + 1;
          uVar5 = unaff_x22;
        } while (lVar2 != 0);
LAB_00677ac8:
        do {
          unaff_x22 = uVar5 - 1;
          if ((long)uVar5 < 1) {
            return;
          }
          func_0x00677bc4();
          uVar5 = unaff_x22;
        } while (((*(ulong *)(unaff_x20 + 0x10) <= unaff_x22 >> 6) ||
                 ((*(ulong *)(*(long *)(unaff_x20 + 0x18) + (unaff_x22 >> 6) * 8) >>
                   (unaff_x22 & 0x3f) & 1) == 0)) ||
                (in_x9 = *(ulong *)(unaff_x21 + 0x10), in_x9 == 0));
        in_x10 = *unaff_x24;
        param_1 = *(ulong *)(unaff_x21 + 0x18);
        if ((7 < in_x9) && (param_1 + in_x9 * 8 <= in_x10 || in_x10 + in_x9 * 8 <= param_1)) break;
        in_x11 = 0;
      }
      in_x11 = in_x9 & 0xfffffffffffffff8;
      in_x12 = (undefined8 *)(param_1 + 0x20);
      puVar4 = (undefined8 *)(in_x10 + 0x20);
      in_x14 = in_x11;
    }
    uVar7 = in_x12[-3];
    uVar6 = in_x12[-4];
    uVar9 = in_x12[-1];
    uVar8 = in_x12[-2];
    uVar11 = in_x12[1];
    uVar10 = *in_x12;
    uVar13 = in_x12[3];
    uVar12 = in_x12[2];
    uVar15 = puVar4[-3];
    uVar14 = puVar4[-4];
    uVar17 = puVar4[-1];
    uVar16 = puVar4[-2];
    in_x12 = in_x12 + 8;
    in_x13 = puVar4;
  } while( true );
}


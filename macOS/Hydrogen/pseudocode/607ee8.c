
void FUN_00607ee8(long param_1)

{
  long in_x9;
  ulong *puVar1;
  undefined8 *in_x10;
  long lVar2;
  undefined8 *in_x11;
  ulong *puVar3;
  long in_x12;
  long unaff_x19;
  long unaff_x20;
  long unaff_x24;
  long unaff_x25;
  undefined8 uVar4;
  undefined8 uVar5;
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
  
  do {
    uVar5 = in_x10[-3];
    uVar4 = in_x10[-4];
    uVar7 = in_x10[-1];
    uVar6 = in_x10[-2];
    uVar9 = in_x10[1];
    uVar8 = *in_x10;
    uVar11 = in_x10[3];
    uVar10 = in_x10[2];
    uVar13 = in_x11[-3];
    uVar12 = in_x11[-4];
    uVar15 = in_x11[-1];
    uVar14 = in_x11[-2];
    uVar17 = in_x11[1];
    uVar16 = *in_x11;
    uVar19 = in_x11[3];
    uVar18 = in_x11[2];
    in_x11[-3] = CONCAT17((byte)((ulong)uVar13 >> 0x38) | (byte)((ulong)uVar5 >> 0x38),
                          CONCAT16((byte)((ulong)uVar13 >> 0x30) | (byte)((ulong)uVar5 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar13 >> 0x28) |
                                            (byte)((ulong)uVar5 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar13 >> 0x20) |
                                                     (byte)((ulong)uVar5 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar13 >> 0x18) |
                                                              (byte)((ulong)uVar5 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar13 >> 0x10)
                                                                       | (byte)((ulong)uVar5 >> 0x10
                                                                               ),
                                                                       CONCAT11((byte)((ulong)uVar13
                                                                                      >> 8) |
                                                                                (byte)((ulong)uVar5
                                                                                      >> 8),
                                                                                (byte)uVar13 |
                                                                                (byte)uVar5)))))));
    in_x11[-4] = CONCAT17((byte)((ulong)uVar12 >> 0x38) | (byte)((ulong)uVar4 >> 0x38),
                          CONCAT16((byte)((ulong)uVar12 >> 0x30) | (byte)((ulong)uVar4 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar12 >> 0x28) |
                                            (byte)((ulong)uVar4 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar12 >> 0x20) |
                                                     (byte)((ulong)uVar4 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar12 >> 0x18) |
                                                              (byte)((ulong)uVar4 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar12 >> 0x10)
                                                                       | (byte)((ulong)uVar4 >> 0x10
                                                                               ),
                                                                       CONCAT11((byte)((ulong)uVar12
                                                                                      >> 8) |
                                                                                (byte)((ulong)uVar4
                                                                                      >> 8),
                                                                                (byte)uVar12 |
                                                                                (byte)uVar4)))))));
    in_x11[-1] = CONCAT17((byte)((ulong)uVar15 >> 0x38) | (byte)((ulong)uVar7 >> 0x38),
                          CONCAT16((byte)((ulong)uVar15 >> 0x30) | (byte)((ulong)uVar7 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar15 >> 0x28) |
                                            (byte)((ulong)uVar7 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar15 >> 0x20) |
                                                     (byte)((ulong)uVar7 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar15 >> 0x18) |
                                                              (byte)((ulong)uVar7 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar15 >> 0x10)
                                                                       | (byte)((ulong)uVar7 >> 0x10
                                                                               ),
                                                                       CONCAT11((byte)((ulong)uVar15
                                                                                      >> 8) |
                                                                                (byte)((ulong)uVar7
                                                                                      >> 8),
                                                                                (byte)uVar15 |
                                                                                (byte)uVar7)))))));
    in_x11[-2] = CONCAT17((byte)((ulong)uVar14 >> 0x38) | (byte)((ulong)uVar6 >> 0x38),
                          CONCAT16((byte)((ulong)uVar14 >> 0x30) | (byte)((ulong)uVar6 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar14 >> 0x28) |
                                            (byte)((ulong)uVar6 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar14 >> 0x20) |
                                                     (byte)((ulong)uVar6 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar14 >> 0x18) |
                                                              (byte)((ulong)uVar6 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar14 >> 0x10)
                                                                       | (byte)((ulong)uVar6 >> 0x10
                                                                               ),
                                                                       CONCAT11((byte)((ulong)uVar14
                                                                                      >> 8) |
                                                                                (byte)((ulong)uVar6
                                                                                      >> 8),
                                                                                (byte)uVar14 |
                                                                                (byte)uVar6)))))));
    in_x11[1] = CONCAT17((byte)((ulong)uVar17 >> 0x38) | (byte)((ulong)uVar9 >> 0x38),
                         CONCAT16((byte)((ulong)uVar17 >> 0x30) | (byte)((ulong)uVar9 >> 0x30),
                                  CONCAT15((byte)((ulong)uVar17 >> 0x28) |
                                           (byte)((ulong)uVar9 >> 0x28),
                                           CONCAT14((byte)((ulong)uVar17 >> 0x20) |
                                                    (byte)((ulong)uVar9 >> 0x20),
                                                    CONCAT13((byte)((ulong)uVar17 >> 0x18) |
                                                             (byte)((ulong)uVar9 >> 0x18),
                                                             CONCAT12((byte)((ulong)uVar17 >> 0x10)
                                                                      | (byte)((ulong)uVar9 >> 0x10)
                                                                      ,CONCAT11((byte)((ulong)uVar17
                                                                                      >> 8) |
                                                                                (byte)((ulong)uVar9
                                                                                      >> 8),
                                                                                (byte)uVar17 |
                                                                                (byte)uVar9)))))));
    *in_x11 = CONCAT17((byte)((ulong)uVar16 >> 0x38) | (byte)((ulong)uVar8 >> 0x38),
                       CONCAT16((byte)((ulong)uVar16 >> 0x30) | (byte)((ulong)uVar8 >> 0x30),
                                CONCAT15((byte)((ulong)uVar16 >> 0x28) |
                                         (byte)((ulong)uVar8 >> 0x28),
                                         CONCAT14((byte)((ulong)uVar16 >> 0x20) |
                                                  (byte)((ulong)uVar8 >> 0x20),
                                                  CONCAT13((byte)((ulong)uVar16 >> 0x18) |
                                                           (byte)((ulong)uVar8 >> 0x18),
                                                           CONCAT12((byte)((ulong)uVar16 >> 0x10) |
                                                                    (byte)((ulong)uVar8 >> 0x10),
                                                                    CONCAT11((byte)((ulong)uVar16 >>
                                                                                   8) |
                                                                             (byte)((ulong)uVar8 >>
                                                                                   8),(byte)uVar16 |
                                                                                      (byte)uVar8)))
                                                 ))));
    in_x11[3] = CONCAT17((byte)((ulong)uVar19 >> 0x38) | (byte)((ulong)uVar11 >> 0x38),
                         CONCAT16((byte)((ulong)uVar19 >> 0x30) | (byte)((ulong)uVar11 >> 0x30),
                                  CONCAT15((byte)((ulong)uVar19 >> 0x28) |
                                           (byte)((ulong)uVar11 >> 0x28),
                                           CONCAT14((byte)((ulong)uVar19 >> 0x20) |
                                                    (byte)((ulong)uVar11 >> 0x20),
                                                    CONCAT13((byte)((ulong)uVar19 >> 0x18) |
                                                             (byte)((ulong)uVar11 >> 0x18),
                                                             CONCAT12((byte)((ulong)uVar19 >> 0x10)
                                                                      | (byte)((ulong)uVar11 >> 0x10
                                                                              ),
                                                                      CONCAT11((byte)((ulong)uVar19
                                                                                     >> 8) |
                                                                               (byte)((ulong)uVar11
                                                                                     >> 8),
                                                                               (byte)uVar19 |
                                                                               (byte)uVar11)))))));
    in_x11[2] = CONCAT17((byte)((ulong)uVar18 >> 0x38) | (byte)((ulong)uVar10 >> 0x38),
                         CONCAT16((byte)((ulong)uVar18 >> 0x30) | (byte)((ulong)uVar10 >> 0x30),
                                  CONCAT15((byte)((ulong)uVar18 >> 0x28) |
                                           (byte)((ulong)uVar10 >> 0x28),
                                           CONCAT14((byte)((ulong)uVar18 >> 0x20) |
                                                    (byte)((ulong)uVar10 >> 0x20),
                                                    CONCAT13((byte)((ulong)uVar18 >> 0x18) |
                                                             (byte)((ulong)uVar10 >> 0x18),
                                                             CONCAT12((byte)((ulong)uVar18 >> 0x10)
                                                                      | (byte)((ulong)uVar10 >> 0x10
                                                                              ),
                                                                      CONCAT11((byte)((ulong)uVar18
                                                                                     >> 8) |
                                                                               (byte)((ulong)uVar10
                                                                                     >> 8),
                                                                               (byte)uVar18 |
                                                                               (byte)uVar10)))))));
    in_x12 = in_x12 + -8;
    in_x10 = in_x10 + 8;
    in_x11 = in_x11 + 8;
  } while (in_x12 != 0);
  if (unaff_x24 != in_x9) {
    lVar2 = unaff_x24 - in_x9;
    puVar1 = (ulong *)(unaff_x20 + in_x9 * 8);
    puVar3 = (ulong *)(param_1 + in_x9 * 8);
    do {
      *puVar1 = *puVar1 | *puVar3;
      lVar2 = lVar2 + -1;
      puVar1 = puVar1 + 1;
      puVar3 = puVar3 + 1;
    } while (lVar2 != 0);
  }
  if (unaff_x20 != param_1) {
    _memcpy(unaff_x20 + unaff_x24 * 8,param_1 + unaff_x24 * 8,unaff_x25 << 3);
  }
  *(undefined4 *)(unaff_x19 + 0x28) = 0;
  return;
}


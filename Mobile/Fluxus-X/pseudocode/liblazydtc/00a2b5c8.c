/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2b5c8
 */

undefined8 BN_GF2m_add(ulong *param_1,ulong *param_2,ulong *param_3)

{
  ulong *puVar1;
  int iVar2;
  uint uVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  long lVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  ulong uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  
  puVar1 = param_3;
  if ((int)param_3[1] <= (int)param_2[1]) {
    puVar1 = param_2;
  }
  if ((int)param_3[1] <= (int)param_2[1]) {
    param_2 = param_3;
  }
  lVar4 = bn_wexpand(param_1,(int)puVar1[1]);
  if (lVar4 == 0) {
    return 0;
  }
  uVar3 = (uint)param_2[1];
  uVar5 = (ulong)(int)uVar3;
  if ((int)uVar3 < 1) {
    uVar9 = 0;
  }
  else {
    uVar6 = *puVar1;
    uVar7 = *param_2;
    uVar8 = *param_1;
    uVar9 = 0;
    if (3 < uVar3) {
      lVar4 = uVar5 * 8;
      if (uVar8 < uVar6 + lVar4 && uVar6 < uVar8 + lVar4) {
        uVar9 = 0;
      }
      else {
        uVar9 = 0;
        if (uVar7 + lVar4 <= uVar8 || uVar8 + lVar4 <= uVar7) {
          uVar9 = uVar5 & 0xfffffffffffffffc;
          puVar11 = (undefined8 *)(uVar6 + 0x10);
          puVar12 = (undefined8 *)(uVar7 + 0x10);
          puVar13 = (undefined8 *)(uVar8 + 0x10);
          uVar14 = uVar9;
          do {
            uVar16 = puVar11[-1];
            uVar15 = puVar11[-2];
            uVar18 = puVar11[1];
            uVar17 = *puVar11;
            uVar20 = puVar12[-1];
            uVar19 = puVar12[-2];
            uVar22 = puVar12[1];
            uVar21 = *puVar12;
            puVar11 = puVar11 + 4;
            puVar12 = puVar12 + 4;
            uVar14 = uVar14 - 4;
            puVar13[-1] = CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar20 >> 0x30) ^
                                            (byte)((ulong)uVar16 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                                     (byte)((ulong)uVar16 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                              (byte)((ulong)uVar16 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar20 >> 0x18)
                                                                       ^ (byte)((ulong)uVar16 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar20
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar16
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar20 >> 8) ^ (byte)((ulong)uVar16 >> 8),
                                                  (byte)uVar20 ^ (byte)uVar16)))))));
            puVar13[-2] = CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar19 >> 0x30) ^
                                            (byte)((ulong)uVar15 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                                     (byte)((ulong)uVar15 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                              (byte)((ulong)uVar15 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar19 >> 0x18)
                                                                       ^ (byte)((ulong)uVar15 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar19
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar15
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar19 >> 8) ^ (byte)((ulong)uVar15 >> 8),
                                                  (byte)uVar19 ^ (byte)uVar15)))))));
            puVar13[1] = CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                                  CONCAT16((byte)((ulong)uVar22 >> 0x30) ^
                                           (byte)((ulong)uVar18 >> 0x30),
                                           CONCAT15((byte)((ulong)uVar22 >> 0x28) ^
                                                    (byte)((ulong)uVar18 >> 0x28),
                                                    CONCAT14((byte)((ulong)uVar22 >> 0x20) ^
                                                             (byte)((ulong)uVar18 >> 0x20),
                                                             CONCAT13((byte)((ulong)uVar22 >> 0x18)
                                                                      ^ (byte)((ulong)uVar18 >> 0x18
                                                                              ),
                                                                      CONCAT12((byte)((ulong)uVar22
                                                                                     >> 0x10) ^
                                                                               (byte)((ulong)uVar18
                                                                                     >> 0x10),
                                                                               CONCAT11((byte)((
                                                  ulong)uVar22 >> 8) ^ (byte)((ulong)uVar18 >> 8),
                                                  (byte)uVar22 ^ (byte)uVar18)))))));
            *puVar13 = CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                                CONCAT16((byte)((ulong)uVar21 >> 0x30) ^
                                         (byte)((ulong)uVar17 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar21 >> 0x28) ^
                                                  (byte)((ulong)uVar17 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar21 >> 0x20) ^
                                                           (byte)((ulong)uVar17 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar21 >> 0x18) ^
                                                                    (byte)((ulong)uVar17 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar21 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar17 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar21 >> 8) ^ (byte)((ulong)uVar17 >> 8),
                                                  (byte)uVar21 ^ (byte)uVar17)))))));
            puVar13 = puVar13 + 4;
          } while (uVar14 != 0);
          if (uVar9 == uVar5) goto LAB_00a2b6dc;
        }
      }
    }
    do {
      lVar4 = uVar9 * 8;
      uVar9 = uVar9 + 1;
      *(ulong *)(uVar8 + lVar4) = *(ulong *)(uVar7 + lVar4) ^ *(ulong *)(uVar6 + lVar4);
    } while ((long)uVar9 < (long)uVar5);
  }
LAB_00a2b6dc:
  iVar2 = (int)puVar1[1];
  if ((int)uVar9 < iVar2) {
    uVar5 = *puVar1;
    uVar6 = *param_1;
    uVar3 = (iVar2 + -1) - (int)uVar9;
    uVar7 = (ulong)uVar3;
    uVar9 = uVar9 & 0xffffffff;
    if (3 < uVar7 + 1) {
      lVar10 = uVar9 * 8;
      lVar4 = (uVar9 + uVar7) * 8 + 8;
      if ((uVar5 + lVar4 <= uVar6 + lVar10) || (uVar6 + lVar4 <= uVar5 + lVar10)) {
        uVar3 = uVar3 + 1 & 3;
        puVar12 = (undefined8 *)(uVar6 + lVar10 + 0x10);
        puVar11 = (undefined8 *)(uVar5 + lVar10 + 0x10);
        uVar9 = ((uVar7 + 1) - (ulong)uVar3) + uVar9;
        lVar4 = (uVar7 + 1) - (ulong)uVar3;
        do {
          puVar13 = puVar11 + -1;
          uVar15 = puVar11[-2];
          uVar17 = puVar11[1];
          uVar16 = *puVar11;
          lVar4 = lVar4 + -4;
          puVar11 = puVar11 + 4;
          puVar12[-1] = *puVar13;
          puVar12[-2] = uVar15;
          puVar12[1] = uVar17;
          *puVar12 = uVar16;
          puVar12 = puVar12 + 4;
        } while (lVar4 != 0);
        if (uVar3 == 0) goto LAB_00a2b790;
      }
    }
    do {
      lVar4 = uVar9 * 8;
      uVar9 = uVar9 + 1;
      *(undefined8 *)(uVar6 + lVar4) = *(undefined8 *)(uVar5 + lVar4);
    } while ((int)uVar9 < iVar2);
  }
LAB_00a2b790:
  *(int *)(param_1 + 1) = iVar2;
  bn_correct_top(param_1);
  return 1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a03110
 */

undefined8 FUN_00a03110(undefined8 *param_1,long *param_2,long param_3)

{
  uint num;
  int iVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  undefined8 *puVar5;
  ulong uVar6;
  ulong *puVar7;
  ulong *puVar8;
  ulong *puVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  uint uVar13;
  byte bVar14;
  byte bVar15;
  byte bVar16;
  byte bVar17;
  byte bVar18;
  byte bVar19;
  byte bVar20;
  byte bVar21;
  byte bVar22;
  byte bVar24;
  byte bVar25;
  int iVar23;
  byte bVar26;
  byte bVar27;
  byte bVar29;
  byte bVar30;
  int iVar28;
  byte bVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  long lVar35;
  undefined8 uVar36;
  long lVar37;
  ulong uVar38;
  long lVar39;
  ulong uVar40;
  ulong uVar41;
  ulong uVar42;
  
  num = *(uint *)(param_3 + 0x28);
  uVar6 = (ulong)num;
  if (num == 0) {
    *(undefined4 *)(param_1 + 1) = 0;
    return 1;
  }
  lVar11 = (long)(int)num;
  uVar10 = lVar11 * 2;
  lVar2 = bn_wexpand(param_2,uVar10 & 0xffffffff);
  if (lVar2 == 0) {
    return 0;
  }
  *(uint *)(param_2 + 2) = *(uint *)(param_2 + 2) ^ *(uint *)(param_3 + 0x30);
  puVar8 = *(ulong **)(param_3 + 0x20);
  if ((int)num < 1) {
    uVar12 = 0;
    *(int *)(param_2 + 1) = (int)uVar10;
    goto LAB_00a032a0;
  }
  puVar9 = (ulong *)*param_2;
  iVar1 = (int)param_2[1];
  uVar12 = uVar10;
  if ((long)uVar10 < 2) {
    uVar12 = 1;
  }
  uVar3 = 0;
  if (uVar12 < 4) {
LAB_00a031fc:
    do {
      uVar12 = uVar3 + 1;
      puVar9[uVar3] = puVar9[uVar3] & -(ulong)((uint)((int)uVar3 - iVar1) >> 0x1f);
      uVar3 = uVar12;
    } while ((long)uVar12 < (long)uVar10);
  }
  else {
    iVar23 = 0;
    iVar28 = 1;
    uVar3 = uVar12 & 0x7ffffffffffffffc;
    puVar7 = puVar9 + 2;
    uVar4 = uVar3;
    do {
      uVar40 = puVar7[-1];
      uVar38 = puVar7[-2];
      uVar42 = puVar7[1];
      uVar41 = *puVar7;
      lVar37 = -(ulong)((uint)(iVar23 - iVar1) >> 0x1f);
      lVar39 = -(ulong)((uint)(iVar28 - iVar1) >> 0x1f);
      lVar2 = -(ulong)((uint)((iVar23 + 2) - iVar1) >> 0x1f);
      lVar35 = -(ulong)((uint)((iVar28 + 2) - iVar1) >> 0x1f);
      iVar23 = iVar23 + 4;
      iVar28 = iVar28 + 4;
      uVar4 = uVar4 - 4;
      puVar7[-1] = CONCAT17((byte)(uVar40 >> 0x38) & (byte)((ulong)lVar39 >> 0x38),
                            CONCAT16((byte)(uVar40 >> 0x30) & (byte)((ulong)lVar39 >> 0x30),
                                     CONCAT15((byte)(uVar40 >> 0x28) & (byte)((ulong)lVar39 >> 0x28)
                                              ,CONCAT14((byte)(uVar40 >> 0x20) &
                                                        (byte)((ulong)lVar39 >> 0x20),
                                                        CONCAT13((byte)(uVar40 >> 0x18) &
                                                                 (byte)((ulong)lVar39 >> 0x18),
                                                                 CONCAT12((byte)(uVar40 >> 0x10) &
                                                                          (byte)((ulong)lVar39 >>
                                                                                0x10),
                                                                          CONCAT11((byte)(uVar40 >>
                                                                                         8) &
                                                                                   (byte)((ulong)
                                                  lVar39 >> 8),(byte)uVar40 & (byte)lVar39)))))));
      puVar7[-2] = CONCAT17((byte)(uVar38 >> 0x38) & (byte)((ulong)lVar37 >> 0x38),
                            CONCAT16((byte)(uVar38 >> 0x30) & (byte)((ulong)lVar37 >> 0x30),
                                     CONCAT15((byte)(uVar38 >> 0x28) & (byte)((ulong)lVar37 >> 0x28)
                                              ,CONCAT14((byte)(uVar38 >> 0x20) &
                                                        (byte)((ulong)lVar37 >> 0x20),
                                                        CONCAT13((byte)(uVar38 >> 0x18) &
                                                                 (byte)((ulong)lVar37 >> 0x18),
                                                                 CONCAT12((byte)(uVar38 >> 0x10) &
                                                                          (byte)((ulong)lVar37 >>
                                                                                0x10),
                                                                          CONCAT11((byte)(uVar38 >>
                                                                                         8) &
                                                                                   (byte)((ulong)
                                                  lVar37 >> 8),(byte)uVar38 & (byte)lVar37)))))));
      puVar7[1] = CONCAT17((byte)(uVar42 >> 0x38) & (byte)((ulong)lVar35 >> 0x38),
                           CONCAT16((byte)(uVar42 >> 0x30) & (byte)((ulong)lVar35 >> 0x30),
                                    CONCAT15((byte)(uVar42 >> 0x28) & (byte)((ulong)lVar35 >> 0x28),
                                             CONCAT14((byte)(uVar42 >> 0x20) &
                                                      (byte)((ulong)lVar35 >> 0x20),
                                                      CONCAT13((byte)(uVar42 >> 0x18) &
                                                               (byte)((ulong)lVar35 >> 0x18),
                                                               CONCAT12((byte)(uVar42 >> 0x10) &
                                                                        (byte)((ulong)lVar35 >> 0x10
                                                                              ),CONCAT11((byte)(
                                                  uVar42 >> 8) & (byte)((ulong)lVar35 >> 8),
                                                  (byte)uVar42 & (byte)lVar35)))))));
      *puVar7 = CONCAT17((byte)(uVar41 >> 0x38) & (byte)((ulong)lVar2 >> 0x38),
                         CONCAT16((byte)(uVar41 >> 0x30) & (byte)((ulong)lVar2 >> 0x30),
                                  CONCAT15((byte)(uVar41 >> 0x28) & (byte)((ulong)lVar2 >> 0x28),
                                           CONCAT14((byte)(uVar41 >> 0x20) &
                                                    (byte)((ulong)lVar2 >> 0x20),
                                                    CONCAT13((byte)(uVar41 >> 0x18) &
                                                             (byte)((ulong)lVar2 >> 0x18),
                                                             CONCAT12((byte)(uVar41 >> 0x10) &
                                                                      (byte)((ulong)lVar2 >> 0x10),
                                                                      CONCAT11((byte)(uVar41 >> 8) &
                                                                               (byte)((ulong)lVar2
                                                                                     >> 8),
                                                                               (byte)uVar41 &
                                                                               (byte)lVar2)))))));
      puVar7 = puVar7 + 4;
    } while (uVar4 != 0);
    if (uVar12 != uVar3) goto LAB_00a031fc;
  }
  uVar12 = 0;
  *(int *)(param_2 + 1) = (int)uVar10;
  if (0 < (int)num) {
    lVar2 = *(long *)(param_3 + 0x50);
    uVar13 = num;
    do {
      uVar3 = bn_mul_add_words(puVar9,puVar8,num,*puVar9 * lVar2);
      uVar4 = puVar9[lVar11];
      uVar10 = uVar3 + uVar12 + uVar4;
      puVar9[lVar11] = uVar10;
      uVar13 = uVar13 - 1;
      uVar12 = (ulong)((uint)uVar12 | (uint)(uVar3 + uVar12 != 0)) & (ulong)(uVar10 <= uVar4);
      puVar9 = puVar9 + 1;
    } while (uVar13 != 0);
  }
LAB_00a032a0:
  lVar2 = bn_wexpand(param_1,num);
  if (lVar2 == 0) {
    return 0;
  }
  *(uint *)(param_1 + 1) = num;
  *(int *)(param_1 + 2) = (int)param_2[2];
  lVar2 = *param_2;
  puVar7 = (ulong *)*param_1;
  puVar9 = (ulong *)(lVar2 + lVar11 * 8);
  uVar10 = bn_sub_words(puVar7,puVar9,puVar8,num);
  if (0 < (int)num) {
    uVar12 = uVar12 - uVar10;
    uVar3 = 0;
    uVar10 = ~uVar12;
    if ((3 < num) &&
       (((ulong *)(lVar2 + (lVar11 + uVar6) * 8) <= puVar7 || (uVar3 = 0, puVar7 + uVar6 <= puVar9))
       )) {
      uVar3 = uVar6 & 0xfffffffc;
      puVar8 = puVar7 + 2;
      puVar5 = (undefined8 *)(lVar2 + lVar11 * 8 + 0x10);
      uVar4 = uVar3;
      do {
        uVar33 = puVar5[-1];
        uVar32 = puVar5[-2];
        uVar36 = puVar5[1];
        uVar34 = *puVar5;
        uVar40 = puVar8[-1];
        uVar38 = puVar8[-2];
        uVar42 = puVar8[1];
        uVar41 = *puVar8;
        uVar4 = uVar4 - 4;
        bVar14 = (byte)uVar12;
        bVar15 = (byte)(uVar12 >> 8);
        bVar16 = (byte)(uVar12 >> 0x10);
        bVar17 = (byte)(uVar12 >> 0x18);
        bVar18 = (byte)(uVar12 >> 0x20);
        bVar19 = (byte)(uVar12 >> 0x28);
        bVar20 = (byte)(uVar12 >> 0x30);
        bVar21 = (byte)(uVar12 >> 0x38);
        bVar22 = (byte)uVar10;
        bVar24 = (byte)(uVar10 >> 8);
        bVar25 = (byte)(uVar10 >> 0x10);
        bVar26 = (byte)(uVar10 >> 0x18);
        bVar27 = (byte)(uVar10 >> 0x20);
        bVar29 = (byte)(uVar10 >> 0x28);
        bVar30 = (byte)(uVar10 >> 0x30);
        bVar31 = (byte)(uVar10 >> 0x38);
        puVar8[-1] = CONCAT17((byte)(uVar40 >> 0x38) & bVar31 |
                              (byte)((ulong)uVar33 >> 0x38) & bVar21,
                              CONCAT16((byte)(uVar40 >> 0x30) & bVar30 |
                                       (byte)((ulong)uVar33 >> 0x30) & bVar20,
                                       CONCAT15((byte)(uVar40 >> 0x28) & bVar29 |
                                                (byte)((ulong)uVar33 >> 0x28) & bVar19,
                                                CONCAT14((byte)(uVar40 >> 0x20) & bVar27 |
                                                         (byte)((ulong)uVar33 >> 0x20) & bVar18,
                                                         CONCAT13((byte)(uVar40 >> 0x18) & bVar26 |
                                                                  (byte)((ulong)uVar33 >> 0x18) &
                                                                  bVar17,CONCAT12((byte)(uVar40 >>
                                                                                        0x10) &
                                                                                  bVar25 | (byte)((
                                                  ulong)uVar33 >> 0x10) & bVar16,
                                                  CONCAT11((byte)(uVar40 >> 8) & bVar24 |
                                                           (byte)((ulong)uVar33 >> 8) & bVar15,
                                                           (byte)uVar40 & bVar22 |
                                                           (byte)uVar33 & bVar14)))))));
        puVar8[-2] = CONCAT17((byte)(uVar38 >> 0x38) & bVar31 |
                              (byte)((ulong)uVar32 >> 0x38) & bVar21,
                              CONCAT16((byte)(uVar38 >> 0x30) & bVar30 |
                                       (byte)((ulong)uVar32 >> 0x30) & bVar20,
                                       CONCAT15((byte)(uVar38 >> 0x28) & bVar29 |
                                                (byte)((ulong)uVar32 >> 0x28) & bVar19,
                                                CONCAT14((byte)(uVar38 >> 0x20) & bVar27 |
                                                         (byte)((ulong)uVar32 >> 0x20) & bVar18,
                                                         CONCAT13((byte)(uVar38 >> 0x18) & bVar26 |
                                                                  (byte)((ulong)uVar32 >> 0x18) &
                                                                  bVar17,CONCAT12((byte)(uVar38 >>
                                                                                        0x10) &
                                                                                  bVar25 | (byte)((
                                                  ulong)uVar32 >> 0x10) & bVar16,
                                                  CONCAT11((byte)(uVar38 >> 8) & bVar24 |
                                                           (byte)((ulong)uVar32 >> 8) & bVar15,
                                                           (byte)uVar38 & bVar22 |
                                                           (byte)uVar32 & bVar14)))))));
        puVar8[1] = CONCAT17((byte)(uVar42 >> 0x38) & bVar31 |
                             (byte)((ulong)uVar36 >> 0x38) & bVar21,
                             CONCAT16((byte)(uVar42 >> 0x30) & bVar30 |
                                      (byte)((ulong)uVar36 >> 0x30) & bVar20,
                                      CONCAT15((byte)(uVar42 >> 0x28) & bVar29 |
                                               (byte)((ulong)uVar36 >> 0x28) & bVar19,
                                               CONCAT14((byte)(uVar42 >> 0x20) & bVar27 |
                                                        (byte)((ulong)uVar36 >> 0x20) & bVar18,
                                                        CONCAT13((byte)(uVar42 >> 0x18) & bVar26 |
                                                                 (byte)((ulong)uVar36 >> 0x18) &
                                                                 bVar17,CONCAT12((byte)(uVar42 >>
                                                                                       0x10) &
                                                                                 bVar25 | (byte)((
                                                  ulong)uVar36 >> 0x10) & bVar16,
                                                  CONCAT11((byte)(uVar42 >> 8) & bVar24 |
                                                           (byte)((ulong)uVar36 >> 8) & bVar15,
                                                           (byte)uVar42 & bVar22 |
                                                           (byte)uVar36 & bVar14)))))));
        *puVar8 = CONCAT17((byte)(uVar41 >> 0x38) & bVar31 | (byte)((ulong)uVar34 >> 0x38) & bVar21,
                           CONCAT16((byte)(uVar41 >> 0x30) & bVar30 |
                                    (byte)((ulong)uVar34 >> 0x30) & bVar20,
                                    CONCAT15((byte)(uVar41 >> 0x28) & bVar29 |
                                             (byte)((ulong)uVar34 >> 0x28) & bVar19,
                                             CONCAT14((byte)(uVar41 >> 0x20) & bVar27 |
                                                      (byte)((ulong)uVar34 >> 0x20) & bVar18,
                                                      CONCAT13((byte)(uVar41 >> 0x18) & bVar26 |
                                                               (byte)((ulong)uVar34 >> 0x18) &
                                                               bVar17,CONCAT12((byte)(uVar41 >> 0x10
                                                                                     ) & bVar25 |
                                                                               (byte)((ulong)uVar34
                                                                                     >> 0x10) &
                                                                               bVar16,CONCAT11((byte
                                                  )(uVar41 >> 8) & bVar24 |
                                                  (byte)((ulong)uVar34 >> 8) & bVar15,
                                                  (byte)uVar41 & bVar22 | (byte)uVar34 & bVar14)))))
                                   ));
        puVar5[-1] = 0;
        puVar5[-2] = 0;
        puVar5[1] = 0;
        *puVar5 = 0;
        puVar5 = puVar5 + 4;
        puVar8 = puVar8 + 4;
      } while (uVar4 != 0);
      if (uVar3 == uVar6) {
        return 1;
      }
    }
    lVar35 = uVar6 - uVar3;
    puVar8 = puVar7 + uVar3;
    puVar9 = (ulong *)(lVar2 + (uVar3 + lVar11) * 8);
    do {
      lVar35 = lVar35 + -1;
      *puVar8 = *puVar8 & uVar10 | *puVar9 & uVar12;
      *puVar9 = 0;
      puVar8 = puVar8 + 1;
      puVar9 = puVar9 + 1;
    } while (lVar35 != 0);
  }
  return 1;
}


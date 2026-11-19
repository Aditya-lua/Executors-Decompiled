/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa7504
 */

void CRYPTO_cbc128_decrypt
               (ulong *param_1,ulong *param_2,ulong param_3,undefined8 param_4,ulong *param_5,
               code *param_6)

{
  undefined1 uVar1;
  undefined8 *puVar2;
  bool bVar3;
  ulong *puVar4;
  long lVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  ulong *puVar9;
  ulong uVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  ulong *puVar13;
  ulong *puVar14;
  ulong *puVar15;
  ulong uVar16;
  ulong *puVar17;
  ulong *puVar18;
  ulong uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  ulong local_70 [2];
  
  if (param_3 == 0) {
    return;
  }
  if (param_1 == param_2) {
    uVar19 = param_3 - 0x10;
    if (param_3 < 0x10) {
      param_2 = param_1;
      goto LAB_00aa7674;
    }
    uVar16 = uVar19 & 0xfffffffffffffff0;
    puVar15 = (ulong *)((long)param_1 + uVar16 + 0x10);
    do {
      (*param_6)(param_1,local_70,param_4);
      uVar8 = *param_1;
      param_3 = param_3 - 0x10;
      *param_1 = *param_5 ^ local_70[0];
      *param_5 = uVar8;
      uVar8 = param_1[1];
      param_1[1] = param_5[1] ^ local_70[1];
      param_1 = param_1 + 2;
      param_5[1] = uVar8;
    } while (0xf < param_3);
    param_3 = uVar19 - uVar16;
    param_1 = puVar15;
  }
  else {
    uVar19 = param_3 - 0x10;
    if (param_3 < 0x10) goto LAB_00aa7674;
    uVar16 = uVar19 & 0xfffffffffffffff0;
    puVar15 = (ulong *)((long)param_2 + uVar16 + 0x10);
    puVar17 = param_1;
    puVar18 = param_5;
    do {
      puVar4 = puVar17;
      (*param_6)(puVar4,param_2,param_4);
      param_3 = param_3 - 0x10;
      *param_2 = *param_2 ^ *puVar18;
      param_2[1] = param_2[1] ^ puVar18[1];
      param_2 = param_2 + 2;
      puVar17 = puVar4 + 2;
      puVar18 = puVar4;
    } while (0xf < param_3);
    puVar17 = (ulong *)((long)param_1 + uVar16);
    param_3 = uVar19 - uVar16;
    param_1 = (ulong *)((long)param_1 + uVar16 + 0x10);
    if (puVar17 != param_5) {
      uVar19 = *puVar17;
      param_5[1] = puVar17[1];
      *param_5 = uVar19;
    }
  }
  param_2 = puVar15;
  if (param_3 == 0) {
    return;
  }
LAB_00aa7674:
  lVar5 = 0;
  uVar19 = param_3;
  puVar15 = param_1;
  puVar17 = param_2;
  do {
    uVar16 = param_3 + lVar5 * -0x10;
    if (uVar16 < 2) {
      uVar16 = 1;
    }
    lVar6 = -0x10;
    if (0xfffffffffffffff0 < -uVar16) {
      lVar6 = -uVar16;
    }
    (*param_6)(puVar15,local_70,param_4);
    if (0x1f < (ulong)-lVar6) {
      puVar13 = (ulong *)((long)param_5 - lVar6);
      puVar14 = (ulong *)((long)local_70 - lVar6);
      puVar18 = param_2 + lVar5 * 2;
      puVar9 = (ulong *)((long)puVar18 - lVar6);
      puVar4 = param_1 + lVar5 * 2;
      if ((((puVar13 <= puVar18 || puVar9 <= param_5) &&
           ((ulong *)((long)puVar4 - lVar6) <= puVar18 || puVar9 <= puVar4)) &&
          (puVar14 <= puVar18 || puVar9 <= local_70)) &&
         (((ulong *)((long)puVar4 - lVar6) <= param_5 || puVar13 <= puVar4 &&
          (puVar14 <= param_5 || puVar13 <= local_70)))) {
        lVar6 = 0;
        do {
          puVar11 = (undefined8 *)((long)param_5 + lVar6 + 0x10);
          puVar12 = (undefined8 *)((long)puVar15 + lVar6);
          uVar21 = *(undefined8 *)((long)local_70 + lVar6 + 8);
          uVar20 = *(undefined8 *)((long)local_70 + lVar6);
          uVar23 = *(undefined8 *)((long)local_70 + lVar6 + 0x18);
          uVar22 = *(undefined8 *)((long)local_70 + lVar6 + 0x10);
          uVar29 = puVar11[-1];
          uVar28 = puVar11[-2];
          uVar31 = puVar11[1];
          uVar30 = *puVar11;
          uVar25 = puVar12[1];
          uVar24 = *puVar12;
          uVar27 = puVar12[3];
          uVar26 = puVar12[2];
          puVar12 = (undefined8 *)((long)puVar17 + lVar6);
          lVar6 = lVar6 + 0x20;
          puVar12[1] = CONCAT17((byte)((ulong)uVar29 >> 0x38) ^ (byte)((ulong)uVar21 >> 0x38),
                                CONCAT16((byte)((ulong)uVar29 >> 0x30) ^
                                         (byte)((ulong)uVar21 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar29 >> 0x28) ^
                                                  (byte)((ulong)uVar21 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar29 >> 0x20) ^
                                                           (byte)((ulong)uVar21 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar29 >> 0x18) ^
                                                                    (byte)((ulong)uVar21 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar29 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar21 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar29 >> 8) ^ (byte)((ulong)uVar21 >> 8),
                                                  (byte)uVar29 ^ (byte)uVar21)))))));
          *puVar12 = CONCAT17((byte)((ulong)uVar28 >> 0x38) ^ (byte)((ulong)uVar20 >> 0x38),
                              CONCAT16((byte)((ulong)uVar28 >> 0x30) ^ (byte)((ulong)uVar20 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar28 >> 0x28) ^
                                                 (byte)((ulong)uVar20 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar28 >> 0x20) ^
                                                          (byte)((ulong)uVar20 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar28 >> 0x18) ^
                                                                   (byte)((ulong)uVar20 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar28 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar20 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar28 >> 8) ^ (byte)((ulong)uVar20 >> 8),
                                                  (byte)uVar28 ^ (byte)uVar20)))))));
          puVar12[3] = CONCAT17((byte)((ulong)uVar31 >> 0x38) ^ (byte)((ulong)uVar23 >> 0x38),
                                CONCAT16((byte)((ulong)uVar31 >> 0x30) ^
                                         (byte)((ulong)uVar23 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar31 >> 0x28) ^
                                                  (byte)((ulong)uVar23 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar31 >> 0x20) ^
                                                           (byte)((ulong)uVar23 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar31 >> 0x18) ^
                                                                    (byte)((ulong)uVar23 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar31 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar23 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar31 >> 8) ^ (byte)((ulong)uVar23 >> 8),
                                                  (byte)uVar31 ^ (byte)uVar23)))))));
          puVar12[2] = CONCAT17((byte)((ulong)uVar30 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                                CONCAT16((byte)((ulong)uVar30 >> 0x30) ^
                                         (byte)((ulong)uVar22 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar30 >> 0x28) ^
                                                  (byte)((ulong)uVar22 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar30 >> 0x20) ^
                                                           (byte)((ulong)uVar22 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar30 >> 0x18) ^
                                                                    (byte)((ulong)uVar22 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar30 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar22 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar30 >> 8) ^ (byte)((ulong)uVar22 >> 8),
                                                  (byte)uVar30 ^ (byte)uVar22)))))));
          puVar11[-1] = uVar25;
          puVar11[-2] = uVar24;
          puVar11[1] = uVar27;
          *puVar11 = uVar26;
        } while (lVar6 != 0);
      }
    }
    uVar8 = 0x10;
    uVar16 = 0;
    do {
      uVar7 = uVar16;
      uVar1 = *(undefined1 *)((long)puVar15 + uVar7);
      uVar8 = uVar8 - 1;
      *(byte *)((long)puVar17 + uVar7) =
           *(byte *)((long)param_5 + uVar7) ^ *(byte *)((long)local_70 + uVar7);
      *(undefined1 *)((long)param_5 + uVar7) = uVar1;
      uVar16 = uVar7 + 1;
      if (0xf < uVar16) break;
    } while (uVar16 < uVar19);
    bVar3 = uVar19 < 0x10;
    uVar19 = uVar19 - 0x10;
    if (bVar3 || uVar19 == 0) {
      if (uVar16 < 0x10) {
        uVar10 = 0x10 - uVar16;
        uVar19 = uVar16;
        if ((0x1f < uVar10) &&
           ((puVar15 + 2 <= (ulong *)((long)param_5 + uVar16) ||
            (param_5 + 2 <= (ulong *)((long)puVar15 + uVar16))))) {
          uVar19 = (uVar8 & 0xffffffffffffffe0) + uVar16;
          puVar11 = (undefined8 *)((long)puVar15 + uVar7 + 0x11);
          puVar12 = (undefined8 *)((long)param_5 + uVar7 + 0x11);
          uVar16 = 0x10 - uVar16 & 0xffffffffffffffe0;
          do {
            puVar2 = puVar11 + -1;
            uVar20 = puVar11[-2];
            uVar22 = puVar11[1];
            uVar21 = *puVar11;
            uVar16 = uVar16 - 0x20;
            puVar11 = puVar11 + 4;
            puVar12[-1] = *puVar2;
            puVar12[-2] = uVar20;
            puVar12[1] = uVar22;
            *puVar12 = uVar21;
            puVar12 = puVar12 + 4;
          } while (uVar16 != 0);
          if (uVar10 == (uVar10 & 0xffffffffffffffe0)) {
            return;
          }
        }
        do {
          *(undefined1 *)((long)param_5 + uVar19) = *(undefined1 *)((long)puVar15 + uVar19);
          uVar19 = uVar19 + 1;
        } while (uVar19 != 0x10);
      }
      return;
    }
    puVar15 = puVar15 + 2;
    puVar17 = puVar17 + 2;
    lVar5 = lVar5 + 1;
  } while( true );
}


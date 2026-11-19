/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa724c
 */

void CRYPTO_cbc128_encrypt
               (ulong *param_1,ulong *param_2,ulong param_3,undefined8 param_4,ulong *param_5,
               code *param_6)

{
  ulong *puVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  ulong *puVar4;
  ulong *puVar5;
  long lVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong *puVar13;
  long lVar14;
  ulong uVar15;
  undefined8 *puVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  
  if (param_3 == 0) {
    return;
  }
  uVar12 = param_3 - 0x10;
  if (param_3 < 0x10) {
    puVar13 = param_5;
  }
  else {
    uVar15 = uVar12 & 0xfffffffffffffff0;
    puVar4 = param_5;
    puVar5 = param_2;
    puVar13 = param_1;
    do {
      *puVar5 = *puVar4 ^ *puVar13;
      puVar5[1] = puVar4[1] ^ puVar13[1];
      (*param_6)(puVar5,puVar5,param_4);
      param_3 = param_3 - 0x10;
      puVar13 = puVar13 + 2;
      puVar4 = puVar5;
      puVar5 = puVar5 + 2;
    } while (0xf < param_3);
    param_3 = uVar12 - uVar15;
    puVar13 = (ulong *)((long)param_2 + uVar15);
    if (param_3 == 0) {
LAB_00aa74d0:
      if (puVar13 == param_5) {
        return;
      }
      uVar12 = *puVar13;
      param_5[1] = puVar13[1];
      *param_5 = uVar12;
      return;
    }
    param_1 = (ulong *)((long)param_1 + uVar15 + 0x10);
    param_2 = (ulong *)((long)param_2 + uVar15 + 0x10);
  }
  lVar14 = 0;
  puVar16 = (undefined8 *)((long)param_2 + 0x11);
  puVar5 = puVar13;
  uVar12 = param_3;
  puVar4 = param_1;
  puVar13 = param_2;
  do {
    uVar15 = param_3 + lVar14 * -0x10;
    if (uVar15 < 2) {
      uVar15 = 1;
    }
    lVar6 = -0x10;
    if (0xfffffffffffffff0 < -uVar15) {
      lVar6 = -uVar15;
    }
    uVar15 = -lVar6;
    puVar1 = param_2 + lVar14 * 2;
    if (0x1e < uVar15 && lVar6 != -0x1f) {
      if (((ulong *)((long)(param_1 + lVar14 * 2) + uVar15) <= puVar1 ||
           (ulong *)((long)puVar1 - lVar6) <= param_1 + lVar14 * 2) &&
         ((ulong *)((long)puVar5 + uVar15) <= puVar1 || (ulong *)((long)puVar1 - lVar6) <= puVar5))
      {
        lVar6 = 0;
        do {
          puVar2 = (undefined8 *)((long)puVar4 + lVar6);
          puVar3 = (undefined8 *)((long)puVar5 + lVar6 + 0x10);
          uVar18 = puVar2[1];
          uVar17 = *puVar2;
          uVar20 = puVar2[3];
          uVar19 = puVar2[2];
          uVar22 = puVar3[-1];
          uVar21 = puVar3[-2];
          uVar24 = puVar3[1];
          uVar23 = *puVar3;
          puVar2 = (undefined8 *)((long)puVar13 + lVar6);
          lVar6 = lVar6 + 0x20;
          puVar2[1] = CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                               CONCAT16((byte)((ulong)uVar22 >> 0x30) ^
                                        (byte)((ulong)uVar18 >> 0x30),
                                        CONCAT15((byte)((ulong)uVar22 >> 0x28) ^
                                                 (byte)((ulong)uVar18 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar22 >> 0x20) ^
                                                          (byte)((ulong)uVar18 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar22 >> 0x18) ^
                                                                   (byte)((ulong)uVar18 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar22 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar18 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar22 >> 8) ^ (byte)((ulong)uVar18 >> 8),
                                                  (byte)uVar22 ^ (byte)uVar18)))))));
          *puVar2 = CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                             CONCAT16((byte)((ulong)uVar21 >> 0x30) ^ (byte)((ulong)uVar17 >> 0x30),
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
          puVar2[3] = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar20 >> 0x38),
                               CONCAT16((byte)((ulong)uVar24 >> 0x30) ^
                                        (byte)((ulong)uVar20 >> 0x30),
                                        CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                                 (byte)((ulong)uVar20 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                          (byte)((ulong)uVar20 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar24 >> 0x18) ^
                                                                   (byte)((ulong)uVar20 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar24 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar20 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar24 >> 8) ^ (byte)((ulong)uVar20 >> 8),
                                                  (byte)uVar24 ^ (byte)uVar20)))))));
          puVar2[2] = CONCAT17((byte)((ulong)uVar23 >> 0x38) ^ (byte)((ulong)uVar19 >> 0x38),
                               CONCAT16((byte)((ulong)uVar23 >> 0x30) ^
                                        (byte)((ulong)uVar19 >> 0x30),
                                        CONCAT15((byte)((ulong)uVar23 >> 0x28) ^
                                                 (byte)((ulong)uVar19 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar23 >> 0x20) ^
                                                          (byte)((ulong)uVar19 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar23 >> 0x18) ^
                                                                   (byte)((ulong)uVar19 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar23 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar19 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar23 >> 8) ^ (byte)((ulong)uVar19 >> 8),
                                                  (byte)uVar23 ^ (byte)uVar19)))))));
        } while (lVar6 != 0);
      }
    }
    uVar10 = 0x10;
    uVar15 = 0;
    puVar2 = (undefined8 *)((long)puVar5 + 0x11);
    puVar3 = puVar16;
    do {
      puVar9 = puVar3;
      puVar8 = puVar2;
      uVar7 = uVar15;
      uVar15 = uVar7 + 1;
      uVar10 = uVar10 - 1;
      *(byte *)((long)puVar13 + uVar7) =
           *(byte *)((long)puVar5 + uVar7) ^ *(byte *)((long)puVar4 + uVar7);
      if (0xf < uVar15) break;
      puVar2 = (undefined8 *)((long)puVar8 + 1);
      puVar3 = (undefined8 *)((long)puVar9 + 1);
    } while (uVar15 < uVar12);
    if (uVar15 < 0x10) {
      uVar11 = 0x10 - uVar15;
      if ((0x1f < uVar11) &&
         ((puVar5 + 2 <= (ulong *)((long)puVar13 + uVar15) ||
          (puVar1 + 2 <= (ulong *)((long)puVar5 + uVar15))))) {
        uVar15 = (uVar10 & 0xffffffffffffffe0) + uVar15;
        uVar10 = 0xf - uVar7 & 0xffffffffffffffe0;
        do {
          puVar2 = puVar8 + -1;
          uVar17 = puVar8[-2];
          uVar19 = puVar8[1];
          uVar18 = *puVar8;
          puVar8 = puVar8 + 4;
          uVar10 = uVar10 - 0x20;
          puVar9[-1] = *puVar2;
          puVar9[-2] = uVar17;
          puVar9[1] = uVar19;
          *puVar9 = uVar18;
          puVar9 = puVar9 + 4;
        } while (uVar10 != 0);
        if (uVar11 == (uVar11 & 0xffffffffffffffe0)) goto LAB_00aa74b8;
      }
      do {
        *(undefined1 *)((long)puVar13 + uVar15) = *(undefined1 *)((long)puVar5 + uVar15);
        uVar15 = uVar15 + 1;
      } while (uVar15 != 0x10);
    }
LAB_00aa74b8:
    (*param_6)(puVar13,puVar13,param_4);
    if (uVar12 < 0x11) goto LAB_00aa74d0;
    uVar12 = uVar12 - 0x10;
    puVar4 = puVar4 + 2;
    lVar14 = lVar14 + 1;
    puVar16 = puVar16 + 2;
    puVar5 = puVar13;
    puVar13 = puVar13 + 2;
  } while( true );
}


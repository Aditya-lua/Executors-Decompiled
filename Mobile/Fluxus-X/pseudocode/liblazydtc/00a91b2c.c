/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a91b2c
 */

undefined8 FUN_00a91b2c(long param_1,ulong param_2,ulong param_3,ulong param_4)

{
  int iVar1;
  uint uVar2;
  bool bVar3;
  undefined8 *puVar4;
  ulong uVar5;
  uint uVar6;
  ulong uVar7;
  byte *pbVar8;
  ulong uVar9;
  long lVar10;
  undefined8 *puVar11;
  byte *pbVar12;
  undefined8 *puVar13;
  ulong uVar14;
  ulong uVar15;
  byte *pbVar16;
  long lVar17;
  ulong uVar18;
  uint uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  
  lVar17 = *(long *)(param_1 + 0x78);
  uVar6 = *(uint *)(lVar17 + 0x70);
  uVar5 = (ulong)uVar6;
  if (uVar6 != 0) {
    uVar18 = param_2;
    if ((param_4 == 0) || (0x3f < uVar6)) {
LAB_00a91c00:
      *(uint *)(lVar17 + 0x70) = uVar6;
      param_2 = uVar18;
    }
    else {
      uVar7 = (ulong)(0x3f - uVar6);
      uVar9 = -param_4;
      if (uVar9 < ~uVar7 || -~uVar7 == param_4) {
        uVar9 = ~uVar7;
      }
      uVar9 = -uVar9;
      if (uVar9 < 0x20) {
LAB_00a91b84:
        uVar14 = uVar5;
      }
      else {
        uVar14 = -param_4;
        if (uVar14 < ~uVar7 || -~uVar7 == param_4) {
          uVar14 = ~uVar7;
        }
        if ((param_2 < param_3 - uVar14 && param_3 < param_2 - uVar14) ||
           (param_2 < lVar17 + ((uVar5 + 0x30) - uVar14) && lVar17 + uVar5 + 0x30 < param_2 - uVar14
           )) goto LAB_00a91b84;
        uVar15 = uVar9 & 0x1ffffffe0;
        puVar4 = (undefined8 *)(param_3 + 0x10);
        uVar6 = uVar6 + (int)uVar15;
        uVar14 = (ulong)uVar6;
        uVar18 = param_2 + uVar15;
        param_4 = param_4 - uVar15;
        param_3 = param_3 + uVar15;
        puVar11 = (undefined8 *)(param_2 + 0x10);
        uVar7 = uVar15;
        do {
          lVar10 = lVar17 + uVar5;
          uVar21 = puVar4[-1];
          uVar20 = puVar4[-2];
          uVar23 = puVar4[1];
          uVar22 = *puVar4;
          uVar25 = *(undefined8 *)(lVar10 + 0x38);
          uVar24 = *(undefined8 *)(lVar10 + 0x30);
          uVar27 = *(undefined8 *)(lVar10 + 0x48);
          uVar26 = *(undefined8 *)(lVar10 + 0x40);
          puVar4 = puVar4 + 4;
          uVar7 = uVar7 - 0x20;
          uVar5 = (ulong)((int)uVar5 + 0x20);
          puVar11[-1] = CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ (byte)((ulong)uVar21 >> 0x38),
                                 CONCAT16((byte)((ulong)uVar25 >> 0x30) ^
                                          (byte)((ulong)uVar21 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar25 >> 0x28) ^
                                                   (byte)((ulong)uVar21 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar25 >> 0x20) ^
                                                            (byte)((ulong)uVar21 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar25 >> 0x18) ^
                                                                     (byte)((ulong)uVar21 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar25
                                                                                    >> 0x10) ^
                                                                              (byte)((ulong)uVar21
                                                                                    >> 0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar25 >> 8) ^ (byte)((ulong)uVar21 >> 8),
                                                  (byte)uVar25 ^ (byte)uVar21)))))));
          puVar11[-2] = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar20 >> 0x38),
                                 CONCAT16((byte)((ulong)uVar24 >> 0x30) ^
                                          (byte)((ulong)uVar20 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                                   (byte)((ulong)uVar20 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                            (byte)((ulong)uVar20 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar24 >> 0x18) ^
                                                                     (byte)((ulong)uVar20 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar24
                                                                                    >> 0x10) ^
                                                                              (byte)((ulong)uVar20
                                                                                    >> 0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar24 >> 8) ^ (byte)((ulong)uVar20 >> 8),
                                                  (byte)uVar24 ^ (byte)uVar20)))))));
          puVar11[1] = CONCAT17((byte)((ulong)uVar27 >> 0x38) ^ (byte)((ulong)uVar23 >> 0x38),
                                CONCAT16((byte)((ulong)uVar27 >> 0x30) ^
                                         (byte)((ulong)uVar23 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar27 >> 0x28) ^
                                                  (byte)((ulong)uVar23 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar27 >> 0x20) ^
                                                           (byte)((ulong)uVar23 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar27 >> 0x18) ^
                                                                    (byte)((ulong)uVar23 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar27 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar23 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar27 >> 8) ^ (byte)((ulong)uVar23 >> 8),
                                                  (byte)uVar27 ^ (byte)uVar23)))))));
          *puVar11 = CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                              CONCAT16((byte)((ulong)uVar26 >> 0x30) ^ (byte)((ulong)uVar22 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar26 >> 0x28) ^
                                                 (byte)((ulong)uVar22 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar26 >> 0x20) ^
                                                          (byte)((ulong)uVar22 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar26 >> 0x18) ^
                                                                   (byte)((ulong)uVar22 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar26 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar22 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar26 >> 8) ^ (byte)((ulong)uVar22 >> 8),
                                                  (byte)uVar26 ^ (byte)uVar22)))))));
          puVar11 = puVar11 + 4;
        } while (uVar7 != 0);
        if (uVar15 == uVar9) goto LAB_00a91c00;
      }
      lVar10 = 0;
      do {
        uVar5 = uVar14 + lVar10;
        bVar3 = param_4 - 1 == lVar10;
        *(byte *)(uVar18 + lVar10) =
             *(byte *)(lVar17 + (uVar5 & 0xffffffff) + 0x30) ^ *(byte *)(param_3 + lVar10);
        lVar10 = lVar10 + 1;
        if (bVar3) break;
      } while ((int)uVar5 + 1U < 0x40);
      uVar6 = (int)uVar14 + (int)lVar10;
      param_2 = uVar18 + lVar10;
      param_4 = param_4 - lVar10;
      param_3 = param_3 + lVar10;
      *(uint *)(lVar17 + 0x70) = uVar6;
    }
    if (param_4 == 0) {
      return 1;
    }
    if (uVar6 == 0x40) {
      *(undefined4 *)(lVar17 + 0x70) = 0;
      iVar1 = *(int *)(lVar17 + 0x20) + 1;
      *(int *)(lVar17 + 0x20) = iVar1;
      if (iVar1 == 0) {
        *(int *)(lVar17 + 0x24) = *(int *)(lVar17 + 0x24) + 1;
      }
    }
  }
  uVar6 = (uint)param_4 & 0x3f;
  uVar5 = (ulong)uVar6;
  uVar18 = param_4 - uVar5;
  if (0x3f < uVar18) {
    uVar19 = *(uint *)(lVar17 + 0x20);
    do {
      while( true ) {
        uVar9 = uVar18 >> 6;
        if (uVar18 >> 0x22 != 0) {
          uVar9 = 0x10000000;
        }
        uVar2 = uVar19 + (int)uVar9;
        uVar7 = (ulong)uVar2;
        uVar19 = 0;
        if (uVar9 <= uVar7) {
          uVar7 = 0;
          uVar19 = uVar2;
        }
        lVar10 = (uVar9 - uVar7) * 0x40;
        ChaCha20_ctr32(param_2,param_3,lVar10,lVar17,lVar17 + 0x20);
        uVar18 = uVar18 + (uVar9 - uVar7) * -0x40;
        param_3 = param_3 + lVar10;
        param_2 = param_2 + lVar10;
        *(uint *)(lVar17 + 0x20) = uVar19;
        if (uVar19 == 0) break;
        if (uVar18 < 0x40) goto LAB_00a91cc0;
      }
      *(int *)(lVar17 + 0x24) = *(int *)(lVar17 + 0x24) + 1;
    } while (0x3f < uVar18);
  }
LAB_00a91cc0:
  if ((param_4 & 0x3f) == 0) {
    return 1;
  }
  *(undefined8 *)(lVar17 + 0x58) = 0;
  *(undefined8 *)(lVar17 + 0x50) = 0;
  *(undefined8 *)(lVar17 + 0x68) = 0;
  *(undefined8 *)(lVar17 + 0x60) = 0;
  puVar4 = (undefined8 *)(lVar17 + 0x30);
  *(undefined8 *)(lVar17 + 0x38) = 0;
  *puVar4 = 0;
  *(undefined8 *)(lVar17 + 0x48) = 0;
  *(undefined8 *)(lVar17 + 0x40) = 0;
  ChaCha20_ctr32(puVar4,puVar4,0x40,lVar17,lVar17 + 0x20);
  uVar18 = 0;
  if (0x1f < uVar6) {
    if (param_2 < param_3 + uVar5 && param_3 < param_2 + uVar5) {
      uVar18 = 0;
    }
    else {
      uVar18 = 0;
      if (lVar17 + uVar5 + 0x30 <= param_2 || param_2 + uVar5 <= lVar17 + 0x30U) {
        uVar18 = uVar5 & 0x20;
        puVar4 = (undefined8 *)(param_3 + 0x10);
        puVar11 = (undefined8 *)(param_2 + 0x10);
        puVar13 = (undefined8 *)(lVar17 + 0x40);
        uVar9 = uVar18;
        do {
          uVar21 = puVar4[-1];
          uVar20 = puVar4[-2];
          uVar23 = puVar4[1];
          uVar22 = *puVar4;
          uVar25 = puVar13[-1];
          uVar24 = puVar13[-2];
          uVar27 = puVar13[1];
          uVar26 = *puVar13;
          uVar9 = uVar9 - 0x20;
          puVar4 = puVar4 + 4;
          puVar13 = puVar13 + 4;
          puVar11[-1] = CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ (byte)((ulong)uVar21 >> 0x38),
                                 CONCAT16((byte)((ulong)uVar25 >> 0x30) ^
                                          (byte)((ulong)uVar21 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar25 >> 0x28) ^
                                                   (byte)((ulong)uVar21 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar25 >> 0x20) ^
                                                            (byte)((ulong)uVar21 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar25 >> 0x18) ^
                                                                     (byte)((ulong)uVar21 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar25
                                                                                    >> 0x10) ^
                                                                              (byte)((ulong)uVar21
                                                                                    >> 0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar25 >> 8) ^ (byte)((ulong)uVar21 >> 8),
                                                  (byte)uVar25 ^ (byte)uVar21)))))));
          puVar11[-2] = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar20 >> 0x38),
                                 CONCAT16((byte)((ulong)uVar24 >> 0x30) ^
                                          (byte)((ulong)uVar20 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                                   (byte)((ulong)uVar20 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                            (byte)((ulong)uVar20 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar24 >> 0x18) ^
                                                                     (byte)((ulong)uVar20 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar24
                                                                                    >> 0x10) ^
                                                                              (byte)((ulong)uVar20
                                                                                    >> 0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar24 >> 8) ^ (byte)((ulong)uVar20 >> 8),
                                                  (byte)uVar24 ^ (byte)uVar20)))))));
          puVar11[1] = CONCAT17((byte)((ulong)uVar27 >> 0x38) ^ (byte)((ulong)uVar23 >> 0x38),
                                CONCAT16((byte)((ulong)uVar27 >> 0x30) ^
                                         (byte)((ulong)uVar23 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar27 >> 0x28) ^
                                                  (byte)((ulong)uVar23 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar27 >> 0x20) ^
                                                           (byte)((ulong)uVar23 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar27 >> 0x18) ^
                                                                    (byte)((ulong)uVar23 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar27 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar23 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar27 >> 8) ^ (byte)((ulong)uVar23 >> 8),
                                                  (byte)uVar27 ^ (byte)uVar23)))))));
          *puVar11 = CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                              CONCAT16((byte)((ulong)uVar26 >> 0x30) ^ (byte)((ulong)uVar22 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar26 >> 0x28) ^
                                                 (byte)((ulong)uVar22 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar26 >> 0x20) ^
                                                          (byte)((ulong)uVar22 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar26 >> 0x18) ^
                                                                   (byte)((ulong)uVar22 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar26 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar22 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar26 >> 8) ^ (byte)((ulong)uVar22 >> 8),
                                                  (byte)uVar26 ^ (byte)uVar22)))))));
          puVar11 = puVar11 + 4;
        } while (uVar9 != 0);
        if (uVar18 == uVar5) goto LAB_00a91e68;
      }
    }
  }
  lVar10 = uVar5 - uVar18;
  pbVar8 = (byte *)(param_3 + uVar18);
  pbVar12 = (byte *)(param_2 + uVar18);
  pbVar16 = (byte *)(lVar17 + uVar18 + 0x30);
  do {
    lVar10 = lVar10 + -1;
    *pbVar12 = *pbVar16 ^ *pbVar8;
    pbVar8 = pbVar8 + 1;
    pbVar12 = pbVar12 + 1;
    pbVar16 = pbVar16 + 1;
  } while (lVar10 != 0);
LAB_00a91e68:
  *(uint *)(lVar17 + 0x70) = uVar6;
  return 1;
}


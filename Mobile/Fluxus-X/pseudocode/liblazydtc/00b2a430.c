/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2a430
 */

undefined8 FUN_00b2a430(long param_1,ulong param_2,ulong param_3,ulong param_4)

{
  int iVar1;
  uint *puVar2;
  uint uVar3;
  bool bVar4;
  undefined8 *puVar5;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  byte *pbVar9;
  uint uVar10;
  ulong uVar11;
  undefined8 *puVar12;
  byte *pbVar13;
  undefined8 *puVar14;
  byte *pbVar15;
  ulong uVar16;
  ulong uVar17;
  long lVar18;
  ulong uVar19;
  uint uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  
  uVar10 = *(uint *)(param_1 + 0x130);
  uVar7 = (ulong)uVar10;
  if (uVar10 != 0) {
    uVar19 = param_2;
    if ((param_4 == 0) || (0x3f < uVar10)) {
LAB_00b2a504:
      *(uint *)(param_1 + 0x130) = uVar10;
      param_2 = uVar19;
    }
    else {
      uVar11 = (ulong)(0x3f - uVar10);
      uVar6 = -param_4;
      if (uVar6 < ~uVar11 || -~uVar11 == param_4) {
        uVar6 = ~uVar11;
      }
      uVar6 = -uVar6;
      lVar18 = param_1 + 0xf0;
      if (uVar6 < 0x20) {
LAB_00b2a48c:
        uVar16 = uVar7;
      }
      else {
        uVar16 = -param_4;
        if (uVar16 < ~uVar11 || -~uVar11 == param_4) {
          uVar16 = ~uVar11;
        }
        if ((param_2 < param_3 - uVar16 && param_3 < param_2 - uVar16) ||
           (param_2 < lVar18 + (uVar7 - uVar16) && lVar18 + uVar7 < param_2 - uVar16))
        goto LAB_00b2a48c;
        uVar17 = uVar6 & 0x1ffffffe0;
        puVar5 = (undefined8 *)(param_3 + 0x10);
        uVar10 = uVar10 + (int)uVar17;
        uVar16 = (ulong)uVar10;
        uVar19 = param_2 + uVar17;
        param_4 = param_4 - uVar17;
        param_3 = param_3 + uVar17;
        puVar12 = (undefined8 *)(param_2 + 0x10);
        uVar11 = uVar17;
        do {
          puVar14 = (undefined8 *)(lVar18 + uVar7);
          uVar22 = puVar5[-1];
          uVar21 = puVar5[-2];
          uVar24 = puVar5[1];
          uVar23 = *puVar5;
          uVar26 = puVar14[1];
          uVar25 = *puVar14;
          uVar28 = puVar14[3];
          uVar27 = puVar14[2];
          puVar5 = puVar5 + 4;
          uVar11 = uVar11 - 0x20;
          uVar7 = (ulong)((int)uVar7 + 0x20);
          puVar12[-1] = CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                                 CONCAT16((byte)((ulong)uVar26 >> 0x30) ^
                                          (byte)((ulong)uVar22 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar26 >> 0x28) ^
                                                   (byte)((ulong)uVar22 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar26 >> 0x20) ^
                                                            (byte)((ulong)uVar22 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar26 >> 0x18) ^
                                                                     (byte)((ulong)uVar22 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar26
                                                                                    >> 0x10) ^
                                                                              (byte)((ulong)uVar22
                                                                                    >> 0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar26 >> 8) ^ (byte)((ulong)uVar22 >> 8),
                                                  (byte)uVar26 ^ (byte)uVar22)))))));
          puVar12[-2] = CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ (byte)((ulong)uVar21 >> 0x38),
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
          puVar12[1] = CONCAT17((byte)((ulong)uVar28 >> 0x38) ^ (byte)((ulong)uVar24 >> 0x38),
                                CONCAT16((byte)((ulong)uVar28 >> 0x30) ^
                                         (byte)((ulong)uVar24 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar28 >> 0x28) ^
                                                  (byte)((ulong)uVar24 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar28 >> 0x20) ^
                                                           (byte)((ulong)uVar24 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar28 >> 0x18) ^
                                                                    (byte)((ulong)uVar24 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar28 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar24 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar28 >> 8) ^ (byte)((ulong)uVar24 >> 8),
                                                  (byte)uVar28 ^ (byte)uVar24)))))));
          *puVar12 = CONCAT17((byte)((ulong)uVar27 >> 0x38) ^ (byte)((ulong)uVar23 >> 0x38),
                              CONCAT16((byte)((ulong)uVar27 >> 0x30) ^ (byte)((ulong)uVar23 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar27 >> 0x28) ^
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
          puVar12 = puVar12 + 4;
        } while (uVar11 != 0);
        if (uVar17 == uVar6) goto LAB_00b2a504;
      }
      lVar8 = 0;
      do {
        uVar7 = uVar16 + lVar8;
        bVar4 = param_4 - 1 == lVar8;
        *(byte *)(uVar19 + lVar8) =
             *(byte *)(lVar18 + (uVar7 & 0xffffffff)) ^ *(byte *)(param_3 + lVar8);
        lVar8 = lVar8 + 1;
        if (bVar4) break;
      } while ((int)uVar7 + 1U < 0x40);
      uVar10 = (int)uVar16 + (int)lVar8;
      param_2 = uVar19 + lVar8;
      param_4 = param_4 - lVar8;
      param_3 = param_3 + lVar8;
      *(uint *)(param_1 + 0x130) = uVar10;
    }
    if (param_4 == 0) {
      return 1;
    }
    if (uVar10 == 0x40) {
      *(undefined4 *)(param_1 + 0x130) = 0;
      iVar1 = *(int *)(param_1 + 0xe0) + 1;
      *(int *)(param_1 + 0xe0) = iVar1;
      if (iVar1 == 0) {
        *(int *)(param_1 + 0xe4) = *(int *)(param_1 + 0xe4) + 1;
      }
    }
  }
  uVar10 = (uint)param_4 & 0x3f;
  uVar7 = (ulong)uVar10;
  uVar19 = param_4 - uVar7;
  puVar2 = (uint *)(param_1 + 0xe0);
  if (0x3f < uVar19) {
    uVar20 = *(uint *)(param_1 + 0xe0);
    do {
      while( true ) {
        uVar6 = uVar19 >> 6;
        if (uVar19 >> 0x22 != 0) {
          uVar6 = 0x10000000;
        }
        uVar3 = uVar20 + (int)uVar6;
        uVar11 = (ulong)uVar3;
        uVar20 = 0;
        if (uVar6 <= uVar11) {
          uVar11 = 0;
          uVar20 = uVar3;
        }
        lVar18 = (uVar6 - uVar11) * 0x40;
        ChaCha20_ctr32(param_2,param_3,lVar18,param_1 + 0xc0,puVar2);
        uVar19 = uVar19 + (uVar6 - uVar11) * -0x40;
        param_3 = param_3 + lVar18;
        param_2 = param_2 + lVar18;
        *puVar2 = uVar20;
        if (uVar20 == 0) break;
        if (uVar19 < 0x40) goto LAB_00b2a5c8;
      }
      *(int *)(param_1 + 0xe4) = *(int *)(param_1 + 0xe4) + 1;
    } while (0x3f < uVar19);
  }
LAB_00b2a5c8:
  if ((param_4 & 0x3f) == 0) {
    return 1;
  }
  puVar5 = (undefined8 *)(param_1 + 0xf0);
  *(undefined8 *)(param_1 + 0xf8) = 0;
  *puVar5 = 0;
  *(undefined8 *)(param_1 + 0x118) = 0;
  *(undefined8 *)(param_1 + 0x110) = 0;
  *(undefined8 *)(param_1 + 0x128) = 0;
  *(undefined8 *)(param_1 + 0x120) = 0;
  *(undefined8 *)(param_1 + 0x108) = 0;
  *(undefined8 *)(param_1 + 0x100) = 0;
  ChaCha20_ctr32(puVar5,puVar5,0x40,param_1 + 0xc0,puVar2);
  uVar19 = 0;
  if (0x1f < uVar10) {
    if (param_2 < param_3 + uVar7 && param_3 < param_2 + uVar7) {
      uVar19 = 0;
    }
    else {
      uVar19 = 0;
      if (param_1 + 0xf0U + uVar7 <= param_2 || param_2 + uVar7 <= param_1 + 0xf0U) {
        uVar19 = uVar7 & 0x20;
        puVar5 = (undefined8 *)(param_3 + 0x10);
        puVar12 = (undefined8 *)(param_2 + 0x10);
        puVar14 = (undefined8 *)(param_1 + 0x100);
        uVar6 = uVar19;
        do {
          uVar22 = puVar5[-1];
          uVar21 = puVar5[-2];
          uVar24 = puVar5[1];
          uVar23 = *puVar5;
          uVar26 = puVar14[-1];
          uVar25 = puVar14[-2];
          uVar28 = puVar14[1];
          uVar27 = *puVar14;
          uVar6 = uVar6 - 0x20;
          puVar5 = puVar5 + 4;
          puVar14 = puVar14 + 4;
          puVar12[-1] = CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                                 CONCAT16((byte)((ulong)uVar26 >> 0x30) ^
                                          (byte)((ulong)uVar22 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar26 >> 0x28) ^
                                                   (byte)((ulong)uVar22 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar26 >> 0x20) ^
                                                            (byte)((ulong)uVar22 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar26 >> 0x18) ^
                                                                     (byte)((ulong)uVar22 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar26
                                                                                    >> 0x10) ^
                                                                              (byte)((ulong)uVar22
                                                                                    >> 0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar26 >> 8) ^ (byte)((ulong)uVar22 >> 8),
                                                  (byte)uVar26 ^ (byte)uVar22)))))));
          puVar12[-2] = CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ (byte)((ulong)uVar21 >> 0x38),
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
          puVar12[1] = CONCAT17((byte)((ulong)uVar28 >> 0x38) ^ (byte)((ulong)uVar24 >> 0x38),
                                CONCAT16((byte)((ulong)uVar28 >> 0x30) ^
                                         (byte)((ulong)uVar24 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar28 >> 0x28) ^
                                                  (byte)((ulong)uVar24 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar28 >> 0x20) ^
                                                           (byte)((ulong)uVar24 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar28 >> 0x18) ^
                                                                    (byte)((ulong)uVar24 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar28 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar24 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar28 >> 8) ^ (byte)((ulong)uVar24 >> 8),
                                                  (byte)uVar28 ^ (byte)uVar24)))))));
          *puVar12 = CONCAT17((byte)((ulong)uVar27 >> 0x38) ^ (byte)((ulong)uVar23 >> 0x38),
                              CONCAT16((byte)((ulong)uVar27 >> 0x30) ^ (byte)((ulong)uVar23 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar27 >> 0x28) ^
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
          puVar12 = puVar12 + 4;
        } while (uVar6 != 0);
        if (uVar19 == uVar7) goto LAB_00b2a768;
      }
    }
  }
  lVar18 = uVar7 - uVar19;
  pbVar9 = (byte *)(param_3 + uVar19);
  pbVar13 = (byte *)(param_2 + uVar19);
  pbVar15 = (byte *)(param_1 + uVar19 + 0xf0);
  do {
    lVar18 = lVar18 + -1;
    *pbVar13 = *pbVar15 ^ *pbVar9;
    pbVar9 = pbVar9 + 1;
    pbVar13 = pbVar13 + 1;
    pbVar15 = pbVar15 + 1;
  } while (lVar18 != 0);
LAB_00b2a768:
  *(uint *)(param_1 + 0x130) = uVar10;
  return 1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa7b28
 */

undefined8 CRYPTO_ccm128_encrypt(byte *param_1,ulong *param_2,ulong *param_3,ulong param_4)

{
  long lVar1;
  byte *pbVar2;
  uint uVar3;
  code *pcVar4;
  byte bVar5;
  byte bVar6;
  byte *pbVar7;
  ulong uVar8;
  ulong uVar9;
  long lVar10;
  ulong uVar11;
  uint uVar12;
  ulong *puVar13;
  byte *pbVar14;
  ulong *puVar15;
  ulong *puVar16;
  ulong uVar17;
  ulong uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  undefined8 uVar24;
  ulong uVar25;
  undefined8 uVar26;
  ulong uVar27;
  undefined8 uVar28;
  ulong uVar29;
  ulong local_70 [2];
  
  bVar5 = *param_1;
  pcVar4 = *(code **)(param_1 + 0x28);
  uVar19 = *(undefined8 *)(param_1 + 0x30);
  if ((bVar5 >> 6 & 1) == 0) {
    (*pcVar4)(param_1,param_1 + 0x10,uVar19);
    *(long *)(param_1 + 0x20) = *(long *)(param_1 + 0x20) + 1;
  }
  *param_1 = (byte)(bVar5 & 7);
  uVar3 = bVar5 & 7 ^ 0xf;
  uVar8 = 0;
  if ((bVar5 & 7) != 0) {
    uVar9 = (ulong)uVar3;
    do {
      bVar6 = param_1[uVar9];
      param_1[uVar9] = 0;
      uVar9 = uVar9 + 1;
      uVar8 = (uVar8 | bVar6) << 8;
    } while (uVar9 < 0xf);
  }
  bVar6 = param_1[0xf];
  param_1[0xf] = 1;
  if ((uVar8 | bVar6) != param_4) {
    return 0xffffffff;
  }
  uVar8 = *(long *)(param_1 + 0x20) + (param_4 + 0xf >> 3 | 1);
  *(ulong *)(param_1 + 0x20) = uVar8;
  if (0x2000000000000000 < uVar8) {
    return 0xfffffffe;
  }
  uVar8 = param_4 - 0x10;
  if (0xf < param_4) {
    uVar9 = uVar8 & 0xfffffffffffffff0;
    lVar1 = uVar9 + 0x10;
    puVar15 = (ulong *)((long)param_3 + lVar1);
    puVar13 = param_2;
    do {
      *(ulong *)(param_1 + 0x10) = *(ulong *)(param_1 + 0x10) ^ *puVar13;
      *(ulong *)(param_1 + 0x18) = *(ulong *)(param_1 + 0x18) ^ puVar13[1];
      (*pcVar4)(param_1 + 0x10,param_1 + 0x10,uVar19);
      (*pcVar4)(param_1,local_70,uVar19);
      lVar10 = 0xf;
      do {
        bVar6 = param_1[lVar10];
        param_1[lVar10] = bVar6 + 1;
        if (lVar10 == 8) break;
        lVar10 = lVar10 + -1;
      } while ((byte)(bVar6 + 1) == 0);
      param_4 = param_4 - 0x10;
      *param_3 = *puVar13 ^ local_70[0];
      puVar16 = puVar13 + 1;
      puVar13 = puVar13 + 2;
      param_3[1] = *puVar16 ^ local_70[1];
      param_3 = param_3 + 2;
    } while (0xf < param_4);
    param_2 = (ulong *)((long)param_2 + lVar1);
    param_4 = uVar8 - uVar9;
    param_3 = puVar15;
  }
  if (param_4 == 0) goto LAB_00aa7dec;
  pbVar2 = param_1 + 0x10;
  if ((param_4 < 0x20) || ((int)(param_4 - 1) == -1)) {
LAB_00aa7d20:
    uVar8 = 0;
    uVar12 = 0;
LAB_00aa7d2c:
    do {
      uVar12 = uVar12 + 1;
      pbVar2[uVar8] = pbVar2[uVar8] ^ *(byte *)((long)param_2 + uVar8);
      uVar8 = (ulong)uVar12;
    } while (uVar8 < param_4);
  }
  else {
    uVar8 = 0;
    uVar12 = 0;
    if (param_4 - 1 >> 0x20 != 0) goto LAB_00aa7d2c;
    if ((param_1 + 0x10 < (byte *)((long)param_2 + param_4)) && (param_2 < param_1 + 0x10 + param_4)
       ) goto LAB_00aa7d20;
    uVar8 = param_4 & 0xffffffffffffffe0;
    puVar13 = param_2 + 2;
    uVar9 = uVar8;
    pbVar7 = param_1;
    do {
      pbVar14 = pbVar7 + 0x20;
      uVar17 = puVar13[-1];
      uVar11 = puVar13[-2];
      uVar21 = puVar13[1];
      uVar18 = *puVar13;
      uVar24 = *(undefined8 *)(pbVar7 + 0x18);
      uVar20 = *(undefined8 *)(pbVar7 + 0x10);
      uVar28 = *(undefined8 *)(pbVar7 + 0x28);
      uVar26 = *(undefined8 *)pbVar14;
      puVar13 = puVar13 + 4;
      uVar9 = uVar9 - 0x20;
      *(ulong *)(pbVar7 + 0x18) =
           CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)(uVar17 >> 0x38),
                    CONCAT16((byte)((ulong)uVar24 >> 0x30) ^ (byte)(uVar17 >> 0x30),
                             CONCAT15((byte)((ulong)uVar24 >> 0x28) ^ (byte)(uVar17 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                               (byte)(uVar17 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar24 >> 0x18) ^
                                                        (byte)(uVar17 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar24 >> 0x10) ^
                                                                 (byte)(uVar17 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar24 >> 8)
                                                                          ^ (byte)(uVar17 >> 8),
                                                                          (byte)uVar24 ^
                                                                          (byte)uVar17)))))));
      *(ulong *)(pbVar7 + 0x10) =
           CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)(uVar11 >> 0x38),
                    CONCAT16((byte)((ulong)uVar20 >> 0x30) ^ (byte)(uVar11 >> 0x30),
                             CONCAT15((byte)((ulong)uVar20 >> 0x28) ^ (byte)(uVar11 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                               (byte)(uVar11 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar20 >> 0x18) ^
                                                        (byte)(uVar11 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar20 >> 0x10) ^
                                                                 (byte)(uVar11 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar20 >> 8)
                                                                          ^ (byte)(uVar11 >> 8),
                                                                          (byte)uVar20 ^
                                                                          (byte)uVar11)))))));
      *(ulong *)(pbVar7 + 0x28) =
           CONCAT17((byte)((ulong)uVar28 >> 0x38) ^ (byte)(uVar21 >> 0x38),
                    CONCAT16((byte)((ulong)uVar28 >> 0x30) ^ (byte)(uVar21 >> 0x30),
                             CONCAT15((byte)((ulong)uVar28 >> 0x28) ^ (byte)(uVar21 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar28 >> 0x20) ^
                                               (byte)(uVar21 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar28 >> 0x18) ^
                                                        (byte)(uVar21 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar28 >> 0x10) ^
                                                                 (byte)(uVar21 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar28 >> 8)
                                                                          ^ (byte)(uVar21 >> 8),
                                                                          (byte)uVar28 ^
                                                                          (byte)uVar21)))))));
      *(ulong *)pbVar14 =
           CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)(uVar18 >> 0x38),
                    CONCAT16((byte)((ulong)uVar26 >> 0x30) ^ (byte)(uVar18 >> 0x30),
                             CONCAT15((byte)((ulong)uVar26 >> 0x28) ^ (byte)(uVar18 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar26 >> 0x20) ^
                                               (byte)(uVar18 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar26 >> 0x18) ^
                                                        (byte)(uVar18 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar26 >> 0x10) ^
                                                                 (byte)(uVar18 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar26 >> 8)
                                                                          ^ (byte)(uVar18 >> 8),
                                                                          (byte)uVar26 ^
                                                                          (byte)uVar18)))))));
      pbVar7 = pbVar14;
    } while (uVar9 != 0);
    uVar12 = (uint)param_4 & 0xffffffe0;
    if (param_4 != uVar8) goto LAB_00aa7d2c;
  }
  (*pcVar4)(pbVar2,pbVar2,uVar19);
  (*pcVar4)(param_1,local_70,uVar19);
  uVar8 = param_4;
  if (param_4 < 2) {
    uVar8 = 1;
  }
  if (uVar8 < 0x20) {
LAB_00aa7dc0:
    uVar11 = 0;
    uVar12 = 0;
  }
  else {
    uVar9 = param_4;
    if (param_4 < 2) {
      uVar9 = 1;
    }
    if ((int)(uVar9 - 1) == -1) goto LAB_00aa7dc0;
    uVar11 = 0;
    uVar12 = 0;
    if (uVar9 - 1 >> 0x20 == 0) {
      uVar9 = param_4;
      if (param_4 < 2) {
        uVar9 = 1;
      }
      if ((param_3 < (ulong *)((long)param_2 + uVar9)) &&
         (param_2 < (ulong *)((long)param_3 + uVar9))) goto LAB_00aa7dc0;
      uVar11 = uVar8 & 0xffffffffffffffe0;
      puVar13 = param_2 + 2;
      puVar15 = local_70 + 2;
      puVar16 = param_3 + 2;
      uVar9 = uVar11;
      do {
        uVar18 = puVar15[-1];
        uVar17 = puVar15[-2];
        uVar22 = puVar15[1];
        uVar21 = *puVar15;
        uVar25 = puVar13[-1];
        uVar23 = puVar13[-2];
        uVar29 = puVar13[1];
        uVar27 = *puVar13;
        puVar15 = puVar15 + 4;
        puVar13 = puVar13 + 4;
        uVar9 = uVar9 - 0x20;
        puVar16[-1] = CONCAT17((byte)(uVar25 >> 0x38) ^ (byte)(uVar18 >> 0x38),
                               CONCAT16((byte)(uVar25 >> 0x30) ^ (byte)(uVar18 >> 0x30),
                                        CONCAT15((byte)(uVar25 >> 0x28) ^ (byte)(uVar18 >> 0x28),
                                                 CONCAT14((byte)(uVar25 >> 0x20) ^
                                                          (byte)(uVar18 >> 0x20),
                                                          CONCAT13((byte)(uVar25 >> 0x18) ^
                                                                   (byte)(uVar18 >> 0x18),
                                                                   CONCAT12((byte)(uVar25 >> 0x10) ^
                                                                            (byte)(uVar18 >> 0x10),
                                                                            CONCAT11((byte)(uVar25 
                                                  >> 8) ^ (byte)(uVar18 >> 8),
                                                  (byte)uVar25 ^ (byte)uVar18)))))));
        puVar16[-2] = CONCAT17((byte)(uVar23 >> 0x38) ^ (byte)(uVar17 >> 0x38),
                               CONCAT16((byte)(uVar23 >> 0x30) ^ (byte)(uVar17 >> 0x30),
                                        CONCAT15((byte)(uVar23 >> 0x28) ^ (byte)(uVar17 >> 0x28),
                                                 CONCAT14((byte)(uVar23 >> 0x20) ^
                                                          (byte)(uVar17 >> 0x20),
                                                          CONCAT13((byte)(uVar23 >> 0x18) ^
                                                                   (byte)(uVar17 >> 0x18),
                                                                   CONCAT12((byte)(uVar23 >> 0x10) ^
                                                                            (byte)(uVar17 >> 0x10),
                                                                            CONCAT11((byte)(uVar23 
                                                  >> 8) ^ (byte)(uVar17 >> 8),
                                                  (byte)uVar23 ^ (byte)uVar17)))))));
        puVar16[1] = CONCAT17((byte)(uVar29 >> 0x38) ^ (byte)(uVar22 >> 0x38),
                              CONCAT16((byte)(uVar29 >> 0x30) ^ (byte)(uVar22 >> 0x30),
                                       CONCAT15((byte)(uVar29 >> 0x28) ^ (byte)(uVar22 >> 0x28),
                                                CONCAT14((byte)(uVar29 >> 0x20) ^
                                                         (byte)(uVar22 >> 0x20),
                                                         CONCAT13((byte)(uVar29 >> 0x18) ^
                                                                  (byte)(uVar22 >> 0x18),
                                                                  CONCAT12((byte)(uVar29 >> 0x10) ^
                                                                           (byte)(uVar22 >> 0x10),
                                                                           CONCAT11((byte)(uVar29 >>
                                                                                          8) ^
                                                                                    (byte)(uVar22 >>
                                                                                          8),(byte)
                                                  uVar29 ^ (byte)uVar22)))))));
        *puVar16 = CONCAT17((byte)(uVar27 >> 0x38) ^ (byte)(uVar21 >> 0x38),
                            CONCAT16((byte)(uVar27 >> 0x30) ^ (byte)(uVar21 >> 0x30),
                                     CONCAT15((byte)(uVar27 >> 0x28) ^ (byte)(uVar21 >> 0x28),
                                              CONCAT14((byte)(uVar27 >> 0x20) ^
                                                       (byte)(uVar21 >> 0x20),
                                                       CONCAT13((byte)(uVar27 >> 0x18) ^
                                                                (byte)(uVar21 >> 0x18),
                                                                CONCAT12((byte)(uVar27 >> 0x10) ^
                                                                         (byte)(uVar21 >> 0x10),
                                                                         CONCAT11((byte)(uVar27 >> 8
                                                                                        ) ^ (byte)(
                                                  uVar21 >> 8),(byte)uVar27 ^ (byte)uVar21)))))));
        puVar16 = puVar16 + 4;
      } while (uVar9 != 0);
      uVar12 = (uint)uVar8 & 0xffffffe0;
      if (uVar8 == uVar11) goto LAB_00aa7dec;
    }
  }
  do {
    uVar12 = uVar12 + 1;
    *(byte *)((long)param_3 + uVar11) =
         *(byte *)((long)param_2 + uVar11) ^ *(byte *)((long)local_70 + uVar11);
    uVar11 = (ulong)uVar12;
  } while (uVar11 < param_4);
LAB_00aa7dec:
  memset(param_1 + uVar3,0,(ulong)(0x10 - uVar3));
  (*pcVar4)(param_1,local_70,uVar19);
  uVar20 = *(undefined8 *)(param_1 + 0x18);
  uVar19 = *(undefined8 *)(param_1 + 0x10);
  *param_1 = bVar5;
  *(ulong *)(param_1 + 0x18) =
       CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)(local_70[1] >> 0x38),
                CONCAT16((byte)((ulong)uVar20 >> 0x30) ^ (byte)(local_70[1] >> 0x30),
                         CONCAT15((byte)((ulong)uVar20 >> 0x28) ^ (byte)(local_70[1] >> 0x28),
                                  CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                           (byte)(local_70[1] >> 0x20),
                                           CONCAT13((byte)((ulong)uVar20 >> 0x18) ^
                                                    (byte)(local_70[1] >> 0x18),
                                                    CONCAT12((byte)((ulong)uVar20 >> 0x10) ^
                                                             (byte)(local_70[1] >> 0x10),
                                                             CONCAT11((byte)((ulong)uVar20 >> 8) ^
                                                                      (byte)(local_70[1] >> 8),
                                                                      (byte)uVar20 ^
                                                                      (byte)local_70[1])))))));
  *(ulong *)(param_1 + 0x10) =
       CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)(local_70[0] >> 0x38),
                CONCAT16((byte)((ulong)uVar19 >> 0x30) ^ (byte)(local_70[0] >> 0x30),
                         CONCAT15((byte)((ulong)uVar19 >> 0x28) ^ (byte)(local_70[0] >> 0x28),
                                  CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                           (byte)(local_70[0] >> 0x20),
                                           CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                    (byte)(local_70[0] >> 0x18),
                                                    CONCAT12((byte)((ulong)uVar19 >> 0x10) ^
                                                             (byte)(local_70[0] >> 0x10),
                                                             CONCAT11((byte)((ulong)uVar19 >> 8) ^
                                                                      (byte)(local_70[0] >> 8),
                                                                      (byte)uVar19 ^
                                                                      (byte)local_70[0])))))));
  return 0;
}


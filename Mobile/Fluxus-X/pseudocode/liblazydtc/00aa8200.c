/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa8200
 */

undefined8
CRYPTO_ccm128_encrypt_ccm64(byte *param_1,byte *param_2,byte *param_3,ulong param_4,code *param_5)

{
  uint uVar1;
  code *pcVar2;
  byte bVar3;
  byte bVar4;
  ulong uVar5;
  ulong uVar6;
  long lVar7;
  uint uVar8;
  ulong uVar9;
  byte *pbVar10;
  byte *pbVar11;
  byte *pbVar12;
  byte *pbVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  byte local_70 [8];
  undefined8 uStack_68;
  
  bVar3 = *param_1;
  pcVar2 = *(code **)(param_1 + 0x28);
  uVar16 = *(undefined8 *)(param_1 + 0x30);
  if ((bVar3 >> 6 & 1) == 0) {
    (*pcVar2)(param_1,param_1 + 0x10,uVar16);
    *(long *)(param_1 + 0x20) = *(long *)(param_1 + 0x20) + 1;
  }
  *param_1 = (byte)(bVar3 & 7);
  uVar1 = bVar3 & 7 ^ 0xf;
  uVar5 = 0;
  if ((bVar3 & 7) != 0) {
    uVar6 = (ulong)uVar1;
    do {
      bVar4 = param_1[uVar6];
      param_1[uVar6] = 0;
      uVar6 = uVar6 + 1;
      uVar5 = (uVar5 | bVar4) << 8;
    } while (uVar6 < 0xf);
  }
  bVar4 = param_1[0xf];
  param_1[0xf] = 1;
  if ((uVar5 | bVar4) != param_4) {
    return 0xffffffff;
  }
  uVar5 = *(long *)(param_1 + 0x20) + (param_4 + 0xf >> 3 | 1);
  *(ulong *)(param_1 + 0x20) = uVar5;
  if (0x2000000000000000 < uVar5) {
    return 0xfffffffe;
  }
  uVar5 = param_4 >> 4;
  if (uVar5 != 0) {
    (*param_5)(param_2,param_3,uVar5,uVar16,param_1,param_1 + 0x10);
    uVar6 = param_4 & 0xfffffffffffffff0;
    param_4 = param_4 - uVar6;
    if (param_4 == 0) goto LAB_00aa8460;
    uVar9 = 0;
    param_2 = param_2 + uVar6;
    param_3 = param_3 + uVar6;
    lVar7 = 0xf;
    do {
      uVar6 = uVar9 + (uVar5 & 0xff) + (ulong)param_1[lVar7];
      param_1[lVar7] = (byte)uVar6;
      if (lVar7 == 8) break;
      uVar9 = uVar6 >> 8;
      uVar6 = uVar6 | uVar5;
      uVar5 = uVar5 >> 8;
      lVar7 = lVar7 + -1;
    } while (uVar6 >> 8 != 0);
  }
  if (param_4 == 0) goto LAB_00aa8460;
  pbVar12 = param_1 + 0x10;
  if ((param_4 < 0x20) || ((int)(param_4 - 1) == -1)) {
LAB_00aa8394:
    uVar5 = 0;
    uVar8 = 0;
LAB_00aa83a0:
    do {
      uVar8 = uVar8 + 1;
      pbVar12[uVar5] = pbVar12[uVar5] ^ param_2[uVar5];
      uVar5 = (ulong)uVar8;
    } while (uVar5 < param_4);
  }
  else {
    uVar5 = 0;
    uVar8 = 0;
    if (param_4 - 1 >> 0x20 != 0) goto LAB_00aa83a0;
    if ((param_1 + 0x10 < param_2 + param_4) && (param_2 < param_1 + 0x10 + param_4))
    goto LAB_00aa8394;
    uVar5 = param_4 & 0xffffffffffffffe0;
    pbVar10 = param_2 + 0x10;
    uVar6 = uVar5;
    pbVar13 = param_1;
    do {
      pbVar11 = pbVar13 + 0x20;
      uVar15 = *(undefined8 *)(pbVar10 + -8);
      uVar14 = *(undefined8 *)(pbVar10 + -0x10);
      uVar18 = *(undefined8 *)(pbVar10 + 8);
      uVar17 = *(undefined8 *)pbVar10;
      uVar20 = *(undefined8 *)(pbVar13 + 0x18);
      uVar19 = *(undefined8 *)(pbVar13 + 0x10);
      uVar22 = *(undefined8 *)(pbVar13 + 0x28);
      uVar21 = *(undefined8 *)pbVar11;
      pbVar10 = pbVar10 + 0x20;
      uVar6 = uVar6 - 0x20;
      *(ulong *)(pbVar13 + 0x18) =
           CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                    CONCAT16((byte)((ulong)uVar20 >> 0x30) ^ (byte)((ulong)uVar15 >> 0x30),
                             CONCAT15((byte)((ulong)uVar20 >> 0x28) ^ (byte)((ulong)uVar15 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                               (byte)((ulong)uVar15 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar20 >> 0x18) ^
                                                        (byte)((ulong)uVar15 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar20 >> 0x10) ^
                                                                 (byte)((ulong)uVar15 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar20 >> 8)
                                                                          ^ (byte)((ulong)uVar15 >>
                                                                                  8),
                                                                          (byte)uVar20 ^
                                                                          (byte)uVar15)))))));
      *(ulong *)(pbVar13 + 0x10) =
           CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar14 >> 0x38),
                    CONCAT16((byte)((ulong)uVar19 >> 0x30) ^ (byte)((ulong)uVar14 >> 0x30),
                             CONCAT15((byte)((ulong)uVar19 >> 0x28) ^ (byte)((ulong)uVar14 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                               (byte)((ulong)uVar14 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                        (byte)((ulong)uVar14 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar19 >> 0x10) ^
                                                                 (byte)((ulong)uVar14 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar19 >> 8)
                                                                          ^ (byte)((ulong)uVar14 >>
                                                                                  8),
                                                                          (byte)uVar19 ^
                                                                          (byte)uVar14)))))));
      *(ulong *)(pbVar13 + 0x28) =
           CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                    CONCAT16((byte)((ulong)uVar22 >> 0x30) ^ (byte)((ulong)uVar18 >> 0x30),
                             CONCAT15((byte)((ulong)uVar22 >> 0x28) ^ (byte)((ulong)uVar18 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar22 >> 0x20) ^
                                               (byte)((ulong)uVar18 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar22 >> 0x18) ^
                                                        (byte)((ulong)uVar18 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar22 >> 0x10) ^
                                                                 (byte)((ulong)uVar18 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar22 >> 8)
                                                                          ^ (byte)((ulong)uVar18 >>
                                                                                  8),
                                                                          (byte)uVar22 ^
                                                                          (byte)uVar18)))))));
      *(ulong *)pbVar11 =
           CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                    CONCAT16((byte)((ulong)uVar21 >> 0x30) ^ (byte)((ulong)uVar17 >> 0x30),
                             CONCAT15((byte)((ulong)uVar21 >> 0x28) ^ (byte)((ulong)uVar17 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar21 >> 0x20) ^
                                               (byte)((ulong)uVar17 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar21 >> 0x18) ^
                                                        (byte)((ulong)uVar17 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar21 >> 0x10) ^
                                                                 (byte)((ulong)uVar17 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar21 >> 8)
                                                                          ^ (byte)((ulong)uVar17 >>
                                                                                  8),
                                                                          (byte)uVar21 ^
                                                                          (byte)uVar17)))))));
      pbVar13 = pbVar11;
    } while (uVar6 != 0);
    uVar8 = (uint)param_4 & 0xffffffe0;
    if (param_4 != uVar5) goto LAB_00aa83a0;
  }
  (*pcVar2)(pbVar12,pbVar12,uVar16);
  (*pcVar2)(param_1,local_70,uVar16);
  uVar5 = param_4;
  if (param_4 < 2) {
    uVar5 = 1;
  }
  if (uVar5 < 0x20) {
LAB_00aa8434:
    uVar9 = 0;
    uVar8 = 0;
  }
  else {
    uVar6 = param_4;
    if (param_4 < 2) {
      uVar6 = 1;
    }
    if ((int)(uVar6 - 1) == -1) goto LAB_00aa8434;
    uVar9 = 0;
    uVar8 = 0;
    if (uVar6 - 1 >> 0x20 == 0) {
      uVar6 = param_4;
      if (param_4 < 2) {
        uVar6 = 1;
      }
      if ((param_3 < param_2 + uVar6) && (param_2 < param_3 + uVar6)) goto LAB_00aa8434;
      uVar9 = uVar5 & 0xffffffffffffffe0;
      pbVar12 = param_2 + 0x10;
      pbVar10 = local_70 + 0x10;
      pbVar13 = param_3 + 0x10;
      uVar6 = uVar9;
      do {
        uVar15 = *(undefined8 *)(pbVar10 + -8);
        uVar14 = *(undefined8 *)(pbVar10 + -0x10);
        uVar18 = *(undefined8 *)(pbVar10 + 8);
        uVar17 = *(undefined8 *)pbVar10;
        uVar20 = *(undefined8 *)(pbVar12 + -8);
        uVar19 = *(undefined8 *)(pbVar12 + -0x10);
        uVar22 = *(undefined8 *)(pbVar12 + 8);
        uVar21 = *(undefined8 *)pbVar12;
        pbVar10 = pbVar10 + 0x20;
        pbVar12 = pbVar12 + 0x20;
        uVar6 = uVar6 - 0x20;
        *(ulong *)(pbVar13 + -8) =
             CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                      CONCAT16((byte)((ulong)uVar20 >> 0x30) ^ (byte)((ulong)uVar15 >> 0x30),
                               CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                        (byte)((ulong)uVar15 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                 (byte)((ulong)uVar15 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar20 >> 0x18) ^
                                                          (byte)((ulong)uVar15 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar20 >> 0x10) ^
                                                                   (byte)((ulong)uVar15 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar20 >>
                                                                                  8) ^
                                                                            (byte)((ulong)uVar15 >>
                                                                                  8),(byte)uVar20 ^
                                                                                     (byte)uVar15)))
                                                ))));
        *(ulong *)(pbVar13 + -0x10) =
             CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar14 >> 0x38),
                      CONCAT16((byte)((ulong)uVar19 >> 0x30) ^ (byte)((ulong)uVar14 >> 0x30),
                               CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                        (byte)((ulong)uVar14 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                 (byte)((ulong)uVar14 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                          (byte)((ulong)uVar14 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar19 >> 0x10) ^
                                                                   (byte)((ulong)uVar14 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar19 >>
                                                                                  8) ^
                                                                            (byte)((ulong)uVar14 >>
                                                                                  8),(byte)uVar19 ^
                                                                                     (byte)uVar14)))
                                                ))));
        *(ulong *)(pbVar13 + 8) =
             CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                      CONCAT16((byte)((ulong)uVar22 >> 0x30) ^ (byte)((ulong)uVar18 >> 0x30),
                               CONCAT15((byte)((ulong)uVar22 >> 0x28) ^
                                        (byte)((ulong)uVar18 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar22 >> 0x20) ^
                                                 (byte)((ulong)uVar18 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar22 >> 0x18) ^
                                                          (byte)((ulong)uVar18 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar22 >> 0x10) ^
                                                                   (byte)((ulong)uVar18 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar22 >>
                                                                                  8) ^
                                                                            (byte)((ulong)uVar18 >>
                                                                                  8),(byte)uVar22 ^
                                                                                     (byte)uVar18)))
                                                ))));
        *(ulong *)pbVar13 =
             CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                      CONCAT16((byte)((ulong)uVar21 >> 0x30) ^ (byte)((ulong)uVar17 >> 0x30),
                               CONCAT15((byte)((ulong)uVar21 >> 0x28) ^
                                        (byte)((ulong)uVar17 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar21 >> 0x20) ^
                                                 (byte)((ulong)uVar17 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar21 >> 0x18) ^
                                                          (byte)((ulong)uVar17 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar21 >> 0x10) ^
                                                                   (byte)((ulong)uVar17 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar21 >>
                                                                                  8) ^
                                                                            (byte)((ulong)uVar17 >>
                                                                                  8),(byte)uVar21 ^
                                                                                     (byte)uVar17)))
                                                ))));
        pbVar13 = pbVar13 + 0x20;
      } while (uVar6 != 0);
      uVar8 = (uint)uVar5 & 0xffffffe0;
      if (uVar5 == uVar9) goto LAB_00aa8460;
    }
  }
  do {
    uVar8 = uVar8 + 1;
    param_3[uVar9] = param_2[uVar9] ^ local_70[uVar9];
    uVar9 = (ulong)uVar8;
  } while (uVar9 < param_4);
LAB_00aa8460:
  memset(param_1 + uVar1,0,(ulong)(0x10 - uVar1));
  (*pcVar2)(param_1,local_70,uVar16);
  uVar14 = *(undefined8 *)(param_1 + 0x18);
  uVar16 = *(undefined8 *)(param_1 + 0x10);
  *param_1 = bVar3;
  *(ulong *)(param_1 + 0x18) =
       CONCAT17((byte)((ulong)uVar14 >> 0x38) ^ (byte)((ulong)uStack_68 >> 0x38),
                CONCAT16((byte)((ulong)uVar14 >> 0x30) ^ (byte)((ulong)uStack_68 >> 0x30),
                         CONCAT15((byte)((ulong)uVar14 >> 0x28) ^ (byte)((ulong)uStack_68 >> 0x28),
                                  CONCAT14((byte)((ulong)uVar14 >> 0x20) ^
                                           (byte)((ulong)uStack_68 >> 0x20),
                                           CONCAT13((byte)((ulong)uVar14 >> 0x18) ^
                                                    (byte)((ulong)uStack_68 >> 0x18),
                                                    CONCAT12((byte)((ulong)uVar14 >> 0x10) ^
                                                             (byte)((ulong)uStack_68 >> 0x10),
                                                             CONCAT11((byte)((ulong)uVar14 >> 8) ^
                                                                      (byte)((ulong)uStack_68 >> 8),
                                                                      (byte)uVar14 ^ (byte)uStack_68
                                                                     )))))));
  *(ulong *)(param_1 + 0x10) =
       CONCAT17((byte)((ulong)uVar16 >> 0x38) ^ local_70[7],
                CONCAT16((byte)((ulong)uVar16 >> 0x30) ^ local_70[6],
                         CONCAT15((byte)((ulong)uVar16 >> 0x28) ^ local_70[5],
                                  CONCAT14((byte)((ulong)uVar16 >> 0x20) ^ local_70[4],
                                           CONCAT13((byte)((ulong)uVar16 >> 0x18) ^ local_70[3],
                                                    CONCAT12((byte)((ulong)uVar16 >> 0x10) ^
                                                             local_70[2],
                                                             CONCAT11((byte)((ulong)uVar16 >> 8) ^
                                                                      local_70[1],
                                                                      (byte)uVar16 ^ local_70[0]))))
                                 )));
  return 0;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa9ed4
 */

undefined8 CRYPTO_gcm128_aad(long param_1,byte *param_2,ulong param_3)

{
  uint uVar1;
  ulong uVar2;
  long lVar3;
  byte *pbVar4;
  undefined8 *puVar5;
  byte *pbVar6;
  ulong uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  
  if (*(long *)(param_1 + 0x38) != 0) {
    return 0xfffffffe;
  }
  uVar2 = *(ulong *)(param_1 + 0x30) + param_3;
  if (0x2000000000000000 < uVar2) {
    return 0xffffffff;
  }
  if (CARRY8(*(ulong *)(param_1 + 0x30),param_3)) {
    return 0xffffffff;
  }
  uVar1 = *(uint *)(param_1 + 0x174);
  *(ulong *)(param_1 + 0x30) = uVar2;
  if (uVar1 != 0) {
    if (param_3 == 0) {
LAB_00aa9f6c:
      *(uint *)(param_1 + 0x174) = uVar1;
      return 0;
    }
    pbVar4 = param_2;
    do {
      uVar2 = (ulong)uVar1;
      param_2 = pbVar4 + 1;
      param_3 = param_3 - 1;
      uVar1 = uVar1 + 1 & 0xf;
      *(byte *)(param_1 + 0x40 + uVar2) = *(byte *)(param_1 + 0x40 + uVar2) ^ *pbVar4;
      if (param_3 == 0) break;
      pbVar4 = param_2;
    } while (uVar1 != 0);
    if (uVar1 != 0) goto LAB_00aa9f6c;
    FUN_00aa9de0(param_1 + 0x40,param_1 + 0x60);
  }
  uVar2 = param_3 & 0xfffffffffffffff0;
  if (uVar2 != 0) {
    FUN_00aaa048(param_1 + 0x40,param_1 + 0x60,param_2,uVar2);
    param_2 = param_2 + uVar2;
    param_3 = param_3 - uVar2;
  }
  if (param_3 != 0) {
    uVar2 = 0;
    if ((0x1f < param_3) &&
       ((param_2 + param_3 <= (byte *)(param_1 + 0x40U) ||
        (uVar2 = 0, (byte *)(param_1 + 0x40U) + param_3 <= param_2)))) {
      uVar2 = param_3 & 0xffffffffffffffe0;
      pbVar4 = param_2 + 0x10;
      puVar5 = (undefined8 *)(param_1 + 0x50);
      uVar7 = uVar2;
      do {
        uVar9 = *(undefined8 *)(pbVar4 + -8);
        uVar8 = *(undefined8 *)(pbVar4 + -0x10);
        uVar11 = *(undefined8 *)(pbVar4 + 8);
        uVar10 = *(undefined8 *)pbVar4;
        uVar13 = puVar5[-1];
        uVar12 = puVar5[-2];
        uVar15 = puVar5[1];
        uVar14 = *puVar5;
        pbVar4 = pbVar4 + 0x20;
        uVar7 = uVar7 - 0x20;
        puVar5[-1] = CONCAT17((byte)((ulong)uVar13 >> 0x38) ^ (byte)((ulong)uVar9 >> 0x38),
                              CONCAT16((byte)((ulong)uVar13 >> 0x30) ^ (byte)((ulong)uVar9 >> 0x30),
                                       CONCAT15((byte)((ulong)uVar13 >> 0x28) ^
                                                (byte)((ulong)uVar9 >> 0x28),
                                                CONCAT14((byte)((ulong)uVar13 >> 0x20) ^
                                                         (byte)((ulong)uVar9 >> 0x20),
                                                         CONCAT13((byte)((ulong)uVar13 >> 0x18) ^
                                                                  (byte)((ulong)uVar9 >> 0x18),
                                                                  CONCAT12((byte)((ulong)uVar13 >>
                                                                                 0x10) ^
                                                                           (byte)((ulong)uVar9 >>
                                                                                 0x10),
                                                                           CONCAT11((byte)((ulong)
                                                  uVar13 >> 8) ^ (byte)((ulong)uVar9 >> 8),
                                                  (byte)uVar13 ^ (byte)uVar9)))))));
        puVar5[-2] = CONCAT17((byte)((ulong)uVar12 >> 0x38) ^ (byte)((ulong)uVar8 >> 0x38),
                              CONCAT16((byte)((ulong)uVar12 >> 0x30) ^ (byte)((ulong)uVar8 >> 0x30),
                                       CONCAT15((byte)((ulong)uVar12 >> 0x28) ^
                                                (byte)((ulong)uVar8 >> 0x28),
                                                CONCAT14((byte)((ulong)uVar12 >> 0x20) ^
                                                         (byte)((ulong)uVar8 >> 0x20),
                                                         CONCAT13((byte)((ulong)uVar12 >> 0x18) ^
                                                                  (byte)((ulong)uVar8 >> 0x18),
                                                                  CONCAT12((byte)((ulong)uVar12 >>
                                                                                 0x10) ^
                                                                           (byte)((ulong)uVar8 >>
                                                                                 0x10),
                                                                           CONCAT11((byte)((ulong)
                                                  uVar12 >> 8) ^ (byte)((ulong)uVar8 >> 8),
                                                  (byte)uVar12 ^ (byte)uVar8)))))));
        puVar5[1] = CONCAT17((byte)((ulong)uVar15 >> 0x38) ^ (byte)((ulong)uVar11 >> 0x38),
                             CONCAT16((byte)((ulong)uVar15 >> 0x30) ^ (byte)((ulong)uVar11 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar15 >> 0x28) ^
                                               (byte)((ulong)uVar11 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar15 >> 0x20) ^
                                                        (byte)((ulong)uVar11 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar15 >> 0x18) ^
                                                                 (byte)((ulong)uVar11 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar15 >>
                                                                                0x10) ^
                                                                          (byte)((ulong)uVar11 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar15 >> 8) ^ (byte)((ulong)uVar11 >> 8),
                                                  (byte)uVar15 ^ (byte)uVar11)))))));
        *puVar5 = CONCAT17((byte)((ulong)uVar14 >> 0x38) ^ (byte)((ulong)uVar10 >> 0x38),
                           CONCAT16((byte)((ulong)uVar14 >> 0x30) ^ (byte)((ulong)uVar10 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar14 >> 0x28) ^
                                             (byte)((ulong)uVar10 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar14 >> 0x20) ^
                                                      (byte)((ulong)uVar10 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar14 >> 0x18) ^
                                                               (byte)((ulong)uVar10 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar14 >> 0x10
                                                                              ) ^ (byte)((ulong)
                                                  uVar10 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar14 >> 8) ^
                                                           (byte)((ulong)uVar10 >> 8),
                                                           (byte)uVar14 ^ (byte)uVar10)))))));
        puVar5 = puVar5 + 4;
      } while (uVar7 != 0);
      if (param_3 == uVar2) goto LAB_00aaa03c;
    }
    lVar3 = param_3 - uVar2;
    pbVar4 = param_2 + uVar2;
    pbVar6 = (byte *)(param_1 + uVar2 + 0x40);
    do {
      lVar3 = lVar3 + -1;
      *pbVar6 = *pbVar6 ^ *pbVar4;
      pbVar4 = pbVar4 + 1;
      pbVar6 = pbVar6 + 1;
    } while (lVar3 != 0);
  }
LAB_00aaa03c:
  *(int *)(param_1 + 0x174) = (int)param_3;
  return 0;
}


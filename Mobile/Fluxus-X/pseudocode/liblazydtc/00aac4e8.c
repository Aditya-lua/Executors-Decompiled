/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aac4e8
 */

void CRYPTO_ofb128_encrypt
               (byte *param_1,byte *param_2,ulong param_3,undefined8 param_4,long param_5,
               uint *param_6,code *param_7)

{
  long lVar1;
  byte *pbVar2;
  undefined8 *puVar3;
  uint uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  byte *pbVar8;
  uint uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  
  uVar4 = *param_6;
  if ((int)uVar4 < 0) {
    uVar9 = 0xffffffff;
    goto LAB_00aac6ec;
  }
  for (; (uVar9 = uVar4, param_3 != 0 && (uVar9 = 0, uVar4 != 0)); uVar4 = uVar4 + 1 & 0xf) {
    param_3 = param_3 - 1;
    *param_2 = *(byte *)(param_5 + (ulong)uVar4) ^ *param_1;
    param_2 = param_2 + 1;
    param_1 = param_1 + 1;
  }
  uVar7 = param_3 - 0x10;
  if (0xf < param_3) {
    uVar5 = uVar7 & 0xfffffffffffffff0;
    lVar1 = uVar5 + 0x10;
    pbVar2 = param_2 + lVar1;
    pbVar8 = param_1;
    do {
      (*param_7)(param_5,param_5,param_4);
      if (uVar9 < 0x10) {
        uVar6 = (ulong)uVar9;
        do {
          *(ulong *)(param_2 + uVar6) = *(ulong *)(param_5 + uVar6) ^ *(ulong *)(pbVar8 + uVar6);
          uVar6 = uVar6 + 8;
        } while (uVar6 < 0x10);
      }
      param_3 = param_3 - 0x10;
      uVar9 = 0;
      param_2 = param_2 + 0x10;
      pbVar8 = pbVar8 + 0x10;
    } while (0xf < param_3);
    uVar9 = 0;
    param_3 = uVar7 - uVar5;
    param_1 = param_1 + lVar1;
    param_2 = pbVar2;
  }
  if (param_3 == 0) goto LAB_00aac6ec;
  (*param_7)(param_5,param_5,param_4);
  if (((param_3 < 0x20) || (CARRY4(uVar9,(uint)(param_3 - 1)))) || (param_3 - 1 >> 0x20 != 0)) {
LAB_00aac6c0:
    uVar7 = param_3;
    uVar4 = uVar9;
LAB_00aac6c8:
    do {
      uVar5 = (ulong)uVar4;
      uVar7 = uVar7 - 1;
      param_2[uVar5] = *(byte *)(param_5 + uVar5) ^ param_1[uVar5];
      uVar4 = uVar4 + 1;
    } while (uVar7 != 0);
  }
  else {
    uVar7 = (ulong)uVar9;
    lVar1 = param_3 + uVar7;
    if ((param_2 + uVar7 < param_1 + lVar1 && param_1 + uVar7 < param_2 + lVar1) ||
       (param_2 + uVar7 < (byte *)(param_5 + lVar1) && (byte *)(param_5 + uVar7) < param_2 + lVar1))
    goto LAB_00aac6c0;
    uVar5 = param_3 & 0xffffffffffffffe0;
    uVar7 = uVar5;
    uVar4 = uVar9;
    do {
      uVar6 = (ulong)uVar4;
      pbVar8 = param_1 + uVar6;
      puVar3 = (undefined8 *)(param_5 + uVar6);
      uVar11 = *(undefined8 *)(pbVar8 + 8);
      uVar10 = *(undefined8 *)pbVar8;
      uVar13 = *(undefined8 *)(pbVar8 + 0x18);
      uVar12 = *(undefined8 *)(pbVar8 + 0x10);
      uVar15 = puVar3[1];
      uVar14 = *puVar3;
      uVar17 = puVar3[3];
      uVar16 = puVar3[2];
      uVar7 = uVar7 - 0x20;
      pbVar8 = param_2 + uVar6;
      uVar4 = uVar4 + 0x20;
      *(ulong *)(pbVar8 + 8) =
           CONCAT17((byte)((ulong)uVar15 >> 0x38) ^ (byte)((ulong)uVar11 >> 0x38),
                    CONCAT16((byte)((ulong)uVar15 >> 0x30) ^ (byte)((ulong)uVar11 >> 0x30),
                             CONCAT15((byte)((ulong)uVar15 >> 0x28) ^ (byte)((ulong)uVar11 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar15 >> 0x20) ^
                                               (byte)((ulong)uVar11 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar15 >> 0x18) ^
                                                        (byte)((ulong)uVar11 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar15 >> 0x10) ^
                                                                 (byte)((ulong)uVar11 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar15 >> 8)
                                                                          ^ (byte)((ulong)uVar11 >>
                                                                                  8),
                                                                          (byte)uVar15 ^
                                                                          (byte)uVar11)))))));
      *(ulong *)pbVar8 =
           CONCAT17((byte)((ulong)uVar14 >> 0x38) ^ (byte)((ulong)uVar10 >> 0x38),
                    CONCAT16((byte)((ulong)uVar14 >> 0x30) ^ (byte)((ulong)uVar10 >> 0x30),
                             CONCAT15((byte)((ulong)uVar14 >> 0x28) ^ (byte)((ulong)uVar10 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar14 >> 0x20) ^
                                               (byte)((ulong)uVar10 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar14 >> 0x18) ^
                                                        (byte)((ulong)uVar10 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar14 >> 0x10) ^
                                                                 (byte)((ulong)uVar10 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar14 >> 8)
                                                                          ^ (byte)((ulong)uVar10 >>
                                                                                  8),
                                                                          (byte)uVar14 ^
                                                                          (byte)uVar10)))))));
      *(ulong *)(pbVar8 + 0x18) =
           CONCAT17((byte)((ulong)uVar17 >> 0x38) ^ (byte)((ulong)uVar13 >> 0x38),
                    CONCAT16((byte)((ulong)uVar17 >> 0x30) ^ (byte)((ulong)uVar13 >> 0x30),
                             CONCAT15((byte)((ulong)uVar17 >> 0x28) ^ (byte)((ulong)uVar13 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar17 >> 0x20) ^
                                               (byte)((ulong)uVar13 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar17 >> 0x18) ^
                                                        (byte)((ulong)uVar13 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar17 >> 0x10) ^
                                                                 (byte)((ulong)uVar13 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar17 >> 8)
                                                                          ^ (byte)((ulong)uVar13 >>
                                                                                  8),
                                                                          (byte)uVar17 ^
                                                                          (byte)uVar13)))))));
      *(ulong *)(pbVar8 + 0x10) =
           CONCAT17((byte)((ulong)uVar16 >> 0x38) ^ (byte)((ulong)uVar12 >> 0x38),
                    CONCAT16((byte)((ulong)uVar16 >> 0x30) ^ (byte)((ulong)uVar12 >> 0x30),
                             CONCAT15((byte)((ulong)uVar16 >> 0x28) ^ (byte)((ulong)uVar12 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar16 >> 0x20) ^
                                               (byte)((ulong)uVar12 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar16 >> 0x18) ^
                                                        (byte)((ulong)uVar12 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar16 >> 0x10) ^
                                                                 (byte)((ulong)uVar12 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar16 >> 8)
                                                                          ^ (byte)((ulong)uVar12 >>
                                                                                  8),
                                                                          (byte)uVar16 ^
                                                                          (byte)uVar12)))))));
    } while (uVar7 != 0);
    uVar7 = param_3 - uVar5;
    uVar4 = uVar9 + (int)uVar5;
    if (param_3 != uVar5) goto LAB_00aac6c8;
  }
  uVar9 = uVar9 + (int)param_3;
LAB_00aac6ec:
  *param_6 = uVar9;
  return;
}


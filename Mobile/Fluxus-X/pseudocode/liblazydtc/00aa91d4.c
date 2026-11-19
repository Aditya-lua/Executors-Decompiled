/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa91d4
 */

void CRYPTO_ctr128_encrypt
               (ulong *param_1,ulong *param_2,ulong param_3,undefined8 param_4,char *param_5,
               ulong *param_6,uint *param_7,code *param_8)

{
  ulong *puVar1;
  long lVar2;
  int iVar3;
  ulong *puVar4;
  byte *pbVar5;
  undefined8 *puVar6;
  byte bVar7;
  uint uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  uint uVar12;
  ulong *puVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  
  for (uVar8 = *param_7; (uVar12 = uVar8, param_3 != 0 && (uVar12 = 0, uVar8 != 0));
      uVar8 = uVar8 + 1 & 0xf) {
    param_3 = param_3 - 1;
    *(byte *)param_2 = *(byte *)((long)param_6 + (ulong)uVar8) ^ (byte)*param_1;
    param_2 = (ulong *)((long)param_2 + 1);
    param_1 = (ulong *)((long)param_1 + 1);
  }
  uVar10 = param_3 - 0x10;
  if (0xf < param_3) {
    uVar9 = uVar10 & 0xfffffffffffffff0;
    lVar2 = uVar9 + 0x10;
    puVar4 = (ulong *)((long)param_2 + lVar2);
    puVar13 = param_1;
    do {
      (*param_8)(param_5,param_6,param_4);
      bVar7 = param_5[0xf];
      param_3 = param_3 - 0x10;
      param_5[0xf] = (char)(bVar7 + 1);
      uVar8 = (uint)(byte)param_5[0xe] + (bVar7 + 1 >> 8);
      param_5[0xe] = (char)uVar8;
      uVar8 = (uint)(byte)param_5[0xd] + (uVar8 >> 8);
      param_5[0xd] = (char)uVar8;
      uVar8 = (uint)(byte)param_5[0xc] + (uVar8 >> 8);
      param_5[0xc] = (char)uVar8;
      uVar8 = (uint)(byte)param_5[0xb] + (uVar8 >> 8);
      param_5[0xb] = (char)uVar8;
      uVar8 = (uint)(byte)param_5[10] + (uVar8 >> 8);
      param_5[10] = (char)uVar8;
      uVar8 = (uint)(byte)param_5[9] + (uVar8 >> 8);
      param_5[9] = (char)uVar8;
      uVar8 = (uint)(byte)param_5[8] + (uVar8 >> 8);
      param_5[8] = (char)uVar8;
      uVar8 = (uint)(byte)param_5[7] + (uVar8 >> 8);
      param_5[7] = (char)uVar8;
      uVar8 = (uint)(byte)param_5[6] + (uVar8 >> 8);
      param_5[6] = (char)uVar8;
      uVar8 = (uint)(byte)param_5[5] + (uVar8 >> 8);
      param_5[5] = (char)uVar8;
      uVar8 = (uint)(byte)param_5[4] + (uVar8 >> 8);
      param_5[4] = (char)uVar8;
      uVar8 = (uint)(byte)param_5[3] + (uVar8 >> 8);
      param_5[3] = (char)uVar8;
      uVar8 = (uint)(byte)param_5[2] + (uVar8 >> 8);
      param_5[2] = (char)uVar8;
      iVar3 = (uint)(byte)param_5[1] + (uVar8 >> 8);
      param_5[1] = (char)iVar3;
      *param_5 = *param_5 + (char)((uint)iVar3 >> 8);
      *param_2 = *param_6 ^ *puVar13;
      puVar1 = puVar13 + 1;
      puVar13 = puVar13 + 2;
      param_2[1] = param_6[1] ^ *puVar1;
      param_2 = param_2 + 2;
    } while (0xf < param_3);
    uVar12 = 0;
    param_3 = uVar10 - uVar9;
    param_1 = (ulong *)((long)param_1 + lVar2);
    param_2 = puVar4;
  }
  if (param_3 == 0) goto LAB_00aa9544;
  (*param_8)(param_5,param_6,param_4);
  bVar7 = param_5[0xf];
  param_5[0xf] = (char)(bVar7 + 1);
  uVar8 = (uint)(byte)param_5[0xe] + (bVar7 + 1 >> 8);
  param_5[0xe] = (char)uVar8;
  uVar8 = (uint)(byte)param_5[0xd] + (uVar8 >> 8);
  param_5[0xd] = (char)uVar8;
  uVar8 = (uint)(byte)param_5[0xc] + (uVar8 >> 8);
  param_5[0xc] = (char)uVar8;
  uVar8 = (uint)(byte)param_5[0xb] + (uVar8 >> 8);
  param_5[0xb] = (char)uVar8;
  uVar8 = (uint)(byte)param_5[10] + (uVar8 >> 8);
  param_5[10] = (char)uVar8;
  uVar8 = (uint)(byte)param_5[9] + (uVar8 >> 8);
  param_5[9] = (char)uVar8;
  uVar8 = (uint)(byte)param_5[8] + (uVar8 >> 8);
  param_5[8] = (char)uVar8;
  uVar8 = (uint)(byte)param_5[7] + (uVar8 >> 8);
  param_5[7] = (char)uVar8;
  uVar8 = (uint)(byte)param_5[6] + (uVar8 >> 8);
  param_5[6] = (char)uVar8;
  uVar8 = (uint)(byte)param_5[5] + (uVar8 >> 8);
  param_5[5] = (char)uVar8;
  uVar8 = (uint)(byte)param_5[4] + (uVar8 >> 8);
  param_5[4] = (char)uVar8;
  uVar8 = (uint)(byte)param_5[3] + (uVar8 >> 8);
  param_5[3] = (char)uVar8;
  uVar8 = (uint)(byte)param_5[2] + (uVar8 >> 8);
  param_5[2] = (char)uVar8;
  iVar3 = (uint)(byte)param_5[1] + (uVar8 >> 8);
  param_5[1] = (char)iVar3;
  *param_5 = *param_5 + (char)((uint)iVar3 >> 8);
  if (((param_3 < 0x20) || (CARRY4(uVar12,(uint)(param_3 - 1)))) || (param_3 - 1 >> 0x20 != 0)) {
LAB_00aa9518:
    uVar10 = param_3;
    uVar8 = uVar12;
LAB_00aa9520:
    do {
      uVar9 = (ulong)uVar8;
      uVar10 = uVar10 - 1;
      *(byte *)((long)param_2 + uVar9) =
           *(byte *)((long)param_6 + uVar9) ^ *(byte *)((long)param_1 + uVar9);
      uVar8 = uVar8 + 1;
    } while (uVar10 != 0);
  }
  else {
    uVar10 = (ulong)uVar12;
    lVar2 = param_3 + uVar10;
    if (((byte *)((long)param_2 + uVar10) < (byte *)((long)param_1 + lVar2) &&
         (byte *)((long)param_1 + uVar10) < (byte *)((long)param_2 + lVar2)) ||
       ((byte *)((long)param_2 + uVar10) < (byte *)((long)param_6 + lVar2) &&
        (byte *)((long)param_6 + uVar10) < (byte *)((long)param_2 + lVar2))) goto LAB_00aa9518;
    uVar9 = param_3 & 0xffffffffffffffe0;
    uVar10 = uVar9;
    uVar8 = uVar12;
    do {
      uVar11 = (ulong)uVar8;
      pbVar5 = (byte *)((long)param_1 + uVar11);
      puVar6 = (undefined8 *)((long)param_6 + uVar11);
      uVar15 = *(undefined8 *)(pbVar5 + 8);
      uVar14 = *(undefined8 *)pbVar5;
      uVar17 = *(undefined8 *)(pbVar5 + 0x18);
      uVar16 = *(undefined8 *)(pbVar5 + 0x10);
      uVar19 = puVar6[1];
      uVar18 = *puVar6;
      uVar21 = puVar6[3];
      uVar20 = puVar6[2];
      uVar10 = uVar10 - 0x20;
      pbVar5 = (byte *)((long)param_2 + uVar11);
      uVar8 = uVar8 + 0x20;
      *(ulong *)(pbVar5 + 8) =
           CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                    CONCAT16((byte)((ulong)uVar19 >> 0x30) ^ (byte)((ulong)uVar15 >> 0x30),
                             CONCAT15((byte)((ulong)uVar19 >> 0x28) ^ (byte)((ulong)uVar15 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                               (byte)((ulong)uVar15 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                        (byte)((ulong)uVar15 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar19 >> 0x10) ^
                                                                 (byte)((ulong)uVar15 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar19 >> 8)
                                                                          ^ (byte)((ulong)uVar15 >>
                                                                                  8),
                                                                          (byte)uVar19 ^
                                                                          (byte)uVar15)))))));
      *(ulong *)pbVar5 =
           CONCAT17((byte)((ulong)uVar18 >> 0x38) ^ (byte)((ulong)uVar14 >> 0x38),
                    CONCAT16((byte)((ulong)uVar18 >> 0x30) ^ (byte)((ulong)uVar14 >> 0x30),
                             CONCAT15((byte)((ulong)uVar18 >> 0x28) ^ (byte)((ulong)uVar14 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                               (byte)((ulong)uVar14 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar18 >> 0x18) ^
                                                        (byte)((ulong)uVar14 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar18 >> 0x10) ^
                                                                 (byte)((ulong)uVar14 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar18 >> 8)
                                                                          ^ (byte)((ulong)uVar14 >>
                                                                                  8),
                                                                          (byte)uVar18 ^
                                                                          (byte)uVar14)))))));
      *(ulong *)(pbVar5 + 0x18) =
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
      *(ulong *)(pbVar5 + 0x10) =
           CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                    CONCAT16((byte)((ulong)uVar20 >> 0x30) ^ (byte)((ulong)uVar16 >> 0x30),
                             CONCAT15((byte)((ulong)uVar20 >> 0x28) ^ (byte)((ulong)uVar16 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                               (byte)((ulong)uVar16 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar20 >> 0x18) ^
                                                        (byte)((ulong)uVar16 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar20 >> 0x10) ^
                                                                 (byte)((ulong)uVar16 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar20 >> 8)
                                                                          ^ (byte)((ulong)uVar16 >>
                                                                                  8),
                                                                          (byte)uVar20 ^
                                                                          (byte)uVar16)))))));
    } while (uVar10 != 0);
    uVar10 = param_3 - uVar9;
    uVar8 = uVar12 + (int)uVar9;
    if (param_3 != uVar9) goto LAB_00aa9520;
  }
  uVar12 = uVar12 + (int)param_3;
LAB_00aa9544:
  *param_7 = uVar12;
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa956c
 */

void CRYPTO_ctr128_encrypt_ctr32
               (byte *param_1,byte *param_2,ulong param_3,undefined8 param_4,char *param_5,
               undefined8 *param_6,uint *param_7,code *param_8)

{
  int iVar1;
  byte *pbVar2;
  undefined8 *puVar3;
  byte bVar4;
  uint uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  uint uVar9;
  ulong uVar10;
  long lVar11;
  uint uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  
  for (uVar5 = *param_7; (uVar12 = uVar5, param_3 != 0 && (uVar12 = 0, uVar5 != 0));
      uVar5 = uVar5 + 1 & 0xf) {
    param_3 = param_3 - 1;
    *param_2 = *(byte *)((long)param_6 + (ulong)uVar5) ^ *param_1;
    param_2 = param_2 + 1;
    param_1 = param_1 + 1;
  }
  uVar5 = (*(uint *)(param_5 + 0xc) & 0xff00ff00) >> 8 | (*(uint *)(param_5 + 0xc) & 0xff00ff) << 8;
  uVar5 = uVar5 >> 0x10 | uVar5 << 0x10;
  for (; 0xf < param_3; param_3 = param_3 + lVar11 * -0x10) {
    uVar6 = param_3 >> 4;
    if (param_3 >> 0x20 != 0) {
      uVar6 = 0x10000000;
    }
    uVar9 = uVar5 + (int)uVar6;
    uVar7 = (ulong)uVar9;
    uVar5 = 0;
    if (uVar6 <= uVar7) {
      uVar7 = 0;
      uVar5 = uVar9;
    }
    lVar11 = uVar6 - uVar7;
    (*param_8)(param_1,param_2,lVar11,param_4,param_5);
    param_5[0xc] = (char)(uVar5 >> 0x18);
    param_5[0xd] = (char)(uVar5 >> 0x10);
    param_5[0xe] = (char)(uVar5 >> 8);
    param_5[0xf] = (char)uVar5;
    if (uVar5 == 0) {
      bVar4 = param_5[0xb];
      param_5[0xb] = (char)(bVar4 + 1);
      uVar9 = (uint)(byte)param_5[10] + (bVar4 + 1 >> 8);
      param_5[10] = (char)uVar9;
      uVar9 = (uint)(byte)param_5[9] + (uVar9 >> 8);
      param_5[9] = (char)uVar9;
      uVar9 = (uint)(byte)param_5[8] + (uVar9 >> 8);
      param_5[8] = (char)uVar9;
      uVar9 = (uint)(byte)param_5[7] + (uVar9 >> 8);
      param_5[7] = (char)uVar9;
      uVar9 = (uint)(byte)param_5[6] + (uVar9 >> 8);
      param_5[6] = (char)uVar9;
      uVar9 = (uint)(byte)param_5[5] + (uVar9 >> 8);
      param_5[5] = (char)uVar9;
      uVar9 = (uint)(byte)param_5[4] + (uVar9 >> 8);
      param_5[4] = (char)uVar9;
      uVar9 = (uint)(byte)param_5[3] + (uVar9 >> 8);
      param_5[3] = (char)uVar9;
      uVar9 = (uint)(byte)param_5[2] + (uVar9 >> 8);
      param_5[2] = (char)uVar9;
      iVar1 = (uint)(byte)param_5[1] + (uVar9 >> 8);
      param_5[1] = (char)iVar1;
      *param_5 = *param_5 + (char)((uint)iVar1 >> 8);
    }
    param_2 = param_2 + lVar11 * 0x10;
    param_1 = param_1 + lVar11 * 0x10;
  }
  if (param_3 == 0) goto LAB_00aa98bc;
  *param_6 = 0;
  param_6[1] = 0;
  (*param_8)(param_6,param_6,1,param_4,param_5);
  iVar1 = uVar5 + 1;
  param_5[0xc] = (char)((uint)iVar1 >> 0x18);
  param_5[0xd] = (char)((uint)iVar1 >> 0x10);
  param_5[0xe] = (char)((uint)iVar1 >> 8);
  param_5[0xf] = (char)iVar1;
  if (iVar1 == 0) {
    bVar4 = param_5[0xb];
    param_5[0xb] = (char)(bVar4 + 1);
    uVar5 = (uint)(byte)param_5[10] + (bVar4 + 1 >> 8);
    param_5[10] = (char)uVar5;
    uVar5 = (uint)(byte)param_5[9] + (uVar5 >> 8);
    param_5[9] = (char)uVar5;
    uVar5 = (uint)(byte)param_5[8] + (uVar5 >> 8);
    param_5[8] = (char)uVar5;
    uVar5 = (uint)(byte)param_5[7] + (uVar5 >> 8);
    param_5[7] = (char)uVar5;
    uVar5 = (uint)(byte)param_5[6] + (uVar5 >> 8);
    param_5[6] = (char)uVar5;
    uVar5 = (uint)(byte)param_5[5] + (uVar5 >> 8);
    param_5[5] = (char)uVar5;
    uVar5 = (uint)(byte)param_5[4] + (uVar5 >> 8);
    param_5[4] = (char)uVar5;
    uVar5 = (uint)(byte)param_5[3] + (uVar5 >> 8);
    param_5[3] = (char)uVar5;
    uVar5 = (uint)(byte)param_5[2] + (uVar5 >> 8);
    param_5[2] = (char)uVar5;
    iVar1 = (uint)(byte)param_5[1] + (uVar5 >> 8);
    param_5[1] = (char)iVar1;
    *param_5 = *param_5 + (char)((uint)iVar1 >> 8);
    if (0x1f < param_3) goto LAB_00aa97dc;
LAB_00aa9890:
    uVar6 = param_3;
    uVar5 = uVar12;
LAB_00aa9898:
    do {
      uVar7 = (ulong)uVar5;
      uVar6 = uVar6 - 1;
      uVar5 = uVar5 + 1;
      param_2[uVar7] = *(byte *)((long)param_6 + uVar7) ^ param_1[uVar7];
    } while (uVar6 != 0);
  }
  else {
    if (param_3 < 0x20) goto LAB_00aa9890;
LAB_00aa97dc:
    if ((CARRY4(uVar12,(uint)(param_3 - 1))) || (param_3 - 1 >> 0x20 != 0)) goto LAB_00aa9890;
    uVar6 = (ulong)uVar12;
    lVar11 = param_3 + uVar6;
    if ((param_2 + uVar6 < param_1 + lVar11 && param_1 + uVar6 < param_2 + lVar11) ||
       (param_2 + uVar6 < (byte *)((long)param_6 + lVar11) &&
        (byte *)((long)param_6 + uVar6) < param_2 + lVar11)) goto LAB_00aa9890;
    uVar8 = param_3 & 0xffffffffffffffe0;
    uVar5 = uVar12 + (int)uVar8;
    uVar6 = param_3 - uVar8;
    uVar7 = uVar8;
    uVar9 = uVar12;
    do {
      uVar10 = (ulong)uVar9;
      pbVar2 = param_1 + uVar10;
      puVar3 = (undefined8 *)((long)param_6 + uVar10);
      uVar14 = *(undefined8 *)(pbVar2 + 8);
      uVar13 = *(undefined8 *)pbVar2;
      uVar16 = *(undefined8 *)(pbVar2 + 0x18);
      uVar15 = *(undefined8 *)(pbVar2 + 0x10);
      uVar18 = puVar3[1];
      uVar17 = *puVar3;
      uVar20 = puVar3[3];
      uVar19 = puVar3[2];
      uVar7 = uVar7 - 0x20;
      pbVar2 = param_2 + uVar10;
      uVar9 = uVar9 + 0x20;
      *(ulong *)(pbVar2 + 8) =
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
      *(ulong *)pbVar2 =
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
      *(ulong *)(pbVar2 + 0x18) =
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
      *(ulong *)(pbVar2 + 0x10) =
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
    } while (uVar7 != 0);
    if (param_3 != uVar8) goto LAB_00aa9898;
  }
  uVar12 = uVar12 + (int)param_3;
LAB_00aa98bc:
  *param_7 = uVar12;
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaab08
 */

undefined8
CRYPTO_gcm128_encrypt_ctr32(long param_1,byte *param_2,byte *param_3,ulong param_4,code *param_5)

{
  long lVar1;
  byte *pbVar2;
  byte *pbVar3;
  undefined8 *puVar4;
  long lVar5;
  byte bVar6;
  uint uVar7;
  ulong uVar8;
  int iVar9;
  ulong uVar10;
  ulong uVar11;
  byte *pbVar12;
  byte *pbVar13;
  undefined8 uVar14;
  uint uVar15;
  uint uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  
  uVar10 = *(ulong *)(param_1 + 0x38) + param_4;
  if (0xfffffffe0 < uVar10) {
    return 0xffffffff;
  }
  if (CARRY8(*(ulong *)(param_1 + 0x38),param_4)) {
    return 0xffffffff;
  }
  uVar14 = *(undefined8 *)(param_1 + 0x180);
  *(ulong *)(param_1 + 0x38) = uVar10;
  if (*(int *)(param_1 + 0x174) == 0) {
    uVar15 = *(uint *)(param_1 + 0x170);
  }
  else {
    if (param_4 == 0) {
      FUN_00aa9de0(param_1 + 0x40,param_1 + 0x60);
      *(undefined4 *)(param_1 + 0x174) = 0;
      return 0;
    }
    uVar15 = 0x10;
    *(undefined8 *)(param_1 + 400) = *(undefined8 *)(param_1 + 0x48);
    *(undefined8 *)(param_1 + 0x188) = *(undefined8 *)(param_1 + 0x40);
    *(undefined4 *)(param_1 + 0x174) = 0;
    *(undefined8 *)(param_1 + 0x40) = 0;
    *(undefined8 *)(param_1 + 0x48) = 0;
  }
  uVar7 = *(uint *)(param_1 + 0xc);
  uVar16 = uVar15 & 0xf;
  if (uVar16 == 0) {
    if ((0xf < param_4) && (uVar15 != 0)) goto LAB_00aaabe4;
  }
  else {
    if (param_4 == 0) goto LAB_00aaae80;
    pbVar12 = param_3;
    pbVar13 = param_2;
    do {
      param_2 = pbVar13 + 1;
      uVar10 = (ulong)uVar15;
      uVar15 = uVar15 + 1;
      bVar6 = *(byte *)(param_1 + 0x10 + (ulong)uVar16) ^ *pbVar13;
      param_4 = param_4 - 1;
      param_3 = pbVar12 + 1;
      *pbVar12 = bVar6;
      uVar16 = uVar16 + 1 & 0xf;
      *(byte *)(param_1 + uVar10 + 0x188) = bVar6;
      if (param_4 == 0) break;
      pbVar12 = param_3;
      pbVar13 = param_2;
    } while (uVar16 != 0);
    if (uVar16 != 0) goto LAB_00aaae80;
LAB_00aaabe4:
    FUN_00aaa048(param_1 + 0x40,param_1 + 0x60,param_1 + 0x188,uVar15);
    uVar15 = 0;
  }
  uVar16 = (uVar7 & 0xff00ff00) >> 8 | (uVar7 & 0xff00ff) << 8;
  uVar16 = uVar16 >> 0x10 | uVar16 << 0x10;
  if (0xbff < param_4) {
    do {
      (*param_5)(param_2,param_3,0xc0,uVar14,param_1);
      uVar16 = uVar16 + 0xc0;
      *(char *)(param_1 + 0xc) = (char)(uVar16 >> 0x18);
      *(char *)(param_1 + 0xd) = (char)(uVar16 >> 0x10);
      *(char *)(param_1 + 0xe) = (char)(uVar16 >> 8);
      *(char *)(param_1 + 0xf) = (char)uVar16;
      FUN_00aaa048(param_1 + 0x40,param_1 + 0x60,param_3,0xc00);
      param_4 = param_4 - 0xc00;
      param_3 = param_3 + 0xc00;
      param_2 = param_2 + 0xc00;
    } while (0xbff < param_4);
  }
  uVar10 = param_4 & 0xfffffffffffffff0;
  if (uVar10 != 0) {
    (*param_5)(param_2,param_3,param_4 >> 4,uVar14,param_1);
    uVar16 = uVar16 + (int)(param_4 >> 4);
    param_2 = param_2 + uVar10;
    param_4 = param_4 - uVar10;
    *(char *)(param_1 + 0xf) = (char)uVar16;
    *(char *)(param_1 + 0xc) = (char)(uVar16 >> 0x18);
    *(char *)(param_1 + 0xd) = (char)(uVar16 >> 0x10);
    *(char *)(param_1 + 0xe) = (char)(uVar16 >> 8);
    FUN_00aaa048(param_1 + 0x40,param_1 + 0x60,param_3,uVar10);
    param_3 = param_3 + uVar10;
  }
  if (param_4 == 0) goto LAB_00aaae80;
  lVar1 = param_1 + 0x10;
  (**(code **)(param_1 + 0x178))(param_1,lVar1,uVar14);
  iVar9 = uVar16 + 1;
  *(char *)(param_1 + 0xc) = (char)((uint)iVar9 >> 0x18);
  *(char *)(param_1 + 0xd) = (char)((uint)iVar9 >> 0x10);
  *(char *)(param_1 + 0xe) = (char)((uint)iVar9 >> 8);
  *(char *)(param_1 + 0xf) = (char)iVar9;
  if (((param_4 < 0x20) || (CARRY4(uVar15,(uint)(param_4 - 1)))) || (param_4 - 1 >> 0x20 != 0)) {
LAB_00aaae44:
    uVar8 = 0;
    uVar10 = param_4;
    uVar16 = uVar15;
LAB_00aaae50:
    do {
      uVar11 = uVar8 & 0xffffffff;
      uVar10 = uVar10 - 1;
      bVar6 = *(byte *)(lVar1 + uVar11) ^ param_2[uVar11];
      uVar8 = (ulong)((int)uVar8 + 1);
      param_3[uVar11] = bVar6;
      *(byte *)(param_1 + (ulong)uVar16 + 0x188) = bVar6;
      uVar16 = uVar16 + 1;
    } while (uVar10 != 0);
  }
  else {
    pbVar13 = (byte *)(param_1 + 0x188 + param_4 + uVar15);
    pbVar2 = param_3 + param_4;
    pbVar3 = (byte *)(param_1 + 0x188 + (ulong)uVar15);
    pbVar12 = (byte *)(param_1 + 0x10);
    if (((param_3 < pbVar13 && pbVar3 < pbVar2) || (param_3 < param_2 + param_4 && param_2 < pbVar2)
        ) || ((param_3 < pbVar12 + param_4 && pbVar12 < pbVar2 ||
              ((pbVar3 < param_2 + param_4 && param_2 < pbVar13 ||
               (pbVar3 < pbVar12 + param_4 && pbVar12 < pbVar13)))))) goto LAB_00aaae44;
    uVar8 = param_4 & 0xffffffffffffffe0;
    uVar10 = 0;
    do {
      uVar11 = uVar10 & 0xffffffe0;
      pbVar12 = param_2 + uVar11;
      uVar17 = *(undefined8 *)(pbVar12 + 8);
      uVar14 = *(undefined8 *)pbVar12;
      uVar19 = *(undefined8 *)(pbVar12 + 0x18);
      uVar18 = *(undefined8 *)(pbVar12 + 0x10);
      puVar4 = (undefined8 *)(lVar1 + uVar11);
      uVar21 = puVar4[1];
      uVar20 = *puVar4;
      uVar23 = puVar4[3];
      uVar22 = puVar4[2];
      iVar9 = (int)uVar10;
      uVar10 = uVar10 + 0x20;
      lVar5 = param_1 + (ulong)(uVar15 + iVar9);
      pbVar12 = param_3 + uVar11;
      uVar14 = CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar14 >> 0x38),
                        CONCAT16((byte)((ulong)uVar20 >> 0x30) ^ (byte)((ulong)uVar14 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                          (byte)((ulong)uVar14 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                   (byte)((ulong)uVar14 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar20 >> 0x18) ^
                                                            (byte)((ulong)uVar14 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar20 >> 0x10) ^
                                                                     (byte)((ulong)uVar14 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar20
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar14
                                                                                    >> 8),
                                                                              (byte)uVar20 ^
                                                                              (byte)uVar14)))))));
      uVar17 = CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                        CONCAT16((byte)((ulong)uVar21 >> 0x30) ^ (byte)((ulong)uVar17 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar21 >> 0x28) ^
                                          (byte)((ulong)uVar17 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar21 >> 0x20) ^
                                                   (byte)((ulong)uVar17 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar21 >> 0x18) ^
                                                            (byte)((ulong)uVar17 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar21 >> 0x10) ^
                                                                     (byte)((ulong)uVar17 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar21
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar17
                                                                                    >> 8),
                                                                              (byte)uVar21 ^
                                                                              (byte)uVar17)))))));
      uVar18 = CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                        CONCAT16((byte)((ulong)uVar22 >> 0x30) ^ (byte)((ulong)uVar18 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar22 >> 0x28) ^
                                          (byte)((ulong)uVar18 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar22 >> 0x20) ^
                                                   (byte)((ulong)uVar18 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar22 >> 0x18) ^
                                                            (byte)((ulong)uVar18 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar22 >> 0x10) ^
                                                                     (byte)((ulong)uVar18 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar22
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar18
                                                                                    >> 8),
                                                                              (byte)uVar22 ^
                                                                              (byte)uVar18)))))));
      uVar19 = CONCAT17((byte)((ulong)uVar23 >> 0x38) ^ (byte)((ulong)uVar19 >> 0x38),
                        CONCAT16((byte)((ulong)uVar23 >> 0x30) ^ (byte)((ulong)uVar19 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar23 >> 0x28) ^
                                          (byte)((ulong)uVar19 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar23 >> 0x20) ^
                                                   (byte)((ulong)uVar19 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar23 >> 0x18) ^
                                                            (byte)((ulong)uVar19 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar23 >> 0x10) ^
                                                                     (byte)((ulong)uVar19 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar23
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar19
                                                                                    >> 8),
                                                                              (byte)uVar23 ^
                                                                              (byte)uVar19)))))));
      *(undefined8 *)(pbVar12 + 8) = uVar17;
      *(undefined8 *)pbVar12 = uVar14;
      *(undefined8 *)(pbVar12 + 0x18) = uVar19;
      *(undefined8 *)(pbVar12 + 0x10) = uVar18;
      *(undefined8 *)(lVar5 + 400) = uVar17;
      *(undefined8 *)(lVar5 + 0x188) = uVar14;
      *(undefined8 *)(lVar5 + 0x1a0) = uVar19;
      *(undefined8 *)(lVar5 + 0x198) = uVar18;
    } while (uVar8 != uVar10);
    uVar10 = param_4 - uVar8;
    uVar16 = uVar15 + (int)uVar8;
    if (param_4 != uVar8) goto LAB_00aaae50;
  }
  uVar15 = uVar15 + (int)param_4;
LAB_00aaae80:
  *(uint *)(param_1 + 0x170) = uVar15;
  return 0;
}


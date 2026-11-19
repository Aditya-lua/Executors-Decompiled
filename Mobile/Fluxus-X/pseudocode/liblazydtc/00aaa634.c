/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaa634
 */

undefined8 CRYPTO_gcm128_decrypt(long param_1,ulong *param_2,ulong *param_3,ulong param_4)

{
  ulong *puVar1;
  ulong *puVar2;
  ulong *puVar3;
  byte *pbVar4;
  long lVar5;
  undefined8 *puVar6;
  code *pcVar7;
  uint uVar8;
  byte bVar9;
  bool bVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  uint uVar14;
  ulong uVar15;
  ulong *puVar16;
  ulong *puVar17;
  uint uVar18;
  long lVar19;
  int iVar20;
  int iVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  
  uVar15 = *(ulong *)(param_1 + 0x38) + param_4;
  if (0xfffffffe0 < uVar15) {
    return 0xffffffff;
  }
  if (CARRY8(*(ulong *)(param_1 + 0x38),param_4)) {
    return 0xffffffff;
  }
  pcVar7 = *(code **)(param_1 + 0x178);
  uVar22 = *(undefined8 *)(param_1 + 0x180);
  *(ulong *)(param_1 + 0x38) = uVar15;
  if (*(int *)(param_1 + 0x174) == 0) {
    uVar14 = *(uint *)(param_1 + 0x170);
  }
  else {
    if (param_4 == 0) {
      FUN_00aa9de0(param_1 + 0x40,param_1 + 0x60);
      *(undefined4 *)(param_1 + 0x174) = 0;
      return 0;
    }
    uVar14 = 0x10;
    *(undefined8 *)(param_1 + 400) = *(undefined8 *)(param_1 + 0x48);
    *(undefined8 *)(param_1 + 0x188) = *(undefined8 *)(param_1 + 0x40);
    *(undefined4 *)(param_1 + 0x174) = 0;
    *(undefined8 *)(param_1 + 0x40) = 0;
    *(undefined8 *)(param_1 + 0x48) = 0;
  }
  uVar8 = *(uint *)(param_1 + 0xc);
  uVar18 = uVar14 & 0xf;
  if (uVar18 == 0) {
    if ((0xf < param_4) && (uVar14 != 0)) {
      FUN_00aaa048(param_1 + 0x40,param_1 + 0x60,param_1 + 0x188,uVar14);
      uVar14 = 0;
    }
  }
  else {
    if (param_4 == 0) {
LAB_00aaa708:
      *(uint *)(param_1 + 0x170) = uVar14;
      return 0;
    }
    puVar16 = param_3;
    puVar17 = param_2;
    uVar15 = param_4;
    do {
      uVar11 = (ulong)uVar18;
      param_2 = (ulong *)((long)puVar17 + 1);
      uVar13 = *puVar17;
      uVar12 = (ulong)uVar14;
      uVar14 = uVar14 + 1;
      param_4 = uVar15 - 1;
      *(byte *)(param_1 + uVar12 + 0x188) = (byte)uVar13;
      uVar18 = uVar18 + 1 & 0xf;
      param_3 = (ulong *)((long)puVar16 + 1);
      *(byte *)puVar16 = *(byte *)(param_1 + 0x10 + uVar11) ^ (byte)uVar13;
      if (uVar18 == 0) break;
      bVar10 = uVar15 != 1;
      puVar16 = param_3;
      puVar17 = param_2;
      uVar15 = param_4;
    } while (bVar10);
    if (uVar18 != 0) goto LAB_00aaa708;
    FUN_00aaa048(param_1 + 0x40,param_1 + 0x60,param_1 + 0x188,uVar14);
    uVar14 = 0;
  }
  uVar18 = (uVar8 & 0xff00ff00) >> 8 | (uVar8 & 0xff00ff) << 8;
  uVar18 = uVar18 >> 0x10 | uVar18 << 0x10;
  if (0xbff < param_4) {
    iVar20 = uVar18 + 1;
    puVar16 = param_2;
    do {
      FUN_00aaa048(param_1 + 0x40,param_1 + 0x60,puVar16,0xc00);
      lVar19 = 0;
      param_2 = puVar16 + 0x180;
      iVar21 = iVar20;
      do {
        puVar17 = (ulong *)((long)param_3 + lVar19);
        puVar1 = (ulong *)((long)puVar16 + lVar19);
        (*pcVar7)(param_1,param_1 + 0x10,uVar22);
        *(char *)(param_1 + 0xc) = (char)((uint)iVar21 >> 0x18);
        *(char *)(param_1 + 0xf) = (char)iVar21;
        *(char *)(param_1 + 0xd) = (char)((uint)iVar21 >> 0x10);
        *(char *)(param_1 + 0xe) = (char)((uint)iVar21 >> 8);
        lVar19 = lVar19 + 0x10;
        iVar21 = iVar21 + 1;
        *puVar17 = *(ulong *)(param_1 + 0x10) ^ *puVar1;
        puVar17[1] = *(ulong *)(param_1 + 0x18) ^ puVar1[1];
      } while (lVar19 != 0xc00);
      param_4 = param_4 - 0xc00;
      param_3 = param_3 + 0x180;
      uVar18 = uVar18 + 0xc0;
      iVar20 = iVar20 + 0xc0;
      puVar16 = param_2;
    } while (0xbff < param_4);
  }
  puVar16 = param_2;
  if ((param_4 & 0xfffffffffffffff0) != 0) {
    FUN_00aaa048(param_1 + 0x40,param_1 + 0x60,param_2,param_4 & 0xfffffffffffffff0);
    uVar15 = param_4 - 0x10;
    if (0xf < param_4) {
      iVar20 = uVar18 + (int)(uVar15 >> 4);
      lVar19 = (uVar15 & 0xfffffffffffffff0) + 0x10;
      puVar16 = (ulong *)((long)param_2 + lVar19);
      puVar17 = param_3;
      do {
        uVar18 = uVar18 + 1;
        (*pcVar7)(param_1,param_1 + 0x10,uVar22);
        *(char *)(param_1 + 0xc) = (char)(uVar18 >> 0x18);
        *(char *)(param_1 + 0xf) = (char)uVar18;
        *(char *)(param_1 + 0xd) = (char)(uVar18 >> 0x10);
        *(char *)(param_1 + 0xe) = (char)(uVar18 >> 8);
        param_4 = param_4 - 0x10;
        *puVar17 = *(ulong *)(param_1 + 0x10) ^ *param_2;
        puVar1 = param_2 + 1;
        param_2 = param_2 + 2;
        puVar17[1] = *(ulong *)(param_1 + 0x18) ^ *puVar1;
        puVar17 = puVar17 + 2;
      } while (0xf < param_4);
      param_3 = (ulong *)((long)param_3 + lVar19);
      param_4 = uVar15 - (uVar15 & 0xfffffffffffffff0);
      uVar18 = iVar20 + 1;
    }
  }
  if (param_4 == 0) goto LAB_00aaaae0;
  lVar19 = param_1 + 0x10;
  (*pcVar7)(param_1,lVar19,uVar22);
  iVar20 = uVar18 + 1;
  *(char *)(param_1 + 0xc) = (char)((uint)iVar20 >> 0x18);
  *(char *)(param_1 + 0xd) = (char)((uint)iVar20 >> 0x10);
  *(char *)(param_1 + 0xe) = (char)((uint)iVar20 >> 8);
  *(char *)(param_1 + 0xf) = (char)iVar20;
  uVar15 = param_4;
  uVar18 = uVar14;
  if (param_4 < 0x20) {
    uVar12 = 0;
LAB_00aaaab0:
    do {
      uVar13 = uVar12 & 0xffffffff;
      bVar9 = *(byte *)((long)puVar16 + uVar13);
      uVar15 = uVar15 - 1;
      *(byte *)(param_1 + (ulong)uVar18 + 0x188) = bVar9;
      uVar12 = (ulong)((int)uVar12 + 1);
      *(byte *)((long)param_3 + uVar13) = *(byte *)(lVar19 + uVar13) ^ bVar9;
      uVar18 = uVar18 + 1;
    } while (uVar15 != 0);
  }
  else {
    if ((CARRY4(uVar14,(uint)(param_4 - 1))) || (param_4 - 1 >> 0x20 != 0)) {
LAB_00aaaaa4:
      uVar12 = 0;
      goto LAB_00aaaab0;
    }
    puVar1 = (ulong *)((long)param_3 + param_4);
    puVar2 = (ulong *)(param_1 + 0x188 + (ulong)uVar14);
    puVar3 = (ulong *)(param_1 + 0x188 + param_4 + uVar14);
    puVar17 = (ulong *)(param_1 + 0x10);
    if (((puVar2 < puVar1 && param_3 < puVar3) ||
        (((puVar2 < (ulong *)((long)puVar16 + param_4) && puVar16 < puVar3 ||
          (puVar2 < (ulong *)((long)puVar17 + param_4) && puVar17 < puVar3)) ||
         (param_3 < (ulong *)((long)puVar16 + param_4) && puVar16 < puVar1)))) ||
       (param_3 < (ulong *)((long)puVar17 + param_4) && puVar17 < puVar1)) goto LAB_00aaaaa4;
    uVar12 = param_4 & 0xffffffffffffffe0;
    uVar15 = 0;
    do {
      uVar13 = uVar15 & 0xffffffe0;
      pbVar4 = (byte *)((long)puVar16 + uVar13);
      uVar23 = *(undefined8 *)(pbVar4 + 8);
      uVar22 = *(undefined8 *)pbVar4;
      uVar25 = *(undefined8 *)(pbVar4 + 0x18);
      uVar24 = *(undefined8 *)(pbVar4 + 0x10);
      lVar5 = param_1 + (ulong)(uVar14 + (int)uVar15);
      *(undefined8 *)(lVar5 + 400) = uVar23;
      *(undefined8 *)(lVar5 + 0x188) = uVar22;
      puVar6 = (undefined8 *)(lVar19 + uVar13);
      *(undefined8 *)(lVar5 + 0x1a0) = uVar25;
      *(undefined8 *)(lVar5 + 0x198) = uVar24;
      uVar27 = puVar6[1];
      uVar26 = *puVar6;
      uVar29 = puVar6[3];
      uVar28 = puVar6[2];
      uVar15 = uVar15 + 0x20;
      pbVar4 = (byte *)((long)param_3 + uVar13);
      *(ulong *)(pbVar4 + 8) =
           CONCAT17((byte)((ulong)uVar27 >> 0x38) ^ (byte)((ulong)uVar23 >> 0x38),
                    CONCAT16((byte)((ulong)uVar27 >> 0x30) ^ (byte)((ulong)uVar23 >> 0x30),
                             CONCAT15((byte)((ulong)uVar27 >> 0x28) ^ (byte)((ulong)uVar23 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar27 >> 0x20) ^
                                               (byte)((ulong)uVar23 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar27 >> 0x18) ^
                                                        (byte)((ulong)uVar23 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar27 >> 0x10) ^
                                                                 (byte)((ulong)uVar23 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar27 >> 8)
                                                                          ^ (byte)((ulong)uVar23 >>
                                                                                  8),
                                                                          (byte)uVar27 ^
                                                                          (byte)uVar23)))))));
      *(ulong *)pbVar4 =
           CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                    CONCAT16((byte)((ulong)uVar26 >> 0x30) ^ (byte)((ulong)uVar22 >> 0x30),
                             CONCAT15((byte)((ulong)uVar26 >> 0x28) ^ (byte)((ulong)uVar22 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar26 >> 0x20) ^
                                               (byte)((ulong)uVar22 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar26 >> 0x18) ^
                                                        (byte)((ulong)uVar22 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar26 >> 0x10) ^
                                                                 (byte)((ulong)uVar22 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar26 >> 8)
                                                                          ^ (byte)((ulong)uVar22 >>
                                                                                  8),
                                                                          (byte)uVar26 ^
                                                                          (byte)uVar22)))))));
      *(ulong *)(pbVar4 + 0x18) =
           CONCAT17((byte)((ulong)uVar29 >> 0x38) ^ (byte)((ulong)uVar25 >> 0x38),
                    CONCAT16((byte)((ulong)uVar29 >> 0x30) ^ (byte)((ulong)uVar25 >> 0x30),
                             CONCAT15((byte)((ulong)uVar29 >> 0x28) ^ (byte)((ulong)uVar25 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar29 >> 0x20) ^
                                               (byte)((ulong)uVar25 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar29 >> 0x18) ^
                                                        (byte)((ulong)uVar25 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar29 >> 0x10) ^
                                                                 (byte)((ulong)uVar25 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar29 >> 8)
                                                                          ^ (byte)((ulong)uVar25 >>
                                                                                  8),
                                                                          (byte)uVar29 ^
                                                                          (byte)uVar25)))))));
      *(ulong *)(pbVar4 + 0x10) =
           CONCAT17((byte)((ulong)uVar28 >> 0x38) ^ (byte)((ulong)uVar24 >> 0x38),
                    CONCAT16((byte)((ulong)uVar28 >> 0x30) ^ (byte)((ulong)uVar24 >> 0x30),
                             CONCAT15((byte)((ulong)uVar28 >> 0x28) ^ (byte)((ulong)uVar24 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar28 >> 0x20) ^
                                               (byte)((ulong)uVar24 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar28 >> 0x18) ^
                                                        (byte)((ulong)uVar24 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar28 >> 0x10) ^
                                                                 (byte)((ulong)uVar24 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar28 >> 8)
                                                                          ^ (byte)((ulong)uVar24 >>
                                                                                  8),
                                                                          (byte)uVar28 ^
                                                                          (byte)uVar24)))))));
    } while (uVar12 != uVar15);
    uVar15 = param_4 - uVar12;
    uVar18 = uVar14 + (int)uVar12;
    if (param_4 != uVar12) goto LAB_00aaaab0;
  }
  uVar14 = uVar14 + (int)param_4;
LAB_00aaaae0:
  *(uint *)(param_1 + 0x170) = uVar14;
  return 0;
}


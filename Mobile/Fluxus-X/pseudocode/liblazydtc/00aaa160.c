/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaa160
 */

undefined8 CRYPTO_gcm128_encrypt(long param_1,ulong *param_2,ulong *param_3,ulong param_4)

{
  ulong *puVar1;
  ulong *puVar2;
  byte *pbVar3;
  undefined8 *puVar4;
  long lVar5;
  byte bVar6;
  code *pcVar7;
  uint uVar8;
  bool bVar9;
  ulong uVar10;
  ulong uVar11;
  int iVar12;
  ulong uVar13;
  uint uVar14;
  ulong *puVar15;
  ulong *puVar16;
  uint uVar17;
  int iVar18;
  long lVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  
  uVar13 = *(ulong *)(param_1 + 0x38) + param_4;
  if (0xfffffffe0 < uVar13) {
    return 0xffffffff;
  }
  if (CARRY8(*(ulong *)(param_1 + 0x38),param_4)) {
    return 0xffffffff;
  }
  pcVar7 = *(code **)(param_1 + 0x178);
  uVar20 = *(undefined8 *)(param_1 + 0x180);
  *(ulong *)(param_1 + 0x38) = uVar13;
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
  uVar17 = uVar14 & 0xf;
  if (uVar17 == 0) {
    if ((0xf < param_4) && (uVar14 != 0)) {
      FUN_00aaa048(param_1 + 0x40,param_1 + 0x60,param_1 + 0x188,uVar14);
      uVar14 = 0;
    }
  }
  else {
    if (param_4 == 0) {
LAB_00aaa238:
      *(uint *)(param_1 + 0x170) = uVar14;
      return 0;
    }
    puVar15 = param_2;
    puVar16 = param_3;
    uVar13 = param_4;
    do {
      param_2 = (ulong *)((long)puVar15 + 1);
      uVar10 = (ulong)uVar14;
      bVar6 = *(byte *)(param_1 + 0x10 + (ulong)uVar17) ^ (byte)*puVar15;
      uVar14 = uVar14 + 1;
      uVar17 = uVar17 + 1 & 0xf;
      param_3 = (ulong *)((long)puVar16 + 1);
      *(byte *)puVar16 = bVar6;
      param_4 = uVar13 - 1;
      *(byte *)(param_1 + uVar10 + 0x188) = bVar6;
      if (uVar17 == 0) break;
      bVar9 = uVar13 != 1;
      puVar15 = param_2;
      puVar16 = param_3;
      uVar13 = param_4;
    } while (bVar9);
    if (uVar17 != 0) goto LAB_00aaa238;
    FUN_00aaa048(param_1 + 0x40,param_1 + 0x60,param_1 + 0x188,uVar14);
    uVar14 = 0;
  }
  uVar17 = (uVar8 & 0xff00ff00) >> 8 | (uVar8 & 0xff00ff) << 8;
  uVar17 = uVar17 >> 0x10 | uVar17 << 0x10;
  if (0xbff < param_4) {
    iVar12 = uVar17 + 1;
    puVar15 = param_3;
    do {
      lVar19 = 0;
      param_3 = puVar15 + 0x180;
      iVar18 = iVar12;
      do {
        puVar16 = (ulong *)((long)puVar15 + lVar19);
        puVar1 = (ulong *)((long)param_2 + lVar19);
        (*pcVar7)(param_1,param_1 + 0x10,uVar20);
        *(char *)(param_1 + 0xc) = (char)((uint)iVar18 >> 0x18);
        *(char *)(param_1 + 0xf) = (char)iVar18;
        *(char *)(param_1 + 0xd) = (char)((uint)iVar18 >> 0x10);
        *(char *)(param_1 + 0xe) = (char)((uint)iVar18 >> 8);
        lVar19 = lVar19 + 0x10;
        iVar18 = iVar18 + 1;
        *puVar16 = *(ulong *)(param_1 + 0x10) ^ *puVar1;
        puVar16[1] = *(ulong *)(param_1 + 0x18) ^ puVar1[1];
      } while (lVar19 != 0xc00);
      param_2 = param_2 + 0x180;
      uVar17 = uVar17 + 0xc0;
      FUN_00aaa048(param_1 + 0x40,param_1 + 0x60,puVar15,0xc00);
      param_4 = param_4 - 0xc00;
      iVar12 = iVar12 + 0xc0;
      puVar15 = param_3;
    } while (0xbff < param_4);
  }
  uVar13 = param_4 & 0xfffffffffffffff0;
  if (uVar13 != 0) {
    uVar10 = param_4 - 0x10;
    puVar15 = param_2;
    if (0xf < param_4) {
      lVar19 = (uVar10 & 0xfffffffffffffff0) + 0x10;
      iVar12 = uVar17 + (int)(uVar10 >> 4);
      puVar15 = (ulong *)((long)param_2 + lVar19);
      puVar16 = param_3;
      do {
        uVar17 = uVar17 + 1;
        (*pcVar7)(param_1,param_1 + 0x10,uVar20);
        *(char *)(param_1 + 0xc) = (char)(uVar17 >> 0x18);
        *(char *)(param_1 + 0xf) = (char)uVar17;
        *(char *)(param_1 + 0xd) = (char)(uVar17 >> 0x10);
        *(char *)(param_1 + 0xe) = (char)(uVar17 >> 8);
        param_4 = param_4 - 0x10;
        *puVar16 = *(ulong *)(param_1 + 0x10) ^ *param_2;
        puVar1 = param_2 + 1;
        param_2 = param_2 + 2;
        puVar16[1] = *(ulong *)(param_1 + 0x18) ^ *puVar1;
        puVar16 = puVar16 + 2;
      } while (0xf < param_4);
      param_3 = (ulong *)((long)param_3 + lVar19);
      param_4 = uVar10 - (uVar10 & 0xfffffffffffffff0);
      uVar17 = iVar12 + 1;
    }
    FUN_00aaa048(param_1 + 0x40,param_1 + 0x60,(long)param_3 - uVar13,uVar13);
    param_2 = puVar15;
  }
  if (param_4 == 0) goto LAB_00aaa60c;
  lVar19 = param_1 + 0x10;
  (*pcVar7)(param_1,lVar19,uVar20);
  iVar12 = uVar17 + 1;
  *(char *)(param_1 + 0xc) = (char)((uint)iVar12 >> 0x18);
  *(char *)(param_1 + 0xd) = (char)((uint)iVar12 >> 0x10);
  *(char *)(param_1 + 0xe) = (char)((uint)iVar12 >> 8);
  *(char *)(param_1 + 0xf) = (char)iVar12;
  uVar13 = param_4;
  uVar17 = uVar14;
  if (param_4 < 0x20) {
    uVar10 = 0;
LAB_00aaa5dc:
    do {
      uVar11 = uVar10 & 0xffffffff;
      uVar13 = uVar13 - 1;
      bVar6 = *(byte *)(lVar19 + uVar11) ^ *(byte *)((long)param_2 + uVar11);
      uVar10 = (ulong)((int)uVar10 + 1);
      *(byte *)((long)param_3 + uVar11) = bVar6;
      *(byte *)(param_1 + (ulong)uVar17 + 0x188) = bVar6;
      uVar17 = uVar17 + 1;
    } while (uVar13 != 0);
  }
  else {
    if ((CARRY4(uVar14,(uint)(param_4 - 1))) || (param_4 - 1 >> 0x20 != 0)) {
LAB_00aaa5d0:
      uVar10 = 0;
      goto LAB_00aaa5dc;
    }
    puVar16 = (ulong *)(param_1 + 0x188 + param_4 + uVar14);
    puVar1 = (ulong *)((long)param_3 + param_4);
    puVar2 = (ulong *)(param_1 + 0x188 + (ulong)uVar14);
    puVar15 = (ulong *)(param_1 + 0x10);
    if (((param_3 < puVar16 && puVar2 < puVar1) ||
        (((param_3 < (ulong *)((long)param_2 + param_4) && param_2 < puVar1 ||
          (param_3 < (ulong *)((long)puVar15 + param_4) && puVar15 < puVar1)) ||
         (puVar2 < (ulong *)((long)param_2 + param_4) && param_2 < puVar16)))) ||
       (puVar2 < (ulong *)((long)puVar15 + param_4) && puVar15 < puVar16)) goto LAB_00aaa5d0;
    uVar10 = param_4 & 0xffffffffffffffe0;
    uVar13 = 0;
    do {
      uVar11 = uVar13 & 0xffffffe0;
      pbVar3 = (byte *)((long)param_2 + uVar11);
      uVar21 = *(undefined8 *)(pbVar3 + 8);
      uVar20 = *(undefined8 *)pbVar3;
      uVar23 = *(undefined8 *)(pbVar3 + 0x18);
      uVar22 = *(undefined8 *)(pbVar3 + 0x10);
      puVar4 = (undefined8 *)(lVar19 + uVar11);
      uVar25 = puVar4[1];
      uVar24 = *puVar4;
      uVar27 = puVar4[3];
      uVar26 = puVar4[2];
      iVar12 = (int)uVar13;
      uVar13 = uVar13 + 0x20;
      lVar5 = param_1 + (ulong)(uVar14 + iVar12);
      pbVar3 = (byte *)((long)param_3 + uVar11);
      uVar20 = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar20 >> 0x38),
                        CONCAT16((byte)((ulong)uVar24 >> 0x30) ^ (byte)((ulong)uVar20 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                          (byte)((ulong)uVar20 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                   (byte)((ulong)uVar20 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar24 >> 0x18) ^
                                                            (byte)((ulong)uVar20 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar24 >> 0x10) ^
                                                                     (byte)((ulong)uVar20 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar24
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar20
                                                                                    >> 8),
                                                                              (byte)uVar24 ^
                                                                              (byte)uVar20)))))));
      uVar21 = CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ (byte)((ulong)uVar21 >> 0x38),
                        CONCAT16((byte)((ulong)uVar25 >> 0x30) ^ (byte)((ulong)uVar21 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar25 >> 0x28) ^
                                          (byte)((ulong)uVar21 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar25 >> 0x20) ^
                                                   (byte)((ulong)uVar21 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar25 >> 0x18) ^
                                                            (byte)((ulong)uVar21 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar25 >> 0x10) ^
                                                                     (byte)((ulong)uVar21 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar25
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar21
                                                                                    >> 8),
                                                                              (byte)uVar25 ^
                                                                              (byte)uVar21)))))));
      uVar22 = CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                        CONCAT16((byte)((ulong)uVar26 >> 0x30) ^ (byte)((ulong)uVar22 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar26 >> 0x28) ^
                                          (byte)((ulong)uVar22 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar26 >> 0x20) ^
                                                   (byte)((ulong)uVar22 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar26 >> 0x18) ^
                                                            (byte)((ulong)uVar22 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar26 >> 0x10) ^
                                                                     (byte)((ulong)uVar22 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar26
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar22
                                                                                    >> 8),
                                                                              (byte)uVar26 ^
                                                                              (byte)uVar22)))))));
      uVar23 = CONCAT17((byte)((ulong)uVar27 >> 0x38) ^ (byte)((ulong)uVar23 >> 0x38),
                        CONCAT16((byte)((ulong)uVar27 >> 0x30) ^ (byte)((ulong)uVar23 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar27 >> 0x28) ^
                                          (byte)((ulong)uVar23 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar27 >> 0x20) ^
                                                   (byte)((ulong)uVar23 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar27 >> 0x18) ^
                                                            (byte)((ulong)uVar23 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar27 >> 0x10) ^
                                                                     (byte)((ulong)uVar23 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar27
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar23
                                                                                    >> 8),
                                                                              (byte)uVar27 ^
                                                                              (byte)uVar23)))))));
      *(undefined8 *)(pbVar3 + 8) = uVar21;
      *(undefined8 *)pbVar3 = uVar20;
      *(undefined8 *)(pbVar3 + 0x18) = uVar23;
      *(undefined8 *)(pbVar3 + 0x10) = uVar22;
      *(undefined8 *)(lVar5 + 400) = uVar21;
      *(undefined8 *)(lVar5 + 0x188) = uVar20;
      *(undefined8 *)(lVar5 + 0x1a0) = uVar23;
      *(undefined8 *)(lVar5 + 0x198) = uVar22;
    } while (uVar10 != uVar13);
    uVar13 = param_4 - uVar10;
    uVar17 = uVar14 + (int)uVar10;
    if (param_4 != uVar10) goto LAB_00aaa5dc;
  }
  uVar14 = uVar14 + (int)param_4;
LAB_00aaa60c:
  *(uint *)(param_1 + 0x170) = uVar14;
  return 0;
}


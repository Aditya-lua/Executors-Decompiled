/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa9a6c
 */

void CRYPTO_gcm128_setiv(undefined8 *param_1,byte *param_2,ulong param_3)

{
  uint uVar1;
  bool bVar2;
  byte bVar3;
  byte bVar4;
  byte bVar5;
  byte bVar6;
  byte bVar7;
  byte bVar8;
  undefined8 uVar9;
  long lVar10;
  byte bVar11;
  ulong uVar12;
  byte bVar13;
  byte *pbVar14;
  byte bVar15;
  undefined8 *puVar16;
  byte *pbVar17;
  byte bVar18;
  ulong uVar19;
  byte bVar20;
  byte bVar21;
  byte bVar22;
  byte bVar23;
  byte bVar24;
  byte bVar25;
  uint uVar26;
  int iVar27;
  undefined8 *puVar28;
  ulong uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  
  param_1[0x2e] = 0;
  param_1[6] = 0;
  param_1[7] = 0;
  if (param_3 == 0xc) {
    iVar27 = 2;
    *(undefined4 *)(param_1 + 1) = *(undefined4 *)(param_2 + 8);
    uVar9 = *(undefined8 *)param_2;
    *(undefined4 *)((long)param_1 + 0xc) = 0x1000000;
    *param_1 = uVar9;
    goto LAB_00aa9d94;
  }
  puVar28 = param_1 + 8;
  *puVar28 = 0;
  uVar12 = param_3 - 0x10;
  param_1[9] = 0;
  uVar29 = param_3;
  if (0xf < param_3) {
    bVar8 = 0;
    bVar11 = 0;
    bVar13 = 0;
    bVar15 = 0;
    bVar18 = 0;
    bVar20 = 0;
    bVar21 = 0;
    bVar22 = 0;
    bVar23 = 0;
    bVar24 = 0;
    bVar25 = 0;
    bVar3 = 0;
    bVar4 = 0;
    bVar5 = 0;
    bVar6 = 0;
    bVar7 = 0;
    pbVar14 = param_2 + (uVar12 & 0xfffffffffffffff0) + 0x10;
    uVar29 = uVar12;
    while( true ) {
      *(byte *)(param_1 + 8) = bVar7 ^ *param_2;
      *(byte *)((long)param_1 + 0x41) = bVar6 ^ param_2[1];
      *(byte *)((long)param_1 + 0x42) = bVar5 ^ param_2[2];
      *(byte *)((long)param_1 + 0x43) = bVar4 ^ param_2[3];
      *(byte *)((long)param_1 + 0x44) = bVar3 ^ param_2[4];
      *(byte *)((long)param_1 + 0x45) = bVar25 ^ param_2[5];
      *(byte *)((long)param_1 + 0x46) = bVar24 ^ param_2[6];
      *(byte *)((long)param_1 + 0x47) = bVar23 ^ param_2[7];
      *(byte *)(param_1 + 9) = bVar22 ^ param_2[8];
      *(byte *)((long)param_1 + 0x49) = bVar21 ^ param_2[9];
      *(byte *)((long)param_1 + 0x4a) = bVar20 ^ param_2[10];
      *(byte *)((long)param_1 + 0x4b) = bVar18 ^ param_2[0xb];
      *(byte *)((long)param_1 + 0x4c) = bVar15 ^ param_2[0xc];
      *(byte *)((long)param_1 + 0x4d) = bVar13 ^ param_2[0xd];
      *(byte *)((long)param_1 + 0x4e) = bVar11 ^ param_2[0xe];
      *(byte *)((long)param_1 + 0x4f) = bVar8 ^ param_2[0xf];
      FUN_00aa9de0(puVar28,param_1 + 0xc);
      bVar2 = uVar29 < 0x10;
      uVar29 = uVar29 - 0x10;
      if (bVar2) break;
      bVar7 = *(byte *)(param_1 + 8);
      bVar6 = *(byte *)((long)param_1 + 0x41);
      bVar5 = *(byte *)((long)param_1 + 0x42);
      bVar4 = *(byte *)((long)param_1 + 0x43);
      bVar3 = *(byte *)((long)param_1 + 0x44);
      bVar25 = *(byte *)((long)param_1 + 0x45);
      bVar24 = *(byte *)((long)param_1 + 0x46);
      bVar23 = *(byte *)((long)param_1 + 0x47);
      bVar22 = *(byte *)(param_1 + 9);
      bVar21 = *(byte *)((long)param_1 + 0x49);
      bVar20 = *(byte *)((long)param_1 + 0x4a);
      bVar18 = *(byte *)((long)param_1 + 0x4b);
      bVar15 = *(byte *)((long)param_1 + 0x4c);
      bVar13 = *(byte *)((long)param_1 + 0x4d);
      bVar11 = *(byte *)((long)param_1 + 0x4e);
      bVar8 = *(byte *)((long)param_1 + 0x4f);
      param_2 = param_2 + 0x10;
    }
    param_2 = pbVar14;
    uVar29 = uVar12 - (uVar12 & 0xfffffffffffffff0);
  }
  if (uVar29 != 0) {
    uVar12 = 0;
    if ((uVar29 < 0x20) ||
       ((param_1 + 8 < param_2 + uVar29 &&
        (uVar12 = 0, param_2 < (byte *)((long)(param_1 + 8) + uVar29))))) {
LAB_00aa9cb8:
      lVar10 = uVar29 - uVar12;
      pbVar14 = param_2 + uVar12;
      pbVar17 = (byte *)((long)param_1 + uVar12 + 0x40);
      do {
        lVar10 = lVar10 + -1;
        *pbVar17 = *pbVar17 ^ *pbVar14;
        pbVar14 = pbVar14 + 1;
        pbVar17 = pbVar17 + 1;
      } while (lVar10 != 0);
    }
    else {
      uVar12 = uVar29 & 0xffffffffffffffe0;
      pbVar14 = param_2 + 0x10;
      puVar16 = param_1 + 10;
      uVar19 = uVar12;
      do {
        uVar30 = *(undefined8 *)(pbVar14 + -8);
        uVar9 = *(undefined8 *)(pbVar14 + -0x10);
        uVar32 = *(undefined8 *)(pbVar14 + 8);
        uVar31 = *(undefined8 *)pbVar14;
        uVar34 = puVar16[-1];
        uVar33 = puVar16[-2];
        uVar36 = puVar16[1];
        uVar35 = *puVar16;
        pbVar14 = pbVar14 + 0x20;
        uVar19 = uVar19 - 0x20;
        puVar16[-1] = CONCAT17((byte)((ulong)uVar34 >> 0x38) ^ (byte)((ulong)uVar30 >> 0x38),
                               CONCAT16((byte)((ulong)uVar34 >> 0x30) ^
                                        (byte)((ulong)uVar30 >> 0x30),
                                        CONCAT15((byte)((ulong)uVar34 >> 0x28) ^
                                                 (byte)((ulong)uVar30 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar34 >> 0x20) ^
                                                          (byte)((ulong)uVar30 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar34 >> 0x18) ^
                                                                   (byte)((ulong)uVar30 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar34 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar30 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar34 >> 8) ^ (byte)((ulong)uVar30 >> 8),
                                                  (byte)uVar34 ^ (byte)uVar30)))))));
        puVar16[-2] = CONCAT17((byte)((ulong)uVar33 >> 0x38) ^ (byte)((ulong)uVar9 >> 0x38),
                               CONCAT16((byte)((ulong)uVar33 >> 0x30) ^ (byte)((ulong)uVar9 >> 0x30)
                                        ,CONCAT15((byte)((ulong)uVar33 >> 0x28) ^
                                                  (byte)((ulong)uVar9 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar33 >> 0x20) ^
                                                           (byte)((ulong)uVar9 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar33 >> 0x18) ^
                                                                    (byte)((ulong)uVar9 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar33 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar9 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar33 >> 8) ^ (byte)((ulong)uVar9 >> 8),
                                                  (byte)uVar33 ^ (byte)uVar9)))))));
        puVar16[1] = CONCAT17((byte)((ulong)uVar36 >> 0x38) ^ (byte)((ulong)uVar32 >> 0x38),
                              CONCAT16((byte)((ulong)uVar36 >> 0x30) ^ (byte)((ulong)uVar32 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar36 >> 0x28) ^
                                                 (byte)((ulong)uVar32 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar36 >> 0x20) ^
                                                          (byte)((ulong)uVar32 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar36 >> 0x18) ^
                                                                   (byte)((ulong)uVar32 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar36 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar32 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar36 >> 8) ^ (byte)((ulong)uVar32 >> 8),
                                                  (byte)uVar36 ^ (byte)uVar32)))))));
        *puVar16 = CONCAT17((byte)((ulong)uVar35 >> 0x38) ^ (byte)((ulong)uVar31 >> 0x38),
                            CONCAT16((byte)((ulong)uVar35 >> 0x30) ^ (byte)((ulong)uVar31 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar35 >> 0x28) ^
                                              (byte)((ulong)uVar31 >> 0x28),
                                              CONCAT14((byte)((ulong)uVar35 >> 0x20) ^
                                                       (byte)((ulong)uVar31 >> 0x20),
                                                       CONCAT13((byte)((ulong)uVar35 >> 0x18) ^
                                                                (byte)((ulong)uVar31 >> 0x18),
                                                                CONCAT12((byte)((ulong)uVar35 >>
                                                                               0x10) ^
                                                                         (byte)((ulong)uVar31 >>
                                                                               0x10),
                                                                         CONCAT11((byte)((ulong)
                                                  uVar35 >> 8) ^ (byte)((ulong)uVar31 >> 8),
                                                  (byte)uVar35 ^ (byte)uVar31)))))));
        puVar16 = puVar16 + 4;
      } while (uVar19 != 0);
      if (uVar29 != uVar12) goto LAB_00aa9cb8;
    }
    FUN_00aa9de0(puVar28,param_1 + 0xc);
  }
  uVar1 = (uint)(param_3 >> 0x20);
  uVar26 = (uint)param_3;
  *(byte *)(param_1 + 9) = *(byte *)(param_1 + 9) ^ (byte)(uVar1 >> 0x15);
  *(byte *)((long)param_1 + 0x49) = *(byte *)((long)param_1 + 0x49) ^ (byte)(uVar1 >> 0xd);
  *(byte *)((long)param_1 + 0x4a) = *(byte *)((long)param_1 + 0x4a) ^ (byte)(uVar1 >> 5);
  *(byte *)((long)param_1 + 0x4b) = *(byte *)((long)param_1 + 0x4b) ^ (byte)(param_3 >> 0x1d);
  *(byte *)((long)param_1 + 0x4c) = *(byte *)((long)param_1 + 0x4c) ^ (byte)(uVar26 >> 0x15);
  *(byte *)((long)param_1 + 0x4d) = *(byte *)((long)param_1 + 0x4d) ^ (byte)(uVar26 >> 0xd);
  *(byte *)((long)param_1 + 0x4e) = *(byte *)((long)param_1 + 0x4e) ^ (byte)(uVar26 >> 5);
  *(byte *)((long)param_1 + 0x4f) = *(byte *)((long)param_1 + 0x4f) ^ (byte)(uVar26 << 3);
  FUN_00aa9de0(puVar28,param_1 + 0xc);
  uVar1 = (*(uint *)((long)param_1 + 0x4c) & 0xff00ff00) >> 8 |
          (*(uint *)((long)param_1 + 0x4c) & 0xff00ff) << 8;
  iVar27 = (uVar1 >> 0x10 | uVar1 << 0x10) + 1;
  param_1[1] = param_1[9];
  *param_1 = param_1[8];
LAB_00aa9d94:
  param_1[8] = 0;
  param_1[9] = 0;
  (*(code *)param_1[0x2f])(param_1,param_1 + 4,param_1[0x30]);
  *(char *)((long)param_1 + 0xc) = (char)((uint)iVar27 >> 0x18);
  *(char *)((long)param_1 + 0xd) = (char)((uint)iVar27 >> 0x10);
  *(char *)((long)param_1 + 0xe) = (char)((uint)iVar27 >> 8);
  *(char *)((long)param_1 + 0xf) = (char)iVar27;
  return;
}


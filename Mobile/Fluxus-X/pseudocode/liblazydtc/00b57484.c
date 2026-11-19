/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b57484
 */

bool FUN_00b57484(long param_1,undefined8 *param_2,ulong param_3,undefined8 *param_4,ulong param_5,
                 undefined8 *param_6,ulong param_7)

{
  uchar *key;
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  uint uVar13;
  uint uVar14;
  long lVar15;
  char cVar16;
  bool bVar17;
  int iVar18;
  int iVar19;
  ulong uVar20;
  byte *pbVar21;
  ulong uVar22;
  undefined8 *puVar23;
  long lVar24;
  uint uVar25;
  byte *pbVar26;
  uchar *out;
  ulong uVar27;
  size_t __n;
  long lVar28;
  undefined8 *puVar29;
  undefined8 *puVar30;
  ulong uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  undefined8 uVar38;
  undefined8 uVar39;
  uchar auStack_110 [8];
  undefined8 auStack_108 [5];
  undefined8 local_e0;
  undefined8 uStack_d8;
  undefined8 local_d0;
  undefined8 uStack_c8;
  undefined8 local_c0;
  undefined8 uStack_b8;
  int local_a8;
  int local_a4;
  undefined1 local_a0 [8];
  undefined1 auStack_98 [8];
  undefined1 local_90;
  undefined1 auStack_8f [7];
  undefined1 auStack_88 [8];
  undefined8 local_80;
  undefined8 uStack_78;
  uint local_6c [3];
  
  puVar29 = *(undefined8 **)(param_1 + 0xf8);
  local_a8 = 0x10;
  uStack_d8 = *(undefined8 *)((long)puVar29 + 0x5c);
  local_e0 = *(undefined8 *)((long)puVar29 + 0x54);
  uVar25 = *(byte *)((long)puVar29 + 99) + 1;
  uVar1 = (uint)*(byte *)((long)puVar29 + 0x62) + (uVar25 >> 8);
  uVar2 = (uint)*(byte *)((long)puVar29 + 0x61) + (uVar1 >> 8);
  uVar3 = (uint)*(byte *)(puVar29 + 0xc) + (uVar2 >> 8);
  uVar4 = (uint)*(byte *)((long)puVar29 + 0x5f) + (uVar3 >> 8);
  uVar5 = (uint)*(byte *)((long)puVar29 + 0x5e) + (uVar4 >> 8);
  uVar6 = (uint)*(byte *)((long)puVar29 + 0x5d) + (uVar5 >> 8);
  uVar7 = (uint)*(byte *)((long)puVar29 + 0x5c) + (uVar6 >> 8);
  uVar8 = (uint)*(byte *)((long)puVar29 + 0x5b) + (uVar7 >> 8);
  uVar9 = (uint)*(byte *)((long)puVar29 + 0x5a) + (uVar8 >> 8);
  uVar10 = (uint)*(byte *)((long)puVar29 + 0x59) + (uVar9 >> 8);
  uVar11 = (uint)*(byte *)(puVar29 + 0xb) + (uVar10 >> 8);
  uVar12 = (uint)*(byte *)((long)puVar29 + 0x57) + (uVar11 >> 8);
  uVar13 = (uint)*(byte *)((long)puVar29 + 0x56) + (uVar12 >> 8);
  uVar14 = (uint)*(byte *)((long)puVar29 + 0x55) + (uVar13 >> 8);
  cVar16 = *(char *)((long)puVar29 + 0x54) + (char)(uVar14 >> 8);
  *(char *)((long)puVar29 + 99) = (char)uVar25;
  *(char *)((long)puVar29 + 0x62) = (char)uVar1;
  *(char *)((long)puVar29 + 0x61) = (char)uVar2;
  *(char *)(puVar29 + 0xc) = (char)uVar3;
  *(char *)((long)puVar29 + 0x5f) = (char)uVar4;
  *(char *)((long)puVar29 + 0x5e) = (char)uVar5;
  *(char *)((long)puVar29 + 0x5d) = (char)uVar6;
  *(char *)((long)puVar29 + 0x5c) = (char)uVar7;
  *(char *)((long)puVar29 + 0x5b) = (char)uVar8;
  *(char *)((long)puVar29 + 0x5a) = (char)uVar9;
  *(char *)((long)puVar29 + 0x59) = (char)uVar10;
  *(char *)(puVar29 + 0xb) = (char)uVar11;
  *(char *)((long)puVar29 + 0x57) = (char)uVar12;
  *(char *)((long)puVar29 + 0x56) = (char)uVar13;
  *(char *)((long)puVar29 + 0x55) = (char)uVar14;
  *(char *)((long)puVar29 + 0x54) = cVar16;
  uStack_c8 = *(undefined8 *)((long)puVar29 + 0x5c);
  local_d0 = *(undefined8 *)((long)puVar29 + 0x54);
  if (puVar29[5] == 0x10) {
    iVar19 = 0x20;
  }
  else {
    uVar25 = (uVar25 & 0xff) + 1;
    *(char *)((long)puVar29 + 99) = (char)uVar25;
    uVar25 = (uVar25 >> 8) + (uVar1 & 0xff);
    *(char *)((long)puVar29 + 0x62) = (char)uVar25;
    uVar25 = (uVar25 >> 8) + (uVar2 & 0xff);
    *(char *)((long)puVar29 + 0x61) = (char)uVar25;
    uVar25 = (uVar25 >> 8) + (uVar3 & 0xff);
    *(char *)(puVar29 + 0xc) = (char)uVar25;
    uVar25 = (uVar25 >> 8) + (uVar4 & 0xff);
    *(char *)((long)puVar29 + 0x5f) = (char)uVar25;
    uVar25 = (uVar25 >> 8) + (uVar5 & 0xff);
    *(char *)((long)puVar29 + 0x5e) = (char)uVar25;
    uVar25 = (uVar25 >> 8) + (uVar6 & 0xff);
    *(char *)((long)puVar29 + 0x5d) = (char)uVar25;
    uVar25 = (uVar25 >> 8) + (uVar7 & 0xff);
    *(char *)((long)puVar29 + 0x5c) = (char)uVar25;
    uVar25 = (uVar25 >> 8) + (uVar8 & 0xff);
    *(char *)((long)puVar29 + 0x5b) = (char)uVar25;
    uVar25 = (uVar25 >> 8) + (uVar9 & 0xff);
    *(char *)((long)puVar29 + 0x5a) = (char)uVar25;
    uVar25 = (uVar25 >> 8) + (uVar10 & 0xff);
    *(char *)((long)puVar29 + 0x59) = (char)uVar25;
    uVar25 = (uVar25 >> 8) + (uVar11 & 0xff);
    *(char *)(puVar29 + 0xb) = (char)uVar25;
    uVar25 = (uVar25 >> 8) + (uVar12 & 0xff);
    *(char *)((long)puVar29 + 0x57) = (char)uVar25;
    uVar25 = (uVar25 >> 8) + (uVar13 & 0xff);
    *(char *)((long)puVar29 + 0x56) = (char)uVar25;
    iVar19 = (uVar25 >> 8) + (uVar14 & 0xff);
    *(char *)((long)puVar29 + 0x55) = (char)iVar19;
    *(char *)((long)puVar29 + 0x54) = cVar16 + (char)((uint)iVar19 >> 8);
    uStack_b8 = *(undefined8 *)((long)puVar29 + 0x5c);
    local_c0 = *(undefined8 *)((long)puVar29 + 0x54);
    iVar19 = 0x30;
  }
  iVar18 = EVP_CipherUpdate((EVP_CIPHER_CTX *)*puVar29,auStack_110,&local_a8,(uchar *)&local_e0,
                            iVar19);
  if (iVar18 == 0) {
    return false;
  }
  if (local_a8 != iVar19) {
    return false;
  }
  uVar31 = puVar29[5];
  key = (uchar *)((long)puVar29 + 0x34);
  memcpy(key,auStack_110,uVar31);
  uVar32 = *(undefined8 *)(auStack_110 + uVar31);
  *(undefined8 *)((long)puVar29 + 0x5c) = *(undefined8 *)((long)auStack_108 + uVar31);
  *(undefined8 *)((long)puVar29 + 0x54) = uVar32;
  if (*(int *)(puVar29 + 6) == 0) {
    if ((param_2 != (undefined8 *)0x0) && (param_3 != 0)) {
      uVar20 = param_3;
      if (uVar31 <= param_3) {
        uVar20 = uVar31;
      }
      if (uVar20 != 0) {
        uVar22 = 0;
        if (uVar20 < 0x20) {
LAB_00b578c8:
          do {
            uVar31 = uVar22 + 1;
            *(byte *)((long)puVar29 + uVar22 + 0x34) =
                 *(byte *)((long)puVar29 + uVar22 + 0x34) ^ *(byte *)((long)param_2 + uVar22);
            uVar22 = uVar31;
          } while (uVar31 < uVar20);
        }
        else {
          uVar27 = param_3;
          if (uVar31 <= param_3) {
            uVar27 = uVar31;
          }
          if (((long)puVar29 + 0x34U < (long)param_2 + uVar20) &&
             (uVar22 = 0, param_2 < (undefined8 *)((long)puVar29 + uVar27 + 0x34)))
          goto LAB_00b578c8;
          uVar22 = uVar20 & 0xffffffffffffffe0;
          puVar23 = param_2 + 2;
          puVar30 = (undefined8 *)((long)puVar29 + 0x44);
          uVar31 = uVar22;
          do {
            uVar33 = puVar23[-1];
            uVar32 = puVar23[-2];
            uVar35 = puVar23[1];
            uVar34 = *puVar23;
            uVar37 = puVar30[-1];
            uVar36 = puVar30[-2];
            uVar39 = puVar30[1];
            uVar38 = *puVar30;
            puVar23 = puVar23 + 4;
            uVar31 = uVar31 - 0x20;
            puVar30[-1] = CONCAT17((byte)((ulong)uVar37 >> 0x38) ^ (byte)((ulong)uVar33 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar37 >> 0x30) ^
                                            (byte)((ulong)uVar33 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar37 >> 0x28) ^
                                                     (byte)((ulong)uVar33 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar37 >> 0x20) ^
                                                              (byte)((ulong)uVar33 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar37 >> 0x18)
                                                                       ^ (byte)((ulong)uVar33 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar37
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar33
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar37 >> 8) ^ (byte)((ulong)uVar33 >> 8),
                                                  (byte)uVar37 ^ (byte)uVar33)))))));
            puVar30[-2] = CONCAT17((byte)((ulong)uVar36 >> 0x38) ^ (byte)((ulong)uVar32 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar36 >> 0x30) ^
                                            (byte)((ulong)uVar32 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar36 >> 0x28) ^
                                                     (byte)((ulong)uVar32 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar36 >> 0x20) ^
                                                              (byte)((ulong)uVar32 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar36 >> 0x18)
                                                                       ^ (byte)((ulong)uVar32 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar36
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar32
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar36 >> 8) ^ (byte)((ulong)uVar32 >> 8),
                                                  (byte)uVar36 ^ (byte)uVar32)))))));
            puVar30[1] = CONCAT17((byte)((ulong)uVar39 >> 0x38) ^ (byte)((ulong)uVar35 >> 0x38),
                                  CONCAT16((byte)((ulong)uVar39 >> 0x30) ^
                                           (byte)((ulong)uVar35 >> 0x30),
                                           CONCAT15((byte)((ulong)uVar39 >> 0x28) ^
                                                    (byte)((ulong)uVar35 >> 0x28),
                                                    CONCAT14((byte)((ulong)uVar39 >> 0x20) ^
                                                             (byte)((ulong)uVar35 >> 0x20),
                                                             CONCAT13((byte)((ulong)uVar39 >> 0x18)
                                                                      ^ (byte)((ulong)uVar35 >> 0x18
                                                                              ),
                                                                      CONCAT12((byte)((ulong)uVar39
                                                                                     >> 0x10) ^
                                                                               (byte)((ulong)uVar35
                                                                                     >> 0x10),
                                                                               CONCAT11((byte)((
                                                  ulong)uVar39 >> 8) ^ (byte)((ulong)uVar35 >> 8),
                                                  (byte)uVar39 ^ (byte)uVar35)))))));
            *puVar30 = CONCAT17((byte)((ulong)uVar38 >> 0x38) ^ (byte)((ulong)uVar34 >> 0x38),
                                CONCAT16((byte)((ulong)uVar38 >> 0x30) ^
                                         (byte)((ulong)uVar34 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar38 >> 0x28) ^
                                                  (byte)((ulong)uVar34 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar38 >> 0x20) ^
                                                           (byte)((ulong)uVar34 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar38 >> 0x18) ^
                                                                    (byte)((ulong)uVar34 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar38 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar34 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar38 >> 8) ^ (byte)((ulong)uVar34 >> 8),
                                                  (byte)uVar38 ^ (byte)uVar34)))))));
            puVar30 = puVar30 + 4;
          } while (uVar31 != 0);
          if (uVar20 != uVar22) goto LAB_00b578c8;
        }
        uVar31 = puVar29[5];
      }
      if (uVar31 < param_3) {
        uVar20 = param_3 - uVar31;
        if (0xf < uVar20) {
          uVar20 = 0x10;
        }
        if (uVar20 != 0) {
          if (0x1f < uVar20) {
            param_3 = (uVar31 - 1) - param_3;
            if (param_3 < 0xfffffffffffffff0) {
              param_3 = 0xffffffffffffffef;
            }
            if (((long)param_2 + ((uVar31 - 1) - param_3) <= (long)puVar29 + 0x54U) ||
               ((long)puVar29 + (0x53 - param_3) <= (long)param_2 + uVar31)) {
              lVar28 = 0;
              lVar24 = (long)param_2 + uVar31 + 0x10;
              do {
                lVar15 = lVar24 + lVar28;
                puVar23 = (undefined8 *)((long)puVar29 + lVar28 + 100);
                puVar30 = (undefined8 *)(lVar24 + lVar28);
                uVar33 = puVar30[1];
                uVar32 = *puVar30;
                uVar35 = *(undefined8 *)(lVar15 + -8);
                uVar34 = *(undefined8 *)(lVar15 + -0x10);
                uVar37 = puVar23[-1];
                uVar36 = puVar23[-2];
                uVar39 = puVar23[1];
                uVar38 = *puVar23;
                lVar28 = lVar28 + 0x20;
                puVar23[-1] = CONCAT17((byte)((ulong)uVar37 >> 0x38) ^ (byte)((ulong)uVar35 >> 0x38)
                                       ,CONCAT16((byte)((ulong)uVar37 >> 0x30) ^
                                                 (byte)((ulong)uVar35 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar37 >> 0x28) ^
                                                          (byte)((ulong)uVar35 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar37 >> 0x20) ^
                                                                   (byte)((ulong)uVar35 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar37 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar35 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar37 >> 0x10) ^ (byte)((ulong)uVar35 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar37 >> 8) ^
                                                           (byte)((ulong)uVar35 >> 8),
                                                           (byte)uVar37 ^ (byte)uVar35)))))));
                puVar23[-2] = CONCAT17((byte)((ulong)uVar36 >> 0x38) ^ (byte)((ulong)uVar34 >> 0x38)
                                       ,CONCAT16((byte)((ulong)uVar36 >> 0x30) ^
                                                 (byte)((ulong)uVar34 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar36 >> 0x28) ^
                                                          (byte)((ulong)uVar34 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar36 >> 0x20) ^
                                                                   (byte)((ulong)uVar34 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar36 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar34 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar36 >> 0x10) ^ (byte)((ulong)uVar34 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar36 >> 8) ^
                                                           (byte)((ulong)uVar34 >> 8),
                                                           (byte)uVar36 ^ (byte)uVar34)))))));
                puVar23[1] = CONCAT17((byte)((ulong)uVar39 >> 0x38) ^ (byte)((ulong)uVar33 >> 0x38),
                                      CONCAT16((byte)((ulong)uVar39 >> 0x30) ^
                                               (byte)((ulong)uVar33 >> 0x30),
                                               CONCAT15((byte)((ulong)uVar39 >> 0x28) ^
                                                        (byte)((ulong)uVar33 >> 0x28),
                                                        CONCAT14((byte)((ulong)uVar39 >> 0x20) ^
                                                                 (byte)((ulong)uVar33 >> 0x20),
                                                                 CONCAT13((byte)((ulong)uVar39 >>
                                                                                0x18) ^
                                                                          (byte)((ulong)uVar33 >>
                                                                                0x18),
                                                                          CONCAT12((byte)((ulong)
                                                  uVar39 >> 0x10) ^ (byte)((ulong)uVar33 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar39 >> 8) ^
                                                           (byte)((ulong)uVar33 >> 8),
                                                           (byte)uVar39 ^ (byte)uVar33)))))));
                *puVar23 = CONCAT17((byte)((ulong)uVar38 >> 0x38) ^ (byte)((ulong)uVar32 >> 0x38),
                                    CONCAT16((byte)((ulong)uVar38 >> 0x30) ^
                                             (byte)((ulong)uVar32 >> 0x30),
                                             CONCAT15((byte)((ulong)uVar38 >> 0x28) ^
                                                      (byte)((ulong)uVar32 >> 0x28),
                                                      CONCAT14((byte)((ulong)uVar38 >> 0x20) ^
                                                               (byte)((ulong)uVar32 >> 0x20),
                                                               CONCAT13((byte)((ulong)uVar38 >> 0x18
                                                                              ) ^ (byte)((ulong)
                                                  uVar32 >> 0x18),
                                                  CONCAT12((byte)((ulong)uVar38 >> 0x10) ^
                                                           (byte)((ulong)uVar32 >> 0x10),
                                                           CONCAT11((byte)((ulong)uVar38 >> 8) ^
                                                                    (byte)((ulong)uVar32 >> 8),
                                                                    (byte)uVar38 ^ (byte)uVar32)))))
                                            ));
              } while (lVar28 != 0);
              if (uVar20 == 0) goto LAB_00b579b4;
            }
          }
          uVar22 = 0;
          do {
            *(byte *)((long)puVar29 + uVar22 + 0x54) =
                 *(byte *)((long)puVar29 + uVar22 + 0x54) ^
                 *(byte *)((long)param_2 + uVar22 + uVar31);
            uVar22 = uVar22 + 1;
          } while (uVar22 < uVar20);
        }
      }
    }
LAB_00b579b4:
    if ((param_4 == (undefined8 *)0x0) || (param_5 == 0)) goto LAB_00b57b24;
    uVar20 = param_5;
    if (uVar31 <= param_5) {
      uVar20 = uVar31;
    }
    if (uVar20 != 0) {
      uVar22 = 0;
      if (uVar20 < 0x20) {
LAB_00b57a3c:
        do {
          uVar31 = uVar22 + 1;
          *(byte *)((long)puVar29 + uVar22 + 0x34) =
               *(byte *)((long)puVar29 + uVar22 + 0x34) ^ *(byte *)((long)param_4 + uVar22);
          uVar22 = uVar31;
        } while (uVar31 < uVar20);
      }
      else {
        uVar27 = param_5;
        if (uVar31 <= param_5) {
          uVar27 = uVar31;
        }
        if (((long)puVar29 + 0x34U < (long)param_4 + uVar20) &&
           (uVar22 = 0, param_4 < (undefined8 *)((long)puVar29 + uVar27 + 0x34))) goto LAB_00b57a3c;
        uVar22 = uVar20 & 0xffffffffffffffe0;
        puVar23 = param_4 + 2;
        puVar30 = (undefined8 *)((long)puVar29 + 0x44);
        uVar31 = uVar22;
        do {
          uVar33 = puVar23[-1];
          uVar32 = puVar23[-2];
          uVar35 = puVar23[1];
          uVar34 = *puVar23;
          uVar37 = puVar30[-1];
          uVar36 = puVar30[-2];
          uVar39 = puVar30[1];
          uVar38 = *puVar30;
          puVar23 = puVar23 + 4;
          uVar31 = uVar31 - 0x20;
          puVar30[-1] = CONCAT17((byte)((ulong)uVar37 >> 0x38) ^ (byte)((ulong)uVar33 >> 0x38),
                                 CONCAT16((byte)((ulong)uVar37 >> 0x30) ^
                                          (byte)((ulong)uVar33 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar37 >> 0x28) ^
                                                   (byte)((ulong)uVar33 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar37 >> 0x20) ^
                                                            (byte)((ulong)uVar33 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar37 >> 0x18) ^
                                                                     (byte)((ulong)uVar33 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar37
                                                                                    >> 0x10) ^
                                                                              (byte)((ulong)uVar33
                                                                                    >> 0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar37 >> 8) ^ (byte)((ulong)uVar33 >> 8),
                                                  (byte)uVar37 ^ (byte)uVar33)))))));
          puVar30[-2] = CONCAT17((byte)((ulong)uVar36 >> 0x38) ^ (byte)((ulong)uVar32 >> 0x38),
                                 CONCAT16((byte)((ulong)uVar36 >> 0x30) ^
                                          (byte)((ulong)uVar32 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar36 >> 0x28) ^
                                                   (byte)((ulong)uVar32 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar36 >> 0x20) ^
                                                            (byte)((ulong)uVar32 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar36 >> 0x18) ^
                                                                     (byte)((ulong)uVar32 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar36
                                                                                    >> 0x10) ^
                                                                              (byte)((ulong)uVar32
                                                                                    >> 0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar36 >> 8) ^ (byte)((ulong)uVar32 >> 8),
                                                  (byte)uVar36 ^ (byte)uVar32)))))));
          puVar30[1] = CONCAT17((byte)((ulong)uVar39 >> 0x38) ^ (byte)((ulong)uVar35 >> 0x38),
                                CONCAT16((byte)((ulong)uVar39 >> 0x30) ^
                                         (byte)((ulong)uVar35 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar39 >> 0x28) ^
                                                  (byte)((ulong)uVar35 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar39 >> 0x20) ^
                                                           (byte)((ulong)uVar35 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar39 >> 0x18) ^
                                                                    (byte)((ulong)uVar35 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar39 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar35 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar39 >> 8) ^ (byte)((ulong)uVar35 >> 8),
                                                  (byte)uVar39 ^ (byte)uVar35)))))));
          *puVar30 = CONCAT17((byte)((ulong)uVar38 >> 0x38) ^ (byte)((ulong)uVar34 >> 0x38),
                              CONCAT16((byte)((ulong)uVar38 >> 0x30) ^ (byte)((ulong)uVar34 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar38 >> 0x28) ^
                                                 (byte)((ulong)uVar34 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar38 >> 0x20) ^
                                                          (byte)((ulong)uVar34 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar38 >> 0x18) ^
                                                                   (byte)((ulong)uVar34 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar38 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar34 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar38 >> 8) ^ (byte)((ulong)uVar34 >> 8),
                                                  (byte)uVar38 ^ (byte)uVar34)))))));
          puVar30 = puVar30 + 4;
        } while (uVar31 != 0);
        if (uVar20 != uVar22) goto LAB_00b57a3c;
      }
      uVar31 = puVar29[5];
    }
    if (uVar31 < param_5) {
      uVar20 = param_5 - uVar31;
      if (0xf < uVar20) {
        uVar20 = 0x10;
      }
      if (uVar20 != 0) {
        if (0x1f < uVar20) {
          param_5 = (uVar31 - 1) - param_5;
          if (param_5 < 0xfffffffffffffff0) {
            param_5 = 0xffffffffffffffef;
          }
          if (((long)param_4 + ((uVar31 - 1) - param_5) <= (long)puVar29 + 0x54U) ||
             ((long)puVar29 + (0x53 - param_5) <= (long)param_4 + uVar31)) {
            lVar24 = 0;
            do {
              puVar23 = (undefined8 *)((long)param_4 + uVar31 + lVar24);
              uVar33 = puVar23[1];
              uVar32 = *puVar23;
              uVar35 = puVar23[3];
              uVar34 = puVar23[2];
              uVar37 = *(undefined8 *)((long)puVar29 + lVar24 + 0x5c);
              uVar36 = *(undefined8 *)((long)puVar29 + lVar24 + 0x54);
              uVar39 = *(undefined8 *)((long)puVar29 + lVar24 + 0x6c);
              uVar38 = *(undefined8 *)((long)puVar29 + lVar24 + 100);
              lVar28 = lVar24 + 0x20;
              *(ulong *)((long)puVar29 + lVar24 + 0x5c) =
                   CONCAT17((byte)((ulong)uVar37 >> 0x38) ^ (byte)((ulong)uVar33 >> 0x38),
                            CONCAT16((byte)((ulong)uVar37 >> 0x30) ^ (byte)((ulong)uVar33 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar37 >> 0x28) ^
                                              (byte)((ulong)uVar33 >> 0x28),
                                              CONCAT14((byte)((ulong)uVar37 >> 0x20) ^
                                                       (byte)((ulong)uVar33 >> 0x20),
                                                       CONCAT13((byte)((ulong)uVar37 >> 0x18) ^
                                                                (byte)((ulong)uVar33 >> 0x18),
                                                                CONCAT12((byte)((ulong)uVar37 >>
                                                                               0x10) ^
                                                                         (byte)((ulong)uVar33 >>
                                                                               0x10),
                                                                         CONCAT11((byte)((ulong)
                                                  uVar37 >> 8) ^ (byte)((ulong)uVar33 >> 8),
                                                  (byte)uVar37 ^ (byte)uVar33)))))));
              *(ulong *)((long)puVar29 + lVar24 + 0x54) =
                   CONCAT17((byte)((ulong)uVar36 >> 0x38) ^ (byte)((ulong)uVar32 >> 0x38),
                            CONCAT16((byte)((ulong)uVar36 >> 0x30) ^ (byte)((ulong)uVar32 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar36 >> 0x28) ^
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
              *(ulong *)((long)puVar29 + lVar24 + 0x6c) =
                   CONCAT17((byte)((ulong)uVar39 >> 0x38) ^ (byte)((ulong)uVar35 >> 0x38),
                            CONCAT16((byte)((ulong)uVar39 >> 0x30) ^ (byte)((ulong)uVar35 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar39 >> 0x28) ^
                                              (byte)((ulong)uVar35 >> 0x28),
                                              CONCAT14((byte)((ulong)uVar39 >> 0x20) ^
                                                       (byte)((ulong)uVar35 >> 0x20),
                                                       CONCAT13((byte)((ulong)uVar39 >> 0x18) ^
                                                                (byte)((ulong)uVar35 >> 0x18),
                                                                CONCAT12((byte)((ulong)uVar39 >>
                                                                               0x10) ^
                                                                         (byte)((ulong)uVar35 >>
                                                                               0x10),
                                                                         CONCAT11((byte)((ulong)
                                                  uVar39 >> 8) ^ (byte)((ulong)uVar35 >> 8),
                                                  (byte)uVar39 ^ (byte)uVar35)))))));
              *(ulong *)((long)puVar29 + lVar24 + 100) =
                   CONCAT17((byte)((ulong)uVar38 >> 0x38) ^ (byte)((ulong)uVar34 >> 0x38),
                            CONCAT16((byte)((ulong)uVar38 >> 0x30) ^ (byte)((ulong)uVar34 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar38 >> 0x28) ^
                                              (byte)((ulong)uVar34 >> 0x28),
                                              CONCAT14((byte)((ulong)uVar38 >> 0x20) ^
                                                       (byte)((ulong)uVar34 >> 0x20),
                                                       CONCAT13((byte)((ulong)uVar38 >> 0x18) ^
                                                                (byte)((ulong)uVar34 >> 0x18),
                                                                CONCAT12((byte)((ulong)uVar38 >>
                                                                               0x10) ^
                                                                         (byte)((ulong)uVar34 >>
                                                                               0x10),
                                                                         CONCAT11((byte)((ulong)
                                                  uVar38 >> 8) ^ (byte)((ulong)uVar34 >> 8),
                                                  (byte)uVar38 ^ (byte)uVar34)))))));
              lVar24 = lVar28;
            } while (lVar28 != 0);
            if (uVar20 == 0) goto LAB_00b57b24;
          }
        }
        uVar22 = 0;
        do {
          *(byte *)((long)puVar29 + uVar22 + 0x54) =
               *(byte *)((long)puVar29 + uVar22 + 0x54) ^ *(byte *)((long)param_4 + uVar22 + uVar31)
          ;
          uVar22 = uVar22 + 1;
        } while (uVar22 < uVar20);
      }
    }
    goto LAB_00b57b24;
  }
  if (((param_4 != (undefined8 *)0x0) || (param_2 != (undefined8 *)0x0)) ||
     (param_6 != (undefined8 *)0x0)) {
    uVar25 = 0x20;
    if (uVar31 != 0x10) {
      uVar25 = 0x30;
    }
    local_a4 = 0x10;
    auStack_88 = (undefined1  [8])0x0;
    uStack_78 = 0;
    auStack_98 = (undefined1  [8])0x0;
    local_a0 = (undefined1  [8])0x0;
    out = (uchar *)(puVar29 + 0x10);
    puVar29[0x11] = 0;
    out[0] = '\0';
    out[1] = '\0';
    out[2] = '\0';
    out[3] = '\0';
    out[4] = '\0';
    out[5] = '\0';
    out[6] = '\0';
    out[7] = '\0';
    puVar29[0x13] = 0;
    puVar29[0x12] = 0;
    puVar29[0x15] = 0;
    puVar29[0x14] = 0;
    local_80 = 0x2000000;
    uVar31 = (ulong)uVar25 - 1;
    uVar20 = 1;
    _local_90 = 0x1000000;
    local_6c[0] = 0x10;
    *out = '\0';
    if (0x1f < uVar31) {
      uVar31 = uVar31 - (uVar25 - 1 & 0x1f);
      puVar23 = (undefined8 *)auStack_8f;
      uVar20 = uVar31 | 1;
      puVar30 = (undefined8 *)((long)puVar29 + 0x91);
      do {
        uVar33 = puVar23[-1];
        uVar32 = puVar23[-2];
        uVar35 = puVar23[1];
        uVar34 = *puVar23;
        uVar37 = puVar30[-1];
        uVar36 = puVar30[-2];
        uVar39 = puVar30[1];
        uVar38 = *puVar30;
        puVar23 = puVar23 + 4;
        uVar31 = uVar31 - 0x20;
        puVar30[-1] = CONCAT17((byte)((ulong)uVar37 >> 0x38) ^ (byte)((ulong)uVar33 >> 0x38),
                               CONCAT16((byte)((ulong)uVar37 >> 0x30) ^
                                        (byte)((ulong)uVar33 >> 0x30),
                                        CONCAT15((byte)((ulong)uVar37 >> 0x28) ^
                                                 (byte)((ulong)uVar33 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar37 >> 0x20) ^
                                                          (byte)((ulong)uVar33 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar37 >> 0x18) ^
                                                                   (byte)((ulong)uVar33 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar37 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar33 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar37 >> 8) ^ (byte)((ulong)uVar33 >> 8),
                                                  (byte)uVar37 ^ (byte)uVar33)))))));
        puVar30[-2] = CONCAT17((byte)((ulong)uVar36 >> 0x38) ^ (byte)((ulong)uVar32 >> 0x38),
                               CONCAT16((byte)((ulong)uVar36 >> 0x30) ^
                                        (byte)((ulong)uVar32 >> 0x30),
                                        CONCAT15((byte)((ulong)uVar36 >> 0x28) ^
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
        puVar30[1] = CONCAT17((byte)((ulong)uVar39 >> 0x38) ^ (byte)((ulong)uVar35 >> 0x38),
                              CONCAT16((byte)((ulong)uVar39 >> 0x30) ^ (byte)((ulong)uVar35 >> 0x30)
                                       ,CONCAT15((byte)((ulong)uVar39 >> 0x28) ^
                                                 (byte)((ulong)uVar35 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar39 >> 0x20) ^
                                                          (byte)((ulong)uVar35 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar39 >> 0x18) ^
                                                                   (byte)((ulong)uVar35 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar39 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar35 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar39 >> 8) ^ (byte)((ulong)uVar35 >> 8),
                                                  (byte)uVar39 ^ (byte)uVar35)))))));
        *puVar30 = CONCAT17((byte)((ulong)uVar38 >> 0x38) ^ (byte)((ulong)uVar34 >> 0x38),
                            CONCAT16((byte)((ulong)uVar38 >> 0x30) ^ (byte)((ulong)uVar34 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar38 >> 0x28) ^
                                              (byte)((ulong)uVar34 >> 0x28),
                                              CONCAT14((byte)((ulong)uVar38 >> 0x20) ^
                                                       (byte)((ulong)uVar34 >> 0x20),
                                                       CONCAT13((byte)((ulong)uVar38 >> 0x18) ^
                                                                (byte)((ulong)uVar34 >> 0x18),
                                                                CONCAT12((byte)((ulong)uVar38 >>
                                                                               0x10) ^
                                                                         (byte)((ulong)uVar34 >>
                                                                               0x10),
                                                                         CONCAT11((byte)((ulong)
                                                  uVar38 >> 8) ^ (byte)((ulong)uVar34 >> 8),
                                                  (byte)uVar38 ^ (byte)uVar34)))))));
        puVar30 = puVar30 + 4;
      } while (uVar31 != 0);
    }
    lVar24 = uVar25 - uVar20;
    pbVar21 = local_a0 + uVar20;
    pbVar26 = (byte *)((long)puVar29 + uVar20 + 0x80);
    do {
      lVar24 = lVar24 + -1;
      *pbVar26 = *pbVar26 ^ *pbVar21;
      pbVar21 = pbVar21 + 1;
      pbVar26 = pbVar26 + 1;
    } while (lVar24 != 0);
    iVar19 = EVP_CipherUpdate((EVP_CIPHER_CTX *)puVar29[2],out,(int *)local_6c,out,uVar25);
    if (iVar19 == 0) {
      return false;
    }
    if (local_6c[0] != uVar25) {
      return false;
    }
    *(undefined2 *)(puVar29 + 0xd) = 0;
    uVar31 = 0;
    if (param_2 != (undefined8 *)0x0) {
      uVar31 = param_3;
    }
    uVar20 = 0;
    if (param_6 != (undefined8 *)0x0) {
      uVar20 = param_7;
    }
    uVar22 = 0;
    if (param_4 != (undefined8 *)0x0) {
      uVar22 = param_5;
    }
    lVar24 = uVar22 + uVar31 + uVar20;
    *(char *)((long)puVar29 + 0x6b) = (char)puVar29[5] + '\x10';
    *(char *)((long)puVar29 + 100) = (char)((ulong)lVar24 >> 0x18);
    *(char *)((long)puVar29 + 0x67) = (char)lVar24;
    *(char *)((long)puVar29 + 0x65) = (char)((ulong)lVar24 >> 0x10);
    puVar23 = (undefined8 *)((long)puVar29 + 100);
    *(char *)((long)puVar29 + 0x66) = (char)((ulong)lVar24 >> 8);
    *(undefined1 *)((long)puVar29 + 0x6a) = 0;
    puVar29[0xf] = 8;
    if ((param_2 != (undefined8 *)0x0) && (uVar31 != 0)) {
      uVar27 = uVar31 - 8;
      if (uVar31 < 8) {
        lVar24 = 8;
        uVar27 = uVar31;
      }
      else {
        *(undefined8 *)((long)puVar29 + 0x6c) = *param_2;
        auStack_98 = *(undefined1 (*) [8])((long)puVar29 + 0x6c);
        local_a0 = (undefined1  [8])*puVar23;
        auStack_88 = *(undefined1 (*) [8])((long)puVar29 + 0x6c);
        _local_90 = *puVar23;
        if (puVar29[5] == 0x10) {
          lVar24 = 0x20;
        }
        else {
          lVar24 = 0x30;
          uStack_78 = *(undefined8 *)((long)puVar29 + 0x6c);
          local_80 = *puVar23;
        }
        local_6c[0] = 0x10;
        uVar33 = puVar29[0x11];
        uVar32 = puVar29[0x10];
        uVar35 = puVar29[0x13];
        uVar34 = puVar29[0x12];
        uVar25 = (uint)lVar24;
        puVar29[0x11] =
             CONCAT17((byte)((ulong)uVar33 >> 0x38) ^ (byte)((ulong)auStack_98 >> 0x38),
                      CONCAT16((byte)((ulong)uVar33 >> 0x30) ^ (byte)((ulong)auStack_98 >> 0x30),
                               CONCAT15((byte)((ulong)uVar33 >> 0x28) ^
                                        (byte)((ulong)auStack_98 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar33 >> 0x20) ^
                                                 (byte)((ulong)auStack_98 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar33 >> 0x18) ^
                                                          (byte)((ulong)auStack_98 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar33 >> 0x10) ^
                                                                   (byte)((ulong)auStack_98 >> 0x10)
                                                                   ,CONCAT11((byte)((ulong)uVar33 >>
                                                                                   8) ^
                                                                             (byte)((ulong)
                                                  auStack_98 >> 8),
                                                  (byte)uVar33 ^ SUB81(auStack_98,0))))))));
        puVar29[0x10] =
             CONCAT17((byte)((ulong)uVar32 >> 0x38) ^ (byte)((ulong)local_a0 >> 0x38),
                      CONCAT16((byte)((ulong)uVar32 >> 0x30) ^ (byte)((ulong)local_a0 >> 0x30),
                               CONCAT15((byte)((ulong)uVar32 >> 0x28) ^
                                        (byte)((ulong)local_a0 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar32 >> 0x20) ^
                                                 (byte)((ulong)local_a0 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar32 >> 0x18) ^
                                                          (byte)((ulong)local_a0 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar32 >> 0x10) ^
                                                                   (byte)((ulong)local_a0 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar32 >>
                                                                                  8) ^
                                                                            (byte)((ulong)local_a0
                                                                                  >> 8),
                                                                            (byte)uVar32 ^
                                                                            SUB81(local_a0,0))))))))
        ;
        puVar29[0x13] =
             CONCAT17((byte)((ulong)uVar35 >> 0x38) ^ (byte)((ulong)auStack_88 >> 0x38),
                      CONCAT16((byte)((ulong)uVar35 >> 0x30) ^ (byte)((ulong)auStack_88 >> 0x30),
                               CONCAT15((byte)((ulong)uVar35 >> 0x28) ^
                                        (byte)((ulong)auStack_88 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar35 >> 0x20) ^
                                                 (byte)((ulong)auStack_88 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar35 >> 0x18) ^
                                                          (byte)((ulong)auStack_88 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar35 >> 0x10) ^
                                                                   (byte)((ulong)auStack_88 >> 0x10)
                                                                   ,CONCAT11((byte)((ulong)uVar35 >>
                                                                                   8) ^
                                                                             (byte)((ulong)
                                                  auStack_88 >> 8),
                                                  (byte)uVar35 ^ SUB81(auStack_88,0))))))));
        puVar29[0x12] =
             CONCAT17((byte)((ulong)uVar34 >> 0x38) ^ (byte)((ulong)_local_90 >> 0x38),
                      CONCAT16((byte)((ulong)uVar34 >> 0x30) ^ (byte)((ulong)_local_90 >> 0x30),
                               CONCAT15((byte)((ulong)uVar34 >> 0x28) ^
                                        (byte)((ulong)_local_90 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar34 >> 0x20) ^
                                                 (byte)((ulong)_local_90 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar34 >> 0x18) ^
                                                          (byte)((ulong)_local_90 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar34 >> 0x10) ^
                                                                   (byte)((ulong)_local_90 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar34 >>
                                                                                  8) ^
                                                                            (byte)((ulong)_local_90
                                                                                  >> 8),
                                                                            (byte)uVar34 ^
                                                                            (byte)_local_90)))))));
        if (uVar25 != 0x20) {
          lVar24 = lVar24 + -0x20;
          pbVar21 = (byte *)(puVar29 + 0x14);
          pbVar26 = (byte *)&local_80;
          do {
            lVar24 = lVar24 + -1;
            *pbVar21 = *pbVar21 ^ *pbVar26;
            pbVar21 = pbVar21 + 1;
            pbVar26 = pbVar26 + 1;
          } while (lVar24 != 0);
        }
        iVar19 = EVP_CipherUpdate((EVP_CIPHER_CTX *)puVar29[2],out,(int *)local_6c,out,uVar25);
        if (iVar19 == 0) {
          return false;
        }
        if (local_6c[0] != uVar25) {
          return false;
        }
        param_2 = param_2 + 1;
        puVar29[0xf] = 0;
        if (0xf < uVar27) {
          do {
            auStack_98 = (undefined1  [8])param_2[1];
            local_a0 = (undefined1  [8])*param_2;
            auStack_88 = (undefined1  [8])param_2[1];
            _local_90 = *param_2;
            if (puVar29[5] == 0x10) {
              lVar24 = 0x20;
            }
            else {
              uStack_78 = param_2[1];
              local_80 = *param_2;
              lVar24 = 0x30;
            }
            local_6c[0] = 0x10;
            uVar33 = puVar29[0x11];
            uVar32 = puVar29[0x10];
            uVar35 = puVar29[0x13];
            uVar34 = puVar29[0x12];
            uVar25 = (uint)lVar24;
            puVar29[0x11] =
                 CONCAT17((byte)((ulong)uVar33 >> 0x38) ^ (byte)((ulong)auStack_98 >> 0x38),
                          CONCAT16((byte)((ulong)uVar33 >> 0x30) ^ (byte)((ulong)auStack_98 >> 0x30)
                                   ,CONCAT15((byte)((ulong)uVar33 >> 0x28) ^
                                             (byte)((ulong)auStack_98 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar33 >> 0x20) ^
                                                      (byte)((ulong)auStack_98 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar33 >> 0x18) ^
                                                               (byte)((ulong)auStack_98 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar33 >> 0x10
                                                                              ) ^ (byte)((ulong)
                                                  auStack_98 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar33 >> 8) ^
                                                           (byte)((ulong)auStack_98 >> 8),
                                                           (byte)uVar33 ^ SUB81(auStack_98,0))))))))
            ;
            puVar29[0x10] =
                 CONCAT17((byte)((ulong)uVar32 >> 0x38) ^ (byte)((ulong)local_a0 >> 0x38),
                          CONCAT16((byte)((ulong)uVar32 >> 0x30) ^ (byte)((ulong)local_a0 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar32 >> 0x28) ^
                                            (byte)((ulong)local_a0 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar32 >> 0x20) ^
                                                     (byte)((ulong)local_a0 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar32 >> 0x18) ^
                                                              (byte)((ulong)local_a0 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar32 >> 0x10)
                                                                       ^ (byte)((ulong)local_a0 >>
                                                                               0x10),
                                                                       CONCAT11((byte)((ulong)uVar32
                                                                                      >> 8) ^
                                                                                (byte)((ulong)
                                                  local_a0 >> 8),(byte)uVar32 ^ SUB81(local_a0,0))))
                                                  ))));
            puVar29[0x13] =
                 CONCAT17((byte)((ulong)uVar35 >> 0x38) ^ (byte)((ulong)auStack_88 >> 0x38),
                          CONCAT16((byte)((ulong)uVar35 >> 0x30) ^ (byte)((ulong)auStack_88 >> 0x30)
                                   ,CONCAT15((byte)((ulong)uVar35 >> 0x28) ^
                                             (byte)((ulong)auStack_88 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar35 >> 0x20) ^
                                                      (byte)((ulong)auStack_88 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar35 >> 0x18) ^
                                                               (byte)((ulong)auStack_88 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar35 >> 0x10
                                                                              ) ^ (byte)((ulong)
                                                  auStack_88 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar35 >> 8) ^
                                                           (byte)((ulong)auStack_88 >> 8),
                                                           (byte)uVar35 ^ SUB81(auStack_88,0))))))))
            ;
            puVar29[0x12] =
                 CONCAT17((byte)((ulong)uVar34 >> 0x38) ^ (byte)((ulong)_local_90 >> 0x38),
                          CONCAT16((byte)((ulong)uVar34 >> 0x30) ^ (byte)((ulong)_local_90 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar34 >> 0x28) ^
                                            (byte)((ulong)_local_90 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar34 >> 0x20) ^
                                                     (byte)((ulong)_local_90 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar34 >> 0x18) ^
                                                              (byte)((ulong)_local_90 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar34 >> 0x10)
                                                                       ^ (byte)((ulong)_local_90 >>
                                                                               0x10),
                                                                       CONCAT11((byte)((ulong)uVar34
                                                                                      >> 8) ^
                                                                                (byte)((ulong)
                                                  _local_90 >> 8),(byte)uVar34 ^ (byte)_local_90))))
                                           )));
            if (uVar25 != 0x20) {
              lVar24 = lVar24 + -0x20;
              pbVar21 = (byte *)&local_80;
              pbVar26 = (byte *)(puVar29 + 0x14);
              do {
                lVar24 = lVar24 + -1;
                *pbVar26 = *pbVar26 ^ *pbVar21;
                pbVar21 = pbVar21 + 1;
                pbVar26 = pbVar26 + 1;
              } while (lVar24 != 0);
            }
            iVar19 = EVP_CipherUpdate((EVP_CIPHER_CTX *)puVar29[2],out,(int *)local_6c,out,uVar25);
            if (iVar19 == 0) {
              return false;
            }
            if (local_6c[0] != uVar25) {
              return false;
            }
            uVar27 = uVar27 - 0x10;
            param_2 = param_2 + 2;
          } while (0xf < uVar27);
        }
        if (uVar27 == 0) goto LAB_00b57cec;
        lVar24 = puVar29[0xf];
      }
      memcpy((void *)((long)puVar29 + lVar24 + 100),param_2,uVar27);
      puVar29[0xf] = puVar29[0xf] + uVar27;
    }
LAB_00b57cec:
    if ((param_6 != (undefined8 *)0x0) && (uVar20 != 0)) {
      lVar24 = puVar29[0xf];
      if (lVar24 != 0) {
        uVar31 = 0x10 - lVar24;
        if (uVar31 <= uVar20) {
          memcpy((void *)((long)puVar29 + lVar24 + 100),param_6,uVar31);
          auStack_98 = *(undefined1 (*) [8])((long)puVar29 + 0x6c);
          local_a0 = (undefined1  [8])*puVar23;
          auStack_88 = *(undefined1 (*) [8])((long)puVar29 + 0x6c);
          _local_90 = *puVar23;
          if (puVar29[5] == 0x10) {
            lVar24 = 0x20;
          }
          else {
            lVar24 = 0x30;
            uStack_78 = *(undefined8 *)((long)puVar29 + 0x6c);
            local_80 = *puVar23;
          }
          local_6c[0] = 0x10;
          uVar33 = puVar29[0x11];
          uVar32 = puVar29[0x10];
          uVar35 = puVar29[0x13];
          uVar34 = puVar29[0x12];
          uVar25 = (uint)lVar24;
          puVar29[0x11] =
               CONCAT17((byte)((ulong)uVar33 >> 0x38) ^ (byte)((ulong)auStack_98 >> 0x38),
                        CONCAT16((byte)((ulong)uVar33 >> 0x30) ^ (byte)((ulong)auStack_98 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar33 >> 0x28) ^
                                          (byte)((ulong)auStack_98 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar33 >> 0x20) ^
                                                   (byte)((ulong)auStack_98 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar33 >> 0x18) ^
                                                            (byte)((ulong)auStack_98 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar33 >> 0x10) ^
                                                                     (byte)((ulong)auStack_98 >>
                                                                           0x10),
                                                                     CONCAT11((byte)((ulong)uVar33
                                                                                    >> 8) ^
                                                                              (byte)((ulong)
                                                  auStack_98 >> 8),
                                                  (byte)uVar33 ^ SUB81(auStack_98,0))))))));
          puVar29[0x10] =
               CONCAT17((byte)((ulong)uVar32 >> 0x38) ^ (byte)((ulong)local_a0 >> 0x38),
                        CONCAT16((byte)((ulong)uVar32 >> 0x30) ^ (byte)((ulong)local_a0 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar32 >> 0x28) ^
                                          (byte)((ulong)local_a0 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar32 >> 0x20) ^
                                                   (byte)((ulong)local_a0 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar32 >> 0x18) ^
                                                            (byte)((ulong)local_a0 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar32 >> 0x10) ^
                                                                     (byte)((ulong)local_a0 >> 0x10)
                                                                     ,CONCAT11((byte)((ulong)uVar32
                                                                                     >> 8) ^
                                                                               (byte)((ulong)
                                                  local_a0 >> 8),(byte)uVar32 ^ SUB81(local_a0,0))))
                                                  ))));
          puVar29[0x13] =
               CONCAT17((byte)((ulong)uVar35 >> 0x38) ^ (byte)((ulong)auStack_88 >> 0x38),
                        CONCAT16((byte)((ulong)uVar35 >> 0x30) ^ (byte)((ulong)auStack_88 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar35 >> 0x28) ^
                                          (byte)((ulong)auStack_88 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar35 >> 0x20) ^
                                                   (byte)((ulong)auStack_88 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar35 >> 0x18) ^
                                                            (byte)((ulong)auStack_88 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar35 >> 0x10) ^
                                                                     (byte)((ulong)auStack_88 >>
                                                                           0x10),
                                                                     CONCAT11((byte)((ulong)uVar35
                                                                                    >> 8) ^
                                                                              (byte)((ulong)
                                                  auStack_88 >> 8),
                                                  (byte)uVar35 ^ SUB81(auStack_88,0))))))));
          puVar29[0x12] =
               CONCAT17((byte)((ulong)uVar34 >> 0x38) ^ (byte)((ulong)_local_90 >> 0x38),
                        CONCAT16((byte)((ulong)uVar34 >> 0x30) ^ (byte)((ulong)_local_90 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar34 >> 0x28) ^
                                          (byte)((ulong)_local_90 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar34 >> 0x20) ^
                                                   (byte)((ulong)_local_90 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar34 >> 0x18) ^
                                                            (byte)((ulong)_local_90 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar34 >> 0x10) ^
                                                                     (byte)((ulong)_local_90 >> 0x10
                                                                           ),CONCAT11((byte)((ulong)
                                                  uVar34 >> 8) ^ (byte)((ulong)_local_90 >> 8),
                                                  (byte)uVar34 ^ (byte)_local_90)))))));
          if (uVar25 != 0x20) {
            lVar24 = lVar24 + -0x20;
            pbVar21 = (byte *)(puVar29 + 0x14);
            pbVar26 = (byte *)&local_80;
            do {
              lVar24 = lVar24 + -1;
              *pbVar21 = *pbVar21 ^ *pbVar26;
              pbVar21 = pbVar21 + 1;
              pbVar26 = pbVar26 + 1;
            } while (lVar24 != 0);
          }
          iVar19 = EVP_CipherUpdate((EVP_CIPHER_CTX *)puVar29[2],out,(int *)local_6c,out,uVar25);
          if (iVar19 == 0) {
            return false;
          }
          if (local_6c[0] != uVar25) {
            return false;
          }
          param_6 = (undefined8 *)((long)param_6 + uVar31);
          puVar29[0xf] = 0;
          uVar20 = uVar20 - uVar31;
        }
      }
      if (0xf < uVar20) {
        do {
          auStack_98 = (undefined1  [8])param_6[1];
          local_a0 = (undefined1  [8])*param_6;
          auStack_88 = (undefined1  [8])param_6[1];
          _local_90 = *param_6;
          if (puVar29[5] == 0x10) {
            lVar24 = 0x20;
          }
          else {
            lVar24 = 0x30;
            uStack_78 = param_6[1];
            local_80 = *param_6;
          }
          local_6c[0] = 0x10;
          uVar33 = puVar29[0x11];
          uVar32 = puVar29[0x10];
          uVar35 = puVar29[0x13];
          uVar34 = puVar29[0x12];
          uVar25 = (uint)lVar24;
          puVar29[0x11] =
               CONCAT17((byte)((ulong)uVar33 >> 0x38) ^ (byte)((ulong)auStack_98 >> 0x38),
                        CONCAT16((byte)((ulong)uVar33 >> 0x30) ^ (byte)((ulong)auStack_98 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar33 >> 0x28) ^
                                          (byte)((ulong)auStack_98 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar33 >> 0x20) ^
                                                   (byte)((ulong)auStack_98 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar33 >> 0x18) ^
                                                            (byte)((ulong)auStack_98 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar33 >> 0x10) ^
                                                                     (byte)((ulong)auStack_98 >>
                                                                           0x10),
                                                                     CONCAT11((byte)((ulong)uVar33
                                                                                    >> 8) ^
                                                                              (byte)((ulong)
                                                  auStack_98 >> 8),
                                                  (byte)uVar33 ^ SUB81(auStack_98,0))))))));
          puVar29[0x10] =
               CONCAT17((byte)((ulong)uVar32 >> 0x38) ^ (byte)((ulong)local_a0 >> 0x38),
                        CONCAT16((byte)((ulong)uVar32 >> 0x30) ^ (byte)((ulong)local_a0 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar32 >> 0x28) ^
                                          (byte)((ulong)local_a0 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar32 >> 0x20) ^
                                                   (byte)((ulong)local_a0 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar32 >> 0x18) ^
                                                            (byte)((ulong)local_a0 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar32 >> 0x10) ^
                                                                     (byte)((ulong)local_a0 >> 0x10)
                                                                     ,CONCAT11((byte)((ulong)uVar32
                                                                                     >> 8) ^
                                                                               (byte)((ulong)
                                                  local_a0 >> 8),(byte)uVar32 ^ SUB81(local_a0,0))))
                                                  ))));
          puVar29[0x13] =
               CONCAT17((byte)((ulong)uVar35 >> 0x38) ^ (byte)((ulong)auStack_88 >> 0x38),
                        CONCAT16((byte)((ulong)uVar35 >> 0x30) ^ (byte)((ulong)auStack_88 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar35 >> 0x28) ^
                                          (byte)((ulong)auStack_88 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar35 >> 0x20) ^
                                                   (byte)((ulong)auStack_88 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar35 >> 0x18) ^
                                                            (byte)((ulong)auStack_88 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar35 >> 0x10) ^
                                                                     (byte)((ulong)auStack_88 >>
                                                                           0x10),
                                                                     CONCAT11((byte)((ulong)uVar35
                                                                                    >> 8) ^
                                                                              (byte)((ulong)
                                                  auStack_88 >> 8),
                                                  (byte)uVar35 ^ SUB81(auStack_88,0))))))));
          puVar29[0x12] =
               CONCAT17((byte)((ulong)uVar34 >> 0x38) ^ (byte)((ulong)_local_90 >> 0x38),
                        CONCAT16((byte)((ulong)uVar34 >> 0x30) ^ (byte)((ulong)_local_90 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar34 >> 0x28) ^
                                          (byte)((ulong)_local_90 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar34 >> 0x20) ^
                                                   (byte)((ulong)_local_90 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar34 >> 0x18) ^
                                                            (byte)((ulong)_local_90 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar34 >> 0x10) ^
                                                                     (byte)((ulong)_local_90 >> 0x10
                                                                           ),CONCAT11((byte)((ulong)
                                                  uVar34 >> 8) ^ (byte)((ulong)_local_90 >> 8),
                                                  (byte)uVar34 ^ (byte)_local_90)))))));
          if (uVar25 != 0x20) {
            lVar24 = lVar24 + -0x20;
            pbVar21 = (byte *)&local_80;
            pbVar26 = (byte *)(puVar29 + 0x14);
            do {
              lVar24 = lVar24 + -1;
              *pbVar26 = *pbVar26 ^ *pbVar21;
              pbVar21 = pbVar21 + 1;
              pbVar26 = pbVar26 + 1;
            } while (lVar24 != 0);
          }
          iVar19 = EVP_CipherUpdate((EVP_CIPHER_CTX *)puVar29[2],out,(int *)local_6c,out,uVar25);
          if (iVar19 == 0) {
            return false;
          }
          if (local_6c[0] != uVar25) {
            return false;
          }
          uVar20 = uVar20 - 0x10;
          param_6 = param_6 + 2;
        } while (0xf < uVar20);
      }
      if (uVar20 != 0) {
        memcpy((void *)((long)puVar29 + puVar29[0xf] + 100),param_6,uVar20);
        puVar29[0xf] = puVar29[0xf] + uVar20;
      }
    }
    if ((param_4 == (undefined8 *)0x0) || (uVar22 == 0)) {
LAB_00b58240:
      lVar24 = puVar29[0xf];
      if (lVar24 == 0) goto LAB_00b58258;
LAB_00b58248:
      uVar31 = -lVar24 + 0x10;
      if (1 < uVar31) goto LAB_00b58258;
      memcpy((void *)((long)puVar29 + lVar24 + 100),&DAT_0077c244,uVar31);
      auStack_98 = *(undefined1 (*) [8])((long)puVar29 + 0x6c);
      local_a0 = (undefined1  [8])*puVar23;
      auStack_88 = *(undefined1 (*) [8])((long)puVar29 + 0x6c);
      _local_90 = *puVar23;
      if (puVar29[5] == 0x10) {
        lVar28 = 0x20;
      }
      else {
        lVar28 = 0x30;
        uStack_78 = *(undefined8 *)((long)puVar29 + 0x6c);
        local_80 = *puVar23;
      }
      local_6c[0] = 0x10;
      uVar33 = puVar29[0x11];
      uVar32 = puVar29[0x10];
      uVar35 = puVar29[0x13];
      uVar34 = puVar29[0x12];
      uVar25 = (uint)lVar28;
      puVar29[0x11] =
           CONCAT17((byte)((ulong)uVar33 >> 0x38) ^ (byte)((ulong)auStack_98 >> 0x38),
                    CONCAT16((byte)((ulong)uVar33 >> 0x30) ^ (byte)((ulong)auStack_98 >> 0x30),
                             CONCAT15((byte)((ulong)uVar33 >> 0x28) ^
                                      (byte)((ulong)auStack_98 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar33 >> 0x20) ^
                                               (byte)((ulong)auStack_98 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar33 >> 0x18) ^
                                                        (byte)((ulong)auStack_98 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar33 >> 0x10) ^
                                                                 (byte)((ulong)auStack_98 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar33 >> 8)
                                                                          ^ (byte)((ulong)auStack_98
                                                                                  >> 8),
                                                                          (byte)uVar33 ^
                                                                          SUB81(auStack_98,0))))))))
      ;
      puVar29[0x10] =
           CONCAT17((byte)((ulong)uVar32 >> 0x38) ^ (byte)((ulong)local_a0 >> 0x38),
                    CONCAT16((byte)((ulong)uVar32 >> 0x30) ^ (byte)((ulong)local_a0 >> 0x30),
                             CONCAT15((byte)((ulong)uVar32 >> 0x28) ^
                                      (byte)((ulong)local_a0 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar32 >> 0x20) ^
                                               (byte)((ulong)local_a0 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar32 >> 0x18) ^
                                                        (byte)((ulong)local_a0 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar32 >> 0x10) ^
                                                                 (byte)((ulong)local_a0 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar32 >> 8)
                                                                          ^ (byte)((ulong)local_a0
                                                                                  >> 8),
                                                                          (byte)uVar32 ^
                                                                          SUB81(local_a0,0))))))));
      puVar29[0x13] =
           CONCAT17((byte)((ulong)uVar35 >> 0x38) ^ (byte)((ulong)auStack_88 >> 0x38),
                    CONCAT16((byte)((ulong)uVar35 >> 0x30) ^ (byte)((ulong)auStack_88 >> 0x30),
                             CONCAT15((byte)((ulong)uVar35 >> 0x28) ^
                                      (byte)((ulong)auStack_88 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar35 >> 0x20) ^
                                               (byte)((ulong)auStack_88 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar35 >> 0x18) ^
                                                        (byte)((ulong)auStack_88 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar35 >> 0x10) ^
                                                                 (byte)((ulong)auStack_88 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar35 >> 8)
                                                                          ^ (byte)((ulong)auStack_88
                                                                                  >> 8),
                                                                          (byte)uVar35 ^
                                                                          SUB81(auStack_88,0))))))))
      ;
      puVar29[0x12] =
           CONCAT17((byte)((ulong)uVar34 >> 0x38) ^ (byte)((ulong)_local_90 >> 0x38),
                    CONCAT16((byte)((ulong)uVar34 >> 0x30) ^ (byte)((ulong)_local_90 >> 0x30),
                             CONCAT15((byte)((ulong)uVar34 >> 0x28) ^
                                      (byte)((ulong)_local_90 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar34 >> 0x20) ^
                                               (byte)((ulong)_local_90 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar34 >> 0x18) ^
                                                        (byte)((ulong)_local_90 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar34 >> 0x10) ^
                                                                 (byte)((ulong)_local_90 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar34 >> 8)
                                                                          ^ (byte)((ulong)_local_90
                                                                                  >> 8),
                                                                          (byte)uVar34 ^
                                                                          (byte)_local_90)))))));
      if (uVar25 != 0x20) {
        lVar28 = lVar28 + -0x20;
        pbVar21 = (byte *)(puVar29 + 0x14);
        pbVar26 = (byte *)&local_80;
        do {
          lVar28 = lVar28 + -1;
          *pbVar21 = *pbVar21 ^ *pbVar26;
          pbVar21 = pbVar21 + 1;
          pbVar26 = pbVar26 + 1;
        } while (lVar28 != 0);
      }
      iVar19 = EVP_CipherUpdate((EVP_CIPHER_CTX *)puVar29[2],out,(int *)local_6c,out,uVar25);
      if (iVar19 == 0) {
        return false;
      }
      if (local_6c[0] != uVar25) {
        return false;
      }
      __n = 1 - uVar31;
      puVar30 = (undefined8 *)(&DAT_0077c254 + -lVar24);
      puVar29[0xf] = 0;
      if (__n < 0x10) {
        lVar24 = 0;
        if (__n == 0) goto LAB_00b58284;
        goto LAB_00b58264;
      }
      do {
        auStack_98 = (undefined1  [8])puVar30[1];
        local_a0 = (undefined1  [8])*puVar30;
        auStack_88 = (undefined1  [8])puVar30[1];
        _local_90 = *puVar30;
        if (puVar29[5] == 0x10) {
          lVar24 = 0x20;
        }
        else {
          lVar24 = 0x30;
          uStack_78 = puVar30[1];
          local_80 = *puVar30;
        }
        local_6c[0] = 0x10;
        uVar33 = puVar29[0x11];
        uVar32 = puVar29[0x10];
        uVar35 = puVar29[0x13];
        uVar34 = puVar29[0x12];
        uVar25 = (uint)lVar24;
        puVar29[0x11] =
             CONCAT17((byte)((ulong)uVar33 >> 0x38) ^ (byte)((ulong)auStack_98 >> 0x38),
                      CONCAT16((byte)((ulong)uVar33 >> 0x30) ^ (byte)((ulong)auStack_98 >> 0x30),
                               CONCAT15((byte)((ulong)uVar33 >> 0x28) ^
                                        (byte)((ulong)auStack_98 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar33 >> 0x20) ^
                                                 (byte)((ulong)auStack_98 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar33 >> 0x18) ^
                                                          (byte)((ulong)auStack_98 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar33 >> 0x10) ^
                                                                   (byte)((ulong)auStack_98 >> 0x10)
                                                                   ,CONCAT11((byte)((ulong)uVar33 >>
                                                                                   8) ^
                                                                             (byte)((ulong)
                                                  auStack_98 >> 8),
                                                  (byte)uVar33 ^ SUB81(auStack_98,0))))))));
        puVar29[0x10] =
             CONCAT17((byte)((ulong)uVar32 >> 0x38) ^ (byte)((ulong)local_a0 >> 0x38),
                      CONCAT16((byte)((ulong)uVar32 >> 0x30) ^ (byte)((ulong)local_a0 >> 0x30),
                               CONCAT15((byte)((ulong)uVar32 >> 0x28) ^
                                        (byte)((ulong)local_a0 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar32 >> 0x20) ^
                                                 (byte)((ulong)local_a0 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar32 >> 0x18) ^
                                                          (byte)((ulong)local_a0 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar32 >> 0x10) ^
                                                                   (byte)((ulong)local_a0 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar32 >>
                                                                                  8) ^
                                                                            (byte)((ulong)local_a0
                                                                                  >> 8),
                                                                            (byte)uVar32 ^
                                                                            SUB81(local_a0,0))))))))
        ;
        puVar29[0x13] =
             CONCAT17((byte)((ulong)uVar35 >> 0x38) ^ (byte)((ulong)auStack_88 >> 0x38),
                      CONCAT16((byte)((ulong)uVar35 >> 0x30) ^ (byte)((ulong)auStack_88 >> 0x30),
                               CONCAT15((byte)((ulong)uVar35 >> 0x28) ^
                                        (byte)((ulong)auStack_88 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar35 >> 0x20) ^
                                                 (byte)((ulong)auStack_88 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar35 >> 0x18) ^
                                                          (byte)((ulong)auStack_88 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar35 >> 0x10) ^
                                                                   (byte)((ulong)auStack_88 >> 0x10)
                                                                   ,CONCAT11((byte)((ulong)uVar35 >>
                                                                                   8) ^
                                                                             (byte)((ulong)
                                                  auStack_88 >> 8),
                                                  (byte)uVar35 ^ SUB81(auStack_88,0))))))));
        puVar29[0x12] =
             CONCAT17((byte)((ulong)uVar34 >> 0x38) ^ (byte)((ulong)_local_90 >> 0x38),
                      CONCAT16((byte)((ulong)uVar34 >> 0x30) ^ (byte)((ulong)_local_90 >> 0x30),
                               CONCAT15((byte)((ulong)uVar34 >> 0x28) ^
                                        (byte)((ulong)_local_90 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar34 >> 0x20) ^
                                                 (byte)((ulong)_local_90 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar34 >> 0x18) ^
                                                          (byte)((ulong)_local_90 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar34 >> 0x10) ^
                                                                   (byte)((ulong)_local_90 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar34 >>
                                                                                  8) ^
                                                                            (byte)((ulong)_local_90
                                                                                  >> 8),
                                                                            (byte)uVar34 ^
                                                                            (byte)_local_90)))))));
        if (uVar25 != 0x20) {
          lVar24 = lVar24 + -0x20;
          pbVar21 = (byte *)&local_80;
          pbVar26 = (byte *)(puVar29 + 0x14);
          do {
            lVar24 = lVar24 + -1;
            *pbVar26 = *pbVar26 ^ *pbVar21;
            pbVar21 = pbVar21 + 1;
            pbVar26 = pbVar26 + 1;
          } while (lVar24 != 0);
        }
        iVar19 = EVP_CipherUpdate((EVP_CIPHER_CTX *)puVar29[2],out,(int *)local_6c,out,uVar25);
        if (iVar19 == 0) {
          return false;
        }
        if (local_6c[0] != uVar25) {
          return false;
        }
        __n = __n - 0x10;
        puVar30 = puVar30 + 2;
      } while (0xf < __n);
      lVar24 = puVar29[0xf];
      if (__n != 0) goto LAB_00b58264;
    }
    else {
      lVar24 = puVar29[0xf];
      if (lVar24 != 0) {
        uVar31 = 0x10 - lVar24;
        if (uVar31 <= uVar22) {
          memcpy((void *)((long)puVar29 + lVar24 + 100),param_4,uVar31);
          auStack_98 = *(undefined1 (*) [8])((long)puVar29 + 0x6c);
          local_a0 = (undefined1  [8])*puVar23;
          auStack_88 = *(undefined1 (*) [8])((long)puVar29 + 0x6c);
          _local_90 = *puVar23;
          if (puVar29[5] == 0x10) {
            lVar24 = 0x20;
          }
          else {
            lVar24 = 0x30;
            uStack_78 = *(undefined8 *)((long)puVar29 + 0x6c);
            local_80 = *puVar23;
          }
          local_6c[0] = 0x10;
          uVar33 = puVar29[0x11];
          uVar32 = puVar29[0x10];
          uVar35 = puVar29[0x13];
          uVar34 = puVar29[0x12];
          uVar25 = (uint)lVar24;
          puVar29[0x11] =
               CONCAT17((byte)((ulong)uVar33 >> 0x38) ^ (byte)((ulong)auStack_98 >> 0x38),
                        CONCAT16((byte)((ulong)uVar33 >> 0x30) ^ (byte)((ulong)auStack_98 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar33 >> 0x28) ^
                                          (byte)((ulong)auStack_98 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar33 >> 0x20) ^
                                                   (byte)((ulong)auStack_98 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar33 >> 0x18) ^
                                                            (byte)((ulong)auStack_98 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar33 >> 0x10) ^
                                                                     (byte)((ulong)auStack_98 >>
                                                                           0x10),
                                                                     CONCAT11((byte)((ulong)uVar33
                                                                                    >> 8) ^
                                                                              (byte)((ulong)
                                                  auStack_98 >> 8),
                                                  (byte)uVar33 ^ SUB81(auStack_98,0))))))));
          puVar29[0x10] =
               CONCAT17((byte)((ulong)uVar32 >> 0x38) ^ (byte)((ulong)local_a0 >> 0x38),
                        CONCAT16((byte)((ulong)uVar32 >> 0x30) ^ (byte)((ulong)local_a0 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar32 >> 0x28) ^
                                          (byte)((ulong)local_a0 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar32 >> 0x20) ^
                                                   (byte)((ulong)local_a0 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar32 >> 0x18) ^
                                                            (byte)((ulong)local_a0 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar32 >> 0x10) ^
                                                                     (byte)((ulong)local_a0 >> 0x10)
                                                                     ,CONCAT11((byte)((ulong)uVar32
                                                                                     >> 8) ^
                                                                               (byte)((ulong)
                                                  local_a0 >> 8),(byte)uVar32 ^ SUB81(local_a0,0))))
                                                  ))));
          puVar29[0x13] =
               CONCAT17((byte)((ulong)uVar35 >> 0x38) ^ (byte)((ulong)auStack_88 >> 0x38),
                        CONCAT16((byte)((ulong)uVar35 >> 0x30) ^ (byte)((ulong)auStack_88 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar35 >> 0x28) ^
                                          (byte)((ulong)auStack_88 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar35 >> 0x20) ^
                                                   (byte)((ulong)auStack_88 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar35 >> 0x18) ^
                                                            (byte)((ulong)auStack_88 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar35 >> 0x10) ^
                                                                     (byte)((ulong)auStack_88 >>
                                                                           0x10),
                                                                     CONCAT11((byte)((ulong)uVar35
                                                                                    >> 8) ^
                                                                              (byte)((ulong)
                                                  auStack_88 >> 8),
                                                  (byte)uVar35 ^ SUB81(auStack_88,0))))))));
          puVar29[0x12] =
               CONCAT17((byte)((ulong)uVar34 >> 0x38) ^ (byte)((ulong)_local_90 >> 0x38),
                        CONCAT16((byte)((ulong)uVar34 >> 0x30) ^ (byte)((ulong)_local_90 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar34 >> 0x28) ^
                                          (byte)((ulong)_local_90 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar34 >> 0x20) ^
                                                   (byte)((ulong)_local_90 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar34 >> 0x18) ^
                                                            (byte)((ulong)_local_90 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar34 >> 0x10) ^
                                                                     (byte)((ulong)_local_90 >> 0x10
                                                                           ),CONCAT11((byte)((ulong)
                                                  uVar34 >> 8) ^ (byte)((ulong)_local_90 >> 8),
                                                  (byte)uVar34 ^ (byte)_local_90)))))));
          if (uVar25 != 0x20) {
            lVar24 = lVar24 + -0x20;
            pbVar21 = (byte *)(puVar29 + 0x14);
            pbVar26 = (byte *)&local_80;
            do {
              lVar24 = lVar24 + -1;
              *pbVar21 = *pbVar21 ^ *pbVar26;
              pbVar21 = pbVar21 + 1;
              pbVar26 = pbVar26 + 1;
            } while (lVar24 != 0);
          }
          iVar19 = EVP_CipherUpdate((EVP_CIPHER_CTX *)puVar29[2],out,(int *)local_6c,out,uVar25);
          if (iVar19 == 0) {
            return false;
          }
          if (local_6c[0] != uVar25) {
            return false;
          }
          param_4 = (undefined8 *)((long)param_4 + uVar31);
          puVar29[0xf] = 0;
          uVar22 = uVar22 - uVar31;
        }
      }
      if (0xf < uVar22) {
        do {
          auStack_98 = (undefined1  [8])param_4[1];
          local_a0 = (undefined1  [8])*param_4;
          auStack_88 = (undefined1  [8])param_4[1];
          _local_90 = *param_4;
          if (puVar29[5] == 0x10) {
            lVar24 = 0x20;
          }
          else {
            lVar24 = 0x30;
            uStack_78 = param_4[1];
            local_80 = *param_4;
          }
          local_6c[0] = 0x10;
          uVar33 = puVar29[0x11];
          uVar32 = puVar29[0x10];
          uVar35 = puVar29[0x13];
          uVar34 = puVar29[0x12];
          uVar25 = (uint)lVar24;
          puVar29[0x11] =
               CONCAT17((byte)((ulong)uVar33 >> 0x38) ^ (byte)((ulong)auStack_98 >> 0x38),
                        CONCAT16((byte)((ulong)uVar33 >> 0x30) ^ (byte)((ulong)auStack_98 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar33 >> 0x28) ^
                                          (byte)((ulong)auStack_98 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar33 >> 0x20) ^
                                                   (byte)((ulong)auStack_98 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar33 >> 0x18) ^
                                                            (byte)((ulong)auStack_98 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar33 >> 0x10) ^
                                                                     (byte)((ulong)auStack_98 >>
                                                                           0x10),
                                                                     CONCAT11((byte)((ulong)uVar33
                                                                                    >> 8) ^
                                                                              (byte)((ulong)
                                                  auStack_98 >> 8),
                                                  (byte)uVar33 ^ SUB81(auStack_98,0))))))));
          puVar29[0x10] =
               CONCAT17((byte)((ulong)uVar32 >> 0x38) ^ (byte)((ulong)local_a0 >> 0x38),
                        CONCAT16((byte)((ulong)uVar32 >> 0x30) ^ (byte)((ulong)local_a0 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar32 >> 0x28) ^
                                          (byte)((ulong)local_a0 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar32 >> 0x20) ^
                                                   (byte)((ulong)local_a0 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar32 >> 0x18) ^
                                                            (byte)((ulong)local_a0 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar32 >> 0x10) ^
                                                                     (byte)((ulong)local_a0 >> 0x10)
                                                                     ,CONCAT11((byte)((ulong)uVar32
                                                                                     >> 8) ^
                                                                               (byte)((ulong)
                                                  local_a0 >> 8),(byte)uVar32 ^ SUB81(local_a0,0))))
                                                  ))));
          puVar29[0x13] =
               CONCAT17((byte)((ulong)uVar35 >> 0x38) ^ (byte)((ulong)auStack_88 >> 0x38),
                        CONCAT16((byte)((ulong)uVar35 >> 0x30) ^ (byte)((ulong)auStack_88 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar35 >> 0x28) ^
                                          (byte)((ulong)auStack_88 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar35 >> 0x20) ^
                                                   (byte)((ulong)auStack_88 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar35 >> 0x18) ^
                                                            (byte)((ulong)auStack_88 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar35 >> 0x10) ^
                                                                     (byte)((ulong)auStack_88 >>
                                                                           0x10),
                                                                     CONCAT11((byte)((ulong)uVar35
                                                                                    >> 8) ^
                                                                              (byte)((ulong)
                                                  auStack_88 >> 8),
                                                  (byte)uVar35 ^ SUB81(auStack_88,0))))))));
          puVar29[0x12] =
               CONCAT17((byte)((ulong)uVar34 >> 0x38) ^ (byte)((ulong)_local_90 >> 0x38),
                        CONCAT16((byte)((ulong)uVar34 >> 0x30) ^ (byte)((ulong)_local_90 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar34 >> 0x28) ^
                                          (byte)((ulong)_local_90 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar34 >> 0x20) ^
                                                   (byte)((ulong)_local_90 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar34 >> 0x18) ^
                                                            (byte)((ulong)_local_90 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar34 >> 0x10) ^
                                                                     (byte)((ulong)_local_90 >> 0x10
                                                                           ),CONCAT11((byte)((ulong)
                                                  uVar34 >> 8) ^ (byte)((ulong)_local_90 >> 8),
                                                  (byte)uVar34 ^ (byte)_local_90)))))));
          if (uVar25 != 0x20) {
            lVar24 = lVar24 + -0x20;
            pbVar21 = (byte *)&local_80;
            pbVar26 = (byte *)(puVar29 + 0x14);
            do {
              lVar24 = lVar24 + -1;
              *pbVar26 = *pbVar26 ^ *pbVar21;
              pbVar21 = pbVar21 + 1;
              pbVar26 = pbVar26 + 1;
            } while (lVar24 != 0);
          }
          iVar19 = EVP_CipherUpdate((EVP_CIPHER_CTX *)puVar29[2],out,(int *)local_6c,out,uVar25);
          if (iVar19 == 0) {
            return false;
          }
          if (local_6c[0] != uVar25) {
            return false;
          }
          uVar22 = uVar22 - 0x10;
          param_4 = param_4 + 2;
        } while (0xf < uVar22);
      }
      if (uVar22 == 0) goto LAB_00b58240;
      memcpy((void *)((long)puVar29 + puVar29[0xf] + 100),param_4,uVar22);
      lVar24 = puVar29[0xf] + uVar22;
      puVar29[0xf] = lVar24;
      if (lVar24 != 0) goto LAB_00b58248;
LAB_00b58258:
      puVar30 = (undefined8 *)&DAT_0077c244;
      __n = 1;
LAB_00b58264:
      memcpy((void *)((long)puVar29 + lVar24 + 100),puVar30,__n);
      lVar24 = puVar29[0xf] + __n;
      puVar29[0xf] = lVar24;
    }
LAB_00b58284:
    if (lVar24 != 0) {
      memset((void *)((long)puVar29 + lVar24 + 100),0,0x10 - lVar24);
      auStack_98 = *(undefined1 (*) [8])((long)puVar29 + 0x6c);
      local_a0 = (undefined1  [8])*puVar23;
      auStack_88 = *(undefined1 (*) [8])((long)puVar29 + 0x6c);
      _local_90 = *puVar23;
      if (puVar29[5] == 0x10) {
        lVar24 = 0x20;
      }
      else {
        lVar24 = 0x30;
        uStack_78 = *(undefined8 *)((long)puVar29 + 0x6c);
        local_80 = *puVar23;
      }
      local_6c[0] = 0x10;
      uVar33 = puVar29[0x11];
      uVar32 = puVar29[0x10];
      uVar35 = puVar29[0x13];
      uVar34 = puVar29[0x12];
      uVar25 = (uint)lVar24;
      puVar29[0x11] =
           CONCAT17((byte)((ulong)uVar33 >> 0x38) ^ (byte)((ulong)auStack_98 >> 0x38),
                    CONCAT16((byte)((ulong)uVar33 >> 0x30) ^ (byte)((ulong)auStack_98 >> 0x30),
                             CONCAT15((byte)((ulong)uVar33 >> 0x28) ^
                                      (byte)((ulong)auStack_98 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar33 >> 0x20) ^
                                               (byte)((ulong)auStack_98 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar33 >> 0x18) ^
                                                        (byte)((ulong)auStack_98 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar33 >> 0x10) ^
                                                                 (byte)((ulong)auStack_98 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar33 >> 8)
                                                                          ^ (byte)((ulong)auStack_98
                                                                                  >> 8),
                                                                          (byte)uVar33 ^
                                                                          SUB81(auStack_98,0))))))))
      ;
      puVar29[0x10] =
           CONCAT17((byte)((ulong)uVar32 >> 0x38) ^ (byte)((ulong)local_a0 >> 0x38),
                    CONCAT16((byte)((ulong)uVar32 >> 0x30) ^ (byte)((ulong)local_a0 >> 0x30),
                             CONCAT15((byte)((ulong)uVar32 >> 0x28) ^
                                      (byte)((ulong)local_a0 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar32 >> 0x20) ^
                                               (byte)((ulong)local_a0 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar32 >> 0x18) ^
                                                        (byte)((ulong)local_a0 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar32 >> 0x10) ^
                                                                 (byte)((ulong)local_a0 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar32 >> 8)
                                                                          ^ (byte)((ulong)local_a0
                                                                                  >> 8),
                                                                          (byte)uVar32 ^
                                                                          SUB81(local_a0,0))))))));
      puVar29[0x13] =
           CONCAT17((byte)((ulong)uVar35 >> 0x38) ^ (byte)((ulong)auStack_88 >> 0x38),
                    CONCAT16((byte)((ulong)uVar35 >> 0x30) ^ (byte)((ulong)auStack_88 >> 0x30),
                             CONCAT15((byte)((ulong)uVar35 >> 0x28) ^
                                      (byte)((ulong)auStack_88 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar35 >> 0x20) ^
                                               (byte)((ulong)auStack_88 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar35 >> 0x18) ^
                                                        (byte)((ulong)auStack_88 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar35 >> 0x10) ^
                                                                 (byte)((ulong)auStack_88 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar35 >> 8)
                                                                          ^ (byte)((ulong)auStack_88
                                                                                  >> 8),
                                                                          (byte)uVar35 ^
                                                                          SUB81(auStack_88,0))))))))
      ;
      puVar29[0x12] =
           CONCAT17((byte)((ulong)uVar34 >> 0x38) ^ (byte)((ulong)_local_90 >> 0x38),
                    CONCAT16((byte)((ulong)uVar34 >> 0x30) ^ (byte)((ulong)_local_90 >> 0x30),
                             CONCAT15((byte)((ulong)uVar34 >> 0x28) ^
                                      (byte)((ulong)_local_90 >> 0x28),
                                      CONCAT14((byte)((ulong)uVar34 >> 0x20) ^
                                               (byte)((ulong)_local_90 >> 0x20),
                                               CONCAT13((byte)((ulong)uVar34 >> 0x18) ^
                                                        (byte)((ulong)_local_90 >> 0x18),
                                                        CONCAT12((byte)((ulong)uVar34 >> 0x10) ^
                                                                 (byte)((ulong)_local_90 >> 0x10),
                                                                 CONCAT11((byte)((ulong)uVar34 >> 8)
                                                                          ^ (byte)((ulong)_local_90
                                                                                  >> 8),
                                                                          (byte)uVar34 ^
                                                                          (byte)_local_90)))))));
      if (uVar25 != 0x20) {
        lVar24 = lVar24 + -0x20;
        pbVar21 = (byte *)(puVar29 + 0x14);
        pbVar26 = (byte *)&local_80;
        do {
          lVar24 = lVar24 + -1;
          *pbVar21 = *pbVar21 ^ *pbVar26;
          pbVar21 = pbVar21 + 1;
          pbVar26 = pbVar26 + 1;
        } while (lVar24 != 0);
      }
      iVar19 = EVP_CipherUpdate((EVP_CIPHER_CTX *)puVar29[2],out,(int *)local_6c,out,uVar25);
      if (iVar19 == 0) {
        return false;
      }
      if (local_6c[0] != uVar25) {
        return false;
      }
    }
    iVar19 = EVP_CipherInit_ex((EVP_CIPHER_CTX *)*puVar29,(EVP_CIPHER *)0x0,(ENGINE *)0x0,out,
                               (uchar *)0x0,-1);
    if (((iVar19 == 0) ||
        (iVar19 = EVP_CipherUpdate((EVP_CIPHER_CTX *)*puVar29,out,&local_a4,
                                   (uchar *)((long)puVar29 + puVar29[5] + 0x80),0x10), iVar19 == 0))
       || (local_a4 != 0x10)) {
      return false;
    }
    iVar19 = EVP_CipherUpdate((EVP_CIPHER_CTX *)*puVar29,(uchar *)(puVar29 + 0x12),&local_a4,out,
                              0x10);
    if (iVar19 == 0) {
      return false;
    }
    if (local_a4 != 0x10) {
      return false;
    }
    if (puVar29[5] != 0x10) {
      iVar19 = EVP_CipherUpdate((EVP_CIPHER_CTX *)*puVar29,(uchar *)(puVar29 + 0x14),&local_a4,
                                (uchar *)(puVar29 + 0x12),0x10);
      if (iVar19 == 0) {
        return false;
      }
      if (local_a4 != 0x10) {
        return false;
      }
    }
  }
  if ((param_3 == 0) || (uVar31 = *(ulong *)(param_1 + 0xe8), uVar31 == 0)) goto LAB_00b57b24;
  uVar22 = puVar29[5];
  uVar20 = uVar31;
  if (uVar22 <= uVar31) {
    uVar20 = uVar22;
  }
  if (uVar20 != 0) {
    uVar22 = 0;
    if (uVar20 < 0x20) {
LAB_00b57748:
      do {
        uVar27 = uVar22 + 1;
        *(byte *)((long)puVar29 + uVar22 + 0x34) =
             *(byte *)((long)puVar29 + uVar22 + 0x34) ^ *(byte *)((long)puVar29 + uVar22 + 0x80);
        uVar22 = uVar27;
      } while (uVar27 < uVar20);
    }
    else {
      uVar22 = uVar20 & 0xffffffffffffffe0;
      puVar23 = puVar29 + 0x10;
      uVar27 = uVar22;
      do {
        uVar33 = puVar23[1];
        uVar32 = *puVar23;
        uVar35 = puVar23[3];
        uVar34 = puVar23[2];
        uVar37 = *(undefined8 *)((long)puVar23 + -0x44);
        uVar36 = *(undefined8 *)((long)puVar23 + -0x4c);
        uVar39 = *(undefined8 *)((long)puVar23 + -0x34);
        uVar38 = *(undefined8 *)((long)puVar23 + -0x3c);
        uVar27 = uVar27 - 0x20;
        *(ulong *)((long)puVar23 + -0x44) =
             CONCAT17((byte)((ulong)uVar37 >> 0x38) ^ (byte)((ulong)uVar33 >> 0x38),
                      CONCAT16((byte)((ulong)uVar37 >> 0x30) ^ (byte)((ulong)uVar33 >> 0x30),
                               CONCAT15((byte)((ulong)uVar37 >> 0x28) ^
                                        (byte)((ulong)uVar33 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar37 >> 0x20) ^
                                                 (byte)((ulong)uVar33 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar37 >> 0x18) ^
                                                          (byte)((ulong)uVar33 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar37 >> 0x10) ^
                                                                   (byte)((ulong)uVar33 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar37 >>
                                                                                  8) ^
                                                                            (byte)((ulong)uVar33 >>
                                                                                  8),(byte)uVar37 ^
                                                                                     (byte)uVar33)))
                                                ))));
        *(ulong *)((long)puVar23 + -0x4c) =
             CONCAT17((byte)((ulong)uVar36 >> 0x38) ^ (byte)((ulong)uVar32 >> 0x38),
                      CONCAT16((byte)((ulong)uVar36 >> 0x30) ^ (byte)((ulong)uVar32 >> 0x30),
                               CONCAT15((byte)((ulong)uVar36 >> 0x28) ^
                                        (byte)((ulong)uVar32 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar36 >> 0x20) ^
                                                 (byte)((ulong)uVar32 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar36 >> 0x18) ^
                                                          (byte)((ulong)uVar32 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar36 >> 0x10) ^
                                                                   (byte)((ulong)uVar32 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar36 >>
                                                                                  8) ^
                                                                            (byte)((ulong)uVar32 >>
                                                                                  8),(byte)uVar36 ^
                                                                                     (byte)uVar32)))
                                                ))));
        *(ulong *)((long)puVar23 + -0x34) =
             CONCAT17((byte)((ulong)uVar39 >> 0x38) ^ (byte)((ulong)uVar35 >> 0x38),
                      CONCAT16((byte)((ulong)uVar39 >> 0x30) ^ (byte)((ulong)uVar35 >> 0x30),
                               CONCAT15((byte)((ulong)uVar39 >> 0x28) ^
                                        (byte)((ulong)uVar35 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar39 >> 0x20) ^
                                                 (byte)((ulong)uVar35 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar39 >> 0x18) ^
                                                          (byte)((ulong)uVar35 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar39 >> 0x10) ^
                                                                   (byte)((ulong)uVar35 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar39 >>
                                                                                  8) ^
                                                                            (byte)((ulong)uVar35 >>
                                                                                  8),(byte)uVar39 ^
                                                                                     (byte)uVar35)))
                                                ))));
        *(ulong *)((long)puVar23 + -0x3c) =
             CONCAT17((byte)((ulong)uVar38 >> 0x38) ^ (byte)((ulong)uVar34 >> 0x38),
                      CONCAT16((byte)((ulong)uVar38 >> 0x30) ^ (byte)((ulong)uVar34 >> 0x30),
                               CONCAT15((byte)((ulong)uVar38 >> 0x28) ^
                                        (byte)((ulong)uVar34 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar38 >> 0x20) ^
                                                 (byte)((ulong)uVar34 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar38 >> 0x18) ^
                                                          (byte)((ulong)uVar34 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar38 >> 0x10) ^
                                                                   (byte)((ulong)uVar34 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar38 >>
                                                                                  8) ^
                                                                            (byte)((ulong)uVar34 >>
                                                                                  8),(byte)uVar38 ^
                                                                                     (byte)uVar34)))
                                                ))));
        puVar23 = puVar23 + 4;
      } while (uVar27 != 0);
      if (uVar20 != uVar22) goto LAB_00b57748;
    }
    uVar22 = puVar29[5];
  }
  uVar20 = uVar31 - uVar22;
  if (uVar22 <= uVar31 && uVar20 != 0) {
    if (0xf < uVar20) {
      uVar20 = 0x10;
    }
    if (uVar20 != 0) {
      if (0x1f < uVar20) {
        uVar31 = (uVar22 - 1) - uVar31;
        if (uVar31 < 0xfffffffffffffff0) {
          uVar31 = 0xffffffffffffffef;
        }
        if (((long)puVar29 + ((uVar22 + 0x7f) - uVar31) <= (long)puVar29 + 0x54U) ||
           ((long)puVar29 + (0x53 - uVar31) <= (long)puVar29 + uVar22 + 0x80)) {
          lVar24 = 0;
          do {
            lVar28 = lVar24 + uVar22;
            uVar33 = *(undefined8 *)((long)puVar29 + lVar28 + 0x88);
            uVar32 = *(undefined8 *)((long)puVar29 + lVar28 + 0x80);
            uVar35 = *(undefined8 *)((long)puVar29 + lVar28 + 0x98);
            uVar34 = *(undefined8 *)((long)puVar29 + lVar28 + 0x90);
            uVar37 = *(undefined8 *)((long)puVar29 + lVar24 + 0x5c);
            uVar36 = *(undefined8 *)((long)puVar29 + lVar24 + 0x54);
            uVar39 = *(undefined8 *)((long)puVar29 + lVar24 + 0x6c);
            uVar38 = *(undefined8 *)((long)puVar29 + lVar24 + 100);
            lVar28 = lVar24 + 0x20;
            *(ulong *)((long)puVar29 + lVar24 + 0x5c) =
                 CONCAT17((byte)((ulong)uVar37 >> 0x38) ^ (byte)((ulong)uVar33 >> 0x38),
                          CONCAT16((byte)((ulong)uVar37 >> 0x30) ^ (byte)((ulong)uVar33 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar37 >> 0x28) ^
                                            (byte)((ulong)uVar33 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar37 >> 0x20) ^
                                                     (byte)((ulong)uVar33 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar37 >> 0x18) ^
                                                              (byte)((ulong)uVar33 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar37 >> 0x10)
                                                                       ^ (byte)((ulong)uVar33 >>
                                                                               0x10),
                                                                       CONCAT11((byte)((ulong)uVar37
                                                                                      >> 8) ^
                                                                                (byte)((ulong)uVar33
                                                                                      >> 8),
                                                                                (byte)uVar37 ^
                                                                                (byte)uVar33)))))));
            *(ulong *)((long)puVar29 + lVar24 + 0x54) =
                 CONCAT17((byte)((ulong)uVar36 >> 0x38) ^ (byte)((ulong)uVar32 >> 0x38),
                          CONCAT16((byte)((ulong)uVar36 >> 0x30) ^ (byte)((ulong)uVar32 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar36 >> 0x28) ^
                                            (byte)((ulong)uVar32 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar36 >> 0x20) ^
                                                     (byte)((ulong)uVar32 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar36 >> 0x18) ^
                                                              (byte)((ulong)uVar32 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar36 >> 0x10)
                                                                       ^ (byte)((ulong)uVar32 >>
                                                                               0x10),
                                                                       CONCAT11((byte)((ulong)uVar36
                                                                                      >> 8) ^
                                                                                (byte)((ulong)uVar32
                                                                                      >> 8),
                                                                                (byte)uVar36 ^
                                                                                (byte)uVar32)))))));
            *(ulong *)((long)puVar29 + lVar24 + 0x6c) =
                 CONCAT17((byte)((ulong)uVar39 >> 0x38) ^ (byte)((ulong)uVar35 >> 0x38),
                          CONCAT16((byte)((ulong)uVar39 >> 0x30) ^ (byte)((ulong)uVar35 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar39 >> 0x28) ^
                                            (byte)((ulong)uVar35 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar39 >> 0x20) ^
                                                     (byte)((ulong)uVar35 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar39 >> 0x18) ^
                                                              (byte)((ulong)uVar35 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar39 >> 0x10)
                                                                       ^ (byte)((ulong)uVar35 >>
                                                                               0x10),
                                                                       CONCAT11((byte)((ulong)uVar39
                                                                                      >> 8) ^
                                                                                (byte)((ulong)uVar35
                                                                                      >> 8),
                                                                                (byte)uVar39 ^
                                                                                (byte)uVar35)))))));
            *(ulong *)((long)puVar29 + lVar24 + 100) =
                 CONCAT17((byte)((ulong)uVar38 >> 0x38) ^ (byte)((ulong)uVar34 >> 0x38),
                          CONCAT16((byte)((ulong)uVar38 >> 0x30) ^ (byte)((ulong)uVar34 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar38 >> 0x28) ^
                                            (byte)((ulong)uVar34 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar38 >> 0x20) ^
                                                     (byte)((ulong)uVar34 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar38 >> 0x18) ^
                                                              (byte)((ulong)uVar34 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar38 >> 0x10)
                                                                       ^ (byte)((ulong)uVar34 >>
                                                                               0x10),
                                                                       CONCAT11((byte)((ulong)uVar38
                                                                                      >> 8) ^
                                                                                (byte)((ulong)uVar34
                                                                                      >> 8),
                                                                                (byte)uVar38 ^
                                                                                (byte)uVar34)))))));
            lVar24 = lVar28;
          } while (lVar28 != 0);
          if (uVar20 == 0) goto LAB_00b57b24;
        }
      }
      uVar31 = 0;
      do {
        *(byte *)((long)puVar29 + uVar31 + 0x54) =
             *(byte *)((long)puVar29 + uVar31 + 0x54) ^
             *(byte *)((long)puVar29 + uVar31 + uVar22 + 0x80);
        uVar31 = uVar31 + 1;
      } while (uVar31 < uVar20);
    }
  }
LAB_00b57b24:
  iVar19 = EVP_CipherInit_ex((EVP_CIPHER_CTX *)*puVar29,(EVP_CIPHER *)0x0,(ENGINE *)0x0,key,
                             (uchar *)0x0,-1);
  bVar17 = false;
  if (iVar19 != 0) {
    iVar19 = EVP_CipherInit_ex((EVP_CIPHER_CTX *)puVar29[1],(EVP_CIPHER *)0x0,(ENGINE *)0x0,key,
                               (uchar *)0x0,-1);
    bVar17 = iVar19 != 0;
  }
  return bVar17;
}


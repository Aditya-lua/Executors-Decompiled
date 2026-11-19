/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a91f44
 */

ulong FUN_00a91f44(long param_1,undefined8 *param_2,ulong param_3,size_t param_4)

{
  long lVar1;
  byte bVar2;
  bool bVar3;
  int iVar4;
  void *pvVar5;
  long lVar6;
  ulong uVar7;
  undefined8 *puVar8;
  byte *pbVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  ulong uVar12;
  long lVar13;
  ulong uVar14;
  int *piVar15;
  byte *a;
  ulong uVar16;
  undefined4 *puVar17;
  size_t sVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 auStack_108 [6];
  byte abStack_d8 [8];
  byte abStack_d0 [8];
  byte abStack_c8 [16];
  undefined8 auStack_b8 [11];
  
  lVar13 = *(long *)(param_1 + 0x78);
  uVar14 = *(ulong *)(lVar13 + 200);
  if (*(int *)(lVar13 + 0xbc) == 0) {
    if ((param_2 == (undefined8 *)0x0) || (uVar14 == 0xffffffffffffffff)) {
      puVar17 = (undefined4 *)(lVar13 + 0x20);
      *puVar17 = 0;
      ChaCha20_ctr32(lVar13 + 0x30,&DAT_0076e670,0x40,lVar13,puVar17);
      Poly1305_Init(lVar13 + 0xd0,lVar13 + 0x30);
      *puVar17 = 1;
      *(undefined4 *)(lVar13 + 0x70) = 0;
      *(undefined8 *)(lVar13 + 0xa8) = 0;
      *(undefined8 *)(lVar13 + 0xb0) = 0;
      *(undefined4 *)(lVar13 + 0xbc) = 1;
      if (uVar14 != 0xffffffffffffffff) {
        Poly1305_Update(lVar13 + 0xd0,lVar13 + 0x94,0xd);
        *(undefined8 *)(lVar13 + 0xa8) = 0xd;
        *(undefined4 *)(lVar13 + 0xb8) = 1;
      }
      goto joined_r0x00a921fc;
    }
    if (uVar14 + 0x10 == param_4) {
      uVar16 = (ulong)(uint)-(int)auStack_108 & 0xc;
      pvVar5 = (void *)((long)auStack_108 + uVar16);
      pbVar9 = abStack_c8 + uVar16;
      puVar17 = (undefined4 *)(lVar13 + 0x20);
      *puVar17 = 0;
      if (uVar14 < 0x41) {
        ChaCha20_ctr32(pvVar5,&DAT_0076e670,0x80,lVar13,puVar17);
        Poly1305_Init(lVar13 + 0xd0,pvVar5);
        uVar19 = *(undefined8 *)(lVar13 + 0x94);
        *(undefined4 *)(lVar13 + 0x70) = 0;
        *(undefined8 *)(abStack_d8 + uVar16 + 8) = *(undefined8 *)(lVar13 + 0x9c);
        *(undefined8 *)(abStack_d8 + uVar16) = uVar19;
        *(undefined8 *)(lVar13 + 0xa8) = 0xd;
        *(ulong *)(lVar13 + 0xb0) = uVar14;
        if (*(int *)(param_1 + 0x10) == 0) {
          if (uVar14 != 0) {
            uVar7 = 0;
            if ((0x1f < uVar14) &&
               (((undefined8 *)(param_3 + uVar14) <= param_2 ||
                (uVar7 = 0, (long)param_2 + uVar14 <= param_3)))) {
              uVar7 = uVar14 & 0xffffffffffffffe0;
              puVar8 = (undefined8 *)(param_3 + 0x10);
              puVar10 = (undefined8 *)((long)auStack_b8 + uVar16);
              puVar11 = param_2 + 2;
              uVar12 = uVar7;
              do {
                uVar20 = puVar8[-1];
                uVar19 = puVar8[-2];
                uVar22 = puVar8[1];
                uVar21 = *puVar8;
                uVar24 = puVar10[-1];
                uVar23 = puVar10[-2];
                uVar26 = puVar10[1];
                uVar25 = *puVar10;
                puVar8 = puVar8 + 4;
                uVar12 = uVar12 - 0x20;
                puVar11[-1] = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar20 >> 0x38)
                                       ,CONCAT16((byte)((ulong)uVar24 >> 0x30) ^
                                                 (byte)((ulong)uVar20 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                                          (byte)((ulong)uVar20 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                                   (byte)((ulong)uVar20 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar24 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar20 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar24 >> 0x10) ^ (byte)((ulong)uVar20 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar24 >> 8) ^
                                                           (byte)((ulong)uVar20 >> 8),
                                                           (byte)uVar24 ^ (byte)uVar20)))))));
                puVar11[-2] = CONCAT17((byte)((ulong)uVar23 >> 0x38) ^ (byte)((ulong)uVar19 >> 0x38)
                                       ,CONCAT16((byte)((ulong)uVar23 >> 0x30) ^
                                                 (byte)((ulong)uVar19 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar23 >> 0x28) ^
                                                          (byte)((ulong)uVar19 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar23 >> 0x20) ^
                                                                   (byte)((ulong)uVar19 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar23 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar19 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar23 >> 0x10) ^ (byte)((ulong)uVar19 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar23 >> 8) ^
                                                           (byte)((ulong)uVar19 >> 8),
                                                           (byte)uVar23 ^ (byte)uVar19)))))));
                puVar11[1] = CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                                      CONCAT16((byte)((ulong)uVar26 >> 0x30) ^
                                               (byte)((ulong)uVar22 >> 0x30),
                                               CONCAT15((byte)((ulong)uVar26 >> 0x28) ^
                                                        (byte)((ulong)uVar22 >> 0x28),
                                                        CONCAT14((byte)((ulong)uVar26 >> 0x20) ^
                                                                 (byte)((ulong)uVar22 >> 0x20),
                                                                 CONCAT13((byte)((ulong)uVar26 >>
                                                                                0x18) ^
                                                                          (byte)((ulong)uVar22 >>
                                                                                0x18),
                                                                          CONCAT12((byte)((ulong)
                                                  uVar26 >> 0x10) ^ (byte)((ulong)uVar22 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar26 >> 8) ^
                                                           (byte)((ulong)uVar22 >> 8),
                                                           (byte)uVar26 ^ (byte)uVar22)))))));
                *puVar11 = CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ (byte)((ulong)uVar21 >> 0x38),
                                    CONCAT16((byte)((ulong)uVar25 >> 0x30) ^
                                             (byte)((ulong)uVar21 >> 0x30),
                                             CONCAT15((byte)((ulong)uVar25 >> 0x28) ^
                                                      (byte)((ulong)uVar21 >> 0x28),
                                                      CONCAT14((byte)((ulong)uVar25 >> 0x20) ^
                                                               (byte)((ulong)uVar21 >> 0x20),
                                                               CONCAT13((byte)((ulong)uVar25 >> 0x18
                                                                              ) ^ (byte)((ulong)
                                                  uVar21 >> 0x18),
                                                  CONCAT12((byte)((ulong)uVar25 >> 0x10) ^
                                                           (byte)((ulong)uVar21 >> 0x10),
                                                           CONCAT11((byte)((ulong)uVar25 >> 8) ^
                                                                    (byte)((ulong)uVar21 >> 8),
                                                                    (byte)uVar25 ^ (byte)uVar21)))))
                                            ));
                puVar10[-1] = uVar20;
                puVar10[-2] = uVar19;
                puVar10[1] = uVar22;
                *puVar10 = uVar21;
                puVar10 = puVar10 + 4;
                puVar11 = puVar11 + 4;
              } while (uVar12 != 0);
              if (uVar14 == uVar7) goto LAB_00a924f0;
            }
            do {
              lVar6 = uVar7 + (uVar16 - 0x108);
              bVar2 = *(byte *)(param_3 + uVar7);
              *(byte *)((long)param_2 + uVar7) = abStack_c8[lVar6 + 0x108] ^ bVar2;
              uVar7 = uVar7 + 1;
              abStack_c8[lVar6 + 0x108] = bVar2;
            } while (uVar14 != uVar7);
          }
        }
        else if (uVar14 != 0) {
          uVar7 = 0;
          if ((0x1f < uVar14) &&
             (((undefined8 *)(param_3 + uVar14) <= param_2 ||
              (uVar7 = 0, (long)param_2 + uVar14 <= param_3)))) {
            uVar7 = uVar14 & 0xffffffffffffffe0;
            puVar8 = (undefined8 *)(param_3 + 0x10);
            puVar10 = (undefined8 *)((long)auStack_b8 + uVar16);
            puVar11 = param_2 + 2;
            uVar12 = uVar7;
            do {
              uVar20 = puVar8[-1];
              uVar19 = puVar8[-2];
              uVar22 = puVar8[1];
              uVar21 = *puVar8;
              uVar24 = puVar10[-1];
              uVar23 = puVar10[-2];
              uVar26 = puVar10[1];
              uVar25 = *puVar10;
              puVar8 = puVar8 + 4;
              uVar12 = uVar12 - 0x20;
              uVar19 = CONCAT17((byte)((ulong)uVar23 >> 0x38) ^ (byte)((ulong)uVar19 >> 0x38),
                                CONCAT16((byte)((ulong)uVar23 >> 0x30) ^
                                         (byte)((ulong)uVar19 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar23 >> 0x28) ^
                                                  (byte)((ulong)uVar19 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar23 >> 0x20) ^
                                                           (byte)((ulong)uVar19 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar23 >> 0x18) ^
                                                                    (byte)((ulong)uVar19 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar23 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar19 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar23 >> 8) ^ (byte)((ulong)uVar19 >> 8),
                                                  (byte)uVar23 ^ (byte)uVar19)))))));
              uVar20 = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar20 >> 0x38),
                                CONCAT16((byte)((ulong)uVar24 >> 0x30) ^
                                         (byte)((ulong)uVar20 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                                  (byte)((ulong)uVar20 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                           (byte)((ulong)uVar20 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar24 >> 0x18) ^
                                                                    (byte)((ulong)uVar20 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar24 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar20 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar24 >> 8) ^ (byte)((ulong)uVar20 >> 8),
                                                  (byte)uVar24 ^ (byte)uVar20)))))));
              uVar21 = CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ (byte)((ulong)uVar21 >> 0x38),
                                CONCAT16((byte)((ulong)uVar25 >> 0x30) ^
                                         (byte)((ulong)uVar21 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar25 >> 0x28) ^
                                                  (byte)((ulong)uVar21 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar25 >> 0x20) ^
                                                           (byte)((ulong)uVar21 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar25 >> 0x18) ^
                                                                    (byte)((ulong)uVar21 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar25 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar21 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar25 >> 8) ^ (byte)((ulong)uVar21 >> 8),
                                                  (byte)uVar25 ^ (byte)uVar21)))))));
              uVar22 = CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)((ulong)uVar22 >> 0x38),
                                CONCAT16((byte)((ulong)uVar26 >> 0x30) ^
                                         (byte)((ulong)uVar22 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar26 >> 0x28) ^
                                                  (byte)((ulong)uVar22 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar26 >> 0x20) ^
                                                           (byte)((ulong)uVar22 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar26 >> 0x18) ^
                                                                    (byte)((ulong)uVar22 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar26 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar22 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar26 >> 8) ^ (byte)((ulong)uVar22 >> 8),
                                                  (byte)uVar26 ^ (byte)uVar22)))))));
              puVar10[-1] = uVar20;
              puVar10[-2] = uVar19;
              puVar10[1] = uVar22;
              *puVar10 = uVar21;
              puVar11[-1] = uVar20;
              puVar11[-2] = uVar19;
              puVar11[1] = uVar22;
              *puVar11 = uVar21;
              puVar10 = puVar10 + 4;
              puVar11 = puVar11 + 4;
            } while (uVar12 != 0);
            if (uVar14 == uVar7) goto LAB_00a924f0;
          }
          do {
            lVar6 = uVar7 + (uVar16 - 0x108);
            bVar2 = abStack_c8[lVar6 + 0x108] ^ *(byte *)(param_3 + uVar7);
            abStack_c8[lVar6 + 0x108] = bVar2;
            *(byte *)((long)param_2 + uVar7) = bVar2;
            uVar7 = uVar7 + 1;
          } while (uVar14 != uVar7);
        }
LAB_00a924f0:
        uVar7 = (ulong)(uint)-(int)uVar14 & 0xf;
        memset(pbVar9 + uVar14,0,uVar7);
        lVar1 = uVar7 + uVar14;
        lVar6 = lVar1 + 0x20;
        sVar18 = 0x80;
        pbVar9 = pbVar9 + lVar1;
        a = abStack_d8 + uVar16;
      }
      else {
        ChaCha20_ctr32(pvVar5,&DAT_0076e670,0x40,lVar13,puVar17);
        lVar6 = lVar13 + 0xd0;
        Poly1305_Init(lVar6,pvVar5);
        *(undefined4 *)(lVar13 + 0x70) = 0;
        *(undefined4 *)(lVar13 + 0x20) = 1;
        Poly1305_Update(lVar6,lVar13 + 0x94,0x10);
        *(undefined8 *)(lVar13 + 0xa8) = 0xd;
        *(ulong *)(lVar13 + 0xb0) = uVar14;
        if (*(int *)(param_1 + 0x10) == 0) {
          Poly1305_Update(lVar6,param_3,uVar14);
          ChaCha20_ctr32(param_2,param_3,uVar14,lVar13,puVar17);
        }
        else {
          ChaCha20_ctr32(param_2,param_3,uVar14,lVar13,puVar17);
          Poly1305_Update(lVar6,param_2,uVar14);
        }
        Poly1305_Update(lVar6,&DAT_0076e670,-(int)uVar14 & 0xf);
        sVar18 = 0x40;
        lVar6 = 0x10;
        a = pbVar9;
      }
      uVar19 = *(undefined8 *)(lVar13 + 0xa8);
      param_2 = (undefined8 *)((long)param_2 + uVar14);
      *(undefined8 *)(pbVar9 + 8) = *(undefined8 *)(lVar13 + 0xb0);
      *(undefined8 *)pbVar9 = uVar19;
      Poly1305_Update(lVar13 + 0xd0,a,lVar6);
      OPENSSL_cleanse(pvVar5,sVar18);
      pbVar9 = a;
      if (*(int *)(param_1 + 0x10) != 0) {
        pbVar9 = (byte *)(lVar13 + 0x84);
      }
      Poly1305_Final(lVar13 + 0xd0,pbVar9);
      *(undefined8 *)(lVar13 + 200) = 0xffffffffffffffff;
      if (*(int *)(param_1 + 0x10) != 0) {
        uVar19 = *(undefined8 *)(lVar13 + 0x84);
        param_2[1] = *(undefined8 *)(lVar13 + 0x8c);
        *param_2 = uVar19;
        goto LAB_00a925a4;
      }
      iVar4 = CRYPTO_memcmp(a,(void *)(param_3 + uVar14),0x10);
      if (iVar4 == 0) goto LAB_00a925a4;
      sVar18 = param_4 - 0x10;
      pvVar5 = (void *)((long)param_2 + (0x10 - param_4));
      goto LAB_00a9259c;
    }
  }
  else {
joined_r0x00a921fc:
    if (param_3 == 0) {
      bVar3 = uVar14 == param_4;
      iVar4 = *(int *)(lVar13 + 0xb8);
      pvVar5 = (void *)0x0;
      sVar18 = uVar14;
    }
    else {
      if (param_2 == (undefined8 *)0x0) {
        Poly1305_Update(lVar13 + 0xd0,param_3,param_4);
        *(undefined4 *)(lVar13 + 0xb8) = 1;
        *(size_t *)(lVar13 + 0xa8) = *(long *)(lVar13 + 0xa8) + param_4;
        goto LAB_00a925a4;
      }
      piVar15 = (int *)(lVar13 + 0xb8);
      if (*piVar15 != 0) {
        uVar16 = *(ulong *)(lVar13 + 0xa8) & 0xf;
        if (uVar16 != 0) {
          Poly1305_Update(lVar13 + 0xd0,&DAT_0076e670,0x10 - uVar16);
        }
        *piVar15 = 0;
      }
      *(undefined8 *)(lVar13 + 200) = 0xffffffffffffffff;
      sVar18 = param_4;
      if ((uVar14 != 0xffffffffffffffff) && (sVar18 = uVar14, uVar14 + 0x10 != param_4))
      goto LAB_00a925a0;
      if (*(int *)(param_1 + 0x10) == 0) {
        Poly1305_Update(lVar13 + 0xd0,param_3,sVar18);
        FUN_00a91b2c(param_1,param_2,param_3,sVar18);
      }
      else {
        FUN_00a91b2c(param_1,param_2,param_3,sVar18);
        Poly1305_Update(lVar13 + 0xd0,param_2,sVar18);
      }
      *(size_t *)(lVar13 + 0xb0) = *(long *)(lVar13 + 0xb0) + sVar18;
      if (sVar18 == param_4) goto LAB_00a925a4;
      bVar3 = false;
      param_2 = (undefined8 *)((long)param_2 + sVar18);
      pvVar5 = (void *)(param_3 + sVar18);
      iVar4 = *piVar15;
    }
    if (iVar4 != 0) {
      uVar14 = *(ulong *)(lVar13 + 0xa8) & 0xf;
      if (uVar14 != 0) {
        Poly1305_Update(lVar13 + 0xd0,&DAT_0076e670,0x10 - uVar14);
      }
      *(undefined4 *)(lVar13 + 0xb8) = 0;
    }
    lVar6 = lVar13 + 0xd0;
    uVar14 = *(ulong *)(lVar13 + 0xb0) & 0xf;
    if (uVar14 != 0) {
      Poly1305_Update(lVar6,&DAT_0076e670,0x10 - uVar14);
    }
    Poly1305_Update(lVar6,lVar13 + 0xa8,0x10);
    puVar8 = (undefined8 *)(lVar13 + 0x84);
    puVar10 = auStack_108;
    if (*(int *)(param_1 + 0x10) != 0) {
      puVar10 = puVar8;
    }
    Poly1305_Final(lVar6,puVar10);
    *(undefined4 *)(lVar13 + 0xbc) = 0;
    if ((bool)(bVar3 | pvVar5 == (void *)0x0)) {
      if ((*(int *)(param_1 + 0x10) != 0) ||
         (iVar4 = CRYPTO_memcmp(auStack_108,puVar8,(long)*(int *)(lVar13 + 0xc0)), iVar4 == 0))
      goto LAB_00a925a4;
    }
    else {
      if (*(int *)(param_1 + 0x10) != 0) {
        uVar19 = *puVar8;
        param_2[1] = *(undefined8 *)(lVar13 + 0x8c);
        *param_2 = uVar19;
        goto LAB_00a925a4;
      }
      iVar4 = CRYPTO_memcmp(auStack_108,pvVar5,0x10);
      if (iVar4 == 0) goto LAB_00a925a4;
      pvVar5 = (void *)((long)param_2 - sVar18);
LAB_00a9259c:
      memset(pvVar5,0,sVar18);
    }
  }
LAB_00a925a0:
  param_4 = 0xffffffff;
LAB_00a925a4:
  return param_4 & 0xffffffff;
}


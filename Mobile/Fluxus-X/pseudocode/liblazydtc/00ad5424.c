/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad5424
 */

uint RSA_padding_check_PKCS1_OAEP_mgf1
               (byte *param_1,uint param_2,long param_3,uint param_4,int param_5,void *param_6,
               int param_7,EVP_MD *param_8,EVP_MD *param_9)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  EVP_MD *dgst;
  byte bVar4;
  int num;
  uint uVar5;
  int iVar6;
  uint uVar7;
  ulong seedlen;
  byte *mask;
  long lVar8;
  void *pvVar9;
  int iVar10;
  uint uVar11;
  byte *pbVar12;
  ulong uVar13;
  ulong uVar14;
  uint uVar15;
  long lVar16;
  byte *pbVar17;
  undefined8 *puVar18;
  byte *pbVar19;
  ulong uVar20;
  uint uVar21;
  byte *pbVar22;
  size_t len;
  uint uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  uchar auStack_ec [64];
  byte local_ac [8];
  undefined8 auStack_a4 [7];
  uint local_6c;
  
  if (param_8 == (EVP_MD *)0x0) {
    param_8 = EVP_sha1();
  }
  dgst = param_8;
  if (param_9 != (EVP_MD *)0x0) {
    dgst = param_9;
  }
  uVar5 = EVP_MD_get_size(param_8);
  if ((int)param_2 < 1) {
    return 0xffffffff;
  }
  if ((int)param_4 < 1) {
    return 0xffffffff;
  }
  if ((param_5 < (int)param_4) || (param_5 < (int)(uVar5 * 2 + 2))) {
    ERR_new(0xffffffff);
    ERR_set_debug("crypto/rsa/rsa_oaep.c",200,"RSA_padding_check_PKCS1_OAEP_mgf1");
    ERR_set_error(4,0x79,0);
    return 0xffffffff;
  }
  iVar10 = param_5 - uVar5;
  num = iVar10 + -1;
  seedlen = (ulong)num;
  mask = CRYPTO_malloc(num,"crypto/rsa/rsa_oaep.c",0xcd);
  if (mask == (byte *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_oaep.c",0xcf,"RSA_padding_check_PKCS1_OAEP_mgf1");
    ERR_set_error(4,0xc0100,0);
    uVar7 = 0;
    pbVar12 = (byte *)0x0;
  }
  else {
    lVar8 = (long)param_5;
    pvVar9 = CRYPTO_malloc(param_5,"crypto/rsa/rsa_oaep.c",0xd3);
    if (pvVar9 == (void *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_oaep.c",0xd5,"RSA_padding_check_PKCS1_OAEP_mgf1");
      ERR_set_error(4,0xc0100,0);
      uVar7 = 0;
      pbVar12 = (byte *)0x0;
    }
    else {
      if (0 < param_5) {
        pbVar12 = (byte *)(param_3 + (int)param_4);
        lVar16 = lVar8 + -1;
        lVar8 = lVar16 - (ulong)(param_5 - 1U);
        pbVar22 = (byte *)((long)pvVar9 + lVar16);
        iVar6 = param_5;
        do {
          uVar7 = param_4 - 1 & (param_4 ^ 0xffffffff);
          uVar23 = ((int)uVar7 >> 0x1f ^ 0xffffffffU) & 1;
          pbVar12 = pbVar12 + -(ulong)uVar23;
          param_4 = param_4 - uVar23;
          iVar6 = iVar6 + -1;
          *pbVar22 = *pbVar12 & ((byte)((int)uVar7 >> 0x1f) ^ 0xff);
          pbVar22 = pbVar22 + -1;
        } while (iVar6 != 0);
      }
      pbVar12 = (byte *)((long)pvVar9 + lVar8);
      pbVar22 = pbVar12 + 1;
      bVar4 = *pbVar12;
      len = (size_t)(int)uVar5;
      uVar7 = (int)(bVar4 - 1) >> 0x1f;
      iVar6 = PKCS1_MGF1(local_ac,len,pbVar22 + len,seedlen,dgst);
      if (iVar6 == 0) {
        if (0 < (int)uVar5) {
          uVar14 = 0;
          uVar13 = (ulong)uVar5;
          if ((0x1f < uVar5) &&
             ((pbVar12 + uVar13 + 1 <= local_ac || (uVar14 = 0, local_ac + uVar13 <= pbVar22)))) {
            uVar14 = uVar13 & 0xffffffe0;
            puVar18 = auStack_a4 + 1;
            pbVar19 = pbVar12 + 0x11;
            uVar20 = uVar14;
            do {
              uVar25 = *(undefined8 *)(pbVar19 + -8);
              uVar24 = *(undefined8 *)(pbVar19 + -0x10);
              uVar27 = *(undefined8 *)(pbVar19 + 8);
              uVar26 = *(undefined8 *)pbVar19;
              uVar29 = puVar18[-1];
              uVar28 = puVar18[-2];
              uVar31 = puVar18[1];
              uVar30 = *puVar18;
              pbVar19 = pbVar19 + 0x20;
              uVar20 = uVar20 - 0x20;
              puVar18[-1] = CONCAT17((byte)((ulong)uVar29 >> 0x38) ^ (byte)((ulong)uVar25 >> 0x38),
                                     CONCAT16((byte)((ulong)uVar29 >> 0x30) ^
                                              (byte)((ulong)uVar25 >> 0x30),
                                              CONCAT15((byte)((ulong)uVar29 >> 0x28) ^
                                                       (byte)((ulong)uVar25 >> 0x28),
                                                       CONCAT14((byte)((ulong)uVar29 >> 0x20) ^
                                                                (byte)((ulong)uVar25 >> 0x20),
                                                                CONCAT13((byte)((ulong)uVar29 >>
                                                                               0x18) ^
                                                                         (byte)((ulong)uVar25 >>
                                                                               0x18),
                                                                         CONCAT12((byte)((ulong)
                                                  uVar29 >> 0x10) ^ (byte)((ulong)uVar25 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar29 >> 8) ^
                                                           (byte)((ulong)uVar25 >> 8),
                                                           (byte)uVar29 ^ (byte)uVar25)))))));
              puVar18[-2] = CONCAT17((byte)((ulong)uVar28 >> 0x38) ^ (byte)((ulong)uVar24 >> 0x38),
                                     CONCAT16((byte)((ulong)uVar28 >> 0x30) ^
                                              (byte)((ulong)uVar24 >> 0x30),
                                              CONCAT15((byte)((ulong)uVar28 >> 0x28) ^
                                                       (byte)((ulong)uVar24 >> 0x28),
                                                       CONCAT14((byte)((ulong)uVar28 >> 0x20) ^
                                                                (byte)((ulong)uVar24 >> 0x20),
                                                                CONCAT13((byte)((ulong)uVar28 >>
                                                                               0x18) ^
                                                                         (byte)((ulong)uVar24 >>
                                                                               0x18),
                                                                         CONCAT12((byte)((ulong)
                                                  uVar28 >> 0x10) ^ (byte)((ulong)uVar24 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar28 >> 8) ^
                                                           (byte)((ulong)uVar24 >> 8),
                                                           (byte)uVar28 ^ (byte)uVar24)))))));
              puVar18[1] = CONCAT17((byte)((ulong)uVar31 >> 0x38) ^ (byte)((ulong)uVar27 >> 0x38),
                                    CONCAT16((byte)((ulong)uVar31 >> 0x30) ^
                                             (byte)((ulong)uVar27 >> 0x30),
                                             CONCAT15((byte)((ulong)uVar31 >> 0x28) ^
                                                      (byte)((ulong)uVar27 >> 0x28),
                                                      CONCAT14((byte)((ulong)uVar31 >> 0x20) ^
                                                               (byte)((ulong)uVar27 >> 0x20),
                                                               CONCAT13((byte)((ulong)uVar31 >> 0x18
                                                                              ) ^ (byte)((ulong)
                                                  uVar27 >> 0x18),
                                                  CONCAT12((byte)((ulong)uVar31 >> 0x10) ^
                                                           (byte)((ulong)uVar27 >> 0x10),
                                                           CONCAT11((byte)((ulong)uVar31 >> 8) ^
                                                                    (byte)((ulong)uVar27 >> 8),
                                                                    (byte)uVar31 ^ (byte)uVar27)))))
                                            ));
              *puVar18 = CONCAT17((byte)((ulong)uVar30 >> 0x38) ^ (byte)((ulong)uVar26 >> 0x38),
                                  CONCAT16((byte)((ulong)uVar30 >> 0x30) ^
                                           (byte)((ulong)uVar26 >> 0x30),
                                           CONCAT15((byte)((ulong)uVar30 >> 0x28) ^
                                                    (byte)((ulong)uVar26 >> 0x28),
                                                    CONCAT14((byte)((ulong)uVar30 >> 0x20) ^
                                                             (byte)((ulong)uVar26 >> 0x20),
                                                             CONCAT13((byte)((ulong)uVar30 >> 0x18)
                                                                      ^ (byte)((ulong)uVar26 >> 0x18
                                                                              ),
                                                                      CONCAT12((byte)((ulong)uVar30
                                                                                     >> 0x10) ^
                                                                               (byte)((ulong)uVar26
                                                                                     >> 0x10),
                                                                               CONCAT11((byte)((
                                                  ulong)uVar30 >> 8) ^ (byte)((ulong)uVar26 >> 8),
                                                  (byte)uVar30 ^ (byte)uVar26)))))));
              puVar18 = puVar18 + 4;
            } while (uVar20 != 0);
            if (uVar14 == uVar13) goto LAB_00ad56fc;
          }
          lVar8 = uVar13 - uVar14;
          pbVar19 = pbVar12 + uVar14;
          pbVar17 = local_ac + uVar14;
          do {
            pbVar19 = pbVar19 + 1;
            lVar8 = lVar8 + -1;
            *pbVar17 = *pbVar17 ^ *pbVar19;
            pbVar17 = pbVar17 + 1;
          } while (lVar8 != 0);
        }
LAB_00ad56fc:
        iVar6 = PKCS1_MGF1(mask,seedlen,local_ac,len,dgst);
        if (iVar6 == 0) {
          if (1 < iVar10) {
            uVar13 = seedlen;
            if ((long)seedlen < 2) {
              uVar13 = 1;
            }
            uVar14 = 0;
            if (0x1f < uVar13) {
              uVar20 = seedlen;
              if ((long)seedlen < 2) {
                uVar20 = 1;
              }
              if ((pbVar12 + uVar20 + len + 1 <= mask) ||
                 (uVar14 = 0, mask + uVar20 <= pbVar22 + len)) {
                uVar14 = uVar13 & 0x7fffffffffffffe0;
                pbVar22 = mask + 0x10;
                pbVar19 = pbVar12 + len + 0x11;
                uVar20 = uVar14;
                do {
                  uVar25 = *(undefined8 *)(pbVar19 + -8);
                  uVar24 = *(undefined8 *)(pbVar19 + -0x10);
                  uVar27 = *(undefined8 *)(pbVar19 + 8);
                  uVar26 = *(undefined8 *)pbVar19;
                  uVar29 = *(undefined8 *)(pbVar22 + -8);
                  uVar28 = *(undefined8 *)(pbVar22 + -0x10);
                  uVar31 = *(undefined8 *)(pbVar22 + 8);
                  uVar30 = *(undefined8 *)pbVar22;
                  pbVar19 = pbVar19 + 0x20;
                  uVar20 = uVar20 - 0x20;
                  *(ulong *)(pbVar22 + -8) =
                       CONCAT17((byte)((ulong)uVar29 >> 0x38) ^ (byte)((ulong)uVar25 >> 0x38),
                                CONCAT16((byte)((ulong)uVar29 >> 0x30) ^
                                         (byte)((ulong)uVar25 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar29 >> 0x28) ^
                                                  (byte)((ulong)uVar25 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar29 >> 0x20) ^
                                                           (byte)((ulong)uVar25 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar29 >> 0x18) ^
                                                                    (byte)((ulong)uVar25 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar29 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar25 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar29 >> 8) ^ (byte)((ulong)uVar25 >> 8),
                                                  (byte)uVar29 ^ (byte)uVar25)))))));
                  *(ulong *)(pbVar22 + -0x10) =
                       CONCAT17((byte)((ulong)uVar28 >> 0x38) ^ (byte)((ulong)uVar24 >> 0x38),
                                CONCAT16((byte)((ulong)uVar28 >> 0x30) ^
                                         (byte)((ulong)uVar24 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar28 >> 0x28) ^
                                                  (byte)((ulong)uVar24 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar28 >> 0x20) ^
                                                           (byte)((ulong)uVar24 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar28 >> 0x18) ^
                                                                    (byte)((ulong)uVar24 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar28 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar24 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar28 >> 8) ^ (byte)((ulong)uVar24 >> 8),
                                                  (byte)uVar28 ^ (byte)uVar24)))))));
                  *(ulong *)(pbVar22 + 8) =
                       CONCAT17((byte)((ulong)uVar31 >> 0x38) ^ (byte)((ulong)uVar27 >> 0x38),
                                CONCAT16((byte)((ulong)uVar31 >> 0x30) ^
                                         (byte)((ulong)uVar27 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar31 >> 0x28) ^
                                                  (byte)((ulong)uVar27 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar31 >> 0x20) ^
                                                           (byte)((ulong)uVar27 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar31 >> 0x18) ^
                                                                    (byte)((ulong)uVar27 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar31 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar27 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar31 >> 8) ^ (byte)((ulong)uVar27 >> 8),
                                                  (byte)uVar31 ^ (byte)uVar27)))))));
                  *(ulong *)pbVar22 =
                       CONCAT17((byte)((ulong)uVar30 >> 0x38) ^ (byte)((ulong)uVar26 >> 0x38),
                                CONCAT16((byte)((ulong)uVar30 >> 0x30) ^
                                         (byte)((ulong)uVar26 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar30 >> 0x28) ^
                                                  (byte)((ulong)uVar26 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar30 >> 0x20) ^
                                                           (byte)((ulong)uVar26 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar30 >> 0x18) ^
                                                                    (byte)((ulong)uVar26 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar30 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar26 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar30 >> 8) ^ (byte)((ulong)uVar26 >> 8),
                                                  (byte)uVar30 ^ (byte)uVar26)))))));
                  pbVar22 = pbVar22 + 0x20;
                } while (uVar20 != 0);
                if (uVar13 == uVar14) goto LAB_00ad5854;
              }
            }
            do {
              mask[uVar14] = mask[uVar14] ^ pbVar12[uVar14 + len + 1];
              uVar14 = uVar14 + 1;
            } while ((long)uVar14 < (long)seedlen);
          }
LAB_00ad5854:
          iVar6 = EVP_Digest(param_6,(long)param_7,auStack_ec,(uint *)0x0,param_8,(ENGINE *)0x0);
          if (iVar6 != 0) {
            uVar7 = CRYPTO_memcmp(mask,auStack_ec,len);
            uVar7 = (int)(bVar4 - 1 & uVar7 - 1 & (uVar7 ^ 0xffffffff)) >> 0x1f;
            if ((int)uVar5 < num) {
              uVar15 = 0;
              uVar11 = 0;
              iVar6 = (param_5 - 1U) + uVar5 * -2;
              pbVar22 = mask + len;
              uVar23 = uVar5;
              do {
                iVar6 = iVar6 + -1;
                uVar2 = (int)((*pbVar22 ^ 1) - 1) >> 0x1f;
                uVar3 = uVar2 & (uVar15 ^ 0xffffffff);
                uVar15 = uVar2 | uVar15;
                uVar7 = (uVar15 | (int)(*pbVar22 - 1) >> 0x1f) & uVar7;
                uVar11 = ~uVar3 & uVar11 | uVar3 & uVar23;
                uVar23 = uVar23 + 1;
                pbVar22 = pbVar22 + 1;
              } while (iVar6 != 0);
            }
            else {
              uVar11 = 0;
              uVar15 = 0;
            }
            uVar3 = (num - uVar5) - 1;
            uVar2 = (int)((uVar3 - param_2 ^ param_2 | uVar3 ^ param_2) ^ uVar3) >> 0x1f;
            local_6c = ~uVar2;
            uVar23 = (iVar10 + -2) - uVar11;
            uVar2 = local_6c & param_2 | uVar2 & uVar3;
            if (2 < (int)(num - uVar5)) {
              uVar21 = 1;
              do {
                if ((int)(uVar5 + 1) < (int)(num - uVar21)) {
                  uVar1 = uVar21 & uVar3 - uVar23;
                  uVar1 = uVar1 - 1 & (uVar1 ^ 0x80000000);
                  bVar4 = (byte)((int)uVar1 >> 0x1f);
                  local_6c = (int)uVar1 >> 0x1f | 0xffffff00;
                  iVar10 = (param_5 + -2 + uVar5 * -2) - uVar21;
                  pbVar22 = mask + (int)(uVar5 + 1);
                  do {
                    iVar10 = iVar10 + -1;
                    *pbVar22 = bVar4 & *pbVar22 | (bVar4 ^ 0xff) & pbVar22[(int)uVar21];
                    pbVar22 = pbVar22 + 1;
                  } while (iVar10 != 0);
                }
                uVar21 = uVar21 * 2;
              } while ((int)uVar21 < (int)uVar3);
            }
            uVar7 = uVar15 & uVar7 &
                    ((int)((param_2 - uVar23 ^ uVar23 | uVar23 ^ param_2) ^ param_2) >> 0x1f ^
                    0xffffffffU);
            if (0 < (int)uVar2) {
              uVar13 = (ulong)uVar2;
              do {
                uVar5 = uVar5 + 1;
                uVar15 = uVar7 & 0xff & (int)((uVar11 - param_5) + uVar5 + 1 | uVar23) >> 0x1f;
                local_6c = ~uVar15;
                uVar13 = uVar13 - 1;
                *param_1 = (byte)local_6c & *param_1 | (byte)uVar15 & mask[(int)uVar5];
                param_1 = param_1 + 1;
              } while (uVar13 != 0);
            }
            ERR_new();
            ERR_set_debug("crypto/rsa/rsa_oaep.c",0x13a,"RSA_padding_check_PKCS1_OAEP_mgf1");
            ERR_set_error(4,0x79,0);
            err_clear_last_constant_time(uVar7 & 1);
            goto LAB_00ad5720;
          }
        }
      }
    }
  }
  uVar23 = 0xffffffff;
LAB_00ad5720:
  OPENSSL_cleanse(local_ac,0x40);
  CRYPTO_clear_free(mask,seedlen,"crypto/rsa/rsa_oaep.c",0x13f);
  CRYPTO_clear_free(pbVar12,(long)param_5,"crypto/rsa/rsa_oaep.c",0x140);
  return ~uVar7 | uVar7 & uVar23;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad4e94
 */

undefined8
ossl_rsa_padding_add_PKCS1_OAEP_mgf1_ex
          (undefined8 param_1,undefined1 *param_2,int param_3,void *param_4,uint param_5,
          void *param_6,int param_7,EVP_MD *param_8,EVP_MD *param_9)

{
  uchar *md;
  EVP_MD *dgst;
  uint uVar1;
  int iVar2;
  int iVar3;
  uchar *mask;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  uchar *puVar7;
  byte *pbVar8;
  undefined8 *puVar9;
  byte *pbVar10;
  undefined8 *puVar11;
  ulong uVar12;
  undefined8 uVar13;
  uint num;
  long lVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  byte local_a0 [8];
  undefined8 auStack_98 [7];
  
  if (param_8 == (EVP_MD *)0x0) {
    param_8 = EVP_sha1();
  }
  dgst = param_8;
  if (param_9 != (EVP_MD *)0x0) {
    dgst = param_9;
  }
  uVar1 = EVP_MD_get_size(param_8);
  if ((int)uVar1 < 1) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_oaep.c",0x51,"ossl_rsa_padding_add_PKCS1_OAEP_mgf1_ex");
    uVar13 = 0xb5;
LAB_00ad51cc:
    ERR_set_error(4,uVar13,0);
    return 0;
  }
  iVar3 = param_3 + -1;
  if ((int)(iVar3 + uVar1 * -2) <= (int)param_5) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_oaep.c",0x57,"ossl_rsa_padding_add_PKCS1_OAEP_mgf1_ex");
    uVar13 = 0x6e;
    goto LAB_00ad51cc;
  }
  if (param_3 <= (int)(uVar1 * 2 | 1)) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_oaep.c",0x5c,"ossl_rsa_padding_add_PKCS1_OAEP_mgf1_ex");
    uVar13 = 0x78;
    goto LAB_00ad51cc;
  }
  lVar14 = (long)(int)uVar1;
  md = param_2 + lVar14 + 1;
  *param_2 = 0;
  iVar2 = EVP_Digest(param_6,(long)param_7,md,(uint *)0x0,param_8,(ENGINE *)0x0);
  if (iVar2 != 0) {
    iVar2 = (iVar3 - param_5) + -1;
    memset(md + lVar14,0,(long)(int)(iVar2 + uVar1 * -2));
    md[(int)(iVar2 - uVar1)] = '\x01';
    memcpy(md + (((long)iVar3 - (long)(int)param_5) - lVar14),param_4,(ulong)param_5);
    iVar2 = RAND_bytes_ex(param_1,param_2 + 1,lVar14,0);
    if (0 < iVar2) {
      num = iVar3 - uVar1;
      mask = CRYPTO_malloc(num,"crypto/rsa/rsa_oaep.c",0x72);
      if (mask == (uchar *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/rsa/rsa_oaep.c",0x74,"ossl_rsa_padding_add_PKCS1_OAEP_mgf1_ex");
        ERR_set_error(4,0xc0100,0);
      }
      else {
        iVar3 = PKCS1_MGF1(mask,(long)(int)num,param_2 + 1,lVar14,dgst);
        if (-1 < iVar3) {
          if (0 < (int)num) {
            uVar6 = 0;
            uVar4 = (ulong)num;
            if ((0x1f < num) &&
               ((mask + uVar4 <= md || (uVar6 = 0, param_2 + lVar14 + uVar4 + 1 <= mask)))) {
              uVar6 = uVar4 & 0xffffffe0;
              puVar7 = mask + 0x10;
              puVar9 = (undefined8 *)(param_2 + lVar14 + 0x11);
              uVar12 = uVar6;
              do {
                uVar15 = *(undefined8 *)(puVar7 + -8);
                uVar13 = *(undefined8 *)(puVar7 + -0x10);
                uVar17 = *(undefined8 *)(puVar7 + 8);
                uVar16 = *(undefined8 *)puVar7;
                uVar19 = puVar9[-1];
                uVar18 = puVar9[-2];
                uVar21 = puVar9[1];
                uVar20 = *puVar9;
                puVar7 = puVar7 + 0x20;
                uVar12 = uVar12 - 0x20;
                puVar9[-1] = CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                                      CONCAT16((byte)((ulong)uVar19 >> 0x30) ^
                                               (byte)((ulong)uVar15 >> 0x30),
                                               CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                                        (byte)((ulong)uVar15 >> 0x28),
                                                        CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                                 (byte)((ulong)uVar15 >> 0x20),
                                                                 CONCAT13((byte)((ulong)uVar19 >>
                                                                                0x18) ^
                                                                          (byte)((ulong)uVar15 >>
                                                                                0x18),
                                                                          CONCAT12((byte)((ulong)
                                                  uVar19 >> 0x10) ^ (byte)((ulong)uVar15 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar19 >> 8) ^
                                                           (byte)((ulong)uVar15 >> 8),
                                                           (byte)uVar19 ^ (byte)uVar15)))))));
                puVar9[-2] = CONCAT17((byte)((ulong)uVar18 >> 0x38) ^ (byte)((ulong)uVar13 >> 0x38),
                                      CONCAT16((byte)((ulong)uVar18 >> 0x30) ^
                                               (byte)((ulong)uVar13 >> 0x30),
                                               CONCAT15((byte)((ulong)uVar18 >> 0x28) ^
                                                        (byte)((ulong)uVar13 >> 0x28),
                                                        CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                                                 (byte)((ulong)uVar13 >> 0x20),
                                                                 CONCAT13((byte)((ulong)uVar18 >>
                                                                                0x18) ^
                                                                          (byte)((ulong)uVar13 >>
                                                                                0x18),
                                                                          CONCAT12((byte)((ulong)
                                                  uVar18 >> 0x10) ^ (byte)((ulong)uVar13 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar18 >> 8) ^
                                                           (byte)((ulong)uVar13 >> 8),
                                                           (byte)uVar18 ^ (byte)uVar13)))))));
                puVar9[1] = CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                                     CONCAT16((byte)((ulong)uVar21 >> 0x30) ^
                                              (byte)((ulong)uVar17 >> 0x30),
                                              CONCAT15((byte)((ulong)uVar21 >> 0x28) ^
                                                       (byte)((ulong)uVar17 >> 0x28),
                                                       CONCAT14((byte)((ulong)uVar21 >> 0x20) ^
                                                                (byte)((ulong)uVar17 >> 0x20),
                                                                CONCAT13((byte)((ulong)uVar21 >>
                                                                               0x18) ^
                                                                         (byte)((ulong)uVar17 >>
                                                                               0x18),
                                                                         CONCAT12((byte)((ulong)
                                                  uVar21 >> 0x10) ^ (byte)((ulong)uVar17 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar21 >> 8) ^
                                                           (byte)((ulong)uVar17 >> 8),
                                                           (byte)uVar21 ^ (byte)uVar17)))))));
                *puVar9 = CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar20 >> 0x30) ^
                                            (byte)((ulong)uVar16 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                                     (byte)((ulong)uVar16 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                              (byte)((ulong)uVar16 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar20 >> 0x18)
                                                                       ^ (byte)((ulong)uVar16 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar20
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar16
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar20 >> 8) ^ (byte)((ulong)uVar16 >> 8),
                                                  (byte)uVar20 ^ (byte)uVar16)))))));
                puVar9 = puVar9 + 4;
              } while (uVar12 != 0);
              if (uVar6 == uVar4) goto LAB_00ad50b0;
            }
            pbVar10 = param_2 + uVar6 + lVar14;
            lVar5 = uVar4 - uVar6;
            pbVar8 = mask + uVar6;
            do {
              pbVar10 = pbVar10 + 1;
              lVar5 = lVar5 + -1;
              *pbVar10 = *pbVar10 ^ *pbVar8;
              pbVar8 = pbVar8 + 1;
            } while (lVar5 != 0);
          }
LAB_00ad50b0:
          iVar3 = PKCS1_MGF1(local_a0,lVar14,md,(long)(int)num,dgst);
          if (-1 < iVar3) {
            if (0 < (int)uVar1) {
              uVar4 = 0;
              uVar6 = (ulong)uVar1;
              if (0x1f < uVar1) {
                uVar4 = uVar6 & 0xffffffe0;
                puVar9 = auStack_98 + 1;
                puVar11 = (undefined8 *)(param_2 + 0x11);
                uVar12 = uVar4;
                do {
                  uVar15 = puVar9[-1];
                  uVar13 = puVar9[-2];
                  uVar17 = puVar9[1];
                  uVar16 = *puVar9;
                  uVar19 = puVar11[-1];
                  uVar18 = puVar11[-2];
                  uVar21 = puVar11[1];
                  uVar20 = *puVar11;
                  puVar9 = puVar9 + 4;
                  uVar12 = uVar12 - 0x20;
                  puVar11[-1] = CONCAT17((byte)((ulong)uVar19 >> 0x38) ^
                                         (byte)((ulong)uVar15 >> 0x38),
                                         CONCAT16((byte)((ulong)uVar19 >> 0x30) ^
                                                  (byte)((ulong)uVar15 >> 0x30),
                                                  CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                                           (byte)((ulong)uVar15 >> 0x28),
                                                           CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                                    (byte)((ulong)uVar15 >> 0x20),
                                                                    CONCAT13((byte)((ulong)uVar19 >>
                                                                                   0x18) ^
                                                                             (byte)((ulong)uVar15 >>
                                                                                   0x18),
                                                                             CONCAT12((byte)((ulong)
                                                  uVar19 >> 0x10) ^ (byte)((ulong)uVar15 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar19 >> 8) ^
                                                           (byte)((ulong)uVar15 >> 8),
                                                           (byte)uVar19 ^ (byte)uVar15)))))));
                  puVar11[-2] = CONCAT17((byte)((ulong)uVar18 >> 0x38) ^
                                         (byte)((ulong)uVar13 >> 0x38),
                                         CONCAT16((byte)((ulong)uVar18 >> 0x30) ^
                                                  (byte)((ulong)uVar13 >> 0x30),
                                                  CONCAT15((byte)((ulong)uVar18 >> 0x28) ^
                                                           (byte)((ulong)uVar13 >> 0x28),
                                                           CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                                                    (byte)((ulong)uVar13 >> 0x20),
                                                                    CONCAT13((byte)((ulong)uVar18 >>
                                                                                   0x18) ^
                                                                             (byte)((ulong)uVar13 >>
                                                                                   0x18),
                                                                             CONCAT12((byte)((ulong)
                                                  uVar18 >> 0x10) ^ (byte)((ulong)uVar13 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar18 >> 8) ^
                                                           (byte)((ulong)uVar13 >> 8),
                                                           (byte)uVar18 ^ (byte)uVar13)))))));
                  puVar11[1] = CONCAT17((byte)((ulong)uVar21 >> 0x38) ^
                                        (byte)((ulong)uVar17 >> 0x38),
                                        CONCAT16((byte)((ulong)uVar21 >> 0x30) ^
                                                 (byte)((ulong)uVar17 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar21 >> 0x28) ^
                                                          (byte)((ulong)uVar17 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar21 >> 0x20) ^
                                                                   (byte)((ulong)uVar17 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar21 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar17 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar21 >> 0x10) ^ (byte)((ulong)uVar17 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar21 >> 8) ^
                                                           (byte)((ulong)uVar17 >> 8),
                                                           (byte)uVar21 ^ (byte)uVar17)))))));
                  *puVar11 = CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                                      CONCAT16((byte)((ulong)uVar20 >> 0x30) ^
                                               (byte)((ulong)uVar16 >> 0x30),
                                               CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                                        (byte)((ulong)uVar16 >> 0x28),
                                                        CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                                 (byte)((ulong)uVar16 >> 0x20),
                                                                 CONCAT13((byte)((ulong)uVar20 >>
                                                                                0x18) ^
                                                                          (byte)((ulong)uVar16 >>
                                                                                0x18),
                                                                          CONCAT12((byte)((ulong)
                                                  uVar20 >> 0x10) ^ (byte)((ulong)uVar16 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar20 >> 8) ^
                                                           (byte)((ulong)uVar16 >> 8),
                                                           (byte)uVar20 ^ (byte)uVar16)))))));
                  puVar11 = puVar11 + 4;
                } while (uVar12 != 0);
                if (uVar4 == uVar6) goto LAB_00ad5150;
              }
              pbVar10 = param_2 + uVar4;
              lVar14 = uVar6 - uVar4;
              pbVar8 = local_a0 + uVar4;
              do {
                pbVar10 = pbVar10 + 1;
                lVar14 = lVar14 + -1;
                *pbVar10 = *pbVar10 ^ *pbVar8;
                pbVar8 = pbVar8 + 1;
              } while (lVar14 != 0);
            }
LAB_00ad5150:
            uVar13 = 1;
            goto LAB_00ad5240;
          }
        }
      }
      uVar13 = 0;
      goto LAB_00ad5240;
    }
  }
  uVar13 = 0;
  mask = (uchar *)0x0;
  num = 0;
LAB_00ad5240:
  OPENSSL_cleanse(local_a0,0x40);
  CRYPTO_clear_free(mask,(long)(int)num,"crypto/rsa/rsa_oaep.c",0x89);
  return uVar13;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b22a3c
 */

undefined8
ossl_sm2_decrypt(EC_KEY *param_1,EVP_MD *param_2,uchar *param_3,long param_4,void *param_5,
                size_t *param_6)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  EC_GROUP *group;
  ulong cnt;
  undefined8 uVar4;
  undefined8 uVar5;
  BIGNUM *pBVar6;
  BIGNUM *pBVar7;
  BIGNUM *m;
  ulong uVar8;
  byte *pbVar9;
  ulong uVar10;
  byte bVar11;
  byte bVar12;
  uchar *md;
  void *pvVar13;
  long lVar14;
  undefined8 *puVar15;
  EC_POINT *r;
  undefined8 *puVar16;
  byte *pbVar17;
  undefined8 *puVar18;
  byte *pbVar19;
  ulong uVar20;
  EVP_MD_CTX *ctx;
  void *b;
  void *d;
  ulong cnt_00;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  void *local_90;
  BN_CTX *local_88;
  ASN1_VALUE *local_78;
  uchar *local_68;
  
  local_68 = param_3;
  group = EC_KEY_get0_group(param_1);
  cnt = FUN_00b220d0();
  iVar2 = EVP_MD_get_size(param_2);
  uVar4 = ossl_ec_key_get_libctx(param_1);
  uVar5 = ossl_ec_key_get0_propq(param_1);
  ctx = (EVP_MD_CTX *)0x0;
  local_88 = (BN_CTX *)0x0;
  r = (EC_POINT *)0x0;
  d = (void *)0x0;
  local_78 = (ASN1_VALUE *)0x0;
  if (cnt == 0) {
    md = (uchar *)0x0;
    local_90 = (void *)0x0;
  }
  else {
    md = (uchar *)0x0;
    local_90 = (void *)0x0;
    if (0 < iVar2) {
      memset(param_5,0xff,*param_6);
      local_78 = ASN1_item_d2i((ASN1_VALUE **)0x0,&local_68,param_4,(ASN1_ITEM *)&DAT_00c8cc88);
      if (local_78 == (ASN1_VALUE *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/sm2/sm2_crypt.c",0x141,"ossl_sm2_decrypt");
        ERR_set_error(0x35,100,0);
        local_78 = (ASN1_VALUE *)0x0;
        d = (void *)0x0;
        md = (uchar *)0x0;
        r = (EC_POINT *)0x0;
        local_88 = (BN_CTX *)0x0;
        local_90 = (void *)0x0;
        ctx = (EVP_MD_CTX *)0x0;
      }
      else {
        if (**(int **)(local_78 + 0x10) == iVar2) {
          uVar1 = **(uint **)(local_78 + 0x18);
          cnt_00 = (ulong)(int)uVar1;
          if (*param_6 < cnt_00) {
            ERR_new();
            ERR_set_debug("crypto/sm2/sm2_crypt.c",0x14e,"ossl_sm2_decrypt");
            uVar4 = 0x6b;
            goto LAB_00b22bd0;
          }
          pvVar13 = *(void **)(*(uint **)(local_78 + 0x18) + 2);
          b = *(void **)(*(int **)(local_78 + 0x10) + 2);
          local_88 = (BN_CTX *)BN_CTX_new_ex(uVar4);
          if (local_88 == (BN_CTX *)0x0) {
            ERR_new();
            ERR_set_debug("crypto/sm2/sm2_crypt.c",0x154,"ossl_sm2_decrypt");
            uVar4 = 0xc0100;
            goto LAB_00b22bd0;
          }
          BN_CTX_start(local_88);
          pBVar6 = BN_CTX_get(local_88);
          pBVar7 = BN_CTX_get(local_88);
          if (pBVar7 == (BIGNUM *)0x0) {
            ERR_new();
            ERR_set_debug("crypto/sm2/sm2_crypt.c",0x15d,"ossl_sm2_decrypt");
            ERR_set_error(0x35,0x80003,0);
            goto LAB_00b22be8;
          }
          local_90 = (void *)CRYPTO_zalloc(cnt_00,"crypto/sm2/sm2_crypt.c",0x161);
          d = (void *)CRYPTO_zalloc(cnt << 1,"crypto/sm2/sm2_crypt.c",0x162);
          md = (uchar *)CRYPTO_zalloc((long)iVar2,"crypto/sm2/sm2_crypt.c",0x163);
          if (((local_90 != (void *)0x0) && (d != (void *)0x0)) && (md != (uchar *)0x0)) {
            r = EC_POINT_new(group);
            if (r == (EC_POINT *)0x0) {
              ERR_new();
              ERR_set_debug("crypto/sm2/sm2_crypt.c",0x16c,"ossl_sm2_decrypt");
              ERR_set_error(0x35,0xc0100,0);
              r = (EC_POINT *)0x0;
              ctx = (EVP_MD_CTX *)0x0;
              goto LAB_00b22bf0;
            }
            iVar3 = EC_POINT_set_affine_coordinates
                              (group,r,*(undefined8 *)local_78,*(undefined8 *)(local_78 + 8),
                               local_88);
            if (iVar3 != 0) {
              m = EC_KEY_get0_private_key(param_1);
              iVar3 = EC_POINT_mul(group,r,(BIGNUM *)0x0,r,m,local_88);
              if ((iVar3 != 0) &&
                 (iVar3 = EC_POINT_get_affine_coordinates(group,r,pBVar6,pBVar7,local_88),
                 iVar3 != 0)) {
                iVar3 = BN_bn2binpad(pBVar6,d,cnt & 0xffffffff);
                if (iVar3 < 0) {
LAB_00b22f68:
                  ERR_new();
                  ERR_set_debug("crypto/sm2/sm2_crypt.c",0x17d,"ossl_sm2_decrypt");
                  uVar4 = 0xc0103;
                }
                else {
                  iVar3 = BN_bn2binpad(pBVar7,(void *)((long)d + cnt),cnt & 0xffffffff);
                  if ((iVar3 < 0) ||
                     (iVar3 = ossl_ecdh_kdf_X9_63(local_90,cnt_00,d,cnt << 1,0,0,param_2,uVar4,uVar5
                                                 ), iVar3 == 0)) goto LAB_00b22f68;
                  if (uVar1 != 0) {
                    if (uVar1 == 1) {
                      uVar8 = 0;
                      bVar12 = 0;
LAB_00b22fec:
                      lVar14 = cnt_00 - uVar8;
                      pbVar9 = (byte *)((long)local_90 + uVar8);
                      do {
                        lVar14 = lVar14 + -1;
                        bVar12 = bVar12 | *pbVar9;
                        pbVar9 = pbVar9 + 1;
                      } while (lVar14 != 0);
                    }
                    else {
                      uVar8 = cnt_00 & 0xfffffffffffffffe;
                      bVar11 = 0;
                      bVar12 = 0;
                      pbVar9 = (byte *)((long)local_90 + 1);
                      uVar10 = uVar8;
                      do {
                        uVar10 = uVar10 - 2;
                        bVar11 = bVar11 | pbVar9[-1];
                        bVar12 = bVar12 | *pbVar9;
                        pbVar9 = pbVar9 + 2;
                      } while (uVar10 != 0);
                      bVar12 = bVar12 | bVar11;
                      if (uVar8 != cnt_00) goto LAB_00b22fec;
                    }
                    if (bVar12 != 0) {
                      uVar10 = (ulong)uVar1;
                      uVar8 = 0;
                      if (uVar1 < 0x20) {
LAB_00b230e4:
                        lVar14 = uVar10 - uVar8;
                        pbVar9 = (byte *)((long)param_5 + uVar8);
                        pbVar17 = (byte *)((long)local_90 + uVar8);
                        pbVar19 = (byte *)((long)pvVar13 + uVar8);
                        do {
                          lVar14 = lVar14 + -1;
                          *pbVar9 = *pbVar17 ^ *pbVar19;
                          pbVar9 = pbVar9 + 1;
                          pbVar17 = pbVar17 + 1;
                          pbVar19 = pbVar19 + 1;
                        } while (lVar14 != 0);
                      }
                      else {
                        if (param_5 < (void *)((long)pvVar13 + uVar10) &&
                            pvVar13 < (void *)((long)param_5 + uVar10)) {
                          uVar8 = 0;
                          goto LAB_00b230e4;
                        }
                        uVar8 = 0;
                        if (param_5 < (void *)((long)local_90 + uVar10) &&
                            local_90 < (void *)((long)param_5 + uVar10)) goto LAB_00b230e4;
                        uVar8 = cnt_00 & 0xffffffe0;
                        puVar15 = (undefined8 *)((long)pvVar13 + 0x10);
                        puVar16 = (undefined8 *)((long)local_90 + 0x10);
                        puVar18 = (undefined8 *)((long)param_5 + 0x10);
                        uVar20 = uVar8;
                        do {
                          uVar5 = puVar15[-1];
                          uVar4 = puVar15[-2];
                          uVar22 = puVar15[1];
                          uVar21 = *puVar15;
                          uVar24 = puVar16[-1];
                          uVar23 = puVar16[-2];
                          uVar26 = puVar16[1];
                          uVar25 = *puVar16;
                          puVar15 = puVar15 + 4;
                          puVar16 = puVar16 + 4;
                          uVar20 = uVar20 - 0x20;
                          puVar18[-1] = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^
                                                 (byte)((ulong)uVar5 >> 0x38),
                                                 CONCAT16((byte)((ulong)uVar24 >> 0x30) ^
                                                          (byte)((ulong)uVar5 >> 0x30),
                                                          CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                                                   (byte)((ulong)uVar5 >> 0x28),
                                                                   CONCAT14((byte)((ulong)uVar24 >>
                                                                                  0x20) ^
                                                                            (byte)((ulong)uVar5 >>
                                                                                  0x20),
                                                                            CONCAT13((byte)((ulong)
                                                  uVar24 >> 0x18) ^ (byte)((ulong)uVar5 >> 0x18),
                                                  CONCAT12((byte)((ulong)uVar24 >> 0x10) ^
                                                           (byte)((ulong)uVar5 >> 0x10),
                                                           CONCAT11((byte)((ulong)uVar24 >> 8) ^
                                                                    (byte)((ulong)uVar5 >> 8),
                                                                    (byte)uVar24 ^ (byte)uVar5))))))
                                                );
                          puVar18[-2] = CONCAT17((byte)((ulong)uVar23 >> 0x38) ^
                                                 (byte)((ulong)uVar4 >> 0x38),
                                                 CONCAT16((byte)((ulong)uVar23 >> 0x30) ^
                                                          (byte)((ulong)uVar4 >> 0x30),
                                                          CONCAT15((byte)((ulong)uVar23 >> 0x28) ^
                                                                   (byte)((ulong)uVar4 >> 0x28),
                                                                   CONCAT14((byte)((ulong)uVar23 >>
                                                                                  0x20) ^
                                                                            (byte)((ulong)uVar4 >>
                                                                                  0x20),
                                                                            CONCAT13((byte)((ulong)
                                                  uVar23 >> 0x18) ^ (byte)((ulong)uVar4 >> 0x18),
                                                  CONCAT12((byte)((ulong)uVar23 >> 0x10) ^
                                                           (byte)((ulong)uVar4 >> 0x10),
                                                           CONCAT11((byte)((ulong)uVar23 >> 8) ^
                                                                    (byte)((ulong)uVar4 >> 8),
                                                                    (byte)uVar23 ^ (byte)uVar4))))))
                                                );
                          puVar18[1] = CONCAT17((byte)((ulong)uVar26 >> 0x38) ^
                                                (byte)((ulong)uVar22 >> 0x38),
                                                CONCAT16((byte)((ulong)uVar26 >> 0x30) ^
                                                         (byte)((ulong)uVar22 >> 0x30),
                                                         CONCAT15((byte)((ulong)uVar26 >> 0x28) ^
                                                                  (byte)((ulong)uVar22 >> 0x28),
                                                                  CONCAT14((byte)((ulong)uVar26 >>
                                                                                 0x20) ^
                                                                           (byte)((ulong)uVar22 >>
                                                                                 0x20),
                                                                           CONCAT13((byte)((ulong)
                                                  uVar26 >> 0x18) ^ (byte)((ulong)uVar22 >> 0x18),
                                                  CONCAT12((byte)((ulong)uVar26 >> 0x10) ^
                                                           (byte)((ulong)uVar22 >> 0x10),
                                                           CONCAT11((byte)((ulong)uVar26 >> 8) ^
                                                                    (byte)((ulong)uVar22 >> 8),
                                                                    (byte)uVar26 ^ (byte)uVar22)))))
                                                  ));
                          *puVar18 = CONCAT17((byte)((ulong)uVar25 >> 0x38) ^
                                              (byte)((ulong)uVar21 >> 0x38),
                                              CONCAT16((byte)((ulong)uVar25 >> 0x30) ^
                                                       (byte)((ulong)uVar21 >> 0x30),
                                                       CONCAT15((byte)((ulong)uVar25 >> 0x28) ^
                                                                (byte)((ulong)uVar21 >> 0x28),
                                                                CONCAT14((byte)((ulong)uVar25 >>
                                                                               0x20) ^
                                                                         (byte)((ulong)uVar21 >>
                                                                               0x20),
                                                                         CONCAT13((byte)((ulong)
                                                  uVar25 >> 0x18) ^ (byte)((ulong)uVar21 >> 0x18),
                                                  CONCAT12((byte)((ulong)uVar25 >> 0x10) ^
                                                           (byte)((ulong)uVar21 >> 0x10),
                                                           CONCAT11((byte)((ulong)uVar25 >> 8) ^
                                                                    (byte)((ulong)uVar21 >> 8),
                                                                    (byte)uVar25 ^ (byte)uVar21)))))
                                                  ));
                          puVar18 = puVar18 + 4;
                        } while (uVar20 != 0);
                        if (uVar8 != uVar10) goto LAB_00b230e4;
                      }
                      ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
                      if (ctx == (EVP_MD_CTX *)0x0) {
                        ERR_new();
                        ERR_set_debug("crypto/sm2/sm2_crypt.c",0x18b,"ossl_sm2_decrypt");
                        uVar4 = 0xc0100;
                      }
                      else {
                        iVar3 = EVP_DigestInit(ctx,param_2);
                        if ((((iVar3 == 0) || (iVar3 = EVP_DigestUpdate(ctx,d,cnt), iVar3 == 0)) ||
                            (iVar3 = EVP_DigestUpdate(ctx,param_5,cnt_00), iVar3 == 0)) ||
                           ((iVar3 = EVP_DigestUpdate(ctx,(void *)((long)d + cnt),cnt), iVar3 == 0
                            || (iVar3 = EVP_DigestFinal(ctx,md,(uint *)0x0), iVar3 == 0)))) {
                          ERR_new();
                          ERR_set_debug("crypto/sm2/sm2_crypt.c",0x194,"ossl_sm2_decrypt");
                          uVar4 = 0x80006;
                        }
                        else {
                          iVar2 = CRYPTO_memcmp(md,b,(long)iVar2);
                          if (iVar2 == 0) {
                            uVar4 = 1;
                            *param_6 = cnt_00;
                            goto LAB_00b22c14;
                          }
                          ERR_new();
                          ERR_set_debug("crypto/sm2/sm2_crypt.c",0x199,"ossl_sm2_decrypt");
                          uVar4 = 0x66;
                        }
                      }
                      ERR_set_error(0x35,uVar4,0);
                      goto LAB_00b22bf0;
                    }
                  }
                  ERR_new();
                  ERR_set_debug("crypto/sm2/sm2_crypt.c",0x182,"ossl_sm2_decrypt");
                  uVar4 = 0x68;
                }
                ERR_set_error(0x35,uVar4,0);
                ctx = (EVP_MD_CTX *)0x0;
                goto LAB_00b22bf0;
              }
            }
            ERR_new();
            ERR_set_debug("crypto/sm2/sm2_crypt.c",0x175,"ossl_sm2_decrypt");
            ERR_set_error(0x35,0x80010,0);
            ctx = (EVP_MD_CTX *)0x0;
            goto LAB_00b22bf0;
          }
          ERR_new();
          ERR_set_debug("crypto/sm2/sm2_crypt.c",0x166,"ossl_sm2_decrypt");
          ERR_set_error(0x35,0xc0100,0);
        }
        else {
          ERR_new();
          ERR_set_debug("crypto/sm2/sm2_crypt.c",0x146,"ossl_sm2_decrypt");
          uVar4 = 0x68;
LAB_00b22bd0:
          ERR_set_error(0x35,uVar4,0);
          local_88 = (BN_CTX *)0x0;
LAB_00b22be8:
          d = (void *)0x0;
          md = (uchar *)0x0;
          local_90 = (void *)0x0;
        }
        r = (EC_POINT *)0x0;
        ctx = (EVP_MD_CTX *)0x0;
      }
    }
  }
LAB_00b22bf0:
  memset(param_5,0,*param_6);
  uVar4 = 0;
LAB_00b22c14:
  CRYPTO_free(local_90);
  CRYPTO_free(d);
  CRYPTO_free(md);
  EC_POINT_free(r);
  BN_CTX_free(local_88);
  ASN1_item_free(local_78,(ASN1_ITEM *)&DAT_00c8cc88);
  EVP_MD_CTX_free(ctx);
  return uVar4;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b22180
 */

undefined8
ossl_sm2_encrypt(EC_KEY *param_1,undefined8 param_2,void *param_3,ulong param_4,uchar *param_5,
                size_t *param_6)

{
  int iVar1;
  int iVar2;
  EVP_MD_CTX *ctx;
  EC_GROUP *group;
  undefined8 uVar3;
  EC_POINT *q;
  undefined8 uVar4;
  undefined8 uVar5;
  size_t cnt;
  EC_POINT *r;
  EC_POINT *r_00;
  BN_CTX *ctx_00;
  BIGNUM *n;
  BIGNUM *pBVar6;
  BIGNUM *pBVar7;
  BIGNUM *pBVar8;
  BIGNUM *pBVar9;
  size_t __n;
  void *d;
  uchar *md;
  void *data;
  ASN1_OCTET_STRING *str;
  ASN1_OCTET_STRING *str_00;
  undefined4 uVar10;
  byte bVar11;
  byte bVar12;
  long lVar13;
  undefined8 *puVar14;
  byte *pbVar15;
  ulong uVar16;
  undefined8 *puVar17;
  byte *pbVar18;
  EVP_MD *type;
  ulong uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  BIGNUM *local_90;
  BIGNUM *local_88;
  ASN1_OCTET_STRING *local_80;
  ASN1_OCTET_STRING *local_78;
  uchar *local_70 [2];
  
  local_70[0] = param_5;
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  group = EC_KEY_get0_group(param_1);
  uVar3 = EC_GROUP_get0_order();
  q = EC_KEY_get0_public_key(param_1);
  iVar1 = EVP_MD_get_size(param_2);
  uVar4 = ossl_ec_key_get_libctx(param_1);
  uVar5 = ossl_ec_key_get0_propq(param_1);
  local_80 = (ASN1_OCTET_STRING *)0x0;
  local_78 = (ASN1_OCTET_STRING *)0x0;
  if ((ctx == (EVP_MD_CTX *)0x0) || (iVar1 < 1)) {
    ERR_new();
    ERR_set_debug("crypto/sm2/sm2_crypt.c",0x9a,"ossl_sm2_encrypt");
    ERR_set_error(0x35,0xc0103,0);
LAB_00b2256c:
    r = (EC_POINT *)0x0;
    r_00 = (EC_POINT *)0x0;
    d = (void *)0x0;
    md = (uchar *)0x0;
    ctx_00 = (BN_CTX *)0x0;
  }
  else {
    cnt = FUN_00b220d0(group);
    if (cnt == 0) {
      ERR_new();
      ERR_set_debug("crypto/sm2/sm2_crypt.c",0xa0,"ossl_sm2_encrypt");
      ERR_set_error(0x35,0xc0103,0);
      goto LAB_00b2256c;
    }
    r = EC_POINT_new(group);
    r_00 = EC_POINT_new(group);
    ctx_00 = (BN_CTX *)BN_CTX_new_ex(uVar4);
    if (((r == (EC_POINT *)0x0) || (r_00 == (EC_POINT *)0x0)) || (ctx_00 == (BN_CTX *)0x0)) {
      ERR_new();
      ERR_set_debug("crypto/sm2/sm2_crypt.c",0xa8,"ossl_sm2_encrypt");
      iVar1 = 0xc0103;
LAB_00b225d4:
      ERR_set_error(0x35,iVar1 + -3,0);
      d = (void *)0x0;
      md = (uchar *)0x0;
    }
    else {
      BN_CTX_start(ctx_00);
      n = BN_CTX_get(ctx_00);
      pBVar6 = BN_CTX_get(ctx_00);
      pBVar7 = BN_CTX_get(ctx_00);
      pBVar8 = BN_CTX_get(ctx_00);
      pBVar9 = BN_CTX_get(ctx_00);
      if (pBVar9 == (BIGNUM *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/sm2/sm2_crypt.c",0xb4,"ossl_sm2_encrypt");
        iVar1 = 0x80006;
        goto LAB_00b225d4;
      }
      __n = cnt << 1;
      d = (void *)CRYPTO_zalloc(__n,"crypto/sm2/sm2_crypt.c",0xb8);
      md = (uchar *)CRYPTO_zalloc((long)iVar1,"crypto/sm2/sm2_crypt.c",0xb9);
      if ((d != (void *)0x0) && (md != (uchar *)0x0)) {
        memset(param_5,0,*param_6);
        data = (void *)CRYPTO_zalloc(param_4,"crypto/sm2/sm2_crypt.c",0xc2);
        if (data == (void *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/sm2/sm2_crypt.c",0xc4,"ossl_sm2_encrypt");
          uVar10 = 0xc0100;
        }
        else {
          iVar2 = BN_priv_rand_range_ex(n,uVar3,0,ctx_00);
          if (iVar2 != 0) {
            uVar19 = param_4 & 0xfffffffffffffffe;
LAB_00b2236c:
            iVar2 = EC_POINT_mul(group,r,n,(EC_POINT *)0x0,(BIGNUM *)0x0,ctx_00);
            if (((iVar2 != 0) &&
                (iVar2 = EC_POINT_get_affine_coordinates(group,r,pBVar6,pBVar8,ctx_00), iVar2 != 0))
               && ((iVar2 = EC_POINT_mul(group,r_00,(BIGNUM *)0x0,q,n,ctx_00), iVar2 != 0 &&
                   (iVar2 = EC_POINT_get_affine_coordinates(group,r_00,pBVar7,pBVar9,ctx_00),
                   iVar2 != 0)))) {
              iVar2 = BN_bn2binpad(pBVar7,d,cnt & 0xffffffff);
              if ((-1 < iVar2) &&
                 (iVar2 = BN_bn2binpad(pBVar9,(void *)((long)d + cnt),cnt & 0xffffffff), -1 < iVar2)
                 ) {
                iVar2 = ossl_ecdh_kdf_X9_63(data,param_4,d,__n,0,0,param_2,uVar4,uVar5);
                if (iVar2 != 0) {
                  if (param_4 == 0) goto LAB_00b224b8;
                  if (param_4 == 1) {
                    bVar12 = 0;
                    uVar16 = 0;
LAB_00b22498:
                    lVar13 = param_4 - uVar16;
                    pbVar15 = (byte *)((long)data + uVar16);
                    do {
                      lVar13 = lVar13 + -1;
                      bVar12 = bVar12 | *pbVar15;
                      pbVar15 = pbVar15 + 1;
                    } while (lVar13 != 0);
                  }
                  else {
                    bVar11 = 0;
                    bVar12 = 0;
                    uVar16 = uVar19;
                    pbVar15 = (byte *)((long)data + 1);
                    do {
                      uVar16 = uVar16 - 2;
                      bVar11 = bVar11 | pbVar15[-1];
                      bVar12 = bVar12 | *pbVar15;
                      pbVar15 = pbVar15 + 2;
                    } while (uVar16 != 0);
                    bVar12 = bVar12 | bVar11;
                    uVar16 = uVar19;
                    if (uVar19 != param_4) goto LAB_00b22498;
                  }
                  if (bVar12 == 0) goto LAB_00b224b8;
                  uVar19 = 0;
                  if ((param_4 < 0x20) ||
                     ((data < (void *)((long)param_3 + param_4) &&
                      (uVar19 = 0, param_3 < (void *)((long)data + param_4))))) goto LAB_00b2282c;
                  puVar14 = (undefined8 *)((long)param_3 + 0x10);
                  puVar17 = (undefined8 *)((long)data + 0x10);
                  uVar19 = param_4 & 0xffffffffffffffe0;
                  uVar16 = uVar19;
                  do {
                    uVar20 = puVar14[-1];
                    uVar3 = puVar14[-2];
                    uVar22 = puVar14[1];
                    uVar21 = *puVar14;
                    uVar24 = puVar17[-1];
                    uVar23 = puVar17[-2];
                    uVar26 = puVar17[1];
                    uVar25 = *puVar17;
                    puVar14 = puVar14 + 4;
                    uVar16 = uVar16 - 0x20;
                    puVar17[-1] = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^
                                           (byte)((ulong)uVar20 >> 0x38),
                                           CONCAT16((byte)((ulong)uVar24 >> 0x30) ^
                                                    (byte)((ulong)uVar20 >> 0x30),
                                                    CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                                             (byte)((ulong)uVar20 >> 0x28),
                                                             CONCAT14((byte)((ulong)uVar24 >> 0x20)
                                                                      ^ (byte)((ulong)uVar20 >> 0x20
                                                                              ),
                                                                      CONCAT13((byte)((ulong)uVar24
                                                                                     >> 0x18) ^
                                                                               (byte)((ulong)uVar20
                                                                                     >> 0x18),
                                                                               CONCAT12((byte)((
                                                  ulong)uVar24 >> 0x10) ^
                                                  (byte)((ulong)uVar20 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar24 >> 8) ^
                                                           (byte)((ulong)uVar20 >> 8),
                                                           (byte)uVar24 ^ (byte)uVar20)))))));
                    puVar17[-2] = CONCAT17((byte)((ulong)uVar23 >> 0x38) ^
                                           (byte)((ulong)uVar3 >> 0x38),
                                           CONCAT16((byte)((ulong)uVar23 >> 0x30) ^
                                                    (byte)((ulong)uVar3 >> 0x30),
                                                    CONCAT15((byte)((ulong)uVar23 >> 0x28) ^
                                                             (byte)((ulong)uVar3 >> 0x28),
                                                             CONCAT14((byte)((ulong)uVar23 >> 0x20)
                                                                      ^ (byte)((ulong)uVar3 >> 0x20)
                                                                      ,CONCAT13((byte)((ulong)uVar23
                                                                                      >> 0x18) ^
                                                                                (byte)((ulong)uVar3
                                                                                      >> 0x18),
                                                                                CONCAT12((byte)((
                                                  ulong)uVar23 >> 0x10) ^
                                                  (byte)((ulong)uVar3 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar23 >> 8) ^
                                                           (byte)((ulong)uVar3 >> 8),
                                                           (byte)uVar23 ^ (byte)uVar3)))))));
                    puVar17[1] = CONCAT17((byte)((ulong)uVar26 >> 0x38) ^
                                          (byte)((ulong)uVar22 >> 0x38),
                                          CONCAT16((byte)((ulong)uVar26 >> 0x30) ^
                                                   (byte)((ulong)uVar22 >> 0x30),
                                                   CONCAT15((byte)((ulong)uVar26 >> 0x28) ^
                                                            (byte)((ulong)uVar22 >> 0x28),
                                                            CONCAT14((byte)((ulong)uVar26 >> 0x20) ^
                                                                     (byte)((ulong)uVar22 >> 0x20),
                                                                     CONCAT13((byte)((ulong)uVar26
                                                                                    >> 0x18) ^
                                                                              (byte)((ulong)uVar22
                                                                                    >> 0x18),
                                                                              CONCAT12((byte)((ulong
                                                  )uVar26 >> 0x10) ^ (byte)((ulong)uVar22 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar26 >> 8) ^
                                                           (byte)((ulong)uVar22 >> 8),
                                                           (byte)uVar26 ^ (byte)uVar22)))))));
                    *puVar17 = CONCAT17((byte)((ulong)uVar25 >> 0x38) ^
                                        (byte)((ulong)uVar21 >> 0x38),
                                        CONCAT16((byte)((ulong)uVar25 >> 0x30) ^
                                                 (byte)((ulong)uVar21 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar25 >> 0x28) ^
                                                          (byte)((ulong)uVar21 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar25 >> 0x20) ^
                                                                   (byte)((ulong)uVar21 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar25 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar21 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar25 >> 0x10) ^ (byte)((ulong)uVar21 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar25 >> 8) ^
                                                           (byte)((ulong)uVar21 >> 8),
                                                           (byte)uVar25 ^ (byte)uVar21)))))));
                    puVar17 = puVar17 + 4;
                  } while (uVar16 != 0);
                  if (uVar19 != param_4) {
LAB_00b2282c:
                    lVar13 = param_4 - uVar19;
                    pbVar15 = (byte *)((long)param_3 + uVar19);
                    pbVar18 = (byte *)((long)data + uVar19);
                    do {
                      lVar13 = lVar13 + -1;
                      *pbVar18 = *pbVar18 ^ *pbVar15;
                      pbVar15 = pbVar15 + 1;
                      pbVar18 = pbVar18 + 1;
                    } while (lVar13 != 0);
                  }
                  uVar3 = EVP_MD_get0_name(param_2);
                  type = (EVP_MD *)EVP_MD_fetch(uVar4,uVar3,uVar5);
                  if (type == (EVP_MD *)0x0) {
                    ERR_new();
                    uVar3 = 0xed;
LAB_00b229b8:
                    ERR_set_debug("crypto/sm2/sm2_crypt.c",uVar3,"ossl_sm2_encrypt");
                    uVar10 = 0xc0103;
                  }
                  else {
                    iVar2 = EVP_DigestInit(ctx,type);
                    if ((((iVar2 == 0) || (iVar2 = EVP_DigestUpdate(ctx,d,cnt), iVar2 == 0)) ||
                        (iVar2 = EVP_DigestUpdate(ctx,param_3,param_4), iVar2 == 0)) ||
                       ((iVar2 = EVP_DigestUpdate(ctx,(void *)((long)d + cnt),cnt), iVar2 == 0 ||
                        (iVar2 = EVP_DigestFinal(ctx,md,(uint *)0x0), iVar2 == 0)))) {
                      ERR_new();
                      ERR_set_debug("crypto/sm2/sm2_crypt.c",0xf5,"ossl_sm2_encrypt");
                      ERR_set_error(0x35,0x80006,0);
                      uVar3 = 0;
                      goto LAB_00b22600;
                    }
                    local_90 = pBVar6;
                    local_88 = pBVar8;
                    str = ASN1_OCTET_STRING_new();
                    local_80 = str;
                    str_00 = ASN1_OCTET_STRING_new();
                    local_78 = str_00;
                    if ((str_00 != (ASN1_OCTET_STRING *)0x0) && (str != (ASN1_OCTET_STRING *)0x0)) {
                      iVar1 = ASN1_OCTET_STRING_set(str,md,iVar1);
                      if ((iVar1 == 0) ||
                         (iVar1 = ASN1_OCTET_STRING_set(str_00,data,(int)param_4), iVar1 == 0)) {
                        ERR_new();
                        uVar3 = 0x104;
                      }
                      else {
                        iVar1 = ASN1_item_i2d((ASN1_VALUE *)&local_90,local_70,
                                              (ASN1_ITEM *)&DAT_00c8cc88);
                        if (-1 < iVar1) {
                          uVar3 = 1;
                          *param_6 = (long)iVar1;
                          goto LAB_00b22600;
                        }
                        ERR_new();
                        uVar3 = 0x10b;
                      }
                      goto LAB_00b229b8;
                    }
                    ERR_new();
                    ERR_set_debug("crypto/sm2/sm2_crypt.c",0xff,"ossl_sm2_encrypt");
                    uVar10 = 0xc0100;
                  }
                  ERR_set_error(0x35,uVar10,0);
                  goto LAB_00b2276c;
                }
                ERR_new();
                ERR_set_debug("crypto/sm2/sm2_crypt.c",0xdf,"ossl_sm2_encrypt");
                uVar10 = 0x80006;
                goto LAB_00b22760;
              }
              ERR_new();
              uVar3 = 0xd8;
              goto LAB_00b22750;
            }
            ERR_new();
            ERR_set_debug("crypto/sm2/sm2_crypt.c",0xd2,"ossl_sm2_encrypt");
            uVar10 = 0x80010;
            goto LAB_00b22760;
          }
LAB_00b224e8:
          ERR_new();
          uVar3 = 0xca;
LAB_00b22750:
          ERR_set_debug("crypto/sm2/sm2_crypt.c",uVar3,"ossl_sm2_encrypt");
          uVar10 = 0xc0103;
        }
LAB_00b22760:
        ERR_set_error(0x35,uVar10,0);
        type = (EVP_MD *)0x0;
LAB_00b2276c:
        uVar3 = 0;
        goto LAB_00b22600;
      }
      ERR_new();
      ERR_set_debug("crypto/sm2/sm2_crypt.c",0xbc,"ossl_sm2_encrypt");
      ERR_set_error(0x35,0xc0100,0);
    }
  }
  data = (void *)0x0;
  type = (EVP_MD *)0x0;
  uVar3 = 0;
LAB_00b22600:
  EVP_MD_free(type);
  ASN1_OCTET_STRING_free(local_78);
  ASN1_OCTET_STRING_free(local_80);
  CRYPTO_free(data);
  CRYPTO_free(d);
  CRYPTO_free(md);
  EVP_MD_CTX_free(ctx);
  BN_CTX_free(ctx_00);
  EC_POINT_free(r);
  EC_POINT_free(r_00);
  return uVar3;
LAB_00b224b8:
  memset(d,0,__n);
  iVar2 = BN_priv_rand_range_ex(n,uVar3,0,ctx_00);
  if (iVar2 == 0) goto LAB_00b224e8;
  goto LAB_00b2236c;
}


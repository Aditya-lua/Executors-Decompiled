/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6157c
 */

undefined8
ossl_sm2_compute_z_digest
          (uchar *param_1,EVP_MD *param_2,void *param_3,ulong param_4,EC_KEY *param_5)

{
  undefined4 uVar1;
  uint uVar2;
  ulong cnt;
  int iVar3;
  EC_GROUP *group;
  EC_POINT *pEVar4;
  EVP_MD_CTX *ctx;
  BN_CTX *ctx_00;
  BIGNUM *a;
  BIGNUM *pBVar5;
  BIGNUM *pBVar6;
  BIGNUM *pBVar7;
  BIGNUM *pBVar8;
  BIGNUM *pBVar9;
  BIGNUM *pBVar10;
  EC_POINT *pEVar11;
  undefined8 uVar12;
  void *d;
  undefined1 local_64 [4];
  
  group = EC_KEY_get0_group(param_5);
  pEVar4 = EC_KEY_get0_public_key(param_5);
  local_64[0] = 0;
  if (pEVar4 == (EC_POINT *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/sm2/sm2_sign.c",0x31,"ossl_sm2_compute_z_digest");
    ERR_set_error(0x35,0xc0102,0);
    ctx_00 = (BN_CTX *)0x0;
    ctx = (EVP_MD_CTX *)0x0;
  }
  else {
    ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
    ossl_ec_key_get_libctx(param_5);
    ctx_00 = (BN_CTX *)BN_CTX_new_ex();
    if ((ctx == (EVP_MD_CTX *)0x0) || (ctx_00 == (BN_CTX *)0x0)) {
      ERR_new();
      uVar12 = 0x38;
LAB_00b61704:
      ERR_set_debug("crypto/sm2/sm2_sign.c",uVar12,"ossl_sm2_compute_z_digest");
      uVar12 = 0xc0100;
    }
    else {
      a = BN_CTX_get(ctx_00);
      pBVar5 = BN_CTX_get(ctx_00);
      pBVar6 = BN_CTX_get(ctx_00);
      pBVar7 = BN_CTX_get(ctx_00);
      pBVar8 = BN_CTX_get(ctx_00);
      pBVar9 = BN_CTX_get(ctx_00);
      pBVar10 = BN_CTX_get(ctx_00);
      if (pBVar10 == (BIGNUM *)0x0) {
        ERR_new();
        uVar12 = 0x45;
        goto LAB_00b61704;
      }
      iVar3 = EVP_DigestInit(ctx,param_2);
      if (iVar3 == 0) {
        ERR_new();
        uVar12 = 0x4a;
LAB_00b619d4:
        ERR_set_debug("crypto/sm2/sm2_sign.c",uVar12,"ossl_sm2_compute_z_digest");
        uVar12 = 0x80006;
      }
      else {
        if (param_4 < 0x1fff) {
          local_64[0] = (undefined1)(param_4 >> 5);
          iVar3 = EVP_DigestUpdate(ctx,local_64,1);
          if (iVar3 == 0) {
            ERR_new();
            uVar12 = 0x5a;
          }
          else {
            local_64[0] = (undefined1)((int)param_4 << 3);
            iVar3 = EVP_DigestUpdate(ctx,local_64,1);
            if (iVar3 != 0) {
              if (param_4 != 0) {
                iVar3 = EVP_DigestUpdate(ctx,param_3,param_4);
                if (iVar3 == 0) {
                  ERR_new();
                  uVar12 = 100;
                  goto LAB_00b619d4;
                }
              }
              iVar3 = EC_GROUP_get_curve(group,a,pBVar5,pBVar6,ctx_00);
              if (iVar3 != 0) {
                iVar3 = BN_num_bits(a);
                uVar2 = iVar3 + 0xe;
                if (-1 < (int)(iVar3 + 7U)) {
                  uVar2 = iVar3 + 7U;
                }
                cnt = (long)((ulong)uVar2 << 0x20) >> 0x23;
                d = (void *)CRYPTO_zalloc(cnt,"crypto/sm2/sm2_sign.c",0x6e);
                if (d == (void *)0x0) {
                  ERR_new();
                  ERR_set_debug("crypto/sm2/sm2_sign.c",0x70,"ossl_sm2_compute_z_digest");
                  uVar1 = 0xc0100;
                }
                else {
                  iVar3 = BN_bn2binpad(pBVar5,d,cnt & 0xffffffff);
                  if (-1 < iVar3) {
                    iVar3 = EVP_DigestUpdate(ctx,d,cnt);
                    if ((iVar3 != 0) &&
                       (iVar3 = BN_bn2binpad(pBVar6,d,cnt & 0xffffffff), -1 < iVar3)) {
                      iVar3 = EVP_DigestUpdate(ctx,d,cnt);
                      if (iVar3 != 0) {
                        pEVar11 = EC_GROUP_get0_generator(group);
                        iVar3 = EC_POINT_get_affine_coordinates(group,pEVar11,pBVar7,pBVar8,ctx_00);
                        if ((iVar3 != 0) &&
                           (iVar3 = BN_bn2binpad(pBVar7,d,cnt & 0xffffffff), -1 < iVar3)) {
                          iVar3 = EVP_DigestUpdate(ctx,d,cnt);
                          if ((iVar3 != 0) &&
                             (iVar3 = BN_bn2binpad(pBVar8,d,cnt & 0xffffffff), -1 < iVar3)) {
                            iVar3 = EVP_DigestUpdate(ctx,d,cnt);
                            if (((iVar3 != 0) &&
                                (iVar3 = EC_POINT_get_affine_coordinates
                                                   (group,pEVar4,pBVar9,pBVar10,ctx_00), iVar3 != 0)
                                ) && (iVar3 = BN_bn2binpad(pBVar9,d,cnt & 0xffffffff), -1 < iVar3))
                            {
                              iVar3 = EVP_DigestUpdate(ctx,d,cnt);
                              if ((iVar3 != 0) &&
                                 (iVar3 = BN_bn2binpad(pBVar10,d,cnt & 0xffffffff), -1 < iVar3)) {
                                iVar3 = EVP_DigestUpdate(ctx,d,cnt);
                                if (iVar3 != 0) {
                                  iVar3 = EVP_DigestFinal(ctx,param_1,(uint *)0x0);
                                  if (iVar3 != 0) {
                                    uVar12 = 1;
                                    goto LAB_00b619f4;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  ERR_new();
                  ERR_set_debug("crypto/sm2/sm2_sign.c",0x87,"ossl_sm2_compute_z_digest");
                  uVar1 = 0xc0103;
                }
                ERR_set_error(0x35,uVar1,0);
                uVar12 = 0;
                goto LAB_00b619f4;
              }
              ERR_new();
              ERR_set_debug("crypto/sm2/sm2_sign.c",0x69,"ossl_sm2_compute_z_digest");
              uVar12 = 0x80010;
              goto LAB_00b619e4;
            }
            ERR_new();
            uVar12 = 0x5f;
          }
          goto LAB_00b619d4;
        }
        ERR_new();
        ERR_set_debug("crypto/sm2/sm2_sign.c",0x52,"ossl_sm2_compute_z_digest");
        uVar12 = 0x6f;
      }
    }
LAB_00b619e4:
    ERR_set_error(0x35,uVar12,0);
  }
  uVar12 = 0;
  d = (void *)0x0;
LAB_00b619f4:
  CRYPTO_free(d);
  BN_CTX_free(ctx_00);
  EVP_MD_CTX_free(ctx);
  return uVar12;
}


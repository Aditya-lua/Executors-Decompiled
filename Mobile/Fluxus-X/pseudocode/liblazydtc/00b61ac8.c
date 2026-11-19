/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b61ac8
 */

BIGNUM * FUN_00b61ac8(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                     void *param_5,size_t param_6)

{
  undefined4 uVar1;
  int len;
  int iVar2;
  EVP_MD_CTX *ctx;
  undefined8 uVar3;
  undefined8 uVar4;
  uchar *md;
  undefined8 uVar5;
  EVP_MD *type;
  BIGNUM *pBVar6;
  
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  len = EVP_MD_get_size(param_1);
  uVar3 = ossl_ec_key_get_libctx(param_2);
  uVar4 = ossl_ec_key_get0_propq(param_2);
  if (len < 0) {
    ERR_new();
    ERR_set_debug("crypto/sm2/sm2_sign.c",0xa3,"sm2_compute_msg_hash");
    ERR_set_error(0x35,0x66,0);
    type = (EVP_MD *)0x0;
    pBVar6 = (BIGNUM *)0x0;
    md = (uchar *)0x0;
    goto LAB_00b61d00;
  }
  md = (uchar *)CRYPTO_zalloc((long)len,"crypto/sm2/sm2_sign.c",0xa7);
  if ((ctx == (EVP_MD_CTX *)0x0) || (md == (uchar *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/sm2/sm2_sign.c",0xa9,"sm2_compute_msg_hash");
    ERR_set_error(0x35,0xc0100,0);
    type = (EVP_MD *)0x0;
  }
  else {
    uVar5 = EVP_MD_get0_name(param_1);
    type = (EVP_MD *)EVP_MD_fetch(uVar3,uVar5,uVar4);
    if (type == (EVP_MD *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/sm2/sm2_sign.c",0xaf,"sm2_compute_msg_hash");
      uVar1 = 0xc0103;
    }
    else {
      iVar2 = ossl_sm2_compute_z_digest(md,type,param_3,param_4,param_2);
      if (iVar2 == 0) goto LAB_00b61cfc;
      iVar2 = EVP_DigestInit(ctx,type);
      if (iVar2 != 0) {
        iVar2 = EVP_DigestUpdate(ctx,md,(long)len);
        if (iVar2 != 0) {
          iVar2 = EVP_DigestUpdate(ctx,param_5,param_6);
          if (iVar2 != 0) {
            iVar2 = EVP_DigestFinal(ctx,md,(uint *)0x0);
            if (iVar2 != 0) {
              pBVar6 = BN_bin2bn(md,len,(BIGNUM *)0x0);
              if (pBVar6 == (BIGNUM *)0x0) {
                ERR_new();
                ERR_set_debug("crypto/sm2/sm2_sign.c",0xc3,"sm2_compute_msg_hash");
                ERR_set_error(0x35,0xc0103,0);
              }
              goto LAB_00b61d00;
            }
          }
        }
      }
      ERR_new();
      ERR_set_debug("crypto/sm2/sm2_sign.c",0xbd,"sm2_compute_msg_hash");
      uVar1 = 0x80006;
    }
    ERR_set_error(0x35,uVar1,0);
  }
LAB_00b61cfc:
  pBVar6 = (BIGNUM *)0x0;
LAB_00b61d00:
  EVP_MD_free(type);
  CRYPTO_free(md);
  EVP_MD_CTX_free(ctx);
  return pBVar6;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad3630
 */

int FUN_00ad3630(int param_1,uchar *param_2,uchar *param_3,long param_4,int param_5)

{
  int iVar1;
  int iVar2;
  BN_CTX *ctx;
  BIGNUM *ret;
  BIGNUM *r;
  uchar *f;
  BIGNUM *pBVar3;
  BN_MONT_CTX *pBVar4;
  ulong *puVar5;
  undefined8 uVar6;
  
  iVar1 = BN_num_bits(*(BIGNUM **)(param_4 + 0x28));
  if (0x4000 < iVar1) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_ossl.c",0x208,"rsa_ossl_public_decrypt");
    uVar6 = 0x69;
    goto LAB_00ad37ac;
  }
  iVar1 = BN_ucmp(*(BIGNUM **)(param_4 + 0x28),*(BIGNUM **)(param_4 + 0x30));
  if (iVar1 < 1) {
    ERR_new();
    uVar6 = 0x20d;
  }
  else {
    iVar1 = BN_num_bits(*(BIGNUM **)(param_4 + 0x28));
    if ((iVar1 < 0xc01) || (iVar1 = BN_num_bits(*(BIGNUM **)(param_4 + 0x30)), iVar1 < 0x41)) {
      ctx = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_4 + 8));
      if (ctx == (BN_CTX *)0x0) {
        iVar1 = 0;
        f = (uchar *)0x0;
        goto LAB_00ad37f8;
      }
      BN_CTX_start(ctx);
      ret = BN_CTX_get(ctx);
      r = BN_CTX_get(ctx);
      iVar2 = BN_num_bits(*(BIGNUM **)(param_4 + 0x28));
      iVar1 = iVar2 + 0xe;
      if (-1 < iVar2 + 7) {
        iVar1 = iVar2 + 7;
      }
      iVar1 = iVar1 >> 3;
      f = CRYPTO_malloc(iVar1,"crypto/rsa/rsa_ossl.c",0x21f);
      if ((r == (BIGNUM *)0x0) || (f == (uchar *)0x0)) {
        ERR_new();
        ERR_set_debug("crypto/rsa/rsa_ossl.c",0x221,"rsa_ossl_public_decrypt");
        uVar6 = 0xc0100;
LAB_00ad37f0:
        ERR_set_error(4,uVar6,0);
      }
      else {
        if (iVar1 < param_1) {
          ERR_new();
          ERR_set_debug("crypto/rsa/rsa_ossl.c",0x22a,"rsa_ossl_public_decrypt");
          uVar6 = 0x6c;
          goto LAB_00ad37f0;
        }
        pBVar3 = BN_bin2bn(param_2,param_1,ret);
        if (pBVar3 != (BIGNUM *)0x0) {
          iVar2 = BN_ucmp(ret,*(BIGNUM **)(param_4 + 0x28));
          if (-1 < iVar2) {
            ERR_new();
            ERR_set_debug("crypto/rsa/rsa_ossl.c",0x232,"rsa_ossl_public_decrypt");
            uVar6 = 0x84;
            goto LAB_00ad37f0;
          }
          if ((((((*(byte *)(param_4 + 0xa4) >> 1 & 1) == 0) ||
                (pBVar4 = BN_MONT_CTX_set_locked
                                    ((BN_MONT_CTX **)(param_4 + 0xa8),
                                     (int)*(undefined8 *)(param_4 + 0xd0),
                                     *(BIGNUM **)(param_4 + 0x28),ctx), pBVar4 != (BN_MONT_CTX *)0x0
                )) && (iVar2 = (**(code **)(*(long *)(param_4 + 0x18) + 0x30))
                                         (r,ret,*(undefined8 *)(param_4 + 0x30),
                                          *(undefined8 *)(param_4 + 0x28),ctx,
                                          *(undefined8 *)(param_4 + 0xa8)), iVar2 != 0)) &&
              (((param_5 != 5 || (puVar5 = (ulong *)bn_get_words(r), (*puVar5 & 0xf) == 0xc)) ||
               (iVar2 = BN_sub(r,*(BIGNUM **)(param_4 + 0x28),r), iVar2 != 0)))) &&
             (iVar2 = BN_bn2binpad(r,f,iVar1), -1 < iVar2)) {
            if (param_5 == 5) {
              iVar2 = RSA_padding_check_X931(param_3,iVar1,f,iVar2,iVar1);
            }
            else {
              if (param_5 == 3) {
                memcpy(param_3,f,(long)iVar2);
                goto LAB_00ad37fc;
              }
              if (param_5 != 1) {
                ERR_new();
                ERR_set_debug("crypto/rsa/rsa_ossl.c",0x252,"rsa_ossl_public_decrypt");
                uVar6 = 0x76;
                goto LAB_00ad37f0;
              }
              iVar2 = RSA_padding_check_PKCS1_type_1(param_3,iVar1,f,iVar2,iVar1);
            }
            if (iVar2 < 0) {
              ERR_new();
              ERR_set_debug("crypto/rsa/rsa_ossl.c",0x256,"rsa_ossl_public_decrypt");
              ERR_set_error(4,0x72,0);
            }
            goto LAB_00ad37fc;
          }
        }
      }
LAB_00ad37f8:
      iVar2 = -1;
LAB_00ad37fc:
      BN_CTX_end(ctx);
      BN_CTX_free(ctx);
      CRYPTO_clear_free(f,(long)iVar1,"crypto/rsa/rsa_ossl.c",0x25b);
      return iVar2;
    }
    ERR_new();
    uVar6 = 0x214;
  }
  ERR_set_debug("crypto/rsa/rsa_ossl.c",uVar6,"rsa_ossl_public_decrypt");
  uVar6 = 0x65;
LAB_00ad37ac:
  ERR_set_error(4,uVar6,0);
  return -1;
}


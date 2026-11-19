/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a36208
 */

ECDSA_SIG *
ossl_ecdsa_simple_sign_sig
          (uchar *param_1,int param_2,BIGNUM *param_3,BIGNUM *param_4,EC_KEY *param_5)

{
  int iVar1;
  uint uVar2;
  EC_GROUP *pEVar3;
  BIGNUM *pBVar4;
  ECDSA_SIG *sig;
  BIGNUM *pBVar5;
  BN_CTX *ctx;
  BIGNUM *ret;
  BIGNUM *a;
  BIGNUM *pBVar6;
  undefined8 uVar7;
  BIGNUM *local_a0;
  BIGNUM *local_80;
  BIGNUM *local_68;
  
  local_68 = (BIGNUM *)0x0;
  pEVar3 = EC_KEY_get0_group(param_5);
  pBVar4 = EC_KEY_get0_private_key(param_5);
  if (pEVar3 == (EC_GROUP *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecdsa_ossl.c",0xe2,"ossl_ecdsa_simple_sign_sig");
    uVar7 = 0xc0102;
  }
  else if (pBVar4 == (BIGNUM *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecdsa_ossl.c",0xe6,"ossl_ecdsa_simple_sign_sig");
    uVar7 = 0x7d;
  }
  else {
    iVar1 = EC_KEY_can_sign(param_5);
    if (iVar1 != 0) {
      sig = ECDSA_SIG_new();
      if (sig == (ECDSA_SIG *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/ec/ecdsa_ossl.c",0xf1,"ossl_ecdsa_simple_sign_sig");
        ERR_set_error(0x10,0xc0100,0);
        return (ECDSA_SIG *)0x0;
      }
      pBVar5 = BN_new();
      sig->r = pBVar5;
      pBVar5 = BN_new();
      sig->s = pBVar5;
      if ((pBVar5 == (BIGNUM *)0x0) || (sig->r == (BIGNUM *)0x0)) {
        ERR_new();
        ERR_set_debug("crypto/ec/ecdsa_ossl.c",0xf7,"ossl_ecdsa_simple_sign_sig");
        ERR_set_error(0x10,0xc0100,0);
        local_a0 = (BIGNUM *)0x0;
        ret = (BIGNUM *)0x0;
        ctx = (BN_CTX *)0x0;
      }
      else {
        ctx = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_5 + 0x58));
        if ((ctx == (BN_CTX *)0x0) || (ret = BN_new(), ret == (BIGNUM *)0x0)) {
          ERR_new();
          ERR_set_debug("crypto/ec/ecdsa_ossl.c",0xfe,"ossl_ecdsa_simple_sign_sig");
          ERR_set_error(0x10,0xc0100,0);
          local_a0 = (BIGNUM *)0x0;
          ret = (BIGNUM *)0x0;
        }
        else {
          a = (BIGNUM *)EC_GROUP_get0_order(pEVar3);
          uVar2 = BN_num_bits(a);
          if ((int)uVar2 < param_2 * 8) {
            param_2 = uVar2 + 0xe;
            if (-1 < (int)(uVar2 + 7)) {
              param_2 = uVar2 + 7;
            }
            param_2 = param_2 >> 3;
          }
          pBVar6 = BN_bin2bn(param_1,param_2,ret);
          if (pBVar6 == (BIGNUM *)0x0) {
            ERR_new();
            uVar7 = 0x10a;
          }
          else {
            if ((param_2 * 8 <= (int)uVar2) ||
               (iVar1 = BN_rshift(ret,ret,8 - (uVar2 & 7)), iVar1 != 0)) {
              uVar2 = 0xffffffff;
              local_a0 = (BIGNUM *)0x0;
              do {
                if (param_3 != (BIGNUM *)0x0 && param_4 != (BIGNUM *)0x0) {
                  pBVar6 = BN_copy(sig->r,param_4);
                  if (pBVar6 == (BIGNUM *)0x0) {
                    ERR_new();
                    ERR_set_debug("crypto/ec/ecdsa_ossl.c",0x11c,"ossl_ecdsa_simple_sign_sig");
                    uVar7 = 0xc0100;
                    goto LAB_00a36744;
                  }
                  local_80 = param_3;
                }
                else {
                  iVar1 = FUN_00a35d2c(param_5,ctx,&local_68,sig,param_1,param_2);
                  if (iVar1 == 0) {
                    ERR_new();
                    ERR_set_debug("crypto/ec/ecdsa_ossl.c",0x115,"ossl_ecdsa_simple_sign_sig");
                    ERR_set_error(0x10,0x8002a,0);
                    local_a0 = local_68;
                    goto LAB_00a36758;
                  }
                  local_a0 = local_68;
                  local_80 = local_68;
                }
                iVar1 = bn_to_mont_fixed_top(pBVar5,sig->r,*(undefined8 *)(pEVar3 + 0x90),ctx);
                if ((iVar1 == 0) ||
                   (iVar1 = bn_mul_mont_fixed_top
                                      (pBVar5,pBVar5,pBVar4,*(undefined8 *)(pEVar3 + 0x90),ctx),
                   iVar1 == 0)) {
                  ERR_new();
                  uVar7 = 0x12a;
LAB_00a36664:
                  ERR_set_debug("crypto/ec/ecdsa_ossl.c",uVar7,"ossl_ecdsa_simple_sign_sig");
                  ERR_set_error(0x10,0x80003,0);
                  goto LAB_00a36758;
                }
                iVar1 = bn_mod_add_fixed_top(pBVar5,pBVar5,ret,a);
                if (iVar1 == 0) {
                  ERR_new();
                  ERR_set_debug("crypto/ec/ecdsa_ossl.c",0x12e,"ossl_ecdsa_simple_sign_sig");
                  uVar7 = 0x80003;
                  goto LAB_00a36744;
                }
                iVar1 = bn_to_mont_fixed_top(pBVar5,pBVar5,*(undefined8 *)(pEVar3 + 0x90),ctx);
                if ((iVar1 == 0) ||
                   (iVar1 = BN_mod_mul_montgomery
                                      (pBVar5,pBVar5,local_80,*(BN_MONT_CTX **)(pEVar3 + 0x90),ctx),
                   iVar1 == 0)) {
                  ERR_new();
                  uVar7 = 0x137;
                  goto LAB_00a36664;
                }
                iVar1 = BN_is_zero(pBVar5);
                if (iVar1 == 0) goto LAB_00a36764;
                if (param_3 != (BIGNUM *)0x0 && param_4 != (BIGNUM *)0x0) {
                  ERR_new();
                  ERR_set_debug("crypto/ec/ecdsa_ossl.c",0x141,"ossl_ecdsa_simple_sign_sig");
                  uVar7 = 0x9d;
                  goto LAB_00a36744;
                }
                uVar2 = uVar2 + 1;
              } while (uVar2 < 9);
              ERR_new();
              ERR_set_debug("crypto/ec/ecdsa_ossl.c",0x146,"ossl_ecdsa_simple_sign_sig");
              uVar7 = 0xb0;
LAB_00a36744:
              ERR_set_error(0x10,uVar7,0);
              goto LAB_00a36758;
            }
            ERR_new();
            uVar7 = 0x10f;
          }
          ERR_set_debug("crypto/ec/ecdsa_ossl.c",uVar7,"ossl_ecdsa_simple_sign_sig");
          ERR_set_error(0x10,0x80003,0);
          local_a0 = (BIGNUM *)0x0;
        }
      }
LAB_00a36758:
      ECDSA_SIG_free(sig);
      sig = (ECDSA_SIG *)0x0;
LAB_00a36764:
      BN_CTX_free(ctx);
      BN_clear_free(ret);
      BN_clear_free(local_a0);
      return sig;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ecdsa_ossl.c",0xeb,"ossl_ecdsa_simple_sign_sig");
    uVar7 = 0x9f;
  }
  ERR_set_error(0x10,uVar7,0);
  return (ECDSA_SIG *)0x0;
}


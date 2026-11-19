/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a35d2c
 */

undefined8
FUN_00a35d2c(EC_KEY *param_1,BN_CTX *param_2,undefined8 *param_3,undefined8 *param_4,long param_5,
            int param_6)

{
  undefined4 uVar1;
  int iVar2;
  int iVar3;
  EC_GROUP *group;
  BIGNUM *pBVar4;
  BN_CTX *ctx;
  BIGNUM *a;
  BIGNUM *a_00;
  BIGNUM *a_01;
  EC_POINT *r;
  BIGNUM *a_02;
  undefined8 uVar5;
  
  if ((param_1 == (EC_KEY *)0x0) || (group = EC_KEY_get0_group(param_1), group == (EC_GROUP *)0x0))
  {
    ERR_new();
    ERR_set_debug("crypto/ec/ecdsa_ossl.c",0x66,"ecdsa_sign_setup");
    uVar5 = 0xc0102;
LAB_00a35f74:
    ERR_set_error(0x10,uVar5,0);
    return 0;
  }
  pBVar4 = EC_KEY_get0_private_key(param_1);
  if (pBVar4 == (BIGNUM *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecdsa_ossl.c",0x6a,"ecdsa_sign_setup");
    ERR_set_error(0x10,0x7d,0);
    return 0;
  }
  iVar2 = EC_KEY_can_sign(param_1);
  if (iVar2 == 0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecdsa_ossl.c",0x6f,"ecdsa_sign_setup");
    uVar5 = 0x9f;
    goto LAB_00a35f74;
  }
  ctx = param_2;
  if ((param_2 == (BN_CTX *)0x0) &&
     (ctx = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_1 + 0x58)), ctx == (BN_CTX *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecdsa_ossl.c",0x75,"ecdsa_sign_setup");
    uVar5 = 0xc0100;
    goto LAB_00a35f74;
  }
  a = (BIGNUM *)BN_secure_new();
  a_00 = BN_new();
  a_01 = BN_new();
  if (((a == (BIGNUM *)0x0) || (a_00 == (BIGNUM *)0x0)) || (a_01 == (BIGNUM *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecdsa_ossl.c",0x7e,"ecdsa_sign_setup");
    uVar1 = 0xc0100;
LAB_00a36060:
    ERR_set_error(0x10,uVar1,0);
    r = (EC_POINT *)0x0;
  }
  else {
    r = EC_POINT_new(group);
    if (r == (EC_POINT *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ecdsa_ossl.c",0x82,"ecdsa_sign_setup");
      uVar1 = 0x80010;
      goto LAB_00a36060;
    }
    a_02 = (BIGNUM *)EC_GROUP_get0_order(group);
    iVar2 = BN_num_bits(a_02);
    if (((0x3f < iVar2) && (iVar3 = BN_set_bit(a,iVar2), iVar3 != 0)) &&
       ((iVar3 = BN_set_bit(a_00,iVar2), iVar3 != 0 && (iVar2 = BN_set_bit(a_01,iVar2), iVar2 != 0))
       )) {
      do {
        do {
          if (param_5 == 0) {
            iVar2 = ossl_bn_priv_rand_range_fixed_top(a,a_02,0,ctx);
            if (iVar2 == 0) {
              ERR_new();
              uVar5 = 0x9b;
              goto LAB_00a361c0;
            }
          }
          else {
            iVar2 = ossl_bn_gen_dsa_nonce_fixed_top(a,a_02,pBVar4,param_5,(long)param_6,ctx);
            if (iVar2 == 0) {
              ERR_new();
              uVar5 = 0x96;
LAB_00a361c0:
              ERR_set_debug("crypto/ec/ecdsa_ossl.c",uVar5,"ecdsa_sign_setup");
              uVar5 = 0x9e;
              goto LAB_00a361cc;
            }
          }
          iVar2 = ossl_bn_is_word_fixed_top(a,0);
        } while (iVar2 != 0);
        iVar2 = EC_POINT_mul(group,r,a,(EC_POINT *)0x0,(BIGNUM *)0x0,ctx);
        if (iVar2 == 0) {
          ERR_new();
          ERR_set_debug("crypto/ec/ecdsa_ossl.c",0xa3,"ecdsa_sign_setup");
          ERR_set_error(0x10,0x80010,0);
          goto LAB_00a36070;
        }
        iVar2 = EC_POINT_get_affine_coordinates(group,r,a_01,0,ctx);
        if (iVar2 == 0) {
          ERR_new();
          ERR_set_debug("crypto/ec/ecdsa_ossl.c",0xa8,"ecdsa_sign_setup");
          ERR_set_error(0x10,0x80010,0);
          goto LAB_00a36070;
        }
        iVar2 = BN_nnmod(a_00,a_01,a_02,ctx);
        if (iVar2 == 0) {
          ERR_new();
          ERR_set_debug("crypto/ec/ecdsa_ossl.c",0xad,"ecdsa_sign_setup");
          ERR_set_error(0x10,0x80003,0);
          goto LAB_00a36070;
        }
        iVar2 = BN_is_zero(a_00);
      } while (iVar2 != 0);
      iVar2 = ossl_ec_group_do_inverse_ord(group,a,a,ctx);
      if (iVar2 != 0) {
        BN_clear_free((BIGNUM *)*param_4);
        BN_clear_free((BIGNUM *)*param_3);
        uVar5 = 1;
        *param_4 = a_00;
        *param_3 = a;
        goto joined_r0x00a36088;
      }
      ERR_new();
      ERR_set_debug("crypto/ec/ecdsa_ossl.c",0xb4,"ecdsa_sign_setup");
      uVar5 = 0x80003;
LAB_00a361cc:
      ERR_set_error(0x10,uVar5,0);
    }
  }
LAB_00a36070:
  BN_clear_free(a);
  BN_clear_free(a_00);
  uVar5 = 0;
joined_r0x00a36088:
  if (ctx != param_2) {
    BN_CTX_free(ctx);
  }
  EC_POINT_free(r);
  BN_clear_free(a_01);
  return uVar5;
}


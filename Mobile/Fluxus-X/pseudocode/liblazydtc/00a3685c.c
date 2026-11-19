/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3685c
 */

ulong ossl_ecdsa_simple_verify_sig(uchar *param_1,int param_2,undefined8 *param_3,EC_KEY *param_4)

{
  undefined4 uVar1;
  int iVar2;
  uint uVar3;
  EC_GROUP *group;
  EC_POINT *q;
  BN_CTX *ctx;
  BIGNUM *r;
  BIGNUM *b;
  BIGNUM *ret;
  BIGNUM *m;
  BIGNUM *b_00;
  BIGNUM *pBVar4;
  undefined8 uVar5;
  ulong uVar6;
  EC_POINT *r_00;
  
  if ((((param_4 == (EC_KEY *)0x0) || (group = EC_KEY_get0_group(param_4), group == (EC_GROUP *)0x0)
       ) || (q = EC_KEY_get0_public_key(param_4), param_3 == (undefined8 *)0x0)) ||
     (q == (EC_POINT *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecdsa_ossl.c",0x188,"ossl_ecdsa_simple_verify_sig");
    uVar5 = 0x7c;
LAB_00a369c8:
    ERR_set_error(0x10,uVar5,0);
    return 0xffffffff;
  }
  iVar2 = EC_KEY_can_sign(param_4);
  if (iVar2 == 0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecdsa_ossl.c",0x18d,"ossl_ecdsa_simple_verify_sig");
    uVar5 = 0x9f;
    goto LAB_00a369c8;
  }
  ctx = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_4 + 0x58));
  if (ctx == (BN_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecdsa_ossl.c",0x193,"ossl_ecdsa_simple_verify_sig");
    uVar5 = 0xc0100;
    goto LAB_00a369c8;
  }
  BN_CTX_start(ctx);
  r = BN_CTX_get(ctx);
  b = BN_CTX_get(ctx);
  ret = BN_CTX_get(ctx);
  m = BN_CTX_get(ctx);
  if (m == (BIGNUM *)0x0) {
    ERR_new();
    uVar5 = 0x19c;
    goto LAB_00a36a64;
  }
  b_00 = (BIGNUM *)EC_GROUP_get0_order(group);
  if (b_00 == (BIGNUM *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecdsa_ossl.c",0x1a2,"ossl_ecdsa_simple_verify_sig");
    uVar1 = 0x80010;
LAB_00a36aa4:
    ERR_set_error(0x10,uVar1,0);
    r_00 = (EC_POINT *)0x0;
  }
  else {
    iVar2 = BN_is_zero(*param_3);
    if ((((iVar2 != 0) || (iVar2 = BN_is_negative(*param_3), iVar2 != 0)) ||
        ((iVar2 = BN_ucmp((BIGNUM *)*param_3,b_00), -1 < iVar2 ||
         ((iVar2 = BN_is_zero(param_3[1]), iVar2 != 0 ||
          (iVar2 = BN_is_negative(param_3[1]), iVar2 != 0)))))) ||
       (iVar2 = BN_ucmp((BIGNUM *)param_3[1],b_00), -1 < iVar2)) {
      ERR_new();
      ERR_set_debug("crypto/ec/ecdsa_ossl.c",0x1a9,"ossl_ecdsa_simple_verify_sig");
      ERR_set_error(0x10,0x9c,0);
      uVar6 = 0;
      r_00 = (EC_POINT *)0x0;
      goto LAB_00a36ab4;
    }
    iVar2 = ossl_ec_group_do_inverse_ord(group,b,param_3[1],ctx);
    if (iVar2 == 0) {
      ERR_new();
      uVar5 = 0x1af;
LAB_00a36a64:
      ERR_set_debug("crypto/ec/ecdsa_ossl.c",uVar5,"ossl_ecdsa_simple_verify_sig");
      uVar1 = 0x80003;
      goto LAB_00a36aa4;
    }
    uVar3 = BN_num_bits(b_00);
    if ((int)uVar3 < param_2 * 8) {
      param_2 = uVar3 + 0xe;
      if (-1 < (int)(uVar3 + 7)) {
        param_2 = uVar3 + 7;
      }
      param_2 = param_2 >> 3;
    }
    pBVar4 = BN_bin2bn(param_1,param_2,ret);
    if (pBVar4 == (BIGNUM *)0x0) {
      ERR_new();
      uVar5 = 0x1ba;
      goto LAB_00a36a64;
    }
    if (((int)uVar3 < param_2 * 8) && (iVar2 = BN_rshift(ret,ret,8 - (uVar3 & 7)), iVar2 == 0)) {
      ERR_new();
      uVar5 = 0x1bf;
      goto LAB_00a36a64;
    }
    iVar2 = BN_mod_mul(r,ret,b,b_00,ctx);
    if (iVar2 == 0) {
      ERR_new();
      uVar5 = 0x1c4;
      goto LAB_00a36a64;
    }
    iVar2 = BN_mod_mul(b,(BIGNUM *)*param_3,b,b_00,ctx);
    if (iVar2 == 0) {
      ERR_new();
      uVar5 = 0x1c9;
      goto LAB_00a36a64;
    }
    r_00 = EC_POINT_new(group);
    if (r_00 == (EC_POINT *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ecdsa_ossl.c",0x1ce,"ossl_ecdsa_simple_verify_sig");
      uVar5 = 0xc0100;
    }
    else {
      iVar2 = EC_POINT_mul(group,r_00,r,q,b,ctx);
      if (iVar2 == 0) {
        ERR_new();
        uVar5 = 0x1d2;
      }
      else {
        iVar2 = EC_POINT_get_affine_coordinates(group,r_00,m,0,ctx);
        if (iVar2 != 0) {
          iVar2 = BN_nnmod(r,m,b_00,ctx);
          if (iVar2 != 0) {
            iVar2 = BN_ucmp(r,(BIGNUM *)*param_3);
            uVar6 = (ulong)(iVar2 == 0);
            goto LAB_00a36ab4;
          }
          ERR_new();
          ERR_set_debug("crypto/ec/ecdsa_ossl.c",0x1dc,"ossl_ecdsa_simple_verify_sig");
          uVar5 = 0x80003;
          goto LAB_00a36d3c;
        }
        ERR_new();
        uVar5 = 0x1d7;
      }
      ERR_set_debug("crypto/ec/ecdsa_ossl.c",uVar5,"ossl_ecdsa_simple_verify_sig");
      uVar5 = 0x80010;
    }
LAB_00a36d3c:
    ERR_set_error(0x10,uVar5,0);
  }
  uVar6 = 0xffffffff;
LAB_00a36ab4:
  BN_CTX_end(ctx);
  BN_CTX_free(ctx);
  EC_POINT_free(r_00);
  return uVar6;
}


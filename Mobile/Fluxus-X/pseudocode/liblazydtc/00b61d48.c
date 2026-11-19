/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b61d48
 */

ECDSA_SIG * FUN_00b61d48(EC_KEY *param_1,BIGNUM *param_2)

{
  int iVar1;
  BIGNUM *a;
  EC_GROUP *group;
  BIGNUM *m;
  undefined8 uVar2;
  EC_POINT *r;
  BN_CTX *ctx;
  BIGNUM *n;
  BIGNUM *r_00;
  BIGNUM *b;
  BIGNUM *r_01;
  BIGNUM *r_02;
  BIGNUM *r_03;
  BIGNUM *b_00;
  ECDSA_SIG *pEVar3;
  
  a = EC_KEY_get0_private_key(param_1);
  group = EC_KEY_get0_group(param_1);
  m = (BIGNUM *)EC_GROUP_get0_order();
  uVar2 = ossl_ec_key_get_libctx(param_1);
  r = EC_POINT_new(group);
  ctx = (BN_CTX *)BN_CTX_new_ex(uVar2);
  if ((r == (EC_POINT *)0x0) || (ctx == (BN_CTX *)0x0)) {
    ERR_new();
    uVar2 = 0xdf;
  }
  else {
    BN_CTX_start(ctx);
    n = BN_CTX_get(ctx);
    r_00 = BN_CTX_get(ctx);
    b = BN_CTX_get(ctx);
    r_01 = BN_CTX_get(ctx);
    if (r_01 != (BIGNUM *)0x0) {
      r_02 = BN_new();
      r_03 = BN_new();
      if ((r_02 == (BIGNUM *)0x0) || (r_03 == (BIGNUM *)0x0)) {
        ERR_new();
        uVar2 = 0xf5;
LAB_00b62008:
        ERR_set_debug("crypto/sm2/sm2_sign.c",uVar2,"sm2_sig_gen");
        uVar2 = 0xc0100;
      }
      else {
        iVar1 = BN_priv_rand_range_ex(n,m,0,ctx);
        while (iVar1 != 0) {
          iVar1 = EC_POINT_mul(group,r,n,(EC_POINT *)0x0,(BIGNUM *)0x0,ctx);
          if (((iVar1 == 0) ||
              (iVar1 = EC_POINT_get_affine_coordinates(group,r,b,0,ctx), iVar1 == 0)) ||
             (iVar1 = BN_mod_add(r_02,param_2,b,m,ctx), iVar1 == 0)) {
            ERR_new();
            uVar2 = 0x10c;
            goto LAB_00b62034;
          }
          iVar1 = BN_is_zero(r_02);
          if (iVar1 == 0) {
            iVar1 = BN_add(r_00,r_02,n);
            if (iVar1 == 0) {
              ERR_new();
              ERR_set_debug("crypto/sm2/sm2_sign.c",0x115,"sm2_sig_gen");
              ERR_set_error(0x35,0xc0103,0);
              goto LAB_00b62050;
            }
            iVar1 = BN_cmp(r_00,m);
            if (iVar1 != 0) {
              b_00 = BN_value_one();
              iVar1 = BN_add(r_03,a,b_00);
              if (((iVar1 == 0) ||
                  (iVar1 = ossl_ec_group_do_inverse_ord(group,r_03,r_03,ctx), iVar1 == 0)) ||
                 ((iVar1 = BN_mod_mul(r_01,a,r_02,m,ctx), iVar1 == 0 ||
                  ((iVar1 = BN_sub(r_01,n,r_01), iVar1 == 0 ||
                   (iVar1 = BN_mod_mul(r_03,r_03,r_01,m,ctx), iVar1 == 0)))))) {
                ERR_new();
                ERR_set_debug("crypto/sm2/sm2_sign.c",0x121,"sm2_sig_gen");
                uVar2 = 0x80003;
                goto LAB_00b62048;
              }
              iVar1 = BN_is_zero(r_03);
              if (iVar1 == 0) {
                pEVar3 = ECDSA_SIG_new();
                if (pEVar3 != (ECDSA_SIG *)0x0) {
                  ECDSA_SIG_set0(pEVar3,r_02,r_03);
                  goto LAB_00b62064;
                }
                ERR_new();
                uVar2 = 299;
                goto LAB_00b62008;
              }
            }
          }
          iVar1 = BN_priv_rand_range_ex(n,m,0,ctx);
        }
        ERR_new();
        uVar2 = 0x104;
LAB_00b62034:
        ERR_set_debug("crypto/sm2/sm2_sign.c",uVar2,"sm2_sig_gen");
        uVar2 = 0xc0103;
      }
LAB_00b62048:
      ERR_set_error(0x35,uVar2,0);
      goto LAB_00b62050;
    }
    ERR_new();
    uVar2 = 0xe9;
  }
  ERR_set_debug("crypto/sm2/sm2_sign.c",uVar2,"sm2_sig_gen");
  ERR_set_error(0x35,0xc0100,0);
  r_02 = (BIGNUM *)0x0;
  r_03 = (BIGNUM *)0x0;
LAB_00b62050:
  BN_free(r_02);
  BN_free(r_03);
  pEVar3 = (ECDSA_SIG *)0x0;
LAB_00b62064:
  BN_CTX_free(ctx);
  EC_POINT_free(r);
  return pEVar3;
}


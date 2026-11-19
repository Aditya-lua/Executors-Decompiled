/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b621b0
 */

bool FUN_00b621b0(EC_KEY *param_1,undefined8 param_2,BIGNUM *param_3)

{
  BIGNUM *pBVar1;
  bool bVar2;
  int iVar3;
  EC_GROUP *group;
  BIGNUM *a;
  BN_CTX *ctx;
  EC_POINT *r;
  BIGNUM *r_00;
  BIGNUM *b;
  BIGNUM *pBVar4;
  EC_POINT *q;
  undefined8 uVar5;
  BIGNUM *local_68;
  BIGNUM *local_58;
  
  group = EC_KEY_get0_group(param_1);
  a = (BIGNUM *)EC_GROUP_get0_order();
  local_58 = (BIGNUM *)0x0;
  local_68 = (BIGNUM *)0x0;
  ossl_ec_key_get_libctx(param_1);
  ctx = (BN_CTX *)BN_CTX_new_ex();
  r = EC_POINT_new(group);
  if ((ctx == (BN_CTX *)0x0) || (r == (EC_POINT *)0x0)) {
    ERR_new();
    uVar5 = 0x150;
LAB_00b62344:
    ERR_set_debug("crypto/sm2/sm2_sign.c",uVar5,"sm2_sig_verify");
    uVar5 = 0xc0100;
  }
  else {
    BN_CTX_start(ctx);
    r_00 = BN_CTX_get(ctx);
    b = BN_CTX_get(ctx);
    if (b == (BIGNUM *)0x0) {
      ERR_new();
      uVar5 = 0x158;
      goto LAB_00b62344;
    }
    ECDSA_SIG_get0(param_2,&local_58,&local_68);
    pBVar1 = local_58;
    pBVar4 = BN_value_one();
    iVar3 = BN_cmp(pBVar1,pBVar4);
    pBVar1 = local_68;
    if (iVar3 < 0) {
LAB_00b62304:
      ERR_new();
      uVar5 = 0x16c;
LAB_00b6231c:
      ERR_set_debug("crypto/sm2/sm2_sign.c",uVar5,"sm2_sig_verify");
      uVar5 = 0x65;
    }
    else {
      pBVar4 = BN_value_one();
      iVar3 = BN_cmp(pBVar1,pBVar4);
      if (iVar3 < 0) goto LAB_00b62304;
      iVar3 = BN_cmp(a,local_58);
      if (iVar3 < 1) goto LAB_00b62304;
      iVar3 = BN_cmp(a,local_68);
      if (iVar3 < 1) goto LAB_00b62304;
      iVar3 = BN_mod_add(r_00,local_58,local_68,a,ctx);
      if (iVar3 != 0) {
        iVar3 = BN_is_zero(r_00);
        pBVar1 = local_68;
        if (iVar3 == 0) {
          q = EC_KEY_get0_public_key(param_1);
          iVar3 = EC_POINT_mul(group,r,pBVar1,q,r_00,ctx);
          if ((iVar3 != 0) && (iVar3 = EC_POINT_get_affine_coordinates(group,r,b,0,ctx), iVar3 != 0)
             ) {
            iVar3 = BN_mod_add(r_00,param_3,b,a,ctx);
            if (iVar3 != 0) {
              iVar3 = BN_cmp(local_58,r_00);
              bVar2 = iVar3 == 0;
              goto LAB_00b62360;
            }
            ERR_new();
            uVar5 = 0x181;
            goto LAB_00b623ac;
          }
          ERR_new();
          ERR_set_debug("crypto/sm2/sm2_sign.c",0x17c,"sm2_sig_verify");
          uVar5 = 0x80010;
          goto LAB_00b62354;
        }
        ERR_new();
        uVar5 = 0x176;
        goto LAB_00b6231c;
      }
      ERR_new();
      uVar5 = 0x171;
LAB_00b623ac:
      ERR_set_debug("crypto/sm2/sm2_sign.c",uVar5,"sm2_sig_verify");
      uVar5 = 0x80003;
    }
  }
LAB_00b62354:
  ERR_set_error(0x35,uVar5,0);
  bVar2 = false;
LAB_00b62360:
  EC_POINT_free(r);
  BN_CTX_free(ctx);
  return bVar2;
}


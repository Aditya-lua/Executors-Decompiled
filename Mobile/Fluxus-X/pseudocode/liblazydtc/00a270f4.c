/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a270f4
 */

undefined8 ossl_ec_key_fromdata(EC_KEY *param_1,undefined8 param_2,int param_3)

{
  int iVar1;
  EC_GROUP *group;
  long lVar2;
  long lVar3;
  BN_CTX *ctx;
  EC_POINT *p;
  BIGNUM *pBVar4;
  undefined8 uVar5;
  size_t local_58;
  uchar *local_50;
  BIGNUM *local_48;
  
  local_50 = (uchar *)0x0;
  local_48 = (BIGNUM *)0x0;
  group = EC_KEY_get0_group(param_1);
  if (group == (EC_GROUP *)0x0) {
    return 0;
  }
  lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002ad463);
  if (param_3 == 0) {
    lVar3 = 0;
  }
  else {
    lVar3 = OSSL_PARAM_locate_const(param_2,&DAT_002a3e83);
  }
  ossl_ec_key_get_libctx(param_1);
  ctx = (BN_CTX *)BN_CTX_new_ex();
  if (ctx == (BN_CTX *)0x0) {
LAB_00a27250:
    p = (EC_POINT *)0x0;
  }
  else {
    p = (EC_POINT *)0x0;
    if (lVar2 == 0) {
LAB_00a271bc:
      if ((param_3 == 0) || (lVar3 == 0)) {
LAB_00a27220:
        if (((local_48 == (BIGNUM *)0x0) ||
            (iVar1 = EC_KEY_set_private_key(param_1,local_48), iVar1 != 0)) &&
           ((p == (EC_POINT *)0x0 || (iVar1 = EC_KEY_set_public_key(param_1,p), iVar1 != 0)))) {
          uVar5 = 1;
          goto LAB_00a27258;
        }
      }
      else {
        lVar2 = EC_GROUP_get0_order(group);
        if ((lVar2 != 0) && (iVar1 = BN_is_zero(), iVar1 == 0)) {
          iVar1 = bn_get_top(lVar2);
          pBVar4 = (BIGNUM *)BN_secure_new();
          local_48 = pBVar4;
          if ((pBVar4 != (BIGNUM *)0x0) && (lVar2 = bn_wexpand(pBVar4,iVar1 + 2), lVar2 != 0)) {
            BN_set_flags(pBVar4,4);
            iVar1 = OSSL_PARAM_get_BN(lVar3,&local_48);
            if (iVar1 != 0) goto LAB_00a27220;
          }
        }
      }
    }
    else {
      iVar1 = OSSL_PARAM_get_octet_string(lVar2,&local_50,0,&local_58);
      if (iVar1 == 0) goto LAB_00a27250;
      p = EC_POINT_new(group);
      if ((p != (EC_POINT *)0x0) &&
         (iVar1 = EC_POINT_oct2point(group,p,local_50,local_58,ctx), iVar1 != 0)) goto LAB_00a271bc;
    }
  }
  uVar5 = 0;
LAB_00a27258:
  BN_CTX_free(ctx);
  BN_clear_free(local_48);
  CRYPTO_free(local_50);
  EC_POINT_free(p);
  return uVar5;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2ef34
 */

undefined8 ossl_ec_key_public_check(long param_1,BN_CTX *param_2)

{
  int iVar1;
  EC_POINT *r;
  undefined8 uVar2;
  BIGNUM *m;
  
  iVar1 = ossl_ec_key_public_check_quick();
  if ((iVar1 == 0) || (r = EC_POINT_new(*(EC_GROUP **)(param_1 + 0x18)), r == (EC_POINT *)0x0)) {
    return 0;
  }
  m = *(BIGNUM **)(*(long *)(param_1 + 0x18) + 0x10);
  iVar1 = BN_is_zero(m);
  if (iVar1 == 0) {
    iVar1 = EC_POINT_mul(*(EC_GROUP **)(param_1 + 0x18),r,(BIGNUM *)0x0,
                         *(EC_POINT **)(param_1 + 0x20),m,param_2);
    if (iVar1 == 0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_key.c",0x1ec,"ossl_ec_key_public_check");
      uVar2 = 0x80010;
    }
    else {
      iVar1 = EC_POINT_is_at_infinity(*(EC_GROUP **)(param_1 + 0x18),r);
      if (iVar1 != 0) {
        uVar2 = 1;
        goto LAB_00a2efa8;
      }
      ERR_new();
      ERR_set_debug("crypto/ec/ec_key.c",0x1f0,"ossl_ec_key_public_check");
      uVar2 = 0x82;
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_key.c",0x1e7,"ossl_ec_key_public_check");
    uVar2 = 0x7a;
  }
  ERR_set_error(0x10,uVar2,0);
  uVar2 = 0;
LAB_00a2efa8:
  EC_POINT_free(r);
  return uVar2;
}


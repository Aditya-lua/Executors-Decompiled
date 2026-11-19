/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f110
 */

undefined8 ossl_ec_key_pairwise_check(long param_1,BN_CTX *param_2)

{
  int iVar1;
  EC_POINT *r;
  undefined8 uVar2;
  
  if ((((param_1 == 0) || (*(EC_GROUP **)(param_1 + 0x18) == (EC_GROUP *)0x0)) ||
      (*(long *)(param_1 + 0x20) == 0)) || (*(long *)(param_1 + 0x28) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_key.c",0x21a,"ossl_ec_key_pairwise_check");
    ERR_set_error(0x10,0xc0102,0);
    return 0;
  }
  r = EC_POINT_new(*(EC_GROUP **)(param_1 + 0x18));
  if (r != (EC_POINT *)0x0) {
    iVar1 = EC_POINT_mul(*(EC_GROUP **)(param_1 + 0x18),r,*(BIGNUM **)(param_1 + 0x28),
                         (EC_POINT *)0x0,(BIGNUM *)0x0,param_2);
    if (iVar1 == 0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_key.c",0x224,"ossl_ec_key_pairwise_check");
      uVar2 = 0x80010;
    }
    else {
      iVar1 = EC_POINT_cmp(*(EC_GROUP **)(param_1 + 0x18),r,*(EC_POINT **)(param_1 + 0x20),param_2);
      if (iVar1 == 0) {
        uVar2 = 1;
        goto LAB_00a2f228;
      }
      ERR_new();
      ERR_set_debug("crypto/ec/ec_key.c",0x228,"ossl_ec_key_pairwise_check");
      uVar2 = 0x7b;
    }
    ERR_set_error(0x10,uVar2,0);
  }
  uVar2 = 0;
LAB_00a2f228:
  EC_POINT_free(r);
  return uVar2;
}


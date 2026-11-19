/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f054
 */

undefined8 ossl_ec_key_private_check(long param_1)

{
  int iVar1;
  BIGNUM *b;
  undefined8 uVar2;
  BIGNUM *a;
  
  if (((param_1 == 0) || (*(long *)(param_1 + 0x18) == 0)) ||
     (a = *(BIGNUM **)(param_1 + 0x28), a == (BIGNUM *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_key.c",0x201,"ossl_ec_key_private_check");
    uVar2 = 0xc0102;
  }
  else {
    b = BN_value_one();
    iVar1 = BN_cmp(a,b);
    if ((-1 < iVar1) &&
       (iVar1 = BN_cmp(*(BIGNUM **)(param_1 + 0x28),*(BIGNUM **)(*(long *)(param_1 + 0x18) + 0x10)),
       iVar1 < 0)) {
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_key.c",0x206,"ossl_ec_key_private_check");
    uVar2 = 0x7b;
  }
  ERR_set_error(0x10,uVar2,0);
  return 0;
}


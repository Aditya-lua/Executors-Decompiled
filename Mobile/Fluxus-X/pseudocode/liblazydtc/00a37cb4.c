/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a37cb4
 */

bool ossl_ec_GFp_mont_field_set_to_one(long param_1,BIGNUM *param_2)

{
  BIGNUM *pBVar1;
  
  if (*(BIGNUM **)(param_1 + 0x80) == (BIGNUM *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecp_mont.c",0x125,"ossl_ec_GFp_mont_field_set_to_one");
    ERR_set_error(0x10,0x6f,0);
    return false;
  }
  pBVar1 = BN_copy(param_2,*(BIGNUM **)(param_1 + 0x80));
  return pBVar1 != (BIGNUM *)0x0;
}


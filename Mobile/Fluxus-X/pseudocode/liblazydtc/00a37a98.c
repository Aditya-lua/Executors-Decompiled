/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a37a98
 */

int ossl_ec_GFp_mont_field_sqr(long param_1,BIGNUM *param_2,BIGNUM *param_3,BN_CTX *param_4)

{
  int iVar1;
  
  if (*(BN_MONT_CTX **)(param_1 + 0x78) == (BN_MONT_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecp_mont.c",0xd3,"ossl_ec_GFp_mont_field_sqr");
    ERR_set_error(0x10,0x6f,0);
    return 0;
  }
  iVar1 = BN_mod_mul_montgomery(param_2,param_3,param_3,*(BN_MONT_CTX **)(param_1 + 0x78),param_4);
  return iVar1;
}


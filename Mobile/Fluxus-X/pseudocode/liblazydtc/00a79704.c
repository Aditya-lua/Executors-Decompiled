/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a79704
 */

bool ossl_dsa_generate_public_key(BN_CTX *param_1,long param_2,undefined8 param_3,BIGNUM *param_4)

{
  bool bVar1;
  int iVar2;
  BIGNUM *p;
  
  p = BN_new();
  if (p == (BIGNUM *)0x0) {
    bVar1 = false;
  }
  else {
    BN_with_flags(p,param_3,4);
    iVar2 = BN_mod_exp(param_4,*(BIGNUM **)(param_2 + 0x18),p,*(BIGNUM **)(param_2 + 8),param_1);
    bVar1 = iVar2 != 0;
    BN_clear_free(p);
  }
  return bVar1;
}


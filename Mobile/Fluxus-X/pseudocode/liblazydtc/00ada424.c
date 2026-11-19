/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ada424
 */

ulong ossl_rsa_check_public_exponent(BIGNUM *param_1)

{
  int iVar1;
  ulong uVar2;
  BIGNUM *b;
  
  uVar2 = BN_is_odd();
  if ((int)uVar2 != 0) {
    b = BN_value_one();
    iVar1 = BN_cmp(param_1,b);
    uVar2 = (ulong)(0 < iVar1);
  }
  return uVar2;
}


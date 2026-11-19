/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0144c
 */

void BN_get_rfc3526_prime_8192(BIGNUM *param_1)

{
  if (param_1 == (BIGNUM *)0x0) {
    BN_dup((BIGNUM *)&ossl_bignum_modp_8192_p);
    return;
  }
  BN_copy(param_1,(BIGNUM *)&ossl_bignum_modp_8192_p);
  return;
}


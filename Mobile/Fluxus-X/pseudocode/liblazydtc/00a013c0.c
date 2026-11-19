/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a013c0
 */

void BN_get_rfc3526_prime_1536(BIGNUM *param_1)

{
  if (param_1 == (BIGNUM *)0x0) {
    BN_dup((BIGNUM *)&ossl_bignum_modp_1536_p);
    return;
  }
  BN_copy(param_1,(BIGNUM *)&ossl_bignum_modp_1536_p);
  return;
}


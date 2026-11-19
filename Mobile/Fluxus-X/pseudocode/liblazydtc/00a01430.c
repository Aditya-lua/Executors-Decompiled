/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a01430
 */

void BN_get_rfc3526_prime_6144(BIGNUM *param_1)

{
  if (param_1 == (BIGNUM *)0x0) {
    BN_dup((BIGNUM *)&ossl_bignum_modp_6144_p);
    return;
  }
  BN_copy(param_1,(BIGNUM *)&ossl_bignum_modp_6144_p);
  return;
}


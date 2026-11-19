/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a28984
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

BIGNUM * BN_get0_nist_prime_192(void)

{
  return (BIGNUM *)&PTR_DAT_00c5be78;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a289a8
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

BIGNUM * BN_get0_nist_prime_384(void)

{
  return (BIGNUM *)&PTR_DAT_00c5bec0;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2899c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

BIGNUM * BN_get0_nist_prime_256(void)

{
  return (BIGNUM *)&PTR_DAT_00c5bea8;
}


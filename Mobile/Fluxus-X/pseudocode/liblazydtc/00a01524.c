/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a01524
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

BIGNUM * BN_value_one(void)

{
  return (BIGNUM *)&PTR_LAB_00c59968;
}


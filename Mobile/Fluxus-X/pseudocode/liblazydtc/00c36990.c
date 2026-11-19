/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c36990
 */

BIGNUM * BN_copy(BIGNUM *a,BIGNUM *b)

{
  BIGNUM *pBVar1;
  
  pBVar1 = BN_copy(a,b);
  return pBVar1;
}


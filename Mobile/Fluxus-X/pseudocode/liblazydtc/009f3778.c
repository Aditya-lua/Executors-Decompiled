/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f3778
 */

BIGNUM * ASN1_INTEGER_to_BN(ASN1_INTEGER *ai,BIGNUM *bn)

{
  BIGNUM *pBVar1;
  
  pBVar1 = (BIGNUM *)FUN_009f3780(ai,bn,2);
  return pBVar1;
}


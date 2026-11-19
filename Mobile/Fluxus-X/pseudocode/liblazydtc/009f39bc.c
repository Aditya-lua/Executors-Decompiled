/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f39bc
 */

BIGNUM * ASN1_ENUMERATED_to_BN(ASN1_ENUMERATED *ai,BIGNUM *bn)

{
  BIGNUM *pBVar1;
  
  pBVar1 = (BIGNUM *)FUN_009f3780(ai,bn,10);
  return pBVar1;
}


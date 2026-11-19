/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f3628
 */

ASN1_INTEGER * BN_to_ASN1_INTEGER(BIGNUM *bn,ASN1_INTEGER *ai)

{
  ASN1_INTEGER *pAVar1;
  
  pAVar1 = (ASN1_INTEGER *)FUN_009f3630(bn,ai,2);
  return pAVar1;
}


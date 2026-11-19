/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f39b4
 */

ASN1_ENUMERATED * BN_to_ASN1_ENUMERATED(BIGNUM *bn,ASN1_ENUMERATED *ai)

{
  ASN1_ENUMERATED *pAVar1;
  
  pAVar1 = (ASN1_ENUMERATED *)FUN_009f3630(bn,ai,10);
  return pAVar1;
}


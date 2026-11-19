/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c375f0
 */

ASN1_INTEGER * BN_to_ASN1_INTEGER(BIGNUM *bn,ASN1_INTEGER *ai)

{
  ASN1_INTEGER *pAVar1;
  
  pAVar1 = BN_to_ASN1_INTEGER(bn,ai);
  return pAVar1;
}


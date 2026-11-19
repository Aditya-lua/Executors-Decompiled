/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c375e0
 */

BIGNUM * ASN1_INTEGER_to_BN(ASN1_INTEGER *ai,BIGNUM *bn)

{
  BIGNUM *pBVar1;
  
  pBVar1 = ASN1_INTEGER_to_BN(ai,bn);
  return pBVar1;
}


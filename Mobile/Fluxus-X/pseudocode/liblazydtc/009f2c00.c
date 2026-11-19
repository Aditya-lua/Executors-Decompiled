/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f2c00
 */

ASN1_STRING * ASN1_INTEGER_dup(ASN1_STRING *a)

{
  ASN1_STRING *pAVar1;
  
  pAVar1 = ASN1_STRING_dup(a);
  return pAVar1;
}


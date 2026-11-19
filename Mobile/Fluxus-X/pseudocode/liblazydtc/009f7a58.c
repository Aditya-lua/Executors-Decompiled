/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7a58
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ASN1_PRINTABLESTRING * ASN1_PRINTABLESTRING_new(void)

{
  ASN1_STRING *pAVar1;
  
  pAVar1 = ASN1_STRING_type_new(0x13);
  return pAVar1;
}


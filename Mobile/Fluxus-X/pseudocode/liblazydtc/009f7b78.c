/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7b78
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ASN1_VISIBLESTRING * ASN1_VISIBLESTRING_new(void)

{
  ASN1_STRING *pAVar1;
  
  pAVar1 = ASN1_STRING_type_new(0x1a);
  return pAVar1;
}


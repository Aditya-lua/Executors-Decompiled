/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7b48
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ASN1_GENERALIZEDTIME * ASN1_GENERALIZEDTIME_new(void)

{
  ASN1_STRING *pAVar1;
  
  pAVar1 = ASN1_STRING_type_new(0x18);
  return pAVar1;
}


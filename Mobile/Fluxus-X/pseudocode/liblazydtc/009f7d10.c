/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7d10
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ASN1_STRING * DIRECTORYSTRING_new(void)

{
  ASN1_STRING *pAVar1;
  
  pAVar1 = (ASN1_STRING *)ASN1_item_new((ASN1_ITEM *)&DAT_00c58fa8);
  return pAVar1;
}


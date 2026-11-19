/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7c08
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ASN1_NULL * ASN1_NULL_new(void)

{
  ASN1_VALUE *pAVar1;
  
  pAVar1 = ASN1_item_new((ASN1_ITEM *)&DAT_00c58e58);
  return (ASN1_NULL *)pAVar1;
}


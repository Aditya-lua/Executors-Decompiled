/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ee5f8
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ASN1_TIME * ASN1_TIME_new(void)

{
  ASN1_TIME *pAVar1;
  
  pAVar1 = (ASN1_TIME *)ASN1_item_new((ASN1_ITEM *)&DAT_00c58910);
  return pAVar1;
}


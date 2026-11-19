/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af5670
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

AUTHORITY_INFO_ACCESS * AUTHORITY_INFO_ACCESS_new(void)

{
  ASN1_VALUE *pAVar1;
  
  pAVar1 = ASN1_item_new((ASN1_ITEM *)&DAT_00c7e6a0);
  return (AUTHORITY_INFO_ACCESS *)pAVar1;
}


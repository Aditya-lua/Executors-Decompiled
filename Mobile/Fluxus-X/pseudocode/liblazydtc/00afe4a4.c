/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afe4a4
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

EXTENDED_KEY_USAGE * EXTENDED_KEY_USAGE_new(void)

{
  ASN1_VALUE *pAVar1;
  
  pAVar1 = ASN1_item_new((ASN1_ITEM *)&DAT_00c80190);
  return (EXTENDED_KEY_USAGE *)pAVar1;
}


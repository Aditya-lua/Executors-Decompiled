/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aba170
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

PKCS12_MAC_DATA * PKCS12_MAC_DATA_new(void)

{
  PKCS12_MAC_DATA *pPVar1;
  
  pPVar1 = (PKCS12_MAC_DATA *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7b0c0);
  return pPVar1;
}


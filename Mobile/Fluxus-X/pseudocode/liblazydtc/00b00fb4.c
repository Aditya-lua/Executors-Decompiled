/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b00fb4
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

PROXY_CERT_INFO_EXTENSION * PROXY_CERT_INFO_EXTENSION_new(void)

{
  PROXY_CERT_INFO_EXTENSION *pPVar1;
  
  pPVar1 = (PROXY_CERT_INFO_EXTENSION *)ASN1_item_new((ASN1_ITEM *)&DAT_00c80980);
  return pPVar1;
}


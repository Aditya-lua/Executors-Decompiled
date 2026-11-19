/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab590c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

NETSCAPE_CERT_SEQUENCE * NETSCAPE_CERT_SEQUENCE_new(void)

{
  NETSCAPE_CERT_SEQUENCE *pNVar1;
  
  pNVar1 = (NETSCAPE_CERT_SEQUENCE *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7aec8);
  return pNVar1;
}


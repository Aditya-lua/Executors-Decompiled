/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1ca94
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_PUBKEY * X509_PUBKEY_new(void)

{
  X509_PUBKEY *pXVar1;
  
  pXVar1 = (X509_PUBKEY *)ASN1_item_new((ASN1_ITEM *)&DAT_00c82640);
  return pXVar1;
}


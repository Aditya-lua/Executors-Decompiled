/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1b158
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_CRL_INFO * X509_CRL_INFO_new(void)

{
  X509_CRL_INFO *pXVar1;
  
  pXVar1 = (X509_CRL_INFO *)ASN1_item_new((ASN1_ITEM *)&DAT_00c82090);
  return pXVar1;
}


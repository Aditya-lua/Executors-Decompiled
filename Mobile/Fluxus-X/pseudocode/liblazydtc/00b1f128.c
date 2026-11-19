/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1f128
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_CERT_AUX * X509_CERT_AUX_new(void)

{
  X509_CERT_AUX *pXVar1;
  
  pXVar1 = (X509_CERT_AUX *)ASN1_item_new((ASN1_ITEM *)&DAT_00c82c60);
  return pXVar1;
}


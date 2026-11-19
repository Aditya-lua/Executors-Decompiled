/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1b188
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_CRL * X509_CRL_new(void)

{
  X509_CRL *pXVar1;
  
  pXVar1 = (X509_CRL *)ASN1_item_new((ASN1_ITEM *)&DAT_00c820f8);
  return pXVar1;
}


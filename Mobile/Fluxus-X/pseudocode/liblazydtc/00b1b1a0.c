/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1b1a0
 */

X509_CRL * X509_CRL_dup(X509_CRL *crl)

{
  X509_CRL *pXVar1;
  
  pXVar1 = ASN1_item_dup((ASN1_ITEM *)&DAT_00c820f8,crl);
  return pXVar1;
}


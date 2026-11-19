/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1bcec
 */

X509_EXTENSION * X509_EXTENSION_dup(X509_EXTENSION *ex)

{
  X509_EXTENSION *pXVar1;
  
  pXVar1 = ASN1_item_dup((ASN1_ITEM *)&DAT_00c82368,ex);
  return pXVar1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f8294
 */

X509_ALGOR * X509_ALGOR_dup(X509_ALGOR *xn)

{
  X509_ALGOR *pXVar1;
  
  pXVar1 = ASN1_item_dup((ASN1_ITEM *)&DAT_00c59180,xn);
  return pXVar1;
}


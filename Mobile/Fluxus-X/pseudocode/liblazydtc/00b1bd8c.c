/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1bd8c
 */

X509_NAME * X509_NAME_dup(X509_NAME *xn)

{
  X509_NAME *pXVar1;
  
  pXVar1 = ASN1_item_dup((ASN1_ITEM *)&DAT_00c824b0,xn);
  return pXVar1;
}


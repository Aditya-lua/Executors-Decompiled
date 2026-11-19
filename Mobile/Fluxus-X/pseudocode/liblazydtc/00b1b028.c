/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1b028
 */

X509_ATTRIBUTE * X509_ATTRIBUTE_dup(X509_ATTRIBUTE *xa)

{
  X509_ATTRIBUTE *pXVar1;
  
  pXVar1 = ASN1_item_dup((ASN1_ITEM *)&DAT_00c81fd0,xa);
  return pXVar1;
}


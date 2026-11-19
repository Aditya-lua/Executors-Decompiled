/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1b010
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_ATTRIBUTE * X509_ATTRIBUTE_new(void)

{
  X509_ATTRIBUTE *pXVar1;
  
  pXVar1 = (X509_ATTRIBUTE *)ASN1_item_new((ASN1_ITEM *)&DAT_00c81fd0);
  return pXVar1;
}


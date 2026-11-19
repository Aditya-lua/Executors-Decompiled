/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1bd74
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_NAME * X509_NAME_new(void)

{
  X509_NAME *pXVar1;
  
  pXVar1 = (X509_NAME *)ASN1_item_new((ASN1_ITEM *)&DAT_00c824b0);
  return pXVar1;
}


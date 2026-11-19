/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f8264
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_ALGOR * X509_ALGOR_new(void)

{
  X509_ALGOR *pXVar1;
  
  pXVar1 = (X509_ALGOR *)ASN1_item_new((ASN1_ITEM *)&DAT_00c59180);
  return pXVar1;
}


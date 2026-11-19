/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1bd24
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_NAME_ENTRY * X509_NAME_ENTRY_new(void)

{
  X509_NAME_ENTRY *pXVar1;
  
  pXVar1 = (X509_NAME_ENTRY *)ASN1_item_new((ASN1_ITEM *)&DAT_00c82478);
  return pXVar1;
}


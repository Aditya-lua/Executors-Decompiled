/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1bd3c
 */

X509_NAME_ENTRY * X509_NAME_ENTRY_dup(X509_NAME_ENTRY *ne)

{
  X509_NAME_ENTRY *pXVar1;
  
  pXVar1 = ASN1_item_dup((ASN1_ITEM *)&DAT_00c82478,ne);
  return pXVar1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14cec
 */

ASN1_STRING * X509_NAME_ENTRY_get_data(X509_NAME_ENTRY *ne)

{
  ASN1_STRING *pAVar1;
  
  pAVar1 = (ASN1_STRING *)0x0;
  if (ne != (X509_NAME_ENTRY *)0x0) {
    pAVar1 = ne->value;
  }
  return pAVar1;
}


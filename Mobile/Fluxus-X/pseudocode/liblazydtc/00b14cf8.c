/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14cf8
 */

X509_NAME_ENTRY * X509_NAME_get_entry(X509_NAME *name,int loc)

{
  int iVar1;
  X509_NAME_ENTRY *pXVar2;
  
  pXVar2 = (X509_NAME_ENTRY *)0x0;
  if (name != (X509_NAME *)0x0) {
    iVar1 = OPENSSL_sk_num(name->entries);
    if (loc < 0) {
      pXVar2 = (X509_NAME_ENTRY *)0x0;
    }
    else {
      pXVar2 = (X509_NAME_ENTRY *)0x0;
      if (loc < iVar1) {
        pXVar2 = (X509_NAME_ENTRY *)OPENSSL_sk_value(name->entries,loc);
      }
    }
  }
  return pXVar2;
}


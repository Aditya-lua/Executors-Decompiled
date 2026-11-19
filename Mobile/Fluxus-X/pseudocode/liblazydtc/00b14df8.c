/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14df8
 */

X509_NAME_ENTRY * X509_NAME_delete_entry(X509_NAME *name,int loc)

{
  int iVar1;
  long lVar2;
  X509_NAME_ENTRY *pXVar3;
  stack_st_X509_NAME_ENTRY *psVar4;
  int iVar5;
  
  if ((name == (X509_NAME *)0x0) || (iVar1 = OPENSSL_sk_num(name->entries), loc < 0)) {
    pXVar3 = (X509_NAME_ENTRY *)0x0;
  }
  else {
    pXVar3 = (X509_NAME_ENTRY *)0x0;
    if (loc < iVar1) {
      psVar4 = name->entries;
      pXVar3 = (X509_NAME_ENTRY *)OPENSSL_sk_delete(psVar4,loc);
      iVar1 = OPENSSL_sk_num(psVar4);
      name->modified = 1;
      if (iVar1 != loc) {
        if (loc == 0) {
          iVar5 = pXVar3->set + -1;
        }
        else {
          lVar2 = OPENSSL_sk_value(psVar4,loc + -1);
          iVar5 = *(int *)(lVar2 + 0x10);
        }
        lVar2 = OPENSSL_sk_value(psVar4,loc);
        if ((iVar5 + 1 < *(int *)(lVar2 + 0x10)) && (loc < iVar1)) {
          do {
            lVar2 = OPENSSL_sk_value(psVar4,loc);
            loc = loc + 1;
            *(int *)(lVar2 + 0x10) = *(int *)(lVar2 + 0x10) + -1;
          } while (iVar1 != loc);
        }
      }
    }
  }
  return pXVar3;
}


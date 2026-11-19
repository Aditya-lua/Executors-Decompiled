/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b15038
 */

int X509_NAME_add_entry(X509_NAME *name,X509_NAME_ENTRY *ne,int loc,int set)

{
  int iVar1;
  bool bVar2;
  int iVar3;
  long lVar4;
  X509_NAME_ENTRY *a;
  stack_st_X509_NAME_ENTRY *psVar5;
  int iVar6;
  
  if (name == (X509_NAME *)0x0) {
    return 0;
  }
  psVar5 = name->entries;
  iVar3 = OPENSSL_sk_num(psVar5);
  iVar6 = iVar3;
  if (loc <= iVar3 && -1 < loc) {
    iVar6 = loc;
  }
  bVar2 = set == 0;
  name->modified = 1;
  if (set == -1) {
    if (iVar6 == 0) {
      iVar3 = 0;
      bVar2 = true;
      goto LAB_00b150e8;
    }
    iVar1 = iVar6 + -1;
  }
  else {
    iVar1 = iVar6;
    if (iVar3 <= iVar6) {
      if (iVar6 == 0) {
        iVar3 = 0;
      }
      else {
        lVar4 = OPENSSL_sk_value(psVar5,iVar6 + -1);
        iVar3 = *(int *)(lVar4 + 0x10) + 1;
      }
      goto LAB_00b150e8;
    }
  }
  lVar4 = OPENSSL_sk_value(psVar5,iVar1);
  iVar3 = *(int *)(lVar4 + 0x10);
LAB_00b150e8:
  a = X509_NAME_ENTRY_dup(ne);
  if (a != (X509_NAME_ENTRY *)0x0) {
    a->set = iVar3;
    iVar3 = OPENSSL_sk_insert(psVar5,a,iVar6);
    if (iVar3 != 0) {
      if (bVar2) {
        iVar3 = OPENSSL_sk_num(psVar5);
        iVar6 = iVar6 + 1;
        if (iVar6 < iVar3) {
          do {
            lVar4 = OPENSSL_sk_value(psVar5,iVar6);
            iVar6 = iVar6 + 1;
            *(int *)(lVar4 + 0x10) = *(int *)(lVar4 + 0x10) + 1;
          } while (iVar3 != iVar6);
        }
      }
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/x509/x509name.c",0xe4,"X509_NAME_add_entry");
    ERR_set_error(0xb,0xc0100,0);
  }
  X509_NAME_ENTRY_free(a);
  return 0;
}


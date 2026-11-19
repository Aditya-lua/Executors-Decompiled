/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14b70
 */

int X509_NAME_get_text_by_OBJ(X509_NAME *name,ASN1_OBJECT *obj,char *buf,int len)

{
  int iVar1;
  int iVar2;
  int iVar3;
  undefined8 *puVar4;
  long lVar5;
  int *piVar6;
  stack_st_X509_NAME_ENTRY *psVar7;
  int iVar8;
  
  if (name != (X509_NAME *)0x0) {
    psVar7 = name->entries;
    iVar1 = OPENSSL_sk_num(psVar7);
    iVar3 = -2;
    do {
      iVar8 = iVar3;
      if (iVar1 <= iVar8 + 2) {
        return -1;
      }
      puVar4 = (undefined8 *)OPENSSL_sk_value(psVar7);
      iVar2 = OBJ_cmp((ASN1_OBJECT *)*puVar4,obj);
      iVar3 = iVar8 + 1;
    } while (iVar2 != 0);
    if (-2 < iVar8 + 1) {
      iVar3 = OPENSSL_sk_num(name->entries);
      piVar6 = (int *)0x0;
      if (iVar8 + 2 < iVar3) {
        lVar5 = OPENSSL_sk_value(name->entries,iVar8 + 2);
        if (lVar5 == 0) {
          piVar6 = (int *)0x0;
        }
        else {
          piVar6 = *(int **)(lVar5 + 8);
        }
      }
      if (buf == (char *)0x0) {
        return *piVar6;
      }
      if (len < 1) {
        return 0;
      }
      iVar3 = *piVar6;
      if (len <= *piVar6) {
        iVar3 = len + -1;
      }
      memcpy(buf,*(void **)(piVar6 + 2),(long)iVar3);
      buf[iVar3] = '\0';
      return iVar3;
    }
  }
  return -1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1f150
 */

int X509_alias_set1(X509 *x,uchar *name,int len)

{
  int iVar1;
  ASN1_STRING *pAVar2;
  stack_st_GENERAL_NAME *psVar3;
  ASN1_VALUE *pAVar4;
  
  if (name == (uchar *)0x0) {
    if (((x != (X509 *)0x0) && (x[1].altname != (stack_st_GENERAL_NAME *)0x0)) &&
       (pAVar2 = *(ASN1_STRING **)&((x[1].altname)->stack).sorted, pAVar2 != (ASN1_STRING *)0x0)) {
      ASN1_UTF8STRING_free(pAVar2);
      psVar3 = x[1].altname;
      (psVar3->stack).sorted = 0;
      (psVar3->stack).num_alloc = 0;
    }
    iVar1 = 1;
  }
  else {
    if (x != (X509 *)0x0) {
      pAVar4 = (ASN1_VALUE *)x[1].altname;
      if (pAVar4 == (ASN1_VALUE *)0x0) {
        pAVar4 = ASN1_item_new((ASN1_ITEM *)&DAT_00c82c60);
        x[1].altname = (stack_st_GENERAL_NAME *)pAVar4;
        if (pAVar4 == (ASN1_VALUE *)0x0) {
          return 0;
        }
      }
      pAVar2 = *(ASN1_STRING **)(pAVar4 + 0x10);
      if (pAVar2 == (ASN1_STRING *)0x0) {
        pAVar2 = ASN1_UTF8STRING_new();
        *(ASN1_STRING **)(pAVar4 + 0x10) = pAVar2;
        if (pAVar2 == (ASN1_UTF8STRING *)0x0) {
          return 0;
        }
      }
      iVar1 = ASN1_STRING_set(pAVar2,name,len);
      return iVar1;
    }
    iVar1 = 0;
  }
  return iVar1;
}


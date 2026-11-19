/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1f1fc
 */

int X509_keyid_set1(X509 *x,uchar *id,int len)

{
  int iVar1;
  ASN1_STRING *pAVar2;
  ASN1_VALUE *pAVar3;
  
  if (id == (uchar *)0x0) {
    if (((x != (X509 *)0x0) && (x[1].altname != (stack_st_GENERAL_NAME *)0x0)) &&
       (pAVar2 = (ASN1_STRING *)((x[1].altname)->stack).comp, pAVar2 != (ASN1_STRING *)0x0)) {
      ASN1_OCTET_STRING_free(pAVar2);
      ((x[1].altname)->stack).comp = (_func_257 *)0x0;
    }
    iVar1 = 1;
  }
  else {
    if (x != (X509 *)0x0) {
      pAVar3 = (ASN1_VALUE *)x[1].altname;
      if (pAVar3 == (ASN1_VALUE *)0x0) {
        pAVar3 = ASN1_item_new((ASN1_ITEM *)&DAT_00c82c60);
        x[1].altname = (stack_st_GENERAL_NAME *)pAVar3;
        if (pAVar3 == (ASN1_VALUE *)0x0) {
          return 0;
        }
      }
      pAVar2 = *(ASN1_STRING **)(pAVar3 + 0x18);
      if (pAVar2 == (ASN1_STRING *)0x0) {
        pAVar2 = ASN1_OCTET_STRING_new();
        *(ASN1_STRING **)(pAVar3 + 0x18) = pAVar2;
        if (pAVar2 == (ASN1_OCTET_STRING *)0x0) {
          return 0;
        }
      }
      iVar1 = ASN1_STRING_set(pAVar2,id,len);
      return iVar1;
    }
    iVar1 = 0;
  }
  return iVar1;
}


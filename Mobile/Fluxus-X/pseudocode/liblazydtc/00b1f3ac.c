/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1f3ac
 */

int X509_add1_reject_object(X509 *x,ASN1_OBJECT *obj)

{
  int iVar1;
  ASN1_OBJECT *a;
  char **ppcVar2;
  ASN1_VALUE *pAVar3;
  
  a = OBJ_dup(obj);
  if (a == (ASN1_OBJECT *)0x0) {
    return 0;
  }
  if (x != (X509 *)0x0) {
    pAVar3 = (ASN1_VALUE *)x[1].altname;
    if (pAVar3 == (ASN1_VALUE *)0x0) {
      pAVar3 = ASN1_item_new((ASN1_ITEM *)&DAT_00c82c60);
      x[1].altname = (stack_st_GENERAL_NAME *)pAVar3;
      if (pAVar3 == (ASN1_VALUE *)0x0) goto LAB_00b1f420;
    }
    ppcVar2 = *(char ***)(pAVar3 + 8);
    if (ppcVar2 == (char **)0x0) {
      ppcVar2 = (char **)OPENSSL_sk_new_null();
      *(char ***)(pAVar3 + 8) = ppcVar2;
      if (ppcVar2 == (char **)0x0) goto LAB_00b1f420;
    }
    iVar1 = OPENSSL_sk_push(ppcVar2,a);
    if (0 < iVar1) {
      return 1;
    }
  }
LAB_00b1f420:
  ASN1_OBJECT_free(a);
  return 0;
}


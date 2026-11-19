/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1f310
 */

int X509_add1_trust_object(X509 *x,ASN1_OBJECT *obj)

{
  int iVar1;
  ASN1_OBJECT *a;
  long lVar2;
  ASN1_VALUE *pAVar3;
  
  if (obj == (ASN1_OBJECT *)0x0) {
    a = (ASN1_OBJECT *)0x0;
  }
  else {
    a = OBJ_dup(obj);
    if (a == (ASN1_OBJECT *)0x0) {
      return 0;
    }
  }
  if (x != (X509 *)0x0) {
    pAVar3 = (ASN1_VALUE *)x[1].altname;
    if (pAVar3 == (ASN1_VALUE *)0x0) {
      pAVar3 = ASN1_item_new((ASN1_ITEM *)&DAT_00c82c60);
      x[1].altname = (stack_st_GENERAL_NAME *)pAVar3;
      if (pAVar3 == (ASN1_VALUE *)0x0) goto LAB_00b1f390;
    }
    lVar2 = *(long *)pAVar3;
    if (lVar2 == 0) {
      lVar2 = OPENSSL_sk_new_null();
      *(long *)pAVar3 = lVar2;
      if (lVar2 == 0) goto LAB_00b1f390;
    }
    if ((a == (ASN1_OBJECT *)0x0) || (iVar1 = OPENSSL_sk_push(lVar2,a), iVar1 != 0)) {
      return 1;
    }
  }
LAB_00b1f390:
  ASN1_OBJECT_free(a);
  return 0;
}


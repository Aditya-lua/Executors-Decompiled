/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0b5d8
 */

X509_OBJECT * X509_OBJECT_retrieve_match(stack_st_X509_OBJECT *h,X509_OBJECT *x)

{
  int iVar1;
  int iVar2;
  int iVar3;
  X509_OBJECT *pXVar4;
  
  iVar1 = OPENSSL_sk_find();
  if (-1 < iVar1) {
    if (1 < x->type - 1U) {
      pXVar4 = (X509_OBJECT *)OPENSSL_sk_value(h,iVar1);
      return pXVar4;
    }
    iVar2 = OPENSSL_sk_num(h);
    if (iVar2 <= iVar1) {
      return (X509_OBJECT *)0x0;
    }
    do {
      pXVar4 = (X509_OBJECT *)OPENSSL_sk_value(h,iVar1);
      iVar3 = pXVar4->type;
      if (iVar3 != x->type) {
        return (X509_OBJECT *)0x0;
      }
      if (iVar3 == 2) {
        iVar3 = X509_CRL_cmp((pXVar4->data).crl,(x->data).crl);
        if (iVar3 != 0) {
          return (X509_OBJECT *)0x0;
        }
LAB_00b0b67c:
        iVar3 = x->type;
      }
      else if (iVar3 == 1) {
        iVar3 = X509_subject_name_cmp((pXVar4->data).x509,(x->data).x509);
        if (iVar3 != 0) {
          return (X509_OBJECT *)0x0;
        }
        goto LAB_00b0b67c;
      }
      if (iVar3 == 2) {
        iVar3 = X509_CRL_match((pXVar4->data).crl,(x->data).crl);
      }
      else {
        if (iVar3 != 1) {
          return pXVar4;
        }
        iVar3 = X509_cmp((pXVar4->data).x509,(x->data).x509);
      }
      if (iVar3 == 0) {
        return pXVar4;
      }
      iVar1 = iVar1 + 1;
    } while (iVar1 < iVar2);
  }
  return (X509_OBJECT *)0x0;
}


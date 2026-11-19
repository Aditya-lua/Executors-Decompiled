/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b07f40
 */

long ossl_x509at_add1_attr(long *param_1,X509_ATTRIBUTE *param_2)

{
  int iVar1;
  X509_ATTRIBUTE *a;
  long lVar2;
  
  if (param_1 == (long *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_att.c",0x51,"ossl_x509at_add1_attr");
    ERR_set_error(0xb,0xc0102,0);
    return 0;
  }
  lVar2 = *param_1;
  if ((lVar2 == 0) && (lVar2 = OPENSSL_sk_new_null(), lVar2 == 0)) {
    a = (X509_ATTRIBUTE *)0x0;
  }
  else {
    a = X509_ATTRIBUTE_dup(param_2);
    if (a == (X509_ATTRIBUTE *)0x0) goto LAB_00b08010;
    iVar1 = OPENSSL_sk_push(lVar2,a);
    if (iVar1 != 0) {
      if (*param_1 == 0) {
        *param_1 = lVar2;
      }
      return lVar2;
    }
  }
  ERR_new();
  ERR_set_debug("crypto/x509/x509_att.c",100,"ossl_x509at_add1_attr");
  ERR_set_error(0xb,0xc0100,0);
LAB_00b08010:
  X509_ATTRIBUTE_free(a);
  if (*param_1 == 0) {
    OPENSSL_sk_free(lVar2);
    return 0;
  }
  return 0;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b094ec
 */

undefined8 ossl_x509_add_certs_new(long *param_1,undefined8 param_2,uint param_3)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  int iVar5;
  int iVar6;
  
  iVar2 = OPENSSL_sk_num(param_2);
  if (0 < iVar2) {
    iVar6 = 0;
    iVar5 = iVar2;
    do {
      iVar5 = iVar5 + -1;
      iVar1 = iVar6;
      if ((param_3 & 2) != 0) {
        iVar1 = iVar5;
      }
      uVar3 = OPENSSL_sk_value(param_2,iVar1);
      lVar4 = *param_1;
      if (lVar4 == 0) {
        lVar4 = OPENSSL_sk_new_null();
        *param_1 = lVar4;
        if (lVar4 == 0) {
          ERR_new();
          ERR_set_debug("crypto/x509/x509_cmp.c",0xbb,"ossl_x509_add_cert_new");
          ERR_set_error(0xb,0xc0100,0);
          return 0;
        }
      }
      uVar3 = X509_add_cert(lVar4,uVar3,param_3);
      if ((int)uVar3 == 0) {
        return uVar3;
      }
      iVar6 = iVar6 + 1;
    } while (iVar6 < iVar2);
  }
  return 1;
}


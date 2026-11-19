/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b092dc
 */

undefined8 ossl_x509_add_cert_new(long *param_1,undefined8 param_2,undefined4 param_3)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = *param_1;
  if (lVar1 == 0) {
    lVar1 = OPENSSL_sk_new_null();
    *param_1 = lVar1;
    if (lVar1 == 0) {
      ERR_new();
      ERR_set_debug("crypto/x509/x509_cmp.c",0xbb,"ossl_x509_add_cert_new");
      ERR_set_error(0xb,0xc0100,0);
      return 0;
    }
  }
  uVar2 = X509_add_cert(lVar1,param_2,param_3);
  return uVar2;
}


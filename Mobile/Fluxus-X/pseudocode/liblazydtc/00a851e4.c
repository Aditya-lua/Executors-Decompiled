/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a851e4
 */

undefined4 ossl_cmp_X509_STORE_add1_certs(X509_STORE *param_1,long param_2,int param_3)

{
  int iVar1;
  int iVar2;
  undefined4 uVar3;
  X509 *x;
  
  if (param_1 == (X509_STORE *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/cmp/cmp_util.c",0xd0,"ossl_cmp_X509_STORE_add1_certs");
    ERR_set_error(0x3a,0x67,0);
    uVar3 = 0;
  }
  else {
    if ((param_2 != 0) && (iVar1 = OPENSSL_sk_num(param_2), 0 < iVar1)) {
      iVar1 = 0;
      do {
        x = (X509 *)OPENSSL_sk_value(param_2,iVar1);
        if (((param_3 == 0) || (iVar2 = X509_self_signed(x,0), iVar2 == 1)) &&
           (iVar2 = X509_STORE_add_cert(param_1,x), iVar2 == 0)) {
          return 0;
        }
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(param_2);
      } while (iVar1 < iVar2);
    }
    uVar3 = 1;
  }
  return uVar3;
}


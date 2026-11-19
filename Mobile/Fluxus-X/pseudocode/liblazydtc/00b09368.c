/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b09368
 */

uint X509_add_cert(long param_1,X509 *param_2,uint param_3)

{
  undefined4 uVar1;
  int iVar2;
  int iVar3;
  uint uVar4;
  X509 *a;
  
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_cmp.c",0xc4,"X509_add_cert");
    uVar1 = 0xc0102;
  }
  else {
    if (((param_3 >> 2 & 1) != 0) && (iVar2 = OPENSSL_sk_num(param_1), 0 < iVar2)) {
      iVar2 = 0;
      do {
        a = (X509 *)OPENSSL_sk_value(param_1,iVar2);
        iVar3 = X509_cmp(a,param_2);
        if (iVar3 == 0) {
          return 1;
        }
        iVar2 = iVar2 + 1;
        iVar3 = OPENSSL_sk_num(param_1);
      } while (iVar2 < iVar3);
    }
    if (((param_3 >> 3 & 1) != 0) && (uVar4 = X509_self_signed(param_2,0), uVar4 != 0)) {
      return uVar4 >> 0x1f ^ 1;
    }
    iVar2 = OPENSSL_sk_insert(param_1,param_2,(param_3 >> 1 & 1) - 1);
    if (iVar2 != 0) {
      if ((param_3 & 1) != 0) {
        X509_up_ref(param_2);
      }
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/x509/x509_cmp.c",0xdb,"X509_add_cert");
    uVar1 = 0xc0100;
  }
  ERR_set_error(0xb,uVar1,0);
  return 0;
}


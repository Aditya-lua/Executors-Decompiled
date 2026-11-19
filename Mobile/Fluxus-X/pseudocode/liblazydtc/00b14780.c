/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14780
 */

int X509_VERIFY_PARAM_add0_table(X509_VERIFY_PARAM *param)

{
  int iVar1;
  X509_VERIFY_PARAM *param_00;
  
  if (DAT_00d227f0 == 0) {
    DAT_00d227f0 = OPENSSL_sk_new(&LAB_00b147f4);
    if (DAT_00d227f0 == 0) {
      return 0;
    }
  }
  else {
    iVar1 = OPENSSL_sk_find(DAT_00d227f0,param);
    if (-1 < iVar1) {
      param_00 = (X509_VERIFY_PARAM *)OPENSSL_sk_delete(DAT_00d227f0,iVar1);
      X509_VERIFY_PARAM_free(param_00);
    }
  }
  iVar1 = OPENSSL_sk_push(DAT_00d227f0,param);
  return (uint)(0 < iVar1);
}


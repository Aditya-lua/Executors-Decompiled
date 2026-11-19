/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0d8c0
 */

int X509_STORE_CTX_verify(X509_STORE_CTX *param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  if (param_1 == (X509_STORE_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_vfy.c",0xfd,"X509_STORE_CTX_verify");
    ERR_set_error(0xb,0xc0102,0);
    return -1;
  }
  if ((*(long *)&param_1->current_method == 0) && (iVar1 = OPENSSL_sk_num(param_1->cert), 0 < iVar1)
     ) {
    uVar2 = OPENSSL_sk_value(param_1->cert,0);
    *(undefined8 *)&param_1->current_method = uVar2;
  }
  iVar1 = X509_verify_cert(param_1);
  return iVar1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0948c
 */

undefined8 X509_add_certs(long param_1)

{
  undefined8 uVar1;
  long local_18;
  
  local_18 = param_1;
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_cmp.c",0xe7,"X509_add_certs");
    ERR_set_error(0xb,0xc0102,0);
    uVar1 = 0;
  }
  else {
    uVar1 = ossl_x509_add_certs_new(&local_18);
  }
  return uVar1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14728
 */

void X509_VERIFY_PARAM_set1_ip_asc(undefined8 param_1)

{
  int iVar1;
  undefined1 auStack_30 [16];
  
  iVar1 = ossl_a2i_ipadd(auStack_30);
  if (iVar1 != 0) {
    X509_VERIFY_PARAM_set1_ip(param_1,auStack_30,(long)iVar1);
  }
  return;
}


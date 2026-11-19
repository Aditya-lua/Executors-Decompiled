/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bb8c0
 */

undefined4 FUN_009bb8c0(long *param_1,EVP_PKEY *param_2)

{
  int iVar1;
  undefined4 uVar2;
  long lVar3;
  long local_38;
  
  lVar3 = ssl_cert_lookup_by_pkey(param_2,&local_38);
  if (lVar3 == 0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0x7b,"ssl_set_pkey");
    ERR_set_error(0x14,0xf7,0);
    uVar2 = 0;
  }
  else {
    if (((X509 *)param_1[local_38 * 5 + 4] != (X509 *)0x0) &&
       (iVar1 = X509_check_private_key((X509 *)param_1[local_38 * 5 + 4],param_2), iVar1 == 0)) {
      return 0;
    }
    EVP_PKEY_free((EVP_PKEY *)param_1[local_38 * 5 + 5]);
    EVP_PKEY_up_ref(param_2);
    uVar2 = 1;
    (param_1 + local_38 * 5 + 4)[1] = (long)param_2;
    *param_1 = (long)(param_1 + local_38 * 5 + 4);
  }
  return uVar2;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bb40c
 */

undefined8 FUN_009bb40c(undefined8 *param_1,X509 *param_2)

{
  int iVar1;
  EVP_PKEY *to;
  long lVar2;
  undefined8 uVar3;
  long local_38;
  
  to = (EVP_PKEY *)X509_get0_pubkey(param_2);
  if (to == (EVP_PKEY *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0xea,"ssl_set_cert");
    uVar3 = 0x10c;
  }
  else {
    lVar2 = ssl_cert_lookup_by_pkey(to,&local_38);
    if (lVar2 == 0) {
      ERR_new();
      ERR_set_debug("ssl/ssl_rsa.c",0xef,"ssl_set_cert");
      uVar3 = 0xf7;
    }
    else {
      if ((local_38 != 3) || (iVar1 = EVP_PKEY_can_sign(to), iVar1 != 0)) {
        if ((EVP_PKEY *)param_1[local_38 * 5 + 5] != (EVP_PKEY *)0x0) {
          EVP_PKEY_copy_parameters(to,(EVP_PKEY *)param_1[local_38 * 5 + 5]);
          ERR_clear_error();
          iVar1 = X509_check_private_key(param_2,(EVP_PKEY *)param_1[local_38 * 5 + 5]);
          if (iVar1 == 0) {
            EVP_PKEY_free((EVP_PKEY *)param_1[local_38 * 5 + 5]);
            param_1[local_38 * 5 + 5] = 0;
            ERR_clear_error();
          }
        }
        X509_free((X509 *)param_1[local_38 * 5 + 4]);
        X509_up_ref(param_2);
        param_1[local_38 * 5 + 4] = param_2;
        *param_1 = param_1 + local_38 * 5 + 4;
        return 1;
      }
      ERR_new();
      ERR_set_debug("ssl/ssl_rsa.c",0xf4,"ssl_set_cert");
      uVar3 = 0x13e;
    }
  }
  ERR_set_error(0x14,uVar3,0);
  return 0;
}


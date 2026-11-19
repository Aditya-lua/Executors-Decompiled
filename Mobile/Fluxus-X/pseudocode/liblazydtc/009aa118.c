/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009aa118
 */

EVP_PKEY * ssl_generate_param_group(long param_1)

{
  int iVar1;
  long lVar2;
  EVP_PKEY_CTX *ctx;
  EVP_PKEY *local_28;
  
  local_28 = (EVP_PKEY *)0x0;
  lVar2 = tls1_group_id_lookup(*(undefined8 *)(param_1 + 0x9a8));
  if (lVar2 == 0) {
    ctx = (EVP_PKEY_CTX *)0x0;
  }
  else {
    ctx = (EVP_PKEY_CTX *)
          EVP_PKEY_CTX_new_from_name
                    (**(undefined8 **)(param_1 + 0x9a8),*(undefined8 *)(lVar2 + 0x10),
                     (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
    if ((ctx != (EVP_PKEY_CTX *)0x0) && (iVar1 = EVP_PKEY_paramgen_init(ctx), 0 < iVar1)) {
      iVar1 = EVP_PKEY_CTX_set_group_name(ctx,*(undefined8 *)(lVar2 + 8));
      if (iVar1 < 1) {
        ERR_new();
        ERR_set_debug("ssl/s3_lib.c",0x1290,"ssl_generate_param_group");
        ossl_statem_fatal(param_1,0x50,0x80006,0);
      }
      else {
        iVar1 = EVP_PKEY_paramgen(ctx,&local_28);
        if (iVar1 < 1) {
          EVP_PKEY_free(local_28);
          local_28 = (EVP_PKEY *)0x0;
        }
      }
    }
  }
  EVP_PKEY_CTX_free(ctx);
  return local_28;
}


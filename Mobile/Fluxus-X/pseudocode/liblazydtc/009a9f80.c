/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a9f80
 */

EVP_PKEY * ssl_generate_pkey_group(long param_1)

{
  undefined4 uVar1;
  int iVar2;
  long lVar3;
  EVP_PKEY_CTX *ctx;
  undefined8 uVar4;
  EVP_PKEY *local_28;
  
  lVar3 = tls1_group_id_lookup(*(undefined8 *)(param_1 + 0x9a8));
  local_28 = (EVP_PKEY *)0x0;
  if (lVar3 == 0) {
    ERR_new();
    ERR_set_debug("ssl/s3_lib.c",0x125e,"ssl_generate_pkey_group");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    ctx = (EVP_PKEY_CTX *)0x0;
  }
  else {
    ctx = (EVP_PKEY_CTX *)
          EVP_PKEY_CTX_new_from_name
                    (**(undefined8 **)(param_1 + 0x9a8),*(undefined8 *)(lVar3 + 0x10),
                     (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
    if (ctx == (EVP_PKEY_CTX *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/s3_lib.c",0x1266,"ssl_generate_pkey_group");
      uVar1 = 0xc0100;
    }
    else {
      iVar2 = EVP_PKEY_keygen_init(ctx);
      if (iVar2 < 1) {
        ERR_new();
        uVar4 = 0x126a;
      }
      else {
        iVar2 = EVP_PKEY_CTX_set_group_name(ctx,*(undefined8 *)(lVar3 + 8));
        if (0 < iVar2) {
          iVar2 = EVP_PKEY_keygen(ctx,&local_28);
          if (iVar2 < 1) {
            ERR_new();
            ERR_set_debug("ssl/s3_lib.c",0x1272,"ssl_generate_pkey_group");
            ossl_statem_fatal(param_1,0x50,0x80006,0);
            EVP_PKEY_free(local_28);
            local_28 = (EVP_PKEY *)0x0;
          }
          goto LAB_009aa0fc;
        }
        ERR_new();
        uVar4 = 0x126e;
      }
      ERR_set_debug("ssl/s3_lib.c",uVar4,"ssl_generate_pkey_group");
      uVar1 = 0x80006;
    }
    ossl_statem_fatal(param_1,0x50,uVar1,0);
  }
LAB_009aa0fc:
  EVP_PKEY_CTX_free(ctx);
  return local_28;
}


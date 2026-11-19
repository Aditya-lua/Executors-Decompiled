/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009aa4f4
 */

undefined4
ssl_decapsulate(long param_1,long param_2,undefined8 param_3,undefined8 param_4,int param_5)

{
  int iVar1;
  undefined4 uVar2;
  EVP_PKEY_CTX *ctx;
  void *pvVar3;
  undefined8 local_48;
  
  local_48 = 0;
  if (param_2 == 0) {
    ERR_new();
    ERR_set_debug("ssl/s3_lib.c",0x12f7,"ssl_decapsulate");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    return 0;
  }
  ctx = (EVP_PKEY_CTX *)
        EVP_PKEY_CTX_new_from_pkey
                  (**(undefined8 **)(param_1 + 0x9a8),param_2,
                   (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
  iVar1 = EVP_PKEY_decapsulate_init(ctx,0);
  if ((iVar1 < 1) || (iVar1 = EVP_PKEY_decapsulate(ctx,0,&local_48,param_3,param_4), iVar1 < 1)) {
    ERR_new();
    ERR_set_debug("ssl/s3_lib.c",0x12ff,"ssl_decapsulate");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    uVar2 = 0;
LAB_009aa5f8:
    pvVar3 = (void *)0x0;
  }
  else {
    pvVar3 = CRYPTO_malloc((int)local_48,"ssl/s3_lib.c",0x1303);
    if (pvVar3 == (void *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/s3_lib.c",0x1305,"ssl_decapsulate");
      uVar2 = 0xc0100;
    }
    else {
      iVar1 = EVP_PKEY_decapsulate(ctx,pvVar3,&local_48,param_3,param_4);
      if (0 < iVar1) {
        if (param_5 != 0) {
          uVar2 = ssl_gensecret(param_1,pvVar3,local_48);
          goto LAB_009aa6a4;
        }
        *(void **)(param_1 + 0x360) = pvVar3;
        *(undefined8 *)(param_1 + 0x368) = local_48;
        uVar2 = 1;
        goto LAB_009aa5f8;
      }
      ERR_new();
      ERR_set_debug("ssl/s3_lib.c",0x130a,"ssl_decapsulate");
      uVar2 = 0xc0103;
    }
    ossl_statem_fatal(param_1,0x50,uVar2,0);
    uVar2 = 0;
  }
LAB_009aa6a4:
  CRYPTO_clear_free(pvVar3,local_48,"ssl/s3_lib.c",0x131a);
  EVP_PKEY_CTX_free(ctx);
  return uVar2;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009aa6f4
 */

int ssl_encapsulate(long param_1,long param_2,undefined8 *param_3,long *param_4,int param_5)

{
  undefined4 uVar1;
  int iVar2;
  EVP_PKEY_CTX *ctx;
  void *pvVar3;
  void *ptr;
  long local_58;
  long local_48;
  
  local_48 = 0;
  local_58 = 0;
  if (param_2 == 0) {
    ERR_new();
    ERR_set_debug("ssl/s3_lib.c",0x1329,"ssl_encapsulate");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    return 0;
  }
  ctx = (EVP_PKEY_CTX *)
        EVP_PKEY_CTX_new_from_pkey
                  (**(undefined8 **)(param_1 + 0x9a8),param_2,
                   (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
  iVar2 = EVP_PKEY_encapsulate_init(ctx,0);
  if ((((iVar2 < 1) || (iVar2 = EVP_PKEY_encapsulate(ctx,0,&local_58,0,&local_48), iVar2 < 1)) ||
      (local_48 == 0)) || (local_58 == 0)) {
    ERR_new();
    ERR_set_debug("ssl/s3_lib.c",0x1332,"ssl_encapsulate");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    iVar2 = 0;
    pvVar3 = (void *)0x0;
    ptr = (void *)0x0;
  }
  else {
    pvVar3 = CRYPTO_malloc((int)local_48,"ssl/s3_lib.c",0x1336);
    ptr = CRYPTO_malloc((int)local_58,"ssl/s3_lib.c",0x1337);
    if ((pvVar3 == (void *)0x0) || (ptr == (void *)0x0)) {
      ERR_new();
      ERR_set_debug("ssl/s3_lib.c",0x1339,"ssl_encapsulate");
      uVar1 = 0xc0100;
    }
    else {
      iVar2 = EVP_PKEY_encapsulate(ctx,ptr,&local_58,pvVar3,&local_48);
      if (0 < iVar2) {
        if (param_5 == 0) {
          *(void **)(param_1 + 0x360) = pvVar3;
          pvVar3 = (void *)0x0;
          *(long *)(param_1 + 0x368) = local_48;
          iVar2 = 1;
        }
        else {
          iVar2 = ssl_gensecret(param_1,pvVar3,local_48);
          if (iVar2 < 1) goto LAB_009aa908;
        }
        *param_3 = ptr;
        ptr = (void *)0x0;
        *param_4 = local_58;
        goto LAB_009aa908;
      }
      ERR_new();
      ERR_set_debug("ssl/s3_lib.c",0x133e,"ssl_encapsulate");
      uVar1 = 0xc0103;
    }
    ossl_statem_fatal(param_1,0x50,uVar1,0);
    iVar2 = 0;
  }
LAB_009aa908:
  CRYPTO_clear_free(pvVar3,local_48,"ssl/s3_lib.c",0x1355);
  CRYPTO_free(ptr);
  EVP_PKEY_CTX_free(ctx);
  return iVar2;
}


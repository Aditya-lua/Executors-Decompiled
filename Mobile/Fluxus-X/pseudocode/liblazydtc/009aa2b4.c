/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009aa2b4
 */

undefined4 ssl_derive(long param_1,long param_2,EVP_PKEY *param_3,int param_4)

{
  int iVar1;
  undefined4 uVar2;
  EVP_PKEY_CTX *ctx;
  uchar *key;
  size_t local_38;
  
  local_38 = 0;
  if ((param_2 == 0) || (param_3 == (EVP_PKEY *)0x0)) {
    ERR_new();
    ERR_set_debug("ssl/s3_lib.c",0x12c0,"ssl_derive");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    return 0;
  }
  ctx = (EVP_PKEY_CTX *)
        EVP_PKEY_CTX_new_from_pkey
                  (**(undefined8 **)(param_1 + 0x9a8),param_2,
                   (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
  iVar1 = EVP_PKEY_derive_init(ctx);
  if (((iVar1 < 1) || (iVar1 = EVP_PKEY_derive_set_peer(ctx,param_3), iVar1 < 1)) ||
     (iVar1 = EVP_PKEY_derive(ctx,(uchar *)0x0,&local_38), iVar1 < 1)) {
    ERR_new();
    ERR_set_debug("ssl/s3_lib.c",0x12c9,"ssl_derive");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    uVar2 = 0;
LAB_009aa438:
    key = (uchar *)0x0;
  }
  else {
    if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
        (iVar1 = **(int **)(param_1 + 8), 0x303 < iVar1)) &&
       ((iVar1 != 0x10000 && (iVar1 = EVP_PKEY_is_a(param_2,&DAT_002a3a5a), iVar1 != 0)))) {
      EVP_PKEY_CTX_set_dh_pad(ctx,1);
    }
    key = CRYPTO_malloc((int)local_38,"ssl/s3_lib.c",0x12d0);
    if (key == (uchar *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/s3_lib.c",0x12d2,"ssl_derive");
      uVar2 = 0xc0100;
    }
    else {
      iVar1 = EVP_PKEY_derive(ctx,key,&local_38);
      if (0 < iVar1) {
        if (param_4 != 0) {
          uVar2 = ssl_gensecret(param_1,key,local_38);
          goto LAB_009aa43c;
        }
        *(uchar **)(param_1 + 0x360) = key;
        *(size_t *)(param_1 + 0x368) = local_38;
        uVar2 = 1;
        goto LAB_009aa438;
      }
      ERR_new();
      ERR_set_debug("ssl/s3_lib.c",0x12d7,"ssl_derive");
      uVar2 = 0xc0103;
    }
    ossl_statem_fatal(param_1,0x50,uVar2,0);
    uVar2 = 0;
  }
LAB_009aa43c:
  CRYPTO_clear_free(key,local_38,"ssl/s3_lib.c",0x12e7);
  EVP_PKEY_CTX_free(ctx);
  return uVar2;
}


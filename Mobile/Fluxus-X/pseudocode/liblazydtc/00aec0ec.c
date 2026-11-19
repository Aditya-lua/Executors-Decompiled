/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aec0ec
 */

long ossl_store_unregister_loader_int(undefined8 param_1)

{
  int iVar1;
  long lVar2;
  undefined8 local_100 [2];
  undefined8 local_f0;
  undefined8 local_c8;
  undefined8 uStack_c0;
  undefined8 local_b0;
  
  local_f0 = 0;
  local_b0 = 0;
  local_c8 = 0;
  uStack_c0 = 0;
  local_100[0] = param_1;
  iVar1 = CRYPTO_THREAD_run_once(&DAT_00d22308,FUN_00aebf60);
  if ((iVar1 == 0) || (DAT_00d2230c == 0)) {
    ERR_new();
    ERR_set_debug("crypto/store/store_register.c",0x101,"ossl_store_unregister_loader_int");
    ERR_set_error(0x2c,0xc0100,0);
  }
  else {
    iVar1 = CRYPTO_THREAD_write_lock(DAT_00d22310);
    if (iVar1 != 0) {
      if ((DAT_00d22318 == 0) &&
         (DAT_00d22318 = OPENSSL_LH_new(&LAB_00aec2ec,&LAB_00aec2f4), DAT_00d22318 == 0)) {
        ERR_new();
        ERR_set_debug("crypto/store/store_register.c",0x108,"ossl_store_unregister_loader_int");
        ERR_set_error(0x2c,0xc0103,0);
        lVar2 = 0;
      }
      else {
        lVar2 = OPENSSL_LH_delete(DAT_00d22318,local_100);
        if (lVar2 == 0) {
          ERR_new();
          ERR_set_debug("crypto/store/store_register.c",0x10b,"ossl_store_unregister_loader_int");
          ERR_set_error(0x2c,0x69,"scheme=%s",param_1);
        }
      }
      CRYPTO_THREAD_unlock(DAT_00d22310);
      return lVar2;
    }
  }
  return 0;
}


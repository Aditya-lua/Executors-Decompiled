/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a84444
 */

void OPENSSL_cleanup(void)

{
  undefined8 *ptr;
  undefined8 *puVar1;
  
  if ((DAT_00d21ff8 == '\x01') && ((DAT_00d21ffc & 1) == 0)) {
    DAT_00d21ffc = 1;
    OPENSSL_thread_stop();
    ptr = DAT_00d22000;
    while (ptr != (undefined8 *)0x0) {
      (*(code *)*ptr)();
      puVar1 = (undefined8 *)ptr[1];
      CRYPTO_free(ptr);
      ptr = puVar1;
    }
    DAT_00d22000 = (undefined8 *)0x0;
    CRYPTO_THREAD_lock_free(DAT_00d22008);
    DAT_00d22008 = 0;
    CRYPTO_THREAD_lock_free(DAT_00d22010);
    DAT_00d22010 = 0;
    CRYPTO_THREAD_cleanup_local(&DAT_00d22018);
    ossl_comp_zlib_cleanup();
    if (DAT_00d2201c == '\x01') {
      async_deinit();
    }
    ossl_rand_cleanup_int();
    ossl_config_modules_free();
    engine_cleanup_int();
    ossl_store_cleanup_int();
    ossl_lib_ctx_default_deinit();
    ossl_cleanup_thread();
    bio_cleanup();
    evp_cleanup_int();
    ossl_obj_cleanup_int();
    err_cleanup();
    CRYPTO_secure_malloc_done();
    OSSL_CMP_log_close();
    ossl_trace_cleanup();
    DAT_00d21ff8 = '\0';
  }
  return;
}


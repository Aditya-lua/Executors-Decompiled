/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5122c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ENGINE * ENGINE_new(void)

{
  int iVar1;
  ENGINE *obj;
  
  iVar1 = CRYPTO_THREAD_run_once(&engine_lock_init,do_engine_lock_init_ossl_);
  if (((iVar1 == 0) || (do_engine_lock_init_ossl_ret_ == 0)) ||
     (obj = (ENGINE *)CRYPTO_zalloc(0xe0,"crypto/engine/eng_lib.c",0x20), obj == (ENGINE *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_lib.c",0x21,"ENGINE_new");
    ERR_set_error(0x26,0xc0100,0);
  }
  else {
    *(undefined4 *)(obj + 0x9c) = 1;
    iVar1 = CRYPTO_new_ex_data(10,obj,(CRYPTO_EX_DATA *)(obj + 0xa8));
    if (iVar1 != 0) {
      return obj;
    }
    CRYPTO_free(obj);
  }
  return (ENGINE *)0x0;
}


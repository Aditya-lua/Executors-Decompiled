/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a51164
 */

int ENGINE_finish(ENGINE *e)

{
  int iVar1;
  
  if (e == (ENGINE *)0x0) {
    iVar1 = 1;
  }
  else {
    iVar1 = CRYPTO_THREAD_write_lock(global_engine_lock);
    if (iVar1 == 0) {
      iVar1 = 0;
    }
    else {
      iVar1 = engine_unlocked_finish(e,1);
      CRYPTO_THREAD_unlock(global_engine_lock);
      if (iVar1 == 0) {
        ERR_new();
        ERR_set_debug("crypto/engine/eng_init.c",0x6f,"ENGINE_finish");
        ERR_set_error(0x26,0x6a,0);
      }
    }
  }
  return iVar1;
}


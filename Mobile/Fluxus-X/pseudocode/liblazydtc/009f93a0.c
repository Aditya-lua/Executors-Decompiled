/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f93a0
 */

undefined8 ASYNC_pause_job(void)

{
  long lVar1;
  
  lVar1 = CRYPTO_THREAD_get_local(&DAT_00d218e8);
  if (lVar1 == 0) {
    return 1;
  }
  if (*(long *)(lVar1 + 8) == 0) {
    return 1;
  }
  if (*(int *)(lVar1 + 0x10) == 0) {
    *(undefined4 *)(*(long *)(lVar1 + 8) + 0x1c) = 1;
    ERR_new();
    ERR_set_debug("crypto/async/async.c",0x137,"ASYNC_pause_job");
    ERR_set_error(0x33,0x66,0);
    return 0;
  }
  return 1;
}


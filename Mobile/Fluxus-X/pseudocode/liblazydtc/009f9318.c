/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f9318
 */

void FUN_009f9318(long param_1)

{
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)CRYPTO_THREAD_get_local(&DAT_00d218ec);
  if (puVar1 == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/async/async.c",0x8e,"async_release_job");
    ERR_set_error(0x33,0xc0103,0);
    return;
  }
  CRYPTO_free(*(void **)(param_1 + 0x10));
  *(undefined8 *)(param_1 + 0x10) = 0;
  OPENSSL_sk_push(*puVar1,param_1);
  return;
}


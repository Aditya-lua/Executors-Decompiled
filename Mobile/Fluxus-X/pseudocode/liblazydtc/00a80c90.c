/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a80c90
 */

byte ossl_lib_ctx_is_child(undefined8 *param_1)

{
  int iVar1;
  
  if ((param_1 == (undefined8 *)0x0) &&
     (((iVar1 = CRYPTO_THREAD_run_once(&DAT_00d21d5c,FUN_00a81348), iVar1 == 0 ||
       (DAT_00d21d60 == 0)) ||
      (param_1 = (undefined8 *)CRYPTO_THREAD_get_local(&DAT_00d21d58), param_1 == (undefined8 *)0x0)
      ))) {
    param_1 = &DAT_00d21b90;
  }
  return *(byte *)(param_1 + 0x38) & 1;
}


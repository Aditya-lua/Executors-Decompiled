/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a81674
 */

undefined8 * ossl_lib_ctx_get_ex_data_global(undefined8 *param_1)

{
  int iVar1;
  undefined8 *puVar2;
  
  if (param_1 == (undefined8 *)0x0) {
    iVar1 = CRYPTO_THREAD_run_once(&DAT_00d21d5c,FUN_00a81348);
    if (iVar1 == 0) {
      puVar2 = (undefined8 *)0x0;
    }
    else {
      puVar2 = (undefined8 *)0x0;
      if (DAT_00d21d60 != 0) {
        puVar2 = (undefined8 *)CRYPTO_THREAD_get_local(&DAT_00d21d58);
      }
    }
    param_1 = &DAT_00d21b90;
    if (puVar2 != (undefined8 *)0x0) {
      param_1 = puVar2;
    }
  }
  puVar2 = (undefined8 *)0x0;
  if (param_1 != (undefined8 *)0x0) {
    puVar2 = param_1 + 3;
  }
  return puVar2;
}


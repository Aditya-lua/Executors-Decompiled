/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8128c
 */

bool ossl_lib_ctx_is_default(undefined8 *param_1)

{
  undefined8 *puVar1;
  int iVar2;
  undefined8 *puVar3;
  
  if (param_1 == (undefined8 *)0x0) {
    return true;
  }
  iVar2 = CRYPTO_THREAD_run_once(&DAT_00d21d5c,FUN_00a81348);
  if (iVar2 == 0) {
    puVar3 = (undefined8 *)0x0;
  }
  else {
    puVar3 = (undefined8 *)0x0;
    if (DAT_00d21d60 != 0) {
      puVar3 = (undefined8 *)CRYPTO_THREAD_get_local(&DAT_00d21d58);
    }
  }
  puVar1 = &DAT_00d21b90;
  if (puVar3 != (undefined8 *)0x0) {
    puVar1 = puVar3;
  }
  return puVar1 == param_1;
}


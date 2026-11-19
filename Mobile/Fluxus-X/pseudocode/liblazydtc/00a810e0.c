/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a810e0
 */

void OSSL_LIB_CTX_free(undefined8 *param_1)

{
  undefined8 *puVar1;
  int iVar2;
  undefined8 *puVar3;
  
  if (param_1 != (undefined8 *)0x0) {
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
    if (puVar1 != param_1) {
      if ((*(byte *)(param_1 + 0x38) & 1) != 0) {
        ossl_provider_deinit_child(param_1);
      }
      FUN_00a80d0c(param_1);
      CRYPTO_free(param_1);
      return;
    }
  }
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a81814
 */

char * ossl_lib_ctx_get_descriptor(undefined8 *param_1)

{
  undefined8 *puVar1;
  char *pcVar2;
  bool bVar3;
  int iVar4;
  undefined8 *puVar5;
  
  if (param_1 == (undefined8 *)0x0) {
    iVar4 = CRYPTO_THREAD_run_once(&DAT_00d21d5c,FUN_00a81348);
    if (iVar4 == 0) {
      puVar5 = (undefined8 *)0x0;
    }
    else {
      puVar5 = (undefined8 *)0x0;
      if (DAT_00d21d60 != 0) {
        puVar5 = (undefined8 *)CRYPTO_THREAD_get_local(&DAT_00d21d58);
      }
    }
    bVar3 = puVar5 == (undefined8 *)0x0 || puVar5 == &DAT_00d21b90;
  }
  else {
    bVar3 = param_1 == &DAT_00d21b90;
    if ((param_1 != (undefined8 *)0x0) && (!bVar3)) {
      iVar4 = CRYPTO_THREAD_run_once(&DAT_00d21d5c,FUN_00a81348);
      if (iVar4 == 0) {
        puVar5 = (undefined8 *)0x0;
      }
      else {
        puVar5 = (undefined8 *)0x0;
        if (DAT_00d21d60 != 0) {
          puVar5 = (undefined8 *)CRYPTO_THREAD_get_local(&DAT_00d21d58);
        }
      }
      puVar1 = &DAT_00d21b90;
      if (puVar5 != (undefined8 *)0x0) {
        puVar1 = puVar5;
      }
      pcVar2 = "Thread-local default library context";
      if (puVar1 != param_1) {
        pcVar2 = "Non-default library context";
      }
      return pcVar2;
    }
  }
  pcVar2 = "Global default library context";
  if (!bVar3) {
    pcVar2 = "Thread-local default library context";
  }
  return pcVar2;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a80ff4
 */

undefined8 * OSSL_LIB_CTX_new_from_dispatch(undefined8 param_1,undefined8 param_2)

{
  undefined8 *puVar1;
  int iVar2;
  undefined8 *ptr;
  undefined8 *puVar3;
  
  ptr = (undefined8 *)CRYPTO_zalloc(0x1c8,"crypto/context.c",0xc0);
  if (ptr == (undefined8 *)0x0) {
    return (undefined8 *)0x0;
  }
  iVar2 = FUN_00a80e90(ptr);
  if (iVar2 != 0) {
    iVar2 = ossl_bio_init_core(ptr,param_2);
    if (iVar2 != 0) {
      return ptr;
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
    if (puVar1 == ptr) {
      return (undefined8 *)0x0;
    }
    if ((*(byte *)(ptr + 0x38) & 1) != 0) {
      ossl_provider_deinit_child(ptr);
    }
    FUN_00a80d0c(ptr);
  }
  CRYPTO_free(ptr);
  return (undefined8 *)0x0;
}


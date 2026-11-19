/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b511c4
 */

undefined8 * FUN_00b511c4(undefined8 param_1)

{
  int iVar1;
  undefined8 *ptr;
  long lVar2;
  undefined8 uVar3;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 != 0) {
    ptr = (undefined8 *)
          CRYPTO_zalloc(0x18,"providers/implementations/keymgmt/kdf_legacy_kmgmt.c",0x24);
    if (ptr == (undefined8 *)0x0) {
      return (undefined8 *)0x0;
    }
    lVar2 = CRYPTO_THREAD_lock_new();
    ptr[2] = lVar2;
    if (lVar2 != 0) {
      uVar3 = ossl_prov_ctx_get0_libctx(param_1);
      *ptr = uVar3;
      *(undefined4 *)(ptr + 1) = 1;
      return ptr;
    }
    CRYPTO_free(ptr);
  }
  return (undefined8 *)0x0;
}


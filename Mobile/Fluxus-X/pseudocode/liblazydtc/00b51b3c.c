/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b51b3c
 */

undefined8 * FUN_00b51b3c(undefined8 param_1,undefined4 param_2,undefined8 param_3)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 *ptr;
  
  uVar2 = ossl_prov_ctx_get0_libctx();
  iVar1 = ossl_prov_is_running();
  if (iVar1 != 0) {
    ptr = (undefined8 *)
          CRYPTO_zalloc(0x38,"providers/implementations/keymgmt/mac_legacy_kmgmt.c",0x185);
    if (ptr == (undefined8 *)0x0) {
      return (undefined8 *)0x0;
    }
    *ptr = uVar2;
    *(undefined4 *)(ptr + 1) = param_2;
    iVar1 = FUN_00b517e8(ptr,param_3);
    if (iVar1 != 0) {
      iVar1 = ossl_prov_cipher_load_from_params(ptr + 4,param_3,*ptr);
      if (iVar1 != 0) {
        return ptr;
      }
      ERR_new();
      ERR_set_debug("providers/implementations/keymgmt/mac_legacy_kmgmt.c",0x1c7,
                    "cmac_gen_set_params");
      ERR_set_error(0x39,0x80106,0);
    }
    CRYPTO_free(ptr);
  }
  return (undefined8 *)0x0;
}


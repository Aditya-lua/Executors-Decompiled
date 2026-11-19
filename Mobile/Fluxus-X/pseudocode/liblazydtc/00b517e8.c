/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b517e8
 */

undefined8 FUN_00b517e8(long param_1,undefined8 param_2)

{
  undefined4 uVar1;
  long lVar2;
  void *__dest;
  undefined8 uVar3;
  
  if (param_1 == 0) {
    return 0;
  }
  lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002a3e83);
  if (lVar2 == 0) {
LAB_00b51850:
    uVar3 = 1;
  }
  else {
    if (*(int *)(lVar2 + 8) == 5) {
      __dest = (void *)CRYPTO_secure_malloc
                                 (*(undefined8 *)(lVar2 + 0x18),
                                  "providers/implementations/keymgmt/mac_legacy_kmgmt.c",0x1b2);
      *(void **)(param_1 + 0x10) = __dest;
      if (__dest != (void *)0x0) {
        memcpy(__dest,*(void **)(lVar2 + 0x10),*(size_t *)(lVar2 + 0x18));
        *(undefined8 *)(param_1 + 0x18) = *(undefined8 *)(lVar2 + 0x18);
        goto LAB_00b51850;
      }
      ERR_new();
      ERR_set_debug("providers/implementations/keymgmt/mac_legacy_kmgmt.c",0x1b4,
                    "mac_gen_set_params");
      uVar1 = 0xc0100;
    }
    else {
      ERR_new();
      ERR_set_debug("providers/implementations/keymgmt/mac_legacy_kmgmt.c",0x1af,
                    "mac_gen_set_params");
      uVar1 = 0x80106;
    }
    ERR_set_error(0x39,uVar1,0);
    uVar3 = 0;
  }
  return uVar3;
}


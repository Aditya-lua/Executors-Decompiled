/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b51d34
 */

bool FUN_00b51d34(long param_1,undefined8 param_2)

{
  undefined4 uVar1;
  int iVar2;
  long lVar3;
  void *__dest;
  char *pcVar4;
  undefined8 uVar5;
  long lVar6;
  
  lVar3 = OSSL_PARAM_locate_const(param_2,&DAT_002a3e83);
  if (lVar3 == 0) {
LAB_00b51db8:
    lVar3 = OSSL_PARAM_locate_const(param_2,"properties");
    if (lVar3 != 0) {
      if (*(int *)(lVar3 + 8) != 4) {
        ERR_new();
        uVar5 = 0xd0;
        goto LAB_00b51ea4;
      }
      CRYPTO_free(*(void **)(param_1 + 0x40));
      pcVar4 = CRYPTO_strdup(*(char **)(lVar3 + 0x10),
                             "providers/implementations/keymgmt/mac_legacy_kmgmt.c",0xd4);
      *(char **)(param_1 + 0x40) = pcVar4;
      if (pcVar4 == (char *)0x0) {
        ERR_new();
        uVar5 = 0xd6;
        goto LAB_00b51ed0;
      }
    }
    if ((*(int *)(param_1 + 0x48) == 0) ||
       (iVar2 = ossl_prov_cipher_load_from_params
                          (param_1 + 0x28,param_2,*(undefined8 *)(param_1 + 8)), iVar2 != 0)) {
      return *(long *)(param_1 + 0x18) != 0;
    }
    ERR_new();
    uVar5 = 0xdd;
  }
  else {
    if (*(int *)(lVar3 + 8) == 5) {
      CRYPTO_secure_clear_free
                (*(undefined8 *)(param_1 + 0x18),*(undefined8 *)(param_1 + 0x20),
                 "providers/implementations/keymgmt/mac_legacy_kmgmt.c",0xc2);
      lVar6 = *(long *)(lVar3 + 0x18);
      if (lVar6 == 0) {
        lVar6 = 1;
      }
      __dest = (void *)CRYPTO_secure_malloc
                                 (lVar6,"providers/implementations/keymgmt/mac_legacy_kmgmt.c",0xc4)
      ;
      *(void **)(param_1 + 0x18) = __dest;
      if (__dest != (void *)0x0) {
        memcpy(__dest,*(void **)(lVar3 + 0x10),*(size_t *)(lVar3 + 0x18));
        *(undefined8 *)(param_1 + 0x20) = *(undefined8 *)(lVar3 + 0x18);
        goto LAB_00b51db8;
      }
      ERR_new();
      uVar5 = 0xc6;
LAB_00b51ed0:
      ERR_set_debug("providers/implementations/keymgmt/mac_legacy_kmgmt.c",uVar5,"mac_key_fromdata")
      ;
      uVar1 = 0xc0100;
      goto LAB_00b51ee0;
    }
    ERR_new();
    uVar5 = 0xbf;
  }
LAB_00b51ea4:
  ERR_set_debug("providers/implementations/keymgmt/mac_legacy_kmgmt.c",uVar5,"mac_key_fromdata");
  uVar1 = 0x80106;
LAB_00b51ee0:
  ERR_set_error(0x39,uVar1,0);
  return false;
}


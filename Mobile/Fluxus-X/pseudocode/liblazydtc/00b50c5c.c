/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b50c5c
 */

undefined8 FUN_00b50c5c(long param_1,long param_2)

{
  int iVar1;
  long lVar2;
  char *pcVar3;
  long local_28;
  
  if (param_2 != 0) {
    lVar2 = OSSL_PARAM_locate_const(param_2,"encoded-pub-key");
    if (lVar2 != 0) {
      local_28 = param_1 + 0x11;
      if (*(long *)(lVar2 + 0x18) != *(long *)(param_1 + 0x58)) {
        return 0;
      }
      iVar1 = OSSL_PARAM_get_octet_string(lVar2,&local_28,0x39,0);
      if (iVar1 == 0) {
        return 0;
      }
      CRYPTO_clear_free(*(undefined8 *)(param_1 + 0x50),*(undefined8 *)(param_1 + 0x58),
                        "providers/implementations/keymgmt/ecx_kmgmt.c",0x19b);
      *(undefined8 *)(param_1 + 0x50) = 0;
      *(byte *)(param_1 + 0x10) = *(byte *)(param_1 + 0x10) | 1;
    }
    lVar2 = OSSL_PARAM_locate_const(param_2,"properties");
    if (lVar2 != 0) {
      if (*(int *)(lVar2 + 8) != 4) {
        return 0;
      }
      pcVar3 = *(char **)(lVar2 + 0x10);
      CRYPTO_free(*(void **)(param_1 + 8));
      *(undefined8 *)(param_1 + 8) = 0;
      if (pcVar3 != (char *)0x0) {
        pcVar3 = CRYPTO_strdup(pcVar3,"providers/implementations/keymgmt/ecx_kmgmt.c",0x182);
        *(char **)(param_1 + 8) = pcVar3;
        if (pcVar3 == (char *)0x0) {
          ERR_new();
          ERR_set_debug("providers/implementations/keymgmt/ecx_kmgmt.c",0x184,"set_property_query");
          ERR_set_error(0x39,0xc0100,0);
          return 0;
        }
      }
    }
  }
  return 1;
}


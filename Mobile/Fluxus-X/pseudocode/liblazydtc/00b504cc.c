/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b504cc
 */

undefined8 FUN_00b504cc(long param_1,undefined8 param_2)

{
  char *pcVar1;
  int iVar2;
  long lVar3;
  char *pcVar4;
  
  if (param_1 == 0) {
    return 0;
  }
  lVar3 = OSSL_PARAM_locate_const(param_2,"group");
  if (lVar3 != 0) {
    pcVar4 = "x448";
    if (*(int *)(param_1 + 0x10) != 1) {
      pcVar4 = (char *)0x0;
    }
    pcVar1 = "x25519";
    if (*(int *)(param_1 + 0x10) != 0) {
      pcVar1 = pcVar4;
    }
    if (((*(int *)(lVar3 + 8) != 4) || (pcVar1 == (char *)0x0)) ||
       (iVar2 = OPENSSL_strcasecmp(*(undefined8 *)(lVar3 + 0x10)), iVar2 != 0)) {
      ERR_new();
      ERR_set_debug("providers/implementations/keymgmt/ecx_kmgmt.c",0x227,"ecx_gen_set_params");
      ERR_set_error(0x39,0x80106,0);
      return 0;
    }
  }
  lVar3 = OSSL_PARAM_locate_const(param_2,"properties");
  if (lVar3 != 0) {
    if (*(int *)(lVar3 + 8) != 4) {
      return 0;
    }
    CRYPTO_free(*(void **)(param_1 + 8));
    pcVar4 = CRYPTO_strdup(*(char **)(lVar3 + 0x10),"providers/implementations/keymgmt/ecx_kmgmt.c",
                           0x230);
    *(char **)(param_1 + 8) = pcVar4;
    if (pcVar4 == (char *)0x0) {
      return 0;
    }
  }
  return 1;
}


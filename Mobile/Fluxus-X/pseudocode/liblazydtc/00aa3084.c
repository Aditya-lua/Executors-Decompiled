/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa3084
 */

undefined8 ossl_provider_set_module_path(long param_1,char *param_2)

{
  char *pcVar1;
  
  CRYPTO_free(*(void **)(param_1 + 0x30));
  *(undefined8 *)(param_1 + 0x30) = 0;
  if (param_2 != (char *)0x0) {
    pcVar1 = CRYPTO_strdup(param_2,"crypto/provider_core.c",0x2f1);
    *(char **)(param_1 + 0x30) = pcVar1;
    if (pcVar1 == (char *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/provider_core.c",0x2f3,"ossl_provider_set_module_path");
      ERR_set_error(0xf,0xc0100,0);
      return 0;
    }
  }
  return 1;
}


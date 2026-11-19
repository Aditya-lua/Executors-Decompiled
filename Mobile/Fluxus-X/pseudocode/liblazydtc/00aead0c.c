/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aead0c
 */

undefined4 * OSSL_STORE_SEARCH_by_alias(char *param_1)

{
  undefined4 *puVar1;
  size_t sVar2;
  
  puVar1 = (undefined4 *)CRYPTO_zalloc(0x30,"crypto/store/store_lib.c",0x38e);
  if (puVar1 == (undefined4 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/store/store_lib.c",0x391,"OSSL_STORE_SEARCH_by_alias");
    ERR_set_error(0x2c,0xc0100,0);
  }
  else {
    *puVar1 = 4;
    *(char **)(puVar1 + 8) = param_1;
    sVar2 = strlen(param_1);
    *(size_t *)(puVar1 + 10) = sVar2;
  }
  return puVar1;
}


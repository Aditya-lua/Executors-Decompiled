/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeaafc
 */

undefined4 * OSSL_STORE_SEARCH_by_name(undefined8 param_1)

{
  undefined4 *puVar1;
  
  puVar1 = (undefined4 *)CRYPTO_zalloc(0x30,"crypto/store/store_lib.c",0x355);
  if (puVar1 == (undefined4 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/store/store_lib.c",0x358,"OSSL_STORE_SEARCH_by_name");
    ERR_set_error(0x2c,0xc0100,0);
    puVar1 = (undefined4 *)0x0;
  }
  else {
    *puVar1 = 1;
    *(undefined8 *)(puVar1 + 2) = param_1;
  }
  return puVar1;
}


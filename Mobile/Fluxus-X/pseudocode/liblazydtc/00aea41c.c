/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aea41c
 */

undefined4 * OSSL_STORE_INFO_new_PKEY(undefined8 param_1)

{
  undefined4 *puVar1;
  
  puVar1 = (undefined4 *)CRYPTO_zalloc(0x18,"crypto/store/store_lib.c",0x220);
  if (puVar1 == (undefined4 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/store/store_lib.c",0x25b,"OSSL_STORE_INFO_new_PKEY");
    ERR_set_error(0x2c,0xc0100,0);
    puVar1 = (undefined4 *)0x0;
  }
  else {
    *puVar1 = 4;
    *(undefined8 *)(puVar1 + 2) = param_1;
  }
  return puVar1;
}


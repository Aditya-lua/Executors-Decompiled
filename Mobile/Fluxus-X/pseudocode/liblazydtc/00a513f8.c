/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a513f8
 */

undefined8 engine_cleanup_add_first(undefined8 param_1)

{
  int iVar1;
  undefined8 *ptr;
  
  if ((DAT_00d21998 == 0) && (DAT_00d21998 = OPENSSL_sk_new_null(), DAT_00d21998 == 0)) {
    return 0;
  }
  ptr = CRYPTO_malloc(8,"crypto/engine/eng_lib.c",0x80);
  if (ptr == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_lib.c",0x81,"int_cleanup_item");
    ERR_set_error(0x26,0xc0100,0);
  }
  else {
    *ptr = param_1;
    iVar1 = OPENSSL_sk_insert(DAT_00d21998,ptr,0);
    if (iVar1 != 0) {
      return 1;
    }
    CRYPTO_free(ptr);
  }
  return 0;
}


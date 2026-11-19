/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae8a00
 */

long OPENSSL_sk_new_null(void)

{
  long lVar1;
  
  lVar1 = CRYPTO_zalloc(0x20,"crypto/stack/stack.c",0xe4);
  if (lVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/stack/stack.c",0xe7,"OPENSSL_sk_new_reserve");
    ERR_set_error(0xf,0xc0100,0);
    return 0;
  }
  *(undefined8 *)(lVar1 + 0x18) = 0;
  return lVar1;
}


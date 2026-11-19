/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a87bc0
 */

undefined8 FUN_00a87bc0(long param_1)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = EVP_CIPHER_CTX_get_cipher_data();
  uVar2 = 0;
  if (lVar1 != 0) {
    OPENSSL_cleanse((void *)(lVar1 + 0x100),0x1b8);
    if (*(void **)(lVar1 + 0x2b8) != (void *)(param_1 + 0x28)) {
      CRYPTO_free(*(void **)(lVar1 + 0x2b8));
    }
    uVar2 = 1;
  }
  return uVar2;
}


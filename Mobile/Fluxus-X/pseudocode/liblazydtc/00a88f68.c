/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a88f68
 */

undefined8 FUN_00a88f68(void)

{
  long lVar1;
  
  lVar1 = EVP_CIPHER_CTX_get_cipher_data();
  CRYPTO_ocb128_cleanup(lVar1 + 0x1f8);
  return 1;
}


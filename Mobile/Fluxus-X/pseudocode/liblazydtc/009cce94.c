/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009cce94
 */

undefined8 ssl3_release_read_buffer(long param_1)

{
  if ((*(byte *)(param_1 + 0x9e8) >> 1 & 1) != 0) {
    OPENSSL_cleanse(*(void **)(param_1 + 0xc78),*(size_t *)(param_1 + 0xc88));
  }
  CRYPTO_free(*(void **)(param_1 + 0xc78));
  *(undefined8 *)(param_1 + 0xc78) = 0;
  *(undefined8 *)(param_1 + 0x1cb0) = 0;
  *(undefined8 *)(param_1 + 0x1ca8) = 0;
  return 1;
}


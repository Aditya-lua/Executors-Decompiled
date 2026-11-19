/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a87014
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

EVP_CIPHER * EVP_aes_128_cfb128(void)

{
  return (EVP_CIPHER *)&DAT_00c61878;
}


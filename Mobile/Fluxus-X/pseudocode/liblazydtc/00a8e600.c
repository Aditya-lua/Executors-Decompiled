/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8e600
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

EVP_CIPHER * EVP_camellia_256_ofb(void)

{
  return (EVP_CIPHER *)&DAT_00c66a78;
}


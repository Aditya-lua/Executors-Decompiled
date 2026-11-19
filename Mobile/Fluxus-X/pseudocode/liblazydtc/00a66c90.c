/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a66c90
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

EVP_MD * EVP_sha512(void)

{
  return (EVP_MD *)&DAT_00c5ddd0;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8fd68
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

EVP_CIPHER * EVP_cast5_ecb(void)

{
  return (EVP_CIPHER *)&DAT_00c67278;
}


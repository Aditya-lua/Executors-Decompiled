/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c34b90
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

EVP_CIPHER_CTX * EVP_CIPHER_CTX_new(void)

{
  EVP_CIPHER_CTX *pEVar1;
  
  pEVar1 = EVP_CIPHER_CTX_new();
  return pEVar1;
}


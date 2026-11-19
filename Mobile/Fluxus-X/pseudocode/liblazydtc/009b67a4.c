/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b67a4
 */

void ssl_evp_cipher_free(long param_1)

{
  long lVar1;
  
  if ((param_1 == 0) || (lVar1 = EVP_CIPHER_get0_provider(), lVar1 == 0)) {
    return;
  }
  EVP_CIPHER_free(param_1);
  return;
}


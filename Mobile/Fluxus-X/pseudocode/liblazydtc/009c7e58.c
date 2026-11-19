/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c7e58
 */

EVP_CIPHER * tls_get_cipher_from_engine(int param_1)

{
  ENGINE *e;
  EVP_CIPHER *pEVar1;
  
  e = ENGINE_get_cipher_engine(param_1);
  pEVar1 = (EVP_CIPHER *)0x0;
  if (e != (ENGINE *)0x0) {
    pEVar1 = ENGINE_get_cipher(e,param_1);
    ENGINE_finish(e);
  }
  return pEVar1;
}


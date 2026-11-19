/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c7e98
 */

EVP_MD * tls_get_digest_from_engine(int param_1)

{
  ENGINE *e;
  EVP_MD *pEVar1;
  
  e = ENGINE_get_digest_engine(param_1);
  pEVar1 = (EVP_MD *)0x0;
  if (e != (ENGINE *)0x0) {
    pEVar1 = ENGINE_get_digest(e,param_1);
    ENGINE_finish(e);
  }
  return pEVar1;
}


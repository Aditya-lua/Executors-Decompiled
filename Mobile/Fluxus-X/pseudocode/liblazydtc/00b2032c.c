/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2032c
 */

int ossl_prov_cipher_reset(undefined8 *param_1)

{
  int iVar1;
  
  EVP_CIPHER_free(param_1[1]);
  *param_1 = 0;
  param_1[1] = 0;
  iVar1 = ENGINE_finish((ENGINE *)param_1[2]);
  param_1[2] = 0;
  return iVar1;
}


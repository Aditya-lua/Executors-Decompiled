/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b676c
 */

void ssl_evp_md_free(long param_1)

{
  long lVar1;
  
  if ((param_1 == 0) || (lVar1 = EVP_MD_get0_provider(), lVar1 == 0)) {
    return;
  }
  EVP_MD_free(param_1);
  return;
}


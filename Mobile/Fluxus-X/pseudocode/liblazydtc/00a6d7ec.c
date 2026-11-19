/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6d7ec
 */

void * EVP_PKEY_get0(EVP_PKEY *pkey)

{
  if ((pkey == (EVP_PKEY *)0x0) || (*(long *)&pkey[1].save_parameters != 0)) {
    return (void *)0x0;
  }
  return (pkey->pkey).ptr;
}


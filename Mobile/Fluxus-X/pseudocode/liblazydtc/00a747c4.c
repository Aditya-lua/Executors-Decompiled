/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a747c4
 */

int EVP_PKEY_paramgen(EVP_PKEY_CTX *ctx,EVP_PKEY **ppkey)

{
  int iVar1;
  
  if (*(int *)ctx == 2) {
    iVar1 = EVP_PKEY_generate();
    return iVar1;
  }
  ERR_new();
  ERR_set_debug("crypto/evp/pmeth_gn.c",0x106,"EVP_PKEY_paramgen");
  ERR_set_error(6,0x97,0);
  return -1;
}


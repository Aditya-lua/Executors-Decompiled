/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77bb0
 */

void EVP_PKEY_CTX_set0_keygen_info(EVP_PKEY_CTX *ctx,int *dat,int datlen)

{
  *(int **)(ctx + 0x68) = dat;
  *(int *)(ctx + 0x70) = datlen;
  return;
}


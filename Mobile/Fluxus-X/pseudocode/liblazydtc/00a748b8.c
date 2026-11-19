/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a748b8
 */

int EVP_PKEY_CTX_get_keygen_info(EVP_PKEY_CTX *ctx,int idx)

{
  int iVar1;
  
  if (idx == -1) {
    return *(int *)(ctx + 0x70);
  }
  if (idx < 0) {
    return 0;
  }
  iVar1 = 0;
  if (idx <= *(int *)(ctx + 0x70)) {
    iVar1 = *(int *)(*(long *)(ctx + 0x68) + (long)idx * 4);
  }
  return iVar1;
}


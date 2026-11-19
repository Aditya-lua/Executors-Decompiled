/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c31f80
 */

int EVP_DigestUpdate(EVP_MD_CTX *ctx,void *d,size_t cnt)

{
  int iVar1;
  
  iVar1 = EVP_DigestUpdate(ctx,d,cnt);
  return iVar1;
}


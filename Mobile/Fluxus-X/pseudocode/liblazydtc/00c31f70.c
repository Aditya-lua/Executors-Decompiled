/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c31f70
 */

int EVP_DigestInit_ex(EVP_MD_CTX *ctx,EVP_MD *type,ENGINE *impl)

{
  int iVar1;
  
  iVar1 = EVP_DigestInit_ex(ctx,type,impl);
  return iVar1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c361b0
 */

int EVP_CIPHER_CTX_ctrl(EVP_CIPHER_CTX *ctx,int type,int arg,void *ptr)

{
  int iVar1;
  
  iVar1 = EVP_CIPHER_CTX_ctrl(ctx,type,arg,ptr);
  return iVar1;
}


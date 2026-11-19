/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c36330
 */

int EVP_DecryptUpdate(EVP_CIPHER_CTX *ctx,uchar *out,int *outl,uchar *in,int inl)

{
  int iVar1;
  
  iVar1 = EVP_DecryptUpdate(ctx,out,outl,in,inl);
  return iVar1;
}


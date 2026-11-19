/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c36d60
 */

int EVP_Cipher(EVP_CIPHER_CTX *c,uchar *out,uchar *in,uint inl)

{
  int iVar1;
  
  iVar1 = EVP_Cipher(c,out,in,inl);
  return iVar1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab0e48
 */

int EVP_SignFinal(EVP_MD_CTX *ctx,uchar *md,uint *s,EVP_PKEY *pkey)

{
  int iVar1;
  
  iVar1 = EVP_SignFinal_ex((int)ctx);
  return iVar1;
}


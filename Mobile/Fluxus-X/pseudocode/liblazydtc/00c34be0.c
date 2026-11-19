/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c34be0
 */

int EVP_CipherInit_ex(EVP_CIPHER_CTX *ctx,EVP_CIPHER *cipher,ENGINE *impl,uchar *key,uchar *iv,
                     int enc)

{
  int iVar1;
  
  iVar1 = EVP_CipherInit_ex(ctx,cipher,impl,key,iv,enc);
  return iVar1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5afb4
 */

int EVP_CipherInit_ex(EVP_CIPHER_CTX *ctx,EVP_CIPHER *cipher,ENGINE *impl,uchar *key,uchar *iv,
                     int enc)

{
  int iVar1;
  
  iVar1 = FUN_00a5a64c((int)ctx);
  return iVar1;
}


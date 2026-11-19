/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6ae4c
 */

int PKCS5_PBE_keyivgen(EVP_CIPHER_CTX *ctx,char *pass,int passlen,ASN1_TYPE *param,
                      EVP_CIPHER *cipher,EVP_MD *md,int en_de)

{
  int iVar1;
  
  iVar1 = PKCS5_PBE_keyivgen_ex((int)ctx,pass,passlen);
  return iVar1;
}


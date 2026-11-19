/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a69b98
 */

int EVP_PBE_CipherInit(ASN1_OBJECT *pbe_obj,char *pass,int passlen,ASN1_TYPE *param,
                      EVP_CIPHER_CTX *ctx,int en_de)

{
  int iVar1;
  
  iVar1 = EVP_PBE_CipherInit_ex((int)pbe_obj,pass,passlen,param,ctx,en_de,0,0);
  return iVar1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c39340
 */

int CMAC_Init(CMAC_CTX *ctx,void *key,size_t keylen,EVP_CIPHER *cipher,ENGINE *impl)

{
  int iVar1;
  
  iVar1 = CMAC_Init(ctx,key,keylen,cipher,impl);
  return iVar1;
}


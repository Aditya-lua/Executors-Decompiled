/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c8018
 */

int ssl_hmac_old_init(long param_1,void *param_2,int param_3,char *param_4)

{
  int iVar1;
  EVP_MD *md;
  HMAC_CTX *ctx;
  
  ctx = *(HMAC_CTX **)(param_1 + 8);
  md = EVP_get_digestbyname(param_4);
  iVar1 = HMAC_Init_ex(ctx,param_2,param_3,md,(ENGINE *)0x0);
  return iVar1;
}


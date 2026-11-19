/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7e34
 */

EVP_MD_CTX * ssl_replace_hash(undefined8 *param_1,EVP_MD *param_2)

{
  int iVar1;
  EVP_MD_CTX *ctx;
  EVP_MD_CTX *pEVar2;
  
  EVP_MD_CTX_free(*param_1);
  *param_1 = 0;
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  *param_1 = ctx;
  pEVar2 = (EVP_MD_CTX *)0x0;
  if (ctx != (EVP_MD_CTX *)0x0) {
    if (param_2 == (EVP_MD *)0x0) {
      return ctx;
    }
    iVar1 = EVP_DigestInit_ex(ctx,param_2,(ENGINE *)0x0);
    pEVar2 = (EVP_MD_CTX *)*param_1;
    if (0 < iVar1) {
      return pEVar2;
    }
  }
  EVP_MD_CTX_free(pEVar2);
  *param_1 = 0;
  return (EVP_MD_CTX *)0x0;
}


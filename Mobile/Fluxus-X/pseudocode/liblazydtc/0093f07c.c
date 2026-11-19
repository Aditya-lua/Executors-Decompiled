/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0093f07c
 */

undefined8 FUN_0093f07c(undefined8 *param_1)

{
  int iVar1;
  EVP_MD_CTX *ctx;
  EVP_MD *type;
  undefined8 uVar2;
  
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  *param_1 = ctx;
  if (ctx == (EVP_MD_CTX *)0x0) {
    uVar2 = 0x1b;
  }
  else {
    type = EVP_sha256();
    iVar1 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0);
    uVar2 = 0;
    if (iVar1 == 0) {
      EVP_MD_CTX_free(*param_1);
      uVar2 = 2;
    }
  }
  return uVar2;
}


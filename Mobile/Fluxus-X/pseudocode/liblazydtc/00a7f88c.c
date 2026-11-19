/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7f88c
 */

undefined8 HMAC_CTX_reset(undefined8 *param_1)

{
  long lVar1;
  undefined8 uVar2;
  
  EVP_MD_CTX_reset(param_1[2]);
  EVP_MD_CTX_reset(param_1[3]);
  EVP_MD_CTX_reset(param_1[1]);
  *param_1 = 0;
  if (param_1[2] == 0) {
    lVar1 = EVP_MD_CTX_new();
    param_1[2] = lVar1;
    if (lVar1 != 0) goto LAB_00a7f8cc;
LAB_00a7f8fc:
    EVP_MD_CTX_reset(param_1[2]);
    EVP_MD_CTX_reset(param_1[3]);
    EVP_MD_CTX_reset(param_1[1]);
    uVar2 = 0;
    *param_1 = 0;
  }
  else {
LAB_00a7f8cc:
    if (param_1[3] == 0) {
      lVar1 = EVP_MD_CTX_new();
      param_1[3] = lVar1;
      if (lVar1 == 0) goto LAB_00a7f8fc;
    }
    if (param_1[1] == 0) {
      lVar1 = EVP_MD_CTX_new();
      param_1[1] = lVar1;
      if (lVar1 == 0) goto LAB_00a7f8fc;
    }
    uVar2 = 1;
  }
  return uVar2;
}


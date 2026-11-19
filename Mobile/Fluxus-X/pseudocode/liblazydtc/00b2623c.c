/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2623c
 */

undefined4 ossl_siv128_copy_ctx(undefined8 *param_1,undefined8 *param_2)

{
  int iVar1;
  undefined4 uVar2;
  EVP_CIPHER_CTX *out;
  long lVar3;
  undefined8 uVar4;
  
  uVar4 = *param_2;
  out = (EVP_CIPHER_CTX *)param_1[4];
  param_1[1] = param_2[1];
  *param_1 = uVar4;
  if (out == (EVP_CIPHER_CTX *)0x0) {
    out = EVP_CIPHER_CTX_new();
    param_1[4] = out;
    if (out == (EVP_CIPHER_CTX *)0x0) {
      return 0;
    }
  }
  iVar1 = EVP_CIPHER_CTX_copy(out,(EVP_CIPHER_CTX *)param_2[4]);
  uVar2 = 0;
  if (iVar1 != 0) {
    EVP_MAC_CTX_free(param_1[6]);
    lVar3 = EVP_MAC_CTX_dup(param_2[6]);
    param_1[6] = lVar3;
    uVar2 = 0;
    if (lVar3 != 0) {
      lVar3 = param_2[5];
      param_1[5] = lVar3;
      if (lVar3 != 0) {
        EVP_MAC_up_ref();
      }
      uVar2 = 1;
    }
  }
  return uVar2;
}


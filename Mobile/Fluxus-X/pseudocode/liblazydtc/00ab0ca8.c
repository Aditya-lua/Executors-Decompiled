/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab0ca8
 */

undefined8
EVP_SignFinal_ex(EVP_MD_CTX *param_1,uchar *param_2,undefined4 *param_3,undefined8 param_4,
                undefined8 param_5,undefined8 param_6)

{
  int iVar1;
  EVP_PKEY_CTX *ctx;
  undefined8 uVar2;
  EVP_MD_CTX *out;
  size_t local_a0;
  uint local_94;
  uchar auStack_90 [64];
  
  local_94 = 0;
  *param_3 = 0;
  iVar1 = EVP_MD_CTX_test_flags(param_1,0x200);
  if (iVar1 == 0) {
    out = (EVP_MD_CTX *)EVP_MD_CTX_new();
    if (out == (EVP_MD_CTX *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/evp/p_sign.c",0x24,"EVP_SignFinal_ex");
      ERR_set_error(6,0xc0100,0);
      return 0;
    }
    iVar1 = EVP_MD_CTX_copy_ex(out,param_1);
    if (iVar1 == 0) {
      EVP_MD_CTX_free(out);
      return 0;
    }
    iVar1 = EVP_DigestFinal_ex(out,auStack_90,&local_94);
    EVP_MD_CTX_free(out);
    if (iVar1 == 0) {
      return 0;
    }
  }
  else {
    iVar1 = EVP_DigestFinal_ex(param_1,auStack_90,&local_94);
    if (iVar1 == 0) {
      uVar2 = 0;
      ctx = (EVP_PKEY_CTX *)0x0;
      goto LAB_00ab0dd8;
    }
  }
  iVar1 = EVP_PKEY_get_size(param_4);
  local_a0 = (size_t)iVar1;
  ctx = (EVP_PKEY_CTX *)EVP_PKEY_CTX_new_from_pkey(param_5,param_4,param_6);
  if ((ctx != (EVP_PKEY_CTX *)0x0) && (iVar1 = EVP_PKEY_sign_init(ctx), 0 < iVar1)) {
    uVar2 = EVP_MD_CTX_get0_md(param_1);
    iVar1 = EVP_PKEY_CTX_set_signature_md(ctx,uVar2);
    if ((0 < iVar1) &&
       (iVar1 = EVP_PKEY_sign(ctx,param_2,&local_a0,auStack_90,(ulong)local_94), 0 < iVar1)) {
      *param_3 = (int)local_a0;
      uVar2 = 1;
      goto LAB_00ab0dd8;
    }
  }
  uVar2 = 0;
LAB_00ab0dd8:
  EVP_PKEY_CTX_free(ctx);
  return uVar2;
}


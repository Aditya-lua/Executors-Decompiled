/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6f1cc
 */

undefined4 EVP_PKEY_get_bn_param(undefined8 param_1,long param_2,long param_3)

{
  int iVar1;
  undefined4 uVar2;
  size_t sVar3;
  void *ptr;
  undefined8 local_8b8;
  undefined8 uStack_8b0;
  void *local_8a8;
  size_t sStack_8a0;
  size_t local_898;
  undefined1 auStack_890 [2048];
  undefined8 local_90;
  undefined8 uStack_88;
  void *local_80;
  size_t local_78;
  size_t local_70;
  undefined8 local_68;
  undefined8 uStack_60;
  void *local_58;
  size_t sStack_50;
  size_t local_48;
  
  if (param_2 == 0) {
    return 0;
  }
  if (param_3 == 0) {
    return 0;
  }
  memset(auStack_890,0,0x800);
  OSSL_PARAM_construct_BN(&local_8b8,param_2,auStack_890,0x800);
  local_70 = local_898;
  uStack_88 = uStack_8b0;
  local_90 = local_8b8;
  local_78 = sStack_8a0;
  local_80 = local_8a8;
  OSSL_PARAM_construct_end(&local_8b8);
  local_48 = local_898;
  sStack_50 = sStack_8a0;
  local_58 = local_8a8;
  uStack_60 = uStack_8b0;
  local_68 = local_8b8;
  iVar1 = EVP_PKEY_get_params(param_1,&local_90);
  if (iVar1 == 0) {
    iVar1 = OSSL_PARAM_modified(&local_90);
    sVar3 = local_70;
    if (((iVar1 == 0) || (local_70 == 0)) ||
       (ptr = (void *)CRYPTO_zalloc(local_70,"crypto/evp/p_lib.c",0x882), ptr == (void *)0x0)) {
      return 0;
    }
    local_78 = sVar3;
    local_80 = ptr;
    iVar1 = EVP_PKEY_get_params(param_1,&local_90);
    if (iVar1 == 0) {
      iVar1 = OSSL_PARAM_modified(&local_90);
      uVar2 = 0;
      goto joined_r0x00a6f2e0;
    }
  }
  else {
    ptr = (void *)0x0;
    sVar3 = 0;
  }
  iVar1 = OSSL_PARAM_modified(&local_90);
  if (iVar1 == 0) {
    uVar2 = 0;
  }
  else {
    uVar2 = OSSL_PARAM_get_BN(&local_90,param_3);
  }
  iVar1 = OSSL_PARAM_modified(&local_90);
  if (ptr == (void *)0x0) {
    if (iVar1 == 0) {
      return uVar2;
    }
    OPENSSL_cleanse(auStack_890,local_78);
    return uVar2;
  }
joined_r0x00a6f2e0:
  if (iVar1 == 0) {
    CRYPTO_free(ptr);
  }
  else {
    CRYPTO_clear_free(ptr,sVar3,"crypto/evp/p_lib.c",0x892);
  }
  return uVar2;
}


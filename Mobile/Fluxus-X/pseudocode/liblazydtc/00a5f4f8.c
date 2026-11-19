/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f4f8
 */

undefined4 EVP_CIPHER_CTX_get_key_length(undefined8 *param_1)

{
  int iVar1;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 local_50;
  long local_18;
  
  local_18 = (long)*(int *)(param_1 + 0xd);
  memset(&local_70,0,0x50);
  OSSL_PARAM_construct_size_t(&local_98,"keylen",&local_18);
  local_50 = local_78;
  uStack_68 = uStack_90;
  local_70 = local_98;
  uStack_58 = uStack_80;
  uStack_60 = local_88;
  iVar1 = evp_do_ciph_ctx_getparams(*param_1,param_1[0x15],&local_70);
  if (iVar1 == 0) {
    local_18._0_4_ = 0xffffffff;
  }
  return (undefined4)local_18;
}


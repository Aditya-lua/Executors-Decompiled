/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6f6fc
 */

undefined8 EVP_PKEY_set_bn_param(long param_1,long param_2,BIGNUM *param_3)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 local_8b8;
  undefined8 uStack_8b0;
  undefined8 local_8a8;
  undefined8 uStack_8a0;
  undefined8 local_898;
  undefined1 auStack_890 [2048];
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  
  if ((((param_1 != 0) && (param_2 != 0)) && (param_3 != (BIGNUM *)0x0)) &&
     ((*(long *)(param_1 + 0x20) != 0 || (*(long *)(param_1 + 0x68) != 0)))) {
    iVar2 = BN_num_bits(param_3);
    iVar1 = iVar2 + 0xe;
    if (-1 < iVar2 + 7) {
      iVar1 = iVar2 + 7;
    }
    if (0x4000 < iVar2) {
      return 0;
    }
    iVar2 = BN_bn2nativepad(param_3,auStack_890,iVar1 >> 3);
    if (-1 < iVar2) {
      OSSL_PARAM_construct_BN(&local_8b8,param_2,auStack_890,(long)(iVar1 >> 3));
      local_70 = local_898;
      uStack_88 = uStack_8b0;
      local_90 = local_8b8;
      uStack_78 = uStack_8a0;
      uStack_80 = local_8a8;
      OSSL_PARAM_construct_end(&local_8b8);
      local_48 = local_898;
      uStack_50 = uStack_8a0;
      local_58 = local_8a8;
      uStack_60 = uStack_8b0;
      local_68 = local_8b8;
      if (*(long *)(param_1 + 0x60) != 0) {
        *(long *)(param_1 + 0x70) = *(long *)(param_1 + 0x70) + 1;
        uVar3 = evp_keymgmt_set_params
                          (*(long *)(param_1 + 0x60),*(undefined8 *)(param_1 + 0x68),&local_90);
        return uVar3;
      }
      ERR_new();
      ERR_set_debug("crypto/evp/p_lib.c",0x94c,"EVP_PKEY_set_params");
      ERR_set_error(6,0xa3,0);
    }
  }
  return 0;
}


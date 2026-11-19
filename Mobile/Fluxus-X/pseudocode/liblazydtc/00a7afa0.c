/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7afa0
 */

undefined4 EVP_PKEY_CTX_get0_ecdh_kdf_ukm(int *param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  char *pcVar3;
  undefined4 uVar4;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  ulong local_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  ulong local_50;
  undefined8 local_48;
  undefined8 uStack_40;
  undefined8 local_38;
  undefined8 uStack_30;
  ulong local_28;
  
  if ((param_1 == (int *)0x0) || (*param_1 != 0x800)) {
    ERR_new();
    pcVar3 = "evp_pkey_ctx_getset_ecdh_param_checks";
    uVar2 = 0x1b;
LAB_00a7b064:
    ERR_set_debug("crypto/evp/ec_ctrl.c",uVar2,pcVar3);
    ERR_set_error(6,0x93,0);
    uVar4 = 0xfffffffe;
  }
  else {
    if (((*(long *)(param_1 + 8) != 0) || (*(int **)(param_1 + 0x1e) == (int *)0x0)) ||
       (**(int **)(param_1 + 0x1e) == 0x198)) {
      OSSL_PARAM_construct_octet_ptr(&local_98,"kdf-ukm",param_2,0);
      local_50 = local_78;
      uStack_68 = uStack_90;
      local_70 = local_98;
      uStack_58 = uStack_80;
      uStack_60 = local_88;
      OSSL_PARAM_construct_end(&local_98);
      local_28 = local_78;
      uStack_30 = uStack_80;
      local_38 = local_88;
      uStack_40 = uStack_90;
      local_48 = local_98;
      iVar1 = evp_pkey_ctx_get_params_strict(param_1,&local_70);
      if (iVar1 == 1) {
        uVar4 = (undefined4)local_50;
        if (local_50 >> 0x1f != 0) {
          uVar4 = 0xffffffff;
        }
        return uVar4;
      }
      if (iVar1 == -2) {
        ERR_new();
        pcVar3 = "EVP_PKEY_CTX_get0_ecdh_kdf_ukm";
        uVar2 = 0x105;
        goto LAB_00a7b064;
      }
    }
    uVar4 = 0xffffffff;
  }
  return uVar4;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a572ac
 */

undefined4 EVP_PKEY_CTX_get0_dh_kdf_ukm(int *param_1,undefined8 param_2)

{
  int iVar1;
  undefined4 uVar2;
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
    ERR_set_debug("crypto/evp/dh_ctrl.c",0x25,"dh_param_derive_check");
    ERR_set_error(6,0x93,0);
    return 0xfffffffe;
  }
  if (((*(long *)(param_1 + 8) != 0) || (**(int **)(param_1 + 0x1e) == 0x398)) ||
     (**(int **)(param_1 + 0x1e) == 0x1c)) {
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
      uVar2 = (undefined4)local_50;
      if (local_50 >> 0x1f != 0) {
        uVar2 = 0xffffffff;
      }
      return uVar2;
    }
    if (iVar1 == -2) {
      ERR_new();
      ERR_set_debug("crypto/evp/dh_ctrl.c",0x150,"EVP_PKEY_CTX_get0_dh_kdf_ukm");
      ERR_set_error(6,0x93,0);
      return 0xffffffff;
    }
  }
  return 0xffffffff;
}


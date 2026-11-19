/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5702c
 */

undefined8 EVP_PKEY_CTX_get_dh_kdf_outlen(int *param_1,undefined4 *param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 local_60;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined8 uStack_40;
  undefined8 local_38;
  ulong local_28;
  
  local_28 = 0xffffffff;
  if ((param_1 == (int *)0x0) || (*param_1 != 0x800)) {
    ERR_new();
    ERR_set_debug("crypto/evp/dh_ctrl.c",0x25,"dh_param_derive_check");
    ERR_set_error(6,0x93,0);
    uVar2 = 0xfffffffe;
  }
  else if (((*(long *)(param_1 + 8) == 0) && (**(int **)(param_1 + 0x1e) != 0x398)) &&
          (**(int **)(param_1 + 0x1e) != 0x1c)) {
    uVar2 = 0xffffffff;
  }
  else {
    OSSL_PARAM_construct_size_t(&local_a8,"kdf-outlen",&local_28);
    local_60 = local_88;
    uStack_78 = uStack_a0;
    local_80 = local_a8;
    uStack_68 = uStack_90;
    uStack_70 = local_98;
    OSSL_PARAM_construct_end(&local_a8);
    local_38 = local_88;
    uStack_40 = uStack_90;
    local_48 = local_98;
    uStack_50 = uStack_a0;
    local_58 = local_a8;
    iVar1 = evp_pkey_ctx_get_params_strict(param_1,&local_80);
    if (iVar1 == -2) {
      ERR_new();
      ERR_set_debug("crypto/evp/dh_ctrl.c",0x119,"EVP_PKEY_CTX_get_dh_kdf_outlen");
      ERR_set_error(6,0x93,0);
      uVar2 = 0xffffffff;
    }
    else {
      uVar2 = 0xffffffff;
      if ((iVar1 == 1) && (local_28 >> 0x1f == 0)) {
        uVar2 = 1;
        *param_2 = (int)local_28;
      }
    }
  }
  return uVar2;
}


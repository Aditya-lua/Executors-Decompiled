/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a57178
 */

undefined8 EVP_PKEY_CTX_set0_dh_kdf_ukm(int *param_1,void *param_2,int param_3)

{
  undefined8 uVar1;
  char *pcVar2;
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
  undefined8 local_48;
  undefined8 uStack_40;
  undefined8 local_38;
  undefined8 uStack_30;
  undefined8 local_28;
  
  if (param_3 < 0) {
LAB_00a5727c:
    uVar1 = 0xffffffff;
  }
  else {
    if ((param_1 == (int *)0x0) || (*param_1 != 0x800)) {
      ERR_new();
      pcVar2 = "dh_param_derive_check";
      uVar1 = 0x25;
    }
    else {
      if (((*(long *)(param_1 + 8) == 0) && (**(int **)(param_1 + 0x1e) != 0x398)) &&
         (**(int **)(param_1 + 0x1e) != 0x1c)) goto LAB_00a5727c;
      OSSL_PARAM_construct_octet_string(&local_98,"kdf-ukm",param_2,(long)param_3);
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
      uVar1 = evp_pkey_ctx_set_params_strict(param_1,&local_70);
      if ((int)uVar1 == 1) {
        CRYPTO_free(param_2);
        return 1;
      }
      if ((int)uVar1 != -2) {
        return uVar1;
      }
      ERR_new();
      pcVar2 = "EVP_PKEY_CTX_set0_dh_kdf_ukm";
      uVar1 = 0x139;
    }
    ERR_set_debug("crypto/evp/dh_ctrl.c",uVar1,pcVar2);
    ERR_set_error(6,0x93,0);
    uVar1 = 0xfffffffe;
  }
  return uVar1;
}


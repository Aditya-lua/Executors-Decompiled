/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7aabc
 */

uint EVP_PKEY_CTX_get_ecdh_cofactor_mode(int *param_1)

{
  int iVar1;
  uint uVar2;
  undefined8 uVar3;
  char *pcVar4;
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
  uint local_14;
  
  if ((param_1 == (int *)0x0) || (*param_1 != 0x800)) {
    ERR_new();
    pcVar4 = "evp_pkey_ctx_getset_ecdh_param_checks";
    uVar3 = 0x1b;
LAB_00a7ab80:
    ERR_set_debug("crypto/evp/ec_ctrl.c",uVar3,pcVar4);
    ERR_set_error(6,0x93,0);
    uVar2 = 0xfffffffe;
  }
  else {
    if (((*(long *)(param_1 + 8) != 0) || (*(int **)(param_1 + 0x1e) == (int *)0x0)) ||
       (**(int **)(param_1 + 0x1e) == 0x198)) {
      OSSL_PARAM_construct_int(&local_98,"ecdh-cofactor-mode",&local_14);
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
        if (1 < local_14) {
          local_14 = 0xffffffff;
        }
        return local_14;
      }
      if (iVar1 == -2) {
        ERR_new();
        pcVar4 = "EVP_PKEY_CTX_get_ecdh_cofactor_mode";
        uVar3 = 0x57;
        goto LAB_00a7ab80;
      }
    }
    uVar2 = 0xffffffff;
  }
  return uVar2;
}


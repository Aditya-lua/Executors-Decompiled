/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7ac34
 */

undefined8 EVP_PKEY_CTX_set_ecdh_kdf_outlen(int *param_1,int param_2)

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
  long local_18;
  
  local_18 = (long)param_2;
  if ((param_1 == (int *)0x0) || (*param_1 != 0x800)) {
    ERR_new();
    pcVar2 = "evp_pkey_ctx_getset_ecdh_param_checks";
    uVar1 = 0x1b;
  }
  else {
    if (((*(long *)(param_1 + 8) == 0) && (*(int **)(param_1 + 0x1e) != (int *)0x0)) &&
       (**(int **)(param_1 + 0x1e) != 0x198)) {
      return 0xffffffff;
    }
    if (param_2 < 1) {
      return 0xfffffffe;
    }
    OSSL_PARAM_construct_size_t(&local_98,"kdf-outlen",&local_18);
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
    if ((int)uVar1 != -2) {
      return uVar1;
    }
    ERR_new();
    pcVar2 = "EVP_PKEY_CTX_set_ecdh_kdf_outlen";
    uVar1 = 0xac;
  }
  ERR_set_debug("crypto/evp/ec_ctrl.c",uVar1,pcVar2);
  ERR_set_error(6,0x93,0);
  return 0xfffffffe;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a79bf8
 */

undefined8 EVP_PKEY_CTX_set_dsa_paramgen_md_props(int *param_1,undefined8 param_2,long param_3)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  undefined8 local_d8;
  undefined8 uStack_d0;
  undefined8 local_c8;
  undefined8 uStack_c0;
  undefined8 local_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 local_68;
  undefined8 local_60 [6];
  
  if ((param_1 == (int *)0x0) || ((*param_1 != 2 && (*param_1 != 4)))) {
    ERR_new();
    ERR_set_debug("crypto/evp/dsa_ctrl.c",0x14,"dsa_paramgen_check");
    ERR_set_error(6,0x93,0);
    return 0xfffffffe;
  }
  if ((*(int **)(param_1 + 0x1e) != (int *)0x0) && (**(int **)(param_1 + 0x1e) != 0x74)) {
    return 0xffffffff;
  }
  puVar2 = &local_88;
  OSSL_PARAM_construct_utf8_string(&local_d8,"digest",param_2,0);
  local_90 = local_b8;
  uStack_a8 = uStack_d0;
  local_b0 = local_d8;
  uStack_98 = uStack_c0;
  uStack_a0 = local_c8;
  if (param_3 != 0) {
    puVar2 = local_60;
    OSSL_PARAM_construct_utf8_string(&local_d8,"properties",param_3,0);
    local_68 = local_b8;
    uStack_80 = uStack_d0;
    local_88 = local_d8;
    uStack_70 = uStack_c0;
    uStack_78 = local_c8;
  }
  OSSL_PARAM_construct_end(&local_d8);
  puVar2[4] = local_b8;
  puVar2[1] = uStack_d0;
  *puVar2 = local_d8;
  puVar2[3] = uStack_c0;
  puVar2[2] = local_c8;
  uVar1 = EVP_PKEY_CTX_set_params(param_1,&local_b0);
  return uVar1;
}


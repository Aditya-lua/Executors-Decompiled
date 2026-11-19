/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6f508
 */

undefined8 EVP_PKEY_set_int_param(long param_1,long param_2,undefined4 param_3)

{
  undefined8 uVar1;
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
  undefined4 local_14;
  
  if (param_2 != 0) {
    local_14 = param_3;
    OSSL_PARAM_construct_int(&local_98,param_2,&local_14);
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
    if ((param_1 != 0) && (*(long *)(param_1 + 0x60) != 0)) {
      *(long *)(param_1 + 0x70) = *(long *)(param_1 + 0x70) + 1;
      uVar1 = evp_keymgmt_set_params
                        (*(long *)(param_1 + 0x60),*(undefined8 *)(param_1 + 0x68),&local_70);
      return uVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/evp/p_lib.c",0x94c,"EVP_PKEY_set_params");
    ERR_set_error(6,0xa3,0);
  }
  return 0;
}


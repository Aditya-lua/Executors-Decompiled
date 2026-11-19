/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a65640
 */

void evp_keymgmt_util_cache_keyinfo(long param_1)

{
  int iVar1;
  undefined8 local_108;
  undefined8 uStack_100;
  undefined8 local_f8;
  undefined8 uStack_f0;
  undefined8 local_e8;
  undefined8 local_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 local_c0;
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined4 local_3c;
  undefined8 local_38;
  
  if (*(long *)(param_1 + 0x68) != 0) {
    local_38 = 0;
    local_3c = 0;
    OSSL_PARAM_construct_int(&local_108,&DAT_002adc98,(long)&local_38 + 4);
    local_c0 = local_e8;
    uStack_d8 = uStack_100;
    local_e0 = local_108;
    uStack_c8 = uStack_f0;
    uStack_d0 = local_f8;
    OSSL_PARAM_construct_int(&local_108,"security-bits",&local_38);
    local_98 = local_e8;
    uStack_a0 = uStack_f0;
    local_a8 = local_f8;
    uStack_b0 = uStack_100;
    local_b8 = local_108;
    OSSL_PARAM_construct_int(&local_108,"max-size",&local_3c);
    local_70 = local_e8;
    uStack_78 = uStack_f0;
    local_80 = local_f8;
    uStack_88 = uStack_100;
    local_90 = local_108;
    OSSL_PARAM_construct_end(&local_108);
    local_48 = local_e8;
    uStack_50 = uStack_f0;
    local_58 = local_f8;
    uStack_60 = uStack_100;
    local_68 = local_108;
    iVar1 = evp_keymgmt_get_params
                      (*(undefined8 *)(param_1 + 0x60),*(undefined8 *)(param_1 + 0x68),&local_e0);
    if (iVar1 != 0) {
      *(undefined4 *)(param_1 + 0x90) = local_3c;
      *(undefined4 *)(param_1 + 0x88) = local_38._4_4_;
      *(undefined4 *)(param_1 + 0x8c) = (undefined4)local_38;
    }
  }
  return;
}


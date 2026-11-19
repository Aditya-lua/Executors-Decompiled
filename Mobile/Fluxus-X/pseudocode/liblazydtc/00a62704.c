/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a62704
 */

void OSSL_ENCODER_CTX_set_cipher(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
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
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  
  memset(&local_b0,0,0x78);
  OSSL_PARAM_construct_utf8_string(&local_d8,"cipher",param_2,0);
  local_90 = local_b8;
  uStack_a8 = uStack_d0;
  local_b0 = local_d8;
  uStack_98 = uStack_c0;
  uStack_a0 = local_c8;
  OSSL_PARAM_construct_utf8_string(&local_d8,"properties",param_3,0);
  local_68 = local_b8;
  uStack_70 = uStack_c0;
  local_78 = local_c8;
  uStack_80 = uStack_d0;
  local_88 = local_d8;
  OSSL_ENCODER_CTX_set_params(param_1,&local_b0);
  return;
}


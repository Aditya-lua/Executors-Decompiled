/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ab4c4
 */

void ssl3_digest_master_key_set_params(long param_1,undefined8 *param_2)

{
  undefined8 local_48;
  undefined8 uStack_40;
  undefined8 local_38;
  undefined8 uStack_30;
  undefined8 local_28;
  
  OSSL_PARAM_construct_octet_string(&local_48,"ssl3-ms",param_1 + 0x50,*(undefined8 *)(param_1 + 8))
  ;
  param_2[4] = local_28;
  param_2[3] = uStack_30;
  param_2[2] = local_38;
  param_2[1] = uStack_40;
  *param_2 = local_48;
  OSSL_PARAM_construct_end(&local_48);
  param_2[9] = local_28;
  param_2[8] = uStack_30;
  param_2[7] = local_38;
  param_2[6] = uStack_40;
  param_2[5] = local_48;
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa513c
 */

void FUN_00aa513c(undefined8 *param_1)

{
  long lVar1;
  undefined8 local_48;
  undefined8 uStack_40;
  undefined8 local_38;
  undefined8 uStack_30;
  undefined8 local_28;
  
  lVar1 = 0;
  if (param_1[3] != 0) {
    OSSL_PARAM_construct_utf8_string(&local_48,"st-phase",*param_1,0);
    param_1[8] = local_28;
    param_1[7] = uStack_30;
    param_1[6] = local_38;
    param_1[5] = uStack_40;
    param_1[4] = local_48;
    OSSL_PARAM_construct_utf8_string(&local_48,"st-type",param_1[1],0);
    param_1[0xd] = local_28;
    param_1[0xc] = uStack_30;
    param_1[0xb] = local_38;
    param_1[10] = uStack_40;
    param_1[9] = local_48;
    OSSL_PARAM_construct_utf8_string(&local_48,"st-desc",param_1[2],0);
    param_1[0x12] = local_28;
    lVar1 = 3;
    param_1[0x11] = uStack_30;
    param_1[0x10] = local_38;
    param_1[0xf] = uStack_40;
    param_1[0xe] = local_48;
  }
  OSSL_PARAM_construct_end(&local_48);
  param_1[lVar1 * 5 + 8] = local_28;
  param_1[lVar1 * 5 + 7] = uStack_30;
  param_1[lVar1 * 5 + 6] = local_38;
  param_1[lVar1 * 5 + 5] = uStack_40;
  param_1[lVar1 * 5 + 4] = local_48;
  return;
}


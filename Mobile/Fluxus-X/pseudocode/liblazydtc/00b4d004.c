/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4d004
 */

void FUN_00b4d004(undefined4 param_1,undefined4 param_2,undefined8 param_3)

{
  long lVar1;
  undefined8 local_c8;
  undefined8 uStack_c0;
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 local_80;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  undefined4 local_18;
  undefined4 uStack_14;
  
  local_18 = param_2;
  uStack_14 = param_1;
  lVar1 = BN_GENCB_get_arg(param_3);
  memset(&local_a0,0,0x78);
  OSSL_PARAM_construct_int(&local_c8,"potential",&uStack_14);
  local_80 = local_a8;
  uStack_98 = uStack_c0;
  local_a0 = local_c8;
  uStack_88 = uStack_b0;
  uStack_90 = local_b8;
  OSSL_PARAM_construct_int(&local_c8,"iteration",&local_18);
  local_58 = local_a8;
  uStack_60 = uStack_b0;
  local_68 = local_b8;
  uStack_70 = uStack_c0;
  local_78 = local_c8;
  (**(code **)(lVar1 + 0x60))(&local_a0,*(undefined8 *)(lVar1 + 0x68));
  return;
}


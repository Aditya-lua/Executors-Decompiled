/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac9e68
 */

undefined8
FUN_00ac9e68(long *param_1,long param_2,ulong param_3,undefined4 param_4,undefined4 param_5,
            undefined8 param_6,undefined8 param_7)

{
  ulong uVar1;
  int iVar2;
  undefined8 uVar3;
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
  ulong local_58;
  
  local_58 = 0;
  memset(&local_b0,0,0x50);
  OSSL_PARAM_construct_size_t(&local_d8,"max_request",&local_58);
  local_90 = local_b8;
  uStack_a8 = uStack_d0;
  local_b0 = local_d8;
  uStack_98 = uStack_c0;
  uStack_a0 = local_c8;
  iVar2 = (**(code **)(*param_1 + 0xa8))(param_1[1],&local_b0);
  if ((iVar2 == 0) || (local_58 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/evp/evp_rand.c",0x229,"evp_rand_generate_locked");
    uVar3 = 0xd7;
  }
  else {
    if (param_3 == 0) {
      return 1;
    }
    uVar1 = local_58;
    if (param_3 <= local_58) {
      uVar1 = param_3;
    }
    iVar2 = (**(code **)(*param_1 + 0x58))(param_1[1],param_2,uVar1,param_4,param_5,param_6,param_7)
    ;
    while (iVar2 != 0) {
      param_3 = param_3 - uVar1;
      if (param_3 == 0) {
        return 1;
      }
      param_2 = param_2 + uVar1;
      uVar1 = local_58;
      if (param_3 <= local_58) {
        uVar1 = param_3;
      }
      iVar2 = (**(code **)(*param_1 + 0x58))(param_1[1],param_2,uVar1,param_4,0,param_6,param_7);
    }
    ERR_new();
    ERR_set_debug("crypto/evp/evp_rand.c",0x230,"evp_rand_generate_locked");
    uVar3 = 0xd6;
  }
  ERR_set_error(6,uVar3,0);
  return 0;
}


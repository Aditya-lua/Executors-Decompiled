/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aca14c
 */

undefined4 EVP_RAND_nonce(long *param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  undefined4 uVar2;
  long lVar3;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined4 local_84;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 local_60;
  
  if ((*(code **)(*param_1 + 0x78) == (code *)0x0) ||
     (iVar1 = (**(code **)(*param_1 + 0x78))(param_1[1]), iVar1 != 0)) {
    memset(&local_80,0,0x50);
    local_84 = 0;
    OSSL_PARAM_construct_uint(&local_b0,"strength",&local_84);
    local_60 = local_90;
    uStack_78 = uStack_a8;
    local_80 = local_b0;
    uStack_68 = uStack_98;
    uStack_70 = uStack_a0;
    iVar1 = (**(code **)(*param_1 + 0xa8))(param_1[1],&local_80);
    uVar2 = 0;
    if (iVar1 != 0) {
      uVar2 = local_84;
    }
    if (*(code **)(*param_1 + 0x68) == (code *)0x0) {
      uVar2 = 0;
    }
    else {
      lVar3 = (**(code **)(*param_1 + 0x68))(param_1[1],param_2,uVar2,param_3,param_3);
      if (lVar3 == 0) {
        uVar2 = FUN_00ac9e68(param_1,param_2,param_3,uVar2,0,0,0);
      }
      else {
        uVar2 = 1;
      }
    }
    if (*(code **)(*param_1 + 0x80) != (code *)0x0) {
      (**(code **)(*param_1 + 0x80))(param_1[1]);
    }
  }
  else {
    uVar2 = 0;
  }
  return uVar2;
}


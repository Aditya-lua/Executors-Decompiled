/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aca09c
 */

undefined4 EVP_RAND_get_strength(long *param_1)

{
  int iVar1;
  undefined4 uVar2;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 local_80;
  undefined4 local_74;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 local_50;
  
  if ((*(code **)(*param_1 + 0x78) == (code *)0x0) ||
     (iVar1 = (**(code **)(*param_1 + 0x78))(param_1[1]), iVar1 != 0)) {
    memset(&local_70,0,0x50);
    local_74 = 0;
    OSSL_PARAM_construct_uint(&local_a0,"strength",&local_74);
    local_50 = local_80;
    uStack_68 = uStack_98;
    local_70 = local_a0;
    uStack_58 = uStack_88;
    uStack_60 = uStack_90;
    iVar1 = (**(code **)(*param_1 + 0xa8))(param_1[1],&local_70);
    uVar2 = 0;
    if (iVar1 != 0) {
      uVar2 = local_74;
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


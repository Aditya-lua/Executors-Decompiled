/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aca268
 */

undefined4 EVP_RAND_get_state(long *param_1)

{
  int iVar1;
  long lVar2;
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
  
  memset(&local_70,0,0x50);
  OSSL_PARAM_construct_int(&local_a0,"state",&local_74);
  local_50 = local_80;
  uStack_68 = uStack_98;
  local_70 = local_a0;
  uStack_58 = uStack_88;
  uStack_60 = uStack_90;
  lVar2 = *param_1;
  if (*(code **)(lVar2 + 0x78) != (code *)0x0) {
    iVar1 = (**(code **)(lVar2 + 0x78))(param_1[1]);
    if (iVar1 == 0) {
      return 2;
    }
    lVar2 = *param_1;
  }
  iVar1 = (**(code **)(lVar2 + 0xa8))(param_1[1],&local_70);
  if (*(code **)(*param_1 + 0x80) != (code *)0x0) {
    (**(code **)(*param_1 + 0x80))(param_1[1]);
  }
  if (iVar1 == 0) {
    return 2;
  }
  return local_74;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6e7c8
 */

byte EVP_PKEY_get_group_name(undefined8 param_1,long param_2,long param_3,long *param_4)

{
  int iVar1;
  int iVar2;
  byte bVar3;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  long local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  long local_60;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined8 uStack_40;
  long local_38;
  
  OSSL_PARAM_construct_utf8_string(&local_a8,"group");
  local_60 = local_88;
  uStack_78 = uStack_a0;
  local_80 = local_a8;
  uStack_68 = uStack_90;
  uStack_70 = local_98;
  OSSL_PARAM_construct_end(&local_a8);
  local_38 = local_88;
  uStack_40 = uStack_90;
  local_48 = local_98;
  uStack_50 = uStack_a0;
  local_58 = local_a8;
  iVar1 = EVP_PKEY_get_params(param_1,&local_80);
  if (iVar1 == 0) {
LAB_00a6e884:
    bVar3 = 0;
  }
  else {
    iVar2 = OSSL_PARAM_modified(&local_80);
    if ((param_4 == (long *)0x0) || (iVar2 == 0)) {
      if (iVar2 == 0) goto LAB_00a6e884;
    }
    else {
      *param_4 = local_60;
    }
    if (local_60 == param_3) {
      return 0;
    }
    if (param_2 != 0) {
      *(undefined1 *)(param_2 + local_60) = 0;
    }
    bVar3 = 1;
  }
  return iVar1 != 0 & bVar3;
}


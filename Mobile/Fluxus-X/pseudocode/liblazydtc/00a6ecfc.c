/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6ecfc
 */

byte EVP_PKEY_get_octet_string_param
               (undefined8 param_1,long param_2,undefined8 param_3,undefined8 param_4,
               undefined8 *param_5)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined8 local_48;
  undefined8 uStack_40;
  undefined8 local_38;
  undefined8 uStack_30;
  undefined8 local_28;
  
  if (param_2 == 0) {
    return 0;
  }
  OSSL_PARAM_construct_octet_string(&local_98,param_2,param_3,param_4);
  local_50 = local_78;
  uStack_68 = uStack_90;
  local_70 = local_98;
  uStack_58 = uStack_80;
  uStack_60 = local_88;
  OSSL_PARAM_construct_end(&local_98);
  local_28 = local_78;
  uStack_30 = uStack_80;
  local_38 = local_88;
  uStack_40 = uStack_90;
  local_48 = local_98;
  iVar2 = EVP_PKEY_get_params(param_1,&local_70);
  if (iVar2 == 0) {
    bVar1 = false;
  }
  else {
    iVar3 = OSSL_PARAM_modified(&local_70);
    bVar1 = iVar3 != 0;
    if ((param_5 != (undefined8 *)0x0) && (iVar3 != 0)) {
      *param_5 = local_50;
      bVar1 = true;
    }
  }
  return iVar2 != 0 & bVar1;
}


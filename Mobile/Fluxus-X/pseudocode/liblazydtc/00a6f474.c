/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6f474
 */

ulong EVP_PKEY_get_size_t_param(undefined8 param_1,long param_2,undefined8 param_3)

{
  int iVar1;
  ulong uVar2;
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
    uVar2 = 0;
  }
  else {
    OSSL_PARAM_construct_size_t(&local_98,param_2,param_3);
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
    uVar2 = EVP_PKEY_get_params(param_1,&local_70);
    if ((int)uVar2 != 0) {
      iVar1 = OSSL_PARAM_modified(&local_70);
      uVar2 = (ulong)(iVar1 != 0);
    }
  }
  return uVar2;
}


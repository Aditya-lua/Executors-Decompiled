/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6420c
 */

undefined8 EVP_KDF_CTX_get_kdf_size(long *param_1)

{
  undefined8 uVar1;
  int iVar2;
  long lVar3;
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
  undefined8 local_18;
  
  memset(&local_70,0,0x50);
  local_18 = 0;
  if (param_1 != (long *)0x0) {
    OSSL_PARAM_construct_size_t(&local_98,&DAT_002d7e7d,&local_18);
    local_50 = local_78;
    uStack_68 = uStack_90;
    local_70 = local_98;
    uStack_58 = uStack_80;
    uStack_60 = local_88;
    lVar3 = *param_1;
    if (*(code **)(lVar3 + 0x78) != (code *)0x0) {
      iVar2 = (**(code **)(lVar3 + 0x78))(param_1[1],&local_70);
      if (iVar2 != 0) {
        return local_18;
      }
      lVar3 = *param_1;
    }
    if (*(code **)(lVar3 + 0x70) != (code *)0x0) {
      iVar2 = (**(code **)(lVar3 + 0x70))(&local_70);
      uVar1 = 0;
      if (iVar2 != 0) {
        uVar1 = local_18;
      }
      return uVar1;
    }
  }
  return 0;
}


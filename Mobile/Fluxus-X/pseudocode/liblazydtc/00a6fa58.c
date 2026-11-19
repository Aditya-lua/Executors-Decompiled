/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6fa58
 */

ulong EVP_PKEY_get_field_type(long param_1)

{
  int iVar1;
  int iVar2;
  ulong uVar3;
  EC_KEY *key;
  EC_GROUP *pEVar4;
  uint uVar5;
  char acStack_e8 [80];
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  long local_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 local_60;
  undefined8 uStack_58;
  long local_50;
  undefined8 local_48;
  undefined8 uStack_40;
  undefined8 local_38;
  undefined8 uStack_30;
  long local_28;
  
  uVar3 = 0;
  if (param_1 != 0) {
    if ((*(long *)(param_1 + 0x60) == 0) || (*(long *)(param_1 + 0x68) == 0)) {
      key = (EC_KEY *)EVP_PKEY_get0_EC_KEY(param_1);
      uVar3 = 0;
      if ((key != (EC_KEY *)0x0) &&
         (pEVar4 = EC_KEY_get0_group(key), uVar3 = 0, pEVar4 != (EC_GROUP *)0x0)) {
        uVar3 = EC_GROUP_get_field_type();
      }
    }
    else {
      OSSL_PARAM_construct_utf8_string(&local_98,"field-type",acStack_e8,0x50);
      local_50 = local_78;
      uStack_58 = uStack_80;
      local_60 = local_88;
      uStack_68 = uStack_90;
      local_70 = local_98;
      OSSL_PARAM_construct_end(&local_98);
      local_28 = local_78;
      uStack_30 = uStack_80;
      local_38 = local_88;
      uStack_40 = uStack_90;
      local_48 = local_98;
      iVar1 = EVP_PKEY_get_params(param_1,&local_70);
      if ((((iVar1 == 0) || (iVar2 = OSSL_PARAM_modified(&local_70), iVar2 == 0)) ||
          (local_50 == 0x50)) || (acStack_e8[local_50] = '\0', iVar1 == 0)) {
        uVar3 = 0;
      }
      else {
        iVar1 = strcmp(acStack_e8,"prime-field");
        if (iVar1 == 0) {
          uVar3 = 0x196;
        }
        else {
          iVar1 = strcmp(acStack_e8,"characteristic-two-field");
          uVar5 = 0;
          if (iVar1 != 0) {
            uVar5 = 0x197;
          }
          uVar3 = (ulong)uVar5;
        }
      }
    }
  }
  return uVar3;
}


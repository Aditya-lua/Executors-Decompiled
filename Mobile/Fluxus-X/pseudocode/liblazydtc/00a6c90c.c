/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6c90c
 */

undefined4 FUN_00a6c90c(int *param_1,int *param_2,undefined4 param_3)

{
  long lVar1;
  undefined4 uVar2;
  int iVar3;
  char *pcVar4;
  long lVar5;
  long lVar6;
  undefined8 uVar7;
  long lVar8;
  long local_48;
  long local_38;
  
  local_38 = 0;
  local_48 = 0;
  lVar6 = *(long *)(param_2 + 0x18);
  if (*(long *)(param_1 + 0x18) == 0) {
    if (lVar6 == 0) {
      return 0xfffffffe;
    }
    if (*param_1 != 0) {
      pcVar4 = OBJ_nid2sn(*param_1);
      iVar3 = EVP_KEYMGMT_is_a(lVar6,pcVar4);
      if (iVar3 == 0) {
        return 0xffffffff;
      }
    }
  }
  else if (lVar6 != 0) {
    uVar2 = evp_keymgmt_util_match(param_1,param_2,param_3);
    return uVar2;
  }
  if (*param_2 == 0) {
LAB_00a6c9a4:
    lVar6 = *(long *)(param_2 + 0x18);
  }
  else {
    lVar6 = *(long *)(param_2 + 0x18);
    if (lVar6 == 0) {
      uVar7 = *(undefined8 *)(param_1 + 0x18);
      pcVar4 = OBJ_nid2sn(*param_2);
      iVar3 = EVP_KEYMGMT_is_a(uVar7,pcVar4);
      if (iVar3 == 0) {
        return 0xffffffff;
      }
      goto LAB_00a6c9a4;
    }
  }
  local_38 = *(long *)(param_1 + 0x18);
  lVar5 = *(long *)(param_1 + 0x1a);
  lVar8 = *(long *)(param_2 + 0x1a);
  local_48 = lVar6;
  if ((lVar6 != 0) && (*(long *)(lVar6 + 0xb0) != 0)) {
    lVar6 = evp_pkey_export_to_provider(param_1,0,&local_48,0);
    lVar1 = local_48;
    if (lVar6 != 0) goto joined_r0x00a6ca44;
  }
  lVar6 = lVar5;
  lVar1 = local_38;
  if ((local_38 != 0) && (*(long *)(local_38 + 0xb0) != 0)) {
    lVar5 = evp_pkey_export_to_provider(param_2,0,&local_38,0);
    lVar1 = local_38;
    if (lVar5 != 0) {
      lVar8 = lVar5;
      local_48 = local_38;
    }
  }
joined_r0x00a6ca44:
  local_38 = lVar1;
  if (local_38 == 0) {
    return 0xfffffffe;
  }
  if (local_38 == local_48) {
    uVar2 = evp_keymgmt_match(local_38,lVar6,lVar8,param_3);
    return uVar2;
  }
  return 0xfffffffe;
}


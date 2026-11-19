/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a65d74
 */

/* WARNING: Removing unreachable block (ram,0x00a65e4c) */

ulong evp_keymgmt_util_match(long param_1,long param_2,undefined4 param_3)

{
  long lVar1;
  long lVar2;
  bool bVar3;
  int iVar4;
  undefined8 uVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  long lVar9;
  
  if ((param_1 == 0) || (param_2 == 0)) {
    return (ulong)(param_1 == 0 && param_2 == 0);
  }
  lVar1 = *(long *)(param_2 + 0x60);
  lVar2 = *(long *)(param_2 + 0x68);
  lVar9 = *(long *)(param_1 + 0x60);
  lVar8 = *(long *)(param_1 + 0x68);
  if (lVar9 == lVar1) {
LAB_00a65e9c:
    bVar3 = lVar9 != lVar1;
    lVar9 = lVar1;
    if (bVar3) {
      return 0xfffffffe;
    }
  }
  else {
    if ((lVar9 != 0) && (lVar1 != 0)) {
      uVar5 = EVP_KEYMGMT_get0_name(lVar1);
      iVar4 = EVP_KEYMGMT_is_a(lVar9,uVar5);
      if (iVar4 == 0) {
        ERR_new();
        ERR_set_debug("crypto/evp/keymgmt_lib.c",0x184,"evp_keymgmt_util_match");
        ERR_set_error(6,0x65,0);
        return 0xffffffff;
      }
    }
    if ((lVar1 == 0) || (*(long *)(lVar1 + 0xb0) == 0)) {
      bVar3 = false;
    }
    else {
      if (lVar8 == 0) {
        lVar6 = 0;
        bVar3 = true;
      }
      else {
        lVar6 = evp_keymgmt_util_export_to_provider(param_1,lVar1,param_3);
        bVar3 = lVar6 != 0;
      }
      if (bVar3) {
        lVar9 = lVar1;
        lVar8 = lVar6;
      }
    }
    if (((lVar9 == 0) || (bVar3)) || (*(long *)(lVar9 + 0xb0) == 0)) goto LAB_00a65e9c;
    if (lVar2 != 0) {
      lVar6 = evp_keymgmt_util_export_to_provider(param_2,lVar9,param_3);
      if (lVar6 != 0) goto LAB_00a65ed8;
      goto LAB_00a65e9c;
    }
  }
  if (lVar2 == 0 && lVar8 == 0) {
    return 1;
  }
  lVar6 = lVar2;
  if (lVar2 == 0) {
    return 0;
  }
LAB_00a65ed8:
  if (lVar8 == 0) {
    return 0;
  }
  uVar7 = evp_keymgmt_match(lVar9,lVar8,lVar6,param_3);
  return uVar7;
}


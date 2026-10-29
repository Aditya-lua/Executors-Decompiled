/* 7ff70c7b11a0 FUN_7ff70c7b11a0 */

bool FUN_7ff70c7b11a0(longlong *param_1,undefined8 *param_2)

{
  ulonglong uVar1;
  ulonglong uVar2;
  int iVar3;
  bool bVar4;
  longlong lVar5;
  longlong lVar6;
  undefined8 *puVar7;
  ulonglong uVar8;
  longlong lVar9;
  
  lVar6 = *param_1;
  lVar9 = *(longlong *)(lVar6 + 8);
  if (*(char *)(lVar9 + 0x19) == '\0') {
    puVar7 = param_2;
    if (0xf < (ulonglong)param_2[3]) {
      puVar7 = (undefined8 *)*param_2;
    }
    uVar1 = param_2[2];
    do {
      if (*(ulonglong *)(lVar9 + 0x38) < 0x10) {
        lVar5 = lVar9 + 0x20;
      }
      else {
        lVar5 = *(longlong *)(lVar9 + 0x20);
      }
      uVar2 = *(ulonglong *)(lVar9 + 0x30);
      uVar8 = uVar2;
      if (uVar1 < uVar2) {
        uVar8 = uVar1;
      }
      iVar3 = FUN_7ff70cb12b50(lVar5,puVar7,uVar8);
      bVar4 = uVar2 < uVar1;
      if (iVar3 != 0) {
        bVar4 = iVar3 < 0;
      }
      if (bVar4 == false) {
        lVar6 = lVar9;
      }
      lVar9 = *(longlong *)(lVar9 + (ulonglong)bVar4 * 0x10);
    } while (*(char *)(lVar9 + 0x19) == '\0');
  }
  if (*(char *)(lVar6 + 0x19) == '\0') {
    if (*(ulonglong *)(lVar6 + 0x38) < 0x10) {
      lVar9 = lVar6 + 0x20;
      uVar1 = *(ulonglong *)(lVar6 + 0x30);
      uVar2 = param_2[2];
      uVar8 = param_2[3];
    }
    else {
      lVar9 = *(longlong *)(lVar6 + 0x20);
      uVar1 = *(ulonglong *)(lVar6 + 0x30);
      uVar2 = param_2[2];
      uVar8 = param_2[3];
    }
    if (0xf < uVar8) {
      param_2 = (undefined8 *)*param_2;
    }
    uVar8 = uVar2;
    if (uVar1 < uVar2) {
      uVar8 = uVar1;
    }
    iVar3 = FUN_7ff70cb12b50(param_2,lVar9,uVar8);
    bVar4 = uVar1 <= uVar2;
    if (iVar3 != 0) {
      bVar4 = -1 < iVar3;
    }
  }
  else {
    bVar4 = false;
  }
  return bVar4;
}



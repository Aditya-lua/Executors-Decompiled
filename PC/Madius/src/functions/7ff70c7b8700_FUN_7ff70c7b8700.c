/* 7ff70c7b8700 FUN_7ff70c7b8700 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7b8700(int *param_1,longlong *param_2)

{
  longlong *plVar1;
  longlong lVar2;
  undefined4 *puVar3;
  undefined8 *puVar4;
  int iVar5;
  int iVar6;
  code *pcVar7;
  undefined4 uVar8;
  undefined4 uVar9;
  int iVar10;
  int iVar11;
  longlong lVar12;
  longlong lVar13;
  int iVar14;
  undefined1 auStack_78 [32];
  undefined8 uStack_58;
  undefined8 uStack_50;
  int iStack_48;
  int iStack_44;
  int iStack_40;
  int iStack_3c;
  ulonglong uStack_38;
  
  uStack_38 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  if ((*(longlong *)(param_1 + 0x1e) != param_2[1]) || (*(longlong *)(param_1 + 0x1c) != *param_2))
  {
    plVar1 = (longlong *)(param_1 + 0x1c);
    lVar2 = param_2[1];
    *plVar1 = *param_2;
    *(longlong *)(param_1 + 0x1e) = lVar2;
    uVar8 = *(undefined4 *)((longlong)param_2 + 4);
    lVar2 = param_2[1];
    uVar9 = *(undefined4 *)((longlong)param_2 + 0xc);
    puVar3 = (undefined4 *)(*(longlong *)(param_1 + 0x2e) + -0x10 + (longlong)param_1[0x2c] * 0x10);
    *puVar3 = (int)*param_2;
    puVar3[1] = uVar8;
    puVar3[2] = (int)lVar2;
    puVar3[3] = uVar9;
    lVar12 = *(longlong *)(param_1 + 2);
    iVar5 = *param_1;
    lVar13 = (longlong)iVar5;
    lVar2 = lVar12 + lVar13 * 0x48;
    iVar10 = *(int *)(lVar12 + -0x20 + lVar13 * 0x48);
    if ((iVar10 == 0) ||
       ((*(longlong *)(lVar2 + -0x30) == *(longlong *)(param_1 + 0x1e) &&
        (*(longlong *)(lVar2 + -0x38) == *(longlong *)(param_1 + 0x1c))))) {
      if (*(longlong *)(lVar2 + -0x18) == 0) {
        if ((1 < iVar5) && (iVar10 == 0)) {
          iVar10 = FUN_7ff70cb12b50(param_1 + 0x18,lVar2 + -0x90,0x24);
          if ((iVar10 == 0) &&
             ((*(int *)(lVar2 + -0x68) + *(int *)(lVar2 + -0x6c) == *(int *)(lVar2 + -0x24) &&
              (*(longlong *)(lVar2 + -0x60) == 0)))) {
            *param_1 = iVar5 + -1;
            goto LAB_7ff70c7b8899;
          }
        }
        iVar5 = param_1[0x1d];
        iVar10 = param_1[0x1e];
        iVar6 = param_1[0x1f];
        *(int *)(lVar2 + -0x38) = (int)*plVar1;
        *(int *)(lVar2 + -0x34) = iVar5;
        *(int *)(lVar2 + -0x30) = iVar10;
        *(int *)(lVar2 + -0x2c) = iVar6;
      }
    }
    else {
      uStack_58 = *(undefined8 *)(param_1 + 0x18);
      uStack_50 = *(undefined8 *)(param_1 + 0x1a);
      iStack_48 = (int)*plVar1;
      iStack_44 = param_1[0x1d];
      iStack_40 = param_1[0x1e];
      iStack_3c = param_1[0x1f];
      iVar10 = param_1[4];
      iVar6 = param_1[0x20];
      if (iVar5 == param_1[1]) {
        if (iVar5 == 0) {
          iVar11 = 8;
        }
        else {
          iVar11 = iVar5 / 2 + iVar5;
        }
        iVar14 = iVar5 + 1;
        if (iVar5 + 1 < iVar11) {
          iVar14 = iVar11;
        }
        lVar12 = FUN_7ff70c802100((longlong)iVar14 * 0x48);
        if (*(longlong *)(param_1 + 2) != 0) {
          FUN_7ff70cb12b60(lVar12,*(longlong *)(param_1 + 2),(longlong)*param_1 * 0x48);
          FUN_7ff70c802510(*(undefined8 *)(param_1 + 2));
        }
        *(longlong *)(param_1 + 2) = lVar12;
        param_1[1] = iVar14;
        lVar13 = (longlong)*param_1;
      }
      puVar4 = (undefined8 *)(lVar12 + 0x10 + lVar13 * 0x48);
      *puVar4 = CONCAT44(iStack_44,iStack_48);
      puVar4[1] = CONCAT44(iStack_3c,iStack_40);
      puVar4 = (undefined8 *)(lVar12 + lVar13 * 0x48);
      *puVar4 = uStack_58;
      puVar4[1] = uStack_50;
      *(int *)(lVar12 + 0x20 + lVar13 * 0x48) = iVar6;
      *(int *)(lVar12 + 0x24 + lVar13 * 0x48) = iVar10;
      puVar4 = (undefined8 *)(lVar12 + 0x28 + lVar13 * 0x48);
      *puVar4 = 0;
      puVar4[1] = 0;
      puVar4 = (undefined8 *)(lVar12 + 0x38 + lVar13 * 0x48);
      *puVar4 = 0;
      puVar4[1] = 0;
      *param_1 = *param_1 + 1;
    }
  }
LAB_7ff70c7b8899:
  if (_DAT_7ff70cbebd80 == (uStack_38 ^ (ulonglong)auStack_78)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_38 ^ (ulonglong)auStack_78);
  pcVar7 = (code *)swi(3);
  (*pcVar7)();
  return;
}



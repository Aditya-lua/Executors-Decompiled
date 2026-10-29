/* 7ff70c7b12a0 FUN_7ff70c7b12a0 */

longlong * FUN_7ff70c7b12a0(longlong *param_1,longlong *param_2,undefined8 *param_3)

{
  char cVar1;
  longlong lVar2;
  ulonglong uVar3;
  ulonglong uVar4;
  code *pcVar5;
  bool bVar6;
  undefined1 uVar7;
  int iVar8;
  longlong lVar9;
  longlong lVar10;
  longlong *plVar11;
  longlong lVar12;
  undefined8 *puVar13;
  uint uVar14;
  ulonglong uVar15;
  undefined1 uStack_71;
  undefined8 uStack_70;
  undefined8 *puStack_68;
  longlong lStack_60;
  uint uStack_58;
  undefined1 auStack_50 [8];
  undefined8 uStack_48;
  
  lVar2 = *param_1;
  lVar9 = *(longlong *)(lVar2 + 8);
  uVar14 = 0;
  lVar10 = lVar2;
  if (*(char *)(lVar9 + 0x19) == '\0') {
    puVar13 = param_3;
    if (0xf < (ulonglong)param_3[3]) {
      puVar13 = (undefined8 *)*param_3;
    }
    uVar3 = param_3[2];
    lVar12 = lVar9;
    uStack_70 = param_2;
    do {
      lVar9 = lVar12;
      if (*(ulonglong *)(lVar9 + 0x38) < 0x10) {
        lVar12 = lVar9 + 0x20;
      }
      else {
        lVar12 = *(longlong *)(lVar9 + 0x20);
      }
      uVar4 = *(ulonglong *)(lVar9 + 0x30);
      uVar15 = uVar4;
      if (uVar3 < uVar4) {
        uVar15 = uVar3;
      }
      iVar8 = FUN_7ff70cb12b50(lVar12,puVar13,uVar15);
      bVar6 = uVar4 < uVar3;
      if (iVar8 != 0) {
        bVar6 = iVar8 < 0;
      }
      if (bVar6 == false) {
        lVar10 = lVar9;
      }
      lVar12 = *(longlong *)(lVar9 + (ulonglong)bVar6 * 0x10);
    } while (*(char *)(lVar12 + 0x19) == '\0');
    uVar14 = (uint)(bVar6 ^ 1);
    cVar1 = *(char *)(lVar10 + 0x19);
    param_2 = uStack_70;
  }
  else {
    cVar1 = *(char *)(lVar2 + 0x19);
  }
  if (cVar1 == '\0') {
    uVar3 = (ulonglong)uStack_70 >> 0x20;
    uStack_70 = (longlong *)CONCAT44((int)uVar3,uVar14);
    if (*(ulonglong *)(lVar10 + 0x38) < 0x10) {
      lVar12 = lVar10 + 0x20;
    }
    else {
      lVar12 = *(longlong *)(lVar10 + 0x20);
    }
    uVar3 = *(ulonglong *)(lVar10 + 0x30);
    uVar4 = param_3[2];
    puVar13 = param_3;
    if (0xf < (ulonglong)param_3[3]) {
      puVar13 = (undefined8 *)*param_3;
    }
    uVar15 = uVar4;
    if (uVar3 < uVar4) {
      uVar15 = uVar3;
    }
    iVar8 = FUN_7ff70cb12b50(puVar13,lVar12,uVar15);
    bVar6 = uVar3 <= uVar4;
    if (iVar8 != 0) {
      bVar6 = -1 < iVar8;
    }
    uVar14 = (uint)uStack_70;
    if (bVar6) {
      uVar7 = 0;
      goto LAB_7ff70c7b141c;
    }
  }
  if (param_1[1] == 0x1e1e1e1e1e1e1e1) {
    FUN_7ff70ca3b460();
    pcVar5 = (code *)swi(3);
    plVar11 = (longlong *)(*pcVar5)();
    return plVar11;
  }
  puStack_68 = param_3;
  FUN_7ff70c7b1440(auStack_50,param_1,lVar2,&UNK_7ff70cb75e1c,&puStack_68,&uStack_71);
  lStack_60 = lVar9;
  uStack_58 = uVar14;
  lVar10 = FUN_7ff70c7b1630(param_1,&lStack_60,uStack_48);
  uVar7 = 1;
LAB_7ff70c7b141c:
  *param_2 = lVar10;
  *(undefined1 *)(param_2 + 1) = uVar7;
  return param_2;
}



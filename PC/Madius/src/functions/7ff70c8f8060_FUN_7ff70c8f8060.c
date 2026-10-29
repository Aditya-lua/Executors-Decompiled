/* 7ff70c8f8060 FUN_7ff70c8f8060 */

longlong * FUN_7ff70c8f8060(longlong *param_1,longlong *param_2,undefined8 *param_3)

{
  char cVar1;
  longlong lVar2;
  ulonglong uVar3;
  ulonglong uVar4;
  code *pcVar5;
  bool bVar6;
  undefined8 uVar7;
  undefined1 uVar8;
  int iVar9;
  longlong lVar10;
  longlong lVar11;
  longlong *plVar12;
  longlong lVar13;
  undefined8 *puVar14;
  uint uVar15;
  ulonglong uVar16;
  undefined1 uStack_71;
  undefined8 uStack_70;
  undefined8 *puStack_68;
  longlong lStack_60;
  uint uStack_58;
  undefined1 auStack_50 [8];
  undefined8 uStack_48;
  
  lVar2 = *param_1;
  lVar10 = *(longlong *)(lVar2 + 8);
  uVar15 = 0;
  lVar11 = lVar2;
  if (*(char *)(lVar10 + 0x19) == '\0') {
    puVar14 = param_3;
    if (0xf < (ulonglong)param_3[3]) {
      puVar14 = (undefined8 *)*param_3;
    }
    uVar3 = param_3[2];
    lVar13 = lVar10;
    uStack_70 = param_2;
    do {
      lVar10 = lVar13;
      if (*(ulonglong *)(lVar10 + 0x38) < 0x10) {
        lVar13 = lVar10 + 0x20;
      }
      else {
        lVar13 = *(longlong *)(lVar10 + 0x20);
      }
      uVar4 = *(ulonglong *)(lVar10 + 0x30);
      uVar16 = uVar4;
      if (uVar3 < uVar4) {
        uVar16 = uVar3;
      }
      iVar9 = FUN_7ff70cb12b50(lVar13,puVar14,uVar16);
      bVar6 = uVar4 < uVar3;
      if (iVar9 != 0) {
        bVar6 = iVar9 < 0;
      }
      if (bVar6 == false) {
        lVar11 = lVar10;
      }
      lVar13 = *(longlong *)(lVar10 + (ulonglong)bVar6 * 0x10);
    } while (*(char *)(lVar13 + 0x19) == '\0');
    uVar15 = (uint)(bVar6 ^ 1);
    cVar1 = *(char *)(lVar11 + 0x19);
    param_2 = uStack_70;
  }
  else {
    cVar1 = *(char *)(lVar2 + 0x19);
  }
  if (cVar1 == '\0') {
    uVar3 = (ulonglong)uStack_70 >> 0x20;
    uStack_70 = (longlong *)CONCAT44((int)uVar3,uVar15);
    if (*(ulonglong *)(lVar11 + 0x38) < 0x10) {
      lVar13 = lVar11 + 0x20;
    }
    else {
      lVar13 = *(longlong *)(lVar11 + 0x20);
    }
    uVar3 = *(ulonglong *)(lVar11 + 0x30);
    uVar4 = param_3[2];
    puVar14 = param_3;
    if (0xf < (ulonglong)param_3[3]) {
      puVar14 = (undefined8 *)*param_3;
    }
    uVar16 = uVar4;
    if (uVar3 < uVar4) {
      uVar16 = uVar3;
    }
    iVar9 = FUN_7ff70cb12b50(puVar14,lVar13,uVar16);
    bVar6 = uVar3 <= uVar4;
    if (iVar9 != 0) {
      bVar6 = -1 < iVar9;
    }
    uVar15 = (uint)uStack_70;
    if (bVar6) {
      uVar8 = 0;
      goto LAB_7ff70c8f81f7;
    }
  }
  if (param_1[1] == 0x2aaaaaaaaaaaaaa) {
    FUN_7ff70ca3b460();
    pcVar5 = (code *)swi(3);
    plVar12 = (longlong *)(*pcVar5)();
    return plVar12;
  }
  puStack_68 = param_3;
  FUN_7ff70c7b0b80(auStack_50,param_1,lVar2,&UNK_7ff70cb75e1c,&puStack_68,&uStack_71);
  uVar7 = uStack_48;
  uStack_48 = 0;
  FUN_7ff70ca3e580(auStack_50);
  lStack_60 = lVar10;
  uStack_58 = uVar15;
  lVar11 = FUN_7ff70ca3b1f0(param_1,&lStack_60,uVar7);
  uVar8 = 1;
LAB_7ff70c8f81f7:
  *param_2 = lVar11;
  *(undefined1 *)(param_2 + 1) = uVar8;
  return param_2;
}



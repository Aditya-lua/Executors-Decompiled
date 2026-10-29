/* 7ff70c802cf0 FUN_7ff70c802cf0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c802cf0(longlong *param_1,undefined8 *param_2,char *param_3,longlong *param_4)

{
  int iVar1;
  longlong lVar2;
  undefined *puVar3;
  code *pcVar4;
  int iVar5;
  longlong lVar6;
  undefined *puVar7;
  ulonglong *puVar8;
  int iVar9;
  longlong **pplVar10;
  longlong **pplVar11;
  longlong *plStack_80;
  undefined1 auStack_78 [32];
  undefined8 uStack_58;
  longlong *plStack_50;
  ulonglong uStack_48;
  
  lVar6 = _DAT_7ff70cc1a3c0;
  pplVar10 = (longlong **)auStack_78;
  uStack_48 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  if (*param_3 == '%') {
    if (param_3[1] == '.') {
      if (((param_3[2] != '*') || (param_3[3] != 's')) || (param_3[4] != '\0'))
      goto LAB_7ff70c802d84;
      iVar1 = (int)*param_4;
      iVar9 = 6;
      if (iVar1 < 6) {
        iVar9 = iVar1;
      }
      puVar3 = (undefined *)param_4[1];
      if (puVar3 != (undefined *)0x0) {
        iVar9 = iVar1;
      }
      puVar7 = &UNK_7ff70cb8e7fb;
      if (puVar3 != (undefined *)0x0) {
        puVar7 = puVar3;
      }
      *param_1 = (longlong)puVar7;
      puVar7 = puVar7 + iVar9;
    }
    else {
      if ((param_3[1] != 's') || (param_3[2] != '\0')) goto LAB_7ff70c802d84;
      puVar7 = &UNK_7ff70cb8e7fb;
      if ((undefined *)*param_4 != (undefined *)0x0) {
        puVar7 = (undefined *)*param_4;
      }
      *param_1 = (longlong)puVar7;
      pplVar11 = (longlong **)auStack_78;
      if (param_2 == (undefined8 *)0x0) goto LAB_7ff70c802dfa;
      plStack_80 = (longlong *)0x7ff70c802d63;
      lVar6 = FUN_7ff70cb12e80(puVar7);
      puVar7 = puVar7 + lVar6;
      pplVar10 = (longlong **)auStack_78;
    }
  }
  else {
LAB_7ff70c802d84:
    iVar1 = *(int *)(_DAT_7ff70cc1a3c0 + 0x29b0);
    lVar2 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x29b8);
    plStack_80 = (longlong *)0x7ff70c802d9a;
    puVar8 = (ulonglong *)FUN_7ff70ca421b0();
    uStack_58 = 0;
    pplVar11 = &plStack_80;
    pplVar10 = &plStack_80;
    plStack_80 = param_4;
    plStack_50 = param_4;
    iVar5 = func_0x7ff70d9b2da8(*puVar8 | 1,lVar2,(longlong)iVar1,param_3);
    iVar9 = -1;
    if (-1 < iVar5) {
      iVar9 = iVar5;
    }
    if (lVar2 != 0) {
      if (iVar1 <= iVar9) {
        iVar9 = iVar1 + -1;
      }
      if (iVar5 < 0) {
        iVar9 = iVar1 + -1;
      }
      *(undefined1 *)(lVar2 + iVar9) = 0;
    }
    lVar6 = *(longlong *)(lVar6 + 0x29b8);
    *param_1 = lVar6;
    if (param_2 == (undefined8 *)0x0) goto LAB_7ff70c802dfa;
    puVar7 = (undefined *)(lVar6 + iVar9);
  }
  *param_2 = puVar7;
  pplVar11 = pplVar10;
LAB_7ff70c802dfa:
  if (_DAT_7ff70cbebd80 == (*(ulonglong *)((longlong)pplVar11 + 0x30) ^ (ulonglong)pplVar11)) {
    return;
  }
  *(undefined8 *)((longlong)pplVar11 + -8) = 0x7ff70c802e59;
  FUN_7ff70caa97e0(*(ulonglong *)((longlong)pplVar11 + 0x30) ^ (ulonglong)pplVar11);
  pcVar4 = (code *)swi(3);
  (*pcVar4)();
  return;
}



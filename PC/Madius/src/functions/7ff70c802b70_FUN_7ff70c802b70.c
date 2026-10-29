/* 7ff70c802b70 FUN_7ff70c802b70 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c802b70(longlong *param_1,longlong *param_2,char *param_3,undefined *param_4,
                     undefined *param_5)

{
  longlong lVar1;
  code *pcVar2;
  int iVar3;
  longlong lVar4;
  undefined *puVar5;
  ulonglong *puVar6;
  int iVar7;
  int iVar8;
  longlong **pplVar9;
  longlong **pplVar10;
  undefined *puStackX_20;
  longlong *plStack_90;
  undefined1 auStack_88 [32];
  undefined8 uStack_68;
  undefined **ppuStack_60;
  undefined **ppuStack_50;
  ulonglong uStack_48;
  
  lVar4 = _DAT_7ff70cc1a3c0;
  pplVar9 = (longlong **)auStack_88;
  uStack_48 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_88;
  ppuStack_50 = &puStackX_20;
  puStackX_20 = param_4;
  if (*param_3 == '%') {
    if (param_3[1] == '.') {
      if (((param_3[2] != '*') || (param_3[3] != 's')) || (param_3[4] != '\0'))
      goto LAB_7ff70c802c12;
      puStackX_20._0_4_ = (int)param_4;
      iVar8 = 6;
      if ((int)puStackX_20 < 6) {
        iVar8 = (int)puStackX_20;
      }
      if (param_5 != (undefined *)0x0) {
        iVar8 = (int)puStackX_20;
      }
      puVar5 = &UNK_7ff70cb8e7fb;
      if (param_5 != (undefined *)0x0) {
        puVar5 = param_5;
      }
      *param_1 = (longlong)puVar5;
      puVar5 = puVar5 + iVar8;
    }
    else {
      if ((param_3[1] != 's') || (param_3[2] != '\0')) goto LAB_7ff70c802c12;
      puVar5 = &UNK_7ff70cb8e7fb;
      if (param_4 != (undefined *)0x0) {
        puVar5 = param_4;
      }
      *param_1 = (longlong)puVar5;
      pplVar10 = (longlong **)auStack_88;
      if (param_2 == (longlong *)0x0) goto LAB_7ff70c802c8b;
      plStack_90 = (longlong *)0x7ff70c802bf4;
      lVar4 = FUN_7ff70cb12e80(puVar5);
      puVar5 = puVar5 + lVar4;
      pplVar9 = (longlong **)auStack_88;
    }
  }
  else {
LAB_7ff70c802c12:
    iVar8 = *(int *)(_DAT_7ff70cc1a3c0 + 0x29b0);
    lVar1 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x29b8);
    plStack_90 = (longlong *)0x7ff70c802c2a;
    puVar6 = (ulonglong *)FUN_7ff70ca421b0();
    uStack_68 = 0;
    pplVar10 = &plStack_90;
    pplVar9 = &plStack_90;
    plStack_90 = param_2;
    ppuStack_60 = &puStackX_20;
    iVar3 = func_0x7ff70da665a1(*puVar6 | 1,lVar1,(longlong)iVar8,param_3);
    iVar7 = -1;
    if (-1 < iVar3) {
      iVar7 = iVar3;
    }
    if (lVar1 != 0) {
      if (iVar8 <= iVar7) {
        iVar7 = iVar8 + -1;
      }
      if (iVar3 < 0) {
        iVar7 = iVar8 + -1;
      }
      *(undefined1 *)(lVar1 + iVar7) = 0;
    }
    lVar4 = *(longlong *)(lVar4 + 0x29b8);
    *param_1 = lVar4;
    if (param_2 == (longlong *)0x0) goto LAB_7ff70c802c8b;
    puVar5 = (undefined *)(lVar4 + iVar7);
  }
  *param_2 = (longlong)puVar5;
  pplVar10 = pplVar9;
LAB_7ff70c802c8b:
  if (_DAT_7ff70cbebd80 == (*(ulonglong *)((longlong)pplVar10 + 0x40) ^ (ulonglong)pplVar10)) {
    return;
  }
  *(undefined8 *)((longlong)pplVar10 + -8) = 0x7ff70c802cec;
  FUN_7ff70caa97e0(*(ulonglong *)((longlong)pplVar10 + 0x40) ^ (ulonglong)pplVar10);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}



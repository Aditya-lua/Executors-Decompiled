/* 7ff70c80c840 FUN_7ff70c80c840 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c80c840(longlong param_1,char *param_2,char *param_3)

{
  float fVar1;
  float fVar2;
  longlong lVar3;
  code *pcVar4;
  float fVar5;
  longlong lVar6;
  longlong lVar7;
  char *pcVar8;
  int iVar9;
  longlong lVar10;
  char *pcVar11;
  longlong lVar12;
  int iVar13;
  int iVar14;
  undefined1 auStack_a8 [32];
  char *pcStack_88;
  char *pcStack_80;
  longlong lStack_78;
  ulonglong uStack_70;
  
  fVar5 = _DAT_7ff70cb1ba2c;
  uStack_70 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_a8;
  lStack_78 = param_1;
  do {
    lVar7 = lStack_78;
    lVar6 = _DAT_7ff70cc1a3c0;
    lVar12 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
    lVar3 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x2748);
    pcStack_80 = *(char **)(_DAT_7ff70cc1a3c0 + 0x2750);
    *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x2748) = 0;
    *(undefined8 *)(lVar6 + 0x2750) = 0;
    pcVar8 = param_2;
    if (param_3 == (char *)0x0) {
      while (param_3 = pcVar8, param_3 != (char *)0xffffffffffffffff) {
        if (*param_3 == '#') {
          if (param_3[1] == '#') goto LAB_7ff70c80c8f7;
        }
        else if (*param_3 == '\0') goto LAB_7ff70c80c8f7;
        pcVar8 = param_3 + 1;
      }
      param_3 = (char *)0xffffffffffffffff;
    }
LAB_7ff70c80c8f7:
    if ((lStack_78 != 0) &&
       (fVar1 = *(float *)(lStack_78 + 4), fVar2 = *(float *)(lVar6 + 0x2758),
       *(float *)(lVar6 + 0x2758) = fVar1, fVar2 + *(float *)(lVar6 + 0xc90) + fVar5 < fVar1)) {
      FUN_7ff70c856f00(&UNK_7ff70cb922d3);
      *(undefined1 *)(lVar6 + 0x275c) = 1;
    }
    if (lVar3 != 0) {
      lVar10 = FUN_7ff70cb12e80(lVar3);
      FUN_7ff70c80c840(lVar7,lVar3,lVar10 + lVar3);
    }
    pcVar8 = pcStack_80;
    iVar13 = *(int *)(lVar12 + 0x1a0);
    iVar9 = *(int *)(lVar6 + 0x2760);
    iVar14 = iVar13;
    if (iVar13 < *(int *)(lVar6 + 0x2760)) {
      *(int *)(lVar6 + 0x2760) = iVar13;
      iVar14 = *(int *)(lVar12 + 0x1a0);
      iVar9 = iVar13;
    }
    do {
      pcVar11 = (char *)FUN_7ff70cb12b40(param_2,10,(longlong)param_3 - (longlong)param_2);
      if (pcVar11 == (char *)0x0) {
        pcVar11 = param_3;
      }
      if ((param_2 != pcVar11) || (pcVar11 != param_3)) {
        iVar13 = 1;
        if (*(char *)(lVar6 + 0x275c) != '\0') {
          iVar13 = (iVar14 - iVar9) * 4;
        }
        pcStack_88 = param_2;
        FUN_7ff70c856f00(&UNK_7ff70cb822dc,iVar13,&UNK_7ff70cb923a7,(int)pcVar11 - (int)param_2);
        *(undefined1 *)(lVar6 + 0x275c) = 0;
        if (*pcVar11 == '\n') {
          FUN_7ff70c856f00(&UNK_7ff70cb922d3);
          *(undefined1 *)(lVar6 + 0x275c) = 1;
        }
      }
      param_2 = pcVar11 + 1;
    } while (pcVar11 != param_3);
    if (pcVar8 == (char *)0x0) {
      if (_DAT_7ff70cbebd80 != (uStack_70 ^ (ulonglong)auStack_a8)) {
        FUN_7ff70caa97e0(uStack_70 ^ (ulonglong)auStack_a8);
        pcVar4 = (code *)swi(3);
        (*pcVar4)();
        return;
      }
      return;
    }
    lVar12 = FUN_7ff70cb12e80(pcVar8);
    param_3 = pcVar8 + lVar12;
    param_2 = pcVar8;
  } while( true );
}



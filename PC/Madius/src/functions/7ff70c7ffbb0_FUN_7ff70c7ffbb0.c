/* 7ff70c7ffbb0 FUN_7ff70c7ffbb0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7ffbb0(longlong param_1,uint param_2,char param_3,float param_4)

{
  int iVar1;
  longlong lVar2;
  bool bVar3;
  code *pcVar4;
  uint uVar5;
  longlong lVar6;
  short sVar7;
  int iVar8;
  int *piVar9;
  int iVar10;
  int iVar11;
  longlong lVar12;
  uint uVar13;
  longlong lVar14;
  longlong lVar15;
  float *pfVar16;
  int *piVar17;
  undefined1 auStack_78 [40];
  ulonglong uStack_50;
  
  uStack_50 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  if ((param_2 == 0) || (*(char *)(param_1 + 0xba5) == '\0')) goto LAB_7ff70c7fff85;
  lVar2 = *(longlong *)(param_1 + 0xd0);
  if (*(char *)(lVar2 + 0x59) != '\x01') goto LAB_7ff70c7ffc6f;
  switch(param_2) {
  case 0x20f:
    param_2 = 0x212;
    iVar11 = *(int *)(lVar2 + 0x13b8);
    break;
  case 0x212:
    param_2 = 0x20f;
    iVar11 = *(int *)(lVar2 + 0x13b8);
    break;
  case 0x213:
    param_2 = 0x216;
  case 0x210:
  case 0x211:
  case 0x214:
  case 0x215:
LAB_7ff70c7ffc6f:
    iVar11 = *(int *)(lVar2 + 0x13b8);
    break;
  case 0x216:
    param_2 = 0x213;
    iVar11 = *(int *)(lVar2 + 0x13b8);
    break;
  default:
    if (param_2 == 0x8000) {
      param_2 = 0x1000;
      iVar11 = *(int *)(lVar2 + 0x13b8);
    }
    else {
      if (param_2 != 0x1000) goto LAB_7ff70c7ffc6f;
      param_2 = 0x8000;
      iVar11 = *(int *)(lVar2 + 0x13b8);
    }
  }
  if (0 < iVar11) {
    piVar9 = (int *)((ulonglong)(iVar11 - 1) * 0x1c + *(longlong *)(lVar2 + 0x13c0));
    lVar6 = (ulonglong)(iVar11 - 1) + 1;
    do {
      if ((*piVar9 == 4) && (piVar9[3] == param_2)) goto LAB_7ff70c7ffcc6;
      piVar9 = piVar9 + -7;
      lVar14 = lVar6 + -1;
      bVar3 = 0 < lVar6;
      lVar6 = lVar14;
    } while (lVar14 != 0 && bVar3);
  }
  piVar9 = (int *)0x0;
LAB_7ff70c7ffcc6:
  uVar13 = param_2;
  if ((param_2 & param_2 - 1) == 0 && (param_2 & 0xf000) != 0) {
    uVar5 = 0;
    for (; (uVar13 & 1) == 0; uVar13 = uVar13 >> 1 | 0x80000000) {
      uVar5 = uVar5 + 1;
    }
    uVar13 = uVar5 + 0x28b;
    if ((uVar5 & 0x1c) != 0xc) {
      uVar13 = param_2;
    }
  }
  piVar17 = piVar9 + 4;
  if (piVar9 == (int *)0x0) {
    piVar17 = (int *)(lVar2 + (longlong)(int)uVar13 * 0x10 + -0x1efc);
  }
  if ((char)*piVar17 == param_3) {
    pfVar16 = (float *)(piVar9 + 5);
    if (piVar9 == (int *)0x0) {
      pfVar16 = (float *)((longlong)(int)uVar13 * 0x10 + lVar2 + -0x1ef0);
    }
    if ((*pfVar16 == param_4) && (!NAN(*pfVar16) && !NAN(param_4))) goto LAB_7ff70c7fff85;
  }
  iVar1 = *(int *)(lVar2 + 0x13dc);
  *(int *)(lVar2 + 0x13dc) = iVar1 + 1;
  if (iVar11 == *(int *)(lVar2 + 0x13bc)) {
    if (iVar11 == 0) {
      iVar8 = 8;
    }
    else {
      iVar8 = iVar11 / 2 + iVar11;
    }
    iVar10 = iVar11 + 1;
    if (iVar11 + 1 < iVar8) {
      iVar10 = iVar8;
    }
    lVar6 = (*_DAT_7ff70cbe9460)((longlong)iVar10 * 0x1c,_DAT_7ff70cc1a3d0);
    lVar14 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar9 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar15 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar15 * 8) == *piVar9) {
        sVar7 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar15 * 8) + 1;
      }
      else {
        iVar11 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar11;
        lVar15 = (longlong)iVar11;
        *(int *)(lVar14 + 0x2874 + lVar15 * 8) = *piVar9;
        *(undefined4 *)(lVar14 + 0x2878 + lVar15 * 8) = 0;
        sVar7 = 1;
      }
      *(short *)(lVar14 + 0x2878 + lVar15 * 8) = sVar7;
      *(int *)(lVar14 + 0x2868) = *(int *)(lVar14 + 0x2868) + 1;
    }
    if (*(longlong *)(lVar2 + 0x13c0) != 0) {
      FUN_7ff70cb12b60(lVar6,*(longlong *)(lVar2 + 0x13c0),(longlong)*(int *)(lVar2 + 0x13b8) * 0x1c
                      );
      lVar15 = _DAT_7ff70cc1a3c0;
      lVar14 = *(longlong *)(lVar2 + 0x13c0);
      if ((lVar14 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar9 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar12 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar12 * 8) == *piVar9) {
          sVar7 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar12 * 8) + 1;
        }
        else {
          iVar11 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar11;
          lVar12 = (longlong)iVar11;
          *(int *)(lVar15 + 0x2874 + lVar12 * 8) = *piVar9;
          *(undefined4 *)(lVar15 + 0x2878 + lVar12 * 8) = 0;
          sVar7 = 1;
        }
        *(short *)(lVar15 + 0x287a + lVar12 * 8) = sVar7;
        *(int *)(lVar15 + 0x286c) = *(int *)(lVar15 + 0x286c) + 1;
      }
      (*_DAT_7ff70cbe9468)(lVar14,_DAT_7ff70cc1a3d0);
    }
    *(longlong *)(lVar2 + 0x13c0) = lVar6;
    *(int *)(lVar2 + 0x13bc) = iVar10;
    iVar11 = *(int *)(lVar2 + 0x13b8);
  }
  else {
    lVar6 = *(longlong *)(lVar2 + 0x13c0);
  }
  lVar14 = (longlong)iVar11 * 0x1c;
  *(undefined4 *)(lVar6 + lVar14) = 4;
  *(uint *)(lVar6 + 4 + lVar14) = (param_2 - 0x278 < 0x18) + 2;
  *(int *)(lVar6 + 8 + lVar14) = iVar1;
  *(uint *)(lVar6 + 0xc + lVar14) = param_2;
  *(char *)(lVar6 + 0x10 + lVar14) = param_3;
  *(undefined2 *)(lVar6 + 0x11 + lVar14) = 0;
  *(undefined1 *)(lVar6 + 0x13 + lVar14) = 0;
  *(float *)(lVar6 + 0x14 + lVar14) = param_4;
  *(undefined4 *)(lVar6 + 0x18 + lVar14) = 0;
  *(int *)(lVar2 + 0x13b8) = *(int *)(lVar2 + 0x13b8) + 1;
LAB_7ff70c7fff85:
  if (_DAT_7ff70cbebd80 == (uStack_50 ^ (ulonglong)auStack_78)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_50 ^ (ulonglong)auStack_78);
  pcVar4 = (code *)swi(3);
  (*pcVar4)();
  return;
}



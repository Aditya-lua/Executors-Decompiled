/* 7ff70c83c640 FUN_7ff70c83c640 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c83c640(byte param_1)

{
  float *pfVar1;
  int *piVar2;
  longlong lVar3;
  code *pcVar4;
  longlong lVar5;
  uint uVar6;
  int iVar7;
  longlong lVar8;
  short sVar9;
  longlong lVar10;
  int iVar11;
  int iVar12;
  longlong lVar13;
  undefined1 auStack_48 [40];
  ulonglong uStack_20;
  
  lVar5 = _DAT_7ff70cc1a3c0;
  uStack_20 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  uVar6 = *(uint *)(_DAT_7ff70cc1a3c0 + 0x1de0);
  if ((param_1 != 0) && ((uVar6 & 0x400) == 0)) {
    pfVar1 = (float *)(_DAT_7ff70cc1a3c0 + 0xc4c);
    *(float *)(_DAT_7ff70cc1a3c0 + 0x259c) = *pfVar1;
    *(float *)(lVar5 + 0xc4c) = *pfVar1 * *(float *)(lVar5 + 0xc50);
  }
  if ((~param_1 & (uVar6 & 0x400) == 0) == 0) {
    uVar6 = uVar6 | 0x400;
    *(uint *)(lVar5 + 0x1de0) = uVar6;
  }
  iVar12 = *(int *)(lVar5 + 0x1f30);
  if (iVar12 == *(int *)(lVar5 + 0x1f34)) {
    if (iVar12 == 0) {
      iVar7 = 8;
    }
    else {
      iVar7 = iVar12 / 2 + iVar12;
    }
    iVar11 = iVar12 + 1;
    if (iVar12 + 1 < iVar7) {
      iVar11 = iVar7;
    }
    lVar8 = (*_DAT_7ff70cbe9460)((longlong)iVar11 << 2,_DAT_7ff70cc1a3d0);
    lVar3 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar10 * 8) == *piVar2) {
        sVar9 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar10 * 8) + 1;
      }
      else {
        iVar12 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar12;
        lVar10 = (longlong)iVar12;
        *(int *)(lVar3 + 0x2874 + lVar10 * 8) = *piVar2;
        *(undefined4 *)(lVar3 + 0x2878 + lVar10 * 8) = 0;
        sVar9 = 1;
      }
      *(short *)(lVar3 + 0x2878 + lVar10 * 8) = sVar9;
      *(int *)(lVar3 + 0x2868) = *(int *)(lVar3 + 0x2868) + 1;
    }
    if (*(longlong *)(lVar5 + 0x1f38) != 0) {
      FUN_7ff70cb12b60(lVar8,*(longlong *)(lVar5 + 0x1f38),(longlong)*(int *)(lVar5 + 0x1f30) << 2);
      lVar10 = _DAT_7ff70cc1a3c0;
      lVar3 = *(longlong *)(lVar5 + 0x1f38);
      if ((lVar3 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar13 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar13 * 8) == *piVar2) {
          sVar9 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar13 * 8) + 1;
        }
        else {
          iVar12 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar12;
          lVar13 = (longlong)iVar12;
          *(int *)(lVar10 + 0x2874 + lVar13 * 8) = *piVar2;
          *(undefined4 *)(lVar10 + 0x2878 + lVar13 * 8) = 0;
          sVar9 = 1;
        }
        *(short *)(lVar10 + 0x287a + lVar13 * 8) = sVar9;
        *(int *)(lVar10 + 0x286c) = *(int *)(lVar10 + 0x286c) + 1;
      }
      (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
    }
    *(longlong *)(lVar5 + 0x1f38) = lVar8;
    *(int *)(lVar5 + 0x1f34) = iVar11;
    uVar6 = *(uint *)(lVar5 + 0x1de0);
    iVar12 = *(int *)(lVar5 + 0x1f30);
  }
  else {
    lVar8 = *(longlong *)(lVar5 + 0x1f38);
  }
  *(uint *)(lVar8 + (longlong)iVar12 * 4) = uVar6;
  *(int *)(lVar5 + 0x1f30) = *(int *)(lVar5 + 0x1f30) + 1;
  *(short *)(lVar5 + 0x25a0) = *(short *)(lVar5 + 0x25a0) + 1;
  if (_DAT_7ff70cbebd80 == (uStack_20 ^ (ulonglong)auStack_48)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_20 ^ (ulonglong)auStack_48);
  pcVar4 = (code *)swi(3);
  (*pcVar4)();
  return;
}



/* 7ff70c80a550 FUN_7ff70c80a550 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c80a550(int param_1,undefined4 *param_2)

{
  int *piVar1;
  longlong lVar2;
  undefined4 *puVar3;
  longlong lVar4;
  code *pcVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  longlong lVar9;
  short sVar10;
  int iVar11;
  longlong lVar12;
  int iVar13;
  int iVar14;
  longlong lVar15;
  undefined1 auStack_68 [32];
  undefined4 uStack_48;
  undefined4 uStack_44;
  undefined4 uStack_40;
  undefined4 uStack_3c;
  ulonglong uStack_38;
  
  lVar2 = _DAT_7ff70cc1a3c0;
  uStack_38 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_68;
  puVar3 = (undefined4 *)(_DAT_7ff70cc1a3c0 + 0xd54 + (longlong)param_1 * 0x10);
  uStack_48 = *puVar3;
  uStack_44 = puVar3[1];
  uStack_40 = puVar3[2];
  uStack_3c = puVar3[3];
  iVar14 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1ef0);
  if (iVar14 == *(int *)(_DAT_7ff70cc1a3c0 + 0x1ef4)) {
    if (iVar14 == 0) {
      iVar11 = 8;
    }
    else {
      iVar11 = iVar14 / 2 + iVar14;
    }
    iVar13 = iVar14 + 1;
    if (iVar14 + 1 < iVar11) {
      iVar13 = iVar11;
    }
    lVar9 = (*_DAT_7ff70cbe9460)((longlong)iVar13 * 0x14,_DAT_7ff70cc1a3d0);
    lVar4 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar12 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar12 * 8) == *piVar1) {
        sVar10 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar12 * 8) + 1;
      }
      else {
        iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
        lVar12 = (longlong)iVar14;
        *(int *)(lVar4 + 0x2874 + lVar12 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar12 * 8) = 0;
        sVar10 = 1;
      }
      *(short *)(lVar4 + 0x2878 + lVar12 * 8) = sVar10;
      *(int *)(lVar4 + 0x2868) = *(int *)(lVar4 + 0x2868) + 1;
    }
    if (*(longlong *)(lVar2 + 0x1ef8) != 0) {
      FUN_7ff70cb12b60(lVar9,*(longlong *)(lVar2 + 0x1ef8),(longlong)*(int *)(lVar2 + 0x1ef0) * 0x14
                      );
      lVar12 = _DAT_7ff70cc1a3c0;
      lVar4 = *(longlong *)(lVar2 + 0x1ef8);
      if ((lVar4 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar15 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar15 * 8) == *piVar1) {
          sVar10 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar15 * 8) + 1;
        }
        else {
          iVar14 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar14;
          lVar15 = (longlong)iVar14;
          *(int *)(lVar12 + 0x2874 + lVar15 * 8) = *piVar1;
          *(undefined4 *)(lVar12 + 0x2878 + lVar15 * 8) = 0;
          sVar10 = 1;
        }
        *(short *)(lVar12 + 0x287a + lVar15 * 8) = sVar10;
        *(int *)(lVar12 + 0x286c) = *(int *)(lVar12 + 0x286c) + 1;
      }
      (*_DAT_7ff70cbe9468)(lVar4,_DAT_7ff70cc1a3d0);
    }
    *(longlong *)(lVar2 + 0x1ef8) = lVar9;
    *(int *)(lVar2 + 0x1ef4) = iVar13;
    iVar14 = *(int *)(lVar2 + 0x1ef0);
  }
  else {
    lVar9 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1ef8);
  }
  *(int *)(lVar9 + (longlong)iVar14 * 0x14) = param_1;
  puVar3 = (undefined4 *)(lVar9 + 4 + (longlong)iVar14 * 0x14);
  *puVar3 = uStack_48;
  puVar3[1] = uStack_44;
  puVar3[2] = uStack_40;
  puVar3[3] = uStack_3c;
  *(int *)(lVar2 + 0x1ef0) = *(int *)(lVar2 + 0x1ef0) + 1;
  if (*(int *)(lVar2 + 0x1eec) != param_1) {
    lVar2 = lVar2 + (longlong)param_1 * 0x10;
    uVar6 = param_2[1];
    uVar7 = param_2[2];
    uVar8 = param_2[3];
    *(undefined4 *)(lVar2 + 0xd54) = *param_2;
    *(undefined4 *)(lVar2 + 0xd58) = uVar6;
    *(undefined4 *)(lVar2 + 0xd5c) = uVar7;
    *(undefined4 *)(lVar2 + 0xd60) = uVar8;
  }
  if (_DAT_7ff70cbebd80 == (uStack_38 ^ (ulonglong)auStack_68)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_38 ^ (ulonglong)auStack_68);
  pcVar5 = (code *)swi(3);
  (*pcVar5)();
  return;
}



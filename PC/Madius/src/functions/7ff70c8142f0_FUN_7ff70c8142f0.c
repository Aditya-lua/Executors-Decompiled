/* 7ff70c8142f0 FUN_7ff70c8142f0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8142f0(undefined4 *param_1)

{
  int *piVar1;
  undefined4 *puVar2;
  code *pcVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  undefined4 uVar9;
  undefined4 uVar10;
  undefined4 uVar11;
  undefined4 uVar12;
  undefined4 uVar13;
  undefined4 uVar14;
  undefined4 uVar15;
  undefined4 uVar16;
  undefined4 uVar17;
  undefined4 uVar18;
  longlong lVar19;
  longlong lVar20;
  longlong lVar21;
  short sVar22;
  int iVar23;
  longlong lVar24;
  int iVar25;
  int iVar26;
  longlong lVar27;
  undefined1 auStack_48 [32];
  ulonglong uStack_28;
  
  lVar19 = _DAT_7ff70cc1a3c0;
  uStack_28 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  iVar26 = *(int *)(_DAT_7ff70cc1a3c0 + 0x2688);
  if (iVar26 == *(int *)(_DAT_7ff70cc1a3c0 + 0x268c)) {
    if (iVar26 == 0) {
      iVar23 = 8;
    }
    else {
      iVar23 = iVar26 / 2 + iVar26;
    }
    iVar25 = iVar26 + 1;
    if (iVar26 + 1 < iVar23) {
      iVar25 = iVar23;
    }
    lVar20 = (*_DAT_7ff70cbe9460)((longlong)iVar25 * 0x48,_DAT_7ff70cc1a3d0);
    lVar21 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar24 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar24 * 8) == *piVar1) {
        sVar22 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar24 * 8) + 1;
      }
      else {
        iVar26 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar26;
        lVar24 = (longlong)iVar26;
        *(int *)(lVar21 + 0x2874 + lVar24 * 8) = *piVar1;
        *(undefined4 *)(lVar21 + 0x2878 + lVar24 * 8) = 0;
        sVar22 = 1;
      }
      *(short *)(lVar21 + 0x2878 + lVar24 * 8) = sVar22;
      *(int *)(lVar21 + 0x2868) = *(int *)(lVar21 + 0x2868) + 1;
    }
    if (*(longlong *)(lVar19 + 0x2690) != 0) {
      FUN_7ff70cb12b60(lVar20,*(longlong *)(lVar19 + 0x2690),
                       (longlong)*(int *)(lVar19 + 0x2688) * 0x48);
      lVar24 = _DAT_7ff70cc1a3c0;
      lVar21 = *(longlong *)(lVar19 + 0x2690);
      if ((lVar21 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar27 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar27 * 8) == *piVar1) {
          sVar22 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar27 * 8) + 1;
        }
        else {
          iVar26 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar26;
          lVar27 = (longlong)iVar26;
          *(int *)(lVar24 + 0x2874 + lVar27 * 8) = *piVar1;
          *(undefined4 *)(lVar24 + 0x2878 + lVar27 * 8) = 0;
          sVar22 = 1;
        }
        *(short *)(lVar24 + 0x287a + lVar27 * 8) = sVar22;
        *(int *)(lVar24 + 0x286c) = *(int *)(lVar24 + 0x286c) + 1;
      }
      (*_DAT_7ff70cbe9468)(lVar21,_DAT_7ff70cc1a3d0);
    }
    *(longlong *)(lVar19 + 0x2690) = lVar20;
    *(int *)(lVar19 + 0x268c) = iVar25;
    iVar26 = *(int *)(lVar19 + 0x2688);
  }
  else {
    lVar20 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x2690);
  }
  lVar21 = (longlong)iVar26;
  *(undefined8 *)(lVar20 + 0x40 + lVar21 * 0x48) = *(undefined8 *)(param_1 + 0x10);
  uVar4 = *param_1;
  uVar5 = param_1[1];
  uVar6 = param_1[2];
  uVar7 = param_1[3];
  uVar8 = param_1[4];
  uVar9 = param_1[5];
  uVar10 = param_1[6];
  uVar11 = param_1[7];
  uVar12 = param_1[8];
  uVar13 = param_1[9];
  uVar14 = param_1[10];
  uVar15 = param_1[0xb];
  uVar16 = param_1[0xd];
  uVar17 = param_1[0xe];
  uVar18 = param_1[0xf];
  puVar2 = (undefined4 *)(lVar20 + 0x30 + lVar21 * 0x48);
  *puVar2 = param_1[0xc];
  puVar2[1] = uVar16;
  puVar2[2] = uVar17;
  puVar2[3] = uVar18;
  puVar2 = (undefined4 *)(lVar20 + 0x20 + lVar21 * 0x48);
  *puVar2 = uVar12;
  puVar2[1] = uVar13;
  puVar2[2] = uVar14;
  puVar2[3] = uVar15;
  puVar2 = (undefined4 *)(lVar20 + 0x10 + lVar21 * 0x48);
  *puVar2 = uVar8;
  puVar2[1] = uVar9;
  puVar2[2] = uVar10;
  puVar2[3] = uVar11;
  puVar2 = (undefined4 *)(lVar20 + lVar21 * 0x48);
  *puVar2 = uVar4;
  puVar2[1] = uVar5;
  puVar2[2] = uVar6;
  puVar2[3] = uVar7;
  *(int *)(lVar19 + 0x2688) = *(int *)(lVar19 + 0x2688) + 1;
  if (_DAT_7ff70cbebd80 == (uStack_28 ^ (ulonglong)auStack_48)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_28 ^ (ulonglong)auStack_48);
  pcVar3 = (code *)swi(3);
  (*pcVar3)();
  return;
}



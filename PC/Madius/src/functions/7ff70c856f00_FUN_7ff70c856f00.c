/* 7ff70c856f00 FUN_7ff70c856f00 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c856f00(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int *piVar1;
  longlong lVar2;
  code *pcVar3;
  longlong lVar4;
  undefined8 uVar5;
  short sVar6;
  longlong lVar7;
  longlong lVar8;
  int iVar9;
  longlong lVar10;
  undefined8 uStackX_10;
  undefined8 uStackX_18;
  undefined8 uStackX_20;
  undefined1 auStack_58 [32];
  undefined8 *puStack_38;
  ulonglong uStack_30;
  
  lVar4 = _DAT_7ff70cc1a3c0;
  uStack_30 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_58;
  uStackX_10 = param_2;
  uStackX_18 = param_3;
  uStackX_20 = param_4;
  if (*(char *)(_DAT_7ff70cc1a3c0 + 0x2720) == '\x01') {
    lVar7 = _DAT_7ff70cc1a3c0 + 0x2738;
    puStack_38 = &uStackX_10;
    if (*(longlong *)(_DAT_7ff70cc1a3c0 + 0x2730) == 0) {
      FUN_7ff70c807540(lVar7,param_1);
    }
    else {
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x273c) < 0) {
        uVar5 = (*_DAT_7ff70cbe9460)(0,_DAT_7ff70cc1a3d0);
        lVar2 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar8 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar8 * 8) == *piVar1) {
            sVar6 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar8 * 8) + 1;
          }
          else {
            iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
            lVar8 = (longlong)iVar9;
            *(int *)(lVar2 + 0x2874 + lVar8 * 8) = *piVar1;
            *(undefined4 *)(lVar2 + 0x2878 + lVar8 * 8) = 0;
            sVar6 = 1;
          }
          *(short *)(lVar2 + 0x2878 + lVar8 * 8) = sVar6;
          *(int *)(lVar2 + 0x2868) = *(int *)(lVar2 + 0x2868) + 1;
        }
        if (*(longlong *)(lVar4 + 0x2740) != 0) {
          FUN_7ff70cb12b60(uVar5,*(longlong *)(lVar4 + 0x2740),(longlong)*(int *)(lVar4 + 0x2738));
          lVar8 = _DAT_7ff70cc1a3c0;
          lVar2 = *(longlong *)(lVar4 + 0x2740);
          if ((lVar2 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar10 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar10 * 8) == *piVar1) {
              sVar6 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar10 * 8) + 1;
            }
            else {
              iVar9 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar9;
              lVar10 = (longlong)iVar9;
              *(int *)(lVar8 + 0x2874 + lVar10 * 8) = *piVar1;
              *(undefined4 *)(lVar8 + 0x2878 + lVar10 * 8) = 0;
              sVar6 = 1;
            }
            *(short *)(lVar8 + 0x287a + lVar10 * 8) = sVar6;
            *(int *)(lVar8 + 0x286c) = *(int *)(lVar8 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar2,_DAT_7ff70cc1a3d0);
        }
        *(undefined8 *)(lVar4 + 0x2740) = uVar5;
        *(undefined4 *)(lVar4 + 0x273c) = 0;
      }
      *(undefined4 *)(lVar4 + 0x2738) = 0;
      FUN_7ff70c807540(lVar7,param_1,&uStackX_10);
      lVar7 = 0x7ff70cc1a3c8;
      if (*(longlong *)(lVar4 + 0x2740) != 0) {
        lVar7 = *(longlong *)(lVar4 + 0x2740);
      }
      (*_DAT_7ff70cb96448)
                (lVar7,1,(longlong)
                         (int)(*(int *)(lVar4 + 0x2738) + -1 + (uint)(*(int *)(lVar4 + 0x2738) == 0)
                              ),*(undefined8 *)(lVar4 + 0x2730));
    }
  }
  if (_DAT_7ff70cbebd80 == (uStack_30 ^ (ulonglong)auStack_58)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_30 ^ (ulonglong)auStack_58);
  pcVar3 = (code *)swi(3);
  (*pcVar3)();
  return;
}



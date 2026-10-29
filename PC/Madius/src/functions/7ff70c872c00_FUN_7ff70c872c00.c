/* 7ff70c872c00 FUN_7ff70c872c00 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c872c00(int *param_1)

{
  int *piVar1;
  longlong lVar2;
  short sVar3;
  longlong lVar4;
  longlong lVar5;
  int iVar6;
  longlong lVar7;
  longlong lVar8;
  
  iVar6 = *param_1;
  if (0 < iVar6) {
    lVar8 = 0;
    do {
      lVar2 = *(longlong *)(*(longlong *)(param_1 + 2) + lVar8 * 8);
      if (lVar2 != 0) {
        lVar7 = *(longlong *)(lVar2 + 0x48);
        if (lVar7 != 0) {
          FUN_7ff70c7b5a50(lVar7);
          lVar5 = _DAT_7ff70cc1a3c0;
          if (_DAT_7ff70cc1a3c0 != 0) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar4 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar4 * 8) == *piVar1) {
              sVar3 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar4 * 8) + 1;
            }
            else {
              iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
              lVar4 = (longlong)iVar6;
              *(int *)(lVar5 + 0x2874 + lVar4 * 8) = *piVar1;
              *(undefined4 *)(lVar5 + 0x2878 + lVar4 * 8) = 0;
              sVar3 = 1;
            }
            *(short *)(lVar5 + 0x287a + lVar4 * 8) = sVar3;
            *(int *)(lVar5 + 0x286c) = *(int *)(lVar5 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
        }
        lVar7 = *(longlong *)(lVar2 + 0x50);
        if (lVar7 != 0) {
          FUN_7ff70c7b5a50(lVar7);
          lVar5 = _DAT_7ff70cc1a3c0;
          if (_DAT_7ff70cc1a3c0 != 0) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar4 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar4 * 8) == *piVar1) {
              sVar3 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar4 * 8) + 1;
            }
            else {
              iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
              lVar4 = (longlong)iVar6;
              *(int *)(lVar5 + 0x2874 + lVar4 * 8) = *piVar1;
              *(undefined4 *)(lVar5 + 0x2878 + lVar4 * 8) = 0;
              sVar3 = 1;
            }
            *(short *)(lVar5 + 0x287a + lVar4 * 8) = sVar3;
            *(int *)(lVar5 + 0x286c) = *(int *)(lVar5 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
        }
        lVar5 = _DAT_7ff70cc1a3c0;
        lVar7 = *(longlong *)(lVar2 + 0xb8);
        if (lVar7 != 0) {
          if (_DAT_7ff70cc1a3c0 != 0) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar4 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar4 * 8) == *piVar1) {
              sVar3 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar4 * 8) + 1;
            }
            else {
              iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
              lVar4 = (longlong)iVar6;
              *(int *)(lVar5 + 0x2874 + lVar4 * 8) = *piVar1;
              *(undefined4 *)(lVar5 + 0x2878 + lVar4 * 8) = 0;
              sVar3 = 1;
            }
            *(short *)(lVar5 + 0x287a + lVar4 * 8) = sVar3;
            *(int *)(lVar5 + 0x286c) = *(int *)(lVar5 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
        }
        lVar5 = _DAT_7ff70cc1a3c0;
        lVar7 = *(longlong *)(lVar2 + 0x70);
        if (lVar7 != 0) {
          if (_DAT_7ff70cc1a3c0 != 0) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar4 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar4 * 8) == *piVar1) {
              sVar3 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar4 * 8) + 1;
            }
            else {
              iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
              lVar4 = (longlong)iVar6;
              *(int *)(lVar5 + 0x2874 + lVar4 * 8) = *piVar1;
              *(undefined4 *)(lVar5 + 0x2878 + lVar4 * 8) = 0;
              sVar3 = 1;
            }
            *(short *)(lVar5 + 0x287a + lVar4 * 8) = sVar3;
            *(int *)(lVar5 + 0x286c) = *(int *)(lVar5 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar7,_DAT_7ff70cc1a3d0);
        }
        lVar7 = _DAT_7ff70cc1a3c0;
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar5 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar5 * 8) == *piVar1) {
            sVar3 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar5 * 8) + 1;
          }
          else {
            iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
            lVar5 = (longlong)iVar6;
            *(int *)(lVar7 + 0x2874 + lVar5 * 8) = *piVar1;
            *(undefined4 *)(lVar7 + 0x2878 + lVar5 * 8) = 0;
            sVar3 = 1;
          }
          *(short *)(lVar7 + 0x287a + lVar5 * 8) = sVar3;
          *(int *)(lVar7 + 0x286c) = *(int *)(lVar7 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar2,_DAT_7ff70cc1a3d0);
        iVar6 = *param_1;
      }
      lVar8 = lVar8 + 1;
    } while (lVar8 < iVar6);
  }
  lVar8 = *(longlong *)(param_1 + 2);
  if (lVar8 != 0) {
    param_1[0] = 0;
    lVar2 = _DAT_7ff70cc1a3c0;
    param_1[1] = 0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar3 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar2 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar2 + 0x2878 + lVar7 * 8) = 0;
        sVar3 = 1;
      }
      *(short *)(lVar2 + 0x287a + lVar7 * 8) = sVar3;
      *(int *)(lVar2 + 0x286c) = *(int *)(lVar2 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar8,_DAT_7ff70cc1a3d0);
    param_1[2] = 0;
    param_1[3] = 0;
  }
  return;
}



/* 7ff70c8720f0 FUN_7ff70c8720f0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8720f0(undefined8 *param_1)

{
  int *piVar1;
  longlong lVar2;
  short sVar3;
  longlong lVar4;
  longlong lVar5;
  int iVar6;
  longlong lVar7;
  longlong lVar8;
  longlong lVar9;
  longlong lVar10;
  
  if (0 < *(int *)(param_1 + 2)) {
    lVar5 = 8;
    lVar4 = 0;
    do {
      lVar9 = _DAT_7ff70cc1a3c0;
      if ((longlong)*(int *)(param_1[3] + lVar5) != -1) {
        lVar8 = param_1[1];
        lVar10 = (longlong)*(int *)(param_1[3] + lVar5) * 0xa8;
        lVar2 = *(longlong *)(lVar8 + 0xa0 + lVar10);
        if (lVar2 != 0) {
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
              *(int *)(lVar9 + 0x2874 + lVar7 * 8) = *piVar1;
              *(undefined4 *)(lVar9 + 0x2878 + lVar7 * 8) = 0;
              sVar3 = 1;
            }
            *(short *)(lVar9 + 0x287a + lVar7 * 8) = sVar3;
            *(int *)(lVar9 + 0x286c) = *(int *)(lVar9 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar2,_DAT_7ff70cc1a3d0);
        }
        lVar2 = _DAT_7ff70cc1a3c0;
        lVar9 = *(longlong *)(lVar8 + lVar10 + 0x10);
        if (lVar9 != 0) {
          if (_DAT_7ff70cc1a3c0 != 0) {
            piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar8 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar8 * 8) == *piVar1) {
              sVar3 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar8 * 8) + 1;
            }
            else {
              iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
              lVar8 = (longlong)iVar6;
              *(int *)(lVar2 + 0x2874 + lVar8 * 8) = *piVar1;
              *(undefined4 *)(lVar2 + 0x2878 + lVar8 * 8) = 0;
              sVar3 = 1;
            }
            *(short *)(lVar2 + 0x287a + lVar8 * 8) = sVar3;
            *(int *)(lVar2 + 0x286c) = *(int *)(lVar2 + 0x286c) + 1;
          }
          (*_DAT_7ff70cbe9468)(lVar9,_DAT_7ff70cc1a3d0);
        }
      }
      lVar4 = lVar4 + 1;
      lVar5 = lVar5 + 0x10;
    } while (lVar4 < *(int *)(param_1 + 2));
  }
  lVar4 = param_1[3];
  if (lVar4 != 0) {
    param_1[2] = 0;
    lVar5 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar9 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar9 * 8) == *piVar1) {
        sVar3 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar9 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar9 = (longlong)iVar6;
        *(int *)(lVar5 + 0x2874 + lVar9 * 8) = *piVar1;
        *(undefined4 *)(lVar5 + 0x2878 + lVar9 * 8) = 0;
        sVar3 = 1;
      }
      *(short *)(lVar5 + 0x287a + lVar9 * 8) = sVar3;
      *(int *)(lVar5 + 0x286c) = *(int *)(lVar5 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar4,_DAT_7ff70cc1a3d0);
    param_1[3] = 0;
  }
  lVar4 = param_1[1];
  if (lVar4 == 0) {
    param_1[4] = 0;
  }
  else {
    *param_1 = 0;
    lVar5 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar9 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar9 * 8) == *piVar1) {
        sVar3 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar9 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar9 = (longlong)iVar6;
        *(int *)(lVar5 + 0x2874 + lVar9 * 8) = *piVar1;
        *(undefined4 *)(lVar5 + 0x2878 + lVar9 * 8) = 0;
        sVar3 = 1;
      }
      *(short *)(lVar5 + 0x287a + lVar9 * 8) = sVar3;
      *(int *)(lVar5 + 0x286c) = *(int *)(lVar5 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar4,_DAT_7ff70cc1a3d0);
    param_1[1] = 0;
    lVar4 = param_1[3];
    param_1[4] = 0;
    lVar5 = _DAT_7ff70cc1a3c0;
    if (lVar4 != 0) {
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar9 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar9 * 8) == *piVar1) {
          sVar3 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar9 * 8) + 1;
        }
        else {
          iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
          lVar9 = (longlong)iVar6;
          *(int *)(lVar5 + 0x2874 + lVar9 * 8) = *piVar1;
          *(undefined4 *)(lVar5 + 0x2878 + lVar9 * 8) = 0;
          sVar3 = 1;
        }
        *(short *)(lVar5 + 0x287a + lVar9 * 8) = sVar3;
        *(int *)(lVar5 + 0x286c) = *(int *)(lVar5 + 0x286c) + 1;
      }
      (*_DAT_7ff70cbe9468)(lVar4,_DAT_7ff70cc1a3d0);
      lVar5 = _DAT_7ff70cc1a3c0;
      lVar4 = param_1[1];
      if (lVar4 != 0) {
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar9 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar9 * 8) == *piVar1) {
            sVar3 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar9 * 8) + 1;
          }
          else {
            iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
            lVar9 = (longlong)iVar6;
            *(int *)(lVar5 + 0x2874 + lVar9 * 8) = *piVar1;
            *(undefined4 *)(lVar5 + 0x2878 + lVar9 * 8) = 0;
            sVar3 = 1;
          }
          *(short *)(lVar5 + 0x287a + lVar9 * 8) = sVar3;
          *(int *)(lVar5 + 0x286c) = *(int *)(lVar5 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar4,_DAT_7ff70cc1a3d0);
      }
    }
  }
  return;
}



/* 7ff70c873b00 FUN_7ff70c873b00 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c873b00(longlong param_1,undefined8 param_2,longlong param_3,ulonglong param_4)

{
  int *piVar1;
  ushort uVar2;
  longlong lVar3;
  longlong lVar4;
  short sVar5;
  int iVar6;
  longlong lVar7;
  
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x29b8);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      uVar2 = *(ushort *)(_DAT_7ff70cc1a3c0 + 0x2870);
      param_4 = (ulonglong)uVar2;
      param_3 = (longlong)(short)uVar2;
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + param_3 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + param_3 * 8) + 1;
      }
      else {
        param_4 = (ulonglong)(uint)((((short)uVar2 + 1) / 6) * 6);
        iVar6 = ((short)uVar2 + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        param_3 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + param_3 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + param_3 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + param_3 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0,param_3,param_4,0xfffffffffffffffe);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x2860);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x2848);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x27d0);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x27c0);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x2740);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x26c0);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x26b0);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x26a0);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x2690);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x2680);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x2668);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x25c8);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x25b8);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x24d0);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x24c0);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x24a0);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x2490);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  FUN_7ff70c88fef0(param_1 + 0x2408);
  lVar3 = *(longlong *)(param_1 + 0x23d0);
  if (lVar3 != 0) {
    *(undefined8 *)(param_1 + 0x23c8) = 0;
    lVar4 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
    *(undefined8 *)(param_1 + 0x23d0) = 0;
  }
  lVar3 = *(longlong *)(param_1 + 0x23c0);
  if (lVar3 == 0) {
    *(undefined8 *)(param_1 + 0x23d8) = 0;
  }
  else {
    *(undefined8 *)(param_1 + 0x23b8) = 0;
    lVar4 = _DAT_7ff70cc1a3c0;
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
    *(undefined8 *)(param_1 + 0x23c0) = 0;
    lVar3 = *(longlong *)(param_1 + 0x23d0);
    *(undefined8 *)(param_1 + 0x23d8) = 0;
    lVar4 = _DAT_7ff70cc1a3c0;
    if (lVar3 != 0) {
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
          sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
        }
        else {
          iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
          lVar7 = (longlong)iVar6;
          *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
          *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
          sVar5 = 1;
        }
        *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
        *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
      }
      (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
      lVar4 = _DAT_7ff70cc1a3c0;
      lVar3 = *(longlong *)(param_1 + 0x23c0);
      if (lVar3 != 0) {
        if (_DAT_7ff70cc1a3c0 != 0) {
          piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
            sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
          }
          else {
            iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
            lVar7 = (longlong)iVar6;
            *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
            *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
            sVar5 = 1;
          }
          *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
          *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
      }
    }
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x23b0);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 9000);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x2318);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  FUN_7ff70c8720f0(param_1 + 0x22e8);
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x22d8);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x22c8);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  FUN_7ff70c8730e0(param_1 + 0x2298);
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x22b0);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x22a0);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x2290);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x2270);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x2248);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x1fc0);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x1f88);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x1f78);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x1f68);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x1f58);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x1f48);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x1f38);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x1f28);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x1f18);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x1f08);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x1ef8);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x1dc8);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x1db8);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x1428);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x1418);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x1408);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x13f8);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x13e8);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x13d0);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x13c0);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  FUN_7ff70c7b55e0(param_1 + 0x1148);
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0x1118);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 0xc38);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  lVar4 = _DAT_7ff70cc1a3c0;
  lVar3 = *(longlong *)(param_1 + 3000);
  if (lVar3 != 0) {
    if (_DAT_7ff70cc1a3c0 != 0) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar7 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar7 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar7 * 8) + 1;
      }
      else {
        iVar6 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar6;
        lVar7 = (longlong)iVar6;
        *(int *)(lVar4 + 0x2874 + lVar7 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar7 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar7 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    (*_DAT_7ff70cbe9468)(lVar3,_DAT_7ff70cc1a3d0);
  }
  return;
}



/* 7ff70c8bdff0 FUN_7ff70c8bdff0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8bdff0(void)

{
  int *piVar1;
  longlong *plVar2;
  longlong lVar3;
  undefined8 *puVar4;
  code *pcVar5;
  ulonglong uVar6;
  longlong lVar7;
  longlong lVar8;
  short sVar9;
  longlong *plVar10;
  int iVar11;
  longlong lVar12;
  undefined1 auStack_88 [40];
  ulonglong uStack_60;
  
  uStack_60 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_88;
  lVar7 = FUN_7ff70c808680();
  if (lVar7 == 0) {
    plVar10 = (longlong *)0x0;
  }
  else {
    lVar7 = FUN_7ff70c8194a0();
    plVar10 = *(longlong **)(lVar7 + 0x98);
  }
  lVar7 = FUN_7ff70c8194a0();
  FUN_7ff70c808680();
  lVar8 = FUN_7ff70c8194a0();
  plVar2 = *(longlong **)(lVar8 + 0x98);
  if (*plVar2 != 0) {
    lVar8 = FUN_7ff70c819540();
    iVar11 = *(int *)(lVar8 + 0x50);
    if ((longlong)iVar11 != 0) {
      lVar8 = *(longlong *)(lVar8 + 0x58);
      lVar12 = 0;
      do {
        lVar3 = *(longlong *)(lVar8 + lVar12);
        if ((*(short *)(lVar3 + 0x54) == 1) &&
           (puVar4 = *(undefined8 **)(lVar3 + 8), puVar4 != (undefined8 *)0x0)) {
          (**(code **)(*(longlong *)puVar4[1] + 0x10))();
          (**(code **)(*(longlong *)*puVar4 + 0x10))();
          FUN_7ff70c802510(puVar4);
          *(undefined4 *)(lVar3 + 4) = 1;
          *(undefined8 *)(lVar3 + 8) = 0;
          *(undefined8 *)(lVar3 + 0x10) = 0;
        }
        lVar12 = lVar12 + 8;
      } while ((longlong)iVar11 * 8 != lVar12);
    }
    if ((longlong *)plVar2[9] != (longlong *)0x0) {
      (**(code **)(*(longlong *)plVar2[9] + 0x10))();
      plVar2[9] = 0;
    }
    if ((longlong *)plVar2[4] != (longlong *)0x0) {
      (**(code **)(*(longlong *)plVar2[4] + 0x10))();
      plVar2[4] = 0;
    }
    if ((longlong *)plVar2[3] != (longlong *)0x0) {
      (**(code **)(*(longlong *)plVar2[3] + 0x10))();
      plVar2[3] = 0;
    }
    if ((longlong *)plVar2[0xb] != (longlong *)0x0) {
      (**(code **)(*(longlong *)plVar2[0xb] + 0x10))();
      plVar2[0xb] = 0;
    }
    if ((longlong *)plVar2[0xc] != (longlong *)0x0) {
      (**(code **)(*(longlong *)plVar2[0xc] + 0x10))();
      plVar2[0xc] = 0;
    }
    if ((longlong *)plVar2[10] != (longlong *)0x0) {
      (**(code **)(*(longlong *)plVar2[10] + 0x10))();
      plVar2[10] = 0;
    }
    if ((longlong *)plVar2[8] != (longlong *)0x0) {
      (**(code **)(*(longlong *)plVar2[8] + 0x10))();
      plVar2[8] = 0;
    }
    if ((longlong *)plVar2[7] != (longlong *)0x0) {
      (**(code **)(*(longlong *)plVar2[7] + 0x10))();
      plVar2[7] = 0;
    }
    if ((longlong *)plVar2[6] != (longlong *)0x0) {
      (**(code **)(*(longlong *)plVar2[6] + 0x10))();
      plVar2[6] = 0;
    }
    if ((longlong *)plVar2[5] != (longlong *)0x0) {
      (**(code **)(*(longlong *)plVar2[5] + 0x10))();
      plVar2[5] = 0;
    }
  }
  if ((longlong *)plVar10[2] != (longlong *)0x0) {
    (**(code **)(*(longlong *)plVar10[2] + 0x10))();
  }
  if ((longlong *)*plVar10 != (longlong *)0x0) {
    (**(code **)(*(longlong *)*plVar10 + 0x10))();
  }
  if ((longlong *)plVar10[1] != (longlong *)0x0) {
    (**(code **)(*(longlong *)plVar10[1] + 0x10))();
  }
  *(undefined8 *)(lVar7 + 0x88) = 0;
  *(undefined8 *)(lVar7 + 0x98) = 0;
  *(byte *)(lVar7 + 4) = *(byte *)(lVar7 + 4) & 0xe7;
  lVar7 = _DAT_7ff70cc1a3c0;
  if (_DAT_7ff70cbebd80 == (uStack_60 ^ (ulonglong)auStack_88)) {
    uVar6 = _DAT_7ff70cbebd80 ^ (ulonglong)&stack0xffffffffffffffd8;
    if ((plVar10 != (longlong *)0x0) && (_DAT_7ff70cc1a3c0 != 0)) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar8 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar8 * 8) == *piVar1) {
        sVar9 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar8 * 8) + 1;
      }
      else {
        iVar11 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar11;
        lVar8 = (longlong)iVar11;
        *(int *)(lVar7 + 0x2874 + lVar8 * 8) = *piVar1;
        *(undefined4 *)(lVar7 + 0x2878 + lVar8 * 8) = 0;
        sVar9 = 1;
      }
      *(short *)(lVar7 + 0x287a + lVar8 * 8) = sVar9;
      *(int *)(lVar7 + 0x286c) = *(int *)(lVar7 + 0x286c) + 1;
    }
    if (_DAT_7ff70cbebd80 == (uVar6 ^ (ulonglong)&stack0xffffffffffffffd8)) {
                    /* WARNING: Could not recover jumptable at 0x7ff70c8025da. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*_DAT_7ff70cbe9468)();
      return;
    }
    FUN_7ff70caa97e0(uVar6 ^ (ulonglong)&stack0xffffffffffffffd8,_DAT_7ff70cc1a3d0);
    pcVar5 = (code *)swi(3);
    (*pcVar5)();
    return;
  }
  FUN_7ff70caa97e0(uStack_60 ^ (ulonglong)auStack_88);
  pcVar5 = (code *)swi(3);
  (*pcVar5)();
  return;
}



/* 7ff70c8be5f0 FUN_7ff70c8be5f0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8be5f0(void)

{
  int *piVar1;
  code *pcVar2;
  longlong lVar3;
  longlong lVar4;
  short sVar5;
  longlong *plVar6;
  int iVar7;
  longlong lStack_40;
  undefined1 auStack_38 [32];
  ulonglong uStack_18;
  
  plVar6 = (longlong *)auStack_38;
  uStack_18 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_38;
  lStack_40 = 0x7ff70c8be60a;
  lVar3 = FUN_7ff70c808680();
  if (lVar3 == 0) {
    lVar3 = 0;
  }
  else {
    lStack_40 = 0x7ff70c8be614;
    lVar3 = FUN_7ff70c8194a0();
    lVar3 = *(longlong *)(lVar3 + 0x90);
  }
  lStack_40 = 0x7ff70c8be624;
  lVar4 = FUN_7ff70c8194a0();
  if (*(longlong *)(lVar3 + 0x38) != 0) {
    plVar6 = &lStack_40;
    lStack_40 = lVar4;
    func_0x7ff70d6abb6a();
  }
  *(undefined8 *)(lVar4 + 0x80) = 0;
  *(undefined8 *)(lVar4 + 0x90) = 0;
  *(byte *)(lVar4 + 4) = *(byte *)(lVar4 + 4) & 0xf8;
  lVar4 = _DAT_7ff70cc1a3c0;
  if (_DAT_7ff70cbebd80 == (*(ulonglong *)((longlong)plVar6 + 0x20) ^ (ulonglong)plVar6)) {
    *(ulonglong *)((longlong)plVar6 + 0x30) =
         _DAT_7ff70cbebd80 ^ (ulonglong)((longlong)plVar6 + 0x10);
    if ((lVar3 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
      lVar3 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar3 * 8) == *piVar1) {
        sVar5 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar3 * 8) + 1;
      }
      else {
        iVar7 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar7;
        lVar3 = (longlong)iVar7;
        *(int *)(lVar4 + 0x2874 + lVar3 * 8) = *piVar1;
        *(undefined4 *)(lVar4 + 0x2878 + lVar3 * 8) = 0;
        sVar5 = 1;
      }
      *(short *)(lVar4 + 0x287a + lVar3 * 8) = sVar5;
      *(int *)(lVar4 + 0x286c) = *(int *)(lVar4 + 0x286c) + 1;
    }
    if (_DAT_7ff70cbebd80 ==
        (*(ulonglong *)((longlong)plVar6 + 0x30) ^ (ulonglong)((longlong)plVar6 + 0x10))) {
                    /* WARNING: Could not recover jumptable at 0x7ff70c8025da. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*_DAT_7ff70cbe9468)();
      return;
    }
    *(undefined8 *)((longlong)plVar6 + 8) = 0x7ff70c8025ea;
    FUN_7ff70caa97e0(*(ulonglong *)((longlong)plVar6 + 0x30) ^ (ulonglong)((longlong)plVar6 + 0x10),
                     _DAT_7ff70cc1a3d0);
    pcVar2 = (code *)swi(3);
    (*pcVar2)();
    return;
  }
  *(undefined8 *)((longlong)plVar6 + -8) = 0x7ff70c8be67f;
  FUN_7ff70caa97e0(*(ulonglong *)((longlong)plVar6 + 0x20) ^ (ulonglong)plVar6);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}



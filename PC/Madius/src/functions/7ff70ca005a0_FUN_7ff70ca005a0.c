/* 7ff70ca005a0 FUN_7ff70ca005a0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong *
FUN_7ff70ca005a0(longlong *param_1,ulonglong param_2,undefined8 param_3,undefined8 param_4)

{
  longlong lVar1;
  ulonglong uVar2;
  code *pcVar3;
  longlong *plVar4;
  longlong lVar5;
  ulonglong uVar6;
  longlong *plVar7;
  longlong lStack_70;
  longlong lStack_68;
  undefined *puStack_60;
  undefined8 uStack_58;
  undefined *puStack_50;
  undefined *puStack_48;
  undefined8 uStack_40;
  
  if (-1 < (longlong)param_2) {
    uVar2 = param_1[3];
    uVar6 = 0x7fffffffffffffff;
    if ((uVar2 >> 1 ^ 0x7fffffffffffffff) < uVar2) {
LAB_7ff70ca00607:
      lVar1 = uVar6 + 0x28;
      lStack_68 = uVar6 + 0x38;
      lStack_70 = lVar1;
      plVar4 = (longlong *)(*_DAT_7ff70cb96730)();
      if (plVar4 == (longlong *)0x0) goto LAB_7ff70ca00711;
      *plVar4 = lVar1;
      *(undefined1 *)(plVar4 + 1) = 1;
      LOCK();
      _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + lVar1;
      UNLOCK();
      LOCK();
      _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + lStack_70;
      UNLOCK();
      plVar7 = (longlong *)((longlong)plVar4 + 0x37U & 0xffffffffffffffe0);
      plVar7[-1] = (longlong)(plVar4 + 2);
    }
    else {
      uVar6 = (uVar2 >> 1) + uVar2;
      if (uVar6 < (param_2 | 0xf)) {
        uVar6 = param_2 | 0xf;
      }
      if (0xffe < uVar6) {
        if (uVar6 < 0xffffffffffffffd8) goto LAB_7ff70ca00607;
        goto LAB_7ff70ca00773;
      }
      lVar1 = uVar6 + 1;
      lStack_68 = uVar6 + 0x11;
      lStack_70 = lVar1;
      plVar7 = (longlong *)(*_DAT_7ff70cb96730)();
      if (plVar7 == (longlong *)0x0) goto LAB_7ff70ca00711;
      *plVar7 = lVar1;
      *(undefined1 *)(plVar7 + 1) = 1;
      LOCK();
      _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + lVar1;
      UNLOCK();
      LOCK();
      _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + lStack_70;
      UNLOCK();
      plVar7 = plVar7 + 2;
    }
    param_1[2] = param_2;
    param_1[3] = uVar6;
    FUN_7ff70cb12b60(plVar7,param_4,param_2);
    *(undefined1 *)((longlong)plVar7 + param_2) = 0;
    if (0xf < uVar2) {
      lVar1 = *param_1;
      uVar6 = uVar2 + 1;
      lVar5 = lVar1;
      if (0xfff < uVar6) {
        lVar5 = *(longlong *)(lVar1 + -8);
        if (0x1f < (ulonglong)((lVar1 + -8) - lVar5)) goto LAB_7ff70ca00778;
        uVar6 = uVar2 + 0x28;
      }
      thunk_FUN_7ff70ca90250(lVar5,uVar6);
    }
    *param_1 = (longlong)plVar7;
    return param_1;
  }
  FUN_7ff70ca00780();
LAB_7ff70ca00711:
  puStack_60 = &UNK_7ff70cb868f0;
  uStack_58 = 0x6e;
  FUN_7ff70ca90020(0x7ff70cc1b2a0,&puStack_60,&lStack_68,&lStack_70);
  uStack_40 = 0;
  puStack_48 = &UNK_7ff70cb846bb;
  puStack_50 = &UNK_7ff70cb740b8;
  FUN_7ff70cb12a50(&puStack_50,&UNK_7ff70cbe4470);
LAB_7ff70ca00773:
  FUN_7ff70ca007a0();
LAB_7ff70ca00778:
                    /* WARNING: Does not return */
  pcVar3 = (code *)invalidInstructionException();
  (*pcVar3)();
}



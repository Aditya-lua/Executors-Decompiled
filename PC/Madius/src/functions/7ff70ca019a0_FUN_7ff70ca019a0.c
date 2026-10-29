/* 7ff70ca019a0 FUN_7ff70ca019a0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong *
FUN_7ff70ca019a0(longlong *param_1,ulonglong param_2,undefined8 param_3,undefined8 param_4)

{
  ulonglong uVar1;
  longlong lVar2;
  code *pcVar3;
  ulonglong uVar4;
  longlong *plVar5;
  longlong lVar6;
  ulonglong uVar7;
  longlong *plVar8;
  longlong lStack_78;
  longlong lStack_70;
  undefined *puStack_68;
  undefined8 uStack_60;
  undefined *puStack_58;
  undefined *puStack_50;
  undefined8 uStack_48;
  
  if (param_2 < 0x7fffffffffffffff) {
    uVar4 = param_2 | 7;
    if (0x7ffffffffffffffe < uVar4) {
LAB_7ff70ca01b3c:
      FUN_7ff70ca007a0();
      goto LAB_7ff70ca01b41;
    }
    uVar1 = param_1[3];
    if (0x7ffffffffffffffe - (uVar1 >> 1) < uVar1) goto LAB_7ff70ca01b3c;
    uVar7 = (uVar1 >> 1) + uVar1;
    if (uVar7 < uVar4) {
      uVar7 = uVar4;
    }
    uVar4 = uVar7 + 1;
    if ((longlong)uVar4 < 0) goto LAB_7ff70ca01b3c;
    lVar2 = uVar4 * 2;
    if (0x7ff < uVar4) {
      if (0x7fffffffffffffec < uVar4) goto LAB_7ff70ca01b3c;
      lVar6 = lVar2 + 0x27;
      lStack_70 = lVar2 + 0x37;
      lStack_78 = lVar6;
      plVar5 = (longlong *)(*_DAT_7ff70cb96730)(lStack_70);
      if (plVar5 == (longlong *)0x0) goto LAB_7ff70ca01b46;
      *plVar5 = lVar6;
      *(undefined1 *)(plVar5 + 1) = 1;
      LOCK();
      _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + lVar6;
      UNLOCK();
      LOCK();
      _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + lStack_78;
      UNLOCK();
      plVar8 = (longlong *)((longlong)plVar5 + 0x37U & 0xffffffffffffffe0);
      plVar8[-1] = (longlong)(plVar5 + 2);
LAB_7ff70ca01ac6:
      param_1[2] = param_2;
      param_1[3] = uVar7;
      FUN_7ff70cb12b60(plVar8,param_4,param_2 * 2);
      *(undefined2 *)((longlong)plVar8 + param_2 * 2) = 0;
      if (7 < uVar1) {
        lVar2 = *param_1;
        uVar4 = uVar1 * 2 + 2;
        lVar6 = lVar2;
        if (0xfff < uVar4) {
          lVar6 = *(longlong *)(lVar2 + -8);
          if (0x1f < (ulonglong)((lVar2 + -8) - lVar6)) goto LAB_7ff70ca01ba8;
          uVar4 = uVar1 * 2 + 0x29;
        }
        thunk_FUN_7ff70ca90250(lVar6,uVar4);
      }
      *param_1 = (longlong)plVar8;
      return param_1;
    }
    lStack_70 = lVar2 + 0x10;
    lStack_78 = lVar2;
    plVar8 = (longlong *)(*_DAT_7ff70cb96730)();
    if (plVar8 != (longlong *)0x0) {
      *plVar8 = lVar2;
      *(undefined1 *)(plVar8 + 1) = 1;
      LOCK();
      _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + lVar2;
      UNLOCK();
      LOCK();
      _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + lStack_78;
      UNLOCK();
      plVar8 = plVar8 + 2;
      goto LAB_7ff70ca01ac6;
    }
  }
  else {
LAB_7ff70ca01b41:
    FUN_7ff70ca00780();
  }
LAB_7ff70ca01b46:
  puStack_68 = &UNK_7ff70cb868f0;
  uStack_60 = 0x6e;
  FUN_7ff70ca90020(0x7ff70cc1b2a0,&puStack_68,&lStack_70,&lStack_78);
  uStack_48 = 0;
  puStack_50 = &UNK_7ff70cb846bb;
  puStack_58 = &UNK_7ff70cb740b8;
  FUN_7ff70cb12a50(&puStack_58,&UNK_7ff70cbe4470);
LAB_7ff70ca01ba8:
                    /* WARNING: Does not return */
  pcVar3 = (code *)invalidInstructionException();
  (*pcVar3)();
}



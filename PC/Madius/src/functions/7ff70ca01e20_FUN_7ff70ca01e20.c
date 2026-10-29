/* 7ff70ca01e20 FUN_7ff70ca01e20 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong *
FUN_7ff70ca01e20(longlong *param_1,ulonglong param_2,undefined8 param_3,undefined8 param_4,
                longlong param_5)

{
  longlong lVar1;
  ulonglong uVar2;
  longlong lVar3;
  code *pcVar4;
  longlong *plVar5;
  ulonglong uVar6;
  longlong *plVar7;
  ulonglong uVar8;
  longlong lVar9;
  longlong lStack_80;
  longlong lStack_78;
  undefined8 uStack_70;
  undefined *puStack_68;
  undefined8 uStack_60;
  undefined *puStack_58;
  undefined *puStack_50;
  undefined8 uStack_48;
  
  lVar9 = param_1[2];
  if (0x7ffffffffffffffeU - lVar9 < param_2) {
LAB_7ff70ca02021:
    FUN_7ff70ca00780();
  }
  else {
    uVar6 = param_2 + lVar9 | 7;
    if (0x7ffffffffffffffe < uVar6) {
LAB_7ff70ca0201c:
      FUN_7ff70ca007a0();
      goto LAB_7ff70ca02021;
    }
    uVar2 = param_1[3];
    if (0x7ffffffffffffffe - (uVar2 >> 1) < uVar2) goto LAB_7ff70ca0201c;
    uVar8 = (uVar2 >> 1) + uVar2;
    if (uVar8 < uVar6) {
      uVar8 = uVar6;
    }
    uVar6 = uVar8 + 1;
    if ((longlong)uVar6 < 0) goto LAB_7ff70ca0201c;
    uStack_70 = param_4;
    if (uVar6 == 0) {
      plVar7 = (longlong *)0x0;
LAB_7ff70ca01f51:
      param_1[2] = param_2 + lVar9;
      param_1[3] = uVar8;
      if (uVar2 < 8) {
        FUN_7ff70cb12b60(plVar7,param_1,lVar9 * 2);
        lVar9 = (longlong)plVar7 + lVar9 * 2;
        FUN_7ff70cb12b60(lVar9,uStack_70,param_5 * 2);
        *(undefined2 *)(lVar9 + param_5 * 2) = 0;
      }
      else {
        lVar3 = *param_1;
        FUN_7ff70cb12b60(plVar7,lVar3,lVar9 * 2);
        lVar9 = (longlong)plVar7 + lVar9 * 2;
        FUN_7ff70cb12b60(lVar9,uStack_70,param_5 * 2);
        *(undefined2 *)(lVar9 + param_5 * 2) = 0;
        uVar6 = uVar2 * 2 + 2;
        lVar9 = lVar3;
        if (0xfff < uVar6) {
          lVar9 = *(longlong *)(lVar3 + -8);
          if (0x1f < (ulonglong)((lVar3 + -8) - lVar9)) goto LAB_7ff70ca02088;
          uVar6 = uVar2 * 2 + 0x29;
        }
        thunk_FUN_7ff70ca90250(lVar9,uVar6);
      }
      *param_1 = (longlong)plVar7;
      return param_1;
    }
    lVar3 = uVar6 * 2;
    if (0x7ff < uVar6) {
      if (0x7fffffffffffffec < uVar6) goto LAB_7ff70ca0201c;
      lVar1 = lVar3 + 0x27;
      lStack_78 = lVar3 + 0x37;
      lStack_80 = lVar1;
      plVar5 = (longlong *)(*_DAT_7ff70cb96730)(lStack_78);
      if (plVar5 == (longlong *)0x0) goto LAB_7ff70ca02026;
      *plVar5 = lVar1;
      *(undefined1 *)(plVar5 + 1) = 1;
      LOCK();
      _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + lVar1;
      UNLOCK();
      LOCK();
      _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + lStack_80;
      UNLOCK();
      plVar7 = (longlong *)((longlong)plVar5 + 0x37U & 0xffffffffffffffe0);
      plVar7[-1] = (longlong)(plVar5 + 2);
      goto LAB_7ff70ca01f51;
    }
    lStack_78 = lVar3 + 0x10;
    lStack_80 = lVar3;
    plVar7 = (longlong *)(*_DAT_7ff70cb96730)();
    if (plVar7 != (longlong *)0x0) {
      *plVar7 = lVar3;
      *(undefined1 *)(plVar7 + 1) = 1;
      LOCK();
      _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + lVar3;
      UNLOCK();
      LOCK();
      _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + lStack_80;
      UNLOCK();
      plVar7 = plVar7 + 2;
      goto LAB_7ff70ca01f51;
    }
  }
LAB_7ff70ca02026:
  puStack_68 = &UNK_7ff70cb868f0;
  uStack_60 = 0x6e;
  FUN_7ff70ca90020(0x7ff70cc1b2a0,&puStack_68,&lStack_78,&lStack_80);
  uStack_48 = 0;
  puStack_50 = &UNK_7ff70cb846bb;
  puStack_58 = &UNK_7ff70cb740b8;
  FUN_7ff70cb12a50(&puStack_58,&UNK_7ff70cbe4470);
LAB_7ff70ca02088:
                    /* WARNING: Does not return */
  pcVar4 = (code *)invalidInstructionException();
  (*pcVar4)();
}



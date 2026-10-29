/* 7ff70ca01bd0 FUN_7ff70ca01bd0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong *
FUN_7ff70ca01bd0(longlong *param_1,ulonglong param_2,undefined8 param_3,undefined2 param_4)

{
  longlong lVar1;
  ulonglong uVar2;
  longlong lVar3;
  code *pcVar4;
  longlong *plVar5;
  ulonglong uVar6;
  longlong lVar7;
  ulonglong uVar8;
  longlong *plVar9;
  longlong lStack_78;
  longlong lStack_70;
  undefined *puStack_68;
  undefined8 uStack_60;
  undefined *puStack_58;
  undefined *puStack_50;
  undefined8 uStack_48;
  
  lVar7 = param_1[2];
  if (0x7ffffffffffffffeU - lVar7 < param_2) {
LAB_7ff70ca01dac:
    FUN_7ff70ca00780();
  }
  else {
    uVar6 = param_2 + lVar7 | 7;
    if (0x7ffffffffffffffe < uVar6) {
LAB_7ff70ca01da7:
      FUN_7ff70ca007a0();
      goto LAB_7ff70ca01dac;
    }
    uVar2 = param_1[3];
    if (0x7ffffffffffffffe - (uVar2 >> 1) < uVar2) goto LAB_7ff70ca01da7;
    uVar8 = (uVar2 >> 1) + uVar2;
    if (uVar8 < uVar6) {
      uVar8 = uVar6;
    }
    uVar6 = uVar8 + 1;
    if ((longlong)uVar6 < 0) goto LAB_7ff70ca01da7;
    if (uVar6 == 0) {
      plVar9 = (longlong *)0x0;
LAB_7ff70ca01d0a:
      param_1[2] = param_2 + lVar7;
      param_1[3] = uVar8;
      if (uVar2 < 8) {
        FUN_7ff70cb12b60(plVar9,param_1,lVar7 * 2);
        *(undefined2 *)((longlong)plVar9 + lVar7 * 2) = param_4;
        *(undefined2 *)((longlong)plVar9 + lVar7 * 2 + 2) = 0;
      }
      else {
        lVar3 = *param_1;
        FUN_7ff70cb12b60(plVar9,lVar3,lVar7 * 2);
        *(undefined2 *)((longlong)plVar9 + lVar7 * 2) = param_4;
        *(undefined2 *)((longlong)plVar9 + lVar7 * 2 + 2) = 0;
        uVar6 = uVar2 * 2 + 2;
        lVar7 = lVar3;
        if (0xfff < uVar6) {
          lVar7 = *(longlong *)(lVar3 + -8);
          if (0x1f < (ulonglong)((lVar3 + -8) - lVar7)) goto LAB_7ff70ca01e13;
          uVar6 = uVar2 * 2 + 0x29;
        }
        thunk_FUN_7ff70ca90250(lVar7,uVar6);
      }
      *param_1 = (longlong)plVar9;
      return param_1;
    }
    lVar3 = uVar6 * 2;
    if (0x7ff < uVar6) {
      if (0x7fffffffffffffec < uVar6) goto LAB_7ff70ca01da7;
      lVar1 = lVar3 + 0x27;
      lStack_70 = lVar3 + 0x37;
      lStack_78 = lVar1;
      plVar5 = (longlong *)(*_DAT_7ff70cb96730)(lStack_70);
      if (plVar5 == (longlong *)0x0) goto LAB_7ff70ca01db1;
      *plVar5 = lVar1;
      *(undefined1 *)(plVar5 + 1) = 1;
      LOCK();
      _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + lVar1;
      UNLOCK();
      LOCK();
      _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + lStack_78;
      UNLOCK();
      plVar9 = (longlong *)((longlong)plVar5 + 0x37U & 0xffffffffffffffe0);
      plVar9[-1] = (longlong)(plVar5 + 2);
      goto LAB_7ff70ca01d0a;
    }
    lStack_70 = lVar3 + 0x10;
    lStack_78 = lVar3;
    plVar9 = (longlong *)(*_DAT_7ff70cb96730)();
    if (plVar9 != (longlong *)0x0) {
      *plVar9 = lVar3;
      *(undefined1 *)(plVar9 + 1) = 1;
      LOCK();
      _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + lVar3;
      UNLOCK();
      LOCK();
      _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + lStack_78;
      UNLOCK();
      plVar9 = plVar9 + 2;
      goto LAB_7ff70ca01d0a;
    }
  }
LAB_7ff70ca01db1:
  puStack_68 = &UNK_7ff70cb868f0;
  uStack_60 = 0x6e;
  FUN_7ff70ca90020(0x7ff70cc1b2a0,&puStack_68,&lStack_70,&lStack_78);
  uStack_48 = 0;
  puStack_50 = &UNK_7ff70cb846bb;
  puStack_58 = &UNK_7ff70cb740b8;
  FUN_7ff70cb12a50(&puStack_58,&UNK_7ff70cbe4470);
LAB_7ff70ca01e13:
                    /* WARNING: Does not return */
  pcVar4 = (code *)invalidInstructionException();
  (*pcVar4)();
}



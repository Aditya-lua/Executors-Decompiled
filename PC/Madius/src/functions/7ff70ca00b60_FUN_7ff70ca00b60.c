/* 7ff70ca00b60 FUN_7ff70ca00b60 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong *
FUN_7ff70ca00b60(longlong *param_1,ulonglong param_2,undefined8 param_3,undefined8 param_4,
                longlong param_5)

{
  ulonglong uVar1;
  longlong lVar2;
  code *pcVar3;
  ulonglong *puVar4;
  ulonglong uVar5;
  ulonglong uVar6;
  ulonglong uVar7;
  ulonglong *puVar8;
  longlong lVar9;
  ulonglong uStack_78;
  longlong lStack_70;
  undefined *puStack_68;
  undefined8 uStack_60;
  undefined *puStack_58;
  undefined *puStack_50;
  undefined8 uStack_48;
  
  uVar7 = param_1[2];
  uVar5 = 0x7fffffffffffffff;
  if (param_2 <= (uVar7 ^ 0x7fffffffffffffff)) {
    param_2 = param_2 + uVar7;
    uVar1 = param_1[3];
    if (((longlong)param_2 < 0) || ((uVar1 >> 1 ^ 0x7fffffffffffffff) < uVar1)) {
LAB_7ff70ca00bb4:
      uVar6 = uVar5 + 0x28;
      lStack_70 = uVar5 + 0x38;
      uStack_78 = uVar6;
      puVar4 = (ulonglong *)(*_DAT_7ff70cb96730)();
      if (puVar4 == (ulonglong *)0x0) goto LAB_7ff70ca00d3b;
      *puVar4 = uVar6;
      *(undefined1 *)(puVar4 + 1) = 1;
      LOCK();
      _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + uVar6;
      UNLOCK();
      LOCK();
      _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + uStack_78;
      UNLOCK();
      puVar8 = (ulonglong *)((longlong)puVar4 + 0x37U & 0xffffffffffffffe0);
      puVar8[-1] = (ulonglong)(puVar4 + 2);
    }
    else {
      uVar5 = (uVar1 >> 1) + uVar1;
      if (uVar5 < (param_2 | 0xf)) {
        uVar5 = param_2 | 0xf;
      }
      uVar6 = uVar5 + 1;
      if (uVar6 == 0) {
        puVar8 = (ulonglong *)0x0;
        uVar5 = 0xffffffffffffffff;
      }
      else {
        if (0xfff < uVar6) {
          if (uVar6 < 0xffffffffffffffd9) goto LAB_7ff70ca00bb4;
          FUN_7ff70ca007a0();
        }
        lStack_70 = uVar5 + 0x11;
        uStack_78 = uVar6;
        puVar8 = (ulonglong *)(*_DAT_7ff70cb96730)();
        if (puVar8 == (ulonglong *)0x0) goto LAB_7ff70ca00d3b;
        *puVar8 = uVar6;
        *(undefined1 *)(puVar8 + 1) = 1;
        LOCK();
        _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + uVar6;
        UNLOCK();
        LOCK();
        _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + uStack_78;
        UNLOCK();
        puVar8 = puVar8 + 2;
      }
    }
    param_1[2] = param_2;
    param_1[3] = uVar5;
    if (uVar1 < 0x10) {
      FUN_7ff70cb12b60(puVar8,param_1,uVar7);
      FUN_7ff70cb12b60(uVar7 + (longlong)puVar8,param_4,param_5);
      *(undefined1 *)(param_5 + uVar7 + (longlong)puVar8) = 0;
    }
    else {
      lVar2 = *param_1;
      FUN_7ff70cb12b60(puVar8,lVar2,uVar7);
      FUN_7ff70cb12b60(uVar7 + (longlong)puVar8,param_4,param_5);
      *(undefined1 *)(param_5 + uVar7 + (longlong)puVar8) = 0;
      uVar7 = uVar1 + 1;
      lVar9 = lVar2;
      if (0xfff < uVar7) {
        lVar9 = *(longlong *)(lVar2 + -8);
        if (0x1f < (ulonglong)((lVar2 + -8) - lVar9)) goto LAB_7ff70ca00d9d;
        uVar7 = uVar1 + 0x28;
      }
      thunk_FUN_7ff70ca90250(lVar9,uVar7);
    }
    *param_1 = (longlong)puVar8;
    return param_1;
  }
  FUN_7ff70ca00780();
LAB_7ff70ca00d3b:
  puStack_68 = &UNK_7ff70cb868f0;
  uStack_60 = 0x6e;
  FUN_7ff70ca90020(0x7ff70cc1b2a0,&puStack_68,&lStack_70,&uStack_78);
  uStack_48 = 0;
  puStack_50 = &UNK_7ff70cb846bb;
  puStack_58 = &UNK_7ff70cb740b8;
  FUN_7ff70cb12a50(&puStack_58,&UNK_7ff70cbe4470);
LAB_7ff70ca00d9d:
                    /* WARNING: Does not return */
  pcVar3 = (code *)invalidInstructionException();
  (*pcVar3)();
}



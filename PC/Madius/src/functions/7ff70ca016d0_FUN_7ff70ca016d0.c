/* 7ff70ca016d0 FUN_7ff70ca016d0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_7ff70ca016d0(undefined8 *param_1,undefined8 *param_2)

{
  longlong lVar1;
  ulonglong uVar2;
  code *pcVar3;
  longlong lVar4;
  undefined8 uVar5;
  ulonglong uVar6;
  longlong *plVar7;
  longlong *plVar8;
  undefined8 *puVar9;
  ulonglong uVar10;
  longlong lStack_60;
  longlong lStack_58;
  undefined *puStack_50;
  undefined8 uStack_48;
  undefined *puStack_40;
  undefined *puStack_38;
  undefined8 uStack_30;
  
  param_1[2] = 0;
  param_1[3] = 0;
  *param_1 = 0;
  param_1[1] = 0;
  uVar2 = param_2[2];
  if (7 < (ulonglong)param_2[3]) {
    param_2 = (undefined8 *)*param_2;
  }
  if (uVar2 < 0x7fffffffffffffff) {
    if (uVar2 < 8) {
      param_1[2] = uVar2;
      param_1[3] = 7;
      uVar5 = param_2[1];
      *param_1 = *param_2;
      param_1[1] = uVar5;
      return param_1;
    }
    uVar6 = uVar2 | 7;
    if (uVar6 < 0x7fffffffffffffff) {
      uVar10 = 10;
      if (10 < uVar6) {
        uVar10 = uVar6;
      }
      lVar4 = uVar10 * 2;
      if (uVar6 < 0x7ff) {
        lVar1 = lVar4 + 2;
        lStack_58 = lVar4 + 0x12;
        lStack_60 = lVar1;
        plVar8 = (longlong *)(*_DAT_7ff70cb96730)();
        if (plVar8 != (longlong *)0x0) {
          *plVar8 = lVar1;
          *(undefined1 *)(plVar8 + 1) = 1;
          LOCK();
          _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + lVar1;
          UNLOCK();
          LOCK();
          _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + lStack_60;
          UNLOCK();
          plVar8 = plVar8 + 2;
LAB_7ff70ca017fe:
          *param_1 = plVar8;
          param_1[2] = uVar2;
          param_1[3] = uVar10;
          FUN_7ff70cb12b60(plVar8,param_2,uVar2 * 2 + 2);
          return param_1;
        }
        goto LAB_7ff70ca01835;
      }
      if (uVar6 < 0x7fffffffffffffec) {
        lVar1 = lVar4 + 0x29;
        lStack_58 = lVar4 + 0x39;
        lStack_60 = lVar1;
        plVar7 = (longlong *)(*_DAT_7ff70cb96730)();
        if (plVar7 != (longlong *)0x0) {
          *plVar7 = lVar1;
          *(undefined1 *)(plVar7 + 1) = 1;
          LOCK();
          _DAT_7ff70cc1b490 = _DAT_7ff70cc1b490 + lVar1;
          UNLOCK();
          LOCK();
          _DAT_7ff70cc1b448 = _DAT_7ff70cc1b448 + lStack_60;
          UNLOCK();
          plVar8 = (longlong *)((longlong)plVar7 + 0x37U & 0xffffffffffffffe0);
          plVar8[-1] = (longlong)(plVar7 + 2);
          goto LAB_7ff70ca017fe;
        }
        goto LAB_7ff70ca01835;
      }
    }
  }
  else {
    FUN_7ff70ca00780();
  }
  FUN_7ff70ca007a0();
LAB_7ff70ca01835:
  puStack_50 = &UNK_7ff70cb868f0;
  uStack_48 = 0x6e;
  FUN_7ff70ca90020(0x7ff70cc1b2a0,&puStack_50,&lStack_58,&lStack_60);
  uStack_30 = 0;
  puStack_38 = &UNK_7ff70cb846bb;
  puStack_40 = &UNK_7ff70cb740b8;
  FUN_7ff70cb12a50(&puStack_40,&UNK_7ff70cbe4470);
  pcVar3 = (code *)swi(3);
  puVar9 = (undefined8 *)(*pcVar3)();
  return puVar9;
}



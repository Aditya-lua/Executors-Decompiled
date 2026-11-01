
/* WARNING: Removing unreachable block (ram,0x006d6cdc) */
/* WARNING: Removing unreachable block (ram,0x006d6cc8) */

long FUN_006d6958(void)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  long unaff_x29;
  undefined1 auVar8 [16];
  
  func_0x006d660c();
  lVar2 = func_0x006d7e68();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return lVar2;
  }
  auVar8 = ___stack_chk_fail();
  plVar3 = auVar8._0_8_;
  if (plVar3[2] != 0) {
    uVar4 = *auVar8._8_8_;
    if (uVar4 == plVar3[3]) {
      return 0;
    }
    uVar5 = 0;
    uVar6 = uVar4 >> 4 ^ uVar4 >> 9;
    do {
      uVar6 = uVar6 & plVar3[1] - 1U;
      uVar7 = *(ulong *)(*plVar3 + uVar6 * 0x20);
      if (uVar7 == uVar4) {
        lVar2 = *plVar3 + uVar6 * 0x20;
        lVar1 = 0;
        if (lVar2 != 0) {
          lVar1 = lVar2 + 8;
        }
        return lVar1;
      }
      if (uVar7 == plVar3[3]) {
        return 0;
      }
      uVar5 = uVar5 + 1;
      uVar6 = uVar5 + uVar6;
    } while (uVar5 <= plVar3[1] - 1U);
  }
  return 0;
}


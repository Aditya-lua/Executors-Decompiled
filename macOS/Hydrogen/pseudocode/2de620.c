
void FUN_002de620(void)

{
  ulong uVar1;
  uint uVar2;
  long lVar3;
  int iVar4;
  undefined8 uVar5;
  uint extraout_w8;
  uint uVar6;
  long unaff_x19;
  long unaff_x20;
  long lVar7;
  uint uVar8;
  long unaff_x26;
  uint uVar9;
  ulong unaff_x27;
  long unaff_x28;
  long unaff_x29;
  undefined1 uStack0000000000000028;
  
  uVar9 = (uint)unaff_x27;
  uVar6 = (uVar9 + (int)unaff_x19) - 1;
  lVar3 = unaff_x20;
  if (uVar9 <= uVar6) goto LAB_002de650;
LAB_002de630:
  unaff_x20 = lVar3;
  uVar5 = 1;
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x58)) {
    do {
      ___stack_chk_fail(uVar5);
      uVar6 = extraout_w8;
LAB_002de650:
      uVar8 = 0;
      lVar7 = 0;
      uVar2 = 0;
      if (uVar9 != 0) {
        uVar2 = uVar6 / uVar9;
      }
      if (uVar2 < 2) {
        uVar2 = 1;
      }
      while( true ) {
        uVar8 = uVar8 + 1;
        iVar4 = (**(code **)(unaff_x26 + 8))();
        if (iVar4 == 0) break;
        uVar1 = unaff_x27;
        if ((ulong)(unaff_x19 - lVar7) <= unaff_x27) {
          uVar1 = unaff_x19 - lVar7;
        }
        if (uVar1 != 0) {
          _memcpy(unaff_x20 + lVar7,&uStack0000000000000028,uVar1);
        }
        lVar7 = uVar1 + lVar7;
        if (lVar7 == unaff_x19) {
          func_0x0036e464(&uStack0000000000000028,0x40);
        }
        lVar3 = unaff_x28;
        if (uVar2 == uVar8) goto LAB_002de630;
      }
      func_0x0036e464(&uStack0000000000000028,0x40);
      if ((unaff_x20 != 0) && (unaff_x19 != 0)) {
        func_0x0036e464(unaff_x20);
      }
      uVar5 = 0;
    } while (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x58));
  }
  return;
}


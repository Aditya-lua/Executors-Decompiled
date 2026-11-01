
long * FUN_00620e18(void)

{
  code *pcVar1;
  undefined8 uVar2;
  long *plVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  long unaff_x29;
  undefined1 auVar7 [16];
  undefined1 uStack0000000000000038;
  
  func_0x0062127c(unaff_x29 + -0x70);
  __Unwind_Resume();
  func_0x0001753c();
  uVar2 = func_0x0001753c();
  func_0x00621244(unaff_x29 + -0x88);
  func_0x0062127c(unaff_x29 + -0x70);
  uVar2 = __Unwind_Resume(uVar2);
  func_0x00087574(&uStack0000000000000038);
  func_0x00621244(unaff_x29 + -0x88);
  func_0x0062127c(unaff_x29 + -0x70);
  auVar7 = __Unwind_Resume(uVar2);
  uVar5 = auVar7._8_8_;
  plVar3 = auVar7._0_8_;
  *plVar3 = 0;
  plVar3[1] = 0;
  plVar3[2] = 0;
  if (uVar5 != 0) {
    if (0xaaaaaaaaaaaaaaa < uVar5) {
      func_0x00017f90(plVar3);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x620f2c);
      (*pcVar1)();
    }
    lVar4 = __Znwm(uVar5 * 0x18);
    *plVar3 = lVar4;
    plVar3[2] = lVar4 + uVar5 * 0x18;
    lVar6 = ((uVar5 * 0x18 - 0x18) / 0x18) * 0x18 + 0x18;
    _bzero(lVar4,lVar6);
    plVar3[1] = lVar4 + lVar6;
  }
  return plVar3;
}


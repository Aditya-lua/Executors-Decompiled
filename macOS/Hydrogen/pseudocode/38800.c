
undefined8 FUN_00038800(void)

{
  code *pcVar1;
  int iVar2;
  long *plVar3;
  long lVar4;
  uint uVar5;
  long lVar6;
  long unaff_x29;
  
  plVar3 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE();
  (**(code **)(*plVar3 + 0x38))(plVar3,10);
  __ZNSt3__16localeD1Ev();
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc();
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv();
  iVar2 = func_0x006e2400();
  if ((iVar2 != 0) || (iVar2 = func_0x006e21f8(), iVar2 == 7)) {
    func_0x0003a4b8();
    iVar2 = func_0x006ecb14();
    if (iVar2 == 0) {
      func_0x006e644c();
      goto LAB_00038968;
    }
    iVar2 = func_0x006e21f8();
    if (iVar2 != 7) {
      func_0x006e644c();
      goto LAB_00038968;
    }
    plVar3 = (long *)func_0x006e1710();
    lVar6 = *plVar3;
    func_0x006e4118();
    if (*(char *)(lVar6 + 4) != '\0') {
      uVar5 = 0;
      do {
        uVar5 = uVar5 + 1;
        lVar4 = func_0x006e5864();
        if (lVar4 != 0) {
          func_0x006e4860();
        }
      } while (uVar5 < *(byte *)(lVar6 + 4));
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
      return 1;
    }
    ___stack_chk_fail();
  }
  func_0x006e63b0();
LAB_00038968:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x3896c);
  (*pcVar1)();
}


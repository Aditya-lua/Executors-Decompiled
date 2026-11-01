
undefined8 FUN_000387a8(undefined8 param_1,long param_2)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  long *plVar4;
  long *plVar5;
  long lVar6;
  uint uVar7;
  long lVar8;
  long unaff_x29;
  
  uVar3 = func_0x00086db4(param_1,param_2 + 0xe42,3);
  uVar3 = func_0x00086db4(uVar3,"/Users/x0rch/hydrogen-m/src/lua/libs/debug.h",0x2c);
  uVar3 = func_0x00086db4(uVar3,":",1);
  plVar4 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar3,0x197);
  __ZNKSt3__18ios_base6getlocEv((long)plVar4 + *(long *)(*plVar4 + -0x18));
  plVar5 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE();
  uVar3 = (**(code **)(*plVar5 + 0x38))(plVar5,10);
  __ZNSt3__16localeD1Ev();
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar4,uVar3);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar4);
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
    plVar4 = (long *)func_0x006e1710();
    lVar8 = *plVar4;
    func_0x006e4118();
    if (*(char *)(lVar8 + 4) != '\0') {
      uVar7 = 0;
      do {
        uVar7 = uVar7 + 1;
        lVar6 = func_0x006e5864();
        if (lVar6 != 0) {
          func_0x006e4860();
        }
      } while (uVar7 < *(byte *)(lVar8 + 4));
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


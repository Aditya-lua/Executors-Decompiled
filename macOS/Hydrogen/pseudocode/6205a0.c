
long * thunk_FUN_006205b4(undefined8 param_1)

{
  long lVar1;
  code *pcVar2;
  undefined8 uVar3;
  long *plVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  undefined1 auVar8 [16];
  undefined1 uStack0000000000000038;
  
  func_0x0062069c(&uStack0000000000000038);
  uVar3 = __Unwind_Resume(param_1);
  func_0x00087574();
  func_0x0062069c(&uStack0000000000000038);
  auVar8 = __Unwind_Resume(uVar3);
  uVar6 = auVar8._8_8_;
  plVar4 = auVar8._0_8_;
  *plVar4 = 0;
  plVar4[1] = 0;
  plVar4[2] = 0;
  if (uVar6 != 0) {
    if (0x555555555555555 < uVar6) {
      func_0x00017f90(plVar4);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x620670);
      (*pcVar2)();
    }
    lVar7 = uVar6 * 0x30;
    lVar5 = __Znwm(lVar7);
    *plVar4 = lVar5;
    plVar4[1] = lVar5;
    lVar1 = lVar5 + lVar7;
    plVar4[2] = lVar1;
    do {
      func_0x005fdd18(lVar5);
      lVar5 = lVar5 + 0x30;
      lVar7 = lVar7 + -0x30;
    } while (lVar7 != 0);
    plVar4[1] = lVar1;
  }
  return plVar4;
}


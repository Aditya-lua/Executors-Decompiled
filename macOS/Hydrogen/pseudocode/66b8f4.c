
undefined8 thunk_FUN_0066b908(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  long lVar1;
  code *pcVar2;
  long *plVar3;
  undefined8 uVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  undefined1 auVar9 [12];
  undefined1 auStack_48 [24];
  
  ___cxa_free_exception();
  auVar9 = __Unwind_Resume();
  plVar3 = auVar9._0_8_;
  if ((param_3 & 1) == 0) {
    uVar4 = ___cxa_allocate_exception(0x28);
    func_0x0000a968(auStack_48,"FilterWithBufferedInput");
    func_0x00674584(uVar4,auStack_48);
    ___cxa_throw(uVar4,&UNK_00a0c640,&DAT_0066baa4);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x66ba68);
    (*pcVar2)();
  }
  if ((auVar9._8_4_ != 0) && ((char)plVar3[9] != '\0')) {
    uVar6 = plVar3[7];
    uVar7 = plVar3[0x10];
    if (uVar6 < 2) {
      while (uVar7 != 0) {
        lVar1 = plVar3[0xd] + plVar3[0xc];
        uVar8 = lVar1 - plVar3[0x11];
        uVar6 = uVar7;
        if (uVar8 <= uVar7) {
          uVar6 = uVar8;
        }
        lVar5 = plVar3[0x11] + uVar6;
        plVar3[0x10] = uVar7 - uVar6;
        plVar3[0x11] = lVar5;
        if (uVar7 <= uVar8 || lVar5 == lVar1) {
          plVar3[0x11] = plVar3[0xd];
        }
        (**(code **)(*plVar3 + 0x1e0))(plVar3);
        uVar7 = plVar3[0x10];
      }
    }
    else {
      while (uVar6 <= uVar7) {
        uVar6 = plVar3[0xe];
        if (uVar7 < uVar6) {
          lVar5 = 0;
        }
        else {
          lVar5 = plVar3[0x11];
          lVar1 = plVar3[0xd];
          if (lVar5 + uVar6 != plVar3[0xd] + plVar3[0xc]) {
            lVar1 = lVar5 + uVar6;
          }
          plVar3[0x10] = uVar7 - uVar6;
          plVar3[0x11] = lVar1;
        }
        (**(code **)(*plVar3 + 0x1e0))(plVar3,lVar5);
        uVar7 = plVar3[0x10];
        uVar6 = plVar3[7];
      }
    }
  }
  (**(code **)(*plVar3 + 0x1f0))(plVar3);
  return 0;
}


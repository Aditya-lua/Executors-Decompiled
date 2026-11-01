
long * FUN_00665208(void)

{
  long *plVar1;
  undefined8 uVar2;
  ulong uVar3;
  long *plVar4;
  long *plVar5;
  long *plVar6;
  undefined1 auVar7 [16];
  undefined1 uStack0000000000000020;
  undefined1 auStack_50 [8];
  ulong uStack_48;
  ulong uStack_40;
  long lStack_38;
  
  uVar2 = __Unwind_Resume();
  func_0x0062a89c(&uStack0000000000000020);
  uVar2 = __Unwind_Resume(uVar2);
  func_0x0062a89c();
  func_0x0062a89c(&uStack0000000000000020);
  auVar7 = __Unwind_Resume(uVar2);
  plVar5 = auVar7._8_8_;
  plVar4 = auVar7._0_8_;
  if ((char)plVar5[9] != '\0') {
    return plVar5;
  }
  plVar1 = plVar5 + 1;
  uVar3 = (**(code **)(*(long *)plVar4[2] + 0x70))((long *)plVar4[2],plVar1);
  if ((uVar3 & 1) == 0) {
                    /* WARNING: Could not recover jumptable at 0x00665400. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    plVar4 = (long *)(**(code **)(*plVar4 + 0x18))(plVar4);
    return plVar4;
  }
  uVar2 = (**(code **)(*(long *)plVar4[2] + 0x98))((long *)plVar4[2],plVar5 + 5,plVar1);
  func_0x00675bac(auStack_50,uVar2);
  (**(code **)(*(long *)plVar4[2] + 0x48))((long *)plVar4[2],auStack_50,plVar1);
  uVar2 = (**(code **)(*(long *)plVar4[2] + 0x90))((long *)plVar4[2],plVar1);
  plVar5 = plVar4 + 0x10;
  func_0x00677180(plVar5,uVar2);
  uVar2 = (**(code **)(*(long *)plVar4[2] + 0x90))((long *)plVar4[2],auStack_50);
  plVar1 = plVar4 + 0xc;
  func_0x00677180(plVar1,uVar2);
  (**(code **)(*(long *)plVar4[2] + 0x48))((long *)plVar4[2],plVar1,auStack_50);
  (**(code **)(*(long *)plVar4[2] + 0x48))((long *)plVar4[2],plVar1,plVar4 + 3);
  plVar6 = (long *)plVar4[2];
  uVar2 = (**(code **)(*plVar6 + 0x80))(plVar6,auStack_50,plVar1);
  (**(code **)(*plVar6 + 0x48))(plVar6,plVar5,uVar2);
  (**(code **)(*(long *)plVar4[2] + 0x48))((long *)plVar4[2],plVar5,plVar1);
  *(undefined1 *)(plVar4 + 0x14) = 0;
  if (uStack_40 <= uStack_48) {
    uStack_48 = uStack_40;
  }
  if (lStack_38 != 0) {
    if (uStack_48 != 0) {
      do {
        *(undefined8 *)(lStack_38 + -8 + uStack_48 * 8) = 0;
        uStack_48 = uStack_48 - 1;
      } while (uStack_48 != 0);
    }
    func_0x00611644();
  }
  return plVar4 + 0xb;
}


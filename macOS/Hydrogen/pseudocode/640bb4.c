
void FUN_00640bb4(undefined8 param_1)

{
  long *plVar1;
  int iVar2;
  undefined8 uVar3;
  long *plVar4;
  undefined8 uVar5;
  ulong uVar6;
  undefined1 auVar7 [16];
  undefined1 uStack0000000000000060;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  long in_stack_00000080;
  long *plStack_40;
  undefined8 uStack_38;
  undefined1 uStack_30;
  long *plStack_28;
  undefined8 uStack_20;
  
  uVar6 = in_stack_00000070;
  if (in_stack_00000078 <= in_stack_00000070) {
    uVar6 = in_stack_00000078;
  }
  if (in_stack_00000080 != 0) {
    if (uVar6 != 0) {
      do {
        *(undefined8 *)(in_stack_00000080 + -8 + uVar6 * 8) = 0;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
    }
    func_0x00611644();
  }
  __Unwind_Resume(param_1);
  uVar3 = func_0x0001753c();
  func_0x0062ec4c(&uStack0000000000000060);
  auVar7 = __Unwind_Resume(uVar3);
  uVar5 = auVar7._8_8_;
  plVar1 = (long *)((long)auVar7._0_8_ + *(long *)(*auVar7._0_8_ + -0x28));
  plStack_28 = (long *)0x0;
  uStack_20 = uVar3;
  iVar2 = func_0x006407f4(uVar5,&plStack_28);
  if (iVar2 != 0) {
    (**(code **)(*plStack_28 + 0x80))(plStack_28,plVar1);
    return;
  }
  plVar4 = (long *)(**(code **)(*plVar1 + 0x18))(plVar1);
  plVar4 = (long *)((long)plVar4 + *(long *)(*plVar4 + -0x70));
  (**(code **)(*plVar4 + 0x18))(plVar4,uVar5);
  uStack_30 = 0;
  plStack_40 = plVar1;
  uStack_38 = uVar5;
  iVar2 = func_0x0065f008(uVar5,plVar1);
  if (iVar2 != 0) {
    uStack_30 = 1;
  }
  func_0x0064094c(&plStack_40,"PublicElement",0x28,1);
  return;
}


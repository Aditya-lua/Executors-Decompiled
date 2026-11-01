
void FUN_00640bc4(long param_1,long param_2)

{
  long *plVar1;
  bool in_CY;
  int iVar2;
  undefined8 uVar3;
  long *plVar4;
  undefined8 uVar5;
  long in_x9;
  undefined1 auVar6 [16];
  undefined1 uStack0000000000000060;
  long *plStack_40;
  undefined8 uStack_38;
  undefined1 uStack_30;
  long *plStack_28;
  undefined8 uStack_20;
  
  if (in_CY) {
    param_1 = in_x9;
  }
  if (param_2 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
        param_1 = param_1 + -1;
      } while (param_1 != 0);
    }
    func_0x00611644();
  }
  __Unwind_Resume();
  uVar3 = func_0x0001753c();
  func_0x0062ec4c(&uStack0000000000000060);
  auVar6 = __Unwind_Resume(uVar3);
  uVar5 = auVar6._8_8_;
  plVar1 = (long *)((long)auVar6._0_8_ + *(long *)(*auVar6._0_8_ + -0x28));
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



void FUN_00642f08(void)

{
  undefined4 uVar1;
  undefined8 uVar2;
  long *plVar3;
  undefined8 unaff_x20;
  undefined1 *unaff_x29;
  undefined1 auVar4 [16];
  
  while( true ) {
    func_0x006143a8((undefined1 *)((long)register0x00000008 + 0x10));
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x18)) break;
    ___stack_chk_fail();
    uVar2 = __Unwind_Resume();
    func_0x006143a8((undefined1 *)((long)register0x00000008 + 0x10));
    auVar4 = __Unwind_Resume(uVar2);
    plVar3 = (long *)(auVar4._0_8_ + -8);
    *(undefined8 *)((long)register0x00000008 + -0x20) = unaff_x20;
    *(undefined8 *)((long)register0x00000008 + -0x18) = uVar2;
    *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
    *(undefined8 *)((long)register0x00000008 + -8) = 0x642f54;
    unaff_x29 = (undefined1 *)((long)register0x00000008 + -0x10);
    *(undefined8 *)((long)register0x00000008 + -0x28) =
         *(undefined8 *)PTR____stack_chk_guard_009b01e8;
    func_0x006129a4((undefined1 *)((long)register0x00000008 + -0x80),auVar4._8_8_,0x30);
    *(undefined **)((long)register0x00000008 + -0x80) = &UNK_009f6108;
    *(undefined **)((long)register0x00000008 + -0x78) = &UNK_009f6298;
    *(undefined4 *)((long)register0x00000008 + -0x88) = 0;
    *(undefined1 *)((long)register0x00000008 + -0x84) = 1;
    *(undefined1 *)((long)register0x00000008 + -0x81) = 2;
    func_0x00698dbc((undefined1 *)((long)register0x00000008 + -0x80),
                    (undefined1 *)((long)register0x00000008 + -0x81),1,0,1);
    func_0x00611648((undefined1 *)((long)register0x00000008 + -0x80),1);
    (**(code **)(*(long *)((long)register0x00000008 + -0x80) + 0x38))
              ((undefined1 *)((long)register0x00000008 + -0x80),
               (undefined1 *)((long)register0x00000008 + -0x84),1,0,1);
    unaff_x20 = (**(code **)(*plVar3 + 0x20))(plVar3);
    plVar3 = (long *)(auVar4._0_8_ + 0x58);
    (**(code **)(*plVar3 + 0xa0))(plVar3);
    uVar1 = func_0x005fe4e8();
    func_0x006029a4(unaff_x20,(undefined1 *)((long)register0x00000008 + -0x80),uVar1);
    func_0x00612b0c((undefined1 *)((long)register0x00000008 + -0x80));
    register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0x90);
  }
  return;
}


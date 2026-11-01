
ulong FUN_0067ec60(code *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                  undefined8 param_5)

{
  long *plVar1;
  ulong uVar2;
  undefined8 uVar3;
  long lVar4;
  long unaff_x19;
  long unaff_x29;
  undefined1 auVar5 [16];
  undefined1 auStack_38 [40];
  
  plVar1 = (long *)(*param_1)();
  (**(code **)(*plVar1 + 0x18))();
  func_0x00602890(unaff_x19 + 0x18);
  plVar1 = (long *)(**(code **)(*(long *)(unaff_x19 + 8) + 0x68))((long *)(unaff_x19 + 8));
  (**(code **)(*plVar1 + 0x18))();
  func_0x00612b0c();
  uVar2 = func_0x006143a8();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x18)) {
    return uVar2;
  }
  ___stack_chk_fail();
  uVar3 = __Unwind_Resume();
  func_0x006143a8();
  auVar5 = __Unwind_Resume(uVar3);
  func_0x0067ffe4(auStack_38,auVar5._0_8_,auVar5._8_8_,param_4,param_5,0);
  lVar4 = func_0x0062395c(auStack_38,"Modulus",0xa0,1);
  return (ulong)*(byte *)(lVar4 + 0x20);
}


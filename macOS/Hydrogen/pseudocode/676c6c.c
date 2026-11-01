
void FUN_00676c6c(code *param_1,undefined8 *param_2,long param_3,ulong param_4,undefined8 param_5)

{
  ulong uVar1;
  long unaff_x19;
  ulong unaff_x20;
  ulong unaff_x21;
  long unaff_x29;
  undefined1 auVar2 [16];
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined1 uStack_31;
  
  while( true ) {
    (*param_1)(param_2,param_3,param_4,param_5,1);
    unaff_x21 = unaff_x21 - 8;
    if (unaff_x20 == 0) break;
    uVar1 = unaff_x20 - 1 >> 3;
    if (uVar1 < *(ulong *)(unaff_x19 + 0x10)) {
      uStack0000000000000000._7_1_ =
           (undefined1)(*(ulong *)(*(long *)(unaff_x19 + 0x18) + uVar1 * 8) >> (unaff_x21 & 0x38));
    }
    else {
      uStack0000000000000000._7_1_ = 0;
    }
    param_1 = *(code **)(uStack0000000000000008 + 0x38);
    param_2 = &uStack0000000000000008;
    param_3 = (long)&uStack0000000000000000 + 7;
    param_4 = 1;
    param_5 = 0;
    unaff_x20 = unaff_x20 - 1;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return;
  }
  ___stack_chk_fail();
  auVar2 = __Unwind_Resume();
  if (param_4 != 0) {
    uVar1 = param_4 * 8;
    do {
      uVar1 = uVar1 - 8;
      param_4 = param_4 - 1;
      if (param_4 >> 3 < *(ulong *)(auVar2._0_8_ + 0x10)) {
        uStack_31 = (undefined1)
                    (*(ulong *)(*(long *)(auVar2._0_8_ + 0x18) + (param_4 >> 3) * 8) >>
                    (uVar1 & 0x38));
      }
      else {
        uStack_31 = 0;
      }
      (**(code **)(*auVar2._8_8_ + 0x38))(auVar2._8_8_,&uStack_31,1,0,1);
    } while (param_4 != 0);
  }
  return;
}


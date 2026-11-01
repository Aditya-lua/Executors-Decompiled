
void FUN_0003f5c4(long *param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  undefined8 extraout_x8;
  undefined8 *unaff_x19;
  undefined1 auVar2 [16];
  undefined *puStack_48;
  long *plStack_40;
  
  if (param_1 != (long *)0x0) {
    (**(code **)(*param_1 + 8))();
  }
  func_0x0003f6cc();
  *unaff_x19 = &UNK_00a0c238;
  unaff_x19[1] = &UNK_00a0c3e0;
  if ((long *)unaff_x19[3] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x19[3] + 8))();
  }
  __Unwind_Resume();
  auVar2 = func_0x0001753c();
  func_0x00611398(&puStack_48);
  uVar1 = func_0x0003fcac(&puStack_48,auVar2._0_8_,auVar2._8_8_,param_3);
  func_0x00611428(extraout_x8,uVar1);
  puStack_48 = &UNK_009f6820;
  if (plStack_40 != (long *)0x0) {
    (**(code **)(*plStack_40 + 8))();
  }
  return;
}


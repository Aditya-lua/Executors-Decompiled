
undefined8 FUN_005f1ce0(long param_1,long param_2,undefined8 param_3,long *param_4)

{
  long *plVar1;
  undefined8 uVar2;
  undefined8 *unaff_x19;
  
  if (param_1 != 0) {
    do {
      *(undefined1 *)(param_2 + -1 + param_1) = 0;
      param_1 = param_1 + -1;
    } while (param_1 != 0);
  }
  func_0x00611644();
  func_0x006989cc();
  *unaff_x19 = &UNK_00a0c238;
  unaff_x19[1] = &UNK_00a0c3e0;
  if ((long *)unaff_x19[3] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x19[3] + 8))();
  }
  plVar1 = (long *)__Unwind_Resume();
  uVar2 = (**(code **)(*plVar1 + 0x68))();
  if (param_4 != (long *)0x0) {
    (**(code **)(*param_4 + 8))(param_4);
  }
  return uVar2;
}



undefined8 FUN_0066ab00(undefined8 param_1,undefined4 param_2)

{
  long *plVar1;
  ulong uVar2;
  long *unaff_x19;
  
  plVar1 = (long *)(**(code **)(*unaff_x19 + 0x160))();
  uVar2 = (**(code **)(*plVar1 + 0x140))();
  if ((uVar2 & 1) == 0) {
    *(undefined4 *)(unaff_x19 + 5) = 0;
    return 0;
  }
  *(undefined4 *)(unaff_x19 + 5) = param_2;
  return 1;
}


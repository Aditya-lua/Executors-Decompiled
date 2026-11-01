
void FUN_00058bc4(long *param_1,long *param_2)

{
  undefined8 uVar1;
  long lVar2;
  long unaff_x29;
  undefined4 uStack_14;
  
  if (param_2 == param_1) {
    lVar2 = 4;
    param_2 = *(long **)(unaff_x29 + -0x60);
  }
  else {
    if (param_2 == (long *)0x0) goto LAB_00058bec;
    lVar2 = 5;
  }
  (**(code **)(*param_2 + lVar2 * 8))();
LAB_00058bec:
  uVar1 = __Unwind_Resume();
  uStack_14 = 1;
  _setsockopt(uVar1,0xffff,0x200,&uStack_14,4);
  return;
}


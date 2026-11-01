
void FUN_00649688(long *param_1)

{
  long *plVar1;
  undefined8 uVar2;
  long *unaff_x20;
  
  plVar1 = (long *)(**(code **)(*param_1 + 0x98))();
  uVar2 = (**(code **)(*unaff_x20 + 0x88))();
  (**(code **)(*plVar1 + 0x30))(plVar1,uVar2);
  *(undefined4 *)(unaff_x20 + 1) = 0;
  return;
}


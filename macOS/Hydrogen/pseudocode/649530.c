
undefined8 FUN_00649530(long *param_1)

{
  int iVar1;
  undefined8 uVar2;
  long *unaff_x19;
  uint unaff_w20;
  
  uVar2 = (**(code **)(*param_1 + 0x10))();
  if ((int)uVar2 != 0) {
    if (*(uint *)(unaff_x19 + 1) <= unaff_w20) {
      uVar2 = (**(code **)(*unaff_x19 + 0xe0))();
      if ((int)uVar2 == 0) {
        *(undefined4 *)(unaff_x19 + 1) = 0;
        return uVar2;
      }
      (**(code **)(*unaff_x19 + 0x68))();
      (**(code **)(*unaff_x19 + 0x90))();
      uVar2 = (**(code **)(*unaff_x19 + 0xe8))();
      iVar1 = 0;
      if ((int)uVar2 != 0) {
        iVar1 = unaff_w20 + 1;
      }
      *(int *)(unaff_x19 + 1) = iVar1;
      return uVar2;
    }
    uVar2 = 1;
  }
  return uVar2;
}


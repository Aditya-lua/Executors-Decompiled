
void FUN_00649574(code *param_1)

{
  int iVar1;
  int iVar2;
  long *unaff_x19;
  int unaff_w20;
  
  iVar1 = (*param_1)();
  if (iVar1 == 0) {
    *(undefined4 *)(unaff_x19 + 1) = 0;
    return;
  }
  (**(code **)(*unaff_x19 + 0x68))();
  (**(code **)(*unaff_x19 + 0x90))();
  iVar2 = (**(code **)(*unaff_x19 + 0xe8))();
  iVar1 = 0;
  if (iVar2 != 0) {
    iVar1 = unaff_w20 + 1;
  }
  *(int *)(unaff_x19 + 1) = iVar1;
  return;
}


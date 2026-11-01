
void FUN_006702d4(code *param_1)

{
  int iVar1;
  long *unaff_x20;
  long *unaff_x22;
  
  iVar1 = (*param_1)();
  if (iVar1 != 0) {
    (**(code **)(*unaff_x22 + 0x90))();
    (**(code **)(*unaff_x20 + 0x130))();
  }
  return;
}


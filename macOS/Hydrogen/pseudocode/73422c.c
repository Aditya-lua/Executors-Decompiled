
void FUN_0073422c(ulong param_1)

{
  char cVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  long unaff_x19;
  undefined1 *unaff_x20;
  undefined8 in_stack_00000008;
  
  if ((param_1 >> 0x20 & 1) != 0) {
    *unaff_x20 = 1;
    return;
  }
  if ((*(char *)(unaff_x19 + 0x52d) == '\0') && (iVar3 = func_0x00731574(), iVar3 != 0)) {
    iVar3 = func_0x00730c40();
    cVar1 = *(char *)(unaff_x19 + 0x52d);
  }
  else {
    iVar3 = 0;
    in_stack_00000008._7_1_ = '\x01';
    cVar1 = *(char *)(unaff_x19 + 0x52d);
  }
  if ((cVar1 == '\0') && (iVar4 = func_0x00731574(), iVar4 != 0)) {
    iVar4 = func_0x00730c40();
    bVar2 = iVar4 != 0;
  }
  else {
    bVar2 = false;
    in_stack_00000008._6_1_ = '\x01';
  }
  if ((iVar3 != 0) || (bVar2)) {
    *unaff_x20 = 1;
  }
  else {
    *unaff_x20 = in_stack_00000008._7_1_ != '\0' && in_stack_00000008._6_1_ != '\0';
    if (in_stack_00000008._7_1_ == '\0' || in_stack_00000008._6_1_ == '\0') {
      return;
    }
  }
  *(ulong *)(unaff_x19 + 0x398) = *(ulong *)(unaff_x19 + 0x398) | 0x100000000;
  return;
}


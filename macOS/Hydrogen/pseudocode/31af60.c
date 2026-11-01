
bool FUN_0031af60(long param_1)

{
  bool bVar1;
  int iVar2;
  long unaff_x19;
  long unaff_x26;
  long in_stack_00000008;
  
  *(long *)(unaff_x26 + 0x30) = param_1;
  bVar1 = false;
  if (param_1 != 0) {
    iVar2 = func_0x002fa0c0();
    if (iVar2 == 0 || in_stack_00000008 != unaff_x19) {
      bVar1 = false;
    }
    else {
      iVar2 = func_0x0036e62c();
      bVar1 = iVar2 == 0;
    }
  }
  return bVar1;
}



void FUN_0017ebdc(void)

{
  int iVar1;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x23;
  code *unaff_x24;
  undefined8 in_stack_00000018;
  
  (*unaff_x24)();
  iVar1 = func_0x00179758();
  if (iVar1 == 7000) {
    *unaff_x19 = unaff_x23;
    unaff_x19[1] = unaff_x20;
    unaff_x19[2] = in_stack_00000018;
  }
  else {
    *unaff_x19 = 0x8000000000000000;
    func_0x00187bd4();
  }
  return;
}


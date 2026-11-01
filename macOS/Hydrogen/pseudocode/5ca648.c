
void FUN_005ca648(long param_1)

{
  long *unaff_x20;
  long *unaff_x22;
  long unaff_x23;
  
  while( true ) {
    if (param_1 != 0xc) {
      func_0x0059ce88(unaff_x22);
    }
    unaff_x23 = unaff_x23 + -1;
    func_0x0059ce88(unaff_x22 + 8);
    if (unaff_x23 == 0) break;
    param_1 = unaff_x22[0x10];
    unaff_x22 = unaff_x22 + 0x10;
  }
  if (*unaff_x20 != 0) {
    func_0x00187bd4();
  }
  return;
}


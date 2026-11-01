
void FUN_00631070(long param_1)

{
  long lVar1;
  long unaff_x19;
  long unaff_x29;
  
  lVar1 = unaff_x19;
  if (param_1 != unaff_x19) {
    do {
      param_1 = func_0x00650db0(param_1 + -0x80);
    } while (param_1 != unaff_x19);
    lVar1 = *(long *)(unaff_x29 + -0x38);
  }
  *(long *)(unaff_x29 + -0x30) = unaff_x19;
  __ZdlPv(lVar1);
  return;
}


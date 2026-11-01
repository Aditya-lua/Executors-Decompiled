
void FUN_00620ecc(long param_1)

{
  long *unaff_x19;
  long unaff_x20;
  long lVar1;
  long unaff_x22;
  
  *unaff_x19 = param_1;
  unaff_x19[2] = param_1 + unaff_x20 * 0x18;
  lVar1 = ((unaff_x22 - 0x18U) / 0x18) * 0x18 + 0x18;
  _bzero(param_1,lVar1);
  unaff_x19[1] = param_1 + lVar1;
  return;
}


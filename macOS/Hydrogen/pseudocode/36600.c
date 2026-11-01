
void FUN_00036600(long param_1)

{
  long lVar1;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  lVar1 = __Znwm(param_1 * 0x18);
  *unaff_x19 = lVar1;
  unaff_x19[1] = lVar1;
  unaff_x19[2] = lVar1 + param_1 * 0x18;
  if (unaff_x21 != unaff_x20) {
    _memcpy(lVar1);
    lVar1 = lVar1 + (((unaff_x20 - unaff_x21) - 0x18U) / 0x18) * 0x18 + 0x18;
  }
  unaff_x19[1] = lVar1;
  return;
}


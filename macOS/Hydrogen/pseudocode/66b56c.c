
void FUN_0066b56c(undefined8 param_1,undefined8 param_2)

{
  ulong uVar1;
  ulong unaff_x19;
  long unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  
  uVar1 = unaff_x22;
  if (unaff_x19 <= unaff_x22) {
    uVar1 = unaff_x19;
  }
  _memcpy(param_1,param_2,uVar1);
  if (unaff_x22 <= unaff_x19 && unaff_x19 - unaff_x22 != 0) {
    _memcpy(*(undefined8 *)(unaff_x20 + 0x18),unaff_x21 + unaff_x22,unaff_x19 - unaff_x22);
  }
  *(ulong *)(unaff_x20 + 0x30) = *(long *)(unaff_x20 + 0x30) + unaff_x19;
  return;
}


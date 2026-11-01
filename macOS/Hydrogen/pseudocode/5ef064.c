
ulong FUN_005ef064(long param_1)

{
  ulong unaff_x19;
  long *unaff_x20;
  ulong unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x26;
  long unaff_x27;
  long unaff_x28;
  
  while( true ) {
    (**(code **)(param_1 + 0x28))();
    unaff_x24 = unaff_x24 + unaff_x26;
    unaff_x22 = unaff_x22 + unaff_x28;
    unaff_x23 = unaff_x23 + unaff_x27;
    unaff_x19 = unaff_x19 - unaff_x21;
    if (unaff_x19 < unaff_x21) break;
    func_0x00685528(unaff_x22,unaff_x23,unaff_x24);
    param_1 = *unaff_x20;
  }
  return unaff_x19;
}


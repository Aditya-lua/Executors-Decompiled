
void FUN_0074dd74(long param_1)

{
  long *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  
  while( true ) {
    func_0x0075e680(param_1 + unaff_x20);
    unaff_x21 = unaff_x21 + 1;
    unaff_x20 = unaff_x20 + 0x20;
    if ((ulong)unaff_x19[4] <= unaff_x21) break;
    param_1 = *unaff_x19;
  }
  (*pcRam0000000000a2b5f0)(*unaff_x19);
  *unaff_x19 = 0;
  unaff_x19[4] = 0;
  unaff_x19[5] = 0;
  return;
}


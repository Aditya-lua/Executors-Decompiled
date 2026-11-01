
void FUN_0060c304(long param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong in_x9;
  long in_x10;
  ulong in_x11;
  ulong in_x12;
  ulong *in_x13;
  ulong *in_x14;
  ulong in_x15;
  long in_x16;
  ulong in_x17;
  
  while( true ) {
    *in_x14 = in_x15 - in_x12;
    uVar2 = in_x17 - in_x13[1];
    uVar1 = (in_x16 - (ulong)(in_x15 < in_x12)) + uVar2;
    in_x12 = (ulong)(uVar2 < uVar1);
    if (in_x17 < in_x13[1]) {
      in_x12 = in_x12 + 1;
    }
    in_x14[1] = uVar1;
    in_x11 = in_x11 + 2;
    if (in_x9 <= in_x11) break;
    in_x14 = (ulong *)(param_1 + in_x11 * 8);
    in_x13 = (ulong *)(in_x10 + in_x11 * 8);
    in_x17 = in_x14[1];
    in_x15 = *in_x14 - *in_x13;
    in_x16 = -(ulong)(*in_x14 < *in_x13);
  }
  return;
}


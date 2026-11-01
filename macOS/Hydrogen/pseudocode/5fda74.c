
void FUN_005fda74(ulong param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong *in_x9;
  ulong *in_x10;
  ulong *in_x11;
  ulong in_x12;
  ulong in_x13;
  ulong in_x14;
  ulong unaff_x19;
  
  while( true ) {
    in_x9[-1] = (in_x13 - in_x14) - in_x12;
    uVar2 = *in_x11 - *in_x10;
    uVar1 = (-(ulong)(in_x13 - in_x14 < in_x12) - (ulong)(in_x13 < in_x14)) + uVar2;
    in_x12 = (ulong)(uVar2 < uVar1);
    if (*in_x11 < *in_x10) {
      in_x12 = in_x12 + 1;
    }
    param_1 = param_1 + 2;
    *in_x9 = uVar1;
    if (unaff_x19 <= param_1) break;
    in_x13 = in_x11[1];
    in_x14 = in_x10[1];
    in_x9 = in_x9 + 2;
    in_x10 = in_x10 + 2;
    in_x11 = in_x11 + 2;
  }
  return;
}


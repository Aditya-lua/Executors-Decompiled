
void FUN_00376e48(ulong param_1)

{
  ulong uVar1;
  bool in_CY;
  long *in_x5;
  ulong in_x9;
  ulong in_x10;
  ulong in_x11;
  ulong in_x12;
  ulong in_x13;
  ulong in_d27;
  long in_register_00005368;
  
  uVar1 = in_x9 - (in_x12 + !in_CY);
  if (!CARRY8(in_x10,~in_x13) &&
      !CARRY8(in_x10 + ~in_x13,
              (ulong)(CARRY8(in_x9,~in_x12) || CARRY8(in_x9 + ~in_x12,(ulong)in_CY)))) {
    uVar1 = in_x9;
    in_x11 = param_1;
  }
  *in_x5 = in_x11 + in_d27;
  in_x5[1] = uVar1 + in_register_00005368 + (ulong)CARRY8(in_x11,in_d27);
  return;
}


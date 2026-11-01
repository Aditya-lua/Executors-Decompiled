
ushort * FUN_001b2874(ushort *param_1)

{
  ulong uVar1;
  ushort *puVar2;
  long in_x9;
  long in_x10;
  ulong in_x11;
  ulong in_x12;
  uint in_w13;
  
  while (puVar2 = param_1, in_w13 != 0x10) {
    do {
      param_1 = puVar2 + 0x20;
      in_x9 = in_x9 + -0x40;
      if (in_x9 == 0) {
        return (ushort *)0x0;
      }
      in_x12 = *(long *)(puVar2 + 0x10) + in_x10;
      uVar1 = in_x12;
      if (0x16 < in_x12) {
        uVar1 = in_x11;
      }
      puVar2 = param_1;
    } while (uVar1 - 6 < 0x10 || uVar1 < 5);
    if (uVar1 != 0x16) break;
    in_w13 = (uint)*param_1;
  }
  param_1 = param_1 + -0xc;
  if (in_x12 != 5) {
    param_1 = (ushort *)0x0;
  }
  return param_1;
}


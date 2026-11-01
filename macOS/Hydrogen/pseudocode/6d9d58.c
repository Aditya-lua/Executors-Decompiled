
undefined8 FUN_006d9d58(ulong param_1)

{
  ulong uVar1;
  ulong in_x9;
  ulong uVar2;
  ulong in_x10;
  long unaff_x19;
  long unaff_x21;
  
  uVar1 = (param_1 | in_x10 & 0x7f007f007f007f | in_x9 - (in_x9 >> 7)) + unaff_x21;
  uVar2 = uVar1 & 0x8080808080808080;
  *(ulong *)(unaff_x19 + 0x40) = uVar2 - (uVar2 >> 7) | uVar1 & 0x7f7f7f7f7f7f7f7f;
  *(undefined8 *)(unaff_x19 + 0x48) = 0;
  return 0;
}



undefined8 FUN_0014d800(ulong param_1,ulong *param_2)

{
  ulong uVar1;
  ulong in_x9;
  undefined4 in_w10;
  undefined4 in_w11;
  long unaff_x19;
  long unaff_x20;
  
  uVar1 = (ulong)*(ushort *)(unaff_x20 + unaff_x19) + 0x100;
  if ((param_1 & 0x20) != 0) {
    in_x9 = uVar1;
  }
  *param_2 = uVar1;
  param_2[1] = in_x9;
  if (0x1ffff < in_x9) {
    in_x9 = 0x20000;
  }
  *(int *)(param_2 + 2) = (int)in_x9;
  *(undefined4 *)((long)param_2 + 0x14) = 0;
  *(undefined4 *)((long)param_2 + 0x1c) = in_w10;
  *(undefined4 *)(param_2 + 4) = in_w11;
  return 0;
}


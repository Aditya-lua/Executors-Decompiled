
int FUN_0009ae04(undefined1 *param_1)

{
  bool in_CY;
  undefined1 in_w8;
  ulong uVar1;
  long unaff_x22;
  int unaff_w23;
  long unaff_x27;
  long unaff_x29;
  int *in_stack_00000050;
  int in_stack_00000058;
  
  if (in_CY) {
    uVar1 = (unaff_x22 - 0x10eU) / 0xff;
    _memset(param_1,0xff,uVar1 + 1);
    in_w8 = (undefined1)((unaff_x22 - 0x10eU) % 0xff);
    param_1 = (undefined1 *)(uVar1 + unaff_x27 + 2);
  }
  *param_1 = in_w8;
  _memcpy(param_1 + 1);
  *in_stack_00000050 = (unaff_w23 + (int)unaff_x22) - (int)*(undefined8 *)(unaff_x29 + -0x58);
  return ((int)(param_1 + 1) + (int)unaff_x22) - in_stack_00000058;
}


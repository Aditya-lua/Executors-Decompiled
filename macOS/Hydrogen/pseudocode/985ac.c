
int FUN_000985ac(ulong param_1,undefined1 *param_2)

{
  ulong uVar1;
  long unaff_x21;
  int unaff_w22;
  long unaff_x24;
  long unaff_x29;
  long in_stack_00000028;
  int in_stack_00000058;
  
  if (0xfe < param_1) {
    param_1 = ((*(long *)(unaff_x29 + -0x58) + in_stack_00000028) - unaff_x21) - 0x10e;
    uVar1 = param_1 / 0xff;
    _memset(param_2,0xff,uVar1 + 1);
    param_1 = param_1 % 0xff;
    param_2 = (undefined1 *)(uVar1 + unaff_x24 + 2);
  }
  *param_2 = (char)param_1;
  _memcpy(param_2 + 1);
  return ((int)(param_2 + 1) + unaff_w22) - in_stack_00000058;
}


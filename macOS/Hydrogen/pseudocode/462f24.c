
void FUN_00462f24(long param_1)

{
  ulong in_x9;
  undefined8 in_x10;
  undefined8 *unaff_x19;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  long lStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  ulong uStack0000000000000070;
  ulong uStack0000000000000080;
  
  uStack0000000000000070 = in_x9 | 2;
  uStack0000000000000080 = in_x9 | 3;
  *(undefined8 *)(param_1 + 0x38) = in_x10;
  _uStack0000000000000020 = &UNK_009e01a0;
  uStack0000000000000028 = 4;
  uStack0000000000000038 = 4;
  uStack0000000000000040 = 0;
  lStack0000000000000030 = param_1;
  func_0x0046849c(*unaff_x19,unaff_x19[1],&uStack0000000000000020);
  return;
}


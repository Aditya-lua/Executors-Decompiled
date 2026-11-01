
undefined8 FUN_00463540(void)

{
  int iVar1;
  ulong uVar2;
  code *unaff_x21;
  undefined8 uStack0000000000000010;
  undefined *in_stack_00000018;
  undefined8 uStack0000000000000058;
  undefined *puStack0000000000000060;
  undefined8 uStack0000000000000068;
  undefined8 *puStack0000000000000070;
  undefined8 uStack0000000000000078;
  undefined8 uStack0000000000000080;
  
  puStack0000000000000060 = &UNK_007fc120;
  uStack0000000000000068 = 1;
  uStack0000000000000078 = 1;
  uStack0000000000000080 = 0;
  puStack0000000000000070 = &uStack0000000000000010;
  uVar2 = func_0x0046849c();
  if (((uVar2 & 1) == 0) && (uVar2 = (*unaff_x21)(), (uVar2 & 1) == 0)) {
    uStack0000000000000010 = &uStack0000000000000058;
    in_stack_00000018 = &DAT_00477a5c;
    puStack0000000000000060 = &UNK_007fc120;
    uStack0000000000000068 = 1;
    uStack0000000000000078 = 1;
    uStack0000000000000080 = 0;
    puStack0000000000000070 = &uStack0000000000000010;
    uVar2 = func_0x0046849c();
    if (((uVar2 & 1) == 0) && (uVar2 = (*unaff_x21)(), (uVar2 & 1) == 0)) {
      uStack0000000000000010 = &uStack0000000000000058;
      in_stack_00000018 = &DAT_00477a5c;
      puStack0000000000000060 = &UNK_007fc120;
      uStack0000000000000068 = 1;
      uStack0000000000000078 = 1;
      uStack0000000000000080 = 0;
      puStack0000000000000070 = &uStack0000000000000010;
      iVar1 = func_0x0046849c();
      if (iVar1 == 0) {
        return 0;
      }
    }
  }
  return 1;
}


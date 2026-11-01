
void FUN_000bf2a0(void)

{
  int iVar1;
  undefined8 in_x3;
  long unaff_x19;
  undefined8 in_stack_00000010;
  int iStack0000000000000018;
  ushort uStack000000000000001c;
  
  iVar1 = _sscanf(in_x3,"Pos=%i,%i");
  if (iVar1 == 2) {
    *(uint *)(unaff_x19 + 4) = (uint)uStack000000000000001c | iStack0000000000000018 << 0x10;
  }
  else {
    iVar1 = _sscanf();
    if (iVar1 == 2) {
      *(uint *)(unaff_x19 + 8) = (uint)uStack000000000000001c | iStack0000000000000018 << 0x10;
      return;
    }
    iVar1 = _sscanf();
    if (iVar1 == 1) {
      *(bool *)(unaff_x19 + 0xc) = in_stack_00000010._4_4_ != 0;
      return;
    }
    iVar1 = _sscanf();
    if (iVar1 == 1) {
      *(bool *)(unaff_x19 + 0xd) = in_stack_00000010._4_4_ != 0;
      return;
    }
  }
  return;
}


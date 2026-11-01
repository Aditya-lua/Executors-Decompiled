
void FUN_00140168(void)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint in_w8;
  int in_w9;
  uint in_w10;
  long unaff_x19;
  undefined1 unaff_w20;
  int unaff_w25;
  undefined8 in_stack_00000080;
  long in_stack_00000090;
  undefined8 in_stack_000000a8;
  long in_stack_000000b8;
  
  uVar3 = in_w9 * (in_w10 & 0xffff | 0xaaaa0000);
  uVar2 = unaff_w25 + 2U;
  if ((int)uVar3 <= (int)(unaff_w25 + 2U)) {
    uVar2 = uVar3;
  }
  uVar3 = *(uint *)(unaff_x19 + 0x6c);
  if ((int)in_w8 <= (int)*(uint *)(unaff_x19 + 0x6c)) {
    uVar3 = in_w8;
  }
  uVar1 = *(uint *)(unaff_x19 + 0x70);
  if ((int)*(uint *)(unaff_x19 + 0x70) <= (int)uVar2) {
    uVar1 = uVar2;
  }
  uVar3 = uVar3 & ((int)uVar3 >> 0x1f ^ 0xffffffffU);
  uVar2 = uVar3;
  if ((int)uVar3 <= (int)uVar1) {
    uVar2 = uVar1;
  }
  *(uint *)(unaff_x19 + 0x6c) = uVar3;
  *(uint *)(unaff_x19 + 0x70) = uVar2;
  *(undefined1 *)(unaff_x19 + 0x248) = unaff_w20;
  func_0x001420d0();
  if (in_stack_000000b8 < 0) {
    __ZdlPv(in_stack_000000a8);
  }
  if (in_stack_00000090 < 0) {
    __ZdlPv(in_stack_00000080);
  }
  return;
}


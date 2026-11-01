
void FUN_006a2cd8(void)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  int in_w4;
  int in_w8;
  uint in_w9;
  int in_w10;
  uint in_w11;
  int in_w12;
  int in_w14;
  int in_w16;
  int unaff_w22;
  int unaff_w24;
  uint unaff_w25;
  int unaff_w26;
  int iStack0000000000000008;
  int iStack000000000000000c;
  int iStack0000000000000010;
  int iStack0000000000000014;
  int *in_stack_00000018;
  
  uVar1 = in_w10 + in_w14 + in_w12;
  uVar2 = uVar1 >> 0x1b | uVar1 * 0x20;
  uVar1 = in_w8 + in_w16 + (in_w9 ^ in_w11 ^ uVar2);
  uVar3 = uVar1 >> 0x11 | uVar1 * 0x8000;
  uVar1 = in_w11 + in_w4 + (uVar2 ^ in_w9 ^ uVar3);
  in_stack_00000018[2] = unaff_w22 + iStack0000000000000010 + (uVar1 >> 0x18 | uVar1 * 0x100);
  in_stack_00000018[3] = (unaff_w25 >> 0x14 | unaff_w25 << 0xc) + iStack0000000000000014 + uVar3;
  *in_stack_00000018 = unaff_w26 + iStack0000000000000008 + uVar2;
  in_stack_00000018[1] = unaff_w24 + iStack000000000000000c + in_w9;
  return;
}


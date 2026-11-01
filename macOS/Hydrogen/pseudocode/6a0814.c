
void FUN_006a0814(void)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  int in_w7;
  int in_w8;
  uint in_w9;
  uint in_w10;
  int in_w11;
  uint in_w12;
  int in_w13;
  int in_w15;
  int in_w17;
  int unaff_w20;
  uint unaff_w24;
  uint unaff_w25;
  int unaff_w26;
  int *in_stack_00000030;
  int iStack0000000000000038;
  int iStack000000000000003c;
  int iStack0000000000000040;
  int iStack0000000000000044;
  int iStack0000000000000048;
  int iStack000000000000004c;
  
  uVar6 = in_w10 >> 0x16 | in_w10 << 10;
  uVar1 = in_w11 + in_w15;
  uVar7 = unaff_w24 >> 0x16 | unaff_w24 << 10;
  uVar2 = in_w15 + in_w7 + (uVar6 ^ in_w12 ^ uVar1);
  uVar3 = (in_w9 >> 0x1b | in_w9 << 5) + in_w8;
  uVar4 = in_w17 + (uVar3 ^ (unaff_w25 | uVar7 ^ 0xffffffff));
  uVar8 = in_w12 >> 0x16 | in_w12 << 10;
  uVar2 = (uVar2 >> 0x13 | uVar2 * 0x2000) + in_w13;
  uVar5 = in_w13 + unaff_w20 + (uVar8 ^ uVar1 ^ uVar2);
  uVar9 = uVar1 >> 0x16 | uVar1 * 0x400;
  uVar1 = (uVar5 >> 0x15 | uVar5 * 0x800) + uVar6;
  uVar5 = uVar6 + iStack0000000000000038 + (uVar9 ^ uVar2 ^ uVar1);
  in_stack_00000030[2] = uVar8 + iStack000000000000003c + uVar7;
  in_stack_00000030[3] =
       unaff_w26 + iStack0000000000000048 + uVar8 + (uVar5 >> 0x15 | uVar5 * 0x800);
  in_stack_00000030[4] = unaff_w26 + iStack000000000000004c + uVar1 + (uVar4 >> 0x1a | uVar4 * 0x40)
  ;
  *in_stack_00000030 = iStack0000000000000040 + (uVar2 >> 0x16 | uVar2 * 0x400) + uVar3;
  in_stack_00000030[1] = uVar9 + iStack0000000000000044 + (unaff_w25 >> 0x16 | unaff_w25 << 10);
  return;
}



uint FUN_0011c0ec(void)

{
  uint uVar1;
  undefined4 in_w8;
  long in_x10;
  long unaff_x21;
  int unaff_w22;
  ulong unaff_x25;
  uint unaff_w26;
  uint unaff_w27;
  int *unaff_x28;
  long unaff_x29;
  float unaff_s14;
  undefined8 in_stack_00000018;
  int in_stack_00000020;
  uint in_stack_00000038;
  long in_stack_00000040;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000e8;
  undefined1 uStack0000000000000100;
  
  *(undefined4 *)
   ("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" + in_x10 + 0xc) =
       in_w8;
  func_0x000d0b80();
  uVar1 = unaff_x28[2];
  func_0x000d818c();
  if (*unaff_x28 == 0) {
    *unaff_x28 = unaff_w22;
    unaff_x28[1] = in_stack_00000020;
    unaff_x28[2] = uVar1 & 0x80 | in_stack_00000018._4_4_;
    uVar1 = unaff_w26 ^ 1;
    if (*(char *)(in_stack_00000040 + 0xbc) == '\0') {
      uVar1 = 1;
    }
    if ((uVar1 & 1) != 0) goto code_r0x0011c1d0;
LAB_0011c11c:
    func_0x000dc80c("{","}");
    func_0x000bc2c4(&uStack0000000000000100,in_stack_000000e8,in_stack_000000d0);
    if (unaff_s14 <= 0.0) goto LAB_0011c148;
LAB_0011c1d4:
    func_0x000bc130(*(float *)(unaff_x29 + -0xa0) + *(float *)(&UNK_0000393c + unaff_x21),
                    *(float *)(unaff_x29 + -0xa4) + *(float *)(&UNK_00003928 + unaff_x21));
    if (((unaff_w27 ^ 1) & 1) != 0 || (unaff_x25 & 0x8000000) != 0) goto LAB_0011c160;
  }
  else {
    uVar1 = unaff_w26 ^ 1;
    if (*(char *)(in_stack_00000040 + 0xbc) == '\0') {
      uVar1 = 1;
    }
    if ((uVar1 & 1) == 0) goto LAB_0011c11c;
code_r0x0011c1d0:
    if (0.0 < unaff_s14) goto LAB_0011c1d4;
LAB_0011c148:
    if (((unaff_w27 ^ 1) & 1) != 0 || (unaff_x25 & 0x8000000) != 0) goto LAB_0011c160;
  }
  func_0x000c255c();
LAB_0011c160:
  if ((unaff_x25 & 0x20) != 0) {
    unaff_w27 = in_stack_00000038;
  }
  return unaff_w27;
}


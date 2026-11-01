
void FUN_0042703c(void)

{
  int in_w8;
  undefined8 *unaff_x19;
  undefined8 in_stack_00000008;
  undefined4 uStack0000000000000010;
  undefined4 uStack0000000000000014;
  undefined4 uStack0000000000000018;
  undefined4 uStack000000000000001c;
  
  if (in_w8 == 2) {
    unaff_x19[1] = _uStack0000000000000010;
    *(undefined4 *)unaff_x19 = 2;
  }
  else {
    *unaff_x19 = in_stack_00000008;
    *(undefined4 *)(unaff_x19 + 1) = uStack0000000000000010;
    *(ulong *)((long)unaff_x19 + 0xc) = CONCAT44(uStack0000000000000018,uStack0000000000000014);
    *(undefined4 *)((long)unaff_x19 + 0x14) = uStack000000000000001c;
  }
  return;
}


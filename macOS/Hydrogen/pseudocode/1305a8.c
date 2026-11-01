
void FUN_001305a8(void)

{
  long unaff_x19;
  float fVar1;
  undefined8 in_stack_00000008;
  float fStack000000000000001c;
  
  func_0x000f397c();
  fStack000000000000001c = in_stack_00000008._4_4_;
  func_0x000f397c(0x3f800000);
  if (((((*(uint *)(unaff_x19 + 4) >> 7 & 1) != 0) &&
       (fVar1 = *(float *)(unaff_x19 + 0x80), fVar1 < *(float *)(unaff_x19 + 0xfc))) &&
      (*(float *)(unaff_x19 + 0x134) <= fVar1)) && (fVar1 < *(float *)(unaff_x19 + 0x13c))) {
    fStack000000000000001c = fVar1;
    func_0x000f397c(0x3f800000);
  }
  func_0x000f0b24();
  return;
}


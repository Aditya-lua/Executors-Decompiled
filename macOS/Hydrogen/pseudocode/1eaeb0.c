
void FUN_001eaeb0(void)

{
  undefined1 *puVar1;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  undefined8 *unaff_x21;
  undefined1 *unaff_x22;
  long unaff_x23;
  undefined8 unaff_x24;
  undefined8 unaff_x26;
  long unaff_x27;
  undefined8 unaff_x28;
  undefined8 in_stack_00000008;
  long in_stack_00000048;
  undefined8 in_stack_00000050;
  
  _memcpy();
  unaff_x21[2] = unaff_x20;
  unaff_x21[3] = unaff_x28;
  unaff_x21[4] = unaff_x23;
  unaff_x21[5] = unaff_x24;
  unaff_x21[6] = unaff_x23;
  *unaff_x21 = unaff_x26;
  unaff_x21[1] = unaff_x19;
  if (unaff_x27 != -0x8000000000000000) {
    if (unaff_x23 != 0) {
      puVar1 = unaff_x22;
      do {
        *puVar1 = 0;
        unaff_x23 = unaff_x23 + -1;
        puVar1 = puVar1 + 1;
        unaff_x27 = in_stack_00000048;
      } while (unaff_x23 != 0);
    }
    for (; unaff_x27 != 0; unaff_x27 = unaff_x27 + -1) {
      *unaff_x22 = 0;
      unaff_x22 = unaff_x22 + 1;
    }
    if (in_stack_00000048 != -0x8000000000000000 && in_stack_00000048 != 0) {
      func_0x00187bd4(in_stack_00000050,in_stack_00000048,1);
    }
  }
  func_0x002d8de8(in_stack_00000008);
  return;
}


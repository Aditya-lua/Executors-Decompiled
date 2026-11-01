
void FUN_00679ec0(void)

{
  long *unaff_x20;
  uint unaff_w21;
  
  for (; unaff_w21 < *(uint *)(unaff_x20 + 0x12); unaff_w21 = unaff_w21 + 1) {
    (**(code **)(*unaff_x20 + 0x90))();
    func_0x006771a4();
  }
  return;
}


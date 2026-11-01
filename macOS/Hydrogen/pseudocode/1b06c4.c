
void FUN_001b06c4(void)

{
  bool in_ZR;
  bool in_CY;
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  
  if (in_CY && !in_ZR) {
    func_0x0079b61c();
    unaff_x22 = *(long *)(unaff_x19 + 0x10);
  }
  _memcpy(*(long *)(unaff_x19 + 8) + unaff_x22);
  *(long *)(unaff_x19 + 0x10) = unaff_x22 + unaff_x21;
  func_0x0024031c();
  return;
}


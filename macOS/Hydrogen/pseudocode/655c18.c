
void FUN_00655c18(undefined8 param_1)

{
  long unaff_x19;
  long unaff_x20;
  
  func_0x005ffccc(param_1,unaff_x20 + 0x120);
  if (unaff_x19 != unaff_x20) {
    func_0x00655c5c(unaff_x19 + 0x150,*(long *)(unaff_x20 + 0x150),*(long *)(unaff_x20 + 0x158),
                    (*(long *)(unaff_x20 + 0x158) - *(long *)(unaff_x20 + 0x150) >> 4) *
                    -0x3333333333333333);
  }
  return;
}


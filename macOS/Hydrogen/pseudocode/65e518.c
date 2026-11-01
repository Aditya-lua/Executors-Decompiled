
void FUN_0065e518(undefined8 param_1)

{
  long unaff_x19;
  long unaff_x20;
  
  func_0x00677180(param_1,unaff_x20 + 0x238);
  *(undefined1 *)(unaff_x19 + 600) = *(undefined1 *)(unaff_x20 + 600);
  *(undefined4 *)(unaff_x19 + 0x260) = *(undefined4 *)(unaff_x20 + 0x260);
  func_0x005ffccc(unaff_x19 + 0x268,unaff_x20 + 0x268);
  if (unaff_x19 != unaff_x20) {
    func_0x00655c5c(unaff_x19 + 0x298,*(long *)(unaff_x20 + 0x298),*(long *)(unaff_x20 + 0x2a0),
                    (*(long *)(unaff_x20 + 0x2a0) - *(long *)(unaff_x20 + 0x298) >> 4) *
                    -0x3333333333333333);
  }
  return;
}


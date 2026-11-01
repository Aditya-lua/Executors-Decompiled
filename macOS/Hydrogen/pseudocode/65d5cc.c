
void FUN_0065d5cc(undefined8 param_1)

{
  long unaff_x19;
  long unaff_x20;
  
  func_0x005ffccc(param_1,unaff_x20 + 0x1d0);
  *(undefined1 *)(unaff_x19 + 0x200) = *(undefined1 *)(unaff_x20 + 0x200);
  *(undefined4 *)(unaff_x19 + 0x208) = *(undefined4 *)(unaff_x20 + 0x208);
  func_0x005ffccc(unaff_x19 + 0x210,unaff_x20 + 0x210);
  if (unaff_x19 != unaff_x20) {
    func_0x006557d8(unaff_x19 + 0x240,*(long *)(unaff_x20 + 0x240),*(long *)(unaff_x20 + 0x248),
                    (*(long *)(unaff_x20 + 0x248) - *(long *)(unaff_x20 + 0x240) >> 4) *
                    0x6db6db6db6db6db7);
  }
  return;
}


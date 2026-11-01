
void FUN_006c3274(void)

{
  ulong uVar1;
  long unaff_x19;
  ulong unaff_x22;
  undefined4 unaff_w27;
  
  func_0x006cb1e0();
  uVar1 = *(long *)(unaff_x19 + 0x4d8) - *(long *)(unaff_x19 + 0x4d0) >> 4;
  if (unaff_x22 < uVar1 || unaff_x22 - uVar1 == 0) {
    if (unaff_x22 < uVar1) {
      *(ulong *)(unaff_x19 + 0x4d8) = *(long *)(unaff_x19 + 0x4d0) + unaff_x22 * 0x10;
    }
  }
  else {
    func_0x006cb2a8(unaff_x19 + 0x4d0,unaff_x22 - uVar1);
  }
  *(long *)(unaff_x19 + 0x4f0) = *(long *)(unaff_x19 + 0x4f0) + -0x18;
  *(undefined4 *)(unaff_x19 + 0x484) = unaff_w27;
  return;
}


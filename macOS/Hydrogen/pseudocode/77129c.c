
ulong FUN_0077129c(void)

{
  int iVar1;
  ulong uVar2;
  ulong uVar3;
  uint uVar4;
  long unaff_x19;
  ulong in_stack_00000008;
  ulong in_stack_00000010;
  char in_stack_00000018;
  
  iVar1 = func_0x00729fa8();
  if (iVar1 != 0) {
    do {
      uVar3 = *(ulong *)(unaff_x19 + 400);
      if (in_stack_00000010 <= *(ulong *)(unaff_x19 + 400)) {
        uVar3 = in_stack_00000010;
      }
      uVar2 = func_0x007716d0();
      if ((int)uVar2 != 0) {
        return uVar2;
      }
      func_0x0072a130();
      if (uVar3 != 0) {
        if (in_stack_00000008 <= uVar3) {
          uVar3 = in_stack_00000008;
        }
        *(ulong *)(unaff_x19 + 400) = *(long *)(unaff_x19 + 400) - uVar3;
      }
    } while ((in_stack_00000010 <= in_stack_00000008) &&
            (uVar3 = func_0x00729fa8(), (uVar3 & 1) != 0));
  }
  uVar3 = func_0x007298e4();
  if ((uVar3 & 1) == 0) {
    return 0x51;
  }
  uVar4 = *(uint *)(unaff_x19 + 0x1c1);
  if ((uVar4 & 0x60) == 0x20) {
    uVar3 = func_0x007716d0();
    if ((int)uVar3 != 0) {
      return uVar3;
    }
    uVar4 = *(uint *)(unaff_x19 + 0x1c1);
  }
  if ((uVar4 & 0x160) != 0x60) {
    return 0;
  }
  if ((uVar4 >> 0x14 & 1) != 0) {
    uVar3 = func_0x00783030();
    if ((int)uVar3 != 0) {
      if ((*(byte *)(unaff_x19 + 0x1c3) >> 5 & 1) == 0) {
        return uVar3;
      }
      if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
      in_stack_00000018 = '\x01';
    }
    uVar4 = 0x51;
    if (in_stack_00000018 != '\0') {
      uVar4 = 0;
    }
    if (in_stack_00000018 == '\0') {
      return (ulong)uVar4;
    }
  }
  uVar3 = func_0x00771a88();
  return uVar3;
}


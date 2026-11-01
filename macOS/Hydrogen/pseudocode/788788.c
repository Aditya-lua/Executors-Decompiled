
undefined8 FUN_00788788(void)

{
  bool in_CY;
  int iVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  undefined8 uVar5;
  uint uVar6;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  long unaff_x23;
  undefined8 *in_stack_00000008;
  
  if (!in_CY) {
    return 0;
  }
  if (((*(byte *)((long)*(undefined8 **)(unaff_x23 + 0x3a0) + 0x9c) & 1) != 0) ||
     ((*(ulong *)(unaff_x23 + 0x398) & 9) != 1)) {
    iVar1 = func_0x0077e6f8(**(undefined8 **)(unaff_x23 + 0x3a0),
                            **(undefined8 **)(unaff_x21 + 0x3a0));
    if (iVar1 == 0) {
      if (*(int *)(*(long *)(unaff_x21 + 0x3a0) + 0x98) !=
          *(int *)(*(long *)(unaff_x23 + 0x3a0) + 0x94)) {
        return 0;
      }
      if ((*(byte *)(unaff_x21 + 0x39b) >> 3 & 1) == 0) {
        return 0;
      }
    }
    uVar6 = (uint)*(undefined8 *)(unaff_x23 + 0x398);
    if ((uVar6 >> 8 & 1) != 0) {
      uVar5 = func_0x0077e6f8(*(undefined8 *)(unaff_x23 + 0x98),*(undefined8 *)(unaff_x21 + 0x98));
      if ((int)uVar5 == 0) {
        return uVar5;
      }
      uVar6 = (uint)*(undefined8 *)(unaff_x23 + 0x398);
    }
    if (((uVar6 >> 9 & 1) != 0) && (*(int *)(unaff_x23 + 0x51c) != *(int *)(unaff_x21 + 0x51c))) {
      return 0;
    }
    uVar5 = func_0x0077e6f8(*(undefined8 *)(unaff_x23 + 0x68),*(undefined8 *)(unaff_x21 + 0x68));
    if ((int)uVar5 == 0) {
      return uVar5;
    }
    if (*(int *)(unaff_x23 + 0x518) != *(int *)(unaff_x21 + 0x518)) {
      return 0;
    }
    if (((*(byte *)(*(long *)(unaff_x23 + 0x3a0) + 0x9c) & 1) != 0) &&
       (iVar1 = func_0x00793054(), iVar1 == 0)) {
      return 0;
    }
  }
  lVar2 = func_0x006f4058();
  if (lVar2 == 0) {
    iVar1 = func_0x00784c74();
    if (iVar1 == 0) {
LAB_00788938:
      *unaff_x20 = unaff_x21;
      return 1;
    }
    func_0x00732ed0();
  }
  else {
    uVar3 = func_0x006f4058();
    uVar4 = func_0x0076bb20(*(undefined8 *)(unaff_x19 + 0xd0));
    if (uVar3 < (uVar4 & 0xffffffff)) {
      uVar3 = func_0x006f4058();
      uVar4 = func_0x007320a0();
      if (uVar3 < uVar4) {
        if (((int)*in_stack_00000008 < 0) &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8))))) {
          func_0x0073cab8();
        }
        goto LAB_00788938;
      }
      if (-1 < (int)*in_stack_00000008) {
        return 0;
      }
      if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) != 0) &&
         (*(int *)(*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + unaff_x19 + 0x18) + 8) < 1)) {
        return 0;
      }
      func_0x006f4058();
    }
    else {
      if (-1 < *(char *)((long)in_stack_00000008 + 3)) {
        return 0;
      }
      if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) != 0) &&
         (*(int *)(*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + unaff_x19 + 0x18) + 8) < 1)) {
        return 0;
      }
      func_0x006f4058();
    }
    func_0x0073cab8();
  }
  return 0;
}


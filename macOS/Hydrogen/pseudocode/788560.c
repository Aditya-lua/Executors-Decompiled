
undefined8 FUN_00788560(void)

{
  int iVar1;
  uint uVar2;
  uint uVar3;
  long lVar4;
  undefined8 uVar5;
  ulong uVar6;
  byte bVar7;
  ulong uVar8;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  long unaff_x23;
  ulong *unaff_x24;
  
  lVar4 = func_0x00156654();
  if (*(long *)(lVar4 + 0xd0) != *(long *)(unaff_x19 + 0xd0)) {
    return 0;
  }
  if (*(long *)(unaff_x23 + 0x500) == 0) {
    if (*(long *)(unaff_x21 + 0x500) != 0) {
      return 0;
    }
  }
  else {
    if (*(long *)(unaff_x21 + 0x500) == 0) {
      return 0;
    }
    iVar1 = _strcmp();
    if (iVar1 != 0) {
      return 0;
    }
    if (((*(uint *)(unaff_x21 + 0x398) ^ *(uint *)(unaff_x23 + 0x398)) >> 0x1a & 1) != 0) {
      return 0;
    }
  }
  uVar3 = *(uint *)(*(long *)(unaff_x23 + 0x3a0) + 0x9c);
  uVar2 = func_0x007315f4();
  if (((uVar3 ^ 0xffffffff) & 1) == (uVar2 ^ 1)) {
    uVar3 = (uint)*(undefined8 *)(unaff_x21 + 0x398);
  }
  else {
    if (*(int *)(*(long *)(unaff_x21 + 0x3a0) + 0x98) !=
        *(int *)(*(long *)(unaff_x23 + 0x3a0) + 0x94)) {
      return 0;
    }
    uVar3 = (uint)*(undefined8 *)(unaff_x21 + 0x398);
    if ((uVar3 >> 0x1b & 1) == 0) {
      return 0;
    }
  }
  uVar8 = *(ulong *)(unaff_x23 + 0x398);
  if (((uVar3 ^ (uint)uVar8) & 1) != 0) {
    return 0;
  }
  uVar2 = (uint)uVar8 >> 1 & 1;
  if (uVar2 != (uVar3 >> 1 & 1)) {
    return 0;
  }
  if (uVar2 != 0) {
    uVar5 = func_0x00788a98(unaff_x23 + 0xa8,unaff_x21 + 0xa8);
    if ((int)uVar5 == 0) {
      return uVar5;
    }
    uVar8 = *(ulong *)(unaff_x23 + 0x398);
  }
  if ((uVar8 & 1) != 0) {
    if (((*(uint *)(unaff_x21 + 0x398) ^ (uint)uVar8) >> 3 & 1) != 0) {
      return 0;
    }
    uVar5 = func_0x00788b2c(unaff_x23 + 0xe0,unaff_x21 + 0xe0);
    if ((int)uVar5 == 0) {
      return uVar5;
    }
    if ((*(byte *)(unaff_x23 + 0x104) & 0xfe) == 2) {
      if (*(byte *)(unaff_x23 + 0x104) != *(byte *)(unaff_x21 + 0x104)) {
        return 0;
      }
      uVar5 = func_0x00793054();
      if ((int)uVar5 == 0) {
        return uVar5;
      }
    }
  }
  bVar7 = *(byte *)(unaff_x20 + 3);
  if ((bVar7 & 1) == 0) {
    lVar4 = *(long *)(unaff_x23 + 0x3a0);
  }
  else {
    lVar4 = *(long *)(unaff_x23 + 0x3a0);
    if (((*(char *)((long)unaff_x24 + 0x926) == '\x03') && ((*(byte *)(lVar4 + 0x94) & 1) != 0)) &&
       (*(char *)(unaff_x21 + 0x52c) == '\0')) {
      iVar1 = (int)*unaff_x24;
      if ((*unaff_x24 >> 0x2d & 1) != 0) {
        if ((iVar1 < 0) &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8))))) {
          func_0x0073cab8();
          bVar7 = *(byte *)(unaff_x20 + 3);
        }
        *unaff_x20 = 0;
        *(byte *)(unaff_x20 + 3) = bVar7 | 8;
        return 1;
      }
      if (-1 < iVar1) {
        return 0;
      }
      if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) != 0) &&
         (*(int *)(*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + unaff_x19 + 0x18) + 8) < 1)) {
        return 0;
      }
      goto LAB_00788540;
    }
  }
  if (-1 < *(char *)(lVar4 + 0x9c)) {
    iVar1 = func_0x0077e89c(*(undefined8 *)(unaff_x23 + 0x1e0),*(undefined8 *)(unaff_x21 + 0x1e0));
    if (iVar1 != 0) {
      return 0;
    }
    iVar1 = func_0x0077e89c(*(undefined8 *)(unaff_x23 + 0x1e8),*(undefined8 *)(unaff_x21 + 0x1e8));
    if (iVar1 != 0) {
      return 0;
    }
    iVar1 = func_0x0077e89c(*(undefined8 *)(unaff_x23 + 0x1f8),*(undefined8 *)(unaff_x21 + 0x1f8));
    if (iVar1 != 0) {
      return 0;
    }
    iVar1 = func_0x0077e89c(*(undefined8 *)(unaff_x23 + 0x200),*(undefined8 *)(unaff_x21 + 0x200));
    if (iVar1 != 0) {
      return 0;
    }
    lVar4 = *(long *)(unaff_x23 + 0x3a0);
  }
  if (((*(uint *)(lVar4 + 0x94) & 0xc0000003) == 0) ||
     (*(char *)((long)unaff_x24 + 0x926) == '\x04')) {
    if ((*(byte *)(lVar4 + 0x98) & 0xc) != 0) {
      iVar1 = func_0x0077e89c(*(undefined8 *)(unaff_x23 + 0x488),*(undefined8 *)(unaff_x21 + 0x488))
      ;
      if (iVar1 != 0) {
        return 0;
      }
      iVar1 = func_0x0077e89c(*(undefined8 *)(unaff_x23 + 0x490),*(undefined8 *)(unaff_x21 + 0x490))
      ;
      if (iVar1 != 0) {
        return 0;
      }
      if (*(char *)(unaff_x23 + 0x4f8) != *(char *)(unaff_x21 + 0x4f8)) {
        return 0;
      }
      if (*(char *)(unaff_x23 + 0x4f9) != *(char *)(unaff_x21 + 0x4f9)) {
        return 0;
      }
    }
  }
  else {
    uVar3 = func_0x00731664();
    if ((0x1d < uVar3) && (*(byte *)((long)unaff_x24 + 0x926) < 0x1e)) {
      return 0;
    }
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
    uVar3 = (uint)*(undefined8 *)(unaff_x23 + 0x398);
    if ((uVar3 >> 8 & 1) != 0) {
      uVar5 = func_0x0077e6f8(*(undefined8 *)(unaff_x23 + 0x98),*(undefined8 *)(unaff_x21 + 0x98));
      if ((int)uVar5 == 0) {
        return uVar5;
      }
      uVar3 = (uint)*(undefined8 *)(unaff_x23 + 0x398);
    }
    if (((uVar3 >> 9 & 1) != 0) && (*(int *)(unaff_x23 + 0x51c) != *(int *)(unaff_x21 + 0x51c))) {
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
  lVar4 = func_0x006f4058();
  if (lVar4 == 0) {
    iVar1 = func_0x00784c74();
    if (iVar1 != 0) {
      func_0x00732ed0();
      return 0;
    }
LAB_00788938:
    *unaff_x20 = unaff_x21;
    return 1;
  }
  uVar8 = func_0x006f4058();
  uVar6 = func_0x0076bb20(*(undefined8 *)(unaff_x19 + 0xd0));
  if (uVar8 < (uVar6 & 0xffffffff)) {
    uVar8 = func_0x006f4058();
    uVar6 = func_0x007320a0();
    if (uVar8 < uVar6) {
      if (((int)*unaff_x24 < 0) &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
      goto LAB_00788938;
    }
    if (-1 < (int)*unaff_x24) {
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
    if (-1 < *(char *)((long)unaff_x24 + 3)) {
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
LAB_00788540:
  func_0x0073cab8();
  return 0;
}


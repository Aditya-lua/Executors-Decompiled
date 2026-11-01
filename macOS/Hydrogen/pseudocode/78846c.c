
undefined8 FUN_0078846c(undefined8 param_1,long param_2)

{
  long lVar1;
  int iVar2;
  uint uVar3;
  uint uVar4;
  long lVar5;
  undefined8 uVar6;
  ulong uVar7;
  byte bVar8;
  uint in_w8;
  ulong uVar9;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  uint unaff_w22;
  long unaff_x23;
  
  if (in_w8 != *(ushort *)(unaff_x23 + 0x510)) {
    return 0;
  }
  if (param_2 != 0) {
    if (*(long *)(unaff_x21 + 0x508) == 0) {
      return 0;
    }
    iVar2 = _strcmp();
    if (iVar2 != 0) {
      return 0;
    }
  }
  if (((*(uint *)(unaff_x23 + 0x398) ^ unaff_w22) & 0x300) != 0) {
    return 0;
  }
  iVar2 = func_0x00731574();
  if ((iVar2 == 0) || ((*(byte *)(unaff_x21 + 0x39a) >> 5 & 1) != 0)) {
    if ((*(byte *)(unaff_x20 + 3) & 1) == 0) {
      return 0;
    }
    *(byte *)(unaff_x20 + 3) = *(byte *)(unaff_x20 + 3) | 0x20;
    if (-1 < *(char *)(unaff_x19 + 0xa1d)) {
      return 0;
    }
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) goto LAB_00788540;
    iVar2 = *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8);
joined_r0x0078852c:
    if (iVar2 < 1) {
      return 0;
    }
  }
  else {
    lVar1 = unaff_x21 + 0x3c8;
    lVar5 = func_0x006f4058(lVar1);
    if (lVar5 != 0) {
      bVar8 = *(byte *)(unaff_x20 + 3);
      if ((*(byte *)(unaff_x21 + 0x39a) >> 6 & 1) == 0) {
        *(byte *)(unaff_x20 + 3) = bVar8 | 0x40;
        return 0;
      }
      *(byte *)(unaff_x20 + 3) = bVar8 | 0x80;
      if ((bVar8 & 1) == 0) {
        return 0;
      }
      func_0x00740a58(lVar1);
      lVar5 = func_0x00156654();
      if (*(long *)(lVar5 + 0xd0) != *(long *)(unaff_x19 + 0xd0)) {
        return 0;
      }
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
      iVar2 = _strcmp();
      if (iVar2 != 0) {
        return 0;
      }
      if (((*(uint *)(unaff_x21 + 0x398) ^ *(uint *)(unaff_x23 + 0x398)) >> 0x1a & 1) != 0) {
        return 0;
      }
    }
    uVar4 = *(uint *)(*(long *)(unaff_x23 + 0x3a0) + 0x9c);
    uVar3 = func_0x007315f4();
    if (((uVar4 ^ 0xffffffff) & 1) == (uVar3 ^ 1)) {
      uVar4 = (uint)*(undefined8 *)(unaff_x21 + 0x398);
    }
    else {
      if (*(int *)(*(long *)(unaff_x21 + 0x3a0) + 0x98) !=
          *(int *)(*(long *)(unaff_x23 + 0x3a0) + 0x94)) {
        return 0;
      }
      uVar4 = (uint)*(undefined8 *)(unaff_x21 + 0x398);
      if ((uVar4 >> 0x1b & 1) == 0) {
        return 0;
      }
    }
    uVar9 = *(ulong *)(unaff_x23 + 0x398);
    if (((uVar4 ^ (uint)uVar9) & 1) != 0) {
      return 0;
    }
    uVar3 = (uint)uVar9 >> 1 & 1;
    if (uVar3 != (uVar4 >> 1 & 1)) {
      return 0;
    }
    if (uVar3 != 0) {
      uVar6 = func_0x00788a98(unaff_x23 + 0xa8,unaff_x21 + 0xa8);
      if ((int)uVar6 == 0) {
        return uVar6;
      }
      uVar9 = *(ulong *)(unaff_x23 + 0x398);
    }
    if ((uVar9 & 1) != 0) {
      if (((*(uint *)(unaff_x21 + 0x398) ^ (uint)uVar9) >> 3 & 1) != 0) {
        return 0;
      }
      uVar6 = func_0x00788b2c(unaff_x23 + 0xe0,unaff_x21 + 0xe0);
      if ((int)uVar6 == 0) {
        return uVar6;
      }
      if ((*(byte *)(unaff_x23 + 0x104) & 0xfe) == 2) {
        if (*(byte *)(unaff_x23 + 0x104) != *(byte *)(unaff_x21 + 0x104)) {
          return 0;
        }
        uVar6 = func_0x00793054();
        if ((int)uVar6 == 0) {
          return uVar6;
        }
      }
    }
    bVar8 = *(byte *)(unaff_x20 + 3);
    if ((bVar8 & 1) == 0) {
      lVar5 = *(long *)(unaff_x23 + 0x3a0);
    }
    else {
      lVar5 = *(long *)(unaff_x23 + 0x3a0);
      if ((((&UNK_00001340)[unaff_x19] == '\x03') && ((*(byte *)(lVar5 + 0x94) & 1) != 0)) &&
         (*(char *)(unaff_x21 + 0x52c) == '\0')) {
        uVar9 = *(ulong *)(unaff_x19 + 0xa1a);
        iVar2 = (int)uVar9;
        if ((uVar9 >> 0x2d & 1) != 0) {
          if ((iVar2 < 0) &&
             ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + unaff_x19 + 0x18) == 0 ||
              (0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + unaff_x19 + 0x18) + 8))))) {
            func_0x0073cab8();
            bVar8 = *(byte *)(unaff_x20 + 3);
          }
          *unaff_x20 = 0;
          *(byte *)(unaff_x20 + 3) = bVar8 | 8;
          return 1;
        }
        if (-1 < iVar2) {
          return 0;
        }
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0) goto LAB_00788540;
        iVar2 = *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8);
        goto joined_r0x0078852c;
      }
    }
    if (-1 < *(char *)(lVar5 + 0x9c)) {
      iVar2 = func_0x0077e89c(*(undefined8 *)(unaff_x23 + 0x1e0),*(undefined8 *)(unaff_x21 + 0x1e0))
      ;
      if (iVar2 != 0) {
        return 0;
      }
      iVar2 = func_0x0077e89c(*(undefined8 *)(unaff_x23 + 0x1e8),*(undefined8 *)(unaff_x21 + 0x1e8))
      ;
      if (iVar2 != 0) {
        return 0;
      }
      iVar2 = func_0x0077e89c(*(undefined8 *)(unaff_x23 + 0x1f8),*(undefined8 *)(unaff_x21 + 0x1f8))
      ;
      if (iVar2 != 0) {
        return 0;
      }
      iVar2 = func_0x0077e89c(*(undefined8 *)(unaff_x23 + 0x200),*(undefined8 *)(unaff_x21 + 0x200))
      ;
      if (iVar2 != 0) {
        return 0;
      }
      lVar5 = *(long *)(unaff_x23 + 0x3a0);
    }
    if (((*(uint *)(lVar5 + 0x94) & 0xc0000003) == 0) || ((&UNK_00001340)[unaff_x19] == '\x04')) {
      if ((*(byte *)(lVar5 + 0x98) & 0xc) != 0) {
        iVar2 = func_0x0077e89c(*(undefined8 *)(unaff_x23 + 0x488),
                                *(undefined8 *)(unaff_x21 + 0x488));
        if (iVar2 != 0) {
          return 0;
        }
        iVar2 = func_0x0077e89c(*(undefined8 *)(unaff_x23 + 0x490),
                                *(undefined8 *)(unaff_x21 + 0x490));
        if (iVar2 != 0) {
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
      uVar4 = func_0x00731664();
      if ((0x1d < uVar4) && ((byte)(&UNK_00001340)[unaff_x19] < 0x1e)) {
        return 0;
      }
    }
    if (((*(byte *)((long)*(undefined8 **)(unaff_x23 + 0x3a0) + 0x9c) & 1) != 0) ||
       ((*(ulong *)(unaff_x23 + 0x398) & 9) != 1)) {
      iVar2 = func_0x0077e6f8(**(undefined8 **)(unaff_x23 + 0x3a0),
                              **(undefined8 **)(unaff_x21 + 0x3a0));
      if (iVar2 == 0) {
        if (*(int *)(*(long *)(unaff_x21 + 0x3a0) + 0x98) !=
            *(int *)(*(long *)(unaff_x23 + 0x3a0) + 0x94)) {
          return 0;
        }
        if ((*(byte *)(unaff_x21 + 0x39b) >> 3 & 1) == 0) {
          return 0;
        }
      }
      uVar4 = (uint)*(undefined8 *)(unaff_x23 + 0x398);
      if ((uVar4 >> 8 & 1) != 0) {
        uVar6 = func_0x0077e6f8(*(undefined8 *)(unaff_x23 + 0x98),*(undefined8 *)(unaff_x21 + 0x98))
        ;
        if ((int)uVar6 == 0) {
          return uVar6;
        }
        uVar4 = (uint)*(undefined8 *)(unaff_x23 + 0x398);
      }
      if (((uVar4 >> 9 & 1) != 0) && (*(int *)(unaff_x23 + 0x51c) != *(int *)(unaff_x21 + 0x51c))) {
        return 0;
      }
      uVar6 = func_0x0077e6f8(*(undefined8 *)(unaff_x23 + 0x68),*(undefined8 *)(unaff_x21 + 0x68));
      if ((int)uVar6 == 0) {
        return uVar6;
      }
      if (*(int *)(unaff_x23 + 0x518) != *(int *)(unaff_x21 + 0x518)) {
        return 0;
      }
      if (((*(byte *)(*(long *)(unaff_x23 + 0x3a0) + 0x9c) & 1) != 0) &&
         (iVar2 = func_0x00793054(), iVar2 == 0)) {
        return 0;
      }
    }
    lVar5 = func_0x006f4058(lVar1);
    if (lVar5 == 0) {
      iVar2 = func_0x00784c74();
      if (iVar2 != 0) {
        func_0x00732ed0();
        return 0;
      }
LAB_00788938:
      *unaff_x20 = unaff_x21;
      return 1;
    }
    uVar9 = func_0x006f4058(lVar1);
    uVar7 = func_0x0076bb20(*(undefined8 *)(unaff_x19 + 0xd0));
    if (uVar9 < (uVar7 & 0xffffffff)) {
      uVar9 = func_0x006f4058(lVar1);
      uVar7 = func_0x007320a0();
      iVar2 = (int)*(ulong *)(unaff_x19 + 0xa1a);
      if (uVar9 < uVar7) {
        if ((iVar2 < 0) &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8))))) {
          func_0x0073cab8();
        }
        goto LAB_00788938;
      }
      if (-1 < iVar2) {
        return 0;
      }
      if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) != 0) &&
         (*(int *)(*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + unaff_x19 + 0x18) + 8) < 1)) {
        return 0;
      }
      func_0x006f4058(lVar1);
    }
    else {
      if (-1 < *(char *)(unaff_x19 + 0xa1d)) {
        return 0;
      }
      if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) != 0) &&
         (*(int *)(*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + unaff_x19 + 0x18) + 8) < 1)) {
        return 0;
      }
      func_0x006f4058(lVar1);
    }
  }
LAB_00788540:
  func_0x0073cab8();
  return 0;
}


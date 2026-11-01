
ulong FUN_0072c860(void)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  long lVar6;
  uint *puVar7;
  long *unaff_x19;
  long unaff_x20;
  char *unaff_x21;
  ulong unaff_x22;
  long lVar8;
  uint *unaff_x25;
  
  func_0x00768170();
  uVar2 = *(ulong *)(unaff_x25 + 0x26);
  if (1 < uVar2) {
    lVar1 = *(long *)(unaff_x25 + 0x1a);
    if ((lVar1 != 0) && (unaff_x25[0x1c] == 0)) {
      if (((unaff_x20 != 0) && (*(char *)(unaff_x20 + 0xa1d) < '\0')) &&
         (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x20 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x20 + 0x18) + 8))) && (0 < *(int *)(*unaff_x19 + 0xc)))))
      {
        func_0x0073cbdc();
        lVar1 = *(long *)(unaff_x25 + 0x1a);
      }
      lVar8 = unaff_x19[1];
      unaff_x19[1] = lVar1;
      unaff_x22 = func_0x00731158();
      unaff_x25[0x1c] = (uint)unaff_x22;
      *(long *)(unaff_x25 + 0x1a) = unaff_x19[1];
      unaff_x19[1] = lVar8;
      if ((uint)unaff_x22 == 0) {
        if (*unaff_x21 != '\0') {
          func_0x0072d6ec();
          unaff_x22 = 0;
          goto joined_r0x0072ca98;
        }
        unaff_x22 = 0;
      }
    }
    uVar2 = *(ulong *)(unaff_x25 + 0x26);
  }
  if (uVar2 == 0) {
    uVar4 = 0;
  }
  else {
    if (uVar2 < 4) {
      uVar4 = 0;
      uVar3 = 0;
    }
    else {
      lVar1 = 0;
      lVar8 = 0;
      lVar5 = 0;
      lVar6 = 0;
      uVar3 = uVar2 & 0xfffffffffffffffc;
      puVar7 = unaff_x25 + 0x1c;
      uVar4 = uVar3;
      do {
        if (puVar7[-0xe] != 0) {
          lVar1 = lVar1 + 1;
        }
        if (*puVar7 != 0) {
          lVar8 = lVar8 + 1;
        }
        if (puVar7[0xe] != 0) {
          lVar5 = lVar5 + 1;
        }
        if (puVar7[0x1c] != 0) {
          lVar6 = lVar6 + 1;
        }
        puVar7 = puVar7 + 0x38;
        uVar4 = uVar4 - 4;
      } while (uVar4 != 0);
      uVar4 = lVar6 + lVar5 + lVar8 + lVar1;
      if (uVar2 == uVar3) goto LAB_0072ca60;
    }
    lVar1 = uVar2 - uVar3;
    puVar7 = unaff_x25 + uVar3 * 0xe;
    do {
      puVar7 = puVar7 + 0xe;
      if (*puVar7 != 0) {
        uVar4 = uVar4 + 1;
      }
      lVar1 = lVar1 + -1;
    } while (lVar1 != 0);
  }
LAB_0072ca60:
  if (uVar4 != uVar2) {
    unaff_x22 = 0;
    *unaff_x21 = '\0';
    goto joined_r0x0072ca98;
  }
  if ((unaff_x20 != 0) && (*(char *)(unaff_x20 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x20 + 0x18) == 0) {
      if (unaff_x19 != (long *)0x0) goto LAB_0072caa4;
    }
    else if ((unaff_x19 != (long *)0x0) &&
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x20 + 0x18) + 8))) {
LAB_0072caa4:
      if (0 < *(int *)(*unaff_x19 + 0xc)) {
        func_0x0073cbdc();
        uVar2 = *(ulong *)(unaff_x25 + 0x26);
      }
    }
  }
  if (uVar2 != 0) {
    puVar7 = unaff_x25;
    do {
      puVar7 = puVar7 + 0xe;
      if (*puVar7 != 0) {
        unaff_x22 = (ulong)*puVar7;
        break;
      }
      uVar2 = uVar2 - 1;
    } while (uVar2 != 0);
  }
  *unaff_x25 = 3;
joined_r0x0072ca98:
  if ((unaff_x20 != 0) && (*(char *)(unaff_x20 + 0xa1d) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x20 + 0x18) == 0) {
      if (unaff_x19 == (long *)0x0) {
        return unaff_x22;
      }
    }
    else {
      if (unaff_x19 == (long *)0x0) {
        return unaff_x22;
      }
      if (*(int *)(*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + unaff_x20 + 0x18) + 8) < 1) {
        return unaff_x22;
      }
    }
    if (0 < *(int *)(*unaff_x19 + 0xc)) {
      func_0x0073cbdc();
    }
  }
  return unaff_x22;
}


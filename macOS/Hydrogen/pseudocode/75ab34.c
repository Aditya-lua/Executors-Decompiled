
undefined8 FUN_0075ab34(void)

{
  char cVar1;
  int iVar2;
  undefined8 uVar3;
  long *plVar4;
  long unaff_x19;
  char *unaff_x20;
  long *unaff_x21;
  undefined4 uVar5;
  long *unaff_x25;
  byte bVar6;
  
  func_0x0073cbdc();
  uVar3 = (**(code **)(*(long *)unaff_x21[1] + 0x18))();
  if ((int)uVar3 == 0) {
    if (unaff_x19 == 0) {
      do {
        if (*unaff_x20 == '\0') {
          return 0;
        }
        *unaff_x20 = '\0';
        if (*unaff_x25 != 0) goto LAB_0075ad2c;
        iVar2 = func_0x007315d0(unaff_x21[1]);
        if (iVar2 == 0) {
          bVar6 = 2;
        }
        else {
          bVar6 = *(byte *)(unaff_x21[3] + 0x529);
          if (2 < bVar6) {
            return 7;
          }
        }
        uVar3 = func_0x0072bb54();
        if ((int)uVar3 != 0) {
          return uVar3;
        }
        plVar4 = (long *)unaff_x21[1];
        uVar5 = 10;
        if (bVar6 != 1) {
          uVar5 = 0xb;
        }
        *unaff_x25 = (long)plVar4;
        *(undefined4 *)(unaff_x25 + 1) = uVar5;
        uVar3 = (**(code **)(*plVar4 + 0x18))(plVar4,0);
      } while ((int)uVar3 == 0);
    }
    else {
      do {
        if (*unaff_x20 == '\0') {
          return 0;
        }
        *unaff_x20 = '\0';
        if (*unaff_x25 != 0) {
LAB_0075ad2c:
          *(byte *)((long)unaff_x21 + 0x24) = *(byte *)((long)unaff_x21 + 0x24) | 1;
          *unaff_x20 = '\x01';
          return 0;
        }
        iVar2 = func_0x007315d0(unaff_x21[1]);
        if (iVar2 == 0) {
          bVar6 = 2;
          cVar1 = *(char *)(unaff_x19 + 0xa1d);
        }
        else {
          bVar6 = *(byte *)(unaff_x21[3] + 0x529);
          if (2 < bVar6) {
            if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
               ((*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x19 + 0x18) == 0 ||
                (0 < *(int *)(*(long *)(
                                       "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                       + unaff_x19 + 0x18) + 8))))) {
              func_0x0073cab8();
            }
            return 7;
          }
          cVar1 = *(char *)(unaff_x19 + 0xa1d);
        }
        if (((cVar1 < '\0') &&
            ((((*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18) != 0 &&
               (*(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8) < 1)) || (*(int *)(*unaff_x21 + 0xc) < 1)
              ) || (func_0x0073cbdc(), *(char *)(unaff_x19 + 0xa1d) < '\0')))) &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8))))) {
          func_0x0073cab8();
        }
        uVar3 = func_0x0072bb54();
        if ((int)uVar3 != 0) {
          return uVar3;
        }
        plVar4 = (long *)unaff_x21[1];
        uVar5 = 10;
        if (bVar6 != 1) {
          uVar5 = 0xb;
        }
        *unaff_x25 = (long)plVar4;
        *(undefined4 *)(unaff_x25 + 1) = uVar5;
        uVar3 = (**(code **)(*plVar4 + 0x18))();
      } while ((int)uVar3 == 0);
    }
  }
  return uVar3;
}


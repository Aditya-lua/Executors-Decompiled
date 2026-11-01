
undefined8 FUN_00732f3c(undefined8 param_1)

{
  byte bVar1;
  byte bVar2;
  long lVar3;
  int iVar4;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  int unaff_w22;
  
  if (unaff_w22 != 0) {
    bVar1 = *(byte *)(unaff_x19 + 0x98);
    if ((bVar1 & 1) == 0) {
      bVar2 = bVar1;
      if ((*(long *)(unaff_x19 + 0x88) != 0) &&
         ((*(byte *)(*(long *)(unaff_x19 + 0x88) + 4) >> 5 & 1) != 0)) {
        func_0x00779cfc(*(undefined8 *)(unaff_x19 + 0x78),5,2);
        bVar2 = *(byte *)(unaff_x19 + 0x98);
      }
      *(byte *)(unaff_x19 + 0x98) = bVar2 | 1;
    }
    if ((*(byte *)(unaff_x20 + 0x39c) >> 1 & 1) != 0) {
      func_0x00733690();
    }
    (**(code **)(unaff_x19 + 0x90))();
    lVar3 = *(long *)(unaff_x21 + 0xd0);
    iVar4 = (int)*(undefined8 *)(unaff_x21 + 0xa1a);
    if (lVar3 == 0) {
      if ((iVar4 < 0) &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x21 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x21 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
      param_1 = func_0x0073391c(0);
    }
    else {
      if ((iVar4 < 0) &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x21 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x21 + 0x18) + 8))))) {
        func_0x0073cab8();
        lVar3 = *(long *)(unaff_x21 + 0xd0);
      }
      param_1 = func_0x00733728(lVar3 + 0x188);
    }
    if ((bVar1 & 1) == 0) {
      *(byte *)(unaff_x19 + 0x98) = *(byte *)(unaff_x19 + 0x98) & 0xfe;
      if ((*(long *)(unaff_x19 + 0x88) != 0) &&
         ((*(byte *)(*(long *)(unaff_x19 + 0x88) + 4) >> 5 & 1) != 0)) {
        lVar3 = *(long *)(*(long *)(unaff_x19 + 0x78) + 0xe0);
        if (lVar3 == 0) {
          return 3;
        }
        if (((*(uint *)(lVar3 + 4) >> 5 & 1) != 0) && (*(code **)(lVar3 + 0x18) != (code *)0x0)) {
          (**(code **)(lVar3 + 0x18))(*(long *)(unaff_x19 + 0x78),5,*(undefined8 *)(lVar3 + 0x20));
        }
        return 0;
      }
    }
  }
  return param_1;
}


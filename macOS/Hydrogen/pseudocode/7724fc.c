
undefined8 FUN_007724fc(long param_1,undefined8 param_2,undefined4 param_3)

{
  undefined8 uVar1;
  long unaff_x19;
  int unaff_w20;
  long *plVar2;
  
  plVar2 = *(long **)(param_1 + 0x1b0);
  if (*(int *)(param_1 + 0x968) == 0xb) {
    param_3 = 1;
  }
  uVar1 = func_0x00752098(param_1,param_2,param_3);
  if ((unaff_w20 == 0) && (plVar2 != (long *)0x0 && (int)uVar1 == 0)) {
    if (*(int *)(unaff_x19 + 0x968) != 0xb && *plVar2 != plVar2[1]) {
      func_0x0073c9e4();
      return 0x55;
    }
    if ((*(int *)(unaff_x19 + 0x968) != 0xb) ||
       ((((*(int *)(*(long *)(unaff_x19 + 0x18) + 0x408) == -1 &&
          (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) &&
        (func_0x0073cab8(), *(int *)(unaff_x19 + 0x968) != 0xb)))) {
      return 0;
    }
    if ((*(byte *)(unaff_x19 + 0x1c1) >> 4 & 1) != 0) {
      func_0x0073c9e4();
      return 0x38;
    }
    uVar1 = 0;
  }
  return uVar1;
}


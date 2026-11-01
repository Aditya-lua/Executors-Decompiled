
undefined8 FUN_00773068(long param_1)

{
  char cVar1;
  undefined8 uVar2;
  long *plVar3;
  long unaff_x19;
  
  if (param_1 <= *(long *)(unaff_x19 + 0xf8)) {
    return 0;
  }
  plVar3 = *(long **)(unaff_x19 + 0x140);
  if (plVar3 == (long *)0x0) {
    uVar2 = func_0x00773990();
    if ((int)uVar2 != 0) {
      return uVar2;
    }
    plVar3 = *(long **)(unaff_x19 + 0x140);
    if (plVar3 == (long *)0x0) {
      uVar2 = 0x17;
      cVar1 = *(char *)(unaff_x19 + 0xa1d);
      goto joined_r0x00773940;
    }
  }
  uVar2 = (**(code **)(*plVar3 + 0x18))();
  cVar1 = *(char *)(unaff_x19 + 0xa1d);
joined_r0x00773940:
  if (cVar1 < '\0') {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (iRam0000000000a2b560 < 1) {
        return uVar2;
      }
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b560 < 1) {
      return uVar2;
    }
    func_0x0073ce84();
  }
  return uVar2;
}


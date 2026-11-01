
undefined8 FUN_00744864(undefined8 param_1)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x19;
  char *unaff_x20;
  long lVar3;
  long lVar4;
  undefined8 *in_stack_00000018;
  
  if ((int)param_1 != 0) {
    return param_1;
  }
  lVar4 = *(long *)(unaff_x19 + 0x18);
  *(undefined8 *)(unaff_x19 + 0xe8) = 0xffffffffffffffff;
  func_0x00770948();
  func_0x0077093c();
  func_0x00770580();
  func_0x00770554();
  *(byte *)(lVar4 + 0x4fa) = *(byte *)(lVar4 + 0x4fa) | 4;
  if ((*(char *)((long)in_stack_00000018 + 3) < '\0') &&
     (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b570)))) {
    func_0x0073cfbc();
  }
  if ((*(byte *)(unaff_x19 + 0x1c3) >> 1 & 1) != 0) {
    *(undefined4 *)(*(long *)(unaff_x19 + 0x1b0) + 0x10) = 1;
  }
  *unaff_x20 = '\0';
  uVar2 = func_0x00747730();
  if ((int)uVar2 != 0) {
code_r0x00744fec:
    lVar3 = *(long *)(lVar4 + 0x4a8);
    if (lVar3 != 0) {
      if (0 < *(int *)(lVar4 + 0x4e0)) {
        lVar3 = 0;
        do {
          (*pcRam0000000000a2b5f0)(*(undefined8 *)(*(long *)(lVar4 + 0x4a8) + lVar3 * 8));
          *(undefined8 *)(*(long *)(lVar4 + 0x4a8) + lVar3 * 8) = 0;
          lVar3 = lVar3 + 1;
        } while (lVar3 < *(int *)(lVar4 + 0x4e0));
        lVar3 = *(long *)(lVar4 + 0x4a8);
      }
      (*pcRam0000000000a2b5f0)(lVar3);
      *(undefined8 *)(lVar4 + 0x4a8) = 0;
      *(undefined4 *)(lVar4 + 0x4e0) = 0;
    }
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar4 + 0x4a0));
    *(undefined8 *)(lVar4 + 0x4a0) = 0;
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar4 + 0x4b0));
    *(undefined8 *)(lVar4 + 0x4b0) = 0;
    return uVar2;
  }
  lVar3 = *(long *)(unaff_x19 + 0x18);
  uVar2 = func_0x0076dfc0();
  *unaff_x20 = *(char *)(lVar3 + 0x4f6) == '\0';
  iVar1 = func_0x00731574(*(undefined8 *)(unaff_x19 + 0x18),1);
  if (iVar1 == 0) {
    if ((((int)*in_stack_00000018 < 0) &&
        ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
      func_0x0073cfbc();
    }
  }
  else if (((int)*in_stack_00000018 < 0) &&
          ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8))))) {
    func_0x0073cab8();
  }
  if ((((*unaff_x20 != '\0') && (*(char *)((long)in_stack_00000018 + 3) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
    func_0x0073cfbc();
  }
  if ((int)uVar2 != 0) goto code_r0x00744fec;
  if (*unaff_x20 == '\0') {
    return 0;
  }
  lVar4 = *(long *)(unaff_x19 + 0x18);
  lVar3 = *(long *)(unaff_x19 + 0x1b0);
  if (iVar1 == 0) {
    if (*(int *)(lVar3 + 0x10) == 0) {
      *(ulong *)(lVar4 + 0x398) = *(ulong *)(lVar4 + 0x398) | 0x1000;
      goto code_r0x00745108;
    }
  }
  else {
    uVar2 = func_0x0074590c();
    if ((int)uVar2 != 0) {
      if ((*(char *)((long)in_stack_00000018 + 3) < '\0') &&
         (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b570)))) {
        func_0x0073cfbc();
      }
      func_0x00730bf8();
      func_0x00730b8c();
      return uVar2;
    }
    if (*(int *)(lVar3 + 0x10) == 0) goto code_r0x00745108;
  }
  func_0x00783c98();
code_r0x00745108:
  *(byte *)(lVar4 + 0x4fa) = *(byte *)(lVar4 + 0x4fa) | 4;
  return 0;
}



/* WARNING: Removing unreachable block (ram,0x0074575c) */

undefined8 FUN_007454d8(void)

{
  long lVar1;
  long unaff_x19;
  long unaff_x20;
  undefined8 uVar2;
  int unaff_w22;
  long *plVar3;
  undefined8 unaff_x24;
  long unaff_x25;
  undefined8 *unaff_x27;
  ulong unaff_x28;
  undefined1 auVar4 [16];
  undefined8 in_stack_00000030;
  long in_stack_00000038;
  
  lVar1 = *(long *)(unaff_x20 + 0x4a8);
  if (lVar1 != 0) {
    if (0 < *(int *)(unaff_x20 + 0x4e0)) {
      lVar1 = 0;
      do {
        (*(code *)*unaff_x27)(*(undefined8 *)(*(long *)(unaff_x20 + 0x4a8) + lVar1 * 8));
        *(undefined8 *)(*(long *)(unaff_x20 + 0x4a8) + lVar1 * 8) = 0;
        lVar1 = lVar1 + 1;
      } while (lVar1 < *(int *)(unaff_x20 + 0x4e0));
      lVar1 = *(long *)(unaff_x20 + 0x4a8);
    }
    (*(code *)*unaff_x27)(lVar1);
    *(undefined8 *)(unaff_x20 + 0x4a8) = 0;
    *(undefined4 *)(unaff_x20 + 0x4e0) = 0;
  }
  (*(code *)*unaff_x27)(*(undefined8 *)(unaff_x20 + 0x4a0));
  *(undefined8 *)(unaff_x20 + 0x4a0) = 0;
  (*(code *)*unaff_x27)(*(undefined8 *)(unaff_x20 + 0x4b0));
  *(undefined8 *)(unaff_x20 + 0x4b0) = 0;
  if (*(int *)(unaff_x20 + 0x23c) != -1) {
    if ((*(byte *)(unaff_x20 + 0x4fa) >> 1 & 1) == 0) {
      unaff_x24 = 0;
      if (unaff_x19 != 0) goto code_r0x00745398;
    }
    else {
      if (*(long *)(unaff_x19 + 0xf0) < 1) {
        unaff_x24 = 0;
      }
      else {
        unaff_x24 = func_0x0076e34c();
        if ((int)unaff_x24 != 0) {
          func_0x0077e9f4(unaff_x24);
          func_0x0073c9e4();
          *(byte *)(unaff_x20 + 0x4fa) = *(byte *)(unaff_x20 + 0x4fa) & 0xfb;
          func_0x00734f74();
        }
      }
code_r0x00745398:
      if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
         (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b570)))) {
        func_0x0073cfbc();
      }
    }
    func_0x00730bf8();
    func_0x00730b8c();
  }
  if ((int)unaff_x24 == 0) {
    if (((*(int *)(unaff_x25 + 0x10) != 0) || ((*(byte *)(unaff_x20 + 0x4fa) >> 2 & 1) == 0)) ||
       ((*(char *)(unaff_x20 + 0x3f0) == '\0' || ((unaff_x28 & 1) != 0)))) goto code_r0x007456b0;
    uVar2 = *(undefined8 *)(unaff_x20 + 0x420);
    *(undefined **)(unaff_x20 + 0x420) = &UNK_0000ea60;
    auVar4 = func_0x00782d28();
    *(undefined1 (*) [16])(unaff_x20 + 0x410) = auVar4;
    unaff_x24 = func_0x00746324();
    *(undefined8 *)(unaff_x20 + 0x420) = uVar2;
    if ((in_stack_00000038 == 0) && ((int)unaff_x24 == 0x1c)) {
      func_0x0073c9e4();
      *(byte *)(unaff_x20 + 0x4fa) = *(byte *)(unaff_x20 + 0x4fa) & 0xfb;
      func_0x00734f74();
      goto LAB_007458ac;
    }
    if ((int)unaff_x24 != 0) goto LAB_007458ac;
    if ((*(byte *)(unaff_x20 + 0x4fa) >> 1 & 1) == 0) {
      if ((in_stack_00000030._4_4_ == 0xe2) || (in_stack_00000030._4_4_ == 0xfa))
      goto code_r0x007456b0;
      if (in_stack_00000030._4_4_ == 0x228) {
        func_0x0073c9e4();
        unaff_x24 = 0x46;
        goto code_r0x007456b8;
      }
      goto code_r0x007458ec;
    }
    if (0 < *(long *)(unaff_x19 + 0xf0)) {
      if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
      func_0x00734f74();
      return 0;
    }
code_r0x007456b0:
    if ((unaff_x28 & 1) == 0) {
      if (((byte)(&UNK_00001346)[unaff_x19] >> 3 & 1) == 0) {
        lVar1 = *(long *)(unaff_x19 + 0xe8);
        if (((lVar1 != -1) && (lVar1 != *(long *)(unaff_x19 + 0xf8))) &&
           (*(long *)(unaff_x19 + 0xf0) != *(long *)(unaff_x19 + 0xf8))) {
code_r0x007458ec:
          func_0x0073c9e4();
          unaff_x24 = 0x12;
          goto code_r0x007456b8;
        }
        if ((*(byte *)(unaff_x20 + 0x4fa) >> 1 & 1) == 0) {
          unaff_x24 = 0;
          if ((0 < lVar1) && (*(long *)(unaff_x19 + 0xf8) == 0)) {
            func_0x0073c9e4();
            unaff_x24 = 0x13;
          }
          goto code_r0x007456b8;
        }
      }
      else if ((((*(long *)(
                           "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                           + unaff_x19 + 0x30) != -1) &&
                (*(long *)(
                          "/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices"
                          + unaff_x19 + 0x30) != *(long *)(unaff_x19 + 0x100))) &&
               ((*(byte *)(unaff_x19 + 0xa1b) & 1) == 0)) && (*(int *)(unaff_x25 + 0x10) == 0))
      goto code_r0x007458ec;
    }
    unaff_x24 = 0;
  }
code_r0x007456b8:
  *(undefined4 *)(unaff_x25 + 0x10) = 0;
  *(byte *)(unaff_x20 + 0x4fa) = *(byte *)(unaff_x20 + 0x4fa) & 0xfd;
  if (((int)unaff_x24 == 0 && unaff_w22 == 0) && ((unaff_x28 & 1) == 0)) {
    plVar3 = *(long **)(unaff_x19 + 0x6c8);
    if (plVar3 != (long *)0x0) {
      do {
        if (*plVar3 != 0) {
          unaff_x24 = func_0x0076e34c();
          if ((int)unaff_x24 != 0) goto code_r0x007457f4;
          auVar4 = func_0x00782d28();
          *(undefined1 (*) [16])(unaff_x20 + 0x410) = auVar4;
          unaff_x24 = func_0x00746324();
          if ((int)unaff_x24 != 0) goto code_r0x007457f4;
        }
        plVar3 = (long *)plVar3[1];
      } while (plVar3 != (long *)0x0);
      unaff_x24 = 0;
      goto code_r0x007457f4;
    }
    unaff_x24 = 0;
  }
  else {
code_r0x007457f4:
    if (unaff_x19 == 0) goto LAB_007458ac;
  }
  if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (iRam0000000000a2b570 < 1) goto LAB_007458ac;
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b570 < 1)
    goto LAB_007458ac;
    func_0x0073cfbc();
  }
LAB_007458ac:
  (*(code *)*unaff_x27)(*(undefined8 *)(unaff_x25 + 8));
  *(undefined8 *)(unaff_x25 + 8) = 0;
  return unaff_x24;
}


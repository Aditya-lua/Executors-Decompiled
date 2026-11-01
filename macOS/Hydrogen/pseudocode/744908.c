
undefined8 FUN_00744908(void)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  long unaff_x19;
  char *unaff_x20;
  long unaff_x24;
  undefined8 uVar5;
  long *plVar6;
  code *pcVar7;
  long unaff_x28;
  long in_stack_00000010;
  undefined8 *in_stack_00000018;
  
  func_0x00740a58();
  lVar2 = func_0x00156654();
  plVar6 = *(long **)(unaff_x19 + 0x1b0);
  lVar3 = func_0x00764704();
  if (lVar3 == 0) {
    uVar4 = 0x1b;
  }
  else {
    (*pcRam0000000000a2b5f0)(plVar6[1]);
    *plVar6 = lVar3;
    plVar6[1] = lVar3;
    if ((*(char *)((long)in_stack_00000018 + 3) < '\0') &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) {
      func_0x0073cab8();
    }
    if (*(long *)(unaff_x19 + 0x970) != 0) {
      func_0x0076bad4();
      pcVar7 = *(code **)(unaff_x19 + 0x970);
      uVar5 = *(undefined8 *)(unaff_x19 + 0x990);
      uVar4 = func_0x006f4058();
      lVar3 = (*pcVar7)(lVar2,uVar5,uVar4);
      func_0x0076bad4();
      if (lVar3 == 2) {
        if (*(char *)((long)in_stack_00000018 + 3) < '\0') {
          if ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + unaff_x19 + 0x18) == 0) ||
             (0 < *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + unaff_x19 + 0x18) + 8))) {
            func_0x0073cab8();
            *(undefined1 *)(unaff_x28 + 0x40) = 5;
          }
          else {
            *(undefined1 *)(unaff_x28 + 0x40) = 5;
          }
        }
        else {
          *(undefined1 *)(unaff_x28 + 0x40) = 5;
        }
        goto LAB_007448b8;
      }
      if (lVar3 == 1) {
        uVar4 = 0x58;
        goto code_r0x00744d24;
      }
    }
    if (*(int *)(lVar2 + 8) != 0) {
      *(undefined1 *)(unaff_x28 + 0x40) = 5;
LAB_007448b8:
      do {
      } while (7 < *(byte *)(unaff_x28 + 0x40));
                    /* WARNING: Could not recover jumptable at 0x007448d0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar4 = (*(code *)(&UNK_007448d4 +
                        (ulong)*(byte *)(unaff_x24 + (ulong)*(byte *)(unaff_x28 + 0x40)) * 4))();
      return uVar4;
    }
    if ((*(byte *)(lVar2 + 0x60) >> 6 & 1) != 0) {
      *(undefined8 *)(in_stack_00000010 + 0x4d8) = *(undefined8 *)(lVar2 + 0x28);
    }
    uVar4 = func_0x0074b7f8();
    if ((int)uVar4 == 0) {
      func_0x00740a58();
      func_0x0075e5fc();
      lVar2 = func_0x006f4058();
      uVar4 = 0;
      if (lVar2 == 0) {
        *(undefined1 *)(unaff_x28 + 0x40) = 4;
      }
    }
  }
code_r0x00744d24:
  if ((*(byte *)(*(long *)(&UNK_00001348 + unaff_x19) + 0x40) | 2) == 7) {
    return 0;
  }
  if ((int)uVar4 != 0) {
    return uVar4;
  }
  lVar2 = *(long *)(unaff_x19 + 0x18);
  *(undefined8 *)(unaff_x19 + 0xe8) = 0xffffffffffffffff;
  func_0x00770948();
  func_0x0077093c();
  func_0x00770580();
  func_0x00770554();
  *(byte *)(lVar2 + 0x4fa) = *(byte *)(lVar2 + 0x4fa) | 4;
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
  uVar4 = func_0x00747730();
  if ((int)uVar4 != 0) {
code_r0x00744fec:
    lVar3 = *(long *)(lVar2 + 0x4a8);
    if (lVar3 != 0) {
      if (0 < *(int *)(lVar2 + 0x4e0)) {
        lVar3 = 0;
        do {
          (*pcRam0000000000a2b5f0)(*(undefined8 *)(*(long *)(lVar2 + 0x4a8) + lVar3 * 8));
          *(undefined8 *)(*(long *)(lVar2 + 0x4a8) + lVar3 * 8) = 0;
          lVar3 = lVar3 + 1;
        } while (lVar3 < *(int *)(lVar2 + 0x4e0));
        lVar3 = *(long *)(lVar2 + 0x4a8);
      }
      (*pcRam0000000000a2b5f0)(lVar3);
      *(undefined8 *)(lVar2 + 0x4a8) = 0;
      *(undefined4 *)(lVar2 + 0x4e0) = 0;
    }
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar2 + 0x4a0));
    *(undefined8 *)(lVar2 + 0x4a0) = 0;
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar2 + 0x4b0));
    *(undefined8 *)(lVar2 + 0x4b0) = 0;
    return uVar4;
  }
  lVar3 = *(long *)(unaff_x19 + 0x18);
  uVar4 = func_0x0076dfc0();
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
  if ((int)uVar4 != 0) goto code_r0x00744fec;
  if (*unaff_x20 == '\0') {
    return 0;
  }
  lVar2 = *(long *)(unaff_x19 + 0x18);
  lVar3 = *(long *)(unaff_x19 + 0x1b0);
  if (iVar1 == 0) {
    if (*(int *)(lVar3 + 0x10) == 0) {
      *(ulong *)(lVar2 + 0x398) = *(ulong *)(lVar2 + 0x398) | 0x1000;
      goto code_r0x00745108;
    }
  }
  else {
    uVar4 = func_0x0074590c();
    if ((int)uVar4 != 0) {
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
      return uVar4;
    }
    if (*(int *)(lVar3 + 0x10) == 0) goto code_r0x00745108;
  }
  func_0x00783c98();
code_r0x00745108:
  *(byte *)(lVar2 + 0x4fa) = *(byte *)(lVar2 + 0x4fa) | 4;
  return 0;
}


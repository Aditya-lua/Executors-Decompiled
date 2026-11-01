
ulong FUN_00791994(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x19;
  int *unaff_x20;
  long *unaff_x21;
  ulong unaff_x22;
  ulong uVar3;
  long unaff_x27;
  long unaff_x29;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long lStack0000000000000028;
  
  if (((param_1 == 0) || (0 < *(int *)(param_1 + 8))) && (0 < *(int *)(*unaff_x21 + 0xc))) {
    func_0x0073cbdc();
  }
  if (*(long *)(unaff_x27 + 0x10) == 0) {
    uVar3 = 0;
    if (unaff_x22 == 0) goto LAB_00791b3c;
  }
  else {
    iVar1 = func_0x00792cd4();
    *unaff_x20 = iVar1;
    if ((((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
        ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*unaff_x21 + 0xc))) {
      func_0x0073cbdc();
      iVar1 = *unaff_x20;
    }
    if (iVar1 != 0) goto LAB_00791b18;
    uVar3 = *(ulong *)(unaff_x27 + 0x10);
    *(undefined8 *)(unaff_x27 + 0x10) = 0;
    if (unaff_x22 <= uVar3) goto LAB_00791b3c;
    if (unaff_x22 == uVar3) goto LAB_00791b3c;
  }
  if (((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
     (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))) && (0 < *(int *)(*unaff_x21 + 0xc))))) {
    func_0x0073cbdc();
  }
  uVar2 = func_0x00173348();
  if ((int)uVar2 == 7000) {
    if (in_stack_00000020 != 0) goto LAB_00791b3c;
  }
  else {
    unaff_x21 = &lStack0000000000000028;
    func_0x0017816c(uVar2,&lStack0000000000000028,0x100,&uStack0000000000000018);
  }
  func_0x0073c9e4();
  *unaff_x20 = 0x17;
LAB_00791b18:
  uVar3 = 0xffffffffffffffff;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return 0xffffffffffffffff;
  }
  do {
    while( true ) {
      ___stack_chk_fail();
LAB_00791b3c:
      iVar1 = func_0x00792cd4(unaff_x21);
      *unaff_x20 = iVar1;
      if (iVar1 != 0) break;
      uVar3 = in_stack_00000020 + uVar3;
      if (((unaff_x19 == 0) || (-1 < *(char *)(unaff_x19 + 0xa1d))) ||
         (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) != 0 &&
           (*(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8) < 1)) || (*(int *)(*unaff_x21 + 0xc) < 1))))
      {
code_r0x00791c44:
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
          return uVar3;
        }
      }
      else {
        func_0x0073cbdc();
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
          return uVar3;
        }
      }
    }
    if (iVar1 != 0x51) {
      uVar3 = 0xffffffffffffffff;
      goto code_r0x00791c44;
    }
    if ((((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
        ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*unaff_x21 + 0xc))) {
      func_0x0073cbdc();
    }
    *(long *)(unaff_x27 + 0x10) = in_stack_00000020;
    if (uVar3 == 0) goto LAB_00791b18;
    *unaff_x20 = 0;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
      return uVar3;
    }
  } while( true );
}


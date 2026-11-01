
undefined8 FUN_00746494(long param_1)

{
  char cVar1;
  int iVar2;
  long lVar3;
  ulong uVar4;
  long in_x9;
  long unaff_x19;
  int *unaff_x20;
  long *unaff_x21;
  undefined8 uVar5;
  long unaff_x26;
  int unaff_w28;
  long in_stack_00000018;
  long in_stack_00000028;
  
  do {
    *unaff_x21 = in_x9 + param_1;
    while( true ) {
      if (*unaff_x20 != 0) {
        uVar5 = 0;
        *(undefined1 *)(unaff_x26 + 0x3f0) = 0;
        cVar1 = *(char *)(in_stack_00000018 + 3);
        goto joined_r0x007464fc;
      }
      lVar3 = func_0x0076df2c();
      if (lVar3 < 1) {
        func_0x0073c9e4();
        return 0x1c;
      }
      lVar3 = func_0x00156654();
      if (((lVar3 != 0) && (unaff_w28 < 2)) || (uVar4 = func_0x007316f8(), (uVar4 & 1) != 0)) break;
      func_0x0076e5dc();
      iVar2 = func_0x007731dc();
      if (iVar2 < 0) {
        ___error();
        func_0x0073c9e4();
        return 0x38;
      }
      if (iVar2 != 0) break;
      iVar2 = func_0x0077011c();
      if (iVar2 != 0) {
        return 0x2a;
      }
    }
    iVar2 = func_0x0076e5dc();
    if (((iVar2 != 0) && (uVar5 = func_0x0076e5ec(), (int)uVar5 != 0)) ||
       (uVar5 = func_0x007465c0(), (int)uVar5 != 0)) {
      *(undefined1 *)(unaff_x26 + 0x3f0) = 0;
      cVar1 = *(char *)(in_stack_00000018 + 3);
joined_r0x007464fc:
      if (((cVar1 < '\0') &&
          ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b570)) {
        func_0x0073cfbc();
      }
      return uVar5;
    }
    if (in_stack_00000028 == 0) {
      lVar3 = func_0x00156654();
      iVar2 = 0;
      if (lVar3 != 0) {
        iVar2 = unaff_w28 + 1;
      }
      unaff_w28 = iVar2;
    }
    else {
      unaff_w28 = 0;
    }
    in_x9 = *unaff_x21;
    param_1 = in_stack_00000028;
  } while( true );
}


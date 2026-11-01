
undefined8 FUN_00746538(void)

{
  char cVar1;
  int iVar2;
  long lVar3;
  ulong uVar4;
  undefined8 uVar5;
  int in_w8;
  long unaff_x19;
  int *unaff_x20;
  long *unaff_x21;
  long unaff_x26;
  int iVar6;
  int iStack0000000000000024;
  long in_stack_00000028;
  
  if (0 < in_w8) {
    func_0x0073cfbc();
  }
  if (unaff_x20 == (int *)0x0) {
    unaff_x20 = &iStack0000000000000024;
  }
  else {
    *unaff_x20 = 0;
  }
  iVar6 = 0;
  *unaff_x21 = 0;
  do {
    lVar3 = func_0x0076df2c();
    if (lVar3 < 1) {
      func_0x0073c9e4();
      return 0x1c;
    }
    lVar3 = func_0x00156654(unaff_x26 + 0x448);
    if (((lVar3 == 0) || (1 < iVar6)) && (uVar4 = func_0x007316f8(), (uVar4 & 1) == 0)) {
      func_0x0076e5dc();
      iVar2 = func_0x007731dc();
      if (iVar2 < 0) {
        ___error();
        func_0x0073c9e4();
        return 0x38;
      }
      if (iVar2 != 0) goto code_r0x00746434;
      iVar2 = func_0x0077011c();
      if (iVar2 != 0) {
        return 0x2a;
      }
    }
    else {
code_r0x00746434:
      iVar2 = func_0x0076e5dc();
      if (((iVar2 != 0) && (uVar5 = func_0x0076e5ec(), (int)uVar5 != 0)) ||
         (uVar5 = func_0x007465c0(), (int)uVar5 != 0)) {
        *(undefined1 *)(unaff_x26 + 0x3f0) = 0;
        cVar1 = *(char *)(unaff_x19 + 0xa1d);
        goto joined_r0x007464cc;
      }
      if (in_stack_00000028 == 0) {
        lVar3 = func_0x00156654(unaff_x26 + 0x448);
        iVar2 = 0;
        if (lVar3 != 0) {
          iVar2 = iVar6 + 1;
        }
        iVar6 = iVar2;
      }
      else {
        iVar6 = 0;
      }
      *unaff_x21 = *unaff_x21 + in_stack_00000028;
    }
    if (*unaff_x20 != 0) {
      uVar5 = 0;
      *(undefined1 *)(unaff_x26 + 0x3f0) = 0;
      cVar1 = *(char *)(unaff_x19 + 0xa1d);
joined_r0x007464cc:
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
  } while( true );
}


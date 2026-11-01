
undefined8 FUN_0078d44c(void)

{
  ulong uVar1;
  undefined8 uVar2;
  long unaff_x19;
  byte *unaff_x23;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  
  do {
    uVar2 = func_0x007841a0(0,in_stack_00000018,in_stack_00000010,0,&uStack0000000000000008);
    if (((int)uVar2 == 0 && uStack0000000000000008 == 0) && in_stack_00000010 != 0) {
LAB_0078d55c:
      if ((char)unaff_x23[3] < '\0') {
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0) {
          if (iRam0000000000a2b5a0 < 1) {
            return 0x51;
          }
        }
        else if (*(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b5a0 < 1) {
          return 0x51;
        }
        func_0x007298b8();
        func_0x0073d364();
      }
      return 0x51;
    }
    while( true ) {
      if ((int)uVar2 != 0) {
        if ((int)uVar2 != 0x51) {
          func_0x0073c9e4();
          return uVar2;
        }
        goto LAB_0078d55c;
      }
      func_0x0072a130();
      uVar1 = func_0x00729fa8();
      if ((uVar1 & 1) == 0) {
        return 0;
      }
      if (((*unaff_x23 & 1) == 0) && (uVar1 = func_0x0076bb00(0), (uVar1 & 1) == 0)) break;
      uVar2 = func_0x00742068(0,in_stack_00000018,in_stack_00000010,&uStack0000000000000008);
    }
  } while( true );
}


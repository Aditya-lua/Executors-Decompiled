
int FUN_00795444(void)

{
  bool bVar1;
  int iVar2;
  long lVar3;
  char cVar4;
  byte bVar5;
  int iVar6;
  long unaff_x19;
  long *unaff_x20;
  undefined8 unaff_x26;
  long *unaff_x27;
  uint unaff_w28;
  undefined8 in_stack_00000008;
  
  do {
    iVar2 = func_0x007318d8();
    if (iVar2 < 0) {
      ___error();
      func_0x0073c9e4();
      bVar5 = 2;
      iVar2 = 0x38;
LAB_007954b8:
      *(undefined8 *)(unaff_x20[2] + 0x48) = unaff_x26;
      *(byte *)((long)unaff_x20 + 0x24) = *(byte *)((long)unaff_x20 + 0x24) & 0xfd | bVar5;
code_r0x007954d0:
      func_0x00734db4();
      iVar6 = 0x50;
      if (in_stack_00000008._7_1_ != '\0') {
        iVar6 = 0;
      }
      if (iVar2 != 0) {
        iVar6 = iVar2;
      }
      func_0x007310e0();
      if ((((unaff_x19 != 0) && (*(char *)(unaff_x19 + 0xa1d) < '\0')) &&
          ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*unaff_x20 + 0xc)))
      {
        func_0x0073cbdc();
      }
      return iVar6;
    }
    if (iVar2 == 0) {
      func_0x0073c9e4();
      bVar5 = 2;
      iVar2 = 0x1c;
      goto LAB_007954b8;
    }
    cVar4 = in_stack_00000008._7_1_;
    do {
      if (cVar4 != '\0') {
code_r0x00795470:
        iVar2 = 0;
code_r0x007954b4:
        bVar5 = 2;
        goto LAB_007954b8;
      }
      bVar1 = 0xfffffffe < unaff_w28;
      unaff_w28 = unaff_w28 + 1;
      if (bVar1) {
        iVar2 = 0;
        bVar5 = 0;
        goto LAB_007954b8;
      }
      lVar3 = func_0x00734c1c(unaff_x20[3],(int)unaff_x20[4],0);
      if (lVar3 < 0) {
        func_0x0073c9e4();
        iVar2 = 0x1c;
        goto code_r0x007954d0;
      }
      iVar2 = (**(code **)(*unaff_x27 + 0x38))();
      if (iVar2 != 0) goto code_r0x007954b4;
      if (in_stack_00000008._7_1_ != '\0') goto code_r0x00795470;
      cVar4 = '\0';
    } while (*(int *)((long)unaff_x27 + 0xc4) == 0);
  } while( true );
}


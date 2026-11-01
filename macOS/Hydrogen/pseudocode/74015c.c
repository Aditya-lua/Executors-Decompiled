
long FUN_0074015c(void)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  undefined8 in_x3;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x22;
  long unaff_x24;
  long unaff_x25;
  long lVar5;
  long unaff_x26;
  long unaff_x27;
  byte *pbVar6;
  byte *unaff_x28;
  long unaff_x29;
  undefined1 auVar7 [16];
  ulong uStack0000000000000008;
  ulong uStack0000000000000010;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  
  do {
    uStack0000000000000008 = (ulong)unaff_x28[-0xb];
    uStack0000000000000010 = (ulong)unaff_x28[-10];
    func_0x00764560(unaff_x24,unaff_x25);
    lVar2 = _strlen(unaff_x24);
    lVar4 = unaff_x24 + lVar2;
    uStack0000000000000008 = (ulong)unaff_x28[-9];
    uStack0000000000000010 = (ulong)unaff_x28[-8];
    func_0x00764560(lVar4,unaff_x25 - lVar2);
    lVar3 = _strlen(lVar4);
    lVar5 = (unaff_x25 - lVar2) - lVar3;
    lVar4 = lVar4 + lVar3;
    uStack0000000000000008 = (ulong)unaff_x28[-7];
    uStack0000000000000010 = (ulong)unaff_x28[-6];
    func_0x00764560(lVar4,lVar5);
    lVar2 = _strlen(lVar4);
    lVar5 = lVar5 - lVar2;
    lVar4 = lVar4 + lVar2;
    uStack0000000000000008 = (ulong)unaff_x28[-5];
    uStack0000000000000010 = (ulong)unaff_x28[-4];
    func_0x00764560(lVar4,lVar5);
    lVar2 = _strlen(lVar4);
    lVar5 = lVar5 - lVar2;
    lVar4 = lVar4 + lVar2;
    uStack0000000000000008 = (ulong)unaff_x28[-3];
    uStack0000000000000010 = (ulong)unaff_x28[-2];
    func_0x00764560(lVar4,lVar5);
    lVar3 = _strlen(lVar4);
    uStack0000000000000008 = (ulong)unaff_x28[-1];
    uStack0000000000000010 = (ulong)*unaff_x28;
    lVar2 = unaff_x21;
    lVar4 = func_0x00764560(lVar4 + lVar3,lVar5 - lVar3);
    if (*(char *)(unaff_x26 + 3) < '\0') {
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x20 + 0x18) == 0) goto code_r0x0074004c;
      if (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x20 + 0x18) + 8)) goto code_r0x0074004c;
    }
    while( true ) {
      pbVar6 = unaff_x28;
      unaff_x28 = pbVar6 + 0x14;
      unaff_x27 = unaff_x27 + 1;
      if (*(int *)(unaff_x19 + 0x260) <= unaff_x27) {
        iVar1 = *(int *)(unaff_x19 + 0x268);
        if (0 < iVar1) {
          lVar3 = 0;
          lVar5 = unaff_x19;
          do {
            if ((*(char *)(unaff_x26 + 3) < '\0') &&
               ((*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x20 + 0x18) == 0 ||
                (0 < *(int *)(*(long *)(
                                       "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                       + unaff_x20 + 0x18) + 8))))) {
              func_0x00740a58(lVar5);
              lVar4 = func_0x0073cab8();
              iVar1 = *(int *)(unaff_x19 + 0x268);
            }
            lVar3 = lVar3 + 1;
            lVar5 = lVar5 + 0x20;
          } while (lVar3 < iVar1);
        }
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
          return lVar4;
        }
        auVar7 = ___stack_chk_fail();
        lVar2 = lVar2 * auVar7._8_8_;
        iVar1 = func_0x0074075c(in_x3,auVar7._0_8_,lVar2);
        if (iVar1 != 0) {
          lVar2 = 0;
        }
        return lVar2;
      }
      if (*(int *)(pbVar6 + 1) == 0x1c) break;
      if (((*(int *)(pbVar6 + 1) == 1) && (*(char *)(unaff_x26 + 3) < '\0')) &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x20 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x20 + 0x18) + 8))))) {
        uStack0000000000000008 = (ulong)pbVar6[6];
        uStack0000000000000010 = (ulong)pbVar6[7];
code_r0x0074004c:
        lVar4 = func_0x0073cab8();
      }
    }
    in_stack_00000068 = unaff_x22[9];
    in_stack_00000060 = unaff_x22[8];
    in_stack_00000078 = unaff_x22[0xb];
    in_stack_00000070 = unaff_x22[10];
    in_stack_00000088 = unaff_x22[0xd];
    in_stack_00000080 = unaff_x22[0xc];
    in_stack_00000098 = unaff_x22[0xf];
    in_stack_00000090 = unaff_x22[0xe];
    in_stack_00000028 = unaff_x22[1];
    uStack0000000000000020 = *unaff_x22;
    in_stack_00000038 = unaff_x22[3];
    in_stack_00000030 = unaff_x22[2];
    in_stack_00000048 = unaff_x22[5];
    in_stack_00000040 = unaff_x22[4];
    in_stack_00000058 = unaff_x22[7];
    in_stack_00000050 = unaff_x22[6];
    lVar2 = _strlen(&uStack0000000000000020);
    lVar4 = (long)&uStack0000000000000020 + lVar2;
    uStack0000000000000008 = (ulong)pbVar6[5];
    uStack0000000000000010 = (ulong)pbVar6[6];
    func_0x00764560(lVar4,0x80 - lVar2);
    lVar3 = _strlen(lVar4);
    lVar5 = (0x80 - lVar2) - lVar3;
    lVar4 = lVar4 + lVar3;
    uStack0000000000000008 = (ulong)pbVar6[7];
    uStack0000000000000010 = (ulong)pbVar6[8];
    func_0x00764560(lVar4,lVar5);
    lVar2 = _strlen(lVar4);
    unaff_x25 = lVar5 - lVar2;
    unaff_x24 = lVar4 + lVar2;
  } while( true );
}



undefined8 FUN_0076945c(void)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined8 unaff_x21;
  undefined1 auVar4 [16];
  undefined1 uStack0000000000000007;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  
  func_0x00768960();
  do {
    uVar2 = func_0x0077e4c0(uStack0000000000000008,in_stack_00000010,
                            *(undefined8 *)(unaff_x19 + 0xf0),&uStack0000000000000018);
    *(undefined8 *)(unaff_x19 + 0xf0) = uVar2;
    if (uStack0000000000000018 == 0) break;
    lVar3 = func_0x0061ac10();
    if ((*(int *)(lVar3 + 0x60) == 1) &&
       (iVar1 = func_0x0076a868(lVar3,&uStack0000000000000008,&uStack0000000000000007), iVar1 != 0))
    {
      if ((*(char *)(lVar3 + 0xa1d) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    lVar3 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + lVar3 + 0x18) + 8))))) {
        func_0x0073cab8(lVar3,"PENDING handle timeout");
      }
      func_0x0075e5fc(lVar3 + 0x20);
      func_0x0075e474();
      if (*(int *)(lVar3 + 0x60) != 3) {
        *(undefined4 *)(lVar3 + 0x60) = 3;
        func_0x0078371c(lVar3);
      }
      auVar4 = func_0x00782d28();
      _uStack0000000000000020 = auVar4;
      func_0x0076b7bc(lVar3,&uStack0000000000000020,0,8);
    }
    func_0x0061ac10(uStack0000000000000018);
    func_0x0076a9fc(uStack0000000000000008,in_stack_00000010);
  } while (uStack0000000000000018 != 0);
  if (unaff_x20 != (undefined4 *)0x0) {
    *unaff_x20 = *(undefined4 *)(unaff_x19 + 8);
  }
  if ((int)unaff_x21 < 1) {
    unaff_x21 = func_0x007681c0();
  }
  return unaff_x21;
}


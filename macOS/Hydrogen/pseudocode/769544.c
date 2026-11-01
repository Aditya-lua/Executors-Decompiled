
undefined8 FUN_00769544(void)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined8 unaff_x21;
  long unaff_x24;
  undefined4 unaff_w26;
  undefined1 auVar3 [16];
  undefined1 uStack0000000000000007;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  
  do {
    *(undefined4 *)(unaff_x24 + 0x60) = unaff_w26;
    func_0x0078371c(unaff_x24);
    do {
      auVar3 = func_0x00782d28();
      _uStack0000000000000020 = auVar3;
      func_0x0076b7bc(unaff_x24,&uStack0000000000000020,0,8);
      do {
        func_0x0061ac10(uStack0000000000000018);
        func_0x0076a9fc(uStack0000000000000008,in_stack_00000010);
        if (uStack0000000000000018 == 0) {
code_r0x00769554:
          if (unaff_x20 != (undefined4 *)0x0) {
            *unaff_x20 = *(undefined4 *)(unaff_x19 + 8);
          }
          if ((int)unaff_x21 < 1) {
            unaff_x21 = func_0x007681c0();
          }
          return unaff_x21;
        }
        uVar2 = func_0x0077e4c0(uStack0000000000000008,in_stack_00000010,
                                *(undefined8 *)(unaff_x19 + 0xf0),&uStack0000000000000018);
        *(undefined8 *)(unaff_x19 + 0xf0) = uVar2;
        if (uStack0000000000000018 == 0) goto code_r0x00769554;
        unaff_x24 = func_0x0061ac10();
      } while ((*(int *)(unaff_x24 + 0x60) != 1) ||
              (iVar1 = func_0x0076a868(unaff_x24,&uStack0000000000000008,&uStack0000000000000007),
              iVar1 == 0));
      if ((*(char *)(unaff_x24 + 0xa1d) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x24 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x24 + 0x18) + 8))))) {
        func_0x0073cab8(unaff_x24);
      }
      func_0x0075e5fc(unaff_x24 + 0x20);
      func_0x0075e474();
    } while (*(int *)(unaff_x24 + 0x60) == 3);
  } while( true );
}


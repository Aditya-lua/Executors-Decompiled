
undefined8 FUN_0076c5e0(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  long lVar2;
  long unaff_x19;
  long unaff_x20;
  undefined8 unaff_x22;
  undefined1 unaff_w25;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  
  do {
    uVar1 = func_0x0077e4c0(*(undefined8 *)(unaff_x19 + 8),*(undefined8 *)(unaff_x19 + 0x10),param_3
                            ,&uStack0000000000000008);
    *(undefined8 *)(unaff_x20 + 0xf0) = uVar1;
    if (uStack0000000000000008 == 0) {
      return unaff_x22;
    }
    lVar2 = func_0x0061ac10();
    if (lVar2 != 0) {
      func_0x0076a9fc(*(undefined8 *)(unaff_x19 + 8),*(undefined8 *)(unaff_x19 + 0x10));
      if (lVar2 == *(long *)(unaff_x20 + 0x200)) {
        *(undefined1 *)(unaff_x19 + 0x21) = unaff_w25;
      }
      else {
        *(long *)(unaff_x19 + 0x18) = *(long *)(unaff_x19 + 0x18) + 1;
        unaff_x22 = func_0x00769578();
        if ((int)unaff_x22 < 1) {
          func_0x00768c00(lVar2,&uStack0000000000000010);
          unaff_x22 = func_0x0076ab7c();
          if ((int)unaff_x22 != 0) {
            return unaff_x22;
          }
          *(undefined8 *)(lVar2 + 0xa8) = in_stack_00000018;
          *(undefined8 *)(lVar2 + 0xa0) = uStack0000000000000010;
          *(undefined8 *)(lVar2 + 0xb8) = in_stack_00000028;
          *(undefined8 *)(lVar2 + 0xb0) = in_stack_00000020;
        }
      }
    }
    param_3 = *(undefined8 *)(unaff_x20 + 0xf0);
  } while( true );
}


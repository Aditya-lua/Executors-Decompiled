
undefined8 FUN_007345d8(long param_1)

{
  long unaff_x20;
  long unaff_x21;
  undefined8 uVar1;
  undefined1 uStack0000000000000018;
  
  do {
    param_1 = func_0x006f4058(param_1);
    func_0x00784e78();
    if (param_1 == 0) {
      do {
        if (unaff_x21 == 0) {
          *(byte *)(unaff_x20 + 0x98) = *(byte *)(unaff_x20 + 0x98) & 0xfe;
          if ((*(long *)(unaff_x20 + 0x88) != 0) &&
             ((*(byte *)(*(long *)(unaff_x20 + 0x88) + 4) >> 5 & 1) != 0)) {
            func_0x00779d40(*(undefined8 *)(unaff_x20 + 0x78),5);
          }
          return 0;
        }
        uVar1 = *(undefined8 *)(unaff_x21 + 0x20);
        unaff_x21 = func_0x0074e01c(&uStack0000000000000018);
        param_1 = func_0x00740a58(uVar1);
      } while (param_1 == 0);
    }
    func_0x00156654(param_1);
  } while( true );
}


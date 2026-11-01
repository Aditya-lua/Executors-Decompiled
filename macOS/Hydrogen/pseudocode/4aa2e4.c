
void FUN_004aa2e4(void)

{
  undefined1 in_ZR;
  long lVar1;
  long lVar2;
  long unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  undefined8 uStack0000000000000048;
  long in_stack_00000058;
  
  do {
    if ((bool)in_ZR) {
      func_0x005d2ac4(unaff_x20);
    }
    unaff_x20 = unaff_x20 + 2;
    unaff_x24 = unaff_x24 + 1;
    if (unaff_x24 == 1) {
      do {
        if (*(long *)(unaff_x21 + 0x60) != 0) {
          func_0x00187bd4(*(undefined8 *)(unaff_x21 + 0x68),*(long *)(unaff_x21 + 0x60) << 4,8);
        }
        func_0x004a9e7c(&uStack0000000000000048);
        if (uStack0000000000000048 == 0) {
          return;
        }
        unaff_x21 = uStack0000000000000048 + in_stack_00000058 * unaff_x19;
        lVar1 = *(long *)(unaff_x21 + 0x80);
        if (lVar1 != 0) {
          lVar2 = lVar1 * 8 + 8;
          func_0x00187bd4(*(long *)(unaff_x21 + 0x78) - lVar2,lVar1 + lVar2 + 9,8);
        }
      } while (*(long *)(unaff_x21 + 0x70) == 0);
      unaff_x20 = *(undefined8 **)(unaff_x21 + 0x68);
      unaff_x24 = unaff_x22 - *(long *)(unaff_x21 + 0x70);
    }
    lVar1 = *(long *)*unaff_x20;
    *(long *)*unaff_x20 = lVar1 + unaff_x23;
    LORelease();
    in_ZR = lVar1 == 1;
  } while( true );
}


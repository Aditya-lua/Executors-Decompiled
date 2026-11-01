
void FUN_005c62fc(void)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x25;
  
  do {
    func_0x005d2ac4(unaff_x20);
    puVar2 = unaff_x20;
    do {
      unaff_x20 = puVar2 + 2;
      unaff_x22 = unaff_x22 + -1;
      if (unaff_x22 == 0) {
        if (*(long *)(unaff_x21 + 0x60) != 0) {
          func_0x00187bd4(*(undefined8 *)(unaff_x21 + 0x68),*(long *)(unaff_x21 + 0x60) << 4,8);
        }
        __Unwind_Resume();
        unaff_x20 = puVar2 + 4;
        unaff_x22 = -unaff_x25;
        unaff_x23 = -1;
      }
      lVar1 = *(long *)*unaff_x20;
      *(long *)*unaff_x20 = lVar1 + unaff_x23;
      LORelease();
      puVar2 = unaff_x20;
    } while (lVar1 != 1);
  } while( true );
}


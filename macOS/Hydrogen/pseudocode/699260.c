
undefined8 FUN_00699260(void)

{
  long lVar1;
  ulong uVar2;
  long unaff_x19;
  undefined8 unaff_x20;
  undefined8 *unaff_x21;
  
  while( true ) {
    *(undefined8 *)(unaff_x19 + 0x18) = *unaff_x21;
    lVar1 = unaff_x21[4];
    uVar2 = unaff_x21[2];
    if ((ulong)unaff_x21[3] <= (ulong)unaff_x21[2]) {
      uVar2 = unaff_x21[3];
    }
    if (lVar1 != 0) {
      if (uVar2 != 0) {
        do {
          *(undefined1 *)(lVar1 + -1 + uVar2) = 0;
          uVar2 = uVar2 - 1;
        } while (uVar2 != 0);
      }
      func_0x00611644();
    }
    __ZdlPv(unaff_x21);
    unaff_x21 = *(undefined8 **)(unaff_x19 + 0x18);
    if (unaff_x21 == (undefined8 *)0x0) break;
    if ((unaff_x21 == *(undefined8 **)(unaff_x19 + 0x20)) || (unaff_x21[5] != unaff_x21[3])) {
      if (unaff_x21[6] == unaff_x21[5]) {
        unaff_x21[5] = 0;
        unaff_x21[6] = 0;
      }
      return 1;
    }
  }
  return unaff_x20;
}


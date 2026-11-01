
ulong FUN_00618b50(void)

{
  long lVar1;
  ulong uVar2;
  long unaff_x19;
  int unaff_w21;
  
  if (unaff_w21 != 0) {
    lVar1 = func_0x0066ad70();
    if (lVar1 != 0) {
      uVar2 = *(long *)(unaff_x19 + 0x60) - *(long *)(unaff_x19 + 0x20);
      if (uVar2 < 2) {
        uVar2 = 1;
      }
      return uVar2;
    }
    *(undefined8 *)(unaff_x19 + 0x78) = 0;
  }
  return 0;
}


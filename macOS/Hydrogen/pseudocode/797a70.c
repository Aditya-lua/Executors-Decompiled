
undefined8 FUN_00797a70(void)

{
  long lVar1;
  long unaff_x19;
  long *unaff_x20;
  
  lVar1 = func_0x00740a58(unaff_x20 + 8);
  if (lVar1 == 0) {
    if (*unaff_x20 != 0) {
      (*pcRam0000000000a2b5f0)();
      *unaff_x20 = 0;
    }
    unaff_x20[1] = 0;
    if (unaff_x20[6] != 0) {
      (*pcRam0000000000a2b5f0)();
      unaff_x20[6] = 0;
    }
    unaff_x20[7] = 0;
    *(undefined4 *)(unaff_x20 + 3) = 0;
    unaff_x20[2] = 0;
    (*pcRam0000000000a2b5f0)(unaff_x20[4]);
    unaff_x20[4] = 0;
    (*pcRam0000000000a2b5f0)();
  }
  else {
    func_0x0075e5fc(unaff_x20 + 8);
  }
  if ((*(long *)(unaff_x19 + 0xe0) != 0) &&
     ((*(byte *)(*(long *)(unaff_x19 + 0xe0) + 4) >> 4 & 1) != 0)) {
    func_0x00779d40();
  }
  return 0;
}



void FUN_002125ac(void)

{
  long lVar1;
  long *unaff_x20;
  long *unaff_x24;
  long unaff_x26;
  
  lVar1 = *unaff_x20;
  if (lVar1 + 0x7fffffffffffffffU < 5) {
    func_0x002087e4();
  }
  else {
    if (*unaff_x24 != unaff_x26) {
      func_0x00208ff4();
      lVar1 = *unaff_x20;
    }
    if ((lVar1 != -0x8000000000000000) && (lVar1 != 0)) {
      func_0x00187bd4(unaff_x20[1],lVar1,1);
    }
  }
  func_0x00187bd4();
  return;
}


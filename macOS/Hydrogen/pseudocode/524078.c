
void FUN_00524078(void)

{
  long lVar1;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x22;
  
  _memcpy();
  if (*unaff_x19 != 0) {
    func_0x00187bd4();
  }
  *unaff_x19 = unaff_x20;
  unaff_x19[1] = unaff_x22;
  unaff_x19[2] = unaff_x20;
  func_0x007a5594();
  lVar1 = unaff_x19[2];
  *(undefined1 *)(unaff_x19[1] + lVar1) = 10;
  unaff_x19[2] = lVar1 + 1;
  return;
}


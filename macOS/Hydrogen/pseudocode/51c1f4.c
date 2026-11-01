
void FUN_0051c1f4(void)

{
  long *unaff_x21;
  long *unaff_x22;
  long unaff_x27;
  long lVar1;
  
  func_0x0051b138();
  if (*unaff_x22 != -0x8000000000000000) {
    lVar1 = *unaff_x22;
    *(long *)(unaff_x27 + 0x10) = unaff_x22[1];
    *(long *)(unaff_x27 + 8) = lVar1;
    func_0x0051b078();
  }
  if (*unaff_x21 != 0) {
    func_0x00187bd4(unaff_x21[1],*unaff_x21,1);
  }
  return;
}


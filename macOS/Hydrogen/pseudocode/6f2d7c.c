
undefined8 FUN_006f2d7c(void)

{
  char in_NG;
  bool in_ZR;
  char in_OV;
  int iVar1;
  long lVar2;
  long unaff_x21;
  
  if (in_ZR || in_NG != in_OV) {
    func_0x006e63b0();
    lVar2 = func_0x006e63b0();
    iVar1 = func_0x006e6bc0(lVar2,1);
    *(long *)(*(long *)(lVar2 + 0x18) + 0x4b0) =
         (long)iVar1 * 0x5851f42d4c957f2d + 0x399d2694695129de;
    return 0;
  }
  *(long *)(unaff_x21 + 0x4b0) = *(long *)(unaff_x21 + 0x4b0) * 0x5851f42d4c957f2d + 0x69;
  func_0x006e3870();
  return 1;
}


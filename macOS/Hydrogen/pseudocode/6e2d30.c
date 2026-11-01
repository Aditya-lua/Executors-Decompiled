
long FUN_006e2d30(void)

{
  int iVar1;
  long lVar2;
  int in_w8;
  ulong *unaff_x19;
  long unaff_x20;
  int unaff_w21;
  long *unaff_x22;
  
  if (in_w8 != 5) {
    if ((*(byte *)(unaff_x20 + 1) >> 2 & 1) != 0) {
      func_0x006f0ed4();
    }
    iVar1 = func_0x00702310();
    if (iVar1 == 0) {
      if (unaff_x19 == (ulong *)0x0) {
        return 0;
      }
      *unaff_x19 = 0;
      return 0;
    }
    if (*(ulong *)(*(long *)(unaff_x20 + 0x18) + 0x40) <=
        *(ulong *)(*(long *)(unaff_x20 + 0x18) + 0x48)) {
      func_0x006efe90();
    }
    if (unaff_w21 < 1) {
      if (unaff_w21 < -9999) {
        unaff_x22 = (long *)func_0x006e60a0();
      }
      else {
        unaff_x22 = (long *)(*(long *)(unaff_x20 + 8) + (long)unaff_w21 * 0x10);
      }
    }
    else {
      unaff_x22 = (long *)(*(long *)(unaff_x20 + 0x10) + (ulong)(unaff_w21 - 1) * 0x10);
      if (*(long **)(unaff_x20 + 8) <= unaff_x22) {
        lVar2 = __dyld_get_image_header(0);
        unaff_x22 = (long *)(lVar2 + 0x4e8dd08);
      }
    }
  }
  if (unaff_x19 != (ulong *)0x0) {
    *unaff_x19 = (ulong)*(uint *)(*unaff_x22 + 0x14);
  }
  return *unaff_x22 + 0x18;
}


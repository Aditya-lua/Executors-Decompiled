
long FUN_006e3710(void)

{
  long lVar1;
  ulong *unaff_x19;
  
  lVar1 = __dyld_get_image_header();
  if (*(int *)(lVar1 + 0x4e8dd14) != 10) {
    return 0;
  }
  lVar1 = *(long *)(lVar1 + 0x4e8dd08);
  if (unaff_x19 != (ulong *)0x0) {
    *unaff_x19 = (ulong)*(uint *)(lVar1 + 4);
  }
  return lVar1 + 8;
}


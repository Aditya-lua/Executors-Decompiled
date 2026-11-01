
long FUN_000968dc(void)

{
  long lVar1;
  long *unaff_x22;
  long unaff_x23;
  
  lVar1 = _calloc();
  if (lVar1 == 0) {
    *(long *)(unaff_x23 + 0x10) = unaff_x22[2];
    *(long *)(unaff_x22[2] + 0x18) = unaff_x23;
    _free();
    return 0;
  }
  *unaff_x22 = lVar1;
  return lVar1;
}


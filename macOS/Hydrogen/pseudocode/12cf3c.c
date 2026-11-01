
long FUN_0012cf3c(void)

{
  long lVar1;
  int in_w8;
  int *unaff_x19;
  int unaff_w21;
  int unaff_w22;
  int unaff_w23;
  
  lVar1 = func_0x000b810c((long)unaff_w23 * (long)in_w8);
  if (*(long *)(unaff_x19 + 2) != 0) {
    _memcpy(lVar1,*(long *)(unaff_x19 + 2),(long)*unaff_x19 * 0x250);
    func_0x000b83d4(*(undefined8 *)(unaff_x19 + 2));
  }
  *(long *)(unaff_x19 + 2) = lVar1;
  *unaff_x19 = unaff_w22;
  unaff_x19[1] = unaff_w23;
  unaff_x19[8] = unaff_x19[8] + 1;
  lVar1 = lVar1 + (long)unaff_w21 * 0x250;
  _bzero(lVar1,0x250);
  *(undefined4 *)(lVar1 + 0x68) = 0xffffffff;
  unaff_x19[9] = unaff_x19[9] + 1;
  return *(long *)(unaff_x19 + 2) + (long)unaff_w21 * 0x250;
}


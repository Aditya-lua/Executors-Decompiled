
undefined8 FUN_0016069c(void)

{
  undefined8 uVar1;
  int *unaff_x21;
  int unaff_w22;
  undefined4 unaff_w23;
  
  uVar1 = func_0x000b810c();
  if (lRam0000000000a39838 != 0) {
    _memcpy(uVar1,lRam0000000000a39838,(long)*unaff_x21);
    func_0x000b83d4(*(undefined8 *)(unaff_x21 + 2));
  }
  uRam0000000000a39834 = unaff_w23;
  lRam0000000000a39838 = uVar1;
  *unaff_x21 = unaff_w22;
  _strcpy(uVar1);
  return *(undefined8 *)(unaff_x21 + 2);
}


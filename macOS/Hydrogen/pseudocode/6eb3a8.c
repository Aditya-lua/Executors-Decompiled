
void FUN_006eb3a8(undefined8 param_1)

{
  int iVar1;
  long unaff_x19;
  
  *(undefined8 *)(unaff_x19 + 0xb78) = param_1;
  ___cxa_guard_release(0xa28b80);
  lRam0000000000a3f178 = *(long *)(unaff_x19 + 0xb78) + 0x3284bf4;
  if (((bRam0000000000a28b90 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28b90), iVar1 != 0)) {
    lRam0000000000a28b88 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b90);
  }
  lRam0000000000a3f180 = lRam0000000000a28b88 + 0x329897c;
  return;
}


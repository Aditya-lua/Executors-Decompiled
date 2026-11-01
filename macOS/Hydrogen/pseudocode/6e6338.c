
void FUN_006e6338(void)

{
  int iVar1;
  long unaff_x19;
  
  lRam0000000000a3f100 = *(long *)(unaff_x19 + 0xb78) + 0x3284bf4;
  if (((bRam0000000000a28b90 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28b90), iVar1 != 0)) {
    lRam0000000000a28b88 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b90);
  }
  lRam0000000000a3f108 = lRam0000000000a28b88 + 0x329897c;
  return;
}


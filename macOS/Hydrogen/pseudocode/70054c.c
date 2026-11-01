
void FUN_0070054c(void)

{
  int iVar1;
  long unaff_x19;
  
  lRam0000000000a40828 = *(long *)(unaff_x19 + 0xb78) + 0x3284bf4;
  if (((bRam0000000000a28b90 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28b90), iVar1 != 0)) {
    lRam0000000000a28b88 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b90);
  }
  lRam0000000000a40830 = lRam0000000000a28b88 + 0x329897c;
  uRam0000000000a336e8 = 0;
  pcRam0000000000a336f0 = "LuauVectorLerp";
  uRam0000000000a336f8 = uRam0000000000a2ade8;
  uRam0000000000a2ade8 = 0xa336e8;
  return;
}


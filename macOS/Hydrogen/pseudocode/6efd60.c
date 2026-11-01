
void FUN_006efd60(byte *param_1)

{
  int iVar1;
  
  if (((*param_1 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28b90), iVar1 != 0)) {
    lRam0000000000a28b88 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b90);
  }
  lRam0000000000a401f8 = lRam0000000000a28b88 + 0x329897c;
  return;
}


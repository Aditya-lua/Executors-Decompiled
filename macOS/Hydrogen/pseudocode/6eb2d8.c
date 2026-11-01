
void FUN_006eb2d8(long param_1)

{
  int iVar1;
  
  if (((*(byte *)(param_1 + 0xb70) & 1) == 0) &&
     (iVar1 = ___cxa_guard_acquire(0xa28b70), iVar1 != 0)) {
    lRam0000000000a28b68 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b70);
  }
  lRam0000000000a3f170 = lRam0000000000a28b68 + 0x4e8df33;
  if (((bRam0000000000a28b80 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28b80), iVar1 != 0)) {
    lRam0000000000a28b78 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b80);
  }
  lRam0000000000a3f178 = lRam0000000000a28b78 + 0x3284bf4;
  if (((bRam0000000000a28b90 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28b90), iVar1 != 0)) {
    lRam0000000000a28b88 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b90);
  }
  lRam0000000000a3f180 = lRam0000000000a28b88 + 0x329897c;
  return;
}


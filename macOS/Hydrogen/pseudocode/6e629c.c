
void FUN_006e629c(long param_1)

{
  int iVar1;
  uint in_w9;
  
  lRam0000000000a3f100 = param_1 + (ulong)(in_w9 & 0xffff | 0x3280000);
  if (((bRam0000000000a28b90 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28b90), iVar1 != 0)) {
    lRam0000000000a28b88 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b90);
  }
  lRam0000000000a3f108 = lRam0000000000a28b88 + 0x329897c;
  return;
}


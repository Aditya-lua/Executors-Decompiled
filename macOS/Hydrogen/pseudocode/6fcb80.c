
void FUN_006fcb80(undefined8 param_1)

{
  int iVar1;
  long in_x9;
  
  *(undefined8 *)(in_x9 + 0x7b0) = param_1;
  if (((bRam0000000000a28b90 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28b90), iVar1 != 0)) {
    lRam0000000000a28b88 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b90);
  }
  lRam0000000000a407b8 = lRam0000000000a28b88 + 0x329897c;
  return;
}


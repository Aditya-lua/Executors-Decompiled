
void FUN_006fcbe8(void)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x19;
  
  iVar1 = ___cxa_guard_acquire(0xa28b80);
  if (iVar1 != 0) {
    uVar2 = __dyld_get_image_header(0);
    *(undefined8 *)(unaff_x19 + 0xb78) = uVar2;
    ___cxa_guard_release(0xa28b80);
  }
  lRam0000000000a407b0 = *(long *)(unaff_x19 + 0xb78) + 0x3284bf4;
  if (((bRam0000000000a28b90 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28b90), iVar1 != 0)) {
    lRam0000000000a28b88 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b90);
  }
  lRam0000000000a407b8 = lRam0000000000a28b88 + 0x329897c;
  return;
}


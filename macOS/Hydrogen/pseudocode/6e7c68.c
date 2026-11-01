
void FUN_006e7c68(void)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x19;
  
  iVar1 = ___cxa_guard_acquire(0xa28b70);
  if (iVar1 != 0) {
    uVar2 = __dyld_get_image_header(0);
    *(undefined8 *)(unaff_x19 + 0xb68) = uVar2;
    ___cxa_guard_release(0xa28b70);
  }
  lRam0000000000a3f110 = *(long *)(unaff_x19 + 0xb68) + 0x4e8df33;
  if (((bRam0000000000a28b80 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28b80), iVar1 != 0)) {
    lRam0000000000a28b78 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b80);
  }
  lRam0000000000a3f118 = lRam0000000000a28b78 + 0x3284bf4;
  if (((bRam0000000000a28b90 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28b90), iVar1 != 0)) {
    lRam0000000000a28b88 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b90);
  }
  lRam0000000000a3f120 = lRam0000000000a28b88 + 0x329897c;
  return;
}


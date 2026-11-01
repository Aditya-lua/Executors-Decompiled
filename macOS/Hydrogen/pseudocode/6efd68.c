
void FUN_006efd68(ulong param_1)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x19;
  
  if (((param_1 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28b90), iVar1 != 0)) {
    uVar2 = __dyld_get_image_header(0);
    *(undefined8 *)(unaff_x19 + 0xb88) = uVar2;
    ___cxa_guard_release(0xa28b90);
  }
  lRam0000000000a401f8 = *(long *)(unaff_x19 + 0xb88) + 0x329897c;
  return;
}


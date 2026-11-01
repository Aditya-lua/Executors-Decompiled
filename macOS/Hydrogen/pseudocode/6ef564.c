
void FUN_006ef564(void)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x19;
  
  iVar1 = ___cxa_guard_acquire();
  if (iVar1 != 0) {
    uVar2 = __dyld_get_image_header(0);
    *(undefined8 *)(unaff_x19 + 0xb88) = uVar2;
    ___cxa_guard_release(0xa28b90);
  }
  lRam0000000000a401e0 = *(long *)(unaff_x19 + 0xb88) + 0x329897c;
  uRam0000000000a336b8 = 0;
  pcRam0000000000a336c0 = "LuauStacklessPcall";
  uRam0000000000a336c8 = uRam0000000000a2ade8;
  uRam0000000000a2ade8 = 0xa336b8;
  return;
}


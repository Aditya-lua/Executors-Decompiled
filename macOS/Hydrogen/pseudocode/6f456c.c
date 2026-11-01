
void FUN_006f456c(void)

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
  lRam0000000000a40258 = *(long *)(unaff_x19 + 0xb88) + 0x329897c;
  func_0x006f41dc(0xa40260);
  return;
}



void FUN_0008f72c(void)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x19;
  
  iVar1 = ___cxa_guard_acquire();
  if (iVar1 != 0) {
    uVar2 = __dyld_get_image_header(0);
    *(undefined8 *)(unaff_x19 + 0xbf8) = uVar2;
    ___cxa_guard_release(0xa28c00);
  }
  lRam0000000000a279c8 = *(long *)(unaff_x19 + 0xbf8) + 0x1bfb610;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____cxa_guard_release_00a24b40)(0xa279d0);
  return;
}


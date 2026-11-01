
void FUN_0008ec3c(void)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x19;
  
  iVar1 = ___cxa_guard_acquire();
  if (iVar1 != 0) {
    uVar2 = __dyld_get_image_header(0);
    *(undefined8 *)(unaff_x19 + 0xba8) = uVar2;
    ___cxa_guard_release(0xa28bb0);
  }
  lRam0000000000a278e8 = *(long *)(unaff_x19 + 0xba8) + 0x1dd587c;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____cxa_guard_release_00a24b40)(0xa278f0);
  return;
}


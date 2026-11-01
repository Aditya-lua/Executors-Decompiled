
void FUN_00093700(void)

{
  undefined8 uVar1;
  long unaff_x19;
  
  uVar1 = __dyld_get_image_header(0);
  *(undefined8 *)(unaff_x19 + 0xbe8) = uVar1;
  ___cxa_guard_release(0xa28bf0);
  lRam0000000000a279a8 = *(long *)(unaff_x19 + 0xbe8) + 0x1bfa9c8;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____cxa_guard_release_00a24b40)(0xa279b0);
  return;
}


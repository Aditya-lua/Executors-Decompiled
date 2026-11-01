
void FUN_0008ef68(void)

{
  undefined8 uVar1;
  long unaff_x19;
  
  uVar1 = __dyld_get_image_header();
  *(undefined8 *)(unaff_x19 + 0xba8) = uVar1;
  ___cxa_guard_release(0xa28bb0);
  lRam0000000000a27928 = *(long *)(unaff_x19 + 0xba8) + 0x1561ad0;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____cxa_guard_release_00a24b40)(0xa27930);
  return;
}


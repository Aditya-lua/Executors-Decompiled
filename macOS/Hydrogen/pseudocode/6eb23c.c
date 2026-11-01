
void FUN_006eb23c(ulong param_1)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x19;
  
  if (((param_1 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28b60), iVar1 != 0)) {
    uVar2 = __dyld_get_image_header(0);
    *(undefined8 *)(unaff_x19 + 0xb58) = uVar2;
    ___cxa_guard_release(0xa28b60);
  }
  lRam0000000000a278c8 = *(long *)(unaff_x19 + 0xb58) + 0x1560254;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____cxa_guard_release_00a24b40)(0xa278d0);
  return;
}


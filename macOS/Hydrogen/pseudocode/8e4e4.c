
void FUN_0008e4e4(long param_1)

{
  int iVar1;
  
  iVar1 = ___cxa_guard_acquire(param_1 + 0x9d0);
  if (iVar1 == 0) {
    return;
  }
  if (((bRam0000000000a28c00 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28c00), iVar1 != 0)) {
    lRam0000000000a28bf8 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28c00);
  }
  lRam0000000000a279c8 = lRam0000000000a28bf8 + 0x1bfb610;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____cxa_guard_release_00a24b40)(0xa279d0);
  return;
}


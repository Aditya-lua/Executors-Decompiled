
void FUN_0009365c(long param_1)

{
  int iVar1;
  
  ___cxa_guard_abort(param_1 + 0xbf0);
  ___cxa_guard_abort(0xa279a0);
  __Unwind_Resume();
  if (((bRam0000000000a279b0 & 1) != 0) || (iVar1 = ___cxa_guard_acquire(0xa279b0), iVar1 == 0)) {
    return;
  }
  if (((bRam0000000000a28bf0 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28bf0), iVar1 != 0)) {
    lRam0000000000a28be8 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28bf0);
  }
  lRam0000000000a279a8 = lRam0000000000a28be8 + 0x1bfa9c8;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____cxa_guard_release_00a24b40)(0xa279b0);
  return;
}


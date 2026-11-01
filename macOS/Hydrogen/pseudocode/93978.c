
void FUN_00093978(void)

{
  int iVar1;
  
  ___cxa_guard_abort(0xa28b90);
  ___cxa_guard_abort(0xa279e0);
  __Unwind_Resume();
  if (((bRam0000000000a279f0 & 1) != 0) || (iVar1 = ___cxa_guard_acquire(0xa279f0), iVar1 == 0)) {
    return;
  }
  if (((bRam0000000000a28c10 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28c10), iVar1 != 0)) {
    lRam0000000000a28c08 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28c10);
  }
  lRam0000000000a279e8 = lRam0000000000a28c08 + 0x15c5814;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____cxa_guard_release_00a24b40)(0xa279f0);
  return;
}


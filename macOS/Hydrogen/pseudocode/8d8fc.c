
void FUN_0008d8fc(long param_1)

{
  int iVar1;
  
  ___cxa_guard_abort(param_1 + 0x8d0);
  __Unwind_Resume();
  if (((bRam0000000000a278e0 & 1) != 0) || (iVar1 = ___cxa_guard_acquire(0xa278e0), iVar1 == 0)) {
    return;
  }
  if (((bRam0000000000a28ba0 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28ba0), iVar1 != 0)) {
    lRam0000000000a28b98 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28ba0);
  }
  lRam0000000000a278d8 = lRam0000000000a28b98 + 0x3836c94;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____cxa_guard_release_00a24b40)(0xa278e0);
  return;
}


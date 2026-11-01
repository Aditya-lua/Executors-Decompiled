
void FUN_0009326c(undefined8 param_1)

{
  int iVar1;
  
  ___cxa_guard_abort(0xa28bb0);
  ___cxa_guard_abort(0xa27950);
  __Unwind_Resume(param_1);
  if (((bRam0000000000a27960 & 1) != 0) || (iVar1 = ___cxa_guard_acquire(0xa27960), iVar1 == 0)) {
    return;
  }
  if (((bRam0000000000a28bc0 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28bc0), iVar1 != 0)) {
    lRam0000000000a28bb8 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28bc0);
  }
  lRam0000000000a27958 = lRam0000000000a28bb8 + 0x14be40c;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____cxa_guard_release_00a24b40)(0xa27960);
  return;
}


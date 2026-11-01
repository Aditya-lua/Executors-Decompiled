
void FUN_0008e700(long param_1)

{
  int iVar1;
  
  ___cxa_guard_abort(param_1 + 0xc10);
  ___cxa_guard_abort(0xa279f0);
  __Unwind_Resume();
  if (((bRam0000000000a27a00 & 1) != 0) || (iVar1 = ___cxa_guard_acquire(0xa27a00), iVar1 == 0)) {
    return;
  }
  if (((bRam0000000000a28c20 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28c20), iVar1 != 0)) {
    lRam0000000000a28c18 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28c20);
  }
  lRam0000000000a279f8 = lRam0000000000a28c18 + 0x383e590;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____cxa_guard_release_00a24b40)(0xa27a00);
  return;
}


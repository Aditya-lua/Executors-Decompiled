
void FUN_00093500(ulong param_1)

{
  int iVar1;
  
  if (((param_1 & 1) != 0) || (iVar1 = ___cxa_guard_acquire(0xa27990), iVar1 == 0)) {
    return;
  }
  if (((bRam0000000000a28bb0 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28bb0), iVar1 != 0)) {
    lRam0000000000a28ba8 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28bb0);
  }
  lRam0000000000a27988 = lRam0000000000a28ba8 + 0x14ffee8;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____cxa_guard_release_00a24b40)(0xa27990);
  return;
}



void FUN_005efd24(long param_1)

{
  int iVar1;
  long in_x9;
  undefined1 auVar2 [16];
  
  if (in_x9 == param_1) {
    return;
  }
  ___stack_chk_fail();
  auVar2 = __Unwind_Resume();
  if (((bRam0000000000a3c0f0 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa3c0f0), iVar1 != 0)) {
    puRam0000000000a3c108 = &UNK_009f5558;
    puRam0000000000a3c110 = &UNK_009f56e8;
    ___cxa_guard_release(0xa3c0f0);
  }
                    /* WARNING: Could not recover jumptable at 0x005efd88. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*auVar2._0_8_ + 0x58))(auVar2._0_8_,0xa3c108,&UNK_008ba5c8,auVar2._8_8_);
  return;
}


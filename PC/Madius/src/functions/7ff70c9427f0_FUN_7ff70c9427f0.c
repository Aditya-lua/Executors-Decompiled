/* 7ff70c9427f0 FUN_7ff70c9427f0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c9427f0(longlong param_1)

{
  if (param_1 != 0 && *(code **)(_DAT_7ff70cbec7c0 + 0xd0) != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ff70c942810. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(_DAT_7ff70cbec7c0 + 0xd0))();
    return;
  }
  return;
}




void FUN_006c7dec(long param_1)

{
  long in_stack_00000040;
  undefined4 in_stack_00000048;
  
  if ((uint)param_1 < 0x10) {
                    /* WARNING: Could not recover jumptable at 0x006c7e14. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&UNK_006c7e18 + (ulong)(byte)(&UNK_008c6e00)[param_1] * 4))();
    return;
  }
  *(undefined4 *)(in_stack_00000040 + 0x484) = in_stack_00000048;
  return;
}


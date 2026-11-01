
void FUN_004b24e0(void)

{
  undefined8 uVar1;
  long unaff_x23;
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  for (; in_stack_00000018 * 8 != unaff_x23; unaff_x23 = unaff_x23 + 8) {
    uVar1 = *(undefined8 *)(in_stack_00000010 + unaff_x23);
    func_0x004ad4c8();
    func_0x004aceb8(uVar1);
  }
  if (in_stack_00000008 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(in_stack_00000010,in_stack_00000008 << 3,8);
  return;
}


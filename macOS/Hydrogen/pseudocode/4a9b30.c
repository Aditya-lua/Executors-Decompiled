
void FUN_004a9b30(void)

{
  undefined8 uVar1;
  long lVar2;
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  for (lVar2 = 0; in_stack_00000018 * 8 != lVar2; lVar2 = lVar2 + 8) {
    uVar1 = *(undefined8 *)(in_stack_00000010 + lVar2);
    func_0x004b27b8();
    func_0x004b23e4(uVar1);
  }
  if (in_stack_00000008 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(in_stack_00000010,in_stack_00000008 << 3,8);
  return;
}


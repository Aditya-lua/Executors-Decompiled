
void FUN_002474a0(void)

{
  undefined8 uVar1;
  undefined8 *extraout_x1;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  
  uVar1 = func_0x007a1f00();
  if (in_stack_00000008 != 0) {
    func_0x00187bd4(in_stack_00000010,in_stack_00000008,1);
  }
  __Unwind_Resume(uVar1);
                    /* WARNING: Could not recover jumptable at 0x00469224. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(extraout_x1[1] + 0x18))(*extraout_x1,&UNK_00829e0f,0xb);
  return;
}


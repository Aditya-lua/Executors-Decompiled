
void FUN_0042b494(void)

{
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  
  func_0x00400bec(&uStack0000000000000008);
  if ((uStack0000000000000008 < -0x7ffffffffffffffe) || (uStack0000000000000008 == 0)) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(in_stack_00000010,uStack0000000000000008,1);
  return;
}


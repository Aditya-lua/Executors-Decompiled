
void FUN_007306f4(long param_1,int param_2)

{
  undefined4 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined4 in_stack_00000018;
  long in_stack_00000020;
  undefined4 in_stack_00000028;
  
  if (param_2 == 0) {
                    /* WARNING: Could not recover jumptable at 0x007b3250. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__connect_00a24cd0)
              (*(undefined4 *)(param_1 + 0x98),param_1 + 0x18,*(undefined4 *)(param_1 + 0x14));
    return;
  }
  uStack0000000000000008 = 0;
  in_stack_00000010 = 0;
  in_stack_00000018 = 0;
  in_stack_00000020 = param_1 + 0x18;
  in_stack_00000028 = *(undefined4 *)(param_1 + 0x14);
  _connectx(*(undefined4 *)(param_1 + 0x98),&uStack0000000000000008,0,3,0,0,0,0);
  return;
}


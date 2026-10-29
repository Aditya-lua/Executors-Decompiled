/* 7ff70c954d70 FUN_7ff70c954d70 */

undefined8 FUN_7ff70c954d70(longlong *param_1)

{
  undefined8 uVar1;
  undefined4 *in_stack_00000028;
  
  if (param_1 != (longlong *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ff70c954d7c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar1 = (**(code **)(*param_1 + 0x48))();
    return uVar1;
  }
  *in_stack_00000028 = 0x38;
  return 0xffffffffffffffff;
}



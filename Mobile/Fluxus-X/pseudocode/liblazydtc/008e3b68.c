/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e3b68
 */

void FUN_008e3b68(long param_1,undefined8 param_2)

{
  long *plVar1;
  
  plVar1 = *(long **)(param_1 + 0x18);
  if (plVar1 == (long *)0x0) {
    plVar1 = operator_new(0x20);
    FUN_008e5188(plVar1,8);
    *(long **)(param_1 + 0x18) = plVar1;
  }
                    /* WARNING: Could not recover jumptable at 0x008e3bb0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x40))(plVar1,param_2);
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009350cc
 */

undefined8 FUN_009350cc(undefined8 param_1,long *param_2)

{
  undefined8 uVar1;
  
  if (param_2 == (long *)0x0) {
    return 0x17;
  }
                    /* WARNING: Could not recover jumptable at 0x009350d8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(*param_2 + 0x18))();
  return uVar1;
}


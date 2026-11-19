/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00907498
 */

undefined8 FUN_00907498(long *param_1,undefined8 param_2,uint param_3)

{
  undefined8 uVar1;
  
  if (param_1 == (long *)0x0) {
    return 2;
  }
                    /* WARNING: Could not recover jumptable at 0x009074a8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(*param_1 + 0x18))(param_1,param_2,param_3 & 1);
  return uVar1;
}


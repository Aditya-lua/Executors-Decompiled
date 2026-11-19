/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009074e8
 */

undefined8 FUN_009074e8(long *param_1)

{
  undefined8 uVar1;
  undefined4 *in_x4;
  
  if (param_1 == (long *)0x0) {
    *in_x4 = 0x38;
    return 0xffffffffffffffff;
  }
                    /* WARNING: Could not recover jumptable at 0x009074f4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(*param_1 + 0x50))();
  return uVar1;
}


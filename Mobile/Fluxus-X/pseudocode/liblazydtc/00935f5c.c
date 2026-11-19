/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00935f5c
 */

undefined8 FUN_00935f5c(long param_1)

{
  undefined8 uVar1;
  
  if (*(long **)(param_1 + 0x138) == (long *)0x0) {
    return 0xffffffffffffffff;
  }
                    /* WARNING: Could not recover jumptable at 0x00935f6c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(**(long **)(param_1 + 0x138) + 0x28))();
  return uVar1;
}


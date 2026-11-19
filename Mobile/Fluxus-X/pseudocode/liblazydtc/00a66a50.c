/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a66a50
 */

undefined8 evp_keymgmt_gen(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  
  if (*(code **)(param_1 + 0x80) == (code *)0x0) {
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a66a64. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(param_1 + 0x80))(param_2,param_3,param_4);
  return uVar1;
}


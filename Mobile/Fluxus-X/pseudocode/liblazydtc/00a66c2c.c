/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a66c2c
 */

undefined8 evp_keymgmt_dup(long param_1,undefined8 param_2,undefined4 param_3)

{
  undefined8 uVar1;
  
  if (*(code **)(param_1 + 0xd8) == (code *)0x0) {
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a66c3c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(param_1 + 0xd8))(param_2,param_3);
  return uVar1;
}


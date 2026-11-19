/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a66b78
 */

undefined8
evp_keymgmt_validate(long param_1,undefined8 param_2,undefined4 param_3,undefined4 param_4)

{
  undefined8 uVar1;
  
  if (*(code **)(param_1 + 0xa8) == (code *)0x0) {
    return 1;
  }
                    /* WARNING: Could not recover jumptable at 0x00a66b8c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(param_1 + 0xa8))(param_2,param_3,param_4);
  return uVar1;
}


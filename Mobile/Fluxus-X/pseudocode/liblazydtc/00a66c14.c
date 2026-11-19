/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a66c14
 */

undefined8 evp_keymgmt_export_types(long param_1,undefined4 param_2)

{
  undefined8 uVar1;
  
  if (*(code **)(param_1 + 0xd0) == (code *)0x0) {
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a66c20. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(param_1 + 0xd0))(param_2);
  return uVar1;
}


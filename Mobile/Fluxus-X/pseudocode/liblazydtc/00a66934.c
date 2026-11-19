/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a66934
 */

undefined8 evp_keymgmt_newdata(long param_1)

{
  undefined8 uVar1;
  
  ossl_provider_ctx(*(undefined8 *)(param_1 + 0x18));
  if (*(code **)(param_1 + 0x30) == (code *)0x0) {
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a6695c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(param_1 + 0x30))();
  return uVar1;
}


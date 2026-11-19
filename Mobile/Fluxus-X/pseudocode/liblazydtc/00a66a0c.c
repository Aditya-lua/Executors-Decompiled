/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a66a0c
 */

undefined8 EVP_KEYMGMT_gen_settable_params(long param_1)

{
  undefined8 uVar1;
  
  uVar1 = ossl_provider_ctx(*(undefined8 *)(param_1 + 0x18));
  if (*(code **)(param_1 + 0x78) == (code *)0x0) {
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a66a3c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(param_1 + 0x78))(0,uVar1);
  return uVar1;
}


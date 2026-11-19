/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7b9e0
 */

undefined8 EVP_SIGNATURE_gettable_ctx_params(long param_1)

{
  undefined8 uVar1;
  
  if ((param_1 == 0) || (*(long *)(param_1 + 0xc0) == 0)) {
    return 0;
  }
  uVar1 = ossl_provider_ctx(*(undefined8 *)(param_1 + 0x18));
                    /* WARNING: Could not recover jumptable at 0x00a7ba18. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(param_1 + 0xc0))(0,uVar1);
  return uVar1;
}


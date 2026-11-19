/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a65464
 */

undefined8 EVP_KEM_gettable_ctx_params(long param_1)

{
  undefined8 uVar1;
  
  if ((param_1 == 0) || (*(long *)(param_1 + 0x70) == 0)) {
    return 0;
  }
  uVar1 = ossl_provider_ctx(*(undefined8 *)(param_1 + 0x18));
                    /* WARNING: Could not recover jumptable at 0x00a6549c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(param_1 + 0x70))(0,uVar1);
  return uVar1;
}


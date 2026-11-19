/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a647b8
 */

undefined8 EVP_KDF_gettable_params(long param_1)

{
  undefined8 uVar1;
  code *UNRECOVERED_JUMPTABLE;
  
  UNRECOVERED_JUMPTABLE = *(code **)(param_1 + 0x58);
  if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
    return 0;
  }
  EVP_KDF_get0_provider();
  ossl_provider_ctx();
                    /* WARNING: Could not recover jumptable at 0x00a647e4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*UNRECOVERED_JUMPTABLE)();
  return uVar1;
}


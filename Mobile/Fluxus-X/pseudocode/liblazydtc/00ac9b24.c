/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac9b24
 */

undefined8 EVP_RAND_gettable_params(undefined8 *param_1)

{
  undefined8 uVar1;
  code *UNRECOVERED_JUMPTABLE;
  
  UNRECOVERED_JUMPTABLE = (code *)param_1[0x11];
  if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
    return 0;
  }
  ossl_provider_ctx(*param_1);
                    /* WARNING: Could not recover jumptable at 0x00ac9b50. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*UNRECOVERED_JUMPTABLE)();
  return uVar1;
}


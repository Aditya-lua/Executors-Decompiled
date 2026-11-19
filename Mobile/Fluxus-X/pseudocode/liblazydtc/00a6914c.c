/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6914c
 */

undefined8 EVP_MAC_gettable_ctx_params(undefined8 *param_1)

{
  undefined8 uVar1;
  
  if (param_1[0xd] == 0) {
    return 0;
  }
  uVar1 = ossl_provider_ctx(*param_1);
                    /* WARNING: Could not recover jumptable at 0x00a69180. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*(code *)param_1[0xd])(0,uVar1);
  return uVar1;
}


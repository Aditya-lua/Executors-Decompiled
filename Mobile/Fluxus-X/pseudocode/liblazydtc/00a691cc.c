/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a691cc
 */

undefined8 EVP_MAC_CTX_gettable_params(long *param_1)

{
  undefined8 uVar1;
  
  if (((undefined8 *)*param_1)[0xd] == 0) {
    return 0;
  }
  uVar1 = ossl_provider_ctx(*(undefined8 *)*param_1);
                    /* WARNING: Could not recover jumptable at 0x00a69208. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(*param_1 + 0x68))(param_1[1],uVar1);
  return uVar1;
}


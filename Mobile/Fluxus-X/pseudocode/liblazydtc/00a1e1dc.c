/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1e1dc
 */

undefined4 BN_generate_dsa_nonce(undefined8 param_1)

{
  undefined4 uVar1;
  
  uVar1 = ossl_bn_gen_dsa_nonce_fixed_top();
  bn_correct_top(param_1);
  return uVar1;
}


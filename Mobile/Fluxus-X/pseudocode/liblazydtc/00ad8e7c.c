/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad8e7c
 */

undefined8 ossl_rsa_pss_params_30_copy(undefined8 *param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  
  *(undefined4 *)(param_1 + 2) = *(undefined4 *)(param_2 + 2);
  uVar1 = *param_2;
  param_1[1] = param_2[1];
  *param_1 = uVar1;
  return 1;
}


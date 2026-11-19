/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad8e24
 */

bool ossl_rsa_pss_params_30_set_defaults(undefined8 *param_1)

{
  if (param_1 != (undefined8 *)0x0) {
    *(undefined4 *)(param_1 + 2) = 1;
    param_1[1] = 0x1400000040;
    *param_1 = 0x38f00000040;
  }
  return param_1 != (undefined8 *)0x0;
}


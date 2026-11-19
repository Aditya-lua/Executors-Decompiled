/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2e5d0
 */

void EC_KEY_new_ex(undefined8 param_1,undefined8 param_2)

{
  ossl_ec_key_new_method_int(param_1,param_2,0);
  return;
}


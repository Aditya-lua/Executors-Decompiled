/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2fed8
 */

void EC_KEY_new_method(undefined8 param_1)

{
  ossl_ec_key_new_method_int(0,0,param_1);
  return;
}


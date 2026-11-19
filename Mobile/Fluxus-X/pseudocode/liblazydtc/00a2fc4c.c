/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2fc4c
 */

void EC_KEY_set_default_method(undefined **param_1)

{
  PTR_PTR_00cc8978 = (undefined *)&PTR_s_OpenSSL_EC_KEY_method_00c5c120;
  if (param_1 != (undefined **)0x0) {
    PTR_PTR_00cc8978 = (undefined *)param_1;
  }
  return;
}


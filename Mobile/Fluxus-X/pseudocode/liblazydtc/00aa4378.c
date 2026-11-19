/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa4378
 */

void ossl_provider_module_name(long param_1)

{
  DSO_get_filename(*(DSO **)(param_1 + 0x38));
  return;
}


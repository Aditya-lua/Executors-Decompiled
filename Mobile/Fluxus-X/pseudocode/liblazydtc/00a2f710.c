/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f710
 */

point_conversion_form_t EC_KEY_get_conv_form(EC_KEY *key)

{
  return *(point_conversion_form_t *)(key + 0x34);
}


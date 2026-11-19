/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f718
 */

void EC_KEY_set_conv_form(EC_KEY *eckey,point_conversion_form_t cform)

{
  *(point_conversion_form_t *)(eckey + 0x34) = cform;
  if (*(EC_GROUP **)(eckey + 0x18) == (EC_GROUP *)0x0) {
    return;
  }
  EC_GROUP_set_point_conversion_form(*(EC_GROUP **)(eckey + 0x18),cform);
  return;
}


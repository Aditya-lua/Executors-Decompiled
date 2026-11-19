/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30ec0
 */

void EC_GROUP_set_point_conversion_form(EC_GROUP *group,point_conversion_form_t form)

{
  *(point_conversion_form_t *)(group + 0x2c) = form;
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009efe00
 */

void ASN1_UTCTIME_dup(void *param_1)

{
  ASN1_ITEM *it;
  
  it = (ASN1_ITEM *)ASN1_UTCTIME_it();
  ASN1_item_dup(it,param_1);
  return;
}


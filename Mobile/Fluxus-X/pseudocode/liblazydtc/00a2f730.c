/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f730
 */

void EC_KEY_set_asn1_flag(EC_KEY *eckey,int asn1_flag)

{
  if (*(EC_GROUP **)(eckey + 0x18) == (EC_GROUP *)0x0) {
    return;
  }
  EC_GROUP_set_asn1_flag(*(EC_GROUP **)(eckey + 0x18),asn1_flag);
  return;
}


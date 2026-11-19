/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a528c4
 */

int ENGINE_set_pkey_asn1_meths(ENGINE *e,ENGINE_PKEY_ASN1_METHS_PTR f)

{
  *(ENGINE_PKEY_ASN1_METHS_PTR *)(e + 0x50) = f;
  return 1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a528bc
 */

ENGINE_PKEY_ASN1_METHS_PTR ENGINE_get_pkey_asn1_meths(ENGINE *e)

{
  return *(ENGINE_PKEY_ASN1_METHS_PTR *)(e + 0x50);
}


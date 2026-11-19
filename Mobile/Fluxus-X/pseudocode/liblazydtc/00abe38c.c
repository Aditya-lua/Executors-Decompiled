/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe38c
 */

ulong ASN1_PCTX_get_flags(ASN1_PCTX *p)

{
  return *(ulong *)p;
}


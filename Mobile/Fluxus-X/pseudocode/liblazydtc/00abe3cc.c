/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe3cc
 */

ulong ASN1_PCTX_get_str_flags(ASN1_PCTX *p)

{
  return *(ulong *)(p + 0x20);
}


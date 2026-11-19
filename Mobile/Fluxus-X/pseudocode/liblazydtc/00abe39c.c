/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe39c
 */

ulong ASN1_PCTX_get_nm_flags(ASN1_PCTX *p)

{
  return *(ulong *)(p + 8);
}


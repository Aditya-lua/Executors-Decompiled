/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe394
 */

void ASN1_PCTX_set_flags(ASN1_PCTX *p,ulong flags)

{
  *(ulong *)p = flags;
  return;
}


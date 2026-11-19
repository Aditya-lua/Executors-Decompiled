/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe3c4
 */

void ASN1_PCTX_set_oid_flags(ASN1_PCTX *p,ulong flags)

{
  *(ulong *)(p + 0x18) = flags;
  return;
}


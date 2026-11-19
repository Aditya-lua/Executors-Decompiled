/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab183c
 */

char * OCSP_crl_reason_str(long s)

{
  if (8 < (ulong)s) {
    return "(UNKNOWN)";
  }
  if ((0x17fU >> (ulong)((uint)s & 0x1f) & 1) == 0) {
    return "(UNKNOWN)";
  }
  return *(char **)((&PTR_DAT_00c7ac60)[s] + 8);
}


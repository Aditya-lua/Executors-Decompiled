/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab17d0
 */

char * OCSP_response_status_str(long s)

{
  if (6 < (ulong)s) {
    return "(UNKNOWN)";
  }
  if ((0x6fU >> (ulong)((uint)s & 0x1f) & 1) == 0) {
    return "(UNKNOWN)";
  }
  return *(char **)((&PTR_DAT_00c7ac00)[s] + 8);
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab1814
 */

char * OCSP_cert_status_str(long s)

{
  if ((ulong)s < 3) {
    return *(char **)((&PTR_DAT_00c7ac40)[s] + 8);
  }
  return "(UNKNOWN)";
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0d234
 */

char * X509_verify_cert_error_string(long n)

{
  if ((uint)n < 0x5f) {
    return *(char **)((long)&PTR_DAT_00c81910 +
                     (-((ulong)n >> 0x1f & 1) & 0xfffffff800000000 | (n & 0xffffffffU) << 3));
  }
  return "unknown certificate verification error";
}


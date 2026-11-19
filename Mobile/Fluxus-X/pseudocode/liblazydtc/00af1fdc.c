/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af1fdc
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_LOOKUP_METHOD * X509_LOOKUP_file(void)

{
  return (X509_LOOKUP_METHOD *)&PTR_s_Load_file_into_cache_00cc94d0;
}


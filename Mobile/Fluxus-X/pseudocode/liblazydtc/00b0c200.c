/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c200
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int * X509_REQ_get_extension_nids(void)

{
  return (int *)PTR_DAT_00cc9bd8;
}


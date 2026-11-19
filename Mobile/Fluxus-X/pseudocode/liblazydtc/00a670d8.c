/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a670d8
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

EVP_MD * EVP_md_null(void)

{
  return (EVP_MD *)&DAT_00c5e460;
}


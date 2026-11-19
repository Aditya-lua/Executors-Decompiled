/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a98bc0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

EVP_MD * EVP_ripemd160(void)

{
  return (EVP_MD *)&DAT_00c6a118;
}


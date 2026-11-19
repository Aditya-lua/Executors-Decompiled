/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a972ac
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

EVP_CIPHER * EVP_rc2_cfb64(void)

{
  return (EVP_CIPHER *)&DAT_00c68b78;
}


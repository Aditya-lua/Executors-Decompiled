/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a92c64
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

EVP_CIPHER * EVP_des_cfb1(void)

{
  return (EVP_CIPHER *)&DAT_00c67878;
}


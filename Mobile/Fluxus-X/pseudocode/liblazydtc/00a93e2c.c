/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a93e2c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

EVP_CIPHER * EVP_des_ede_ecb(void)

{
  return (EVP_CIPHER *)&DAT_00c67d78;
}


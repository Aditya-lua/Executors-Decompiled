/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a00f7c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

BIO_METHOD * BIO_s_socket(void)

{
  return (BIO_METHOD *)&DAT_00c59608;
}


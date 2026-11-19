/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0080c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

BIO_METHOD * BIO_s_mem(void)

{
  return (BIO_METHOD *)&DAT_00c59548;
}


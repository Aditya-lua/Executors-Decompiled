/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac2304
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

BIO_METHOD * BIO_s_null(void)

{
  return (BIO_METHOD *)&DAT_00c7c3a0;
}


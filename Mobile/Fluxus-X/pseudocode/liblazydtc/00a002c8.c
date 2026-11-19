/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a002c8
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

BIO_METHOD * BIO_s_file(void)

{
  return (BIO_METHOD *)&DAT_00c594e8;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fd22c
 */

ulong BIO_number_read(BIO *bio)

{
  stack_st_void *psVar1;
  
  psVar1 = (stack_st_void *)0x0;
  if (bio != (BIO *)0x0) {
    psVar1 = (bio->ex_data).sk;
  }
  return (ulong)psVar1;
}


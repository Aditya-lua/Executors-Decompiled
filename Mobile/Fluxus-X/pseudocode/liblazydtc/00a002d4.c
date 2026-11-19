/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a002d4
 */

BIO * BIO_new_fp(FILE *stream,int close_flag)

{
  BIO *b;
  
  b = BIO_new((BIO_METHOD *)&DAT_00c594e8);
  if (b != (BIO *)0x0) {
    BIO_set_flags(b,0);
    BIO_ctrl(b,0x6a,(long)close_flag,stream);
  }
  return b;
}


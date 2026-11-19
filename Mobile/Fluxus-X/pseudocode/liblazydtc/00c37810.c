/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c37810
 */

BIO * BIO_new_fp(FILE *stream,int close_flag)

{
  BIO *pBVar1;
  
  pBVar1 = BIO_new_fp(stream,close_flag);
  return pBVar1;
}


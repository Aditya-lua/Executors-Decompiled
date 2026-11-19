/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c387e0
 */

BIO * BIO_new_file(char *filename,char *mode)

{
  BIO *pBVar1;
  
  pBVar1 = BIO_new_file(filename,mode);
  return pBVar1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c34220
 */

int BIO_read(BIO *b,void *data,int len)

{
  int iVar1;
  
  iVar1 = BIO_read(b,data,len);
  return iVar1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c31a50
 */

BIO * BIO_new_mem_buf(void *buf,int len)

{
  BIO *pBVar1;
  
  pBVar1 = BIO_new_mem_buf(buf,len);
  return pBVar1;
}


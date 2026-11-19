/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c32630
 */

stack_st_X509_INFO * PEM_X509_INFO_read_bio(BIO *bp,stack_st_X509_INFO *sk,undefined1 *cb,void *u)

{
  stack_st_X509_INFO *psVar1;
  
  psVar1 = PEM_X509_INFO_read_bio(bp,sk,cb,u);
  return psVar1;
}


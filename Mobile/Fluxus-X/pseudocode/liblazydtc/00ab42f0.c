/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab42f0
 */

stack_st_X509_INFO * PEM_X509_INFO_read(FILE *fp,stack_st_X509_INFO *sk,undefined1 *cb,void *u)

{
  stack_st_X509_INFO *psVar1;
  
  psVar1 = (stack_st_X509_INFO *)PEM_X509_INFO_read_ex();
  return psVar1;
}


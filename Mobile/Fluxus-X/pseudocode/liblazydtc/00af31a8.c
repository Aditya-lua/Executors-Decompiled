/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af31a8
 */

int X509_print(BIO *bp,X509 *x)

{
  int iVar1;
  
  iVar1 = X509_print_ex(bp,x,0,0);
  return iVar1;
}


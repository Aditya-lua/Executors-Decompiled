/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c31a60
 */

X509 * PEM_read_bio_X509(BIO *bp,X509 **x,undefined1 *cb,void *u)

{
  X509 *pXVar1;
  
  pXVar1 = PEM_read_bio_X509(bp,x,cb,u);
  return pXVar1;
}


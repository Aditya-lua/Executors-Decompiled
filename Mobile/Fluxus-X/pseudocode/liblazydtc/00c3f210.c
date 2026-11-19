/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3f210
 */

EVP_PKEY * PEM_read_PrivateKey(FILE *fp,EVP_PKEY **x,undefined1 *cb,void *u)

{
  EVP_PKEY *pEVar1;
  
  pEVar1 = PEM_read_PrivateKey(fp,x,cb,u);
  return pEVar1;
}


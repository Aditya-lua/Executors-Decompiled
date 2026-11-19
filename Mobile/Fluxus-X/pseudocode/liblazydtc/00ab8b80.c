/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab8b80
 */

EVP_PKEY * PEM_read_PrivateKey(FILE *fp,EVP_PKEY **x,undefined1 *cb,void *u)

{
  EVP_PKEY *pEVar1;
  
  pEVar1 = (EVP_PKEY *)PEM_read_PrivateKey_ex();
  return pEVar1;
}


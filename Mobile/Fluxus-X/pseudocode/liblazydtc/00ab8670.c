/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab8670
 */

EVP_PKEY * PEM_read_PUBKEY(FILE *fp,EVP_PKEY **x,undefined1 *cb,void *u)

{
  EVP_PKEY *pEVar1;
  
  pEVar1 = (EVP_PKEY *)PEM_read_PUBKEY_ex();
  return pEVar1;
}


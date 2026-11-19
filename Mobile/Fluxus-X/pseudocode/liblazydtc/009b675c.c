/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b675c
 */

SSL_CTX * SSL_CTX_new(SSL_METHOD *meth)

{
  SSL_CTX *pSVar1;
  
  pSVar1 = (SSL_CTX *)SSL_CTX_new_ex(0,0,meth);
  return pSVar1;
}


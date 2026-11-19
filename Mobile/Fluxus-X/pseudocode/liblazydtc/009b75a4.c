/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b75a4
 */

SSL_CIPHER * SSL_get_current_cipher(SSL *s)

{
  SSL_CIPHER *pSVar1;
  
  if ((*(long *)&s[3].sid_ctx_length == 0) ||
     (pSVar1 = *(SSL_CIPHER **)(*(long *)&s[3].sid_ctx_length + 0x2f8), pSVar1 == (SSL_CIPHER *)0x0)
     ) {
    return (SSL_CIPHER *)0x0;
  }
  return pSVar1;
}


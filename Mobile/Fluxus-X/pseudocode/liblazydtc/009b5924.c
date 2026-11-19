/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b5924
 */

stack_st_SSL_CIPHER * SSL_get_ciphers(SSL *s)

{
  SSL_CTX *pSVar1;
  long lVar2;
  
  if ((s == (SSL *)0x0) ||
     ((pSVar1 = s[1].initial_ctx, pSVar1 == (SSL_CTX *)0x0 &&
      ((lVar2 = *(long *)&s[3].ex_data.dummy, lVar2 == 0 ||
       (pSVar1 = *(SSL_CTX **)(lVar2 + 0x10), pSVar1 == (SSL_CTX *)0x0)))))) {
    return (stack_st_SSL_CIPHER *)0x0;
  }
  return (stack_st_SSL_CIPHER *)pSVar1;
}


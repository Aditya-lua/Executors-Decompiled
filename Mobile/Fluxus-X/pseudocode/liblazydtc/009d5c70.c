/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d5c70
 */

stack_st_SRTP_PROTECTION_PROFILE * SSL_get_srtp_profiles(SSL *ssl)

{
  EVP_CIPHER_CTX *pEVar1;
  long lVar2;
  
  if ((ssl == (SSL *)0x0) ||
     ((pEVar1 = ssl[4].enc_read_ctx, pEVar1 == (EVP_CIPHER_CTX *)0x0 &&
      ((lVar2 = *(long *)&ssl[3].ex_data.dummy, lVar2 == 0 ||
       (pEVar1 = *(EVP_CIPHER_CTX **)(lVar2 + 0x3b8), pEVar1 == (EVP_CIPHER_CTX *)0x0)))))) {
    return (stack_st_SRTP_PROTECTION_PROFILE *)0x0;
  }
  return (stack_st_SRTP_PROTECTION_PROFILE *)pEVar1;
}


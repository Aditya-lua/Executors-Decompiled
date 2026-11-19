/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b40e4
 */

stack_st_X509 * SSL_get_peer_cert_chain(SSL *s)

{
  stack_st_X509 *psVar1;
  
  psVar1 = (stack_st_X509 *)0x0;
  if (s != (SSL *)0x0) {
    if (*(long *)&s[3].sid_ctx_length == 0) {
      return (stack_st_X509 *)0x0;
    }
    psVar1 = *(stack_st_X509 **)(*(long *)&s[3].sid_ctx_length + 0x2c0);
  }
  return psVar1;
}


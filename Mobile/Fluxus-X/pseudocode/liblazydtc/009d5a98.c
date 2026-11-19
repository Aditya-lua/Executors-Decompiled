/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d5a98
 */

int SSL_CTX_set_tlsext_use_srtp(SSL_CTX *ctx,char *profiles)

{
  int iVar1;
  
  iVar1 = FUN_009d5aa8(profiles,ctx[1].sid_ctx);
  return iVar1;
}


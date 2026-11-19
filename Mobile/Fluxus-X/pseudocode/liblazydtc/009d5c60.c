/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d5c60
 */

int SSL_set_tlsext_use_srtp(SSL *ctx,char *profiles)

{
  int iVar1;
  
  iVar1 = FUN_009d5aa8(profiles,&ctx[4].enc_read_ctx);
  return iVar1;
}


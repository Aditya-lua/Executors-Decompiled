/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7b34
 */

int SSL_CTX_use_psk_identity_hint(SSL_CTX *ctx,char *identity_hint)

{
  int iVar1;
  size_t sVar2;
  char *pcVar3;
  
  if ((identity_hint == (char *)0x0) || (sVar2 = strlen(identity_hint), sVar2 < 0x101)) {
    CRYPTO_free(*(void **)(*(long *)ctx->sid_ctx + 0x200));
    if (identity_hint == (char *)0x0) {
      *(undefined8 *)(*(long *)ctx->sid_ctx + 0x200) = 0;
    }
    else {
      pcVar3 = CRYPTO_strdup(identity_hint,"ssl/ssl_lib.c",0x11f1);
      *(char **)(*(long *)ctx->sid_ctx + 0x200) = pcVar3;
      if (pcVar3 == (char *)0x0) {
        return 0;
      }
    }
    iVar1 = 1;
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x11ec,"SSL_CTX_use_psk_identity_hint");
    ERR_set_error(0x14,0x92,0);
    iVar1 = 0;
  }
  return iVar1;
}


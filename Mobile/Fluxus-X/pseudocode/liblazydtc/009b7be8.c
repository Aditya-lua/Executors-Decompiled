/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7be8
 */

int SSL_use_psk_identity_hint(SSL *s,char *identity_hint)

{
  int iVar1;
  size_t sVar2;
  char *pcVar3;
  
  iVar1 = 0;
  if (s != (SSL *)0x0) {
    if ((identity_hint == (char *)0x0) || (sVar2 = strlen(identity_hint), sVar2 < 0x101)) {
      CRYPTO_free(*(void **)((s[3].d1)->rcvd_cookie + 0xfc));
      if (identity_hint == (char *)0x0) {
        *(undefined8 *)((s[3].d1)->rcvd_cookie + 0xfc) = 0;
      }
      else {
        pcVar3 = CRYPTO_strdup(identity_hint,"ssl/ssl_lib.c",0x1204);
        *(char **)((s[3].d1)->rcvd_cookie + 0xfc) = pcVar3;
        if (pcVar3 == (char *)0x0) {
          return 0;
        }
      }
      iVar1 = 1;
    }
    else {
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0x11ff,"SSL_use_psk_identity_hint");
      ERR_set_error(0x14,0x92,0);
      iVar1 = 0;
    }
  }
  return iVar1;
}


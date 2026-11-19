/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7ca0
 */

char * SSL_get_psk_identity_hint(SSL *s)

{
  char *pcVar1;
  
  pcVar1 = (char *)0x0;
  if (s != (SSL *)0x0) {
    if (*(long *)&s[3].sid_ctx_length == 0) {
      return (char *)0x0;
    }
    pcVar1 = *(char **)(*(long *)&s[3].sid_ctx_length + 0x2a0);
  }
  return pcVar1;
}


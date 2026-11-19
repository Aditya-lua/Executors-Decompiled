/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b5db0
 */

char * SSL_get_servername(SSL *s,int type)

{
  int iVar1;
  char *pcVar2;
  int *piVar3;
  
  iVar1 = 0;
  if (s->handshake_func != (_func_3149 *)0x0) {
    iVar1 = s->server;
  }
  pcVar2 = (char *)0x0;
  if (type == 0) {
    if (iVar1 == 0) {
      iVar1 = SSL_in_before(s);
      if (iVar1 == 0) {
        if ((((((byte)s->method->get_timeout[0x60] >> 3 & 1) != 0) ||
             (iVar1 = s->method->version, iVar1 < 0x304)) || (iVar1 == 0x10000)) &&
           (((int)s[1].tlsext_ecpointformatlist_length != 0 &&
            (pcVar2 = *(char **)(*(long *)&s[3].sid_ctx_length + 0x330), pcVar2 != (char *)0x0)))) {
          return pcVar2;
        }
      }
      else if (((s[3].tlsext_opaque_prf_input_len == 0) &&
               (piVar3 = *(int **)&s[3].sid_ctx_length, piVar3 != (int *)0x0)) && (*piVar3 != 0x304)
              ) {
        return *(char **)(piVar3 + 0xcc);
      }
    }
    else if (((int)s[1].tlsext_ecpointformatlist_length != 0) &&
            (((((byte)s->method->get_timeout[0x60] >> 3 & 1) != 0 ||
              (iVar1 = s->method->version, iVar1 < 0x304)) || (iVar1 == 0x10000)))) {
      return *(char **)(*(long *)&s[3].sid_ctx_length + 0x330);
    }
    pcVar2 = (char *)s[3].tlsext_opaque_prf_input_len;
  }
  return pcVar2;
}


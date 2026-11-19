/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b50b4
 */

int SSL_shutdown(SSL *s)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  SSL *local_48;
  undefined8 uStack_40;
  undefined8 local_38;
  undefined8 local_30;
  _func_3062 *local_28;
  
  if (s->handshake_func == (_func_3149 *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x8d4,"SSL_shutdown");
    uVar3 = 0x114;
  }
  else {
    iVar1 = SSL_in_init();
    if (iVar1 == 0) {
      if ((((ulong)s[3].tlsext_debug_arg & 0x100) == 0) ||
         (lVar2 = ASYNC_get_current_job(), lVar2 != 0)) {
                    /* WARNING: Could not recover jumptable at 0x009b5168. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        iVar1 = (*s->method->ssl_renegotiate)(s);
        return iVar1;
      }
      local_38 = 0;
      uStack_40 = 0;
      local_30 = 2;
      local_28 = s->method->ssl_renegotiate;
      local_48 = s;
      iVar1 = FUN_009b4724(s,&local_48,&LAB_009b486c);
      return iVar1;
    }
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x8e6,"SSL_shutdown");
    uVar3 = 0x197;
  }
  ERR_set_error(0x14,uVar3,0);
  return -1;
}


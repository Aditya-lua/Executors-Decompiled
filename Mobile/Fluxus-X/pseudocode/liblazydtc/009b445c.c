/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b445c
 */

int SSL_do_handshake(SSL *s)

{
  int iVar1;
  long lVar2;
  int in_w2;
  int in_w3;
  long in_x4;
  int *in_x5;
  SSL *local_48;
  undefined8 local_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  
  if (s->handshake_func == (_func_3149 *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0xf64,"SSL_do_handshake");
    ERR_set_error(0x14,0x90,0);
    iVar1 = -1;
  }
  else {
    ossl_statem_check_finish_init(s,0xffffffff);
    (*s->method->ssl_get_message)(s,0,in_w2,in_w3,in_x4,in_x5);
    iVar1 = SSL_in_init(s);
    if ((iVar1 == 0) && (iVar1 = SSL_in_before(s), iVar1 == 0)) {
      iVar1 = 1;
    }
    else {
      if ((((ulong)s[3].tlsext_debug_arg & 0x100) == 0) ||
         (lVar2 = ASYNC_get_current_job(), lVar2 != 0)) {
                    /* WARNING: Could not recover jumptable at 0x009b44d0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        iVar1 = (*s->handshake_func)(s);
        return iVar1;
      }
      uStack_38 = 0;
      local_40 = 0;
      uStack_28 = 0;
      uStack_30 = 0;
      local_48 = s;
      iVar1 = FUN_009b4724(s,&local_48,&LAB_009b6e24);
    }
  }
  return iVar1;
}


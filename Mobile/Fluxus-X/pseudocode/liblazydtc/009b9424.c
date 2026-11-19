/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b9424
 */

ulong SSL_stateless(SSL *param_1)

{
  uint uVar1;
  int iVar2;
  ulong uVar3;
  
  uVar1 = SSL_clear(param_1);
  uVar3 = (ulong)uVar1;
  if (uVar1 != 0) {
    ERR_clear_error();
    *(ulong *)&param_1->hit = *(ulong *)&param_1->hit | 0x800;
    if (param_1->handshake_func == (_func_3149 *)0x0) {
      param_1->server = 1;
      param_1->shutdown = 0;
      ossl_statem_clear(param_1);
      param_1->handshake_func = (_func_3149 *)param_1->method->ssl_connect;
      FUN_009b1b60(param_1);
    }
    iVar2 = SSL_do_handshake(param_1);
    *(ulong *)&param_1->hit = *(ulong *)&param_1->hit & 0xfffffffffffff7ff;
    if ((iVar2 < 1) || (*(int *)&param_1[4].d1 == 0)) {
      if ((*(int *)&param_1[3].read_hash != 1) ||
         (uVar3 = ossl_statem_in_error(param_1), (int)uVar3 != 0)) {
        uVar3 = 0xffffffff;
      }
    }
    else {
      uVar3 = 1;
    }
  }
  return uVar3;
}


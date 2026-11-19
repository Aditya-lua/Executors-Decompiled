/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b6c3c
 */

int SSL_set_ssl_method(SSL *s,SSL_METHOD *method)

{
  int iVar1;
  SSL_METHOD *pSVar2;
  _func_3058 *p_Var3;
  
  pSVar2 = s->method;
  if (pSVar2 == method) {
    iVar1 = 1;
  }
  else {
    p_Var3 = (_func_3058 *)s->handshake_func;
    if (pSVar2->version == method->version) {
      s->method = method;
      iVar1 = 1;
    }
    else {
      (*pSVar2->ssl_accept)(s);
      s->method = method;
      iVar1 = (*method->ssl_clear)(s);
    }
    if (p_Var3 == pSVar2->ssl_read) {
      p_Var3 = method->ssl_read;
    }
    else {
      if (p_Var3 != (_func_3058 *)pSVar2->ssl_connect) {
        return iVar1;
      }
      p_Var3 = (_func_3058 *)method->ssl_connect;
    }
    s->handshake_func = (_func_3149 *)p_Var3;
  }
  return iVar1;
}


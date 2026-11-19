/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e1bf8
 */

ulong dtls1_read_failed(SSL *param_1,uint param_2)

{
  int iVar1;
  BIO *b;
  ulong uVar2;
  
  if ((int)param_2 < 1) {
    uVar2 = (ulong)param_2;
    iVar1 = dtls1_is_timer_expired(param_1);
    if ((iVar1 != 0) && (iVar1 = ossl_statem_in_error(param_1), iVar1 == 0)) {
      iVar1 = SSL_in_init(param_1);
      if (iVar1 != 0) {
        uVar2 = dtls1_handle_timeout(param_1);
        return uVar2;
      }
      b = SSL_get_rbio(param_1);
      BIO_set_flags(b,1);
    }
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_dtls.c",0x41a,"dtls1_read_failed");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    uVar2 = 0;
  }
  return uVar2;
}


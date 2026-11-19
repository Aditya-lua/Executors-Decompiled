/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bd324
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

SSL_SESSION * SSL_SESSION_new(void)

{
  int iVar1;
  SSL_SESSION *obj;
  time_t tVar2;
  uint uVar3;
  long lVar4;
  
  iVar1 = OPENSSL_init_ssl(0x200000,0);
  if (iVar1 != 0) {
    obj = (SSL_SESSION *)CRYPTO_zalloc(0x3a0,"ssl/ssl_sess.c",0x81);
    if (obj == (SSL_SESSION *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/ssl_sess.c",0x83,"SSL_SESSION_new");
      ERR_set_error(0x14,0xc0100,0);
      return (SSL_SESSION *)0x0;
    }
    obj[1].sid_ctx[4] = '\x01';
    obj[1].sid_ctx[5] = '\0';
    obj[1].sid_ctx[6] = '\0';
    obj[1].sid_ctx[7] = '\0';
    obj[1].sid_ctx[8] = '\0';
    obj[1].sid_ctx[9] = '\0';
    obj[1].sid_ctx[10] = '\0';
    obj[1].sid_ctx[0xb] = '\0';
    obj[1].sid_ctx[0xc] = '\x01';
    obj[1].sid_ctx[0xd] = '\0';
    obj[1].sid_ctx[0xe] = '\0';
    obj[1].sid_ctx[0xf] = '\0';
    obj[1].sid_ctx[0x14] = '0';
    obj[1].sid_ctx[0x15] = '\x01';
    obj[1].sid_ctx[0x16] = '\0';
    obj[1].sid_ctx[0x17] = '\0';
    obj[1].sid_ctx[0x18] = '\0';
    obj[1].sid_ctx[0x19] = '\0';
    obj[1].sid_ctx[0x1a] = '\0';
    obj[1].sid_ctx[0x1b] = '\0';
    tVar2 = time((time_t *)0x0);
    lVar4 = *(long *)(obj[1].sid_ctx + 0x14);
    *(time_t *)(obj[1].sid_ctx + 0x1c) = tVar2;
    if (lVar4 < 0) {
      lVar4 = 0;
      obj[1].sid_ctx[0x14] = '\0';
      obj[1].sid_ctx[0x15] = '\0';
      obj[1].sid_ctx[0x16] = '\0';
      obj[1].sid_ctx[0x17] = '\0';
      obj[1].sid_ctx[0x18] = '\0';
      obj[1].sid_ctx[0x19] = '\0';
      obj[1].sid_ctx[0x1a] = '\0';
      obj[1].sid_ctx[0x1b] = '\0';
    }
    uVar3 = (uint)((ulong)lVar4 >> 0x3f);
    if (tVar2 < 1) {
      uVar3 = 0;
    }
    *(time_t *)obj[1].krb5_client_princ = tVar2 + lVar4;
    *(uint *)(obj[1].krb5_client_princ + 8) = uVar3;
    lVar4 = CRYPTO_THREAD_lock_new();
    *(long *)(obj[1].krb5_client_princ + 0xb0) = lVar4;
    if (lVar4 == 0) {
      ERR_new();
      ERR_set_debug("ssl/ssl_sess.c",0x8e,"SSL_SESSION_new");
      ERR_set_error(0x14,0xc0100,0);
    }
    else {
      iVar1 = CRYPTO_new_ex_data(2,obj,(CRYPTO_EX_DATA *)(obj[1].krb5_client_princ + 0x28));
      if (iVar1 != 0) {
        return obj;
      }
      CRYPTO_THREAD_lock_free(*(undefined8 *)(obj[1].krb5_client_princ + 0xb0));
    }
    CRYPTO_free(obj);
  }
  return (SSL_SESSION *)0x0;
}


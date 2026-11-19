/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009be7dc
 */

long SSL_SESSION_set_time(SSL_SESSION *s,long t)

{
  int iVar1;
  undefined8 uVar2;
  uint uVar3;
  long lVar4;
  
  if (s != (SSL_SESSION *)0x0) {
    if (*(long *)(s[1].krb5_client_princ + 0xa8) == 0) {
      lVar4 = *(long *)(s[1].sid_ctx + 0x14);
      *(long *)(s[1].sid_ctx + 0x1c) = t;
      if (lVar4 < 0) {
        lVar4 = 0;
        s[1].sid_ctx[0x14] = '\0';
        s[1].sid_ctx[0x15] = '\0';
        s[1].sid_ctx[0x16] = '\0';
        s[1].sid_ctx[0x17] = '\0';
        s[1].sid_ctx[0x18] = '\0';
        s[1].sid_ctx[0x19] = '\0';
        s[1].sid_ctx[0x1a] = '\0';
        s[1].sid_ctx[0x1b] = '\0';
      }
      uVar3 = (uint)((ulong)lVar4 >> 0x3f);
      if (t < 1) {
        uVar3 = 0;
      }
      *(long *)s[1].krb5_client_princ = lVar4 + t;
      *(uint *)(s[1].krb5_client_princ + 8) = uVar3;
      return t;
    }
    iVar1 = CRYPTO_THREAD_write_lock
                      (*(undefined8 *)(*(long *)(s[1].krb5_client_princ + 0xa8) + 0x3c8));
    if (iVar1 != 0) {
      lVar4 = *(long *)(s[1].sid_ctx + 0x14);
      *(long *)(s[1].sid_ctx + 0x1c) = t;
      if (lVar4 < 0) {
        lVar4 = 0;
        s[1].sid_ctx[0x14] = '\0';
        s[1].sid_ctx[0x15] = '\0';
        s[1].sid_ctx[0x16] = '\0';
        s[1].sid_ctx[0x17] = '\0';
        s[1].sid_ctx[0x18] = '\0';
        s[1].sid_ctx[0x19] = '\0';
        s[1].sid_ctx[0x1a] = '\0';
        s[1].sid_ctx[0x1b] = '\0';
      }
      uVar2 = *(undefined8 *)(s[1].krb5_client_princ + 0xa8);
      uVar3 = (uint)((ulong)lVar4 >> 0x3f);
      if (t < 1) {
        uVar3 = 0;
      }
      *(long *)s[1].krb5_client_princ = lVar4 + t;
      *(uint *)(s[1].krb5_client_princ + 8) = uVar3;
      FUN_009be424(uVar2,s);
      CRYPTO_THREAD_unlock(*(undefined8 *)(*(long *)(s[1].krb5_client_princ + 0xa8) + 0x3c8));
      return t;
    }
  }
  return 0;
}


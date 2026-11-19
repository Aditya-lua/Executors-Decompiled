/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009be71c
 */

long SSL_SESSION_set_timeout(SSL_SESSION *s,long t)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  uint uVar4;
  
  lVar2 = 0;
  if ((s != (SSL_SESSION *)0x0) && (-1 < t)) {
    uVar4 = (uint)((ulong)t >> 0x20);
    if (*(long *)(s[1].krb5_client_princ + 0xa8) == 0) {
      lVar2 = *(long *)(s[1].sid_ctx + 0x1c);
      *(long *)(s[1].sid_ctx + 0x14) = t;
      uVar4 = uVar4 >> 0x1f;
      if (lVar2 < 1) {
        uVar4 = 0;
      }
      *(long *)s[1].krb5_client_princ = lVar2 + t;
      *(uint *)(s[1].krb5_client_princ + 8) = uVar4;
    }
    else {
      iVar1 = CRYPTO_THREAD_write_lock
                        (*(undefined8 *)(*(long *)(s[1].krb5_client_princ + 0xa8) + 0x3c8));
      if (iVar1 == 0) {
        return 0;
      }
      lVar2 = *(long *)(s[1].sid_ctx + 0x1c);
      uVar3 = *(undefined8 *)(s[1].krb5_client_princ + 0xa8);
      uVar4 = uVar4 >> 0x1f;
      if (lVar2 < 1) {
        uVar4 = 0;
      }
      *(long *)(s[1].sid_ctx + 0x14) = t;
      *(long *)s[1].krb5_client_princ = lVar2 + t;
      *(uint *)(s[1].krb5_client_princ + 8) = uVar4;
      FUN_009be424(uVar3,s);
      CRYPTO_THREAD_unlock(*(undefined8 *)(*(long *)(s[1].krb5_client_princ + 0xa8) + 0x3c8));
    }
    lVar2 = 1;
  }
  return lVar2;
}


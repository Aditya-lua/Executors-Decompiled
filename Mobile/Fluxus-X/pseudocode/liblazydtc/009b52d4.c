/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b52d4
 */

int SSL_renegotiate(SSL *s)

{
  int iVar1;
  SSL_METHOD *pSVar2;
  
  iVar1 = FUN_009b531c();
  if (iVar1 == 0) {
    return 0;
  }
  pSVar2 = s->method;
  *(undefined4 *)&s[4].expand = 1;
  s->new_session = 1;
                    /* WARNING: Could not recover jumptable at 0x009b530c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (*pSVar2->ssl_renegotiate_check)(s);
  return iVar1;
}


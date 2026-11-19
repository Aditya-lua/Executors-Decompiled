/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009aeb94
 */

ulong SSL_set_ciphersuites(SSL *param_1)

{
  SSL_CTX **ppSVar1;
  uint uVar2;
  stack_st_SSL_CIPHER *psVar3;
  SSL_CTX *pSVar4;
  ulong uVar5;
  
  uVar2 = FUN_009ae98c(&param_1[1].next_proto_negotiated_len);
  ppSVar1 = &param_1[1].initial_ctx;
  if ((param_1[1].initial_ctx == (SSL_CTX *)0x0) &&
     (psVar3 = SSL_get_ciphers(param_1), psVar3 != (stack_st_SSL_CIPHER *)0x0)) {
    pSVar4 = (SSL_CTX *)OPENSSL_sk_dup();
    *ppSVar1 = pSVar4;
  }
  if ((uVar2 == 0) || (*ppSVar1 == (SSL_CTX *)0x0)) {
    return (ulong)uVar2;
  }
  uVar5 = FUN_009aea44(*(undefined8 *)&param_1[3].ex_data.dummy,ppSVar1,
                       &param_1[1].next_proto_negotiated,
                       *(undefined8 *)&param_1[1].next_proto_negotiated_len);
  return uVar5;
}


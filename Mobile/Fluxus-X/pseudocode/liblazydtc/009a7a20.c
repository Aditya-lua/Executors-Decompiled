/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a7a20
 */

long dtls1_min_mtu(SSL *param_1)

{
  BIO *bp;
  ulong uVar1;
  
  bp = SSL_get_wbio(param_1);
  uVar1 = BIO_ctrl(bp,0x31,0,(void *)0x0);
  return 0x100 - (uVar1 & 0xffffffff);
}


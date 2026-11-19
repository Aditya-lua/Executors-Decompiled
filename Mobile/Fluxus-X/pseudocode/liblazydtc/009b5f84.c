/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b5f84
 */

void SSL_get0_next_proto_negotiated(SSL *s,uchar **data,uint *len)

{
  uint uVar1;
  uchar *puVar2;
  
  puVar2 = s[4].init_msg;
  *data = puVar2;
  uVar1 = 0;
  if (puVar2 != (uchar *)0x0) {
    uVar1 = s[4].init_num;
  }
  *len = uVar1;
  return;
}


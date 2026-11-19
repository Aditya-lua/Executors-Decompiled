/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3bbc
 */

int SSL_get_fd(SSL *s)

{
  BIO *bp;
  int iVar1;
  int local_14;
  
  local_14 = -1;
  bp = BIO_find_type(s->rbio,0x100);
  iVar1 = -1;
  if (bp != (BIO *)0x0) {
    BIO_ctrl(bp,0x69,0,&local_14);
    iVar1 = local_14;
  }
  return iVar1;
}


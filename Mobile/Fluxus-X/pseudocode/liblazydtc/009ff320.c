/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ff320
 */

int BIO_sock_error(int sock)

{
  int iVar1;
  socklen_t *psVar2;
  socklen_t local_18 [2];
  
  local_18[1] = 0;
  local_18[0] = 4;
  psVar2 = local_18 + 1;
  iVar1 = getsockopt(sock,1,4,local_18 + 1,local_18);
  if (iVar1 < 0) {
    psVar2 = (socklen_t *)__errno();
  }
  return *psVar2;
}


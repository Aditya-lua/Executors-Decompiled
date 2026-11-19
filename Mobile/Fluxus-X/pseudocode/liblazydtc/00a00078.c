/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a00078
 */

int BIO_accept_ex(int param_1,undefined1 *param_2,uint param_3)

{
  undefined1 *puVar1;
  int iVar2;
  int iVar3;
  sockaddr *__addr;
  undefined4 *puVar4;
  undefined1 auStack_98 [116];
  socklen_t local_24;
  
  puVar1 = auStack_98;
  if (param_2 != (undefined1 *)0x0) {
    puVar1 = param_2;
  }
  local_24 = 0x70;
  __addr = (sockaddr *)BIO_ADDR_sockaddr_noconst(puVar1);
  iVar2 = accept(param_1,__addr,&local_24);
  if (iVar2 == -1) {
    iVar2 = BIO_sock_should_retry(-1);
    if (iVar2 != 0) {
      return -1;
    }
    ERR_new();
    ERR_set_debug("crypto/bio/bio_sock2.c",0x13b,"BIO_accept_ex");
    puVar4 = (undefined4 *)__errno();
    ERR_set_error(2,*puVar4,"calling accept()");
    ERR_new();
    ERR_set_debug("crypto/bio/bio_sock2.c",0x13d,"BIO_accept_ex");
    ERR_set_error(0x20,100,0);
  }
  else {
    iVar3 = BIO_socket_nbio(iVar2,param_3 >> 3 & 1);
    if (iVar3 != 0) {
      return iVar2;
    }
    close(iVar2);
  }
  return -1;
}


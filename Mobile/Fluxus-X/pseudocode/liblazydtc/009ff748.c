/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ff748
 */

undefined8 BIO_sock_info(int param_1,int param_2,undefined8 *param_3)

{
  int iVar1;
  sockaddr *__addr;
  undefined4 *puVar2;
  undefined8 uVar3;
  socklen_t local_24;
  
  if (param_2 == 0) {
    local_24 = 0x70;
    __addr = (sockaddr *)BIO_ADDR_sockaddr_noconst(*param_3);
    iVar1 = getsockname(param_1,__addr,&local_24);
    if (iVar1 == -1) {
      ERR_new();
      ERR_set_debug("crypto/bio/bio_sock.c",0x172,"BIO_sock_info");
      puVar2 = (undefined4 *)__errno();
      ERR_set_error(2,*puVar2,"calling getsockname()");
      ERR_new();
      ERR_set_debug("crypto/bio/bio_sock.c",0x174,"BIO_sock_info");
      uVar3 = 0x84;
    }
    else {
      if (local_24 < 0x71) {
        return 1;
      }
      ERR_new();
      ERR_set_debug("crypto/bio/bio_sock.c",0x178,"BIO_sock_info");
      uVar3 = 0x85;
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_sock.c",0x17e,"BIO_sock_info");
    uVar3 = 0x8c;
  }
  ERR_set_error(0x20,uVar3,0);
  return 0;
}


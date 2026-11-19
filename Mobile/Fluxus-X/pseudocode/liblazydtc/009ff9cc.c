/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ff9cc
 */

undefined4 BIO_connect(int param_1,undefined8 param_2,uint param_3)

{
  int iVar1;
  socklen_t __len;
  undefined4 *puVar2;
  sockaddr *__addr;
  undefined8 uVar3;
  undefined4 local_24;
  
  local_24 = 1;
  if (param_1 == -1) {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_sock2.c",0x54,"BIO_connect");
    uVar3 = 0x87;
  }
  else {
    iVar1 = BIO_socket_nbio(param_1,param_3 >> 3 & 1);
    if (iVar1 == 0) {
      return 0;
    }
    if (((param_3 >> 2 & 1) == 0) || (iVar1 = setsockopt(param_1,1,9,&local_24,4), iVar1 == 0)) {
      if (((param_3 >> 4 & 1) == 0) || (iVar1 = setsockopt(param_1,6,1,&local_24,4), iVar1 == 0)) {
        __addr = (sockaddr *)BIO_ADDR_sockaddr(param_2);
        __len = BIO_ADDR_sockaddr_size(param_2);
        iVar1 = connect(param_1,__addr,__len);
        if (iVar1 != -1) {
          return 1;
        }
        iVar1 = BIO_sock_should_retry(-1);
        if (iVar1 != 0) {
          return 0;
        }
        ERR_new(0);
        ERR_set_debug("crypto/bio/bio_sock2.c",0x72,"BIO_connect");
        puVar2 = (undefined4 *)__errno();
        ERR_set_error(2,*puVar2,"calling connect()");
        ERR_new();
        ERR_set_debug("crypto/bio/bio_sock2.c",0x74,"BIO_connect");
        uVar3 = 0x67;
      }
      else {
        ERR_new();
        ERR_set_debug("crypto/bio/bio_sock2.c",0x68,"BIO_connect");
        puVar2 = (undefined4 *)__errno();
        ERR_set_error(2,*puVar2,"calling setsockopt()");
        ERR_new();
        ERR_set_debug("crypto/bio/bio_sock2.c",0x6a,"BIO_connect");
        uVar3 = 0x8a;
      }
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/bio/bio_sock2.c",0x5e,"BIO_connect");
      puVar2 = (undefined4 *)__errno();
      ERR_set_error(2,*puVar2,"calling setsockopt()");
      ERR_new();
      ERR_set_debug("crypto/bio/bio_sock2.c",0x60,"BIO_connect");
      uVar3 = 0x89;
    }
  }
  ERR_set_error(0x20,uVar3,0);
  return 0;
}


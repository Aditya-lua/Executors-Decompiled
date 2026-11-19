/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ffbdc
 */

undefined8 BIO_bind(int param_1,undefined8 param_2,ulong param_3)

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
    ERR_set_debug("crypto/bio/bio_sock2.c",0x9b,"BIO_bind");
    uVar3 = 0x87;
  }
  else if (((param_3 & 1) == 0) || (iVar1 = setsockopt(param_1,1,2,&local_24,4), iVar1 == 0)) {
    __addr = (sockaddr *)BIO_ADDR_sockaddr(param_2);
    __len = BIO_ADDR_sockaddr_size(param_2);
    iVar1 = bind(param_1,__addr,__len);
    if (iVar1 == 0) {
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/bio/bio_sock2.c",0xb0,"BIO_bind");
    puVar2 = (undefined4 *)__errno();
    ERR_set_error(2,*puVar2,"calling bind()");
    ERR_new();
    ERR_set_debug("crypto/bio/bio_sock2.c",0xb2,"BIO_bind");
    uVar3 = 0x75;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_sock2.c",0xa7,"BIO_bind");
    puVar2 = (undefined4 *)__errno();
    ERR_set_error(2,*puVar2,"calling setsockopt()");
    ERR_new();
    ERR_set_debug("crypto/bio/bio_sock2.c",0xa9,"BIO_bind");
    uVar3 = 0x8b;
  }
  ERR_set_error(0x20,uVar3,0);
  return 0;
}


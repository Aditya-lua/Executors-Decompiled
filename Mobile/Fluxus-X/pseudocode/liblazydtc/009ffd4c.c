/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ffd4c
 */

undefined8 BIO_listen(int param_1,undefined8 param_2,uint param_3)

{
  int iVar1;
  undefined4 *puVar2;
  undefined8 uVar3;
  socklen_t local_34;
  int local_28;
  uint local_24;
  
  local_24 = 1;
  local_34 = 4;
  if (param_1 == -1) {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_sock2.c",0xe5,"BIO_listen");
    uVar3 = 0x87;
  }
  else {
    iVar1 = getsockopt(param_1,1,3,&local_28,&local_34);
    if ((iVar1 == 0) && (local_34 == 4)) {
      iVar1 = BIO_socket_nbio(param_1,param_3 >> 3 & 1);
      if (iVar1 == 0) {
        return 0;
      }
      if (((param_3 >> 2 & 1) == 0) || (iVar1 = setsockopt(param_1,1,9,&local_24,4), iVar1 == 0)) {
        if (((param_3 >> 4 & 1) == 0) || (iVar1 = setsockopt(param_1,6,1,&local_24,4), iVar1 == 0))
        {
          iVar1 = BIO_ADDR_family(param_2);
          if (iVar1 == 10) {
            local_24 = param_3 >> 1 & 1;
            iVar1 = setsockopt(param_1,0x29,0x1a,&local_24,4);
            if (iVar1 != 0) {
              ERR_new();
              ERR_set_debug("crypto/bio/bio_sock2.c",0x113,"BIO_listen");
              puVar2 = (undefined4 *)__errno();
              ERR_set_error(2,*puVar2,"calling setsockopt()");
              ERR_new();
              ERR_set_debug("crypto/bio/bio_sock2.c",0x115,"BIO_listen");
              uVar3 = 0x88;
              goto LAB_009ffeb4;
            }
          }
          uVar3 = BIO_bind(param_1,param_2,param_3);
          if ((int)uVar3 == 0) {
            return uVar3;
          }
          if ((local_28 == 2) || (iVar1 = listen(param_1,0x80), iVar1 != -1)) {
            return 1;
          }
          ERR_new();
          ERR_set_debug("crypto/bio/bio_sock2.c",0x11f,"BIO_listen");
          puVar2 = (undefined4 *)__errno();
          ERR_set_error(2,*puVar2,"calling listen()");
          ERR_new();
          ERR_set_debug("crypto/bio/bio_sock2.c",0x121,"BIO_listen");
          uVar3 = 0x77;
        }
        else {
          ERR_new();
          ERR_set_debug("crypto/bio/bio_sock2.c",0x102,"BIO_listen");
          puVar2 = (undefined4 *)__errno();
          ERR_set_error(2,*puVar2,"calling setsockopt()");
          ERR_new();
          ERR_set_debug("crypto/bio/bio_sock2.c",0x104,"BIO_listen");
          uVar3 = 0x8a;
        }
      }
      else {
        ERR_new();
        ERR_set_debug("crypto/bio/bio_sock2.c",0xf8,"BIO_listen");
        puVar2 = (undefined4 *)__errno();
        ERR_set_error(2,*puVar2,"calling setsockopt()");
        ERR_new();
        ERR_set_debug("crypto/bio/bio_sock2.c",0xfa,"BIO_listen");
        uVar3 = 0x89;
      }
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/bio/bio_sock2.c",0xec,"BIO_listen");
      puVar2 = (undefined4 *)__errno();
      ERR_set_error(2,*puVar2,"calling getsockopt()");
      ERR_new();
      ERR_set_debug("crypto/bio/bio_sock2.c",0xee,"BIO_listen");
      uVar3 = 0x86;
    }
  }
LAB_009ffeb4:
  ERR_set_error(0x20,uVar3,0);
  return 0;
}


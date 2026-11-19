/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ff3d0
 */

int BIO_get_accept_socket(char *host_port,int mode)

{
  int iVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  int iVar5;
  undefined8 uVar6;
  undefined8 local_40;
  void *local_38;
  void *local_28;
  
  local_28 = (void *)0x0;
  local_40 = 0;
  local_38 = (void *)0x0;
  iVar1 = BIO_parse_hostserv(host_port,&local_28,&local_38,1);
  if (iVar1 == 0) {
    return -1;
  }
  iVar1 = BIO_lookup(local_28,local_38,1,0,1,&local_40);
  if (iVar1 == 0) {
    uVar2 = BIO_ADDRINFO_family(local_40);
    uVar3 = BIO_ADDRINFO_socktype(local_40);
    uVar4 = BIO_ADDRINFO_protocol(local_40);
    iVar1 = BIO_socket(uVar2,uVar3,uVar4,0);
    if (iVar1 == -1) goto LAB_009ff424;
    uVar6 = BIO_ADDRINFO_address(local_40);
    iVar5 = BIO_listen(iVar1,uVar6,mode != 0);
    if (iVar5 != 0) goto LAB_009ff424;
    BIO_closesocket(iVar1);
  }
  iVar1 = -1;
LAB_009ff424:
  BIO_ADDRINFO_free(local_40);
  CRYPTO_free(local_28);
  CRYPTO_free(local_38);
  return iVar1;
}


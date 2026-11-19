/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ff4e8
 */

int BIO_accept(int sock,char **ip_port)

{
  int iVar1;
  char *__s;
  char *__s_00;
  size_t sVar2;
  size_t sVar3;
  char *pcVar4;
  undefined4 *puVar5;
  undefined1 auStack_b0 [112];
  
  iVar1 = BIO_accept_ex(sock,auStack_b0,0);
  if (iVar1 == -1) {
    iVar1 = BIO_sock_should_retry(-1);
    if (iVar1 == 0) {
      ERR_new();
      ERR_set_debug("crypto/bio/bio_sock.c",0x105,"BIO_accept");
      puVar5 = (undefined4 *)__errno();
      ERR_set_error(2,*puVar5,"calling accept()");
      ERR_new();
      ERR_set_debug("crypto/bio/bio_sock.c",0x107,"BIO_accept");
      ERR_set_error(0x20,100,0);
      return -1;
    }
    return -2;
  }
  if (ip_port == (char **)0x0) {
    return iVar1;
  }
  __s = (char *)BIO_ADDR_hostname_string(auStack_b0,1);
  __s_00 = (char *)BIO_ADDR_service_string(auStack_b0,1);
  if ((__s == (char *)0x0) || (__s_00 == (char *)0x0)) {
    *ip_port = (char *)0x0;
  }
  else {
    sVar2 = strlen(__s);
    sVar3 = strlen(__s_00);
    pcVar4 = (char *)CRYPTO_zalloc(sVar2 + sVar3 + 2,"crypto/bio/bio_sock.c",0x10f);
    *ip_port = pcVar4;
    if (pcVar4 != (char *)0x0) {
      strcpy(pcVar4,__s);
      pcVar4 = *ip_port;
      sVar2 = strlen(pcVar4);
      pcVar4 = pcVar4 + sVar2;
      pcVar4[0] = ':';
      pcVar4[1] = '\0';
      strcat(*ip_port,__s_00);
      goto LAB_009ff5f8;
    }
  }
  ERR_new();
  ERR_set_debug("crypto/bio/bio_sock.c",0x114,"BIO_accept");
  ERR_set_error(0x20,0xc0100,0);
  BIO_closesocket(iVar1);
  iVar1 = -1;
LAB_009ff5f8:
  CRYPTO_free(__s);
  CRYPTO_free(__s_00);
  return iVar1;
}


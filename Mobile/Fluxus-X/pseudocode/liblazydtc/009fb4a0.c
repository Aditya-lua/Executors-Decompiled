/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fb4a0
 */

undefined8
BIO_lookup_ex(char *param_1,char *param_2,int param_3,uint param_4,int param_5,int param_6,
             addrinfo **param_7)

{
  addrinfo *paVar1;
  int iVar2;
  size_t sVar3;
  addrinfo *paVar4;
  undefined4 *puVar5;
  undefined8 uVar6;
  char *pcVar7;
  uint uVar8;
  int iVar9;
  addrinfo local_80;
  
  switch(param_4) {
  case 0:
  case 2:
  case 10:
    iVar2 = BIO_sock_init();
    if (iVar2 != 1) {
      return 0;
    }
    uVar8 = 1;
    local_80.ai_addr = (sockaddr *)0x0;
    local_80.ai_addrlen = 0;
    local_80._20_4_ = 0;
    local_80.ai_next = (addrinfo *)0x0;
    local_80.ai_canonname = (char *)0x0;
    local_80._0_8_ = (ulong)param_4 << 0x20;
    local_80.ai_protocol = param_6;
    local_80.ai_socktype = param_5;
    if ((param_1 != (char *)0x0) && (param_4 == 0)) {
      local_80.ai_flags = 0x400;
      local_80.ai_family = 0;
      uVar8 = 0x401;
    }
    iVar2 = 0;
    iVar9 = 0;
    if (param_3 != 1) goto LAB_009fb718;
    while( true ) {
      local_80.ai_flags = uVar8;
      iVar9 = iVar2;
LAB_009fb718:
      iVar2 = getaddrinfo(param_1,param_2,&local_80,param_7);
      if (iVar2 == 0) {
        return 1;
      }
      if (iVar2 == 6) {
        ERR_new();
        uVar6 = 0x2d3;
        goto LAB_009fb7b4;
      }
      if (iVar2 == 0xb) {
        ERR_new();
        ERR_set_debug("crypto/bio/bio_addr.c",0x2cc,"BIO_lookup_ex");
        puVar5 = (undefined4 *)__errno();
        ERR_set_error(2,*puVar5,"calling getaddrinfo()");
        ERR_new();
        ERR_set_debug("crypto/bio/bio_addr.c",0x2ce,"BIO_lookup_ex");
        uVar6 = 0x80002;
        goto LAB_009fb824;
      }
      if (((uint)local_80.ai_flags >> 10 & 1) == 0) break;
      uVar8 = local_80.ai_flags & 0xfffffbffU | 4;
    }
    ERR_new();
    ERR_set_debug("crypto/bio/bio_addr.c",0x2e2,"BIO_lookup_ex");
    if (iVar9 != 0) {
      iVar2 = iVar9;
    }
    pcVar7 = gai_strerror(iVar2);
    uVar6 = 0x80002;
    goto LAB_009fb828;
  case 1:
    sVar3 = strlen(param_1);
    paVar4 = (addrinfo *)CRYPTO_zalloc(0x30,"crypto/bio/bio_addr.c",0x245);
    *param_7 = paVar4;
    if (paVar4 == (addrinfo *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/bio/bio_addr.c",0x246,"addrinfo_wrap");
      ERR_set_error(0x20,0xc0100,0);
    }
    else {
      paVar4->ai_family = 1;
      paVar4->ai_socktype = param_5;
      if (param_5 == 1) {
        iVar2 = 6;
LAB_009fb5f0:
        paVar4->ai_protocol = iVar2;
      }
      else if (param_5 == 2) {
        iVar2 = 0x11;
        goto LAB_009fb5f0;
      }
      paVar4->ai_protocol = 0;
      pcVar7 = (char *)CRYPTO_zalloc(0x70,"crypto/bio/bio_addr.c",0x36);
      if (pcVar7 == (char *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/bio/bio_addr.c",0x39,"BIO_ADDR_new");
        ERR_set_error(0x20,0xc0100,0);
      }
      else {
        pcVar7[0] = '\0';
        pcVar7[1] = '\0';
        if (sVar3 + 1 < 0x6d) {
          memset(pcVar7,0,0x6e);
          pcVar7[0] = '\x01';
          pcVar7[1] = '\0';
          strncpy(pcVar7 + 2,param_1,0x6b);
        }
        (*param_7)->ai_canonname = pcVar7;
      }
      (*param_7)->ai_next = (addrinfo *)0x0;
      paVar4 = *param_7;
      if (paVar4->ai_canonname != (char *)0x0) {
        return 1;
      }
      if (paVar4 != (addrinfo *)0x0) {
        if (paVar4->ai_family == 1) {
          do {
            paVar1 = paVar4->ai_next;
            CRYPTO_free(paVar4->ai_canonname);
            CRYPTO_free(paVar4);
            paVar4 = paVar1;
          } while (paVar1 != (addrinfo *)0x0);
        }
        else {
          freeaddrinfo(paVar4);
        }
      }
      *param_7 = (addrinfo *)0x0;
    }
    ERR_new();
    uVar6 = 0x2a7;
LAB_009fb7b4:
    ERR_set_debug("crypto/bio/bio_addr.c",uVar6,"BIO_lookup_ex");
    uVar6 = 0xc0100;
    break;
  default:
    ERR_new();
    ERR_set_debug("crypto/bio/bio_addr.c",0x29e,"BIO_lookup_ex");
    uVar6 = 0x83;
  }
LAB_009fb824:
  pcVar7 = (char *)0x0;
LAB_009fb828:
  ERR_set_error(0x20,uVar6,pcVar7);
  return 0;
}


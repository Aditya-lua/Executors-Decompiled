/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fae58
 */

undefined8 FUN_009fae58(sockaddr *param_1,int param_2,long *param_3,long *param_4)

{
  sa_family_t sVar1;
  int iVar2;
  undefined4 *puVar3;
  undefined8 uVar4;
  socklen_t __salen;
  undefined4 uVar5;
  char *pcVar6;
  uint uVar7;
  char local_468 [36];
  char acStack_444 [1028];
  
  iVar2 = BIO_sock_init();
  if (iVar2 != 1) {
    return 0;
  }
  memset(acStack_444,0,0x401);
  local_468[0x18] = '\0';
  local_468[0x19] = '\0';
  local_468[0x1a] = '\0';
  local_468[0x1b] = '\0';
  local_468[0x1c] = '\0';
  local_468[0x1d] = '\0';
  local_468[0x1e] = '\0';
  local_468[0x1f] = '\0';
  local_468[0x10] = '\0';
  local_468[0x11] = '\0';
  local_468[0x12] = '\0';
  local_468[0x13] = '\0';
  local_468[0x14] = '\0';
  local_468[0x15] = '\0';
  local_468[0x16] = '\0';
  local_468[0x17] = '\0';
  local_468[8] = '\0';
  local_468[9] = '\0';
  local_468[10] = '\0';
  local_468[0xb] = '\0';
  local_468[0xc] = '\0';
  local_468[0xd] = '\0';
  local_468[0xe] = '\0';
  local_468[0xf] = '\0';
  local_468[0] = '\0';
  local_468[1] = '\0';
  local_468[2] = '\0';
  local_468[3] = '\0';
  local_468[4] = '\0';
  local_468[5] = '\0';
  local_468[6] = '\0';
  local_468[7] = '\0';
  sVar1 = param_1->sa_family;
  uVar7 = 0;
  if (param_2 != 0) {
    uVar7 = 10;
  }
  if (sVar1 == 1) {
    __salen = 0x6e;
  }
  else if (sVar1 == 2) {
    __salen = 0x10;
  }
  else if (sVar1 == 10) {
    __salen = 0x1c;
  }
  else {
    __salen = 0x70;
  }
  iVar2 = getnameinfo(param_1,__salen,acStack_444,0x401,local_468,0x20,uVar7);
  if (iVar2 != 0) {
    ERR_new();
    if (iVar2 == 0xb) {
      ERR_set_debug("crypto/bio/bio_addr.c",0xe0,"addr_strings");
      puVar3 = (undefined4 *)__errno();
      uVar5 = *puVar3;
      pcVar6 = "calling getnameinfo()";
      uVar4 = 2;
    }
    else {
      ERR_set_debug("crypto/bio/bio_addr.c",0xe5,"addr_strings");
      pcVar6 = gai_strerror(iVar2);
      uVar4 = 0x20;
      uVar5 = 0x80002;
    }
    goto LAB_009fb084;
  }
  if (local_468[0] == '\0') {
    if ((param_1->sa_family | 8) == 10) {
      uVar7 = (uint)*(ushort *)param_1->sa_data;
    }
    else {
      uVar7 = 0;
    }
    BIO_snprintf(local_468,0x20,"%d",(ulong)(uVar7 >> 8 | (uVar7 & 0xff00ff) << 8));
  }
  if (param_3 != (long *)0x0) {
    pcVar6 = CRYPTO_strdup(acStack_444,"crypto/bio/bio_addr.c",0xf6);
    *param_3 = (long)pcVar6;
  }
  if (param_4 != (long *)0x0) {
    pcVar6 = CRYPTO_strdup(local_468,"crypto/bio/bio_addr.c",0xf8);
    *param_4 = (long)pcVar6;
  }
  if ((param_3 == (long *)0x0) || (*param_3 != 0)) {
    if ((param_4 == (long *)0x0) || (*param_4 != 0)) {
      return 1;
    }
    if (param_3 != (long *)0x0) {
      CRYPTO_free((void *)*param_3);
      *param_3 = 0;
    }
LAB_009fb040:
    CRYPTO_free((void *)*param_4);
    *param_4 = 0;
  }
  else {
    CRYPTO_free((void *)0x0);
    *param_3 = 0;
    if (param_4 != (long *)0x0) goto LAB_009fb040;
  }
  ERR_new();
  ERR_set_debug("crypto/bio/bio_addr.c",0x10e,"addr_strings");
  uVar4 = 0x20;
  uVar5 = 0xc0100;
  pcVar6 = (char *)0x0;
LAB_009fb084:
  ERR_set_error(uVar4,uVar5,pcVar6);
  return 0;
}


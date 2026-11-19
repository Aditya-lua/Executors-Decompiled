/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a232a4
 */

char * FUN_00a232a4(undefined8 param_1,char *param_2,char *param_3)

{
  char *pcVar1;
  size_t sVar2;
  size_t sVar3;
  undefined8 uVar4;
  long lVar5;
  int iVar6;
  
  if (param_2 == (char *)0x0 && param_3 == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/dso/dso_dlfcn.c",0xc9,"dlfcn_merger");
    ERR_set_error(0x25,0xc0102,0);
    return (char *)0x0;
  }
  if (param_3 != (char *)0x0) {
    if (param_2 == (char *)0x0) {
      pcVar1 = CRYPTO_strdup(param_3,"crypto/dso/dso_dlfcn.c",0xdb);
      if (pcVar1 != (char *)0x0) {
        return pcVar1;
      }
      ERR_new();
      uVar4 = 0xdd;
      goto LAB_00a23420;
    }
    if (*param_2 != '/') {
      sVar2 = strlen(param_3);
      sVar3 = strlen(param_2);
      lVar5 = sVar3 + (sVar2 & 0xffffffff);
      iVar6 = (int)sVar2;
      if ((iVar6 != 0) && (param_3[(long)((sVar2 << 0x20) + -0x100000000) >> 0x20] == '/')) {
        iVar6 = iVar6 + -1;
        lVar5 = lVar5 + -1;
      }
      pcVar1 = CRYPTO_malloc((int)((ulong)((lVar5 << 0x20) + 0x200000000) >> 0x20),
                             "crypto/dso/dso_dlfcn.c",0xf1);
      if (pcVar1 != (char *)0x0) {
        strcpy(pcVar1,param_3);
        pcVar1[iVar6] = '/';
        strcpy(pcVar1 + iVar6 + 1,param_2);
        return pcVar1;
      }
      ERR_new();
      uVar4 = 0xf3;
      goto LAB_00a23420;
    }
  }
  pcVar1 = CRYPTO_strdup(param_2,"crypto/dso/dso_dlfcn.c",0xd1);
  if (pcVar1 != (char *)0x0) {
    return pcVar1;
  }
  ERR_new();
  uVar4 = 0xd3;
LAB_00a23420:
  ERR_set_debug("crypto/dso/dso_dlfcn.c",uVar4,"dlfcn_merger");
  ERR_set_error(0x25,0xc0100,0);
  return (char *)0x0;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2319c
 */

char * FUN_00a2319c(DSO *param_1,char *param_2)

{
  uint uVar1;
  size_t sVar2;
  char *pcVar3;
  char *__s;
  int iVar4;
  
  sVar2 = strlen(param_2);
  pcVar3 = strchr(param_2,0x2f);
  if (pcVar3 == (char *)0x0) {
    uVar1 = DSO_flags(param_1);
    iVar4 = 7;
    if ((uVar1 & 2) != 0) {
      iVar4 = 4;
    }
    iVar4 = iVar4 + (int)sVar2;
  }
  else {
    iVar4 = (int)sVar2 + 1;
  }
  __s = CRYPTO_malloc(iVar4,"crypto/dso/dso_dlfcn.c",0x10b);
  if (__s == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/dso/dso_dlfcn.c",0x10d,"dlfcn_name_converter");
    ERR_set_error(0x25,0x6d,0);
  }
  else if (pcVar3 == (char *)0x0) {
    uVar1 = DSO_flags(param_1);
    if ((uVar1 >> 1 & 1) == 0) {
      pcVar3 = "lib%s.so";
    }
    else {
      pcVar3 = "%s.so";
    }
    sprintf(__s,pcVar3,param_2);
  }
  else {
    sVar2 = strlen(param_2);
    memcpy(__s,param_2,sVar2 + 1);
  }
  return __s;
}


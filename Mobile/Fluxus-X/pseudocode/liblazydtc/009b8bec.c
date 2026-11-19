/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8bec
 */

undefined8
FUN_009b8bec(char *param_1,long param_2,byte *param_3,long param_4,byte *param_5,long param_6)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  size_t sVar4;
  char *__dest;
  char *__s;
  char *__s_00;
  
  if (*(long *)(*(long *)(param_2 + 0x9a8) + 0x3d0) != 0) {
    sVar4 = strlen(param_1);
    lVar2 = sVar4 + (param_6 + param_4) * 2 + 3;
    __dest = CRYPTO_malloc((int)lVar2,"ssl/ssl_lib.c",0x15a7);
    if (__dest == (char *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0x15a8,"nss_keylog_int");
      ossl_statem_fatal(param_2,0x50,0xc0100,0);
      return 0;
    }
    strcpy(__dest,param_1);
    __s = __dest + sVar4 + 1;
    __dest[sVar4] = ' ';
    if (param_4 != 0) {
      lVar1 = param_4 * 2;
      do {
        sprintf(__s,"%02x",(ulong)*param_3);
        param_4 = param_4 + -1;
        __s = __s + 2;
        param_3 = param_3 + 1;
      } while (param_4 != 0);
      __s = __dest + sVar4 + lVar1 + 1;
    }
    __s_00 = __s + 1;
    *__s = ' ';
    if (param_6 != 0) {
      uVar3 = param_6 << 1;
      do {
        sprintf(__s_00,"%02x",(ulong)*param_5);
        param_6 = param_6 + -1;
        __s_00 = __s_00 + 2;
        param_5 = param_5 + 1;
      } while (param_6 != 0);
      __s_00 = __s + (uVar3 | 1);
    }
    *__s_00 = '\0';
    (**(code **)(*(long *)(param_2 + 0x9a8) + 0x3d0))(param_2,__dest);
    CRYPTO_clear_free(__dest,lVar2,"ssl/ssl_lib.c",0x15bd);
  }
  return 1;
}


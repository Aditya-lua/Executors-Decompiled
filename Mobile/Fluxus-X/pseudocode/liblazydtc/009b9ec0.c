/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b9ec0
 */

undefined8 FUN_009b9ec0(uint *param_1,long *param_2)

{
  uint uVar1;
  int iVar2;
  size_t sVar3;
  undefined8 uVar4;
  char *__s;
  size_t __n;
  char *__s2;
  
  if ((param_2 == (long *)0x0) || (__s = (char *)*param_2, __s == (char *)0x0)) {
LAB_009b9f8c:
    uVar4 = 0;
  }
  else {
    __s2 = *(char **)(param_1 + 2);
    if (__s2 == (char *)0x0) {
      if ((*param_1 & 1) != 0) {
        if (*__s != '-') {
          return 0;
        }
        if (__s[1] == '\0') goto LAB_009b9f8c;
        *param_2 = (long)(__s + 1);
      }
    }
    else {
      sVar3 = strlen(__s);
      __n = *(size_t *)(param_1 + 4);
      if (sVar3 <= __n) {
        return 0;
      }
      uVar1 = *param_1;
      if (((uVar1 & 1) != 0) && (iVar2 = strncmp(__s,__s2,__n), iVar2 != 0)) {
        return 0;
      }
      if ((uVar1 >> 1 & 1) != 0) {
        iVar2 = OPENSSL_strncasecmp(__s,__s2,__n);
        if (iVar2 != 0) {
          return 0;
        }
        __n = *(size_t *)(param_1 + 4);
        __s = (char *)*param_2;
      }
      *param_2 = (long)(__s + __n);
    }
    uVar4 = 1;
  }
  return uVar4;
}


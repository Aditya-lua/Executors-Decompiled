/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9b338
 */

long OPENSSL_DIR_read(long *param_1,char *param_2)

{
  undefined4 *puVar1;
  DIR *pDVar2;
  dirent *pdVar3;
  long lVar4;
  void *__s;
  undefined4 uVar5;
  
  puVar1 = (undefined4 *)__errno();
  if ((param_1 == (long *)0x0) || (param_2 == (char *)0x0)) {
    uVar5 = 0x16;
LAB_00a9b3a4:
    lVar4 = 0;
    *puVar1 = uVar5;
  }
  else {
    *puVar1 = 0;
    if ((undefined8 *)*param_1 == (undefined8 *)0x0) {
      __s = malloc(0x1010);
      *param_1 = (long)__s;
      if (__s == (void *)0x0) {
        uVar5 = 0xc;
        goto LAB_00a9b3a4;
      }
      memset(__s,0,0x1010);
      pDVar2 = opendir(param_2);
      *(DIR **)*param_1 = pDVar2;
      pDVar2 = *(DIR **)*param_1;
      if (pDVar2 == (DIR *)0x0) {
        uVar5 = *puVar1;
        free((undefined8 *)*param_1);
        *param_1 = 0;
        *puVar1 = uVar5;
        return 0;
      }
    }
    else {
      pDVar2 = *(DIR **)*param_1;
    }
    pdVar3 = readdir(pDVar2);
    lVar4 = 0;
    if (pdVar3 != (dirent *)0x0) {
      OPENSSL_strlcpy(*param_1 + 8,pdVar3->d_name,0x1001);
      lVar4 = *param_1 + 8;
    }
  }
  return lVar4;
}


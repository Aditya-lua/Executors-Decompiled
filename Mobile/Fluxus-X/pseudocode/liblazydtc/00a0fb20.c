/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0fb20
 */

int FUN_00a0fb20(undefined8 *param_1,undefined8 *param_2)

{
  int iVar1;
  char *__s1;
  char *__s2;
  int iVar2;
  
  if (((char *)*param_1 == (char *)*param_2) ||
     (iVar1 = strcmp((char *)*param_1,(char *)*param_2), iVar1 == 0)) {
    __s1 = (char *)param_1[1];
    __s2 = (char *)param_2[1];
    if ((__s1 != (char *)0x0) && (__s2 != (char *)0x0)) {
      iVar1 = strcmp(__s1,__s2);
      return iVar1;
    }
    iVar2 = 1;
    if (__s1 == (char *)0x0) {
      iVar2 = -1;
    }
    iVar1 = 0;
    if (__s1 != __s2) {
      iVar1 = iVar2;
    }
  }
  return iVar1;
}


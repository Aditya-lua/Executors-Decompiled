/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9df80
 */

undefined8 * OSSL_PARAM_locate_const(undefined8 *param_1,char *param_2)

{
  int iVar1;
  char *__s2;
  
  if ((param_1 != (undefined8 *)0x0) && (param_2 != (char *)0x0)) {
    __s2 = (char *)*param_1;
    while (__s2 != (char *)0x0) {
      iVar1 = strcmp(param_2,__s2);
      if (iVar1 == 0) {
        return param_1;
      }
      param_1 = param_1 + 5;
      __s2 = (char *)*param_1;
    }
  }
  return (undefined8 *)0x0;
}


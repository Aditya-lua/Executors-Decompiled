/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0096aa20
 */

undefined8 FUN_0096aa20(undefined8 *param_1,char *param_2)

{
  size_t __n;
  undefined8 *__dest;
  char *__s;
  ulong uVar1;
  long lVar2;
  long lVar3;
  
  param_1[4] = 0;
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  if ((param_2 == (char *)0x0) || (*(long *)(param_2 + 0x20) == 0)) {
    lVar2 = 0;
  }
  else {
    uVar1 = 0;
    lVar2 = 0;
    __s = param_2;
    do {
      __n = strlen(__s);
      if ((9 < __n) || (0x20 < lVar2 + __n + 2)) {
        return 2;
      }
      if (lVar2 == 0) {
        lVar3 = 0;
        __dest = param_1;
      }
      else {
        lVar3 = lVar2 + 1;
        *(undefined1 *)((long)param_1 + lVar2) = 0x2c;
        __dest = (undefined8 *)((long)param_1 + lVar3);
      }
      memcpy(__dest,__s,__n);
      uVar1 = uVar1 + 1;
      lVar2 = lVar3 + __n;
      __s = __s + 10;
    } while (uVar1 < *(ulong *)(param_2 + 0x20));
  }
  *(undefined1 *)((long)param_1 + lVar2) = 0;
  *(int *)((long)param_1 + 0x24) = (int)lVar2;
  return 0;
}


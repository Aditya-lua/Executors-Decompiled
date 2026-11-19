/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c1d28
 */

undefined8 tls1_lookup_md(undefined8 param_1,long param_2,long *param_3)

{
  long lVar1;
  undefined8 uVar2;
  
  if (param_2 == 0) {
    uVar2 = 0;
  }
  else {
    if (*(int *)(param_2 + 0xc) == 0) {
      lVar1 = 0;
    }
    else {
      lVar1 = ssl_md(param_1,*(undefined4 *)(param_2 + 0x10));
      if (lVar1 == 0) {
        return 0;
      }
    }
    if (param_3 != (long *)0x0) {
      *param_3 = lVar1;
    }
    uVar2 = 1;
  }
  return uVar2;
}


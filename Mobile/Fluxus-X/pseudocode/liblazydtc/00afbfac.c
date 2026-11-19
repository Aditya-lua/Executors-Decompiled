/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afbfac
 */

ulong FUN_00afbfac(uint *param_1,long *param_2)

{
  ulong uVar1;
  
  if (param_2 == (long *)0x0) {
    uVar1 = (ulong)*param_1;
  }
  else {
    memcpy((void *)*param_2,*(void **)(param_1 + 2),(long)(int)*param_1);
    uVar1 = (ulong)(int)*param_1;
    *param_2 = *param_2 + uVar1;
  }
  return uVar1;
}


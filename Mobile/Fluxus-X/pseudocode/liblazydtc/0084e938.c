/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084e938
 */

long * FUN_0084e938(long *param_1,ulong param_2)

{
  ulong uVar1;
  long *plVar2;
  long lVar3;
  
  lVar3 = *param_1;
  if (lVar3 != 0) {
    plVar2 = (long *)(lVar3 + 8 + param_1[1] + 7U & 0xfffffffffffffff8);
    if ((long)plVar2 + param_2 <= lVar3 + 0x2008U) {
      param_1[1] = (param_2 - (lVar3 + 8)) + (long)plVar2;
      return plVar2;
    }
  }
  uVar1 = param_2;
  if (param_2 < 0x2001) {
    uVar1 = 0x2000;
  }
  plVar2 = operator_new(uVar1 + 8);
  lVar3 = *param_1;
  *param_1 = (long)plVar2;
  param_1[1] = param_2;
  *plVar2 = lVar3;
  return plVar2 + 1;
}


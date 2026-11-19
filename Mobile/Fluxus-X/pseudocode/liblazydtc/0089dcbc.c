/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089dcbc
 */

void FUN_0089dcbc(long *param_1,ulong param_2)

{
  bool bVar1;
  long lVar2;
  
  lVar2 = param_1[1] - *param_1 >> 3;
  bVar1 = param_2 < (ulong)(lVar2 * -0x3333333333333333);
  lVar2 = param_2 + lVar2 * 0x3333333333333333;
  if (!bVar1 && lVar2 != 0) {
    FUN_0089f5cc(param_1,lVar2);
    return;
  }
  if (bVar1) {
    param_1[1] = *param_1 + param_2 * 0x28;
  }
  return;
}


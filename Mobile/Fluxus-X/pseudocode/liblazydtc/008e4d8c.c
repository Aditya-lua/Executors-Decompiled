/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4d8c
 */

int FUN_008e4d8c(long *param_1)

{
  int iVar1;
  long *plVar2;
  
  iVar1 = 0;
  plVar2 = param_1;
  while (plVar2 = (long *)*plVar2, plVar2 != param_1) {
    iVar1 = iVar1 + 1;
  }
  return iVar1;
}


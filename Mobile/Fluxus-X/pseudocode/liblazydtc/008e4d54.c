/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4d54
 */

void FUN_008e4d54(long *param_1,long param_2)

{
  long *plVar1;
  long lVar2;
  
  plVar1 = operator_new(0x18);
  plVar1[2] = param_2;
  lVar2 = *param_1;
  *(long **)(lVar2 + 8) = plVar1;
  *plVar1 = lVar2;
  plVar1[1] = (long)param_1;
  *param_1 = (long)plVar1;
  return;
}


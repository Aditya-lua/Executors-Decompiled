/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4204
 */

void FUN_008e4204(long param_1)

{
  ulong uVar1;
  void *pvVar2;
  ulong uVar3;
  
  param_1 = param_1 + 8;
  for (uVar3 = 0; uVar1 = FUN_008e524c(param_1), uVar3 < (uVar1 & 0xffffffff); uVar3 = uVar3 + 1) {
    pvVar2 = (void *)FUN_008e51d8(param_1,uVar3 & 0xffffffff);
    operator_delete(pvVar2);
  }
  FUN_008e5360(param_1);
  FUN_008e51c4(param_1);
  return;
}


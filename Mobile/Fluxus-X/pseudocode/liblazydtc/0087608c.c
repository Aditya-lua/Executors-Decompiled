/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087608c
 */

void FUN_0087608c(long param_1,ulong *param_2)

{
  long lVar1;
  ulong *puVar2;
  ulong uVar3;
  ulong uVar4;
  
  lVar1 = *(long *)(param_1 + 8) + (ulong)*(uint *)(param_1 + 0x20) * 0x88;
  puVar2 = (ulong *)(lVar1 + 0x70);
  if ((*(byte *)puVar2 & 1) != 0) {
    operator_delete(*(void **)(lVar1 + 0x80),*puVar2 & 0xfffffffffffffffe);
  }
  uVar4 = param_2[1];
  uVar3 = *param_2;
  *(ulong *)(lVar1 + 0x80) = param_2[2];
  *(ulong *)(lVar1 + 0x78) = uVar4;
  *puVar2 = uVar3;
  *(undefined2 *)param_2 = 0;
  return;
}


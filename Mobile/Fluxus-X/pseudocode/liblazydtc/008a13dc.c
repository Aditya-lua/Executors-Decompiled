/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a13dc
 */

undefined8 FUN_008a13dc(long param_1)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  
  lVar2 = FUN_008a210c();
  uVar1 = lVar2 + *(long *)(param_1 + 0x50);
  uVar3 = uVar1 & 0x8080808080808080;
  *(ulong *)(param_1 + 0x50) = uVar3 - (uVar3 >> 7) | uVar1 & 0x7f7f7f7f7f7f7f7f;
  *(undefined8 *)(param_1 + 0x58) = 0;
  return 0;
}


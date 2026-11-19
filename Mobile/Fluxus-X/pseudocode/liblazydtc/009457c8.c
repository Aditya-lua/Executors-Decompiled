/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009457c8
 */

bool FUN_009457c8(long param_1)

{
  bool bVar1;
  ulong uVar2;
  
  bVar1 = false;
  if (*(long *)(param_1 + 0x18) == 0) {
    uVar2 = FUN_00904984(param_1 + 0x60);
    bVar1 = *(ulong *)(param_1 + 0x88) < uVar2;
  }
  return bVar1;
}


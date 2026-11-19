/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c0c58
 */

ulong tls1_new(long param_1)

{
  int iVar1;
  ulong uVar2;
  
  uVar2 = ssl3_new();
  if ((int)uVar2 != 0) {
    iVar1 = (**(code **)(*(long *)(param_1 + 8) + 0x18))(param_1);
    uVar2 = (ulong)(iVar1 != 0);
  }
  return uVar2;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a27f8
 */

ulong FUN_008a27f8(long *param_1,long *param_2)

{
  ulong uVar1;
  ulong uVar2;
  
  uVar2 = *param_2 + *param_1 & 0x8080808080808080;
  uVar1 = 0;
  if ((param_2[1] & param_1[1]) != 0xffffffffffffffff) {
    uVar1 = param_2[1] & param_1[1] & 0x101010101010101U | 1;
  }
  uVar1 = uVar1 + (uVar2 - (uVar2 >> 7) | *param_2 + *param_1 & 0x7f7f7f7f7f7f7f7fU);
  uVar2 = uVar1 & 0x8080808080808080;
  return uVar2 - (uVar2 >> 7) | uVar1 & 0x7f7f7f7f7f7f7f7f;
}


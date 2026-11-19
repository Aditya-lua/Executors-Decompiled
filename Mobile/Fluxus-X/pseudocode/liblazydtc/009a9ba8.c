/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a9ba8
 */

ulong ssl_get_algorithm2(long param_1)

{
  uint uVar1;
  ulong uVar2;
  long lVar3;
  
  lVar3 = *(long *)(param_1 + 0x2e0);
  if (lVar3 == 0) {
    return 0xffffffffffffffff;
  }
  uVar1 = *(uint *)(lVar3 + 0x40);
  uVar2 = (ulong)uVar1;
  if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 2 & 1) == 0) {
    if ((uVar1 == 0x505) && ((*(uint *)(lVar3 + 0x1c) & 0x1c8) != 0)) {
      uVar2 = 0x909;
    }
  }
  else if (uVar1 == 0x909) {
    return 0x404;
  }
  return uVar2;
}


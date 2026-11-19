/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00877e08
 */

ulong FUN_00877e08(long param_1,ulong param_2)

{
  byte *pbVar1;
  uint uVar2;
  ulong uVar3;
  
  if (param_2 == 0) {
    return 0;
  }
  uVar3 = param_2 & 0xffffffff;
  do {
    uVar2 = (uint)uVar3;
    pbVar1 = (byte *)(param_1 + -1 + param_2);
    param_2 = param_2 - 1;
    uVar3 = (ulong)(uVar2 * 0x20 + (uVar2 >> 2) + (uint)*pbVar1 ^ uVar2);
  } while (param_2 != 0);
  return uVar3;
}


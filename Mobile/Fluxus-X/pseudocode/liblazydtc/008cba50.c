/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cba50
 */

uint FUN_008cba50(long param_1,long param_2)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  
  if (param_1 == param_2) {
    return 0;
  }
  uVar4 = (uint)*(byte *)(param_1 + 0x18) - (uint)*(byte *)(param_2 + 0x18);
  if (uVar4 == 0) {
    uVar1 = *(uint *)(param_1 + 0x14);
    uVar2 = *(uint *)(param_2 + 0x14);
    uVar3 = uVar1;
    if (uVar2 <= uVar1) {
      uVar3 = uVar2;
    }
    uVar4 = (uint)(uVar2 < uVar1);
    if (uVar2 > uVar1) {
      uVar4 = 0xffffffff;
    }
    uVar3 = memcmp((byte *)(param_1 + 0x18),(byte *)(param_2 + 0x18),(ulong)uVar3);
    if (uVar3 != 0) {
      uVar4 = uVar3;
    }
  }
  return uVar4;
}


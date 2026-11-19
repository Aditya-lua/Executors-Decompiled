/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b55ee0
 */

undefined8 SipHash_set_hash_size(long param_1,ulong param_2)

{
  ulong uVar1;
  ulong uVar2;
  undefined8 uVar3;
  
  uVar1 = 0x10;
  if (param_2 != 0) {
    uVar1 = param_2;
  }
  if ((uVar1 == 0x10) || (uVar3 = 0, uVar1 == 8)) {
    uVar2 = 0x10;
    if (*(uint *)(param_1 + 0x2c) != 0) {
      uVar2 = (ulong)*(uint *)(param_1 + 0x2c);
    }
    *(int *)(param_1 + 0x2c) = (int)uVar2;
    if (uVar2 != uVar1) {
      *(int *)(param_1 + 0x2c) = (int)uVar1;
      *(ulong *)(param_1 + 0x10) = *(ulong *)(param_1 + 0x10) ^ 0xee;
    }
    uVar3 = 1;
  }
  return uVar3;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b68ad8
 */

undefined8
ssl3_cbc_remove_padding_and_mac
          (ulong *param_1,undefined8 param_2,long param_3,undefined8 param_4,undefined8 param_5,
          ulong param_6,long param_7)

{
  ulong uVar1;
  undefined8 uVar2;
  ulong uVar3;
  ulong uVar4;
  
  uVar3 = *param_1;
  if (uVar3 < param_7 + 1U) {
    return 0;
  }
  uVar4 = (ulong)*(byte *)(param_3 + uVar3 + -1);
  uVar1 = param_7 + 1U + uVar4;
  uVar4 = uVar4 + 1;
  *param_1 = uVar3 - (uVar4 & ((long)((uVar3 - uVar1 ^ uVar1 | uVar1 ^ uVar3) ^ uVar3 |
                                     param_6 - uVar4 & (param_6 ^ 0xffffffffffffffff)) >> 0x3f ^
                              0xffffffffffffffffU));
  uVar2 = FUN_00b68b58();
  return uVar2;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4a84c
 */

long gf_hibit(ulong *param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong local_50;
  long local_48;
  long lStack_40;
  long local_38;
  long lStack_30;
  long local_28;
  long local_20;
  long lStack_18;
  
  uVar1 = (param_1[7] & 0x7fffffffffffff) * 2 + (param_1[6] >> 0x37 & 0xff);
  uVar2 = (param_1[6] & 0x7fffffffffffff) * 2 + (param_1[5] >> 0x37 & 0xff);
  uVar3 = (param_1[3] & 0x7fffffffffffff) * 2 + (param_1[2] >> 0x37 & 0xff);
  uVar7 = param_1[7] >> 0x37 & 0xff;
  uVar4 = (param_1[2] & 0x7fffffffffffff) * 2 + (param_1[1] >> 0x37 & 0xff);
  uVar5 = uVar7 + param_1[4] * 2;
  uVar7 = uVar7 + (*param_1 & 0x7fffffffffffff) * 2;
  uVar6 = (param_1[5] & 0x7fffffffffffff) * 2 + (uVar5 >> 0x38);
  local_50 = uVar1 >> 0x38;
  lStack_18 = (uVar1 & 0xffffffffffffff) + (uVar2 >> 0x38);
  uVar1 = (param_1[1] & 0x7fffffffffffff) * 2 + (*param_1 >> 0x37 & 0xff);
  local_38 = (uVar3 & 0xffffffffffffff) + (uVar4 >> 0x38);
  lStack_40 = (uVar4 & 0xffffffffffffff) + (uVar1 >> 0x38);
  local_20 = (uVar2 & 0xffffffffffffff) + (uVar6 >> 0x38);
  uVar2 = (uVar5 & 0xffffffffffffff) + (param_1[3] >> 0x37 & 0xff) + local_50;
  local_48 = (uVar1 & 0xffffffffffffff) + (uVar7 >> 0x38);
  local_28 = (uVar6 & 0xffffffffffffff) + (uVar2 >> 0x38);
  local_50 = (uVar7 & 0xffffffffffffff) + local_50;
  lStack_30 = (uVar2 & 0xffffffffffffff) + (uVar3 >> 0x38);
  gf_strong_reduce(&local_50);
  return -(local_50 & 1);
}


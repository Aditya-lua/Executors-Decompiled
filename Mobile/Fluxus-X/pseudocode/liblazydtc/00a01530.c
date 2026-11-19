/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a01530
 */

int BN_num_bits_word(ulong param_1)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  
  lVar2 = -(param_1 >> 0x20);
  uVar1 = (param_1 >> 0x20 ^ param_1) & lVar2 >> 0x3f ^ param_1;
  lVar3 = -(uVar1 >> 0x10);
  uVar1 = (uVar1 >> 0x10 ^ uVar1) & lVar3 >> 0x3f ^ uVar1;
  lVar4 = -(uVar1 >> 8);
  uVar1 = (uVar1 >> 8 ^ uVar1) & lVar4 >> 0x3f ^ uVar1;
  lVar5 = -(uVar1 >> 4);
  uVar1 = (uVar1 >> 4 ^ uVar1) & lVar5 >> 0x3f ^ uVar1;
  lVar6 = -(uVar1 >> 2);
  return ((uint)(lVar2 >> 0x3f) & 0x20 | (uint)(param_1 != 0) | (uint)(lVar3 >> 0x3f) & 0x10 |
          (uint)(lVar4 >> 0x3f) & 8 | (uint)(lVar5 >> 0x3f) & 4 | (uint)(lVar6 >> 0x3f) & 2) -
         (int)((long)-(((uVar1 >> 2 ^ uVar1) & lVar6 >> 0x3f ^ uVar1) >> 1) >> 0x3f);
}


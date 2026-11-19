/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae52f8
 */

undefined8 ossl_sm4_set_key(uint *param_1,long param_2)

{
  ulong uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  ulong uVar5;
  uint local_10 [4];
  
  uVar4 = (*param_1 & 0xff00ff00) >> 8 | (*param_1 & 0xff00ff) << 8;
  local_10[0] = (uVar4 >> 0x10 | uVar4 << 0x10) ^ 0xa3b1bac6;
  uVar4 = (param_1[1] & 0xff00ff00) >> 8 | (param_1[1] & 0xff00ff) << 8;
  local_10[1] = (uVar4 >> 0x10 | uVar4 << 0x10) ^ 0x56aa3350;
  uVar4 = (param_1[2] & 0xff00ff00) >> 8 | (param_1[2] & 0xff00ff) << 8;
  local_10[2] = (uVar4 >> 0x10 | uVar4 << 0x10) ^ 0x677d9197;
  uVar4 = (param_1[3] & 0xff00ff00) >> 8 | (param_1[3] & 0xff00ff) << 8;
  local_10[3] = (uVar4 >> 0x10 | uVar4 << 0x10) ^ 0xb27022dc;
  uVar5 = 0;
  do {
    uVar1 = uVar5 + 1;
    uVar3 = local_10[(ulong)((int)uVar5 + 2) & 3] ^ local_10[uVar1 & 3] ^
            local_10[(ulong)((int)uVar5 - 1) & 3] ^ (&DAT_00775f50)[uVar5];
    uVar4 = (uint)(byte)(&DAT_00775fd0)[uVar3 >> 0x18] << 0x18 |
            (uint)(byte)(&DAT_00775fd0)[uVar3 >> 0x10 & 0xff] << 0x10;
    uVar2 = uVar4 | (uint)(byte)(&DAT_00775fd0)[uVar3 >> 8 & 0xff] << 8;
    uVar3 = uVar2 | (byte)(&DAT_00775fd0)[uVar3 & 0xff];
    uVar4 = uVar3 ^ local_10[uVar5 & 3] ^ (uint)(CONCAT44(uVar3,uVar4) >> 0x13) ^
            (uint)(CONCAT44(uVar3,uVar2) >> 9);
    local_10[uVar5 & 3] = uVar4;
    *(uint *)(param_2 + uVar5 * 4) = uVar4;
    uVar5 = uVar1;
  } while (uVar1 != 0x20);
  return 1;
}


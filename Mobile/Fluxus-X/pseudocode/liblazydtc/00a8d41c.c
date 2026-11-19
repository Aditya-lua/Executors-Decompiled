/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8d41c
 */

void BF_encrypt(uint *data,BF_KEY *key)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  
  uVar1 = key->P[0] ^ *data;
  uVar2 = key->P[1] ^ data[1] ^
          (key->S[uVar1 >> 0x10 & 0xff | 0x100] + key->S[uVar1 >> 0x18] ^
          key->S[uVar1 >> 8 & 0xff | 0x200]) + key->S[uVar1 & 0xff | 0x300];
  uVar1 = key->P[2] ^ uVar1 ^
          (key->S[uVar2 >> 0x10 & 0xff | 0x100] + key->S[uVar2 >> 0x18] ^
          key->S[uVar2 >> 8 & 0xff | 0x200]) + key->S[uVar2 & 0xff | 0x300];
  uVar2 = key->P[3] ^ uVar2 ^
          (key->S[uVar1 >> 0x10 & 0xff | 0x100] + key->S[uVar1 >> 0x18] ^
          key->S[uVar1 >> 8 & 0xff | 0x200]) + key->S[uVar1 & 0xff | 0x300];
  uVar1 = key->P[4] ^ uVar1 ^
          (key->S[uVar2 >> 0x10 & 0xff | 0x100] + key->S[uVar2 >> 0x18] ^
          key->S[uVar2 >> 8 & 0xff | 0x200]) + key->S[uVar2 & 0xff | 0x300];
  uVar2 = key->P[5] ^ uVar2 ^
          (key->S[uVar1 >> 0x10 & 0xff | 0x100] + key->S[uVar1 >> 0x18] ^
          key->S[uVar1 >> 8 & 0xff | 0x200]) + key->S[uVar1 & 0xff | 0x300];
  uVar1 = key->P[6] ^ uVar1 ^
          (key->S[uVar2 >> 0x10 & 0xff | 0x100] + key->S[uVar2 >> 0x18] ^
          key->S[uVar2 >> 8 & 0xff | 0x200]) + key->S[uVar2 & 0xff | 0x300];
  uVar2 = key->P[7] ^ uVar2 ^
          (key->S[uVar1 >> 0x10 & 0xff | 0x100] + key->S[uVar1 >> 0x18] ^
          key->S[uVar1 >> 8 & 0xff | 0x200]) + key->S[uVar1 & 0xff | 0x300];
  uVar1 = key->P[8] ^ uVar1 ^
          (key->S[uVar2 >> 0x10 & 0xff | 0x100] + key->S[uVar2 >> 0x18] ^
          key->S[uVar2 >> 8 & 0xff | 0x200]) + key->S[uVar2 & 0xff | 0x300];
  uVar2 = key->P[9] ^ uVar2 ^
          (key->S[uVar1 >> 0x10 & 0xff | 0x100] + key->S[uVar1 >> 0x18] ^
          key->S[uVar1 >> 8 & 0xff | 0x200]) + key->S[uVar1 & 0xff | 0x300];
  uVar1 = key->P[10] ^ uVar1 ^
          (key->S[uVar2 >> 0x10 & 0xff | 0x100] + key->S[uVar2 >> 0x18] ^
          key->S[uVar2 >> 8 & 0xff | 0x200]) + key->S[uVar2 & 0xff | 0x300];
  uVar2 = key->P[0xb] ^ uVar2 ^
          (key->S[uVar1 >> 0x10 & 0xff | 0x100] + key->S[uVar1 >> 0x18] ^
          key->S[uVar1 >> 8 & 0xff | 0x200]) + key->S[uVar1 & 0xff | 0x300];
  uVar1 = key->P[0xc] ^ uVar1 ^
          (key->S[uVar2 >> 0x10 & 0xff | 0x100] + key->S[uVar2 >> 0x18] ^
          key->S[uVar2 >> 8 & 0xff | 0x200]) + key->S[uVar2 & 0xff | 0x300];
  uVar2 = key->P[0xd] ^ uVar2 ^
          (key->S[uVar1 >> 0x10 & 0xff | 0x100] + key->S[uVar1 >> 0x18] ^
          key->S[uVar1 >> 8 & 0xff | 0x200]) + key->S[uVar1 & 0xff | 0x300];
  uVar3 = key->P[0x10];
  uVar1 = key->P[0xe] ^ uVar1 ^
          (key->S[uVar2 >> 0x10 & 0xff | 0x100] + key->S[uVar2 >> 0x18] ^
          key->S[uVar2 >> 8 & 0xff | 0x200]) + key->S[uVar2 & 0xff | 0x300];
  uVar2 = key->P[0xf] ^ uVar2 ^
          (key->S[uVar1 >> 0x10 & 0xff | 0x100] + key->S[uVar1 >> 0x18] ^
          key->S[uVar1 >> 8 & 0xff | 0x200]) + key->S[uVar1 & 0xff | 0x300];
  uVar4 = key->S[uVar2 >> 0x18];
  uVar5 = key->S[uVar2 >> 0x10 & 0xff | 0x100];
  uVar6 = key->S[uVar2 >> 8 & 0xff | 0x200];
  uVar7 = key->S[uVar2 & 0xff | 0x300];
  *data = key->P[0x11] ^ uVar2;
  data[1] = uVar3 ^ uVar1 ^ (uVar5 + uVar4 ^ uVar6) + uVar7;
  return;
}


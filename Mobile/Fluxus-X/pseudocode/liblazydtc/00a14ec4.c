/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a14ec4
 */

void DES_encrypt1(uint *data,DES_key_schedule *ks,int enc)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint *puVar5;
  
  uVar2 = (*data ^ data[1] >> 4) & 0xf0f0f0f;
  uVar3 = data[1] ^ uVar2 << 4;
  uVar2 = uVar2 ^ *data;
  uVar4 = uVar3 & 0xffff ^ uVar2 >> 0x10;
  uVar3 = uVar4 ^ uVar3;
  uVar2 = uVar2 ^ uVar4 << 0x10;
  uVar4 = (uVar2 ^ uVar3 >> 2) & 0x33333333;
  uVar2 = uVar4 ^ uVar2;
  uVar3 = uVar3 ^ uVar4 << 2;
  uVar4 = (uVar3 ^ uVar2 >> 8) & 0xff00ff;
  uVar3 = uVar4 ^ uVar3;
  uVar2 = uVar2 ^ uVar4 << 8;
  uVar4 = (uVar2 ^ uVar3 >> 1) & 0x55555555;
  uVar2 = uVar4 ^ uVar2;
  uVar3 = uVar3 ^ uVar4 << 1;
  uVar2 = uVar2 >> 0x1d | uVar2 << 3;
  uVar4 = uVar3 >> 0x1d | uVar3 << 3;
  if (enc == 0) {
    uVar3 = ks->ks[0xf].deslong[0] ^ uVar2;
    uVar1 = *(uint *)((long)ks->ks + 0x7c) ^ uVar2;
    uVar4 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar4 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar4 ^ ks->ks[0xe].deslong[0];
    uVar1 = uVar4 ^ *(uint *)((long)ks->ks + 0x74);
    uVar2 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar2 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar2 ^ ks->ks[0xd].deslong[0];
    uVar1 = uVar2 ^ *(uint *)((long)ks->ks + 0x6c);
    uVar4 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar4 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar4 ^ ks->ks[0xc].deslong[0];
    uVar1 = uVar4 ^ *(uint *)((long)ks->ks + 100);
    uVar2 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar2 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar2 ^ ks->ks[0xb].deslong[0];
    uVar1 = uVar2 ^ *(uint *)((long)ks->ks + 0x5c);
    uVar4 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar4 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar4 ^ ks->ks[10].deslong[0];
    uVar1 = uVar4 ^ *(uint *)((long)ks->ks + 0x54);
    uVar2 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar2 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar2 ^ ks->ks[9].deslong[0];
    uVar1 = uVar2 ^ *(uint *)((long)ks->ks + 0x4c);
    uVar4 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar4 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar4 ^ ks->ks[8].deslong[0];
    uVar1 = uVar4 ^ *(uint *)((long)ks->ks + 0x44);
    uVar2 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar2 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar2 ^ ks->ks[7].deslong[0];
    uVar1 = uVar2 ^ *(uint *)((long)ks->ks + 0x3c);
    uVar4 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar4 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar4 ^ ks->ks[6].deslong[0];
    uVar1 = uVar4 ^ *(uint *)((long)ks->ks + 0x34);
    uVar2 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar2 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar2 ^ ks->ks[5].deslong[0];
    uVar1 = uVar2 ^ *(uint *)((long)ks->ks + 0x2c);
    uVar4 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar4 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar4 ^ ks->ks[4].deslong[0];
    uVar1 = uVar4 ^ *(uint *)((long)ks->ks + 0x24);
    uVar2 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar2 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar2 ^ ks->ks[3].deslong[0];
    uVar1 = uVar2 ^ *(uint *)((long)ks->ks + 0x1c);
    uVar4 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar4 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar4 ^ ks->ks[2].deslong[0];
    uVar1 = uVar4 ^ *(uint *)((long)ks->ks + 0x14);
    uVar2 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar2 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar2 ^ ks->ks[1].deslong[0];
    uVar1 = uVar2 ^ *(uint *)((long)ks->ks + 0xc);
    uVar3 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar4 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar4 = uVar3 ^ ks->ks[0].deslong[0];
    puVar5 = ks->ks[0].deslong + 1;
  }
  else {
    uVar3 = ks->ks[0].deslong[0] ^ uVar2;
    uVar1 = ks->ks[0].deslong[1] ^ uVar2;
    uVar4 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar4 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar4 ^ ks->ks[1].deslong[0];
    uVar1 = uVar4 ^ *(uint *)((long)ks->ks + 0xc);
    uVar2 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar2 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar2 ^ ks->ks[2].deslong[0];
    uVar1 = uVar2 ^ *(uint *)((long)ks->ks + 0x14);
    uVar4 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar4 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar4 ^ ks->ks[3].deslong[0];
    uVar1 = uVar4 ^ *(uint *)((long)ks->ks + 0x1c);
    uVar2 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar2 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar2 ^ ks->ks[4].deslong[0];
    uVar1 = uVar2 ^ *(uint *)((long)ks->ks + 0x24);
    uVar4 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar4 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar4 ^ ks->ks[5].deslong[0];
    uVar1 = uVar4 ^ *(uint *)((long)ks->ks + 0x2c);
    uVar2 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar2 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar2 ^ ks->ks[6].deslong[0];
    uVar1 = uVar2 ^ *(uint *)((long)ks->ks + 0x34);
    uVar4 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar4 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar4 ^ ks->ks[7].deslong[0];
    uVar1 = uVar4 ^ *(uint *)((long)ks->ks + 0x3c);
    uVar2 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar2 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar2 ^ ks->ks[8].deslong[0];
    uVar1 = uVar2 ^ *(uint *)((long)ks->ks + 0x44);
    uVar4 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar4 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar4 ^ ks->ks[9].deslong[0];
    uVar1 = uVar4 ^ *(uint *)((long)ks->ks + 0x4c);
    uVar2 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar2 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar2 ^ ks->ks[10].deslong[0];
    uVar1 = uVar2 ^ *(uint *)((long)ks->ks + 0x54);
    uVar4 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar4 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar4 ^ ks->ks[0xb].deslong[0];
    uVar1 = uVar4 ^ *(uint *)((long)ks->ks + 0x5c);
    uVar2 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar2 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar2 ^ ks->ks[0xc].deslong[0];
    uVar1 = uVar2 ^ *(uint *)((long)ks->ks + 100);
    uVar4 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar4 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar4 ^ ks->ks[0xd].deslong[0];
    uVar1 = uVar4 ^ *(uint *)((long)ks->ks + 0x6c);
    uVar2 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar2 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar2 ^ ks->ks[0xe].deslong[0];
    uVar1 = uVar2 ^ *(uint *)((long)ks->ks + 0x74);
    uVar3 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar4 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar4 = uVar3 ^ ks->ks[0xf].deslong[0];
    puVar5 = (uint *)((long)ks->ks + 0x7c);
  }
  uVar1 = uVar3 >> 3 | uVar3 << 0x1d;
  uVar3 = uVar3 ^ *puVar5;
  uVar2 = *(uint *)(DES_SPtrans + (ulong)(uVar4 >> 2 & 0x3f) * 4) ^ uVar2 ^
          *(uint *)(DES_SPtrans + (ulong)(uVar4 >> 10 & 0x3f) * 4 + 0x200) ^
          *(uint *)(DES_SPtrans + (ulong)(uVar4 >> 0x12 & 0x3f) * 4 + 0x400) ^
          *(uint *)(DES_SPtrans + (ulong)(uVar4 >> 0x1a) * 4 + 0x600) ^
          *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 6 & 0x3f) * 4 + 0x100) ^
          *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0xe & 0x3f) * 4 + 0x300) ^
          *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x16 & 0x3f) * 4 + 0x500) ^
          *(uint *)(DES_SPtrans + (ulong)((uVar3 >> 4 | uVar3 << 0x1c) >> 0x1a) * 4 + 0x700);
  uVar3 = uVar2 >> 3 | uVar2 << 0x1d;
  uVar2 = (uVar1 ^ uVar3 >> 1) & 0x55555555;
  uVar1 = uVar2 ^ uVar1;
  uVar3 = uVar3 ^ uVar2 << 1;
  uVar2 = (uVar3 ^ uVar1 >> 8) & 0xff00ff;
  uVar3 = uVar2 ^ uVar3;
  uVar1 = uVar1 ^ uVar2 << 8;
  uVar2 = (uVar1 ^ uVar3 >> 2) & 0x33333333;
  uVar3 = uVar3 ^ uVar2 << 2;
  uVar2 = uVar2 ^ uVar1;
  uVar4 = uVar3 & 0xffff ^ uVar2 >> 0x10;
  uVar3 = uVar4 ^ uVar3;
  uVar2 = uVar2 ^ uVar4 << 0x10;
  uVar4 = (uVar2 ^ uVar3 >> 4) & 0xf0f0f0f;
  *data = uVar4 ^ uVar2;
  data[1] = uVar3 ^ uVar4 << 4;
  return;
}


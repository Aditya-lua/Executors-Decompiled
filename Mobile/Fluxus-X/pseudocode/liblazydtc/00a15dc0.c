/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a15dc0
 */

void DES_encrypt2(uint *data,DES_key_schedule *ks,int enc)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint *puVar4;
  uint uVar5;
  
  uVar5 = *data >> 0x1d | *data << 3;
  uVar2 = data[1] >> 0x1d | data[1] << 3;
  if (enc == 0) {
    uVar3 = ks->ks[0xf].deslong[0] ^ uVar5;
    uVar1 = *(uint *)((long)ks->ks + 0x7c) ^ uVar5;
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
    uVar5 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar5 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar5 ^ ks->ks[0xd].deslong[0];
    uVar1 = uVar5 ^ *(uint *)((long)ks->ks + 0x6c);
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
    uVar5 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar5 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar5 ^ ks->ks[0xb].deslong[0];
    uVar1 = uVar5 ^ *(uint *)((long)ks->ks + 0x5c);
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
    uVar5 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar5 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar5 ^ ks->ks[9].deslong[0];
    uVar1 = uVar5 ^ *(uint *)((long)ks->ks + 0x4c);
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
    uVar5 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar5 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar5 ^ ks->ks[7].deslong[0];
    uVar1 = uVar5 ^ *(uint *)((long)ks->ks + 0x3c);
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
    uVar5 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar5 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar5 ^ ks->ks[5].deslong[0];
    uVar1 = uVar5 ^ *(uint *)((long)ks->ks + 0x2c);
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
    uVar5 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar5 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar5 ^ ks->ks[3].deslong[0];
    uVar1 = uVar5 ^ *(uint *)((long)ks->ks + 0x1c);
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
    uVar5 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar5 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar5 ^ ks->ks[1].deslong[0];
    uVar1 = uVar5 ^ *(uint *)((long)ks->ks + 0xc);
    uVar2 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar2 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar2 ^ ks->ks[0].deslong[0];
    puVar4 = ks->ks[0].deslong + 1;
  }
  else {
    uVar3 = ks->ks[0].deslong[0] ^ uVar5;
    uVar1 = ks->ks[0].deslong[1] ^ uVar5;
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
    uVar5 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar5 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar5 ^ ks->ks[2].deslong[0];
    uVar1 = uVar5 ^ *(uint *)((long)ks->ks + 0x14);
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
    uVar5 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar5 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar5 ^ ks->ks[4].deslong[0];
    uVar1 = uVar5 ^ *(uint *)((long)ks->ks + 0x24);
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
    uVar5 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar5 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar5 ^ ks->ks[6].deslong[0];
    uVar1 = uVar5 ^ *(uint *)((long)ks->ks + 0x34);
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
    uVar5 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar5 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar5 ^ ks->ks[8].deslong[0];
    uVar1 = uVar5 ^ *(uint *)((long)ks->ks + 0x44);
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
    uVar5 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar5 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar5 ^ ks->ks[10].deslong[0];
    uVar1 = uVar5 ^ *(uint *)((long)ks->ks + 0x54);
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
    uVar5 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar5 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar5 ^ ks->ks[0xc].deslong[0];
    uVar1 = uVar5 ^ *(uint *)((long)ks->ks + 100);
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
    uVar5 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar5 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar5 ^ ks->ks[0xe].deslong[0];
    uVar1 = uVar5 ^ *(uint *)((long)ks->ks + 0x74);
    uVar2 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar2 ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
            *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
            *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
    uVar3 = uVar2 ^ ks->ks[0xf].deslong[0];
    puVar4 = (uint *)((long)ks->ks + 0x7c);
  }
  uVar1 = uVar2 ^ *puVar4;
  uVar5 = *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 2 & 0x3f) * 4) ^ uVar5 ^
          *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 10 & 0x3f) * 4 + 0x200) ^
          *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x12 & 0x3f) * 4 + 0x400) ^
          *(uint *)(DES_SPtrans + (ulong)(uVar3 >> 0x1a) * 4 + 0x600) ^
          *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 6 & 0x3f) * 4 + 0x100) ^
          *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0xe & 0x3f) * 4 + 0x300) ^
          *(uint *)(DES_SPtrans + (ulong)(uVar1 >> 0x16 & 0x3f) * 4 + 0x500) ^
          *(uint *)(DES_SPtrans + (ulong)((uVar1 >> 4 | uVar1 << 0x1c) >> 0x1a) * 4 + 0x700);
  *data = uVar2 >> 3 | uVar2 << 0x1d;
  data[1] = uVar5 >> 3 | uVar5 << 0x1d;
  return;
}


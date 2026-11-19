/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acbc70
 */

void RC4_set_key(RC4_KEY *key,int len,uchar *data)

{
  ulong uVar1;
  uint uVar2;
  int iVar3;
  byte bVar4;
  ulong uVar5;
  int iVar6;
  ulong uVar7;
  
  *(undefined8 *)((long)key->data + 2) = 0xf0e0d0c0b0a0908;
  *(undefined8 *)((long)&key->x + 2) = 0x706050403020100;
  *(undefined8 *)((long)key->data + 0x12) = 0x1f1e1d1c1b1a1918;
  *(undefined8 *)((long)key->data + 10) = 0x1716151413121110;
  *(undefined8 *)((long)key->data + 0x22) = 0x2f2e2d2c2b2a2928;
  *(undefined8 *)((long)key->data + 0x1a) = 0x2726252423222120;
  *(undefined8 *)((long)key->data + 0x32) = 0x3f3e3d3c3b3a3938;
  *(undefined8 *)((long)key->data + 0x2a) = 0x3736353433323130;
  *(undefined8 *)((long)key->data + 0x42) = 0x4f4e4d4c4b4a4948;
  *(undefined8 *)((long)key->data + 0x3a) = 0x4746454443424140;
  *(undefined8 *)((long)key->data + 0x52) = 0x5f5e5d5c5b5a5958;
  *(undefined8 *)((long)key->data + 0x4a) = 0x5756555453525150;
  *(undefined8 *)((long)key->data + 0x62) = 0x6f6e6d6c6b6a6968;
  *(undefined8 *)((long)key->data + 0x5a) = 0x6766656463626160;
  *(undefined8 *)((long)key->data + 0x72) = 0x7f7e7d7c7b7a7978;
  *(undefined8 *)((long)key->data + 0x6a) = 0x7776757473727170;
  *(undefined8 *)((long)key->data + 0x82) = 0x8f8e8d8c8b8a8988;
  *(undefined8 *)((long)key->data + 0x7a) = 0x8786858483828180;
  *(undefined8 *)((long)key->data + 0x92) = 0x9f9e9d9c9b9a9998;
  *(undefined8 *)((long)key->data + 0x8a) = 0x9796959493929190;
  *(undefined8 *)((long)key->data + 0xa2) = 0xafaeadacabaaa9a8;
  *(undefined8 *)((long)key->data + 0x9a) = 0xa7a6a5a4a3a2a1a0;
  *(undefined8 *)((long)key->data + 0xb2) = 0xbfbebdbcbbbab9b8;
  *(undefined8 *)((long)key->data + 0xaa) = 0xb7b6b5b4b3b2b1b0;
  *(undefined8 *)((long)key->data + 0xc2) = 0xcfcecdcccbcac9c8;
  *(undefined8 *)((long)key->data + 0xba) = 0xc7c6c5c4c3c2c1c0;
  iVar6 = 0;
  uVar7 = 0;
  *(undefined8 *)((long)key->data + 0xd2) = 0xdfdedddcdbdad9d8;
  *(undefined8 *)((long)key->data + 0xca) = 0xd7d6d5d4d3d2d1d0;
  *(undefined8 *)((long)key->data + 0xe2) = 0xefeeedecebeae9e8;
  *(undefined8 *)((long)key->data + 0xda) = 0xe7e6e5e4e3e2e1e0;
  *(undefined2 *)&key->x = 0;
  *(undefined8 *)((long)key->data + 0xf2) = 0xfffefdfcfbfaf9f8;
  *(undefined8 *)((long)key->data + 0xea) = 0xf7f6f5f4f3f2f1f0;
  uVar5 = 0;
  do {
    bVar4 = *(byte *)((long)key->data + (uVar5 - 6));
    uVar2 = (int)uVar7 + (uint)bVar4 + (uint)data[iVar6];
    uVar7 = (ulong)(uVar2 & 0xff);
    iVar3 = 0;
    if (iVar6 + 1 != len) {
      iVar3 = iVar6 + 1;
    }
    *(undefined1 *)((long)key->data + (uVar5 - 6)) = *(undefined1 *)((long)key->data + (uVar7 - 6));
    *(byte *)((long)key->data + (uVar7 - 6)) = bVar4;
    bVar4 = *(byte *)((long)key->data + (uVar5 - 5));
    iVar6 = 0;
    if (iVar3 + 1 != len) {
      iVar6 = iVar3 + 1;
    }
    uVar2 = uVar2 + bVar4 + (uint)data[iVar3];
    uVar7 = (ulong)(uVar2 & 0xff);
    uVar1 = uVar5 + 4;
    *(undefined1 *)((long)key->data + (uVar5 - 5)) = *(undefined1 *)((long)key->data + (uVar7 - 6));
    *(byte *)((long)key->data + (uVar7 - 6)) = bVar4;
    bVar4 = *(byte *)((long)key->data + (uVar5 - 4));
    iVar3 = 0;
    if (iVar6 + 1 != len) {
      iVar3 = iVar6 + 1;
    }
    uVar2 = uVar2 + bVar4 + (uint)data[iVar6];
    uVar7 = (ulong)(uVar2 & 0xff);
    *(undefined1 *)((long)key->data + (uVar5 - 4)) = *(undefined1 *)((long)key->data + (uVar7 - 6));
    *(byte *)((long)key->data + (uVar7 - 6)) = bVar4;
    bVar4 = *(byte *)((long)key->data + (uVar5 - 3));
    uVar7 = (ulong)(uVar2 + bVar4 + (uint)data[iVar3] & 0xff);
    iVar6 = 0;
    if (iVar3 + 1 != len) {
      iVar6 = iVar3 + 1;
    }
    *(undefined1 *)((long)key->data + (uVar5 - 3)) = *(undefined1 *)((long)key->data + (uVar7 - 6));
    *(byte *)((long)key->data + (uVar7 - 6)) = bVar4;
    uVar5 = uVar1;
  } while (uVar1 < 0x100);
  return;
}

